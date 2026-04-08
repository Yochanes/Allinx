package kotlin.collections;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002¨\u0006\u0004"}, m18302d2 = {"Lkotlin/collections/IndexingIterator;", "T", "", "Lkotlin/collections/IndexedValue;", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
public final class IndexingIterator<T> implements Iterator<IndexedValue<? extends T>>, KMappedMarker {

    /* JADX INFO: renamed from: a */
    public final Iterator f51502a;

    /* JADX INFO: renamed from: b */
    public int f51503b;

    public IndexingIterator(Iterator iterator) {
        Intrinsics.m18599g(iterator, "iterator");
        this.f51502a = iterator;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f51502a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f51503b;
        this.f51503b = i + 1;
        if (i >= 0) {
            return new IndexedValue(i, this.f51502a.next());
        }
        CollectionsKt.m18455s0();
        throw null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
