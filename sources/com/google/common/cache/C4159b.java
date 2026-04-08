package com.google.common.cache;

import com.google.common.base.Function;
import com.google.common.cache.LocalCache;

/* JADX INFO: renamed from: com.google.common.cache.b */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4159b implements Function {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ LocalCache.LoadingValueReference f42572a;

    public /* synthetic */ C4159b(LocalCache.LoadingValueReference loadingValueReference) {
        this.f42572a = loadingValueReference;
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        return LocalCache.LoadingValueReference.m14773a(this.f42572a, obj);
    }
}
