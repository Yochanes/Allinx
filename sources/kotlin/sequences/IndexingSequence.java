package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002¨\u0006\u0004"}, m18302d2 = {"Lkotlin/sequences/IndexingSequence;", "T", "Lkotlin/sequences/Sequence;", "Lkotlin/collections/IndexedValue;", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
public final class IndexingSequence<T> implements Sequence<IndexedValue<? extends T>> {

    /* JADX INFO: renamed from: kotlin.sequences.IndexingSequence$iterator$1 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\f\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"kotlin/sequences/IndexingSequence$iterator$1", "", "Lkotlin/collections/IndexedValue;", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public final class C62421 implements Iterator<IndexedValue<Object>>, KMappedMarker {

        /* JADX INFO: renamed from: a */
        public int f55135a;

        @Override // java.util.Iterator
        public final boolean hasNext() {
            throw null;
        }

        @Override // java.util.Iterator
        public final IndexedValue<Object> next() {
            int i = this.f55135a;
            this.f55135a = i + 1;
            if (i >= 0) {
                throw null;
            }
            CollectionsKt.m18455s0();
            throw null;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // kotlin.sequences.Sequence
    /* JADX INFO: renamed from: iterator */
    public final Iterator getF55142a() {
        throw null;
    }
}
