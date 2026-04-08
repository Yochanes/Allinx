package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.google.firebase.messaging.b */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class CallableC4739b implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Context f42831a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Intent f42832b;

    public /* synthetic */ CallableC4739b(Context context, Intent intent) {
        this.f42831a = context;
        this.f42832b = intent;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return FcmBroadcastProcessor.m15226b(this.f42831a, this.f42832b);
    }
}
