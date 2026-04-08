package com.google.common.cache;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.google.common.cache.d */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4161d implements RemovalListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Executor f42578a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ RemovalListener f42579b;

    public /* synthetic */ C4161d(RemovalListener removalListener, Executor executor) {
        this.f42578a = executor;
        this.f42579b = removalListener;
    }

    @Override // com.google.common.cache.RemovalListener
    public final void onRemoval(RemovalNotification removalNotification) {
        RemovalListeners.m14777b(this.f42578a, this.f42579b, removalNotification);
    }
}
