package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
final class zzli implements Runnable {
    private final /* synthetic */ zzlh zza;
    private final /* synthetic */ zzlh zzb;
    private final /* synthetic */ long zzc;
    private final /* synthetic */ boolean zzd;
    private final /* synthetic */ zzlg zze;

    public zzli(zzlg zzlgVar, zzlh zzlhVar, zzlh zzlhVar2, long j, boolean z2) {
        this.zza = zzlhVar;
        this.zzb = zzlhVar2;
        this.zzc = j;
        this.zzd = z2;
        this.zze = zzlgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzlg.zza(this.zze, this.zza, this.zzb, this.zzc, this.zzd, null);
    }
}
