package com.google.android.gms.measurement.internal;

import android.app.job.JobParameters;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class zzmx implements Runnable {
    private /* synthetic */ zzmu zza;
    private /* synthetic */ zzgi zzb;
    private /* synthetic */ JobParameters zzc;

    public /* synthetic */ zzmx(zzmu zzmuVar, zzgi zzgiVar, JobParameters jobParameters) {
        this.zza = zzmuVar;
        this.zzb = zzgiVar;
        this.zzc = jobParameters;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zza(this.zzb, this.zzc);
    }
}
