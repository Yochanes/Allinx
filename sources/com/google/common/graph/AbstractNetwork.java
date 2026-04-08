package com.google.common.graph;

import com.google.common.annotations.Beta;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Supplier;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterators;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.math.IntMath;
import java.util.AbstractSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Beta
@ElementTypesAreNonnullByDefault
public abstract class AbstractNetwork<N, E> implements Network<N, E> {

    /* JADX INFO: renamed from: com.google.common.graph.AbstractNetwork$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C43891 extends AbstractGraph<N> {

        /* JADX INFO: renamed from: com.google.common.graph.AbstractNetwork$1$1, reason: invalid class name */
        /* JADX INFO: compiled from: Proguard */
        public class AnonymousClass1 extends AbstractSet<EndpointPair<N>> {
            public AnonymousClass1() {
            }

            /* JADX INFO: renamed from: a */
            public static /* synthetic */ EndpointPair m14972a(AnonymousClass1 anonymousClass1, Object obj) {
                return anonymousClass1.lambda$iterator$0(obj);
            }

            private /* synthetic */ EndpointPair lambda$iterator$0(Object obj) {
                return AbstractNetwork.this.incidentNodes(obj);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(@CheckForNull Object obj) {
                if (!(obj instanceof EndpointPair)) {
                    return false;
                }
                EndpointPair<?> endpointPair = (EndpointPair) obj;
                return C43891.this.isOrderingCompatible(endpointPair) && C43891.this.nodes().contains(endpointPair.nodeU()) && C43891.this.successors(endpointPair.nodeU()).contains(endpointPair.nodeV());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<EndpointPair<N>> iterator() {
                return Iterators.transform(AbstractNetwork.this.edges().iterator(), new C4423g(this, 0));
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return AbstractNetwork.this.edges().size();
            }
        }

        public C43891() {
        }

        @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
        public Set<N> adjacentNodes(N n) {
            return AbstractNetwork.this.adjacentNodes(n);
        }

        @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
        public boolean allowsSelfLoops() {
            return AbstractNetwork.this.allowsSelfLoops();
        }

        @Override // com.google.common.graph.AbstractGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
        public Set<EndpointPair<N>> edges() {
            return AbstractNetwork.this.allowsParallelEdges() ? super.edges() : new AnonymousClass1();
        }

        @Override // com.google.common.graph.AbstractGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
        public ElementOrder<N> incidentEdgeOrder() {
            return ElementOrder.unordered();
        }

        @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
        public boolean isDirected() {
            return AbstractNetwork.this.isDirected();
        }

        @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
        public ElementOrder<N> nodeOrder() {
            return AbstractNetwork.this.nodeOrder();
        }

        @Override // com.google.common.graph.BaseGraph, com.google.common.graph.Graph
        public Set<N> nodes() {
            return AbstractNetwork.this.nodes();
        }

        @Override // com.google.common.graph.BaseGraph, com.google.common.graph.PredecessorsFunction, com.google.common.graph.Graph
        public /* bridge */ /* synthetic */ Iterable predecessors(Object obj) {
            return predecessors(obj);
        }

        @Override // com.google.common.graph.BaseGraph, com.google.common.graph.SuccessorsFunction, com.google.common.graph.Graph
        public /* bridge */ /* synthetic */ Iterable successors(Object obj) {
            return successors(obj);
        }

        @Override // com.google.common.graph.BaseGraph, com.google.common.graph.PredecessorsFunction, com.google.common.graph.Graph
        public Set<N> predecessors(N n) {
            return AbstractNetwork.this.predecessors((Object) n);
        }

        @Override // com.google.common.graph.BaseGraph, com.google.common.graph.SuccessorsFunction, com.google.common.graph.Graph
        public Set<N> successors(N n) {
            return AbstractNetwork.this.successors((Object) n);
        }
    }

    /* JADX INFO: renamed from: com.google.common.graph.AbstractNetwork$2 */
    /* JADX INFO: compiled from: Proguard */
    public class C43902 implements Predicate<E> {
        final /* synthetic */ AbstractNetwork this$0;
        final /* synthetic */ Object val$nodePresent;
        final /* synthetic */ Object val$nodeToCheck;

