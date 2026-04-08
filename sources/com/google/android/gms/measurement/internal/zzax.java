package com.google.android.gms.measurement.internal;

import android.os.Handler;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
abstract class zzax {
    private static volatile Handler zza;
    private final zzja zzb;
    private final Runnable zzc;
    private volatile long zzd;

    public zzax(zzja zzjaVar) {
        Preconditions.checkNotNull(zzjaVar);
        this.zzb = zzjaVar;
        this.zzc = new zzaw(this, zzjaVar);
    }

    public static /* bridge */ /* synthetic */ void zza(zzax zzaxVar, long j) {
        zzaxVar.zzd = 0L;
    }

    private final Handler zzd() {
        Handler handler;
        if (zza != null) {
            return zza;
        }
        synchronized (zzax.class) {
            try {
                if (zza == null) {
                    zza = new com.google.android.gms.internal.measurement.zzdh(this.zzb.zza().getMainLooper());
                }
                handler = zza;
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public abstract void zzb();

    public final boolean zzc() {
        return this.zzd != 0;
    }

    public final void zza() {
        this.zzd = 0L;
        zzd().removeCallbacks(this.zzc);
    }

    public final void zza(long j) {
        zza();
        if (j >= 0) {
            this.zzd = this.zzb.zzb().currentTimeMillis();
            if (zzd().postDelayed(this.zzc, j)) {
                return;
            }
            this.zzb.zzj().zzg().zza("Failed to schedule delayed post. time", Long.valueOf(j));
        }
    }
}
