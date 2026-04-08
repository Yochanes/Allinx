package com.google.firebase.components;

import com.google.firebase.FirebaseApp;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallations;

/* JADX INFO: renamed from: com.google.firebase.components.b */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4608b implements Provider {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f42744a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f42745b;

    public /* synthetic */ C4608b(Object obj, int i) {
        this.f42744a = i;
        this.f42745b = obj;
    }

    @Override // com.google.firebase.inject.Provider
    public final Object get() {
        switch (this.f42744a) {
            case 0:
                return ComponentDiscovery.m15112a((String) this.f42745b);
            default:
                return FirebaseInstallations.m15221e((FirebaseApp) this.f42745b);
        }
    }
}
