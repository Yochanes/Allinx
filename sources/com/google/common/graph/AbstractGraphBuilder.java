package com.google.common.graph;

import com.google.common.base.Optional;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@ElementTypesAreNonnullByDefault
abstract class AbstractGraphBuilder<N> {
    final boolean directed;
    boolean allowsSelfLoops = false;
    ElementOrder<N> nodeOrder = ElementOrder.insertion();
    ElementOrder<N> incidentEdgeOrder = ElementOrder.unordered();
    Optional<Integer> expectedNodeCount = Optional.absent();

    public AbstractGraphBuilder(boolean z2) {
        this.directed = z2;
    }
}
