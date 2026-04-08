package com.geetest.captcha;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.geetest.captcha.e0 */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final class C3582e0 {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static String f42202a = "加载遇到一点麻烦";

    /* JADX INFO: renamed from: b */
    @NotNull
    public static String f42203b = "证书错误";

    /* JADX INFO: renamed from: c */
    @NotNull
    public static String f42204c = "参数不合法";

    /* JADX INFO: renamed from: d */
    @NotNull
    public static String f42205d = "验证会话已取消";

    /* JADX INFO: renamed from: e */
    @NotNull
    public static String f42206e = "不支持的 WebView 组件";

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final C3582e0 f42207f = new C3582e0();

    /* JADX INFO: renamed from: a */
    public final void m14319a(@NotNull Context context) {
        Intrinsics.m18599g(context, "context");
        Context applicationContext = context.getApplicationContext();
        C3586g0 c3586g0 = C3586g0.f42219a;
        String string = applicationContext.getString(c3586g0.m14323a(context, "gt4_web_callback_error"));
        Intrinsics.m18598f(string, "context.applicationConte…gt4_web_callback_error\"))");
        f42202a = string;
        Intrinsics.m18598f(context.getApplicationContext().getString(c3586g0.m14323a(context, "gt4_web_view_load_error")), "context.applicationConte…t4_web_view_load_error\"))");
        String string2 = context.getApplicationContext().getString(c3586g0.m14323a(context, "gt4_web_view_ssl_error"));
        Intrinsics.m18598f(string2, "context.applicationConte…gt4_web_view_ssl_error\"))");
        f42203b = string2;
        String string3 = context.getApplicationContext().getString(c3586g0.m14323a(context, "gt4_parameter_config_error"));
        Intrinsics.m18598f(string3, "context.applicationConte…parameter_config_error\"))");
        f42204c = string3;
        String string4 = context.getApplicationContext().getString(c3586g0.m14323a(context, "gt4_user_cancel"));
        Intrinsics.m18598f(string4, "context.applicationConte…text, \"gt4_user_cancel\"))");
        f42205d = string4;
        String string5 = context.getApplicationContext().getString(c3586g0.m14323a(context, "gt4_device_not_supported"));
        Intrinsics.m18598f(string5, "context.applicationConte…4_device_not_supported\"))");
        f42206e = string5;
    }
}
