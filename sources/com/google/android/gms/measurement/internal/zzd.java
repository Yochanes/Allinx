package com.google.android.gms.measurement.internal;

import android.text.TextUtils;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
final class zzd {
    private final zzjb zza;

    public zzd(zzjb zzjbVar) {
        this.zza = zzjbVar;
    }

    public static zzd zza(String str) {
        return new zzd((TextUtils.isEmpty(str) || str.length() > 1) ? zzjb.UNINITIALIZED : zzjc.zza(str.charAt(0)));
    }

    public final String zzb() {
        return String.valueOf(zzjc.zza(this.zza));
    }

    public final zzjb zza() {
        return this.zza;
    }
}
