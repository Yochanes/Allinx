package com.google.common.graph;

import com.google.common.base.Function;
import com.google.common.graph.AbstractBaseGraph;

/* JADX INFO: renamed from: com.google.common.graph.d */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4420d implements Function {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f42638a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractBaseGraph.C43872 f42639b;

    public /* synthetic */ C4420d(AbstractBaseGraph.C43872 c43872, int i) {
        this.f42638a = i;
        this.f42639b = c43872;
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        switch (this.f42638a) {
            case 0:
                return AbstractBaseGraph.C43872.m14965d(this.f42639b, obj);
            case 1:
                return AbstractBaseGraph.C43872.m14963a(this.f42639b, obj);
            default:
                return AbstractBaseGraph.C43872.m14964c(this.f42639b, obj);
        }
    }
}
