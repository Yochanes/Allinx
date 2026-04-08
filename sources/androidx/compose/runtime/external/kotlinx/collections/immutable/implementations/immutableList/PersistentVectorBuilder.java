package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.ListImplementation;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.AbstractMutableList;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVectorBuilder;", "E", "Lkotlin/collections/AbstractMutableList;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList$Builder;", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class PersistentVectorBuilder<E> extends AbstractMutableList<E> implements PersistentList.Builder<E> {

    /* JADX INFO: renamed from: a */
    public PersistentList f16767a;

    /* JADX INFO: renamed from: b */
    public Object[] f16768b;

    /* JADX INFO: renamed from: c */
    public Object[] f16769c;

    /* JADX INFO: renamed from: d */
    public int f16770d;

    /* JADX INFO: renamed from: f */
    public MutabilityOwnership f16771f = new MutabilityOwnership();

    /* JADX INFO: renamed from: g */
    public Object[] f16772g;

    /* JADX INFO: renamed from: i */
    public Object[] f16773i;

    /* JADX INFO: renamed from: j */
    public int f16774j;

    /* JADX INFO: renamed from: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.PersistentVectorBuilder$removeAll$1 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m18302d2 = {"<anonymous>", "", "E", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
    final class C11821 extends Lambda implements Function1<Object, Boolean> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Collection f16775a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11821(Collection collection) {
            super(1);
            this.f16775a = collection;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return Boolean.valueOf(this.f16775a.contains(obj));
        }
    }

    public PersistentVectorBuilder(AbstractPersistentList abstractPersistentList, Object[] objArr, Object[] objArr2, int i) {
        this.f16767a = abstractPersistentList;
        this.f16768b = objArr;
        this.f16769c = objArr2;
        this.f16770d = i;
        this.f16772g = objArr;
        this.f16773i = objArr2;
        this.f16774j = abstractPersistentList.size();
    }

    /* JADX INFO: renamed from: g */
    public static void m4606g(Object[] objArr, int i, Iterator it) {
        while (i < 32 && it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
    }

    /* JADX INFO: renamed from: A */
    public final Object[] m4607A(Object[] objArr, int i, Object[][] objArr2) {
        Iterator itM18576a = ArrayIteratorKt.m18576a(objArr2);
        int i2 = i >> 5;
        int i3 = this.f16770d;
        Object[] objArrM4636y = i2 < (1 << i3) ? m4636y(objArr, i, i3, itM18576a) : m4629p(objArr);
        while (itM18576a.hasNext()) {
            this.f16770d += 5;
            objArrM4636y = m4632s(objArrM4636y);
            int i4 = this.f16770d;
            m4636y(objArrM4636y, 1 << i4, i4, itM18576a);
        }
        return objArrM4636y;
    }

    /* JADX INFO: renamed from: B */
    public final void m4608B(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.f16774j;
        int i2 = i >> 5;
        int i3 = this.f16770d;
        if (i2 > (1 << i3)) {
            this.f16772g = m4609C(m4632s(objArr), objArr2, this.f16770d + 5);
            this.f16773i = objArr3;
            this.f16770d += 5;
            this.f16774j++;
            return;
        }
        if (objArr == null) {
            this.f16772g = objArr2;
            this.f16773i = objArr3;
            this.f16774j = i + 1;
        } else {
            this.f16772g = m4609C(objArr, objArr2, i3);
            this.f16773i = objArr3;
            this.f16774j++;
        }
    }

    /* JADX INFO: renamed from: C */
    public final Object[] m4609C(Object[] objArr, Object[] objArr2, int i) {
        int iM4642a = UtilsKt.m4642a(getF51527b() - 1, i);
        Object[] objArrM4629p = m4629p(objArr);
        if (i == 5) {
            objArrM4629p[iM4642a] = objArr2;
            return objArrM4629p;
        }
        objArrM4629p[iM4642a] = m4609C((Object[]) objArrM4629p[iM4642a], objArr2, i - 5);
        return objArrM4629p;
    }

    /* JADX INFO: renamed from: D */
    public final int m4610D(Function1 function1, Object[] objArr, int i, int i2, ObjectRef objectRef, ArrayList arrayList, ArrayList arrayList2) {
        if (m4627n(objArr)) {
            arrayList.add(objArr);
        }
        Object obj = objectRef.f16762a;
        Intrinsics.m18597e(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr2 = (Object[]) obj;
        Object[] objArrM4631r = objArr2;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj2 = objArr[i3];
            if (!((Boolean) function1.invoke(obj2)).booleanValue()) {
                if (i2 == 32) {
                    objArrM4631r = !arrayList.isEmpty() ? (Object[]) arrayList.remove(arrayList.size() - 1) : m4631r();
                    i2 = 0;
                }
                objArrM4631r[i2] = obj2;
                i2++;
            }
        }
        objectRef.f16762a = objArrM4631r;
        if (objArr2 != objArrM4631r) {
            arrayList2.add(objArr2);
        }
        return i2;
    }

    /* JADX INFO: renamed from: E */
    public final int m4611E(Function1 function1, Object[] objArr, int i, ObjectRef objectRef) {
        Object[] objArrM4629p = objArr;
        int i2 = i;
        boolean z2 = false;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (((Boolean) function1.invoke(obj)).booleanValue()) {
                if (!z2) {
                    objArrM4629p = m4629p(objArr);
                    z2 = true;
                    i2 = i3;
                }
            } else if (z2) {
                objArrM4629p[i2] = obj;
                i2++;
            }
        }
        objectRef.f16762a = objArrM4629p;
        return i2;
    }

    /* JADX INFO: renamed from: F */
    public final int m4612F(Function1 function1, int i, ObjectRef objectRef) {
        int iM4611E = m4611E(function1, this.f16773i, i, objectRef);
        if (iM4611E == i) {
            return i;
        }
        Object obj = objectRef.f16762a;
        Intrinsics.m18597e(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) obj;
        Arrays.fill(objArr, iM4611E, i, (Object) null);
        this.f16773i = objArr;
        this.f16774j -= i - iM4611E;
        return iM4611E;
    }

    /* JADX INFO: renamed from: G */
    public final boolean m4613G(Function1 function1) {
        Object[] objArrM4636y;
        int i;
        Function1 function12 = function1;
        int iM4619O = m4619O();
        Object[] objArrM4633t = null;
        ObjectRef objectRef = new ObjectRef(null);
        boolean z2 = false;
        if (this.f16772g != null) {
            AbstractListIterator abstractListIteratorM4628o = m4628o(0);
            int iM4611E = 32;
            while (iM4611E == 32 && abstractListIteratorM4628o.hasNext()) {
                iM4611E = m4611E(function12, (Object[]) abstractListIteratorM4628o.next(), 32, objectRef);
            }
            if (iM4611E == 32) {
                abstractListIteratorM4628o.hasNext();
                int iM4612F = m4612F(function12, iM4619O, objectRef);
                if (iM4612F == 0) {
                    m4635w(this.f16774j, this.f16770d, this.f16772g);
                }
                if (iM4612F != iM4619O) {
                }
            } else {
                int iPreviousIndex = abstractListIteratorM4628o.previousIndex() << 5;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int iM4610D = iM4611E;
                while (abstractListIteratorM4628o.hasNext()) {
                    iM4610D = m4610D(function12, (Object[]) abstractListIteratorM4628o.next(), 32, iM4610D, objectRef, arrayList2, arrayList);
                    function12 = function1;
                }
                int iM4610D2 = m4610D(function1, this.f16773i, iM4619O, iM4610D, objectRef, arrayList2, arrayList);
                Object obj = objectRef.f16762a;
                Intrinsics.m18597e(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                Object[] objArr = (Object[]) obj;
                Arrays.fill(objArr, iM4610D2, 32, (Object) null);
                if (arrayList.isEmpty()) {
                    objArrM4636y = this.f16772g;
                    Intrinsics.m18596d(objArrM4636y);
                } else {
                    objArrM4636y = m4636y(this.f16772g, iPreviousIndex, this.f16770d, arrayList.iterator());
                }
                int size = iPreviousIndex + (arrayList.size() << 5);
                if ((size & 31) != 0) {
                    PreconditionsKt.m4402a("invalid size");
                }
                if (size == 0) {
                    this.f16770d = 0;
                } else {
                    int i2 = size - 1;
                    while (true) {
                        i = this.f16770d;
                        if ((i2 >> i) != 0) {
                            break;
                        }
                        this.f16770d = i - 5;
                        Object[] objArr2 = objArrM4636y[0];
                        Intrinsics.m18597e(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                        objArrM4636y = objArr2;
                    }
                    objArrM4633t = m4633t(i2, i, objArrM4636y);
                }
                this.f16772g = objArrM4633t;
                this.f16773i = objArr;
                this.f16774j = size + iM4610D2;
            }
            z2 = true;
        } else if (m4612F(function12, iM4619O, objectRef) != iM4619O) {
            z2 = true;
        }
        if (z2) {
            ((AbstractList) this).modCount++;
        }
        return z2;
    }

    /* JADX INFO: renamed from: I */
    public final Object[] m4614I(Object[] objArr, int i, int i2, ObjectRef objectRef) {
        int iM4642a = UtilsKt.m4642a(i2, i);
        if (i == 0) {
            Object obj = objArr[iM4642a];
            Object[] objArrM4629p = m4629p(objArr);
            ArraysKt.m18383r(objArr, iM4642a, objArrM4629p, iM4642a + 1, 32);
            objArrM4629p[31] = objectRef.f16762a;
            objectRef.f16762a = obj;
            return objArrM4629p;
        }
        int iM4642a2 = objArr[31] == null ? UtilsKt.m4642a(m4616K() - 1, i) : 31;
        Object[] objArrM4629p2 = m4629p(objArr);
        int i3 = i - 5;
        int i4 = iM4642a + 1;
        if (i4 <= iM4642a2) {
            while (true) {
                Object obj2 = objArrM4629p2[iM4642a2];
                Intrinsics.m18597e(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArrM4629p2[iM4642a2] = m4614I((Object[]) obj2, i3, 0, objectRef);
                if (iM4642a2 == i4) {
                    break;
                }
                iM4642a2--;
            }
        }
        Object obj3 = objArrM4629p2[iM4642a];
        Intrinsics.m18597e(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrM4629p2[iM4642a] = m4614I((Object[]) obj3, i3, i2, objectRef);
        return objArrM4629p2;
    }

    /* JADX INFO: renamed from: J */
    public final Object m4615J(Object[] objArr, int i, int i2, int i3) {
        int i4 = this.f16774j - i;
        if (i4 == 1) {
            Object obj = this.f16773i[0];
            m4635w(i, i2, objArr);
            return obj;
        }
        Object[] objArr2 = this.f16773i;
        Object obj2 = objArr2[i3];
        Object[] objArrM4629p = m4629p(objArr2);
        ArraysKt.m18383r(objArr2, i3, objArrM4629p, i3 + 1, i4);
        objArrM4629p[i4 - 1] = null;
        this.f16772g = objArr;
        this.f16773i = objArrM4629p;
        this.f16774j = (i + i4) - 1;
        this.f16770d = i2;
        return obj2;
    }

    /* JADX INFO: renamed from: K */
    public final int m4616K() {
        int i = this.f16774j;
        if (i <= 32) {
            return 0;
        }
        return (i - 1) & (-32);
    }

    /* JADX INFO: renamed from: M */
    public final Object[] m4617M(Object[] objArr, int i, int i2, Object obj, ObjectRef objectRef) {
        int iM4642a = UtilsKt.m4642a(i2, i);
        Object[] objArrM4629p = m4629p(objArr);
        if (i != 0) {
            Object obj2 = objArrM4629p[iM4642a];
            Intrinsics.m18597e(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrM4629p[iM4642a] = m4617M((Object[]) obj2, i - 5, i2, obj, objectRef);
            return objArrM4629p;
        }
        if (objArrM4629p != objArr) {
            ((AbstractList) this).modCount++;
        }
        objectRef.f16762a = objArrM4629p[iM4642a];
        objArrM4629p[iM4642a] = obj;
        return objArrM4629p;
    }

    /* JADX INFO: renamed from: N */
    public final void m4618N(Collection collection, int i, Object[] objArr, int i2, Object[][] objArr2, int i3, Object[] objArr3) {
        Object[] objArrM4631r;
        if (i3 < 1) {
            PreconditionsKt.m4402a("requires at least one nullBuffer");
        }
        Object[] objArrM4629p = m4629p(objArr);
        objArr2[0] = objArrM4629p;
        int i4 = i & 31;
        int size = ((collection.size() + i) - 1) & 31;
        int i5 = (i2 - i4) + size;
        if (i5 < 32) {
            ArraysKt.m18383r(objArrM4629p, size + 1, objArr3, i4, i2);
        } else {
            int i6 = i5 - 31;
            if (i3 == 1) {
                objArrM4631r = objArrM4629p;
            } else {
                objArrM4631r = m4631r();
                i3--;
                objArr2[i3] = objArrM4631r;
            }
            int i7 = i2 - i6;
            ArraysKt.m18383r(objArrM4629p, 0, objArr3, i7, i2);
            ArraysKt.m18383r(objArrM4629p, size + 1, objArrM4631r, i4, i7);
            objArr3 = objArrM4631r;
        }
        Iterator<E> it = collection.iterator();
        m4606g(objArrM4629p, i4, it);
        for (int i8 = 1; i8 < i3; i8++) {
            Object[] objArrM4631r2 = m4631r();
            m4606g(objArrM4631r2, 0, it);
            objArr2[i8] = objArrM4631r2;
        }
        m4606g(objArr3, 0, it);
    }

    /* JADX INFO: renamed from: O */
    public final int m4619O() {
        int i = this.f16774j;
        return i <= 32 ? i : i - ((i - 1) & (-32));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        ListImplementation.m4722b(i, getF51527b());
        if (i == getF51527b()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int iM4616K = m4616K();
        if (i >= iM4616K) {
            m4626m(obj, this.f16772g, i - iM4616K);
            return;
        }
        ObjectRef objectRef = new ObjectRef(null);
        Object[] objArr = this.f16772g;
        Intrinsics.m18596d(objArr);
        m4626m(objectRef.f16762a, m4625l(objArr, this.f16770d, i, obj, objectRef), 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        Collection collection2;
        PersistentVectorBuilder<E> persistentVectorBuilder;
        Object[] objArrM4631r;
        ListImplementation.m4722b(i, this.f16774j);
        if (i == this.f16774j) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i2 = (i >> 5) << 5;
        int size = ((collection.size() + (this.f16774j - i2)) - 1) / 32;
        if (size == 0) {
            int i3 = i & 31;
            int size2 = ((collection.size() + i) - 1) & 31;
            Object[] objArr = this.f16773i;
            Object[] objArrM4629p = m4629p(objArr);
            ArraysKt.m18383r(objArr, size2 + 1, objArrM4629p, i3, m4619O());
            m4606g(objArrM4629p, i3, collection.iterator());
            this.f16773i = objArrM4629p;
            this.f16774j = collection.size() + this.f16774j;
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int iM4619O = m4619O();
        int size3 = collection.size() + this.f16774j;
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i >= m4616K()) {
            objArrM4631r = m4631r();
            collection2 = collection;
            m4618N(collection2, i, this.f16773i, iM4619O, objArr2, size, objArrM4631r);
            persistentVectorBuilder = this;
            objArr2 = objArr2;
        } else {
            collection2 = collection;
            persistentVectorBuilder = this;
            if (size3 > iM4619O) {
                int i4 = size3 - iM4619O;
                Object[] objArrM4630q = m4630q(i4, persistentVectorBuilder.f16773i);
                persistentVectorBuilder.m4624k(collection2, i, i4, objArr2, size, objArrM4630q);
                objArr2 = objArr2;
                objArrM4631r = objArrM4630q;
            } else {
                Object[] objArr3 = persistentVectorBuilder.f16773i;
                objArrM4631r = m4631r();
                int i5 = iM4619O - size3;
                ArraysKt.m18383r(objArr3, 0, objArrM4631r, i5, iM4619O);
                int i6 = 32 - i5;
                Object[] objArrM4630q2 = m4630q(i6, persistentVectorBuilder.f16773i);
                int i7 = size - 1;
                objArr2[i7] = objArrM4630q2;
                persistentVectorBuilder.m4624k(collection2, i, i6, objArr2, i7, objArrM4630q2);
                collection2 = collection2;
            }
        }
        persistentVectorBuilder.f16772g = m4607A(persistentVectorBuilder.f16772g, i2, objArr2);
        persistentVectorBuilder.f16773i = objArrM4631r;
        persistentVectorBuilder.f16774j = collection2.size() + persistentVectorBuilder.f16774j;
        return true;
    }

    @Override // kotlin.collections.AbstractMutableList
    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getF51527b() {
        return this.f16774j;
    }

    @Override // kotlin.collections.AbstractMutableList
    /* JADX INFO: renamed from: e */
    public final Object mo4621e(int i) {
        ListImplementation.m4721a(i, getF51527b());
        ((AbstractList) this).modCount++;
        int iM4616K = m4616K();
        if (i >= iM4616K) {
            return m4615J(this.f16772g, iM4616K, this.f16770d, i - iM4616K);
        }
        ObjectRef objectRef = new ObjectRef(this.f16773i[0]);
        Object[] objArr = this.f16772g;
        Intrinsics.m18596d(objArr);
        m4615J(m4614I(objArr, this.f16770d, i, objectRef), iM4616K, this.f16770d, 0);
        return objectRef.f16762a;
    }

    /* JADX INFO: renamed from: f */
    public final PersistentList m4622f() {
        PersistentList persistentVector;
        Object[] objArr = this.f16772g;
        if (objArr == this.f16768b && this.f16773i == this.f16769c) {
            persistentVector = this.f16767a;
        } else {
            this.f16771f = new MutabilityOwnership();
            this.f16768b = objArr;
            Object[] objArr2 = this.f16773i;
            this.f16769c = objArr2;
            if (objArr != null) {
                persistentVector = new PersistentVector(objArr, this.f16774j, this.f16770d, objArr2);
            } else if (objArr2.length == 0) {
                persistentVector = SmallPersistentVector.f16783b;
            } else {
                Object[] objArrCopyOf = Arrays.copyOf(objArr2, this.f16774j);
                Intrinsics.m18598f(objArrCopyOf, "copyOf(...)");
                persistentVector = new SmallPersistentVector(objArrCopyOf);
            }
        }
        this.f16767a = persistentVector;
        return persistentVector;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        Object[] objArr;
        ListImplementation.m4721a(i, getF51527b());
        if (m4616K() <= i) {
            objArr = this.f16773i;
        } else {
            objArr = this.f16772g;
            Intrinsics.m18596d(objArr);
            for (int i2 = this.f16770d; i2 > 0; i2 -= 5) {
                Object obj = objArr[UtilsKt.m4642a(i, i2)];
                Intrinsics.m18597e(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArr = (Object[]) obj;
            }
        }
        return objArr[i & 31];
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    /* JADX INFO: renamed from: j */
    public final int m4623j() {
        return ((AbstractList) this).modCount;
    }

    /* JADX INFO: renamed from: k */
    public final void m4624k(Collection collection, int i, int i2, Object[][] objArr, int i3, Object[] objArr2) {
        if (this.f16772g == null) {
            throw new IllegalStateException("root is null");
        }
        int i4 = i >> 5;
        AbstractListIterator abstractListIteratorM4628o = m4628o(m4616K() >> 5);
        int i5 = i3;
        Object[] objArrM4630q = objArr2;
        while (abstractListIteratorM4628o.previousIndex() != i4) {
            Object[] objArr3 = (Object[]) abstractListIteratorM4628o.previous();
            ArraysKt.m18383r(objArr3, 0, objArrM4630q, 32 - i2, 32);
            objArrM4630q = m4630q(i2, objArr3);
            i5--;
            objArr[i5] = objArrM4630q;
        }
        Object[] objArr4 = (Object[]) abstractListIteratorM4628o.previous();
        int iM4616K = i3 - (((m4616K() >> 5) - 1) - i4);
        if (iM4616K < i3) {
            objArr2 = objArr[iM4616K];
            Intrinsics.m18596d(objArr2);
        }
        m4618N(collection, i, objArr4, 32, objArr, iM4616K, objArr2);
    }

    /* JADX INFO: renamed from: l */
    public final Object[] m4625l(Object[] objArr, int i, int i2, Object obj, ObjectRef objectRef) {
        Object obj2;
        int iM4642a = UtilsKt.m4642a(i2, i);
        if (i == 0) {
            objectRef.f16762a = objArr[31];
            Object[] objArrM4629p = m4629p(objArr);
            ArraysKt.m18383r(objArr, iM4642a + 1, objArrM4629p, iM4642a, 31);
            objArrM4629p[iM4642a] = obj;
            return objArrM4629p;
        }
        Object[] objArrM4629p2 = m4629p(objArr);
        int i3 = i - 5;
        Object obj3 = objArrM4629p2[iM4642a];
        Intrinsics.m18597e(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrM4629p2[iM4642a] = m4625l((Object[]) obj3, i3, i2, obj, objectRef);
        while (true) {
            iM4642a++;
            if (iM4642a >= 32 || (obj2 = objArrM4629p2[iM4642a]) == null) {
                break;
            }
            objArrM4629p2[iM4642a] = m4625l((Object[]) obj2, i3, 0, objectRef.f16762a, objectRef);
        }
        return objArrM4629p2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        ListImplementation.m4722b(i, this.f16774j);
        return new PersistentVectorMutableIterator(this, i);
    }

    /* JADX INFO: renamed from: m */
    public final void m4626m(Object obj, Object[] objArr, int i) {
        int iM4619O = m4619O();
        Object[] objArrM4629p = m4629p(this.f16773i);
        if (iM4619O < 32) {
            ArraysKt.m18383r(this.f16773i, i + 1, objArrM4629p, i, iM4619O);
            objArrM4629p[i] = obj;
            this.f16772g = objArr;
            this.f16773i = objArrM4629p;
            this.f16774j++;
            return;
        }
        Object[] objArr2 = this.f16773i;
        Object obj2 = objArr2[31];
        ArraysKt.m18383r(objArr2, i + 1, objArrM4629p, i, 31);
        objArrM4629p[i] = obj;
        m4608B(objArr, objArrM4629p, m4632s(obj2));
    }

    /* JADX INFO: renamed from: n */
    public final boolean m4627n(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.f16771f;
    }

    /* JADX INFO: renamed from: o */
    public final AbstractListIterator m4628o(int i) {
        Object[] objArr = this.f16772g;
        if (objArr == null) {
            throw new IllegalStateException("Invalid root");
        }
        int iM4616K = m4616K() >> 5;
        ListImplementation.m4722b(i, iM4616K);
        int i2 = this.f16770d;
        return i2 == 0 ? new SingleElementListIterator(objArr, i) : new TrieIterator(objArr, i, iM4616K, i2 / 5);
    }

    /* JADX INFO: renamed from: p */
    public final Object[] m4629p(Object[] objArr) {
        if (objArr == null) {
            return m4631r();
        }
        if (m4627n(objArr)) {
            return objArr;
        }
        Object[] objArrM4631r = m4631r();
        int length = objArr.length;
        if (length > 32) {
            length = 32;
        }
        ArraysKt.m18385t(objArr, 0, objArrM4631r, length, 6);
        return objArrM4631r;
    }

    /* JADX INFO: renamed from: q */
    public final Object[] m4630q(int i, Object[] objArr) {
        if (m4627n(objArr)) {
            ArraysKt.m18383r(objArr, i, objArr, 0, 32 - i);
            return objArr;
        }
        Object[] objArrM4631r = m4631r();
        ArraysKt.m18383r(objArr, i, objArrM4631r, 0, 32 - i);
        return objArrM4631r;
    }

    /* JADX INFO: renamed from: r */
    public final Object[] m4631r() {
        Object[] objArr = new Object[33];
        objArr[32] = this.f16771f;
        return objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        return m4613G(new C11821(collection));
    }

    /* JADX INFO: renamed from: s */
    public final Object[] m4632s(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.f16771f;
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        ListImplementation.m4721a(i, getF51527b());
        if (m4616K() > i) {
            ObjectRef objectRef = new ObjectRef(null);
            Object[] objArr = this.f16772g;
            Intrinsics.m18596d(objArr);
            this.f16772g = m4617M(objArr, this.f16770d, i, obj, objectRef);
            return objectRef.f16762a;
        }
        Object[] objArrM4629p = m4629p(this.f16773i);
        if (objArrM4629p != this.f16773i) {
            ((AbstractList) this).modCount++;
        }
        int i2 = i & 31;
        Object obj2 = objArrM4629p[i2];
        objArrM4629p[i2] = obj;
        this.f16773i = objArrM4629p;
        return obj2;
    }

    /* JADX INFO: renamed from: t */
    public final Object[] m4633t(int i, int i2, Object[] objArr) {
        if (i2 < 0) {
            PreconditionsKt.m4402a("shift should be positive");
        }
        if (i2 == 0) {
            return objArr;
        }
        int iM4642a = UtilsKt.m4642a(i, i2);
        Object obj = objArr[iM4642a];
        Intrinsics.m18597e(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object objM4633t = m4633t(i, i2 - 5, (Object[]) obj);
        if (iM4642a < 31) {
            int i3 = iM4642a + 1;
            if (objArr[i3] != null) {
                if (m4627n(objArr)) {
                    Arrays.fill(objArr, i3, 32, (Object) null);
                }
                Object[] objArrM4631r = m4631r();
                ArraysKt.m18383r(objArr, 0, objArrM4631r, 0, i3);
                objArr = objArrM4631r;
            }
        }
        if (objM4633t == objArr[iM4642a]) {
            return objArr;
        }
        Object[] objArrM4629p = m4629p(objArr);
        objArrM4629p[iM4642a] = objM4633t;
        return objArrM4629p;
    }

    /* JADX INFO: renamed from: v */
    public final Object[] m4634v(Object[] objArr, int i, int i2, ObjectRef objectRef) {
        Object[] objArrM4634v;
        int iM4642a = UtilsKt.m4642a(i2 - 1, i);
        if (i == 5) {
            objectRef.f16762a = objArr[iM4642a];
            objArrM4634v = null;
        } else {
            Object obj = objArr[iM4642a];
            Intrinsics.m18597e(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrM4634v = m4634v((Object[]) obj, i - 5, i2, objectRef);
        }
        if (objArrM4634v == null && iM4642a == 0) {
            return null;
        }
        Object[] objArrM4629p = m4629p(objArr);
        objArrM4629p[iM4642a] = objArrM4634v;
        return objArrM4629p;
    }

    /* JADX INFO: renamed from: w */
    public final void m4635w(int i, int i2, Object[] objArr) {
        if (i2 == 0) {
            this.f16772g = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.f16773i = objArr;
            this.f16774j = i;
            this.f16770d = i2;
            return;
        }
        ObjectRef objectRef = new ObjectRef(null);
        Intrinsics.m18596d(objArr);
        Object[] objArrM4634v = m4634v(objArr, i2, i, objectRef);
        Intrinsics.m18596d(objArrM4634v);
        Object obj = objectRef.f16762a;
        Intrinsics.m18597e(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        this.f16773i = (Object[]) obj;
        this.f16774j = i;
        if (objArrM4634v[1] == null) {
            this.f16772g = (Object[]) objArrM4634v[0];
            this.f16770d = i2 - 5;
        } else {
            this.f16772g = objArrM4634v;
            this.f16770d = i2;
        }
    }

    /* JADX INFO: renamed from: y */
    public final Object[] m4636y(Object[] objArr, int i, int i2, Iterator it) {
        if (!it.hasNext()) {
            PreconditionsKt.m4402a("invalid buffersIterator");
        }
        if (!(i2 >= 0)) {
            PreconditionsKt.m4402a("negative shift");
        }
        if (i2 == 0) {
            return (Object[]) it.next();
        }
        Object[] objArrM4629p = m4629p(objArr);
        int iM4642a = UtilsKt.m4642a(i, i2);
        int i3 = i2 - 5;
        objArrM4629p[iM4642a] = m4636y((Object[]) objArrM4629p[iM4642a], i, i3, it);
        while (true) {
            iM4642a++;
            if (iM4642a >= 32 || !it.hasNext()) {
                break;
            }
            objArrM4629p[iM4642a] = m4636y((Object[]) objArrM4629p[iM4642a], 0, i3, it);
        }
        return objArrM4629p;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        int iM4619O = m4619O();
        if (iM4619O < 32) {
            Object[] objArrM4629p = m4629p(this.f16773i);
            objArrM4629p[iM4619O] = obj;
            this.f16773i = objArrM4629p;
            this.f16774j = getF51527b() + 1;
        } else {
            m4608B(this.f16772g, this.f16773i, m4632s(obj));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int iM4619O = m4619O();
        Iterator<E> it = collection.iterator();
        if (32 - iM4619O >= collection.size()) {
            Object[] objArrM4629p = m4629p(this.f16773i);
            m4606g(objArrM4629p, iM4619O, it);
            this.f16773i = objArrM4629p;
            this.f16774j = collection.size() + this.f16774j;
            return true;
        }
        int size = ((collection.size() + iM4619O) - 1) / 32;
        Object[][] objArr = new Object[size][];
        Object[] objArrM4629p2 = m4629p(this.f16773i);
        m4606g(objArrM4629p2, iM4619O, it);
        objArr[0] = objArrM4629p2;
        for (int i = 1; i < size; i++) {
            Object[] objArrM4631r = m4631r();
            m4606g(objArrM4631r, 0, it);
            objArr[i] = objArrM4631r;
        }
        this.f16772g = m4607A(this.f16772g, m4616K(), objArr);
        Object[] objArrM4631r2 = m4631r();
        m4606g(objArrM4631r2, 0, it);
        this.f16773i = objArrM4631r2;
        this.f16774j = collection.size() + this.f16774j;
        return true;
    }
}
