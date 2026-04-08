package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.jvm.internal.markers.KMutableIterator;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u0003¨\u0006\u0005"}, m18302d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapBuilderLinksIterator;", "K", "V", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/LinkedValue;", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public class PersistentOrderedMapBuilderLinksIterator<K, V> implements Iterator<LinkedValue<V>>, KMutableIterator {

    /* JADX INFO: renamed from: a */
    public Object f16862a;

    /* JADX INFO: renamed from: b */
    public final PersistentOrderedMapBuilder f16863b;

    /* JADX INFO: renamed from: c */
    public Object f16864c = EndOfChain.f16897a;

    /* JADX INFO: renamed from: d */
    public boolean f16865d;

    /* JADX INFO: renamed from: f */
    public int f16866f;

    /* JADX INFO: renamed from: g */
    public int f16867g;

    public PersistentOrderedMapBuilderLinksIterator(Object obj, PersistentOrderedMapBuilder persistentOrderedMapBuilder) {
        this.f16862a = obj;
        this.f16863b = persistentOrderedMapBuilder;
        this.f16866f = persistentOrderedMapBuilder.f16857d.f16802f;
    }

    /* JADX INFO: renamed from: c */
    public final LinkedValue m4718c() {
        PersistentOrderedMapBuilder persistentOrderedMapBuilder = this.f16863b;
        if (persistentOrderedMapBuilder.f16857d.f16802f != this.f16866f) {
            throw new ConcurrentModificationException();
        }
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object obj = this.f16862a;
        this.f16864c = obj;
        this.f16865d = true;
        this.f16867g++;
        V v = persistentOrderedMapBuilder.f16857d.get(obj);
        if (v == null) {
            throw new ConcurrentModificationException(AbstractC0000a.m18o(new StringBuilder("Hash code of a key ("), this.f16862a, ") has changed after it was added to the persistent map."));
        }
        LinkedValue linkedValue = (LinkedValue) v;
        this.f16862a = linkedValue.f16848c;
        return linkedValue;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f16867g < this.f16863b.f16857d.getF16803g();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return m4718c();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f16865d) {
            throw new IllegalStateException();
        }
        Object obj = this.f16864c;
        PersistentOrderedMapBuilder persistentOrderedMapBuilder = this.f16863b;
        TypeIntrinsics.m18627c(persistentOrderedMapBuilder).remove(obj);
        this.f16864c = null;
        this.f16865d = false;
        this.f16866f = persistentOrderedMapBuilder.f16857d.f16802f;
        this.f16867g--;
    }
}
