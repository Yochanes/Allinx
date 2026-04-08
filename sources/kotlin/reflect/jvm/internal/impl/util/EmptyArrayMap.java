package kotlin.reflect.jvm.internal.impl.util;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class EmptyArrayMap extends ArrayMap {

    /* JADX INFO: renamed from: a */
    public static final EmptyArrayMap f55035a = new EmptyArrayMap();

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.util.EmptyArrayMap$iterator$1 */
    /* JADX INFO: compiled from: Proguard */
    public final class C62291 implements Iterator, KMappedMarker {
        @Override // java.util.Iterator
        public final boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public final Object next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap
    /* JADX INFO: renamed from: c */
    public final int mo20323c() {
        return 0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap
    /* JADX INFO: renamed from: e */
    public final void mo20324e(int i, Object obj) {
        throw new IllegalStateException();
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap, java.lang.Iterable
    public final Iterator iterator() {
        return new C62291();
    }
}
