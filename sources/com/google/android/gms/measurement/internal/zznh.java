package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
final class zznh {

    @VisibleForTesting
    protected long zza;
    final /* synthetic */ zznb zzb;

    @VisibleForTesting
    private long zzc;
    private final zzax zzd;

    public zznh(zznb zznbVar) {
        this.zzb = zznbVar;
        this.zzd = new zzng(this, zznbVar.zzu);
        long jElapsedRealtime = zznbVar.zzb().elapsedRealtime();
        this.zzc = jElapsedRealtime;
        this.zza = jElapsedRealtime;
    }

    @VisibleForTesting
    @WorkerThread
    public final long zza(long j) {
        long j2 = j - this.zza;
        this.zza = j;
        return j2;
    }

    @WorkerThread
    public final void zzb(long j) {
        this.zzd.zza();
    }

    @WorkerThread
    public final void zzc(long j) {
        this.zzb.zzt();
        this.zzd.zza();
        this.zzc = j;
        this.zza = j;
    }

    public static /* synthetic */ void zza(zznh zznhVar) {
        zznhVar.zzb.zzt();
        zznhVar.zza(false, false, zznhVar.zzb.zzb().elapsedRealtime());
        zznhVar.zzb.zzc().zza(zznhVar.zzb.zzb().elapsedRealtime());
    }

    public final void zza() {
        this.zzd.zza();
        if (this.zzb.zze().zza(zzbj.zzdf)) {
            this.zzc = this.zzb.zzb().elapsedRealtime();
        } else {
            this.zzc = 0L;
        }
        this.zza = this.zzc;
    }

    @WorkerThread
    public final boolean zza(boolean z2, boolean z3, long j) {
        this.zzb.zzt();
        this.zzb.zzu();
        if (this.zzb.zzu.zzac()) {
            this.zzb.zzk().zzk.zza(this.zzb.zzb().currentTimeMillis());
        }
        long jZza = j - this.zzc;
        if (!z2 && jZza < 1000) {
            this.zzb.zzj().zzp().zza("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(jZza));
            return false;
        }
        if (!z3) {
            jZza = zza(j);
        }
        this.zzb.zzj().zzp().zza("Recording user engagement, ms", Long.valueOf(jZza));
        Bundle bundle = new Bundle();
        bundle.putLong("_et", jZza);
        zzop.zza(this.zzb.zzn().zza(!this.zzb.zze().zzy()), bundle, true);
        if (!z3) {
            this.zzb.zzm().zzc("auto", "_e", bundle);
        }
        this.zzc = j;
        this.zzd.zza();
        this.zzd.zza(zzbj.zzbc.zza(null).longValue());
        return true;
    }
}
