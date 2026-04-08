# Глубокий аудит уязвимостей APK (реальные атаки + критерии)

**Дата:** 2026-04-08  
**Метод:** статический white-box анализ `resources/AndroidManifest.xml`, `resources/res/xml/*`, `sources/**` (декомпилированный код).  
**Важно:** ниже я разделил **подтвержденные риски**, **реалистичные атаки**, и **гипотезы, требующие динамики**.

---

## 1) Модель угроз (что реально можно атаковать)

Для данного кода реалистичны 4 класса атак:
1. **Локальная компрометация данных** (backup/ADB/форензика устройства).
2. **Сетевые атаки/MITM** (ослабленная транспортная политика).
3. **Компонентные атаки Android IPC** (экспортированные activity/receiver).
4. **Утечки через логи** (PII/токены/данные push/webview).

---

## 2) Подтвержденные уязвимости (с доказуемой эксплуатацией)

## V-01 (High): Разрешен cleartext-трафик
- **Факт:** `android:usesCleartextTraffic="true"`.
- **Доказательство:** manifest.
- **Почему это уязвимость:** даже если текущие URL — HTTPS, эта политика разрешает HTTP-трафик и повышает риск downgrade/ошибочных HTTP-эндпоинтов в будущем (в т.ч. через сторонние SDK).
- **Реальная атака:** злоумышленник в публичной сети перехватывает/модифицирует незашифрованный HTTP-запрос (если такой вызов появится/активируется в runtime).
- **CWE / OWASP:** CWE-319, MASVS-NETWORK.
- **Критерии подтверждения уязвимости:**
  1. `usesCleartextTraffic=true` в release.
  2. Отсутствует `networkSecurityConfig` deny-by-default.

## V-02 (High): Backup включен глобально + правила backup не ограничены
- **Факты:**
  - `android:allowBackup="true"`.
  - `fullBackupContent="@xml/backup_rules"`, а `backup_rules.xml` пустой (`<full-backup-content/>`).
  - `data_extraction_rules.xml` разрешает cloud backup (`<cloud-backup/>`).
- **Почему это уязвимость:** данные приложения могут попадать в резервные копии без исключения секретов.
- **Реальная атака:** при доступе к устройству/бэкапу злоумышленник извлекает app-data (в т.ч. сессионные артефакты), что облегчает account takeover.
- **CWE / OWASP:** CWE-312, MASVS-STORAGE.
- **Критерии подтверждения:**
  1. Backup включен.
  2. Нет explicit exclude для чувствительных данных.

## V-03 (High): Локальное хранение сессионных данных в SharedPref-подобном хранилище
- **Факт:** хранятся `token` и `loginData` в `SharedPref`.
- **Почему это уязвимость:** при backup/рут-доступе/форензике токен и профиль легко извлекаются; следствие — угон сессии.
- **Реальная атака:** извлечение локального стора + replay токена к API.
- **CWE / OWASP:** CWE-922/CWE-312, MASVS-STORAGE.
- **Критерии подтверждения:**
  1. Чувствительные поля сохраняются локально.
  2. Нет доказательств шифрования через Keystore/EncryptedSharedPreferences в видимом коде.

## V-04 (Medium/High): Debug-режим push SDK включен в runtime
- **Факт:** `MTCorePrivatesApi.configDebugMode(this, true)`.
- **Реальная атака:** облегченная разведка приложения через расширенные debug-логи и технические артефакты SDK (особенно на userdebug/rooted девайсах, в QA/proxy окружениях).
- **CWE:** CWE-489.
- **Критерии:** debug-режим активируется в production code path.

## V-05 (Medium): Утечки через логи (Push/WebView)
- **Факты:**
  - Логируется registration id и содержимое push-уведомлений (`notificationMessage.getContent()`).
  - Логируются WebView console messages (`consoleMessage.message()`).
- **Реальная атака:** приложения с доступом к логам на компрометированных устройствах/внутренние сборщики логов получают PII/контент/диагностические данные.
- **CWE:** CWE-532.
- **Критерии:** наличие несанкционированного вывода пользовательских/служебных данных в логи.

## V-06 (Medium): Экспортированный BroadcastReceiver увеличивает IPC attack surface
- **Факт:** `com.chiclaim.android.downloader.SystemDownloadReceiver` экспортирован.
- **Реальная атака:** спуфинг broadcast для провоцирования лишних действий receiver (DoS/навязанные сценарии), хотя риск частично снижен проверкой `download_id` + `DownloadManager`.
- **CWE:** CWE-926.
- **Критерии:** exported=true без permission gate.

## V-07 (Medium): Слабый контроль канала обновления (возможна supply-chain подмена при компрометации backend)
- **Факты:** приложение запрашивает установку пакетов, скачивает APK и инициирует установку через intent/file provider; в видимом коде нет проверки подписи APK перед install-flow.
- **Реальная атака:** при компрометации backend/канала дистрибуции пользователь получает вредоносный APK для sideload.
- **Важно:** это не «remote unauthenticated exploit» само по себе — нужен контроль над update source, но это реальный риск цепочки поставки.
- **CWE:** CWE-494 (Download of Code Without Integrity Check).
- **Критерии:** отсутствие pin/signature verification в app-side update flow.

