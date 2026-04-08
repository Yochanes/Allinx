package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.zzjc;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public enum zzjd {
    STORAGE(zzjc.zza.AD_STORAGE, zzjc.zza.ANALYTICS_STORAGE),
    DMA(zzjc.zza.AD_USER_DATA);

    private final zzjc.zza[] zzd;

    zzjd(zzjc.zza... zzaVarArr) {
        this.zzd = zzaVarArr;
    }

    public static /* bridge */ /* synthetic */ zzjc.zza[] zza(zzjd zzjdVar) {
        return zzjdVar.zzd;
    }

    public final zzjc.zza[] zza() {
        return this.zzd;
    }
}
