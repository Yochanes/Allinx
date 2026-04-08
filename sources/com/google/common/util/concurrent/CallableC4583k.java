package com.google.common.util.concurrent;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.google.common.util.concurrent.k */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class CallableC4583k implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f42725a;

    public /* synthetic */ CallableC4583k(Object obj) {
        this.f42725a = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return Callables.m15082d(this.f42725a);
    }
}
