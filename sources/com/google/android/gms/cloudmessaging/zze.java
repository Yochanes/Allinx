package com.google.android.gms.cloudmessaging;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class zze implements Executor {
    public static final /* synthetic */ zze zza = new zze();

    private /* synthetic */ zze() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
