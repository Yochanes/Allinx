package com.google.android.gms.measurement.internal;

import android.content.Intent;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class zzmw implements Runnable {
    private /* synthetic */ zzmu zza;
    private /* synthetic */ int zzb;
    private /* synthetic */ zzgi zzc;
    private /* synthetic */ Intent zzd;

    public /* synthetic */ zzmw(zzmu zzmuVar, int i, zzgi zzgiVar, Intent intent) {
        this.zza = zzmuVar;
        this.zzb = i;
        this.zzc = zzgiVar;
        this.zzd = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zza(this.zzb, this.zzc, this.zzd);
    }
}
