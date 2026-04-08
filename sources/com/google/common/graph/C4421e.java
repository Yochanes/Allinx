package com.google.common.graph;

import com.google.common.base.Supplier;

/* JADX INFO: renamed from: com.google.common.graph.e */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4421e implements Supplier {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f42640a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractNetwork f42641b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f42642c;

    public /* synthetic */ C4421e(AbstractNetwork abstractNetwork, Object obj, int i) {
        this.f42640a = i;
        this.f42641b = abstractNetwork;
        this.f42642c = obj;
    }

    @Override // com.google.common.base.Supplier
    public final Object get() {
        switch (this.f42640a) {
            case 0:
                return AbstractNetwork.m14966a(this.f42641b, this.f42642c);
            default:
                return AbstractNetwork.m14967b(this.f42641b, this.f42642c);
        }
    }
}
