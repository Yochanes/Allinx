package com.google.android.gms.common.api.internal;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class zabk implements Executor {
    public final /* synthetic */ Handler zaa;

    public /* synthetic */ zabk(Handler handler) {
        this.zaa = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.zaa.post(runnable);
    }
}
