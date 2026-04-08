package com.google.gson.internal;

import java.lang.reflect.Type;

/* JADX INFO: renamed from: com.google.gson.internal.c */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4863c implements ObjectConstructor {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f42878a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Type f42879b;

    public /* synthetic */ C4863c(int i, Type type) {
        this.f42878a = i;
        this.f42879b = type;
    }

    @Override // com.google.gson.internal.ObjectConstructor
    public final Object construct() {
        switch (this.f42878a) {
            case 0:
                return ConstructorConstructor.m15282m(this.f42879b);
            default:
                return ConstructorConstructor.m15275f(this.f42879b);
        }
    }
}
