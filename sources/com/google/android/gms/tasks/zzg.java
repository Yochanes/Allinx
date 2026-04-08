package com.google.android.gms.tasks;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
final class zzg implements Runnable {
    final /* synthetic */ zzh zza;

    public zzg(zzh zzhVar) {
        this.zza = zzhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (zzh.zzb(this.zza)) {
            try {
                zzh zzhVar = this.zza;
                if (zzh.zza(zzhVar) != null) {
                    zzh.zza(zzhVar).onCanceled();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
