package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, m18302d2 = {"Lkotlin/sequences/TakeWhileSequence;", "T", "Lkotlin/sequences/Sequence;", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
public final class TakeWhileSequence<T> implements Sequence<T> {

    /* JADX INFO: renamed from: a */
    public final Sequence f55149a;

    /* JADX INFO: renamed from: b */
    public final Function1 f55150b;

    /* JADX INFO: renamed from: kotlin.sequences.TakeWhileSequence$iterator$1 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0010(\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"kotlin/sequences/TakeWhileSequence$iterator$1", "", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public final class C62461 implements Iterator<Object>, KMappedMarker {

        /* JADX INFO: renamed from: a */
        public final Iterator f55151a;

        /* JADX INFO: renamed from: b */
        public int f55152b = -1;

        /* JADX INFO: renamed from: c */
        public Object f55153c;

        public C62461() {
            this.f55151a = TakeWhileSequence.this.f55149a.getF55142a();
        }

        /* JADX INFO: renamed from: c */
        public final void m20379c() {
            Iterator it = this.f55151a;
            if (it.hasNext()) {
                Object next = it.next();
                if (((Boolean) TakeWhileSequence.this.f55150b.invoke(next)).booleanValue()) {
                    this.f55152b = 1;
                    this.f55153c = next;
                    return;
                }
            }
            this.f55152b = 0;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.f55152b == -1) {
                m20379c();
            }
            return this.f55152b == 1;
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (this.f55152b == -1) {
                m20379c();
            }
            if (this.f55152b == 0) {
                throw new NoSuchElementException();
            }
            Object obj = this.f55153c;
            this.f55153c = null;
            this.f55152b = -1;
            return obj;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public TakeWhileSequence(Sequence sequence, Function1 function1) {
        Intrinsics.m18599g(sequence, "sequence");
        this.f55149a = sequence;
        this.f55150b = function1;
    }

    @Override // kotlin.sequences.Sequence
    /* JADX INFO: renamed from: iterator */
    public final Iterator getF55142a() {
        return new C62461();
    }
}
