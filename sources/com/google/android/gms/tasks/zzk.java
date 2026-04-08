package com.google.android.gms.tasks;

import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
final class zzk implements Runnable {
    final /* synthetic */ Task zza;
    final /* synthetic */ zzl zzb;

    public zzk(zzl zzlVar, Task task) {
        this.zzb = zzlVar;
        this.zza = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (zzl.zzb(this.zzb)) {
            try {
                zzl zzlVar = this.zzb;
                if (zzl.zza(zzlVar) != null) {
                    zzl.zza(zzlVar).onFailure((Exception) Preconditions.checkNotNull(this.zza.getException()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
