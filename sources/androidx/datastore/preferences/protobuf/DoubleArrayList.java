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
final class DoubleArrayList extends AbstractProtobufList<Double> implements Internal.DoubleList, RandomAccess, PrimitiveNonBoxingCollection {

    /* JADX INFO: renamed from: b */
    public double[] f23914b;

    /* JADX INFO: renamed from: c */
    public int f23915c;

    static {
        new DoubleArrayList(new double[0], 0).f23839a = false;
    }

    public DoubleArrayList(double[] dArr, int i) {
        this.f23914b = dArr;
        this.f23915c = i;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        double dDoubleValue = ((Double) obj).doubleValue();
        m8301a();
        if (i < 0 || i > (i2 = this.f23915c)) {
            StringBuilder sbM20q = AbstractC0000a.m20q(i, "Index:", ", Size:");
            sbM20q.append(this.f23915c);
            throw new IndexOutOfBoundsException(sbM20q.toString());
        }
        double[] dArr = this.f23914b;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[AbstractC1610a.m8724b(i2, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.f23914b, i, dArr2, i + 1, this.f23915c - i);
            this.f23914b = dArr2;
        }
        this.f23914b[i] = dDoubleValue;
        this.f23915c++;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m8301a();
        Charset charset = Internal.f24003a;
        collection.getClass();
        if (!(collection instanceof DoubleArrayList)) {
            return super.addAll(collection);
        }
        DoubleArrayList doubleArrayList = (DoubleArrayList) collection;
        int i = doubleArrayList.f23915c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f23915c;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        double[] dArr = this.f23914b;
        if (i3 > dArr.length) {
            this.f23914b = Arrays.copyOf(dArr, i3);
        }
        System.arraycopy(doubleArrayList.f23914b, 0, this.f23914b, this.f23915c, doubleArrayList.f23915c);
        this.f23915c = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void addDouble(double d) {
        m8301a();
        int i = this.f23915c;
        double[] dArr = this.f23914b;
        if (i == dArr.length) {
            double[] dArr2 = new double[AbstractC1610a.m8724b(i, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.f23914b = dArr2;
        }
        double[] dArr3 = this.f23914b;
        int i2 = this.f23915c;
        this.f23915c = i2 + 1;
        dArr3[i2] = d;
    }

    /* JADX INFO: renamed from: c */
    public final void m8477c(int i) {
        if (i < 0 || i >= this.f23915c) {
            StringBuilder sbM20q = AbstractC0000a.m20q(i, "Index:", ", Size:");
            sbM20q.append(this.f23915c);
            throw new IndexOutOfBoundsException(sbM20q.toString());
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DoubleArrayList)) {
            return super.equals(obj);
        }
        DoubleArrayList doubleArrayList = (DoubleArrayList) obj;
        if (this.f23915c != doubleArrayList.f23915c) {
            return false;
        }
        double[] dArr = doubleArrayList.f23914b;
        for (int i = 0; i < this.f23915c; i++) {
            if (Double.doubleToLongBits(this.f23914b[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m8477c(i);
        return Double.valueOf(this.f23914b[i]);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iM8516b = 1;
        for (int i = 0; i < this.f23915c; i++) {
            iM8516b = (iM8516b * 31) + Internal.m8516b(Double.doubleToLongBits(this.f23914b[i]));
        }
        return iM8516b;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList
    public final Internal.ProtobufList mutableCopyWithCapacity(int i) {
        if (i >= this.f23915c) {
            return new DoubleArrayList(Arrays.copyOf(this.f23914b, i), this.f23915c);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        m8301a();
        for (int i = 0; i < this.f23915c; i++) {
            if (obj.equals(Double.valueOf(this.f23914b[i]))) {
                double[] dArr = this.f23914b;
                System.arraycopy(dArr, i + 1, dArr, i, (this.f23915c - i) - 1);
                this.f23915c--;
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
        double[] dArr = this.f23914b;
        System.arraycopy(dArr, i2, dArr, i, this.f23915c - i2);
        this.f23915c -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        m8301a();
        m8477c(i);
        double[] dArr = this.f23914b;
        double d = dArr[i];
        dArr[i] = dDoubleValue;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f23915c;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m8301a();
        m8477c(i);
        double[] dArr = this.f23914b;
        double d = dArr[i];
        if (i < this.f23915c - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (r3 - i) - 1);
        }
        this.f23915c--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addDouble(((Double) obj).doubleValue());
        return true;
    }
}
