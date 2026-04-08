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
final class FloatArrayList extends AbstractProtobufList<Float> implements Internal.FloatList, RandomAccess, PrimitiveNonBoxingCollection {

    /* JADX INFO: renamed from: b */
    public float[] f23984b;

    /* JADX INFO: renamed from: c */
    public int f23985c;

    static {
        new FloatArrayList(0, new float[0]).f23839a = false;
    }

    public FloatArrayList(int i, float[] fArr) {
        this.f23984b = fArr;
        this.f23985c = i;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        float fFloatValue = ((Float) obj).floatValue();
        m8301a();
        if (i < 0 || i > (i2 = this.f23985c)) {
            StringBuilder sbM20q = AbstractC0000a.m20q(i, "Index:", ", Size:");
            sbM20q.append(this.f23985c);
            throw new IndexOutOfBoundsException(sbM20q.toString());
        }
        float[] fArr = this.f23984b;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[AbstractC1610a.m8724b(i2, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.f23984b, i, fArr2, i + 1, this.f23985c - i);
            this.f23984b = fArr2;
        }
        this.f23984b[i] = fFloatValue;
        this.f23985c++;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m8301a();
        Charset charset = Internal.f24003a;
        collection.getClass();
        if (!(collection instanceof FloatArrayList)) {
            return super.addAll(collection);
        }
        FloatArrayList floatArrayList = (FloatArrayList) collection;
        int i = floatArrayList.f23985c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f23985c;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        float[] fArr = this.f23984b;
        if (i3 > fArr.length) {
            this.f23984b = Arrays.copyOf(fArr, i3);
        }
        System.arraycopy(floatArrayList.f23984b, 0, this.f23984b, this.f23985c, floatArrayList.f23985c);
        this.f23985c = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void addFloat(float f) {
        m8301a();
        int i = this.f23985c;
        float[] fArr = this.f23984b;
        if (i == fArr.length) {
            float[] fArr2 = new float[AbstractC1610a.m8724b(i, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f23984b = fArr2;
        }
        float[] fArr3 = this.f23984b;
        int i2 = this.f23985c;
        this.f23985c = i2 + 1;
        fArr3[i2] = f;
    }

    /* JADX INFO: renamed from: c */
    public final void m8500c(int i) {
        if (i < 0 || i >= this.f23985c) {
            StringBuilder sbM20q = AbstractC0000a.m20q(i, "Index:", ", Size:");
            sbM20q.append(this.f23985c);
            throw new IndexOutOfBoundsException(sbM20q.toString());
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FloatArrayList)) {
            return super.equals(obj);
        }
        FloatArrayList floatArrayList = (FloatArrayList) obj;
        if (this.f23985c != floatArrayList.f23985c) {
            return false;
        }
        float[] fArr = floatArrayList.f23984b;
        for (int i = 0; i < this.f23985c; i++) {
            if (Float.floatToIntBits(this.f23984b[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m8500c(i);
        return Float.valueOf(this.f23984b[i]);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i = 0; i < this.f23985c; i++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f23984b[i]);
        }
        return iFloatToIntBits;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList
    public final Internal.ProtobufList mutableCopyWithCapacity(int i) {
        if (i < this.f23985c) {
            throw new IllegalArgumentException();
        }
        return new FloatArrayList(this.f23985c, Arrays.copyOf(this.f23984b, i));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        m8301a();
        for (int i = 0; i < this.f23985c; i++) {
            if (obj.equals(Float.valueOf(this.f23984b[i]))) {
                float[] fArr = this.f23984b;
                System.arraycopy(fArr, i + 1, fArr, i, (this.f23985c - i) - 1);
                this.f23985c--;
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
        float[] fArr = this.f23984b;
        System.arraycopy(fArr, i2, fArr, i, this.f23985c - i2);
        this.f23985c -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        m8301a();
        m8500c(i);
        float[] fArr = this.f23984b;
        float f = fArr[i];
        fArr[i] = fFloatValue;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f23985c;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m8301a();
        m8500c(i);
        float[] fArr = this.f23984b;
        float f = fArr[i];
        if (i < this.f23985c - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (r2 - i) - 1);
        }
        this.f23985c--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addFloat(((Float) obj).floatValue());
        return true;
    }
}
