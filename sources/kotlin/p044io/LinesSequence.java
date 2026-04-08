package kotlin.p044io;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.sequences.Sequence;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"Lkotlin/io/LinesSequence;", "Lkotlin/sequences/Sequence;", "", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
final class LinesSequence implements Sequence<String> {

    /* JADX INFO: renamed from: kotlin.io.LinesSequence$iterator$1 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\f\n\u0000\n\u0002\u0010(\n\u0002\u0010\u000e\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"kotlin/io/LinesSequence$iterator$1", "", "", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public final class C59921 implements Iterator<String>, KMappedMarker {
        public C59921() {
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            LinesSequence.this.getClass();
            throw null;
        }

        @Override // java.util.Iterator
        public final String next() {
            hasNext();
            throw null;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        return new C59921();
    }
}
