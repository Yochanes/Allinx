package com.google.firebase.components;

import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;

/* JADX INFO: renamed from: com.google.firebase.components.h */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4614h implements Deferred.DeferredHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Deferred.DeferredHandler f42754a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Deferred.DeferredHandler f42755b;

    public /* synthetic */ C4614h(Deferred.DeferredHandler deferredHandler, Deferred.DeferredHandler deferredHandler2) {
        this.f42754a = deferredHandler;
        this.f42755b = deferredHandler2;
    }

    @Override // com.google.firebase.inject.Deferred.DeferredHandler
    public final void handle(Provider provider) {
        OptionalProvider.m15120b(this.f42754a, this.f42755b, provider);
    }
}
