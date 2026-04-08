package com.google.common.graph;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.collect.AbstractIterator;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterators;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.graph.ElementOrder;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@ElementTypesAreNonnullByDefault
final class DirectedGraphConnections<N, V> implements GraphConnections<N, V> {
    private static final Object PRED = new Object();
    private final Map<N, Object> adjacentNodeValues;

    @CheckForNull
    private final List<NodeConnection<N>> orderedNodeConnections;
    private int predecessorCount;
    private int successorCount;

    /* JADX INFO: renamed from: com.google.common.graph.DirectedGraphConnections$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C43921 extends AbstractSet<N> {

        /* JADX INFO: renamed from: com.google.common.graph.DirectedGraphConnections$1$1, reason: invalid class name */
        /* JADX INFO: compiled from: Proguard */
        public class AnonymousClass1 extends AbstractIterator<N> {
            final /* synthetic */ C43921 this$1;
            final /* synthetic */ Iterator val$nodeConnections;
            final /* synthetic */ Set val$seenNodes;

            public AnonymousClass1(C43921 c43921, Iterator it, Set set) {
                this.val$nodeConnections = it;
                this.val$seenNodes = set;
                this.this$1 = c43921;
            }

            @Override // com.google.common.collect.AbstractIterator
            @CheckForNull
            public N computeNext() {
                while (this.val$nodeConnections.hasNext()) {
                    NodeConnection nodeConnection = (NodeConnection) this.val$nodeConnections.next();
                    if (this.val$seenNodes.add(nodeConnection.node)) {
                        return nodeConnection.node;
                    }
                }
                return endOfData();
            }
        }

