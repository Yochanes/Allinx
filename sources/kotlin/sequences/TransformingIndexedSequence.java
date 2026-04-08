package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003¨\u0006\u0004"}, m18302d2 = {"Lkotlin/sequences/TransformingIndexedSequence;", "T", "R", "Lkotlin/sequences/Sequence;", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
public final class TransformingIndexedSequence<T, R> implements Sequence<R> {

    /* JADX INFO: renamed from: kotlin.sequences.TransformingIndexedSequence$iterator$1 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0010(\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"kotlin/sequences/TransformingIndexedSequence$iterator$1", "", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public final class C62471 implements Iterator<Object>, KMappedMarker {

        /* JADX INFO: renamed from: a */
        public int f55155a;

        public C62471() {
            TransformingIndexedSequence.this.getClass();
            throw null;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            throw null;
        }

        @Override // java.util.Iterator
        public final Object next() {
            TransformingIndexedSequence.this.getClass();
            int i = this.f55155a;
            this.f55155a = i + 1;
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
        new C62471();
        throw null;
    }
}
