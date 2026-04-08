package kotlin.collections;

import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0010(\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"kotlin/collections/AbstractMap$values$1$iterator$1", "", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
public final class AbstractMap$values$1$iterator$1 implements Iterator<Object>, KMappedMarker {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Iterator f51480a;

    public AbstractMap$values$1$iterator$1(Iterator it) {
        this.f51480a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f51480a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return ((Map.Entry) this.f51480a.next()).getValue();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
