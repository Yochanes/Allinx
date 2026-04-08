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
final class LongArrayList extends AbstractProtobufList<Long> implements Internal.LongList, RandomAccess, PrimitiveNonBoxingCollection {

    /* JADX INFO: renamed from: b */
    public long[] f24028b;

    /* JADX INFO: renamed from: c */
    public int f24029c;

    static {
        new LongArrayList(new long[0], 0).f23839a = false;
    }

    public LongArrayList(long[] jArr, int i) {
        this.f24028b = jArr;
        this.f24029c = i;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        long jLongValue = ((Long) obj).longValue();
        m8301a();
        if (i < 0 || i > (i2 = this.f24029c)) {
            StringBuilder sbM20q = AbstractC0000a.m20q(i, "Index:", ", Size:");
            sbM20q.append(this.f24029c);
            throw new IndexOutOfBoundsException(sbM20q.toString());
        }
        long[] jArr = this.f24028b;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[AbstractC1610a.m8724b(i2, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.f24028b, i, jArr2, i + 1, this.f24029c - i);
            this.f24028b = jArr2;
        }
        this.f24028b[i] = jLongValue;
        this.f24029c++;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m8301a();
        Charset charset = Internal.f24003a;
        collection.getClass();
        if (!(collection instanceof LongArrayList)) {
            return super.addAll(collection);
        }
        LongArrayList longArrayList = (LongArrayList) collection;
        int i = longArrayList.f24029c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f24029c;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        long[] jArr = this.f24028b;
        if (i3 > jArr.length) {
            this.f24028b = Arrays.copyOf(jArr, i3);
        }
        System.arraycopy(longArrayList.f24028b, 0, this.f24028b, this.f24029c, longArrayList.f24029c);
        this.f24029c = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void addLong(long j) {
        m8301a();
        int i = this.f24029c;
        long[] jArr = this.f24028b;
        if (i == jArr.length) {
            long[] jArr2 = new long[AbstractC1610a.m8724b(i, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f24028b = jArr2;
        }
        long[] jArr3 = this.f24028b;
        int i2 = this.f24029c;
        this.f24029c = i2 + 1;
        jArr3[i2] = j;
    }

    /* JADX INFO: renamed from: c */
    public final void m8532c(int i) {
        if (i < 0 || i >= this.f24029c) {
            StringBuilder sbM20q = AbstractC0000a.m20q(i, "Index:", ", Size:");
            sbM20q.append(this.f24029c);
            throw new IndexOutOfBoundsException(sbM20q.toString());
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LongArrayList)) {
            return super.equals(obj);
        }
        LongArrayList longArrayList = (LongArrayList) obj;
        if (this.f24029c != longArrayList.f24029c) {
            return false;
        }
        long[] jArr = longArrayList.f24028b;
        for (int i = 0; i < this.f24029c; i++) {
            if (this.f24028b[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return Long.valueOf(getLong(i));
    }

    public final long getLong(int i) {
        m8532c(i);
        return this.f24028b[i];
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iM8516b = 1;
        for (int i = 0; i < this.f24029c; i++) {
            iM8516b = (iM8516b * 31) + Internal.m8516b(this.f24028b[i]);
        }
        return iM8516b;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList
    public final Internal.ProtobufList mutableCopyWithCapacity(int i) {
        if (i >= this.f24029c) {
            return new LongArrayList(Arrays.copyOf(this.f24028b, i), this.f24029c);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        m8301a();
        for (int i = 0; i < this.f24029c; i++) {
            if (obj.equals(Long.valueOf(this.f24028b[i]))) {
                long[] jArr = this.f24028b;
                System.arraycopy(jArr, i + 1, jArr, i, (this.f24029c - i) - 1);
                this.f24029c--;
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
        long[] jArr = this.f24028b;
        System.arraycopy(jArr, i2, jArr, i, this.f24029c - i2);
        this.f24029c -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        m8301a();
        m8532c(i);
        long[] jArr = this.f24028b;
        long j = jArr[i];
        jArr[i] = jLongValue;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f24029c;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m8301a();
        m8532c(i);
        long[] jArr = this.f24028b;
        long j = jArr[i];
        if (i < this.f24029c - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (r3 - i) - 1);
        }
        this.f24029c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLong(((Long) obj).longValue());
        return true;
    }
}
