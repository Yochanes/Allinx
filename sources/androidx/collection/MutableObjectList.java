package androidx.collection;

import androidx.collection.internal.RuntimeHelpersKt;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMutableList;
import kotlin.jvm.internal.markers.KMutableListIterator;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, m18302d2 = {"Landroidx/collection/MutableObjectList;", "E", "Landroidx/collection/ObjectList;", "MutableObjectListIterator", "ObjectListMutableList", "SubList", "collection"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class MutableObjectList<E> extends ObjectList<E> {

    /* JADX INFO: renamed from: c */
    public ObjectListMutableList f3757c;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/collection/MutableObjectList$MutableObjectListIterator;", "T", "", "collection"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class MutableObjectListIterator<T> implements ListIterator<T>, KMutableListIterator {

        /* JADX INFO: renamed from: a */
        public final Object f3758a;

        /* JADX INFO: renamed from: b */
        public int f3759b;

        public MutableObjectListIterator(List list, int i) {
            this.f3758a = list;
            this.f3759b = i - 1;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.ListIterator
        public final void add(Object obj) {
            int i = this.f3759b + 1;
            this.f3759b = i;
            this.f3758a.add(i, obj);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.f3759b < this.f3758a.size() - 1;
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.f3759b >= 0;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.ListIterator, java.util.Iterator
        public final Object next() {
            int i = this.f3759b + 1;
            this.f3759b = i;
            return this.f3758a.get(i);
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.f3759b + 1;
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
        @Override // java.util.ListIterator
        public final Object previous() {
            int i = this.f3759b;
            this.f3759b = i - 1;
            return this.f3758a.get(i);
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.f3759b;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            this.f3758a.remove(this.f3759b);
            this.f3759b--;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.ListIterator
        public final void set(Object obj) {
            this.f3758a.set(this.f3759b, obj);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/collection/MutableObjectList$ObjectListMutableList;", "T", "", "collection"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class ObjectListMutableList<T> implements List<T>, KMutableList {

        /* JADX INFO: renamed from: a */
        public final MutableObjectList f3760a;

        public ObjectListMutableList(MutableObjectList objectList) {
            Intrinsics.m18599g(objectList, "objectList");
            this.f3760a = objectList;
        }

        @Override // java.util.List
        public final void add(int i, Object obj) {
            int i2;
            MutableObjectList mutableObjectList = this.f3760a;
            if (i < 0 || i > (i2 = mutableObjectList.f3819b)) {
                mutableObjectList.getClass();
                RuntimeHelpersKt.m2144b("Index " + i + " must be in 0.." + mutableObjectList.f3819b);
                throw null;
            }
            int i3 = i2 + 1;
            Object[] objArr = mutableObjectList.f3818a;
            if (objArr.length < i3) {
                mutableObjectList.m2065n(i3, objArr);
            }
            Object[] objArr2 = mutableObjectList.f3818a;
            int i4 = mutableObjectList.f3819b;
            if (i != i4) {
                ArraysKt.m18383r(objArr2, i + 1, objArr2, i, i4);
            }
            objArr2[i] = obj;
            mutableObjectList.f3819b++;
        }

        @Override // java.util.List
        public final boolean addAll(int i, Collection elements) {
            Intrinsics.m18599g(elements, "elements");
            MutableObjectList mutableObjectList = this.f3760a;
            mutableObjectList.getClass();
            if (i < 0 || i > mutableObjectList.f3819b) {
                StringBuilder sbM20q = AbstractC0000a.m20q(i, "Index ", " must be in 0..");
                sbM20q.append(mutableObjectList.f3819b);
                RuntimeHelpersKt.m2144b(sbM20q.toString());
                throw null;
            }
            int i2 = 0;
            if (elements.isEmpty()) {
                return false;
            }
            int size = elements.size() + mutableObjectList.f3819b;
            Object[] objArr = mutableObjectList.f3818a;
            if (objArr.length < size) {
                mutableObjectList.m2065n(size, objArr);
            }
            Object[] objArr2 = mutableObjectList.f3818a;
            if (i != mutableObjectList.f3819b) {
                ArraysKt.m18383r(objArr2, elements.size() + i, objArr2, i, mutableObjectList.f3819b);
            }
            for (T t : elements) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt.m18455s0();
                    throw null;
                }
                objArr2[i2 + i] = t;
                i2 = i3;
            }
            mutableObjectList.f3819b = elements.size() + mutableObjectList.f3819b;
            return true;
        }

        @Override // java.util.List, java.util.Collection
        public final void clear() {
            this.f3760a.m2061j();
        }

        @Override // java.util.List, java.util.Collection
        public final boolean contains(Object obj) {
            return this.f3760a.m2098c(obj) >= 0;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean containsAll(Collection elements) {
            Intrinsics.m18599g(elements, "elements");
            MutableObjectList mutableObjectList = this.f3760a;
            mutableObjectList.getClass();
            Iterator<T> it = elements.iterator();
            while (it.hasNext()) {
                if (mutableObjectList.m2098c(it.next()) < 0) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.List
        public final Object get(int i) {
            ObjectListKt.m2102a(i, this);
            return this.f3760a.m2097b(i);
        }

        @Override // java.util.List
        public final int indexOf(Object obj) {
            return this.f3760a.m2098c(obj);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean isEmpty() {
            return this.f3760a.m2099d();
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public final Iterator iterator() {
            return new MutableObjectListIterator(this, 0);
        }

        @Override // java.util.List
        public final int lastIndexOf(Object obj) {
            MutableObjectList mutableObjectList = this.f3760a;
            if (obj == null) {
                Object[] objArr = mutableObjectList.f3818a;
                for (int i = mutableObjectList.f3819b - 1; -1 < i; i--) {
                    if (objArr[i] == null) {
                        return i;
                    }
                }
            } else {
                Object[] objArr2 = mutableObjectList.f3818a;
                for (int i2 = mutableObjectList.f3819b - 1; -1 < i2; i2--) {
                    if (obj.equals(objArr2[i2])) {
                        return i2;
                    }
                }
            }
            return -1;
        }

        @Override // java.util.List
        public final ListIterator listIterator() {
            return new MutableObjectListIterator(this, 0);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean remove(Object obj) {
            return this.f3760a.m2062k(obj);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean removeAll(Collection elements) {
            Intrinsics.m18599g(elements, "elements");
            MutableObjectList mutableObjectList = this.f3760a;
            mutableObjectList.getClass();
            int i = mutableObjectList.f3819b;
            Iterator<T> it = elements.iterator();
            while (it.hasNext()) {
                mutableObjectList.m2062k(it.next());
            }
            return i != mutableObjectList.f3819b;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean retainAll(Collection elements) {
            Intrinsics.m18599g(elements, "elements");
            MutableObjectList mutableObjectList = this.f3760a;
            mutableObjectList.getClass();
            int i = mutableObjectList.f3819b;
            Object[] objArr = mutableObjectList.f3818a;
            for (int i2 = i - 1; -1 < i2; i2--) {
                if (!elements.contains(objArr[i2])) {
                    mutableObjectList.m2063l(i2);
                }
            }
            return i != mutableObjectList.f3819b;
        }

        @Override // java.util.List
        public final Object set(int i, Object obj) {
            ObjectListKt.m2102a(i, this);
            MutableObjectList mutableObjectList = this.f3760a;
            if (i < 0 || i >= mutableObjectList.f3819b) {
                mutableObjectList.m2101f(i);
                throw null;
            }
            Object[] objArr = mutableObjectList.f3818a;
            Object obj2 = objArr[i];
            objArr[i] = obj;
            return obj2;
        }

        @Override // java.util.List, java.util.Collection
        public final int size() {
            return this.f3760a.f3819b;
        }

        @Override // java.util.List
        public final List subList(int i, int i2) {
            ObjectListKt.m2103b(this, i, i2);
            return new SubList(this, i, i2);
        }

        @Override // java.util.List, java.util.Collection
        public final Object[] toArray() {
            return CollectionToArray.m18590a(this);
        }

        @Override // java.util.List
        public final ListIterator listIterator(int i) {
            return new MutableObjectListIterator(this, i);
        }

        @Override // java.util.List
        public final Object remove(int i) {
            ObjectListKt.m2102a(i, this);
            return this.f3760a.m2063l(i);
        }

        @Override // java.util.List, java.util.Collection
        public final Object[] toArray(Object[] array) {
            Intrinsics.m18599g(array, "array");
            return CollectionToArray.m18591b(this, array);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean add(Object obj) {
            this.f3760a.m2058g(obj);
            return true;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean addAll(Collection elements) {
            Intrinsics.m18599g(elements, "elements");
            MutableObjectList mutableObjectList = this.f3760a;
            mutableObjectList.getClass();
            int i = mutableObjectList.f3819b;
            Iterator<T> it = elements.iterator();
            while (it.hasNext()) {
                mutableObjectList.m2058g(it.next());
            }
            return i != mutableObjectList.f3819b;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/collection/MutableObjectList$SubList;", "T", "", "collection"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    @SourceDebugExtension
    public static final class SubList<T> implements List<T>, KMutableList {

        /* JADX INFO: renamed from: a */
        public final Object f3761a;

        /* JADX INFO: renamed from: b */
        public final int f3762b;

        /* JADX INFO: renamed from: c */
        public int f3763c;

        public SubList(List list, int i, int i2) {
            this.f3761a = list;
            this.f3762b = i;
            this.f3763c = i2;
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List, java.util.Collection
        public final boolean add(Object obj) {
            int i = this.f3763c;
            this.f3763c = i + 1;
            this.f3761a.add(i, obj);
            return true;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List
        public final boolean addAll(int i, Collection elements) {
            Intrinsics.m18599g(elements, "elements");
            this.f3761a.addAll(i + this.f3762b, elements);
            this.f3763c = elements.size() + this.f3763c;
            return elements.size() > 0;
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List, java.util.Collection
        public final void clear() {
            int i = this.f3763c - 1;
            int i2 = this.f3762b;
            if (i2 <= i) {
                while (true) {
                    this.f3761a.remove(i);
                    if (i == i2) {
                        break;
                    } else {
                        i--;
                    }
                }
            }
            this.f3763c = i2;
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List, java.util.Collection
        public final boolean contains(Object obj) {
            int i = this.f3763c;
            for (int i2 = this.f3762b; i2 < i; i2++) {
                if (Intrinsics.m18594b(this.f3761a.get(i2), obj)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean containsAll(Collection elements) {
            Intrinsics.m18599g(elements, "elements");
            Iterator<T> it = elements.iterator();
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
            ObjectListKt.m2102a(i, this);
            return this.f3761a.get(i + this.f3762b);
        }

        /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List
        public final int indexOf(Object obj) {
            int i = this.f3763c;
            int i2 = this.f3762b;
            for (int i3 = i2; i3 < i; i3++) {
                if (Intrinsics.m18594b(this.f3761a.get(i3), obj)) {
                    return i3 - i2;
                }
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean isEmpty() {
            return this.f3763c == this.f3762b;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public final Iterator iterator() {
            return new MutableObjectListIterator(this, 0);
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List
        public final int lastIndexOf(Object obj) {
            int i = this.f3763c - 1;
            int i2 = this.f3762b;
            if (i2 > i) {
                return -1;
            }
            while (!Intrinsics.m18594b(this.f3761a.get(i), obj)) {
                if (i == i2) {
                    return -1;
                }
                i--;
            }
            return i - i2;
        }

        @Override // java.util.List
        public final ListIterator listIterator() {
            return new MutableObjectListIterator(this, 0);
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List, java.util.Collection
        public final boolean remove(Object obj) {
            int i = this.f3763c;
            for (int i2 = this.f3762b; i2 < i; i2++) {
                ?? r2 = this.f3761a;
                if (Intrinsics.m18594b(r2.get(i2), obj)) {
                    r2.remove(i2);
                    this.f3763c--;
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean removeAll(Collection elements) {
            Intrinsics.m18599g(elements, "elements");
            int i = this.f3763c;
            Iterator<T> it = elements.iterator();
            while (it.hasNext()) {
                remove(it.next());
            }
            return i != this.f3763c;
        }

        /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List, java.util.Collection
        public final boolean retainAll(Collection elements) {
            Intrinsics.m18599g(elements, "elements");
            int i = this.f3763c;
            int i2 = i - 1;
            int i3 = this.f3762b;
            if (i3 <= i2) {
                while (true) {
                    ?? r3 = this.f3761a;
                    if (!elements.contains(r3.get(i2))) {
                        r3.remove(i2);
                        this.f3763c--;
                    }
                    if (i2 == i3) {
                        break;
                    }
                    i2--;
                }
            }
            return i != this.f3763c;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List
        public final Object set(int i, Object obj) {
            ObjectListKt.m2102a(i, this);
            return this.f3761a.set(i + this.f3762b, obj);
        }

        @Override // java.util.List, java.util.Collection
        public final int size() {
            return this.f3763c - this.f3762b;
        }

        @Override // java.util.List
        public final List subList(int i, int i2) {
            ObjectListKt.m2103b(this, i, i2);
            return new SubList(this, i, i2);
        }

        @Override // java.util.List, java.util.Collection
        public final Object[] toArray() {
            return CollectionToArray.m18590a(this);
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List
        public final void add(int i, Object obj) {
            this.f3761a.add(i + this.f3762b, obj);
            this.f3763c++;
        }

        @Override // java.util.List
        public final ListIterator listIterator(int i) {
            return new MutableObjectListIterator(this, i);
        }

        @Override // java.util.List, java.util.Collection
        public final Object[] toArray(Object[] array) {
            Intrinsics.m18599g(array, "array");
            return CollectionToArray.m18591b(this, array);
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List, java.util.Collection
        public final boolean addAll(Collection elements) {
            Intrinsics.m18599g(elements, "elements");
            this.f3761a.addAll(this.f3763c, elements);
            this.f3763c = elements.size() + this.f3763c;
            return elements.size() > 0;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List
        public final Object remove(int i) {
            ObjectListKt.m2102a(i, this);
            this.f3763c--;
            return this.f3761a.remove(i + this.f3762b);
        }
    }

    public MutableObjectList(int i) {
        this.f3818a = i == 0 ? ObjectListKt.f3821a : new Object[i];
    }

    /* JADX INFO: renamed from: g */
    public final void m2058g(Object obj) {
        int i = this.f3819b + 1;
        Object[] objArr = this.f3818a;
        if (objArr.length < i) {
            m2065n(i, objArr);
        }
        Object[] objArr2 = this.f3818a;
        int i2 = this.f3819b;
        objArr2[i2] = obj;
        this.f3819b = i2 + 1;
    }

    /* JADX INFO: renamed from: h */
    public final void m2059h(List elements) {
        Intrinsics.m18599g(elements, "elements");
        if (elements.isEmpty()) {
            return;
        }
        int i = this.f3819b;
        int size = elements.size() + i;
        Object[] objArr = this.f3818a;
        if (objArr.length < size) {
            m2065n(size, objArr);
        }
        Object[] objArr2 = this.f3818a;
        int size2 = elements.size();
        for (int i2 = 0; i2 < size2; i2++) {
            objArr2[i2 + i] = elements.get(i2);
        }
        this.f3819b = elements.size() + this.f3819b;
    }

    /* JADX INFO: renamed from: i */
    public final List m2060i() {
        ObjectListMutableList objectListMutableList = this.f3757c;
        if (objectListMutableList != null) {
            return objectListMutableList;
        }
        ObjectListMutableList objectListMutableList2 = new ObjectListMutableList(this);
        this.f3757c = objectListMutableList2;
        return objectListMutableList2;
    }

    /* JADX INFO: renamed from: j */
    public final void m2061j() {
        ArraysKt.m18388w(this.f3818a, null, 0, this.f3819b);
        this.f3819b = 0;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m2062k(Object obj) {
        int iM2098c = m2098c(obj);
        if (iM2098c < 0) {
            return false;
        }
        m2063l(iM2098c);
        return true;
    }

    /* JADX INFO: renamed from: l */
    public final Object m2063l(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.f3819b)) {
            m2101f(i);
            throw null;
        }
        Object[] objArr = this.f3818a;
        Object obj = objArr[i];
        if (i != i2 - 1) {
            ArraysKt.m18383r(objArr, i, objArr, i + 1, i2);
        }
        int i3 = this.f3819b - 1;
        this.f3819b = i3;
        objArr[i3] = null;
        return obj;
    }

    /* JADX INFO: renamed from: m */
    public final void m2064m(int i, int i2) {
        int i3;
        if (i < 0 || i > (i3 = this.f3819b) || i2 < 0 || i2 > i3) {
            StringBuilder sbM24u = AbstractC0000a.m24u("Start (", ") and end (", ") must be in 0..", i, i2);
            sbM24u.append(this.f3819b);
            RuntimeHelpersKt.m2144b(sbM24u.toString());
            throw null;
        }
        if (i2 < i) {
            RuntimeHelpersKt.m2143a("Start (" + i + ") is more than end (" + i2 + ')');
            throw null;
        }
        if (i2 != i) {
            if (i2 < i3) {
                Object[] objArr = this.f3818a;
                ArraysKt.m18383r(objArr, i, objArr, i2, i3);
            }
            int i4 = this.f3819b;
            int i5 = i4 - (i2 - i);
            ArraysKt.m18388w(this.f3818a, null, i5, i4);
            this.f3819b = i5;
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m2065n(int i, Object[] oldContent) {
        Intrinsics.m18599g(oldContent, "oldContent");
        int length = oldContent.length;
        Object[] objArr = new Object[Math.max(i, (length * 3) / 2)];
        ArraysKt.m18383r(oldContent, 0, objArr, 0, length);
        this.f3818a = objArr;
    }

    public /* synthetic */ MutableObjectList() {
        this(16);
    }
}
