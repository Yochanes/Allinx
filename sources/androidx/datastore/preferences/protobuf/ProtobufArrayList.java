package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.Internal;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class ProtobufArrayList<E> extends AbstractProtobufList<E> implements RandomAccess {

    /* JADX INFO: renamed from: d */
    public static final ProtobufArrayList f24081d;

    /* JADX INFO: renamed from: b */
    public Object[] f24082b;

    /* JADX INFO: renamed from: c */
    public int f24083c;

    static {
        ProtobufArrayList protobufArrayList = new ProtobufArrayList(new Object[0], 0);
        f24081d = protobufArrayList;
        protobufArrayList.f23839a = false;
    }

    public ProtobufArrayList(Object[] objArr, int i) {
        this.f24082b = objArr;
        this.f24083c = i;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m8301a();
        int i = this.f24083c;
        Object[] objArr = this.f24082b;
        if (i == objArr.length) {
            this.f24082b = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f24082b;
        int i2 = this.f24083c;
        this.f24083c = i2 + 1;
        objArr2[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final void m8583c(int i) {
        if (i < 0 || i >= this.f24083c) {
            StringBuilder sbM20q = AbstractC0000a.m20q(i, "Index:", ", Size:");
            sbM20q.append(this.f24083c);
            throw new IndexOutOfBoundsException(sbM20q.toString());
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m8583c(i);
        return this.f24082b[i];
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList
    public final Internal.ProtobufList mutableCopyWithCapacity(int i) {
        if (i >= this.f24083c) {
            return new ProtobufArrayList(Arrays.copyOf(this.f24082b, i), this.f24083c);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m8301a();
        m8583c(i);
        Object[] objArr = this.f24082b;
        Object obj = objArr[i];
        if (i < this.f24083c - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (r2 - i) - 1);
        }
        this.f24083c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        m8301a();
        m8583c(i);
        Object[] objArr = this.f24082b;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f24083c;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        m8301a();
        if (i >= 0 && i <= (i2 = this.f24083c)) {
            Object[] objArr = this.f24082b;
            if (i2 < objArr.length) {
                System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
            } else {
                Object[] objArr2 = new Object[AbstractC1610a.m8724b(i2, 3, 2, 1)];
                System.arraycopy(objArr, 0, objArr2, 0, i);
                System.arraycopy(this.f24082b, i, objArr2, i + 1, this.f24083c - i);
                this.f24082b = objArr2;
            }
            this.f24082b[i] = obj;
            this.f24083c++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder sbM20q = AbstractC0000a.m20q(i, "Index:", ", Size:");
        sbM20q.append(this.f24083c);
        throw new IndexOutOfBoundsException(sbM20q.toString());
    }
}
