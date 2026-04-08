package com.google.android.gms.internal.measurement;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class zzd implements Callable {
    private /* synthetic */ zzb zza;

    public /* synthetic */ zzd(zzb zzbVar) {
        this.zza = zzbVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return new zzk(this.zza.zza);
    }
}
