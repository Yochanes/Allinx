package com.google.firebase.components;

import com.google.firebase.inject.Provider;

/* JADX INFO: renamed from: com.google.firebase.components.d */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4610d implements Provider {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ComponentRuntime f42748a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Component f42749b;

    public /* synthetic */ C4610d(ComponentRuntime componentRuntime, Component component) {
        this.f42748a = componentRuntime;
        this.f42749b = component;
    }

    @Override // com.google.firebase.inject.Provider
    public final Object get() {
        return ComponentRuntime.m15113a(this.f42748a, this.f42749b);
    }
}
