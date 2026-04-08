package com.geetest.captcha;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import com.zx.sdk.api.PermissionCallback;
import com.zx.sdk.api.ZXManager;
import io.intercom.android.sdk.metrics.ops.OpsMetricTracker;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.geetest.captcha.k0 */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bJ\b\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, m18302d2 = {"Lcom/geetest/captcha/utils/ZxIdUtils;", "", "()V", "TAG", "", "get", "", "context", "Landroid/content/Context;", "getZxID", "isZxIDAvailable", "", OpsMetricTracker.START, "captcha_release"}, m18303k = 1, m18304mv = {1, 4, 1})
public final class C3594k0 {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C3594k0 f42239a = new C3594k0();

    /* JADX INFO: renamed from: com.geetest.captcha.k0$a */
    /* JADX INFO: compiled from: Proguard */
    public static final class a implements PermissionCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Context f42240a;

        public a(Context context) {
            this.f42240a = context;
        }

        public void onAuthorized() {
            C3588h0.f42225d.m14328a("ZxIdUtils", "ZxID checkPermission: onAuthorized");
            ZXManager.getZXID(new C3592j0(this.f42240a));
        }

        public void onUnauthorized() {
            C3588h0.f42225d.m14328a("ZxIdUtils", "ZxID checkPermission: onUnauthorized");
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final String m14351a(@NotNull Context context) {
        Intrinsics.m18599g(context, "context");
        try {
            Class.forName("com.zx.sdk.api.ZXManager");
        } catch (Exception unused) {
        }
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences("gt_zid_sp", 0);
            String string = sharedPreferences.getString("gt_zid", null);
            long j = sharedPreferences.getLong("gt_zid_et", 0L);
            if (string == null || !(!StringsKt.m20448x(string)) || j <= 0) {
                m14352b(context);
                return "unknown";
            }
            if (j - System.currentTimeMillis() >= 86400000) {
                return string;
            }
            m14352b(context);
            return string;
        } catch (Exception e) {
            e.printStackTrace();
            return "unknown";
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m14352b(Context context) {
        ZXManager.init(context);
        ZXManager.setDebug(false);
        ZXManager.setEnable(true);
        ZXManager.allowPermissionDialog(false);
        if (context == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.app.Activity");
        }
        ZXManager.checkPermission((Activity) context, new a(context));
    }
}
