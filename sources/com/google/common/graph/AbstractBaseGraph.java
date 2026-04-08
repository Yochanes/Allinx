package com.google.common.graph;

import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterators;
import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.math.IntMath;
import com.google.common.primitives.Ints;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@ElementTypesAreNonnullByDefault
abstract class AbstractBaseGraph<N> implements BaseGraph<N> {

    /* JADX INFO: renamed from: com.google.common.graph.AbstractBaseGraph$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C43861 extends AbstractSet<EndpointPair<N>> {
        public C43861() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object obj) {
            if (!(obj instanceof EndpointPair)) {
                return false;
            }
            EndpointPair<?> endpointPair = (EndpointPair) obj;
            return AbstractBaseGraph.this.isOrderingCompatible(endpointPair) && AbstractBaseGraph.this.nodes().contains(endpointPair.nodeU()) && AbstractBaseGraph.this.successors(endpointPair.nodeU()).contains(endpointPair.nodeV());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return iterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@CheckForNull Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return Ints.saturatedCast(AbstractBaseGraph.this.edgeCount());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public UnmodifiableIterator<EndpointPair<N>> iterator() {
            return EndpointPairIterator.m14982of(AbstractBaseGraph.this);
        }
    }

    /* JADX INFO: renamed from: com.google.common.graph.AbstractBaseGraph$2 */
    /* JADX INFO: compiled from: Proguard */
    public class C43872 extends IncidentEdgeSet<N> {
        public C43872(BaseGraph baseGraph, Object obj) {
            super(baseGraph, obj);
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ EndpointPair m14963a(C43872 c43872, Object obj) {
            return c43872.lambda$iterator$1(obj);
        }

        /* JADX INFO: renamed from: c */
        public static /* synthetic */ EndpointPair m14964c(C43872 c43872, Object obj) {
            return c43872.lambda$iterator$2(obj);
        }

        /* JADX INFO: renamed from: d */
        public static /* synthetic */ EndpointPair m14965d(C43872 c43872, Object obj) {
            return c43872.lambda$iterator$0(obj);
        }

        private /* synthetic */ EndpointPair lambda$iterator$0(Object obj) {
            return EndpointPair.ordered(obj, this.node);
        }

        private /* synthetic */ EndpointPair lambda$iterator$1(Object obj) {
            return EndpointPair.ordered(this.node, obj);
        }

        private /* synthetic */ EndpointPair lambda$iterator$2(Object obj) {
            return EndpointPair.unordered(this.node, obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return iterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public UnmodifiableIterator<EndpointPair<N>> iterator() {
            return this.graph.isDirected() ? Iterators.unmodifiableIterator(Iterators.concat(Iterators.transform(this.graph.predecessors((Object) this.node).iterator(), new C4420d(this, 0)), Iterators.transform(Sets.difference(this.graph.successors((Object) this.node), ImmutableSet.m14873of(this.node)).iterator(), new C4420d(this, 1)))) : Iterators.unmodifiableIterator(Iterators.transform(this.graph.adjacentNodes(this.node).iterator(), new C4420d(this, 2)));
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Boolean m14959a(AbstractBaseGraph abstractBaseGraph, Object obj, Object obj2) {
        return abstractBaseGraph.lambda$nodePairInvalidatableSet$2(obj, obj2);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m14960b(Object obj, Object obj2) {
        return lambda$nodePairInvalidatableSet$3(obj, obj2);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Boolean m14961c(AbstractBaseGraph abstractBaseGraph, Object obj) {
        return abstractBaseGraph.lambda$nodeInvalidatableSet$0(obj);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ String m14962d(Object obj) {
        return lambda$nodeInvalidatableSet$1(obj);
    }

    private /* synthetic */ Boolean lambda$nodeInvalidatableSet$0(Object obj) {
        return Boolean.valueOf(nodes().contains(obj));
    }

    private static /* synthetic */ String lambda$nodeInvalidatableSet$1(Object obj) {
        return String.format("Node %s that was used to generate this set is no longer in the graph.", obj);
    }

    private /* synthetic */ Boolean lambda$nodePairInvalidatableSet$2(Object obj, Object obj2) {
        return Boolean.valueOf(nodes().contains(obj) && nodes().contains(obj2));
    }

    private static /* synthetic */ String lambda$nodePairInvalidatableSet$3(Object obj, Object obj2) {
        return String.format("Node %s or node %s that were used to generate this set are no longer in the graph.", obj, obj2);
    }

    @Override // com.google.common.graph.BaseGraph
    public int degree(N n) {
        if (isDirected()) {
            return IntMath.saturatedAdd(predecessors((Object) n).size(), successors((Object) n).size());
        }
        Set<N> setAdjacentNodes = adjacentNodes(n);
        return IntMath.saturatedAdd(setAdjacentNodes.size(), (allowsSelfLoops() && setAdjacentNodes.contains(n)) ? 1 : 0);
    }

    public long edgeCount() {
        Iterator<N> it = nodes().iterator();
        long jDegree = 0;
        while (it.hasNext()) {
            jDegree += (long) degree(it.next());
        }
        Preconditions.checkState((1 & jDegree) == 0);
        return jDegree >>> 1;
    }

    @Override // com.google.common.graph.BaseGraph
    public Set<EndpointPair<N>> edges() {
        return new C43861();
    }

    @Override // com.google.common.graph.BaseGraph
    public boolean hasEdgeConnecting(N n, N n2) {
        Preconditions.checkNotNull(n);
        Preconditions.checkNotNull(n2);
        return nodes().contains(n) && successors((Object) n).contains(n2);
    }

    @Override // com.google.common.graph.BaseGraph
    public int inDegree(N n) {
        return isDirected() ? predecessors((Object) n).size() : degree(n);
    }

    @Override // com.google.common.graph.BaseGraph
    public ElementOrder<N> incidentEdgeOrder() {
        return ElementOrder.unordered();
    }

    @Override // com.google.common.graph.BaseGraph
    public Set<EndpointPair<N>> incidentEdges(N n) {
        Preconditions.checkNotNull(n);
        Preconditions.checkArgument(nodes().contains(n), "Node %s is not an element of this graph.", n);
        return (Set<EndpointPair<N>>) nodeInvalidatableSet(new C43872(this, n), n);
    }

    public final boolean isOrderingCompatible(EndpointPair<?> endpointPair) {
        return endpointPair.isOrdered() == isDirected();
    }

    public final <T> Set<T> nodeInvalidatableSet(Set<T> set, N n) {
        return InvalidatableSet.m14988of((Set) set, (Supplier<Boolean>) new C4418b(this, n), (Supplier<String>) new C4419c(n, 0));
    }

    public final <T> Set<T> nodePairInvalidatableSet(Set<T> set, N n, N n2) {
        return InvalidatableSet.m14988of((Set) set, (Supplier<Boolean>) new C4417a(this, 0, n, n2), (Supplier<String>) new C4418b(0, n, n2));
    }

    @Override // com.google.common.graph.BaseGraph
    public int outDegree(N n) {
        return isDirected() ? successors((Object) n).size() : degree(n);
    }

    public final void validateEndpoints(EndpointPair<?> endpointPair) {
        Preconditions.checkNotNull(endpointPair);
        Preconditions.checkArgument(isOrderingCompatible(endpointPair), "Mismatch: endpoints' ordering is not compatible with directionality of the graph");
    }

    @Override // com.google.common.graph.BaseGraph
    public boolean hasEdgeConnecting(EndpointPair<N> endpointPair) {
        Preconditions.checkNotNull(endpointPair);
        if (!isOrderingCompatible(endpointPair)) {
            return false;
        }
        N nNodeU = endpointPair.nodeU();
        return nodes().contains(nNodeU) && successors((Object) nNodeU).contains(endpointPair.nodeV());
    }
}
