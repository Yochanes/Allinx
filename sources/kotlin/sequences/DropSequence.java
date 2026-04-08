package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, m18302d2 = {"Lkotlin/sequences/DropSequence;", "T", "Lkotlin/sequences/Sequence;", "Lkotlin/sequences/DropTakeSequence;", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
@SourceDebugExtension
public final class DropSequence<T> implements Sequence<T>, DropTakeSequence<T> {

    /* JADX INFO: renamed from: a */
    public final Sequence f55111a;

    /* JADX INFO: renamed from: b */
    public final int f55112b;

    /* JADX INFO: renamed from: kotlin.sequences.DropSequence$iterator$1 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0010(\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"kotlin/sequences/DropSequence$iterator$1", "", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public final class C62371 implements Iterator<Object>, KMappedMarker {

        /* JADX INFO: renamed from: a */
        public final Iterator f55113a;

        /* JADX INFO: renamed from: b */
        public int f55114b;

        public C62371(DropSequence dropSequence) {
            this.f55113a = dropSequence.f55111a.getF55142a();
            this.f55114b = dropSequence.f55112b;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            Iterator it;
            while (true) {
                int i = this.f55114b;
                it = this.f55113a;
                if (i <= 0 || !it.hasNext()) {
                    break;
                }
                it.next();
                this.f55114b--;
            }
            return it.hasNext();
        }

        @Override // java.util.Iterator
        public final Object next() {
            Iterator it;
            while (true) {
                int i = this.f55114b;
                it = this.f55113a;
                if (i <= 0 || !it.hasNext()) {
                    break;
                }
                it.next();
                this.f55114b--;
            }
            return it.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public DropSequence(Sequence sequence, int i) {
        this.f55111a = sequence;
        this.f55112b = i;
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i + '.').toString());
    }

    @Override // kotlin.sequences.DropTakeSequence
    /* JADX INFO: renamed from: a */
    public final Sequence mo20353a(int i) {
        int i2 = this.f55112b + i;
        return i2 < 0 ? new DropSequence(this, i) : new DropSequence(this.f55111a, i2);
    }

    @Override // kotlin.sequences.Sequence
    /* JADX INFO: renamed from: iterator */
    public final Iterator getF55142a() {
        return new C62371(this);
    }
}
