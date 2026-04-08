package androidx.collection;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0010(\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"androidx/collection/SparseArrayKt$valueIterator$1", "", "collection"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class SparseArrayKt$valueIterator$1 implements Iterator<Object>, KMappedMarker {

    /* JADX INFO: renamed from: a */
    public int f3892a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ SparseArrayCompat f3893b;

    public SparseArrayKt$valueIterator$1(SparseArrayCompat sparseArrayCompat) {
        this.f3893b = sparseArrayCompat;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3892a < this.f3893b.m2137f();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f3892a;
        this.f3892a = i + 1;
        return this.f3893b.m2138h(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
