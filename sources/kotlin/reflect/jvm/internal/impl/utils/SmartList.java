package kotlin.reflect.jvm.internal.impl.utils;

import androidx.datastore.preferences.protobuf.AbstractC1610a;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class SmartList<E> extends AbstractList<E> implements RandomAccess {

    /* JADX INFO: renamed from: a */
    public int f55096a;

    /* JADX INFO: renamed from: b */
    public Object f55097b;

    /* JADX INFO: compiled from: Proguard */
    public static class EmptyIterator<T> implements Iterator<T> {

        /* JADX INFO: renamed from: a */
        public static final EmptyIterator f55098a = new EmptyIterator();

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
            throw new IllegalStateException();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public class SingletonIterator extends SingletonIteratorBase<E> {

        /* JADX INFO: renamed from: b */
        public final int f55099b;

        public SingletonIterator() {
            this.f55099b = SmartList.m20346c(SmartList.this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.SmartList.SingletonIteratorBase
        /* JADX INFO: renamed from: a */
        public final void mo20349a() {
            SmartList smartList = SmartList.this;
            int iM20347d = SmartList.m20347d(smartList);
            int i = this.f55099b;
            if (iM20347d == i) {
                return;
            }
            throw new ConcurrentModificationException("ModCount: " + SmartList.m20348e(smartList) + "; expected: " + i);
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.SmartList.SingletonIteratorBase
        /* JADX INFO: renamed from: b */
        public final Object mo20350b() {
            return SmartList.this.f55097b;
        }

        @Override // java.util.Iterator
        public final void remove() {
            mo20349a();
            SmartList.this.clear();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static abstract class SingletonIteratorBase<T> implements Iterator<T> {

        /* JADX INFO: renamed from: a */
        public boolean f55101a;

        /* JADX INFO: renamed from: a */
        public abstract void mo20349a();

        /* JADX INFO: renamed from: b */
        public abstract Object mo20350b();

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return !this.f55101a;
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (this.f55101a) {
                throw new NoSuchElementException();
            }
            this.f55101a = true;
            mo20349a();
            return mo20350b();
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m20345a(int i) {
        String str = (i == 2 || i == 3 || i == 5 || i == 6 || i == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 2 || i == 3 || i == 5 || i == 6 || i == 7) ? 2 : 3];
        switch (i) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
                break;
            case 4:
                objArr[0] = "a";
                break;
            default:
                objArr[0] = "elements";
                break;
        }
        if (i == 2 || i == 3) {
            objArr[1] = "iterator";
        } else if (i == 5 || i == 6 || i == 7) {
            objArr[1] = "toArray";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
        }
        switch (i) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                break;
            case 4:
                objArr[2] = "toArray";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 2 && i != 3 && i != 5 && i != 6 && i != 7) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ int m20346c(SmartList smartList) {
        return ((AbstractList) smartList).modCount;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ int m20347d(SmartList smartList) {
        return ((AbstractList) smartList).modCount;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ int m20348e(SmartList smartList) {
        return ((AbstractList) smartList).modCount;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        int i = this.f55096a;
        if (i == 0) {
            this.f55097b = obj;
        } else if (i == 1) {
            this.f55097b = new Object[]{this.f55097b, obj};
        } else {
            Object[] objArr = (Object[]) this.f55097b;
            int length = objArr.length;
            if (i >= length) {
                int iM8724b = AbstractC1610a.m8724b(length, 3, 2, 1);
                int i2 = i + 1;
                if (iM8724b < i2) {
                    iM8724b = i2;
                }
                Object[] objArr2 = new Object[iM8724b];
                this.f55097b = objArr2;
                System.arraycopy(objArr, 0, objArr2, 0, length);
                objArr = objArr2;
            }
            objArr[this.f55096a] = obj;
        }
        this.f55096a++;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f55097b = null;
        this.f55096a = 0;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int i2;
        if (i >= 0 && i < (i2 = this.f55096a)) {
            return i2 == 1 ? this.f55097b : ((Object[]) this.f55097b)[i];
        }
        StringBuilder sbM20q = AbstractC0000a.m20q(i, "Index: ", ", Size: ");
        sbM20q.append(this.f55096a);
        throw new IndexOutOfBoundsException(sbM20q.toString());
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        int i = this.f55096a;
        if (i == 0) {
            return EmptyIterator.f55098a;
        }
        if (i == 1) {
            return new SingletonIterator();
        }
        Iterator<E> it = super.iterator();
        if (it != null) {
            return it;
        }
        m20345a(3);
        throw null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        int i2;
        Object obj;
        if (i < 0 || i >= (i2 = this.f55096a)) {
            StringBuilder sbM20q = AbstractC0000a.m20q(i, "Index: ", ", Size: ");
            sbM20q.append(this.f55096a);
            throw new IndexOutOfBoundsException(sbM20q.toString());
        }
        if (i2 == 1) {
            obj = this.f55097b;
            this.f55097b = null;
        } else {
            Object[] objArr = (Object[]) this.f55097b;
            Object obj2 = objArr[i];
            if (i2 == 2) {
                this.f55097b = objArr[1 - i];
            } else {
                int i3 = (i2 - i) - 1;
                if (i3 > 0) {
                    System.arraycopy(objArr, i + 1, objArr, i, i3);
                }
                objArr[this.f55096a - 1] = null;
            }
            obj = obj2;
        }
        this.f55096a--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int i2;
        if (i < 0 || i >= (i2 = this.f55096a)) {
            StringBuilder sbM20q = AbstractC0000a.m20q(i, "Index: ", ", Size: ");
            sbM20q.append(this.f55096a);
            throw new IndexOutOfBoundsException(sbM20q.toString());
        }
        if (i2 == 1) {
            Object obj2 = this.f55097b;
            this.f55097b = obj;
            return obj2;
        }
        Object[] objArr = (Object[]) this.f55097b;
        Object obj3 = objArr[i];
        objArr[i] = obj;
        return obj3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f55096a;
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        int i = this.f55096a;
        if (i >= 2) {
            Arrays.sort((Object[]) this.f55097b, 0, i, comparator);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        if (objArr == null) {
            m20345a(4);
            throw null;
        }
        int length = objArr.length;
        int i = this.f55096a;
        if (i == 1) {
            if (length == 0) {
                Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), 1);
                objArr2[0] = this.f55097b;
                return objArr2;
            }
            objArr[0] = this.f55097b;
        } else {
            if (length < i) {
                Object[] objArrCopyOf = Arrays.copyOf((Object[]) this.f55097b, i, objArr.getClass());
                if (objArrCopyOf != null) {
                    return objArrCopyOf;
                }
                m20345a(6);
                throw null;
            }
            if (i != 0) {
                System.arraycopy(this.f55097b, 0, objArr, 0, i);
            }
        }
        int i2 = this.f55096a;
        if (length > i2) {
            objArr[i2] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        if (i >= 0 && i <= (i2 = this.f55096a)) {
            if (i2 == 0) {
                this.f55097b = obj;
            } else if (i2 == 1 && i == 0) {
                this.f55097b = new Object[]{obj, this.f55097b};
            } else {
                Object[] objArr = new Object[i2 + 1];
                if (i2 == 1) {
                    objArr[0] = this.f55097b;
                } else {
                    Object[] objArr2 = (Object[]) this.f55097b;
                    System.arraycopy(objArr2, 0, objArr, 0, i);
                    System.arraycopy(objArr2, i, objArr, i + 1, this.f55096a - i);
                }
                objArr[i] = obj;
                this.f55097b = objArr;
            }
            this.f55096a++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder sbM20q = AbstractC0000a.m20q(i, "Index: ", ", Size: ");
        sbM20q.append(this.f55096a);
        throw new IndexOutOfBoundsException(sbM20q.toString());
    }
}
