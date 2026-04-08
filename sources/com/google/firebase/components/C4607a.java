package com.google.firebase.components;

/* JADX INFO: renamed from: com.google.firebase.components.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4607a implements ComponentFactory {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f42742a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f42743b;

    public /* synthetic */ C4607a(Object obj, int i) {
        this.f42742a = i;
        this.f42743b = obj;
    }

    @Override // com.google.firebase.components.ComponentFactory
    public final Object create(ComponentContainer componentContainer) {
        switch (this.f42742a) {
            case 0:
                return Component.m15106c(this.f42743b, componentContainer);
            case 1:
                return Component.m15108e(this.f42743b, componentContainer);
            case 2:
                return Component.m15107d(this.f42743b, componentContainer);
            case 3:
                return Component.m15105b(this.f42743b, componentContainer);
            default:
                return Component.m15104a(this.f42743b, componentContainer);
        }
    }
}