## V-08 (Medium): Слишком широкие FileProvider paths (`path="."` + `external-path`)
- **Факт:** в provider paths разрешены широкие корни (`files/cache/external/...` с `path="."`).
- **Риск:** повышается blast radius при ошибочной выдаче URI-грантов внешним приложениям.
- **Реальная атака:** при уязвимости бизнес-логики, выдающей чрезмерные grants, злоумышленник получает доступ к более широкому набору файлов, чем нужно.
- **CWE:** CWE-732 (Incorrect Permission Assignment for Critical Resource).

---

## 3) Реальные атакующие сценарии (как именно атакуют)

## A-01: Session takeover через backup/локальное извлечение
1. Получение доступа к данным устройства/backup-артефактам.
2. Извлечение app storage (в т.ч. токена/логин-данных).
3. Использование токена против API.
**Импакт:** account takeover, утечка финансовых данных.

## A-02: Data disclosure через логи
1. Сбор логов (rooted/enterprise logging/вредоносный агент на устройстве).
2. Извлечение push content / registration id / webview console.
3. Использование данных для фишинга, корреляции пользователя, lateral movement.
**Импакт:** утечка PII и операционных данных.

## A-03: Broadcast abuse на экспортированном receiver
1. Отправка crafted broadcast на `SystemDownloadReceiver`.
2. Триггер workflow обработки download completion.
3. Спам/DoS или побочные действия UX-потока обновления.
**Импакт:** нарушение доступности/нежелательные действия.

## A-04: Supply-chain update attack (при компрометации update source)
1. Компрометация backend/CDN/дистрибуции обновления.
2. Выдача вредоносного APK вместо легитимного.
3. Приложение инициирует установку без app-side криптопроверки подписи payload.
**Импакт:** полная компрометация клиента.

---

## 4) Баги и hardening gaps (не всегда CVE-класс, но опасно)

- `e.printStackTrace()` в DNS-слое → информационные утечки в логах.
- `IllegalArgumentException` в `onReceive` при null-intent/context → потенциальный crash path.
- Жестко зашитые идентификаторы SDK (Intercom/EngageLab) → упрощают рекогносцировку инфраструктуры.

---

## 5) Endpoint inventory (максимум, что можно достоверно извлечь из кода)

## 5.1 Base / WS
- `https://user.allinpro.com/`
- `https://api.allinpro.com/`
- `wss://ws.allinpro.com/ws`
- `https://api.allinpro.com/futures/`
- `wss://api.allinpro.com/futures/wsf`
- `https://api.allinpro.com/futures1k/`
- `wss://api.allinpro.com/futures1k/wsf`
- `https://aggapi.allinpro.com/`
- `wss://aggapi.allinpro.com/ws/kline`
- `https://api.allinpro.com/gateway/`

## 5.2 REST (подтвержденные через Retrofit-аннотации)
> Относительно guess-host (`https://api.allinpro.com/gateway/`)

- `GET clairvoy/topics/{topicId}`
- `GET clairvoy/categories`
- `GET clairvoy/topics` (`status`, `category_id`, `page_num`, `page_size`)
- `GET clairvoy/topics/hot`
- `GET clairvoy/account/topics/{topicId}/votes` (`page_num`, `page_size`)
- `GET clairvoy/account/topics` (`status`, `page_num`, `page_size`)
- `POST clairvoy/account/topics/vote` (JSON body)
- `POST translation/translate` (JSON body)
- `GET clairvoy/account/balance`
- `GET clairvoy/recently-votes`
- `GET clairvoy/account/transactions` (`page_num`, `page_size`)
- `GET clairvoy/account/topics/{topicId}/transactions`

---

## 6) Приоритизация исправлений (security acceptance criteria)

## P0 (до релиза)
1. `usesCleartextTraffic=false` + `networkSecurityConfig` deny-by-default.
2. Отключить backup для release **или** явно исключить секреты/PII из backup/data-extraction.
3. Перевести token/loginData в защищенное хранилище (EncryptedSharedPreferences + Keystore).
4. Добавить app-side проверку целостности/подписи update payload.

## P1
1. Отключить debug mode SDK в release (`BuildConfig.DEBUG` guard).
2. Убрать чувствительное логирование (push/webview/stacktrace).
3. Ужесточить exported-компоненты (permission gates / non-exported где возможно).
4. Сузить FileProvider paths до минимально необходимого набора директорий.

## P2
1. Ввести CI security gates: lint manifest policy, semgrep/mobsf rules.
2. Провести dynamic pentest: MITM, component fuzzing (`am broadcast/start`), storage extraction tests.

---

## 7) Что НЕ могу честно подтвердить только статикой

- Фактическую эксплуатацию MITM без runtime сетевого трафика.
- Реальную возможность прочитать логи на production non-root устройстве (зависит от среды/агентов).
- Полный список API вне `GuessService` (часть сервисов могла быть обфусцирована/сгенерирована).

---

## 8) Краткий итог

По коду подтверждаются **несколько реально опасных уязвимостей** (transport policy, backup+storage, update-chain hardening, logging leakage) и **атакуемые поверхности IPC**. Для финтех/биржевого приложения это критично: закрыть P0/P1 до rollout.
