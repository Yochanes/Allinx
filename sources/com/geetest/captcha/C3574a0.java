package com.geetest.captcha;

import android.content.Context;
import com.geetest.gtc4.GeeGuard;
import com.geetest.gtc4.GeeGuardConfiguration;
import java.lang.reflect.Method;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.geetest.captcha.a0 */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final class C3574a0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public static Map<String, ? extends JSONObject> f42185a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final C3574a0 f42186b = new C3574a0();

    /* JADX INFO: renamed from: a */
    public final String m14317a(Context context, String str) {
        Class cls = Boolean.TYPE;
        try {
            C3588h0.f42225d.m14329b("isGtc4Available");
            Object objNewInstance = GeeGuardConfiguration.Builder.class.newInstance();
            Method method = GeeGuardConfiguration.Builder.class.getMethod("setAppId", String.class);
            if (method != null) {
                method.invoke(objNewInstance, "54847f3301740c85982a1d3d566bd24e");
            }
            Method method2 = GeeGuardConfiguration.Builder.class.getMethod("setExtraInfo", HashMap.class);
            if (method2 != null) {
                method2.invoke(objNewInstance, f42185a);
            }
            Method method3 = GeeGuardConfiguration.Builder.class.getMethod("setAlInfo", cls);
            if (method3 != null) {
                method3.invoke(objNewInstance, Boolean.FALSE);
            }
            Method method4 = GeeGuardConfiguration.Builder.class.getMethod("setDevInfo", cls);
            if (method4 != null) {
                method4.invoke(objNewInstance, Boolean.TRUE);
            }
            Method method5 = GeeGuardConfiguration.Builder.class.getMethod("setLevel", Integer.TYPE);
            if (method5 != null) {
                method5.invoke(objNewInstance, 1);
            }
            Method method6 = GeeGuardConfiguration.Builder.class.getMethod("addSignature", String.class);
            if (method6 != null) {
                method6.invoke(objNewInstance, str);
            }
            Method method7 = GeeGuardConfiguration.Builder.class.getMethod("build", new Class[0]);
            Object objInvoke = method7 != null ? method7.invoke(objNewInstance, new Object[0]) : null;
            Method method8 = GeeGuard.class.getMethod("getData", Context.class, GeeGuardConfiguration.class);
            Object objInvoke2 = method8 != null ? method8.invoke(null, context, objInvoke) : null;
            if (objInvoke2 != null) {
                return (String) objInvoke2;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        } catch (Exception e) {
            C3588h0.f42225d.m14329b("gtc4 date:" + e);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    @Nullable
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String m14318b(@Nullable Context context, @NotNull String url) {
        String str;
        Intrinsics.m18599g(url, "url");
        if (context != null) {
            try {
                StringBuilder sb = new StringBuilder();
                C3584f0 c3584f0M14320a = C3584f0.f42212c.m14320a(url);
                if (c3584f0M14320a != null) {
                    String baseUrl = c3584f0M14320a.f42213a;
                    Map<String, String> map = c3584f0M14320a.f42214b;
                    Intrinsics.m18599g(baseUrl, "baseUrl");
                    str = map != null ? map.get("data") : null;
                }
                JSONObject jSONObject = new JSONObject(URLDecoder.decode(str, "utf-8"));
                String string = jSONObject.getString("challenge");
                sb.append(jSONObject.getString("captchaId"));
                sb.append(string);
                sb.append(context.getPackageName());
                sb.append("1.8.3.1");
                C3588h0.f42225d.m14327a("Sign content: " + ((Object) sb));
                return m14317a(context, sb.toString());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
