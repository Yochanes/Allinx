package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
final class zzb implements Runnable {
    private final /* synthetic */ String zza;
    private final /* synthetic */ long zzb;
    private final /* synthetic */ zza zzc;

    public zzb(zza zzaVar, String str, long j) {
        this.zza = str;
        this.zzb = j;
        this.zzc = zzaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zza.zzb(this.zzc, this.zza, this.zzb);
    }
}
