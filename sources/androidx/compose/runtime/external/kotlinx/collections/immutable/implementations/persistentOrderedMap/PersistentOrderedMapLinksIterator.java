package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u0003¨\u0006\u0005"}, m18302d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapLinksIterator;", "K", "V", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/LinkedValue;", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public class PersistentOrderedMapLinksIterator<K, V> implements Iterator<LinkedValue<V>>, KMappedMarker {

    /* JADX INFO: renamed from: a */
    public Object f16874a;

    /* JADX INFO: renamed from: b */
    public final Map f16875b;

    /* JADX INFO: renamed from: c */
    public int f16876c;

    public PersistentOrderedMapLinksIterator(Object obj, Map map) {
        this.f16874a = obj;
        this.f16875b = map;
    }

    /* JADX INFO: renamed from: c */
    public final LinkedValue m4719c() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object obj = this.f16875b.get(this.f16874a);
        if (obj == null) {
            throw new ConcurrentModificationException(AbstractC0000a.m18o(new StringBuilder("Hash code of a key ("), this.f16874a, ") has changed after it was added to the persistent map."));
        }
        LinkedValue linkedValue = (LinkedValue) obj;
        this.f16876c++;
        this.f16874a = linkedValue.f16848c;
        return linkedValue;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f16876c < this.f16875b.size();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return m4719c();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
