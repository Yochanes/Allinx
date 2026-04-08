package com.google.android.gms.tasks;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
final class zzc implements Runnable {
    final /* synthetic */ Task zza;
    final /* synthetic */ zzd zzb;

    public zzc(zzd zzdVar, Task task) {
        this.zzb = zzdVar;
        this.zza = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zza.isCanceled()) {
            zzd.zzb(this.zzb).zzc();
            return;
        }
        try {
            zzd.zzb(this.zzb).zzb(zzd.zza(this.zzb).then(this.zza));
        } catch (RuntimeExecutionException e) {
            if (e.getCause() instanceof Exception) {
                zzd.zzb(this.zzb).zza((Exception) e.getCause());
            } else {
                zzd.zzb(this.zzb).zza(e);
            }
        } catch (Exception e2) {
            zzd.zzb(this.zzb).zza(e2);
        }
    }
}
