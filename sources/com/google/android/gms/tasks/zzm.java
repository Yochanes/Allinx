package com.google.android.gms.tasks;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
final class zzm implements Runnable {
    final /* synthetic */ Task zza;
    final /* synthetic */ zzn zzb;

    public zzm(zzn zznVar, Task task) {
        this.zzb = zznVar;
        this.zza = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (zzn.zzb(this.zzb)) {
            try {
                zzn zznVar = this.zzb;
                if (zzn.zza(zznVar) != null) {
                    zzn.zza(zznVar).onSuccess(this.zza.getResult());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
