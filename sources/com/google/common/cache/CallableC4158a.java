package com.google.common.cache;

import com.google.common.cache.CacheLoader;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.google.common.cache.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class CallableC4158a implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ CacheLoader f42569a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f42570b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f42571c;

    public /* synthetic */ CallableC4158a(CacheLoader cacheLoader, Object obj, Object obj2) {
        this.f42569a = cacheLoader;
        this.f42570b = obj;
        this.f42571c = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return CacheLoader.C41311.m14772a(this.f42569a, this.f42570b, this.f42571c);
    }
}
