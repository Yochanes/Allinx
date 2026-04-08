package kotlin.reflect.jvm.internal.impl.utils;

import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.collections.ArraysKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.jvm.internal.markers.KMutableIterator;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension
public final class SmartSet<T> extends AbstractSet<T> {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int f55102c = 0;

    /* JADX INFO: renamed from: a */
    public Object f55103a;

    /* JADX INFO: renamed from: b */
    public int f55104b;

    /* JADX INFO: compiled from: Proguard */
    public static final class ArrayIterator<T> implements Iterator<T>, KMutableIterator {

        /* JADX INFO: renamed from: a */
        public final Iterator f55105a;

        public ArrayIterator(Object[] array) {
            Intrinsics.m18599g(array, "array");
            this.f55105a = ArrayIteratorKt.m18576a(array);
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f55105a.hasNext();
        }

        @Override // java.util.Iterator
        public final Object next() {
            return this.f55105a.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @SourceDebugExtension
    public static final class Companion {
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class SingletonIterator<T> implements Iterator<T>, KMutableIterator {

        /* JADX INFO: renamed from: a */
        public final Object f55106a;

        /* JADX INFO: renamed from: b */
        public boolean f55107b = true;

        public SingletonIterator(Object obj) {
            this.f55106a = obj;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f55107b;
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (!this.f55107b) {
                throw new NoSuchElementException();
            }
            this.f55107b = false;
            return this.f55106a;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        Object obj2;
        int i = this.f55104b;
        if (i == 0) {
            this.f55103a = obj;
        } else if (i == 1) {
            if (Intrinsics.m18594b(this.f55103a, obj)) {
                return false;
            }
            this.f55103a = new Object[]{this.f55103a, obj};
        } else if (i < 5) {
            Object obj3 = this.f55103a;
            Intrinsics.m18597e(obj3, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            Object[] objArr = (Object[]) obj3;
            if (ArraysKt.m18376k(objArr, obj)) {
                return false;
            }
            int i2 = this.f55104b;
            if (i2 == 4) {
                LinkedHashSet linkedHashSetM18498b = SetsKt.m18498b(Arrays.copyOf(objArr, objArr.length));
                linkedHashSetM18498b.add(obj);
                obj2 = linkedHashSetM18498b;
            } else {
                Object[] objArrCopyOf = Arrays.copyOf(objArr, i2 + 1);
                Intrinsics.m18598f(objArrCopyOf, "copyOf(this, newSize)");
                objArrCopyOf[objArrCopyOf.length - 1] = obj;
                obj2 = objArrCopyOf;
            }
            this.f55103a = obj2;
        } else {
            Object obj4 = this.f55103a;
            Intrinsics.m18597e(obj4, "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>");
            if (!TypeIntrinsics.m18628d(obj4).add(obj)) {
                return false;
            }
        }
        this.f55104b++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f55103a = null;
        this.f55104b = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i = this.f55104b;
        if (i == 0) {
            return false;
        }
        if (i == 1) {
            return Intrinsics.m18594b(this.f55103a, obj);
        }
        if (i < 5) {
            Object obj2 = this.f55103a;
            Intrinsics.m18597e(obj2, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            return ArraysKt.m18376k((Object[]) obj2, obj);
        }
        Object obj3 = this.f55103a;
        Intrinsics.m18597e(obj3, "null cannot be cast to non-null type kotlin.collections.Set<T of org.jetbrains.kotlin.utils.SmartSet>");
        return ((Set) obj3).contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.f55104b;
        if (i == 0) {
            return Collections.EMPTY_SET.iterator();
        }
        if (i == 1) {
            return new SingletonIterator(this.f55103a);
        }
        if (i < 5) {
            Object obj = this.f55103a;
            Intrinsics.m18597e(obj, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            return new ArrayIterator((Object[]) obj);
        }
        Object obj2 = this.f55103a;
        Intrinsics.m18597e(obj2, "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>");
        return TypeIntrinsics.m18628d(obj2).iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f55104b;
    }
}
