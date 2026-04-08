package com.google.android.gms.tasks;

import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class zzx implements Runnable {
    public final /* synthetic */ TaskCompletionSource zza;

    public /* synthetic */ zzx(TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.trySetException(new TimeoutException());
    }
}
