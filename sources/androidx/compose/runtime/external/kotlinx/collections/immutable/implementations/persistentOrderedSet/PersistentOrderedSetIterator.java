package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0000\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSetIterator;", "E", "", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public class PersistentOrderedSetIterator<E> implements Iterator<E>, KMappedMarker {

    /* JADX INFO: renamed from: a */
    public Object f16889a;

    /* JADX INFO: renamed from: b */
    public final Map f16890b;

    /* JADX INFO: renamed from: c */
    public int f16891c;

    public PersistentOrderedSetIterator(Object obj, Map map) {
        this.f16889a = obj;
        this.f16890b = map;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f16891c < this.f16890b.size();
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object obj = this.f16889a;
        this.f16891c++;
        Object obj2 = this.f16890b.get(obj);
        if (obj2 != null) {
            this.f16889a = ((Links) obj2).f16880b;
            return obj;
        }
        throw new ConcurrentModificationException("Hash code of an element (" + obj + ") has changed after it was added to the persistent set.");
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
