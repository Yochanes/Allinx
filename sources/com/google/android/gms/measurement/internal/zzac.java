package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Looper;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final class zzac {
    public zzac(Context context) {
    }

    public static boolean zza() {
        return Looper.myLooper() == Looper.getMainLooper();
    }
}
