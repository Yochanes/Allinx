package com.geetest.captcha;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p001A.AbstractC0000a;

/* JADX INFO: renamed from: com.geetest.captcha.g0 */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final class C3586g0 {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C3586g0 f42219a = new C3586g0();

    /* JADX INFO: renamed from: a */
    public final int m14323a(@NotNull Context context, @NotNull String name) {
        Intrinsics.m18599g(context, "context");
        Intrinsics.m18599g(name, "name");
        return m14324a(context, name, "string");
    }

    /* JADX INFO: renamed from: b */
    public final int m14325b(@NotNull Context context, @NotNull String name) {
        Intrinsics.m18599g(context, "context");
        Intrinsics.m18599g(name, "name");
        return m14324a(context, name, "style");
    }

    /* JADX INFO: renamed from: a */
    public final int m14324a(Context context, String str, String str2) {
        Context applicationContext = context.getApplicationContext();
        Intrinsics.m18598f(applicationContext, "context.applicationContext");
        int identifier = applicationContext.getResources().getIdentifier(str, str2, context.getPackageName());
        if (identifier == 0) {
            C3588h0.f42225d.m14331c(AbstractC0000a.m15l("ID.getIdentifier resource: ", str, ", type: ", str2, ", undefined"));
        }
        return identifier;
    }
}
