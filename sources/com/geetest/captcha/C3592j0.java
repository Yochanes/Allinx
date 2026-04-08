package com.geetest.captcha;

import android.content.Context;
import android.content.SharedPreferences;
import com.zx.sdk.api.ZXID;
import com.zx.sdk.api.ZXIDListener;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.geetest.captcha.j0 */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final class C3592j0 implements ZXIDListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Context f42237a;

    public C3592j0(Context context) {
        this.f42237a = context;
    }

    public void onFailed(int i, @NotNull String msg) {
        Intrinsics.m18599g(msg, "msg");
        C3588h0.f42225d.m14328a("ZxIdUtils", "ZxID onFailed code: " + i + ", msg: " + msg);
    }

    public void onSuccess(@NotNull ZXID zxid) {
        Intrinsics.m18599g(zxid, "zxid");
        C3588h0.f42225d.m14328a("ZxIdUtils", "ZxID success: " + zxid.getValue());
        try {
            SharedPreferences.Editor editorEdit = this.f42237a.getSharedPreferences("gt_zid_sp", 0).edit();
            editorEdit.putLong("gt_zid_et", zxid.getExpiredTime());
            editorEdit.putString("gt_zid", zxid.getValue());
            editorEdit.apply();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
