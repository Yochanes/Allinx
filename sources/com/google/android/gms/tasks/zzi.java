package com.google.android.gms.tasks;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
final class zzi implements Runnable {
    final /* synthetic */ Task zza;
    final /* synthetic */ zzj zzb;

    public zzi(zzj zzjVar, Task task) {
        this.zzb = zzjVar;
        this.zza = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (zzj.zzb(this.zzb)) {
            try {
                zzj zzjVar = this.zzb;
                if (zzj.zza(zzjVar) != null) {
                    zzj.zza(zzjVar).onComplete(this.zza);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
