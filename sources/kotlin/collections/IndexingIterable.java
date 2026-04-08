package kotlin.collections;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002¨\u0006\u0004"}, m18302d2 = {"Lkotlin/collections/IndexingIterable;", "T", "", "Lkotlin/collections/IndexedValue;", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
public final class IndexingIterable<T> implements Iterable<IndexedValue<? extends T>>, KMappedMarker {

    /* JADX INFO: renamed from: a */
    public final Function0 f51501a;

    public IndexingIterable(Function0 function0) {
        this.f51501a = function0;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new IndexingIterator((Iterator) this.f51501a.invoke());
    }
}
