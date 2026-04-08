package com.google.gson.internal;

import com.google.gson.InstanceCreator;
import java.lang.reflect.Type;

/* JADX INFO: renamed from: com.google.gson.internal.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4812a implements ObjectConstructor {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f42873a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InstanceCreator f42874b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Type f42875c;

    public /* synthetic */ C4812a(InstanceCreator instanceCreator, Type type, int i) {
        this.f42873a = i;
        this.f42874b = instanceCreator;
        this.f42875c = type;
    }

    @Override // com.google.gson.internal.ObjectConstructor
    public final Object construct() {
        switch (this.f42873a) {
            case 0:
                return ConstructorConstructor.m15276g(this.f42874b, this.f42875c);
            default:
                return ConstructorConstructor.m15278i(this.f42874b, this.f42875c);
        }
    }
}
