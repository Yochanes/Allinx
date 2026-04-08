package com.google.android.gms.common;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class zze implements Callable {
    public final /* synthetic */ boolean zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ zzj zzc;

    public /* synthetic */ zze(boolean z2, String str, zzj zzjVar) {
        this.zza = z2;
        this.zzb = str;
        this.zzc = zzjVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return zzn.zzd(this.zza, this.zzb, this.zzc);
    }
}
