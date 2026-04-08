package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
final class zzna implements Runnable {
    private final /* synthetic */ long zza;
    private final /* synthetic */ zznb zzb;

    public zzna(zznb zznbVar, long j) {
        this.zza = j;
        this.zzb = zznbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zznb.zzb(this.zzb, this.zza);
    }
}
