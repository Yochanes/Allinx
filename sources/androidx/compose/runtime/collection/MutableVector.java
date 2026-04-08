package androidx.compose.runtime.collection;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMutableList;
import kotlin.jvm.internal.markers.KMutableListIterator;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00060\u0002j\u0002`\u0003:\u0003\u0004\u0005\u0006¨\u0006\u0007"}, m18302d2 = {"Landroidx/compose/runtime/collection/MutableVector;", "T", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "MutableVectorList", "SubList", "VectorListIterator", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class MutableVector<T> implements RandomAccess {

    /* JADX INFO: renamed from: a */
    public Object[] f16734a;

    /* JADX INFO: renamed from: b */
    public List f16735b;

    /* JADX INFO: renamed from: c */
    public int f16736c;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/runtime/collection/MutableVector$MutableVectorList;", "T", "", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    @SourceDebugExtension
    public static final class MutableVectorList<T> implements List<T>, KMutableList {

        /* JADX INFO: renamed from: a */
        public final MutableVector f16737a;

        public MutableVectorList(MutableVector mutableVector) {
            this.f16737a = mutableVector;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean add(Object obj) {
            this.f16737a.m4568b(obj);
            return true;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean addAll(Collection collection) {
            MutableVector mutableVector = this.f16737a;
            return mutableVector.m4571e(mutableVector.f16736c, collection);
        }

        @Override // java.util.List, java.util.Collection
        public final void clear() {
            this.f16737a.m4573g();
        }

        @Override // java.util.List, java.util.Collection
        public final boolean contains(Object obj) {
            return this.f16737a.m4574h(obj);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean containsAll(Collection collection) {
            MutableVector mutableVector = this.f16737a;
            mutableVector.getClass();
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (!mutableVector.m4574h(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.List
        public final Object get(int i) {
            MutableVectorKt.m4581a(i, this);
            return this.f16737a.f16734a[i];
        }

        @Override // java.util.List
        public final int indexOf(Object obj) {
            return this.f16737a.m4575i(obj);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean isEmpty() {
            return this.f16737a.f16736c == 0;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public final Iterator iterator() {
            return new VectorListIterator(this, 0);
        }

        @Override // java.util.List
        public final int lastIndexOf(Object obj) {
            MutableVector mutableVector = this.f16737a;
            Object[] objArr = mutableVector.f16734a;
            for (int i = mutableVector.f16736c - 1; i >= 0; i--) {
                if (Intrinsics.m18594b(obj, objArr[i])) {
                    return i;
                }
            }
            return -1;
        }

        @Override // java.util.List
        public final ListIterator listIterator() {
            return new VectorListIterator(this, 0);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean remove(Object obj) {
            return this.f16737a.m4576j(obj);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean removeAll(Collection collection) {
            MutableVector mutableVector = this.f16737a;
            mutableVector.getClass();
            if (collection.isEmpty()) {
                return false;
            }
            int i = mutableVector.f16736c;
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                mutableVector.m4576j(it.next());
            }
            return i != mutableVector.f16736c;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean retainAll(Collection collection) {
            MutableVector mutableVector = this.f16737a;
            int i = mutableVector.f16736c;
            for (int i2 = i - 1; -1 < i2; i2--) {
                if (!collection.contains(mutableVector.f16734a[i2])) {
                    mutableVector.m4577k(i2);
                }
            }
            return i != mutableVector.f16736c;
        }

        @Override // java.util.List
        public final Object set(int i, Object obj) {
            MutableVectorKt.m4581a(i, this);
            Object[] objArr = this.f16737a.f16734a;
            Object obj2 = objArr[i];
            objArr[i] = obj;
            return obj2;
        }

        @Override // java.util.List, java.util.Collection
        public final int size() {
            return this.f16737a.f16736c;
        }

        @Override // java.util.List
        public final List subList(int i, int i2) {
            MutableVectorKt.m4582b(this, i, i2);
            return new SubList(this, i, i2);
        }

        @Override // java.util.List, java.util.Collection
        public final Object[] toArray() {
            return CollectionToArray.m18590a(this);
        }

        @Override // java.util.List
        public final void add(int i, Object obj) {
            this.f16737a.m4567a(i, obj);
        }

        @Override // java.util.List
        public final ListIterator listIterator(int i) {
            return new VectorListIterator(this, i);
        }

        @Override // java.util.List
        public final Object remove(int i) {
            MutableVectorKt.m4581a(i, this);
            return this.f16737a.m4577k(i);
        }

        @Override // java.util.List, java.util.Collection
        public final Object[] toArray(Object[] objArr) {
            return CollectionToArray.m18591b(this, objArr);
        }

        @Override // java.util.List
        public final boolean addAll(int i, Collection collection) {
            return this.f16737a.m4571e(i, collection);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/runtime/collection/MutableVector$SubList;", "T", "", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    @SourceDebugExtension
    public static final class SubList<T> implements List<T>, KMutableList {

        /* JADX INFO: renamed from: a */
        public final Object f16738a;

        /* JADX INFO: renamed from: b */
        public final int f16739b;

        /* JADX INFO: renamed from: c */
        public int f16740c;

        public SubList(List list, int i, int i2) {
            this.f16738a = list;
            this.f16739b = i;
            this.f16740c = i2;
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List, java.util.Collection
        public final boolean add(Object obj) {
            int i = this.f16740c;
            this.f16740c = i + 1;
            this.f16738a.add(i, obj);
            return true;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List
        public final boolean addAll(int i, Collection collection) {
            this.f16738a.addAll(i + this.f16739b, collection);
            int size = collection.size();
            this.f16740c += size;
            return size > 0;
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List, java.util.Collection
        public final void clear() {
            int i = this.f16740c - 1;
            int i2 = this.f16739b;
            if (i2 <= i) {
                while (true) {
                    this.f16738a.remove(i);
                    if (i == i2) {
                        break;
                    } else {
                        i--;
                    }
                }
            }
            this.f16740c = i2;
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List, java.util.Collection
        public final boolean contains(Object obj) {
            int i = this.f16740c;
            for (int i2 = this.f16739b; i2 < i; i2++) {
                if (Intrinsics.m18594b(this.f16738a.get(i2), obj)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean containsAll(Collection collection) {
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List
        public final Object get(int i) {
            MutableVectorKt.m4581a(i, this);
            return this.f16738a.get(i + this.f16739b);
        }

        /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List
        public final int indexOf(Object obj) {
            int i = this.f16740c;
            int i2 = this.f16739b;
            for (int i3 = i2; i3 < i; i3++) {
                if (Intrinsics.m18594b(this.f16738a.get(i3), obj)) {
                    return i3 - i2;
                }
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean isEmpty() {
            return this.f16740c == this.f16739b;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public final Iterator iterator() {
            return new VectorListIterator(this, 0);
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List
        public final int lastIndexOf(Object obj) {
            int i = this.f16740c - 1;
            int i2 = this.f16739b;
            if (i2 > i) {
                return -1;
            }
            while (!Intrinsics.m18594b(this.f16738a.get(i), obj)) {
                if (i == i2) {
                    return -1;
                }
                i--;
            }
            return i - i2;
        }

        @Override // java.util.List
        public final ListIterator listIterator() {
            return new VectorListIterator(this, 0);
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List, java.util.Collection
        public final boolean remove(Object obj) {
            int i = this.f16740c;
            for (int i2 = this.f16739b; i2 < i; i2++) {
                ?? r2 = this.f16738a;
                if (Intrinsics.m18594b(r2.get(i2), obj)) {
                    r2.remove(i2);
                    this.f16740c--;
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean removeAll(Collection collection) {
            int i = this.f16740c;
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                remove(it.next());
            }
            return i != this.f16740c;
        }

        /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List, java.util.Collection
        public final boolean retainAll(Collection collection) {
            int i = this.f16740c;
            int i2 = i - 1;
            int i3 = this.f16739b;
            if (i3 <= i2) {
                while (true) {
                    ?? r3 = this.f16738a;
                    if (!collection.contains(r3.get(i2))) {
                        r3.remove(i2);
                        this.f16740c--;
                    }
                    if (i2 == i3) {
                        break;
                    }
                    i2--;
                }
            }
            return i != this.f16740c;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List
        public final Object set(int i, Object obj) {
            MutableVectorKt.m4581a(i, this);
            return this.f16738a.set(i + this.f16739b, obj);
        }

        @Override // java.util.List, java.util.Collection
        public final int size() {
            return this.f16740c - this.f16739b;
        }

        @Override // java.util.List
        public final List subList(int i, int i2) {
            MutableVectorKt.m4582b(this, i, i2);
            return new SubList(this, i, i2);
        }

        @Override // java.util.List, java.util.Collection
        public final Object[] toArray() {
            return CollectionToArray.m18590a(this);
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List
        public final void add(int i, Object obj) {
            this.f16738a.add(i + this.f16739b, obj);
            this.f16740c++;
        }

        @Override // java.util.List
        public final ListIterator listIterator(int i) {
            return new VectorListIterator(this, i);
        }

        @Override // java.util.List, java.util.Collection
        public final Object[] toArray(Object[] objArr) {
            return CollectionToArray.m18591b(this, objArr);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List, java.util.Collection
        public final boolean addAll(Collection collection) {
            this.f16738a.addAll(this.f16740c, collection);
            int size = collection.size();
            this.f16740c += size;
            return size > 0;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List
        public final Object remove(int i) {
            MutableVectorKt.m4581a(i, this);
            this.f16740c--;
            return this.f16738a.remove(i + this.f16739b);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/runtime/collection/MutableVector$VectorListIterator;", "T", "", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class VectorListIterator<T> implements ListIterator<T>, KMutableListIterator {

        /* JADX INFO: renamed from: a */
        public final Object f16741a;

        /* JADX INFO: renamed from: b */
        public int f16742b;

        public VectorListIterator(List list, int i) {
            this.f16741a = list;
            this.f16742b = i;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.ListIterator
        public final void add(Object obj) {
            this.f16741a.add(this.f16742b, obj);
            this.f16742b++;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.f16742b < this.f16741a.size();
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.f16742b > 0;
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
        @Override // java.util.ListIterator, java.util.Iterator
        public final Object next() {
            int i = this.f16742b;
            this.f16742b = i + 1;
            return this.f16741a.get(i);
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.f16742b;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.ListIterator
        public final Object previous() {
            int i = this.f16742b - 1;
            this.f16742b = i;
            return this.f16741a.get(i);
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.f16742b - 1;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            int i = this.f16742b - 1;
            this.f16742b = i;
            this.f16741a.remove(i);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.ListIterator
        public final void set(Object obj) {
            this.f16741a.set(this.f16742b, obj);
        }
    }

    public MutableVector(Object[] objArr, int i) {
        this.f16734a = objArr;
        this.f16736c = i;
    }

    /* JADX INFO: renamed from: a */
    public final void m4567a(int i, Object obj) {
        int i2 = this.f16736c + 1;
        if (this.f16734a.length < i2) {
            m4579m(i2);
        }
        Object[] objArr = this.f16734a;
        int i3 = this.f16736c;
        if (i != i3) {
            System.arraycopy(objArr, i, objArr, i + 1, i3 - i);
        }
        objArr[i] = obj;
        this.f16736c++;
    }

    /* JADX INFO: renamed from: b */
    public final void m4568b(Object obj) {
        int i = this.f16736c + 1;
        if (this.f16734a.length < i) {
            m4579m(i);
        }
        Object[] objArr = this.f16734a;
        int i2 = this.f16736c;
        objArr[i2] = obj;
        this.f16736c = i2 + 1;
    }

    /* JADX INFO: renamed from: c */
    public final void m4569c(int i, MutableVector mutableVector) {
        int i2 = mutableVector.f16736c;
        if (i2 == 0) {
            return;
        }
        int i3 = this.f16736c + i2;
        if (this.f16734a.length < i3) {
            m4579m(i3);
        }
        Object[] objArr = this.f16734a;
        int i4 = this.f16736c;
        if (i != i4) {
            System.arraycopy(objArr, i, objArr, i + i2, i4 - i);
        }
        System.arraycopy(mutableVector.f16734a, 0, objArr, i, i2);
        this.f16736c += i2;
    }

    /* JADX INFO: renamed from: d */
    public final void m4570d(int i, List list) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        int i2 = this.f16736c + size;
        if (this.f16734a.length < i2) {
            m4579m(i2);
        }
        Object[] objArr = this.f16734a;
        int i3 = this.f16736c;
        if (i != i3) {
            System.arraycopy(objArr, i, objArr, i + size, i3 - i);
        }
        int size2 = list.size();
        for (int i4 = 0; i4 < size2; i4++) {
            objArr[i + i4] = list.get(i4);
        }
        this.f16736c += size;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m4571e(int i, Collection collection) {
        int i2 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        int size = collection.size();
        int i3 = this.f16736c + size;
        if (this.f16734a.length < i3) {
            m4579m(i3);
        }
        Object[] objArr = this.f16734a;
        int i4 = this.f16736c;
        if (i != i4) {
            System.arraycopy(objArr, i, objArr, i + size, i4 - i);
        }
        for (T t : collection) {
            int i5 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.m18455s0();
                throw null;
            }
            objArr[i2 + i] = t;
            i2 = i5;
        }
        this.f16736c += size;
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final List m4572f() {
        List list = this.f16735b;
        if (list != null) {
            return list;
        }
        MutableVectorList mutableVectorList = new MutableVectorList(this);
        this.f16735b = mutableVectorList;
        return mutableVectorList;
    }

    /* JADX INFO: renamed from: g */
    public final void m4573g() {
        Object[] objArr = this.f16734a;
        int i = this.f16736c;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f16736c = 0;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m4574h(Object obj) {
        int i = this.f16736c - 1;
        if (i >= 0) {
            for (int i2 = 0; !Intrinsics.m18594b(this.f16734a[i2], obj); i2++) {
                if (i2 != i) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public final int m4575i(Object obj) {
        Object[] objArr = this.f16734a;
        int i = this.f16736c;
        for (int i2 = 0; i2 < i; i2++) {
            if (Intrinsics.m18594b(obj, objArr[i2])) {
                return i2;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m4576j(Object obj) {
        int iM4575i = m4575i(obj);
        if (iM4575i < 0) {
            return false;
        }
        m4577k(iM4575i);
        return true;
    }

    /* JADX INFO: renamed from: k */
    public final Object m4577k(int i) {
        Object[] objArr = this.f16734a;
        Object obj = objArr[i];
        int i2 = this.f16736c;
        if (i != i2 - 1) {
            int i3 = i + 1;
            System.arraycopy(objArr, i3, objArr, i, i2 - i3);
        }
        int i4 = this.f16736c - 1;
        this.f16736c = i4;
        objArr[i4] = null;
        return obj;
    }

    /* JADX INFO: renamed from: l */
    public final void m4578l(int i, int i2) {
        if (i2 > i) {
            int i3 = this.f16736c;
            if (i2 < i3) {
                Object[] objArr = this.f16734a;
                System.arraycopy(objArr, i2, objArr, i, i3 - i2);
            }
            int i4 = this.f16736c;
            int i5 = i4 - (i2 - i);
            int i6 = i4 - 1;
            if (i5 <= i6) {
                int i7 = i5;
                while (true) {
                    this.f16734a[i7] = null;
                    if (i7 == i6) {
                        break;
                    } else {
                        i7++;
                    }
                }
            }
            this.f16736c = i5;
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m4579m(int i) {
        Object[] objArr = this.f16734a;
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i, length * 2)];
        System.arraycopy(objArr, 0, objArr2, 0, length);
        this.f16734a = objArr2;
    }

    /* JADX INFO: renamed from: n */
    public final void m4580n(Comparator comparator) {
        Arrays.sort(this.f16734a, 0, this.f16736c, comparator);
    }
}
