package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
final class zzlj implements Runnable {
    private final /* synthetic */ Bundle zza;
    private final /* synthetic */ zzlh zzb;
    private final /* synthetic */ zzlh zzc;
    private final /* synthetic */ long zzd;
    private final /* synthetic */ zzlg zze;

    public zzlj(zzlg zzlgVar, Bundle bundle, zzlh zzlhVar, zzlh zzlhVar2, long j) {
        this.zza = bundle;
        this.zzb = zzlhVar;
        this.zzc = zzlhVar2;
        this.zzd = j;
        this.zze = zzlgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzlg.zza(this.zze, this.zza, this.zzb, this.zzc, this.zzd);
    }
}
