# Отчет по безопасности APK (static review)

**Дата анализа:** 2026-04-08  
**Формат:** статический анализ декомпилированных исходников (`sources/`) и манифеста (`resources/AndroidManifest.xml`) без динамического запуска.  
**Ограничение:** это white-box static-only аудит; часть уязвимостей может требовать runtime-подтверждения.

---

## 1) Критические и высокие риски

### V-01: Разрешен cleartext-трафик на уровне приложения
- **Факт:** в `AndroidManifest.xml` включен `android:usesCleartextTraffic="true"`.
- **Где:** `resources/AndroidManifest.xml`.
- **Риск:** при любой ошибке в URL/редиректах/SDK-конфиге появляется возможность передачи данных по HTTP (MITM, перехват токенов/PII в небезопасной сети).
- **Severity:** **High**
- **CWE:** CWE-319 (Cleartext Transmission of Sensitive Information)
- **MASVS:** MASVS-NETWORK
- **Критерии подтверждения:**
  1. Флаг cleartext включен в манифесте.
  2. В приложении есть сетевой стек и чувствительные данные (токены/логин-данные).
  3. Не задана строгая network security config, запрещающая cleartext по доменам.
- **Рекомендации:**
  - Поставить `android:usesCleartextTraffic="false"`.
  - Добавить `networkSecurityConfig` с явным allowlist только HTTPS.
  - В CI добавить линтер-проверку, запрещающую cleartext в release.

### V-02: Включен backup приложения + хранение чувствительных данных в prefs
- **Факт:** `android:allowBackup="true"`, при этом в конфиге присутствует хранение `token`/`loginData` в `SharedPref`.
- **Где:** `resources/AndroidManifest.xml`, `sources/com/exchange/allin/config/AppConfig.java`.
- **Риск:** выгрузка данных через adb backup/облачный backup/компрометированное устройство может привести к утечке токена сессии и профиля пользователя.
- **Severity:** **High**
- **CWE:** CWE-312 (Cleartext Storage of Sensitive Information)
- **MASVS:** MASVS-STORAGE
- **Критерии подтверждения:**
  1. Backup включен в manifest.
  2. Секреты (token/session/loginData) сохраняются локально.
  3. Не используется шифрование через Android Keystore/EncryptedSharedPreferences.
- **Рекомендации:**
  - Для release отключить backup (`allowBackup=false`) либо исключить секреты через backup rules.
  - Токены и чувствительные поля хранить в EncryptedSharedPreferences + ключи в Keystore.
  - Ввести ротацию refresh/access-токенов при подозрении на компрометацию.

### V-03: Debug-режим push SDK включен в `onCreate`
- **Факт:** `MTCorePrivatesApi.configDebugMode(this, true);`.
- **Где:** `sources/com/exchange/allin/App.java`.
- **Риск:** расширенное логирование/диагностика в прод-сборке может раскрывать служебные детали и сетевые параметры, облегчая реверс и эксплуатацию.
- **Severity:** **Medium/High** (в зависимости от фактического вывода SDK)
- **CWE:** CWE-489 (Active Debug Code)
- **MASVS:** MASVS-RESILIENCE / MASVS-PRIVACY
- **Критерии подтверждения:**
  1. Debug явно выставлен в true в production code path.
  2. SDK использует debug-флаги для verbose-телеметрии/логов.
- **Рекомендации:**
  - Ограничить debug только для debug flavor/buildType.
  - Гейт через `BuildConfig.DEBUG`.

---

## 2) Средние риски и потенциальные уязвимости

### V-04: Утечка чувствительных данных через WebView console log
- **Факт:** логируется весь `consoleMessage.message()` из WebView в `Log.d("WebViewLog", ...)`.
- **Где:**
  - `sources/com/exchange/allin/p024ui/page/account/web/WebPageKt$WebPage$1$1$1$3.java`
  - `sources/com/exchange/allin/p024ui/page/nexus/NexusPageKt$NexusPage$1$1$1$3.java`
- **Риск:** если web-контент выводит токены/PII в JS console, эти данные оказываются в device logs.
- **Severity:** **Medium**
- **CWE:** CWE-532 (Insertion of Sensitive Information into Log File)
- **MASVS:** MASVS-PRIVACY
- **Критерии подтверждения:**
  1. В коде присутствует вывод console message в лог.
  2. В WebView загружается удаленный/динамический контент.
- **Рекомендации:**
  - Убрать логирование console в release.
  - Маскировать возможные секреты.

### V-05: Потенциальное раскрытие stacktrace в runtime
- **Факт:** `e.printStackTrace()` при ошибке DNS.
- **Где:** `sources/com/exchange/allin/net/dns/HttpDns.java`.
- **Риск:** в некоторых окружениях stacktrace доступен через системные логи, может помогать в атаке (инфо-disclosure).
- **Severity:** **Low/Medium**
- **CWE:** CWE-209 (Information Exposure Through an Error Message)
- **Рекомендации:**
  - Заменить на централизованный безопасный logger без деталей в release.

