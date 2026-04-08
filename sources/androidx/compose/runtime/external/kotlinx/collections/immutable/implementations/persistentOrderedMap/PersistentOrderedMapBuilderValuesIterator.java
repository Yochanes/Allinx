package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMutableIterator;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010)\n\u0000\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u00012\b\u0012\u0004\u0012\u00028\u00010\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapBuilderValuesIterator;", "K", "V", "", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class PersistentOrderedMapBuilderValuesIterator<K, V> implements Iterator<V>, KMutableIterator {

    /* JADX INFO: renamed from: a */
    public final PersistentOrderedMapBuilderLinksIterator f16869a;

    public PersistentOrderedMapBuilderValuesIterator(PersistentOrderedMapBuilder persistentOrderedMapBuilder) {
        this.f16869a = new PersistentOrderedMapBuilderLinksIterator(persistentOrderedMapBuilder.f16855b, persistentOrderedMapBuilder);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f16869a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.f16869a.m4718c().f16846a;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f16869a.remove();
    }
}
