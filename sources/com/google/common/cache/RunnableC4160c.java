package com.google.common.cache;

import com.google.common.cache.LocalCache;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: renamed from: com.google.common.cache.c */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC4160c implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ LocalCache.Segment f42573a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f42574b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f42575c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ LocalCache.LoadingValueReference f42576d;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ListenableFuture f42577f;

    public /* synthetic */ RunnableC4160c(LocalCache.Segment segment, Object obj, int i, LocalCache.LoadingValueReference loadingValueReference, ListenableFuture listenableFuture) {
        this.f42573a = segment;
        this.f42574b = obj;
        this.f42575c = i;
        this.f42576d = loadingValueReference;
        this.f42577f = listenableFuture;
    }

    @Override // java.lang.Runnable
    public final void run() {
        LocalCache.Segment.m14774a(this.f42573a, this.f42574b, this.f42575c, this.f42576d, this.f42577f);
    }
}
