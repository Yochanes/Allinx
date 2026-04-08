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
final class BooleanArrayList extends AbstractProtobufList<Boolean> implements Internal.BooleanList, RandomAccess, PrimitiveNonBoxingCollection {

    /* JADX INFO: renamed from: b */
    public boolean[] f23855b;

    /* JADX INFO: renamed from: c */
    public int f23856c;

    static {
        new BooleanArrayList(new boolean[0], 0).f23839a = false;
    }

    public BooleanArrayList(boolean[] zArr, int i) {
        this.f23855b = zArr;
        this.f23856c = i;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        m8301a();
        if (i < 0 || i > (i2 = this.f23856c)) {
            StringBuilder sbM20q = AbstractC0000a.m20q(i, "Index:", ", Size:");
            sbM20q.append(this.f23856c);
            throw new IndexOutOfBoundsException(sbM20q.toString());
        }
        boolean[] zArr = this.f23855b;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[AbstractC1610a.m8724b(i2, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.f23855b, i, zArr2, i + 1, this.f23856c - i);
            this.f23855b = zArr2;
        }
        this.f23855b[i] = zBooleanValue;
        this.f23856c++;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m8301a();
        Charset charset = Internal.f24003a;
        collection.getClass();
        if (!(collection instanceof BooleanArrayList)) {
            return super.addAll(collection);
        }
        BooleanArrayList booleanArrayList = (BooleanArrayList) collection;
        int i = booleanArrayList.f23856c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f23856c;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        boolean[] zArr = this.f23855b;
        if (i3 > zArr.length) {
            this.f23855b = Arrays.copyOf(zArr, i3);
        }
        System.arraycopy(booleanArrayList.f23855b, 0, this.f23855b, this.f23856c, booleanArrayList.f23856c);
        this.f23856c = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void addBoolean(boolean z2) {
        m8301a();
        int i = this.f23856c;
        boolean[] zArr = this.f23855b;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[AbstractC1610a.m8724b(i, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.f23855b = zArr2;
        }
        boolean[] zArr3 = this.f23855b;
        int i2 = this.f23856c;
        this.f23856c = i2 + 1;
        zArr3[i2] = z2;
    }

    /* JADX INFO: renamed from: c */
    public final void m8344c(int i) {
        if (i < 0 || i >= this.f23856c) {
            StringBuilder sbM20q = AbstractC0000a.m20q(i, "Index:", ", Size:");
            sbM20q.append(this.f23856c);
            throw new IndexOutOfBoundsException(sbM20q.toString());
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BooleanArrayList)) {
            return super.equals(obj);
        }
        BooleanArrayList booleanArrayList = (BooleanArrayList) obj;
        if (this.f23856c != booleanArrayList.f23856c) {
            return false;
        }
        boolean[] zArr = booleanArrayList.f23855b;
        for (int i = 0; i < this.f23856c; i++) {
            if (this.f23855b[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m8344c(i);
        return Boolean.valueOf(this.f23855b[i]);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f23856c; i2++) {
            int i3 = i * 31;
            boolean z2 = this.f23855b[i2];
            Charset charset = Internal.f24003a;
            i = i3 + (z2 ? 1231 : 1237);
        }
        return i;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList
    public final Internal.ProtobufList mutableCopyWithCapacity(int i) {
        if (i >= this.f23856c) {
            return new BooleanArrayList(Arrays.copyOf(this.f23855b, i), this.f23856c);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        m8301a();
        for (int i = 0; i < this.f23856c; i++) {
            if (obj.equals(Boolean.valueOf(this.f23855b[i]))) {
                boolean[] zArr = this.f23855b;
                System.arraycopy(zArr, i + 1, zArr, i, (this.f23856c - i) - 1);
                this.f23856c--;
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
        boolean[] zArr = this.f23855b;
        System.arraycopy(zArr, i2, zArr, i, this.f23856c - i2);
        this.f23856c -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        m8301a();
        m8344c(i);
        boolean[] zArr = this.f23855b;
        boolean z2 = zArr[i];
        zArr[i] = zBooleanValue;
        return Boolean.valueOf(z2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f23856c;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m8301a();
        m8344c(i);
        boolean[] zArr = this.f23855b;
        boolean z2 = zArr[i];
        if (i < this.f23856c - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (r2 - i) - 1);
        }
        this.f23856c--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z2);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addBoolean(((Boolean) obj).booleanValue());
        return true;
    }
}
