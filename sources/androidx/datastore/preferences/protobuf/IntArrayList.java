package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.Internal;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class IntArrayList extends AbstractProtobufList<Integer> implements Internal.IntList, RandomAccess, PrimitiveNonBoxingCollection {

    /* JADX INFO: renamed from: b */
    public int[] f24001b;

    /* JADX INFO: renamed from: c */
    public int f24002c;

    static {
        new IntArrayList(new int[0], 0).f23839a = false;
    }

    public IntArrayList(int[] iArr, int i) {
        this.f24001b = iArr;
        this.f24002c = i;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        int iIntValue = ((Integer) obj).intValue();
        m8301a();
        if (i < 0 || i > (i2 = this.f24002c)) {
            StringBuilder sbM20q = AbstractC0000a.m20q(i, "Index:", ", Size:");
            sbM20q.append(this.f24002c);
            throw new IndexOutOfBoundsException(sbM20q.toString());
        }
        int[] iArr = this.f24001b;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[AbstractC1610a.m8724b(i2, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f24001b, i, iArr2, i + 1, this.f24002c - i);
            this.f24001b = iArr2;
        }
        this.f24001b[i] = iIntValue;
        this.f24002c++;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m8301a();
        Charset charset = Internal.f24003a;
        collection.getClass();
        if (!(collection instanceof IntArrayList)) {
            return super.addAll(collection);
        }
        IntArrayList intArrayList = (IntArrayList) collection;
        int i = intArrayList.f24002c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f24002c;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        int[] iArr = this.f24001b;
        if (i3 > iArr.length) {
            this.f24001b = Arrays.copyOf(iArr, i3);
        }
        System.arraycopy(intArrayList.f24001b, 0, this.f24001b, this.f24002c, intArrayList.f24002c);
        this.f24002c = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void addInt(int i) {
        m8301a();
        int i2 = this.f24002c;
        int[] iArr = this.f24001b;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[AbstractC1610a.m8724b(i2, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f24001b = iArr2;
        }
        int[] iArr3 = this.f24001b;
        int i3 = this.f24002c;
        this.f24002c = i3 + 1;
        iArr3[i3] = i;
    }

    /* JADX INFO: renamed from: c */
    public final void m8514c(int i) {
        if (i < 0 || i >= this.f24002c) {
            StringBuilder sbM20q = AbstractC0000a.m20q(i, "Index:", ", Size:");
            sbM20q.append(this.f24002c);
            throw new IndexOutOfBoundsException(sbM20q.toString());
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IntArrayList)) {
            return super.equals(obj);
        }
        IntArrayList intArrayList = (IntArrayList) obj;
        if (this.f24002c != intArrayList.f24002c) {
            return false;
        }
        int[] iArr = intArrayList.f24001b;
        for (int i = 0; i < this.f24002c; i++) {
            if (this.f24001b[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return Integer.valueOf(getInt(i));
    }

    public final int getInt(int i) {
        m8514c(i);
        return this.f24001b[i];
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f24002c; i2++) {
            i = (i * 31) + this.f24001b[i2];
        }
        return i;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList
    public final Internal.ProtobufList mutableCopyWithCapacity(int i) {
        if (i >= this.f24002c) {
            return new IntArrayList(Arrays.copyOf(this.f24001b, i), this.f24002c);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        m8301a();
        for (int i = 0; i < this.f24002c; i++) {
            if (obj.equals(Integer.valueOf(this.f24001b[i]))) {
                int[] iArr = this.f24001b;
                System.arraycopy(iArr, i + 1, iArr, i, (this.f24002c - i) - 1);
                this.f24002c--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m8301a();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f24001b;
        System.arraycopy(iArr, i2, iArr, i, this.f24002c - i2);
        this.f24002c -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        m8301a();
        m8514c(i);
        int[] iArr = this.f24001b;
        int i2 = iArr[i];
        iArr[i] = iIntValue;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f24002c;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m8301a();
        m8514c(i);
        int[] iArr = this.f24001b;
        int i2 = iArr[i];
        if (i < this.f24002c - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (r2 - i) - 1);
        }
        this.f24002c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i2);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addInt(((Integer) obj).intValue());
        return true;
    }
}
