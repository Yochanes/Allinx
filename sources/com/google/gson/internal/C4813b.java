package com.google.gson.internal;

/* JADX INFO: renamed from: com.google.gson.internal.b */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4813b implements ObjectConstructor {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f42876a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f42877b;

    public /* synthetic */ C4813b(String str, int i) {
        this.f42876a = i;
        this.f42877b = str;
    }

    @Override // com.google.gson.internal.ObjectConstructor
    public final Object construct() {
        switch (this.f42876a) {
            case 0:
                return ConstructorConstructor.m15284o(this.f42877b);
            case 1:
                return ConstructorConstructor.m15283n(this.f42877b);
            case 2:
                return ConstructorConstructor.m15280k(this.f42877b);
            case 3:
                return ConstructorConstructor.m15286q(this.f42877b);
            case 4:
                return ConstructorConstructor.m15273d(this.f42877b);
            default:
                return ConstructorConstructor.m15290u(this.f42877b);
        }
    }
}
