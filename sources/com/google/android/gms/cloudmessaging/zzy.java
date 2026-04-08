package com.google.android.gms.cloudmessaging;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class zzy implements Executor {
    public static final /* synthetic */ zzy zza = new zzy();

    private /* synthetic */ zzy() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