        public C43921() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object obj) {
            return DirectedGraphConnections.access$100(DirectedGraphConnections.this).containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return iterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return DirectedGraphConnections.access$100(DirectedGraphConnections.this).size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public UnmodifiableIterator<N> iterator() {
            return new AnonymousClass1(this, DirectedGraphConnections.access$000(DirectedGraphConnections.this).iterator(), new HashSet());
        }
    }

    /* JADX INFO: renamed from: com.google.common.graph.DirectedGraphConnections$2 */
    /* JADX INFO: compiled from: Proguard */
    public class C43932 extends AbstractSet<N> {

        /* JADX INFO: renamed from: com.google.common.graph.DirectedGraphConnections$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: Proguard */
        public class AnonymousClass1 extends AbstractIterator<N> {
            final /* synthetic */ C43932 this$1;
            final /* synthetic */ Iterator val$entries;

            public AnonymousClass1(C43932 c43932, Iterator it) {
                this.val$entries = it;
                this.this$1 = c43932;
            }

            @Override // com.google.common.collect.AbstractIterator
            @CheckForNull
            public N computeNext() {
                while (this.val$entries.hasNext()) {
                    Map.Entry entry = (Map.Entry) this.val$entries.next();
                    if (DirectedGraphConnections.access$200(entry.getValue())) {
                        return (N) entry.getKey();
                    }
                }
                return endOfData();
            }
        }

        /* JADX INFO: renamed from: com.google.common.graph.DirectedGraphConnections$2$2, reason: invalid class name */
        /* JADX INFO: compiled from: Proguard */
        public class AnonymousClass2 extends AbstractIterator<N> {
            final /* synthetic */ C43932 this$1;
            final /* synthetic */ Iterator val$nodeConnections;

            public AnonymousClass2(C43932 c43932, Iterator it) {
                this.val$nodeConnections = it;
                this.this$1 = c43932;
            }

            @Override // com.google.common.collect.AbstractIterator
            @CheckForNull
            public N computeNext() {
                while (this.val$nodeConnections.hasNext()) {
                    NodeConnection nodeConnection = (NodeConnection) this.val$nodeConnections.next();
                    if (nodeConnection instanceof NodeConnection.Pred) {
                        return nodeConnection.node;
                    }
                }
                return endOfData();
            }
        }

        public C43932() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object obj) {
            return DirectedGraphConnections.access$200(DirectedGraphConnections.access$100(DirectedGraphConnections.this).get(obj));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return iterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return DirectedGraphConnections.access$300(DirectedGraphConnections.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public UnmodifiableIterator<N> iterator() {
            return DirectedGraphConnections.access$000(DirectedGraphConnections.this) == null ? new AnonymousClass1(this, DirectedGraphConnections.access$100(DirectedGraphConnections.this).entrySet().iterator()) : new AnonymousClass2(this, DirectedGraphConnections.access$000(DirectedGraphConnections.this).iterator());
        }
    }

    /* JADX INFO: renamed from: com.google.common.graph.DirectedGraphConnections$3 */
    /* JADX INFO: compiled from: Proguard */
    public class C43943 extends AbstractSet<N> {

        /* JADX INFO: renamed from: com.google.common.graph.DirectedGraphConnections$3$1, reason: invalid class name */
        /* JADX INFO: compiled from: Proguard */
        public class AnonymousClass1 extends AbstractIterator<N> {
            final /* synthetic */ C43943 this$1;
            final /* synthetic */ Iterator val$entries;

            public AnonymousClass1(C43943 c43943, Iterator it) {
                this.val$entries = it;
                this.this$1 = c43943;
            }

            @Override // com.google.common.collect.AbstractIterator
            @CheckForNull
            public N computeNext() {
                while (this.val$entries.hasNext()) {
                    Map.Entry entry = (Map.Entry) this.val$entries.next();
                    if (DirectedGraphConnections.access$400(entry.getValue())) {
                        return (N) entry.getKey();
                    }
                }
                return endOfData();
            }
        }

        /* JADX INFO: renamed from: com.google.common.graph.DirectedGraphConnections$3$2, reason: invalid class name */
        /* JADX INFO: compiled from: Proguard */
        public class AnonymousClass2 extends AbstractIterator<N> {
            final /* synthetic */ C43943 this$1;
            final /* synthetic */ Iterator val$nodeConnections;

            public AnonymousClass2(C43943 c43943, Iterator it) {
                this.val$nodeConnections = it;
                this.this$1 = c43943;
            }

            @Override // com.google.common.collect.AbstractIterator
            @CheckForNull
            public N computeNext() {
                while (this.val$nodeConnections.hasNext()) {
                    NodeConnection nodeConnection = (NodeConnection) this.val$nodeConnections.next();
                    if (nodeConnection instanceof NodeConnection.Succ) {
                        return nodeConnection.node;
                    }
                }
                return endOfData();
            }
        }

        public C43943() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object obj) {
            return DirectedGraphConnections.access$400(DirectedGraphConnections.access$100(DirectedGraphConnections.this).get(obj));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return iterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return DirectedGraphConnections.access$500(DirectedGraphConnections.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public UnmodifiableIterator<N> iterator() {
            return DirectedGraphConnections.access$000(DirectedGraphConnections.this) == null ? new AnonymousClass1(this, DirectedGraphConnections.access$100(DirectedGraphConnections.this).entrySet().iterator()) : new AnonymousClass2(this, DirectedGraphConnections.access$000(DirectedGraphConnections.this).iterator());
        }
    }

    /* JADX INFO: renamed from: com.google.common.graph.DirectedGraphConnections$4 */
    /* JADX INFO: compiled from: Proguard */
    public class C43954 extends AbstractIterator<EndpointPair<N>> {
        final /* synthetic */ DirectedGraphConnections this$0;
        final /* synthetic */ AtomicBoolean val$alreadySeenSelfLoop;
        final /* synthetic */ Iterator val$resultWithDoubleSelfLoop;

        public C43954(DirectedGraphConnections directedGraphConnections, Iterator it, AtomicBoolean atomicBoolean) {
            this.val$resultWithDoubleSelfLoop = it;
            this.val$alreadySeenSelfLoop = atomicBoolean;
            this.this$0 = directedGraphConnections;
        }

        @Override // com.google.common.collect.AbstractIterator
        @CheckForNull
        public /* bridge */ /* synthetic */ Object computeNext() {
            return computeNext();
        }

        @Override // com.google.common.collect.AbstractIterator
        @CheckForNull
        public EndpointPair<N> computeNext() {
            while (this.val$resultWithDoubleSelfLoop.hasNext()) {
                EndpointPair<N> endpointPair = (EndpointPair) this.val$resultWithDoubleSelfLoop.next();
                if (!endpointPair.nodeU().equals(endpointPair.nodeV()) || !this.val$alreadySeenSelfLoop.getAndSet(true)) {
                    return endpointPair;
                }
            }
            return endOfData();
        }
    }

    /* JADX INFO: renamed from: com.google.common.graph.DirectedGraphConnections$5 */
    /* JADX INFO: compiled from: Proguard */
    public static /* synthetic */ class C43965 {
        static final /* synthetic */ int[] $SwitchMap$com$google$common$graph$ElementOrder$Type;

        static {
            int[] iArr = new int[ElementOrder.Type.values().length];
            $SwitchMap$com$google$common$graph$ElementOrder$Type = iArr;
            try {
                iArr[ElementOrder.Type.UNORDERED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$common$graph$ElementOrder$Type[ElementOrder.Type.STABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static abstract class NodeConnection<N> {
        final N node;

        /* JADX INFO: compiled from: Proguard */
        public static final class Pred<N> extends NodeConnection<N> {
            public Pred(N n) {
                super(n);
            }

            public boolean equals(@CheckForNull Object obj) {
                if (obj instanceof Pred) {
                    return this.node.equals(((Pred) obj).node);
                }
                return false;
            }

            public int hashCode() {
                return this.node.hashCode() + Pred.class.hashCode();
            }
        }

        /* JADX INFO: compiled from: Proguard */
        public static final class Succ<N> extends NodeConnection<N> {
            public Succ(N n) {
                super(n);
            }

            public boolean equals(@CheckForNull Object obj) {
                if (obj instanceof Succ) {
                    return this.node.equals(((Succ) obj).node);
                }
                return false;
            }

            public int hashCode() {
                return this.node.hashCode() + Succ.class.hashCode();
            }
        }

        public NodeConnection(N n) {
            this.node = (N) Preconditions.checkNotNull(n);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class PredAndSucc {
        private final Object successorValue;

        public PredAndSucc(Object obj) {
            this.successorValue = obj;
        }

        public static /* synthetic */ Object access$600(PredAndSucc predAndSucc) {
            return predAndSucc.successorValue;
        }
    }

    private DirectedGraphConnections(Map<N, Object> map, @CheckForNull List<NodeConnection<N>> list, int i, int i2) {
        this.adjacentNodeValues = (Map) Preconditions.checkNotNull(map);
        this.orderedNodeConnections = list;
        this.predecessorCount = Graphs.checkNonNegative(i);
        this.successorCount = Graphs.checkNonNegative(i2);
        Preconditions.checkState(i <= map.size() && i2 <= map.size());
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ EndpointPair m14974a(Object obj, Object obj2) {
        return lambda$incidentEdgeIterator$0(obj, obj2);
    }

    public static /* synthetic */ List access$000(DirectedGraphConnections directedGraphConnections) {
        return directedGraphConnections.orderedNodeConnections;
    }

    public static /* synthetic */ Map access$100(DirectedGraphConnections directedGraphConnections) {
        return directedGraphConnections.adjacentNodeValues;
    }

    public static /* synthetic */ boolean access$200(Object obj) {
        return isPredecessor(obj);
    }

    public static /* synthetic */ int access$300(DirectedGraphConnections directedGraphConnections) {
        return directedGraphConnections.predecessorCount;
    }

    public static /* synthetic */ boolean access$400(Object obj) {
        return isSuccessor(obj);
    }

    public static /* synthetic */ int access$500(DirectedGraphConnections directedGraphConnections) {
        return directedGraphConnections.successorCount;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ EndpointPair m14975b(Object obj, NodeConnection nodeConnection) {
        return lambda$incidentEdgeIterator$2(obj, nodeConnection);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ EndpointPair m14976c(Object obj, Object obj2) {
        return lambda$incidentEdgeIterator$1(obj, obj2);
    }

    private static boolean isPredecessor(@CheckForNull Object obj) {
        return obj == PRED || (obj instanceof PredAndSucc);
    }

    private static boolean isSuccessor(@CheckForNull Object obj) {
        return (obj == PRED || obj == null) ? false : true;
    }

    private static /* synthetic */ EndpointPair lambda$incidentEdgeIterator$0(Object obj, Object obj2) {
        return EndpointPair.ordered(obj2, obj);
    }

    private static /* synthetic */ EndpointPair lambda$incidentEdgeIterator$1(Object obj, Object obj2) {
        return EndpointPair.ordered(obj, obj2);
    }

    private static /* synthetic */ EndpointPair lambda$incidentEdgeIterator$2(Object obj, NodeConnection nodeConnection) {
        return nodeConnection instanceof NodeConnection.Succ ? EndpointPair.ordered(obj, nodeConnection.node) : EndpointPair.ordered(nodeConnection.node, obj);
    }

    /* JADX INFO: renamed from: of */
    public static <N, V> DirectedGraphConnections<N, V> m14977of(ElementOrder<N> elementOrder) {
        ArrayList arrayList;
        int i = C43965.$SwitchMap$com$google$common$graph$ElementOrder$Type[elementOrder.type().ordinal()];
        if (i == 1) {
            arrayList = null;
        } else {
            if (i != 2) {
                throw new AssertionError(elementOrder.type());
            }
            arrayList = new ArrayList();
        }
        return new DirectedGraphConnections<>(new HashMap(4, 1.0f), arrayList, 0, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <N, V> DirectedGraphConnections<N, V> ofImmutable(N n, Iterable<EndpointPair<N>> iterable, Function<N, V> function) {
        Preconditions.checkNotNull(n);
        Preconditions.checkNotNull(function);
        HashMap map = new HashMap();
        ImmutableList.Builder builder = ImmutableList.builder();
        int i = 0;
        int i2 = 0;
        for (EndpointPair<N> endpointPair : iterable) {
            if (endpointPair.nodeU().equals(n) && endpointPair.nodeV().equals(n)) {
                map.put(n, new PredAndSucc(function.apply(n)));
                builder.add(new NodeConnection.Pred(n));
                builder.add(new NodeConnection.Succ(n));
                i++;
            } else if (endpointPair.nodeV().equals(n)) {
                N nNodeU = endpointPair.nodeU();
                Object objPut = map.put(nNodeU, PRED);
                if (objPut != null) {
                    map.put(nNodeU, new PredAndSucc(objPut));
                }
                builder.add(new NodeConnection.Pred(nNodeU));
                i++;
            } else {
                Preconditions.checkArgument(endpointPair.nodeU().equals(n));
                N nNodeV = endpointPair.nodeV();
                V vApply = function.apply(nNodeV);
                Object objPut2 = map.put(nNodeV, vApply);
                if (objPut2 != null) {
                    Preconditions.checkArgument(objPut2 == PRED);
                    map.put(nNodeV, new PredAndSucc(vApply));
                }
                builder.add(new NodeConnection.Succ(nNodeV));
            }
            i2++;
        }
        return new DirectedGraphConnections<>(map, builder.build(), i, i2);
    }

    @Override // com.google.common.graph.GraphConnections
    public void addPredecessor(N n, V v) {
        Map<N, Object> map = this.adjacentNodeValues;
        Object obj = PRED;
        Object objPut = map.put(n, obj);
        if (objPut != null) {
            if (objPut instanceof PredAndSucc) {
                this.adjacentNodeValues.put(n, objPut);
                return;
            } else if (objPut == obj) {
                return;
            } else {
                this.adjacentNodeValues.put(n, new PredAndSucc(objPut));
            }
        }
        int i = this.predecessorCount + 1;
        this.predecessorCount = i;
        Graphs.checkPositive(i);
        List<NodeConnection<N>> list = this.orderedNodeConnections;
        if (list != null) {
            list.add(new NodeConnection.Pred(n));
        }
    }

    @Override // com.google.common.graph.GraphConnections
    @CheckForNull
    public V addSuccessor(N n, V v) {
        Object obj = (V) this.adjacentNodeValues.put(n, v);
        if (obj == null) {
            obj = (V) null;
        } else if (obj instanceof PredAndSucc) {
            this.adjacentNodeValues.put(n, new PredAndSucc(v));
            obj = (V) PredAndSucc.access$600((PredAndSucc) obj);
        } else if (obj == PRED) {
            this.adjacentNodeValues.put(n, new PredAndSucc(v));
            obj = (V) null;
        }
        if (obj == null) {
            int i = this.successorCount + 1;
            this.successorCount = i;
            Graphs.checkPositive(i);
            List<NodeConnection<N>> list = this.orderedNodeConnections;
            if (list != null) {
                list.add(new NodeConnection.Succ(n));
            }
        }
        if (obj == null) {
            return null;
        }
        return (V) obj;
    }

    @Override // com.google.common.graph.GraphConnections
    public Set<N> adjacentNodes() {
        return this.orderedNodeConnections == null ? Collections.unmodifiableSet(this.adjacentNodeValues.keySet()) : new C43921();
    }

    @Override // com.google.common.graph.GraphConnections
    public Iterator<EndpointPair<N>> incidentEdgeIterator(N n) {
        Preconditions.checkNotNull(n);
        List<NodeConnection<N>> list = this.orderedNodeConnections;
        return new C43954(this, list == null ? Iterators.concat(Iterators.transform(predecessors().iterator(), new C4424h(n, 0)), Iterators.transform(successors().iterator(), new C4424h(n, 1))) : Iterators.transform(list.iterator(), new C4424h(n, 2)), new AtomicBoolean(false));
    }

    @Override // com.google.common.graph.GraphConnections
    public Set<N> predecessors() {
        return new C43932();
    }

    @Override // com.google.common.graph.GraphConnections
    public void removePredecessor(N n) {
        Preconditions.checkNotNull(n);
        Object obj = this.adjacentNodeValues.get(n);
        if (obj == PRED) {
            this.adjacentNodeValues.remove(n);
        } else if (!(obj instanceof PredAndSucc)) {
            return;
        } else {
            this.adjacentNodeValues.put(n, PredAndSucc.access$600((PredAndSucc) obj));
        }
        int i = this.predecessorCount - 1;
        this.predecessorCount = i;
        Graphs.checkNonNegative(i);
        List<NodeConnection<N>> list = this.orderedNodeConnections;
        if (list != null) {
            list.remove(new NodeConnection.Pred(n));
        }
    }

    @Override // com.google.common.graph.GraphConnections
    @CheckForNull
    public V removeSuccessor(Object obj) {
        Object obj2;
        Preconditions.checkNotNull(obj);
        Object obj3 = (V) this.adjacentNodeValues.get(obj);
        if (obj3 == null || obj3 == (obj2 = PRED)) {
            obj3 = (V) null;
        } else if (obj3 instanceof PredAndSucc) {
            this.adjacentNodeValues.put(obj, obj2);
            obj3 = (V) PredAndSucc.access$600((PredAndSucc) obj3);
        } else {
            this.adjacentNodeValues.remove(obj);
        }
        if (obj3 != null) {
            int i = this.successorCount - 1;
            this.successorCount = i;
            Graphs.checkNonNegative(i);
            List<NodeConnection<N>> list = this.orderedNodeConnections;
            if (list != null) {
                list.remove(new NodeConnection.Succ(obj));
            }
        }
        if (obj3 == null) {
            return null;
        }
        return (V) obj3;
    }

    @Override // com.google.common.graph.GraphConnections
    public Set<N> successors() {
        return new C43943();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.GraphConnections
    @CheckForNull
    public V value(N n) {
        Preconditions.checkNotNull(n);
        V v = (V) this.adjacentNodeValues.get(n);
        if (v == PRED) {
            return null;
        }
        return v instanceof PredAndSucc ? (V) PredAndSucc.access$600((PredAndSucc) v) : v;
    }
}