### V-06: Экспортированный BroadcastReceiver под системные action
- **Факт:** `com.chiclaim.android.downloader.SystemDownloadReceiver` экспортирован (`android:exported="true"`).
- **Где:** `resources/AndroidManifest.xml`.
- **Риск:** расширение attack surface; возможны попытки спуфинга broadcast (хотя есть проверка download id и DownloadManager URI, что снижает риск до moderate/low).
- **Severity:** **Medium (hardening issue)**
- **CWE:** CWE-926 (Improper Export of Android Components)
- **Критерии подтверждения:**
  1. Компонент exported=true.
  2. Нет permission-gate/валидации отправителя.
- **Рекомендации:**
  - Если возможно, сделать receiver non-exported.
  - Либо ограничить permission и валидировать источник интента/UID.

---

## 3) Наблюдаемые баги (quality/robustness)

### B-01: Неконтролируемый throw в BroadcastReceiver
- **Факт:** в `onReceive` есть `throw new IllegalArgumentException("Failed requirement.")` при `intent == null || context == null`.
- **Где:** `sources/com/chiclaim/android/downloader/SystemDownloadReceiver.java`.
- **Проблема:** потенциальный crash вместо fail-safe behavior.
- **Рекомендации:** заменять throw на graceful return + telemetry.

### B-02: Жестко вшитые ключи/идентификаторы SDK
- **Факт:** Intercom appId/apiKey и Engagelab appkey заданы строковыми литералами.
- **Где:** `sources/com/exchange/allin/App.java`, `resources/AndroidManifest.xml`.
- **Проблема:** не «секреты» в классическом смысле (часто публичные идентификаторы), но облегчают разведку инфраструктуры и abuse.
- **Рекомендации:** перенос в remote config/build config + ограничение по bundle/package signature на стороне провайдера.

---

## 4) Полный перечень обнаруженных endpoint-ов

## 4.1 Base URL / WS URL
1. `https://user.allinpro.com/`
2. `https://api.allinpro.com/`
3. `wss://ws.allinpro.com/ws`
4. `https://api.allinpro.com/futures/`
5. `wss://api.allinpro.com/futures/wsf`
6. `https://api.allinpro.com/futures1k/`
7. `wss://api.allinpro.com/futures1k/wsf`
8. `https://aggapi.allinpro.com/`
9. `wss://aggapi.allinpro.com/ws/kline`
10. `https://api.allinpro.com/gateway/`

## 4.2 REST endpoints (из `GuessService`)
> Путь относительно `guess` host (`https://api.allinpro.com/gateway/`)

- `GET clairvoy/topics/{topicId}`
  - params: `topicId` (path)
- `GET clairvoy/categories`
- `GET clairvoy/topics`
  - params: `status`, `category_id` (nullable), `page_num`, `page_size`
- `GET clairvoy/topics/hot`
- `GET clairvoy/account/topics/{topicId}/votes`
  - params: `topicId`, `page_num`, `page_size`
- `GET clairvoy/account/topics`
  - params: `status`, `page_num`, `page_size`
- `POST clairvoy/account/topics/vote`
  - body: JSON
- `POST translation/translate`
  - body: JSON
- `GET clairvoy/account/balance`
- `GET clairvoy/recently-votes`
- `GET clairvoy/account/transactions`
  - params: `page_num`, `page_size`
- `GET clairvoy/account/topics/{topicId}/transactions`
  - params: `topicId`

---

## 5) Критерии приоритизации и acceptance criteria по фиксам

## P0 (закрыть до релиза)
- Отключен cleartext (`usesCleartextTraffic=false`) и добавлен network security config deny-by-default.
- Секреты/токены вынесены в EncryptedSharedPreferences/Keystore.
- Backup политика исключает токены/PII (или backup выключен полностью).

## P1
- Убрано debug=true из production-пути и логирование console/webview.
- Для экспортированных компонентов добавлена минимизация экспозиции (non-exported / permission).

## P2
- Устранены stacktrace/log info leaks.
- Добавлены security-тесты в CI (manifest lint, semgrep rules, mobSF pipeline).

---

## 6) Что проверить дополнительно (динамика)

1. MITM-тест (Burp/Charles + custom CA): убедиться, что HTTP не используется и TLS корректен.
2. Проверка хранения токена на rooted/non-rooted устройстве, adb backup/auto backup сценарии.
3. Проверка экспортированных компонентов через `adb shell am broadcast`/`am start`.
4. Runtime tracing WebView, чтобы подтвердить отсутствие утечек токенов в console.

---

## 7) Итог

С учетом найденных фактов у приложения есть несколько **реальных high-risk** зон (cleartext policy, storage+backup sensitive data) и ряд **hardening gaps** (debug mode, logging, exported receiver). Для финансового/биржевого приложения рекомендуется закрыть P0/P1 до production rollout.
