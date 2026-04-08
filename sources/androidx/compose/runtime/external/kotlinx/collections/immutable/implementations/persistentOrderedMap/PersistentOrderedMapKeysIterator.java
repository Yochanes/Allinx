package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0000\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapKeysIterator;", "K", "V", "", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class PersistentOrderedMapKeysIterator<K, V> implements Iterator<K>, KMappedMarker {

    /* JADX INFO: renamed from: a */
    public final PersistentOrderedMapLinksIterator f16873a;

    public PersistentOrderedMapKeysIterator(PersistentOrderedMap persistentOrderedMap) {
        this.f16873a = new PersistentOrderedMapLinksIterator(persistentOrderedMap.f16851c, persistentOrderedMap.f16853f);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f16873a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        PersistentOrderedMapLinksIterator persistentOrderedMapLinksIterator = this.f16873a;
        Object obj = persistentOrderedMapLinksIterator.f16874a;
        persistentOrderedMapLinksIterator.m4719c();
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
