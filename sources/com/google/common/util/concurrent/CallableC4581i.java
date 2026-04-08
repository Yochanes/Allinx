package com.google.common.util.concurrent;

import com.google.common.base.Supplier;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.google.common.util.concurrent.i */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class CallableC4581i implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Supplier f42721a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Callable f42722b;

    public /* synthetic */ CallableC4581i(Supplier supplier, Callable callable) {
        this.f42721a = supplier;
        this.f42722b = callable;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return Callables.m15081c(this.f42721a, this.f42722b);
    }
}
