package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003¨\u0006\u0004"}, m18302d2 = {"Lkotlin/sequences/TransformingSequence;", "T", "R", "Lkotlin/sequences/Sequence;", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
public final class TransformingSequence<T, R> implements Sequence<R> {

    /* JADX INFO: renamed from: a */
    public final Sequence f55157a;

    /* JADX INFO: renamed from: b */
    public final Function1 f55158b;

    /* JADX INFO: renamed from: kotlin.sequences.TransformingSequence$iterator$1 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0010(\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"kotlin/sequences/TransformingSequence$iterator$1", "", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public final class C62481 implements Iterator<Object>, KMappedMarker {

        /* JADX INFO: renamed from: a */
        public final Iterator f55159a;

        public C62481() {
            this.f55159a = TransformingSequence.this.f55157a.getF55142a();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f55159a.hasNext();
        }

        @Override // java.util.Iterator
        public final Object next() {
            return TransformingSequence.this.f55158b.invoke(this.f55159a.next());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public TransformingSequence(Sequence sequence, Function1 transformer) {
        Intrinsics.m18599g(transformer, "transformer");
        this.f55157a = sequence;
        this.f55158b = transformer;
    }

    @Override // kotlin.sequences.Sequence
    /* JADX INFO: renamed from: iterator */
    public final Iterator getF55142a() {
        return new C62481();
    }
}
