package com.google.common.util.concurrent;

import com.google.common.util.concurrent.SimpleTimeLimiter;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.google.common.util.concurrent.n */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class CallableC4586n implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Method f42732a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f42733b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object[] f42734c;

    public /* synthetic */ CallableC4586n(Method method, Object obj, Object[] objArr) {
        this.f42732a = method;
        this.f42733b = obj;
        this.f42734c = objArr;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return SimpleTimeLimiter.C45681.m15092a(this.f42732a, this.f42733b, this.f42734c);
    }
}
