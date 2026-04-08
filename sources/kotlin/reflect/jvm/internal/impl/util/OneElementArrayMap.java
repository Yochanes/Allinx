package kotlin.reflect.jvm.internal.impl.util;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.reflect.jvm.internal.impl.types.TypeAttribute;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class OneElementArrayMap<T> extends ArrayMap<T> {

    /* JADX INFO: renamed from: a */
    public final TypeAttribute f55042a;

    /* JADX INFO: renamed from: b */
    public final int f55043b;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.util.OneElementArrayMap$iterator$1 */
    /* JADX INFO: compiled from: Proguard */
    public final class C62301 implements Iterator<Object>, KMappedMarker {

        /* JADX INFO: renamed from: a */
        public boolean f55044a = true;

        public C62301() {
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f55044a;
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (!this.f55044a) {
                throw new NoSuchElementException();
            }
            this.f55044a = false;
            return OneElementArrayMap.this.f55042a;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public OneElementArrayMap(TypeAttribute typeAttribute, int i) {
        this.f55042a = typeAttribute;
        this.f55043b = i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap
    /* JADX INFO: renamed from: c */
    public final int mo20323c() {
        return 1;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap
    /* JADX INFO: renamed from: e */
    public final void mo20324e(int i, Object obj) {
        throw new IllegalStateException();
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap
    public final Object get(int i) {
        if (i == this.f55043b) {
            return this.f55042a;
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap, java.lang.Iterable
    public final Iterator iterator() {
        return new C62301();
    }
}
