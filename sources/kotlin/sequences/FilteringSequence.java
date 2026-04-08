package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, m18302d2 = {"Lkotlin/sequences/FilteringSequence;", "T", "Lkotlin/sequences/Sequence;", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
public final class FilteringSequence<T> implements Sequence<T> {

    /* JADX INFO: renamed from: a */
    public final Sequence f55116a;

    /* JADX INFO: renamed from: b */
    public final boolean f55117b;

    /* JADX INFO: renamed from: c */
    public final Function1 f55118c;

    /* JADX INFO: renamed from: kotlin.sequences.FilteringSequence$iterator$1 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0010(\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"kotlin/sequences/FilteringSequence$iterator$1", "", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public final class C62391 implements Iterator<Object>, KMappedMarker {

        /* JADX INFO: renamed from: a */
        public final Iterator f55119a;

        /* JADX INFO: renamed from: b */
        public int f55120b = -1;

        /* JADX INFO: renamed from: c */
        public Object f55121c;

        public C62391() {
            this.f55119a = FilteringSequence.this.f55116a.getF55142a();
        }

        /* JADX INFO: renamed from: c */
        public final void m20354c() {
            Object next;
            FilteringSequence filteringSequence;
            do {
                Iterator it = this.f55119a;
                if (!it.hasNext()) {
                    this.f55120b = 0;
                    return;
                } else {
                    next = it.next();
                    filteringSequence = FilteringSequence.this;
                }
            } while (((Boolean) filteringSequence.f55118c.invoke(next)).booleanValue() != filteringSequence.f55117b);
            this.f55121c = next;
            this.f55120b = 1;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.f55120b == -1) {
                m20354c();
            }
            return this.f55120b == 1;
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (this.f55120b == -1) {
                m20354c();
            }
            if (this.f55120b == 0) {
                throw new NoSuchElementException();
            }
            Object obj = this.f55121c;
            this.f55121c = null;
            this.f55120b = -1;
            return obj;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public FilteringSequence(Sequence sequence, boolean z2, Function1 function1) {
        Intrinsics.m18599g(sequence, "sequence");
        this.f55116a = sequence;
        this.f55117b = z2;
        this.f55118c = function1;
    }

    @Override // kotlin.sequences.Sequence
    /* JADX INFO: renamed from: iterator */
    public final Iterator getF55142a() {
        return new C62391();
    }
}
