package com.google.firebase.components;

import com.google.firebase.components.ComponentRuntime;
import com.google.firebase.inject.Provider;

/* JADX INFO: renamed from: com.google.firebase.components.c */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4609c implements Provider {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f42746a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ComponentRegistrar f42747b;

    public /* synthetic */ C4609c(ComponentRegistrar componentRegistrar, int i) {
        this.f42746a = i;
        this.f42747b = componentRegistrar;
    }

    @Override // com.google.firebase.inject.Provider
    public final Object get() {
        switch (this.f42746a) {
            case 0:
                return ComponentRuntime.m15115c(this.f42747b);
            default:
                return ComponentRuntime.Builder.m15117a(this.f42747b);
        }
    }
}
