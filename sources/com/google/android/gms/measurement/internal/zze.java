package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
final class zze implements Runnable {
    private final /* synthetic */ long zza;
    private final /* synthetic */ zza zzb;

    public zze(zza zzaVar, long j) {
        this.zza = j;
        this.zzb = zzaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zza.zza(this.zzb, this.zza);
    }
}
