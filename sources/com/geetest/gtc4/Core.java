package com.geetest.gtc4;

import android.content.Context;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final class Core {
    static {
        System.loadLibrary("gtc4core");
    }

    public static native String getData(Context context);

    public static native String getData(Context context, GeeGuardConfiguration geeGuardConfiguration);
}
