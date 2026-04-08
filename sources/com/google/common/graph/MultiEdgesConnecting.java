package com.google.common.graph;

import com.google.common.base.Preconditions;
import com.google.common.collect.AbstractIterator;
import com.google.common.collect.UnmodifiableIterator;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@ElementTypesAreNonnullByDefault
abstract class MultiEdgesConnecting<E> extends AbstractSet<E> {
    private final Map<E, ?> outEdgeToNode;
    private final Object targetNode;

    /* JADX INFO: renamed from: com.google.common.graph.MultiEdgesConnecting$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C44021 extends AbstractIterator<E> {
        final /* synthetic */ MultiEdgesConnecting this$0;
        final /* synthetic */ Iterator val$entries;

        public C44021(MultiEdgesConnecting multiEdgesConnecting, Iterator it) {
            this.val$entries = it;
            this.this$0 = multiEdgesConnecting;
        }

        @Override // com.google.common.collect.AbstractIterator
        @CheckForNull
        public E computeNext() {
            while (this.val$entries.hasNext()) {
                Map.Entry entry = (Map.Entry) this.val$entries.next();
                if (MultiEdgesConnecting.access$000(this.this$0).equals(entry.getValue())) {
                    return (E) entry.getKey();
                }
            }
            return endOfData();
        }
    }

    public MultiEdgesConnecting(Map<E, ?> map, Object obj) {
        this.outEdgeToNode = (Map) Preconditions.checkNotNull(map);
        this.targetNode = Preconditions.checkNotNull(obj);
    }

    public static /* synthetic */ Object access$000(MultiEdgesConnecting multiEdgesConnecting) {
        return multiEdgesConnecting.targetNode;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@CheckForNull Object obj) {
        return this.targetNode.equals(this.outEdgeToNode.get(obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public UnmodifiableIterator<E> iterator() {
        return new C44021(this, this.outEdgeToNode.entrySet().iterator());
    }
}
