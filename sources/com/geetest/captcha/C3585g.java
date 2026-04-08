package com.geetest.captcha;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.TextUtils;
import com.engagelab.privates.core.constants.MTCoreConstants;
import com.geetest.captcha.C3591j;
import com.geetest.captcha.C3596l0;
import com.geetest.captcha.C3609w;
import com.geetest.captcha.GTCaptcha4Client;
import com.geetest.captcha.views.GTC4WebView;
import com.google.android.gms.common.internal.ImagesContract;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.geetest.captcha.g */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final class C3585g {

    /* JADX INFO: renamed from: a */
    @Nullable
    public DialogC3587h f42215a;

    /* JADX INFO: renamed from: b */
    public GTC4WebView f42216b;

    /* JADX INFO: renamed from: c */
    public C3596l0 f42217c;

    /* JADX INFO: renamed from: d */
    public GTCaptcha4Client.OnDialogShowListener f42218d;

    public C3585g(@Nullable GTCaptcha4Client.OnDialogShowListener onDialogShowListener) {
        this.f42218d = onDialogShowListener;
    }

    /* JADX INFO: renamed from: a */
    public final void m14321a(@NotNull Context context, @NotNull C3606v dataBean, @NotNull InterfaceC3612z webViewObserver) throws Throwable {
        Throwable th;
        JSONObject jSONObject;
        String str;
        C3611y c3611y;
        JSONObject jSONObject2;
        Intrinsics.m18599g(context, "context");
        Intrinsics.m18599g(dataBean, "dataBean");
        Intrinsics.m18599g(webViewObserver, "webViewObserver");
        C3611y c3611y2 = new C3611y();
        c3611y2.m14384a(webViewObserver);
        C3584f0 c3584f0M14320a = C3584f0.f42212c.m14320a(dataBean.f42278b);
        if (c3584f0M14320a == null) {
            String str2 = EnumC3580d0.PARAM.getType() + "75";
            String str3 = C3582e0.f42204c;
            C3609w.a aVar = C3609w.f42290d;
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("description", "Address configuration error");
            webViewObserver.mo14366a(str2, str3, jSONObject3);
            return;
        }
        String baseUrl = c3584f0M14320a.f42213a;
        Map<String, String> map = c3584f0M14320a.f42214b;
        Intrinsics.m18599g(baseUrl, "baseUrl");
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put("displayArea", EnumC3576b0.CENTER.getValue());
        jSONObject4.put(MTCoreConstants.Protocol.KEY_PROTOCOL, "https://");
        jSONObject4.put("loading", "./gt4-loading.gif");
        Map<String, ? extends Object> map2 = dataBean.f42283g;
        C3588h0.f42225d.m14327a("Config Params: ".concat(String.valueOf(map2)));
        if (map2 == null || map2.isEmpty()) {
            th = null;
            jSONObject = null;
        } else {
            Iterator<Map.Entry<String, ? extends Object>> it = map2.entrySet().iterator();
            JSONObject jSONObject5 = null;
            while (it.hasNext()) {
                Map.Entry<String, ? extends Object> next = it.next();
                String key = next.getKey();
                Object value = next.getValue();
                Iterator<Map.Entry<String, ? extends Object>> it2 = it;
                if ("xid".equals(key)) {
                    HashMap map3 = new HashMap();
                    if (value != null && (value instanceof JSONObject)) {
                        map3.put("xid", value);
                    }
                    C3574a0.f42185a = map3;
                } else if ("_gee_info".equals(key)) {
                    if (value != null && (value instanceof JSONObject)) {
                        JSONObject jSONObject6 = (JSONObject) value;
                        String[] strArr = {"geeid", "packageName", "displayName", "appVer", "build", "clientVersion"};
                        for (int i = 0; i < 6; i++) {
                            String str4 = strArr[i];
                            if (jSONObject6.has(str4)) {
                                jSONObject6.remove(str4);
                            }
                        }
                        jSONObject5 = jSONObject6;
                    }
                    it = it2;
                } else {
                    jSONObject4.put(key, value);
                }
                it = it2;
            }
            th = null;
            jSONObject = jSONObject5;
        }
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                jSONObject4.put(entry.getKey(), entry.getValue());
            }
            map.clear();
        }
        String str5 = dataBean.f42277a;
        if (str5 == null) {
            Intrinsics.m18606n("captchaId");
            throw th;
        }
        jSONObject4.put("captchaId", str5);
        jSONObject4.put("challenge", UUID.randomUUID().toString());
        jSONObject4.put("debug", dataBean.f42279c);
        String str6 = dataBean.f42280d;
        if (str6 == null || StringsKt.m20448x(str6)) {
            Context applicationContext = context.getApplicationContext();
            Intrinsics.m18598f(applicationContext, "context.applicationContext");
            Resources resources = applicationContext.getResources();
            Intrinsics.m18598f(resources, "context.applicationContext.resources");
            Configuration configuration = resources.getConfiguration();
            Intrinsics.m18598f(configuration, "context.applicationContext.resources.configuration");
            Locale locale = configuration.getLocales().get(0);
            Intrinsics.m18598f(locale, "context.applicationConte….configuration.locales[0]");
            StringBuilder sb = new StringBuilder();
            sb.append(locale.getLanguage());
            sb.append('-');
            String country = locale.getCountry();
            str = "description";
            Intrinsics.m18598f(country, "locale.country");
            Locale locale2 = Locale.ROOT;
            Intrinsics.m18598f(locale2, "Locale.ROOT");
            String lowerCase = country.toLowerCase(locale2);
            Intrinsics.m18598f(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            sb.append(lowerCase);
            jSONObject4.put("language", sb.toString());
        } else {
            jSONObject4.put("language", dataBean.f42280d);
            str = "description";
        }
        String[] strArr2 = dataBean.f42281e;
        if (strArr2 != null && strArr2.length != 0) {
            JSONArray jSONArray = new JSONArray();
            String[] strArr3 = dataBean.f42281e;
            Intrinsics.m18596d(strArr3);
            for (String str7 : strArr3) {
                jSONArray.put(str7);
            }
            jSONObject4.put("apiServers", jSONArray);
        }
        String[] strArr4 = dataBean.f42282f;
        if (strArr4 != null && strArr4.length != 0) {
            JSONArray jSONArray2 = new JSONArray();
            String[] strArr5 = dataBean.f42282f;
            Intrinsics.m18596d(strArr5);
            for (String str8 : strArr5) {
                jSONArray2.put(str8);
            }
            jSONObject4.put("staticServers", jSONArray2);
        }
        jSONObject4.put("timeout", dataBean.f42285i);
        jSONObject4.put("clientVersion", "1.8.3.1");
        jSONObject4.put("clientType", "android");
        jSONObject4.put("outside", dataBean.f42284h);
        try {
            jSONObject2 = new JSONObject();
            c3611y = c3611y2;
        } catch (Exception e) {
            e = e;
            c3611y = c3611y2;
        }
        try {
            jSONObject2.put("geeid", new JSONObject(C3591j.a.f42236a.m14350a(context)));
            jSONObject2.put("packageName", context.getPackageName());
            CharSequence charSequenceLoadLabel = context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).loadLabel(context.getPackageManager());
            Intrinsics.m18598f(charSequenceLoadLabel, "context.packageManager.g…l(context.packageManager)");
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            jSONObject2.put("displayName", URLEncoder.encode(charSequenceLoadLabel.toString(), "utf-8"));
            jSONObject2.put("appVer", packageInfo.versionName);
            jSONObject2.put("build", String.valueOf(packageInfo.versionCode));
            jSONObject2.put("clientVersion", "1.8.3.1");
            if (jSONObject != null && jSONObject.length() > 0) {
                Iterator<String> keys = jSONObject.keys();
                Intrinsics.m18598f(keys, "keys");
                while (keys.hasNext()) {
                    String next2 = keys.next();
                    jSONObject2.put(next2, jSONObject.opt(next2));
                }
            }
            jSONObject2.put("zid", C3594k0.f42239a.m14351a(context));
            jSONObject4.put("mi", jSONObject2);
        } catch (Exception e2) {
            e = e2;
            e.printStackTrace();
        }
        try {
            if (!jSONObject4.has("displayMode") || ((jSONObject4.get("displayMode") instanceof Integer) && Intrinsics.m18594b(jSONObject4.get("displayMode"), Integer.valueOf(EnumC3578c0.AUTO.getValue())))) {
                Resources resources2 = context.getResources();
                Intrinsics.m18598f(resources2, "context.resources");
                jSONObject4.put("displayMode", ((resources2.getConfiguration().uiMode & 48) == 32 ? EnumC3578c0.DARK : EnumC3578c0.NORMAL).getValue());
            }
        } catch (Exception e3) {
            e3.printStackTrace();
        }
        C3588h0 c3588h0 = C3588h0.f42225d;
        c3588h0.m14327a("BaseURL: " + dataBean.f42278b + ", Parameter: " + jSONObject4);
        JSONObject jSONObject7 = new JSONObject(jSONObject4.toString());
        if (jSONObject7.has("mi")) {
            jSONObject7.remove("mi");
        }
        c3588h0.m14331c("BaseURL: " + dataBean.f42278b + ", Parameter: " + jSONObject7);
        String strEncode = URLEncoder.encode(jSONObject4.toString(), "utf-8");
        if (map != null) {
            map.put("data", strEncode);
        }
        try {
            C3596l0.a aVar2 = new C3596l0.a();
            String url = new C3584f0(baseUrl, map).toString();
            Intrinsics.m18599g(url, "url");
            aVar2.f42246a = url;
            GTC4WebView gTC4WebView = new GTC4WebView(context);
            aVar2.f42248c = gTC4WebView;
            String str9 = aVar2.f42246a;
            try {
                if (str9 == null) {
                    Intrinsics.m18606n(ImagesContract.URL);
                    throw th;
                }
                C3611y c3611y3 = c3611y;
                gTC4WebView.m14381a(c3611y3, dataBean, str9);
                aVar2.f42247b = c3611y3;
                C3596l0 c3596l0M14355a = new C3596l0(aVar2).m14355a();
                this.f42217c = c3596l0M14355a;
                this.f42216b = c3596l0M14355a.f42244c;
                return;
            } catch (Exception e4) {
                e = e4;
            }
        } catch (Exception e5) {
            e = e5;
        }
        e.printStackTrace();
        if (e.getMessage() != null) {
            String str10 = EnumC3580d0.WEB_VIEW_NEW.getType() + "99";
            String str11 = C3582e0.f42206e;
            C3609w.a aVar3 = C3609w.f42290d;
            JSONObject jSONObject8 = new JSONObject();
            jSONObject8.put(str, "Device not supported");
            jSONObject8.put("exception", e.getMessage());
            webViewObserver.mo14366a(str10, str11, jSONObject8);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m14322b(Context context, C3606v c3606v, InterfaceC3612z interfaceC3612z) {
        DialogC3587h dialogC3587h;
        if (TextUtils.isEmpty(c3606v.f42287k)) {
            dialogC3587h = new DialogC3587h(context);
        } else {
            String str = c3606v.f42287k;
            dialogC3587h = str != null ? new DialogC3587h(context, str) : null;
        }
        this.f42215a = dialogC3587h;
        if (dialogC3587h != null) {
            dialogC3587h.f42221b = this.f42218d;
        }
        if (dialogC3587h != null) {
            dialogC3587h.f42220a = this.f42216b;
        }
        if (dialogC3587h != null) {
            dialogC3587h.setOnKeyListener(new DialogInterfaceOnKeyListenerC3581e(interfaceC3612z));
        }
        DialogC3587h dialogC3587h2 = this.f42215a;
        if (dialogC3587h2 != null) {
            dialogC3587h2.show();
        }
    }
}