        public C43902(AbstractNetwork abstractNetwork, Object obj, Object obj2) {
            this.val$nodePresent = obj;
            this.val$nodeToCheck = obj2;
            this.this$0 = abstractNetwork;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.base.Predicate
        public boolean apply(E e) {
            return this.this$0.incidentNodes(e).adjacentNode(this.val$nodePresent).equals(this.val$nodeToCheck);
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Boolean m14966a(AbstractNetwork abstractNetwork, Object obj) {
        return abstractNetwork.lambda$nodeInvalidatableSet$2(obj);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Boolean m14967b(AbstractNetwork abstractNetwork, Object obj) {
        return abstractNetwork.lambda$edgeInvalidatableSet$0(obj);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ String m14968c(Object obj, Object obj2) {
        return lambda$nodePairInvalidatableSet$5(obj, obj2);
    }

    private Predicate<E> connectedPredicate(N n, N n2) {
        return new C43902(this, n, n2);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ String m14969d(Object obj) {
        return lambda$nodeInvalidatableSet$3(obj);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ String m14970e(Object obj) {
        return lambda$edgeInvalidatableSet$1(obj);
    }

    private static <N, E> Map<E, EndpointPair<N>> edgeIncidentNodesMap(Network<N, E> network) {
        return Maps.asMap(network.edges(), new C4422f(network, 0));
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ Boolean m14971f(AbstractNetwork abstractNetwork, Object obj, Object obj2) {
        return abstractNetwork.lambda$nodePairInvalidatableSet$4(obj, obj2);
    }

    private /* synthetic */ Boolean lambda$edgeInvalidatableSet$0(Object obj) {
        return Boolean.valueOf(edges().contains(obj));
    }

    private static /* synthetic */ String lambda$edgeInvalidatableSet$1(Object obj) {
        return String.format("Edge %s that was used to generate this set is no longer in the graph.", obj);
    }

    private /* synthetic */ Boolean lambda$nodeInvalidatableSet$2(Object obj) {
        return Boolean.valueOf(nodes().contains(obj));
    }

    private static /* synthetic */ String lambda$nodeInvalidatableSet$3(Object obj) {
        return String.format("Node %s that was used to generate this set is no longer in the graph.", obj);
    }

    private /* synthetic */ Boolean lambda$nodePairInvalidatableSet$4(Object obj, Object obj2) {
        return Boolean.valueOf(nodes().contains(obj) && nodes().contains(obj2));
    }

    private static /* synthetic */ String lambda$nodePairInvalidatableSet$5(Object obj, Object obj2) {
        return String.format("Node %s or node %s that were used to generate this set are no longer in the graph.", obj, obj2);
    }

    @Override // com.google.common.graph.Network
    public Set<E> adjacentEdges(E e) {
        EndpointPair<N> endpointPairIncidentNodes = incidentNodes(e);
        return (Set<E>) edgeInvalidatableSet(Sets.difference(Sets.union(incidentEdges(endpointPairIncidentNodes.nodeU()), incidentEdges(endpointPairIncidentNodes.nodeV())), ImmutableSet.m14873of((Object) e)), e);
    }

    @Override // com.google.common.graph.Network
    public Graph<N> asGraph() {
        return new C43891();
    }

    @Override // com.google.common.graph.Network
    public int degree(N n) {
        return isDirected() ? IntMath.saturatedAdd(inEdges(n).size(), outEdges(n).size()) : IntMath.saturatedAdd(incidentEdges(n).size(), edgesConnecting(n, n).size());
    }

    @Override // com.google.common.graph.Network
    @CheckForNull
    public E edgeConnectingOrNull(N n, N n2) {
        Set<E> setEdgesConnecting = edgesConnecting(n, n2);
        int size = setEdgesConnecting.size();
        if (size == 0) {
            return null;
        }
        if (size == 1) {
            return setEdgesConnecting.iterator().next();
        }
        throw new IllegalArgumentException(String.format("Cannot call edgeConnecting() when parallel edges exist between %s and %s. Consider calling edgesConnecting() instead.", n, n2));
    }

    public final <T> Set<T> edgeInvalidatableSet(Set<T> set, E e) {
        return InvalidatableSet.m14988of((Set) set, (Supplier<Boolean>) new C4421e(this, e, 1), (Supplier<String>) new C4419c(e, 2));
    }

    @Override // com.google.common.graph.Network
    public Set<E> edgesConnecting(N n, N n2) {
        Set<E> setOutEdges = outEdges(n);
        Set<E> setInEdges = inEdges(n2);
        return (Set<E>) nodePairInvalidatableSet(setOutEdges.size() <= setInEdges.size() ? Collections.unmodifiableSet(Sets.filter(setOutEdges, connectedPredicate(n, n2))) : Collections.unmodifiableSet(Sets.filter(setInEdges, connectedPredicate(n2, n))), n, n2);
    }

    @Override // com.google.common.graph.Network
    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Network)) {
            return false;
        }
        Network network = (Network) obj;
        return isDirected() == network.isDirected() && nodes().equals(network.nodes()) && edgeIncidentNodesMap(this).equals(edgeIncidentNodesMap(network));
    }

    @Override // com.google.common.graph.Network
    public boolean hasEdgeConnecting(N n, N n2) {
        Preconditions.checkNotNull(n);
        Preconditions.checkNotNull(n2);
        return nodes().contains(n) && successors((Object) n).contains(n2);
    }

    @Override // com.google.common.graph.Network
    public final int hashCode() {
        return edgeIncidentNodesMap(this).hashCode();
    }

    @Override // com.google.common.graph.Network
    public int inDegree(N n) {
        return isDirected() ? inEdges(n).size() : degree(n);
    }

    public final boolean isOrderingCompatible(EndpointPair<?> endpointPair) {
        return endpointPair.isOrdered() == isDirected();
    }

    public final <T> Set<T> nodeInvalidatableSet(Set<T> set, N n) {
        return InvalidatableSet.m14988of((Set) set, (Supplier<Boolean>) new C4421e(this, n, 0), (Supplier<String>) new C4419c(n, 1));
    }

    public final <T> Set<T> nodePairInvalidatableSet(Set<T> set, N n, N n2) {
        return InvalidatableSet.m14988of((Set) set, (Supplier<Boolean>) new C4417a(this, 1, n, n2), (Supplier<String>) new C4418b(1, n, n2));
    }

    @Override // com.google.common.graph.Network
    public int outDegree(N n) {
        return isDirected() ? outEdges(n).size() : degree(n);
    }

    public String toString() {
        return "isDirected: " + isDirected() + ", allowsParallelEdges: " + allowsParallelEdges() + ", allowsSelfLoops: " + allowsSelfLoops() + ", nodes: " + nodes() + ", edges: " + edgeIncidentNodesMap(this);
    }

    public final void validateEndpoints(EndpointPair<?> endpointPair) {
        Preconditions.checkNotNull(endpointPair);
        Preconditions.checkArgument(isOrderingCompatible(endpointPair), "Mismatch: endpoints' ordering is not compatible with directionality of the graph");
    }

    @Override // com.google.common.graph.Network
    public boolean hasEdgeConnecting(EndpointPair<N> endpointPair) {
        Preconditions.checkNotNull(endpointPair);
        if (isOrderingCompatible(endpointPair)) {
            return hasEdgeConnecting(endpointPair.nodeU(), endpointPair.nodeV());
        }
        return false;
    }

    @Override // com.google.common.graph.Network
    @CheckForNull
    public E edgeConnectingOrNull(EndpointPair<N> endpointPair) {
        validateEndpoints(endpointPair);
        return edgeConnectingOrNull(endpointPair.nodeU(), endpointPair.nodeV());
    }

    @Override // com.google.common.graph.Network
    public Set<E> edgesConnecting(EndpointPair<N> endpointPair) {
        validateEndpoints(endpointPair);
        return edgesConnecting(endpointPair.nodeU(), endpointPair.nodeV());
    }
}
