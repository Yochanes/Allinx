package com.google.common.graph;

import com.google.common.base.Function;
import com.google.common.graph.DirectedGraphConnections;

/* JADX INFO: renamed from: com.google.common.graph.h */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4424h implements Function {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f42647a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f42648b;

    public /* synthetic */ C4424h(Object obj, int i) {
        this.f42647a = i;
        this.f42648b = obj;
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        switch (this.f42647a) {
            case 0:
                return DirectedGraphConnections.m14974a(this.f42648b, obj);
            case 1:
                return DirectedGraphConnections.m14976c(this.f42648b, obj);
            case 2:
                return DirectedGraphConnections.m14975b(this.f42648b, (DirectedGraphConnections.NodeConnection) obj);
            default:
                return UndirectedGraphConnections.m14989a(this.f42648b, obj);
        }
    }
}
