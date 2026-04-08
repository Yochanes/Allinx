package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.Writer;
import java.util.Arrays;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final class UnknownFieldSetLite {

    /* JADX INFO: renamed from: f */
    public static final UnknownFieldSetLite f24143f = new UnknownFieldSetLite(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a */
    public int f24144a;

    /* JADX INFO: renamed from: b */
    public int[] f24145b;

    /* JADX INFO: renamed from: c */
    public Object[] f24146c;

    /* JADX INFO: renamed from: d */
    public int f24147d = -1;

    /* JADX INFO: renamed from: e */
    public boolean f24148e;

    public UnknownFieldSetLite(int i, int[] iArr, Object[] objArr, boolean z2) {
        this.f24144a = i;
        this.f24145b = iArr;
        this.f24146c = objArr;
        this.f24148e = z2;
    }

    /* JADX INFO: renamed from: c */
    public static void m8658c(int i, Object obj, Writer writer) {
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            writer.writeInt64(i2, ((Long) obj).longValue());
            return;
        }
        if (i3 == 1) {
            writer.writeFixed64(i2, ((Long) obj).longValue());
            return;
        }
        if (i3 == 2) {
            writer.mo8336c(i2, (ByteString) obj);
            return;
        }
        if (i3 != 3) {
            if (i3 != 5) {
                throw new RuntimeException(InvalidProtocolBufferException.m8520c());
            }
            writer.writeFixed32(i2, ((Integer) obj).intValue());
        } else if (writer.fieldOrder() == Writer.FieldOrder.f24199a) {
            writer.writeStartGroup(i2);
            ((UnknownFieldSetLite) obj).m8661d(writer);
            writer.writeEndGroup(i2);
        } else {
            writer.writeEndGroup(i2);
            ((UnknownFieldSetLite) obj).m8661d(writer);
            writer.writeStartGroup(i2);
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m8659a() {
        int iM8442q;
        int iM8445t;
        int iM8437l;
        int i = this.f24147d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f24144a; i3++) {
            int i4 = this.f24145b[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 != 0) {
                if (i6 == 1) {
                    ((Long) this.f24146c[i3]).getClass();
                    iM8437l = CodedOutputStream.m8437l(i5);
                } else if (i6 == 2) {
                    iM8437l = CodedOutputStream.m8434i(i5, (ByteString) this.f24146c[i3]);
                } else if (i6 == 3) {
                    iM8442q = CodedOutputStream.m8442q(i5) * 2;
                    iM8445t = ((UnknownFieldSetLite) this.f24146c[i3]).m8659a();
                } else {
                    if (i6 != 5) {
                        throw new IllegalStateException(InvalidProtocolBufferException.m8520c());
                    }
                    ((Integer) this.f24146c[i3]).getClass();
                    iM8437l = CodedOutputStream.m8436k(i5);
                }
                i2 = iM8437l + i2;
            } else {
                long jLongValue = ((Long) this.f24146c[i3]).longValue();
                iM8442q = CodedOutputStream.m8442q(i5);
                iM8445t = CodedOutputStream.m8445t(jLongValue);
            }
            i2 = iM8445t + iM8442q + i2;
        }
        this.f24147d = i2;
        return i2;
    }

    /* JADX INFO: renamed from: b */
    public final void m8660b(int i, Object obj) {
        if (!this.f24148e) {
            throw new UnsupportedOperationException();
        }
        int i2 = this.f24144a;
        int[] iArr = this.f24145b;
        if (i2 == iArr.length) {
            int i3 = i2 + (i2 < 4 ? 8 : i2 >> 1);
            this.f24145b = Arrays.copyOf(iArr, i3);
            this.f24146c = Arrays.copyOf(this.f24146c, i3);
        }
        int[] iArr2 = this.f24145b;
        int i4 = this.f24144a;
        iArr2[i4] = i;
        this.f24146c[i4] = obj;
        this.f24144a = i4 + 1;
    }

    /* JADX INFO: renamed from: d */
    public final void m8661d(Writer writer) {
        if (this.f24144a == 0) {
            return;
        }
        if (writer.fieldOrder() == Writer.FieldOrder.f24199a) {
            for (int i = 0; i < this.f24144a; i++) {
                m8658c(this.f24145b[i], this.f24146c[i], writer);
            }
            return;
        }
        for (int i2 = this.f24144a - 1; i2 >= 0; i2--) {
            m8658c(this.f24145b[i2], this.f24146c[i2], writer);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof UnknownFieldSetLite)) {
            return false;
        }
        UnknownFieldSetLite unknownFieldSetLite = (UnknownFieldSetLite) obj;
        int i = this.f24144a;
        if (i == unknownFieldSetLite.f24144a) {
            int[] iArr = this.f24145b;
            int[] iArr2 = unknownFieldSetLite.f24145b;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.f24146c;
                    Object[] objArr2 = unknownFieldSetLite.f24146c;
                    int i3 = this.f24144a;
                    for (int i4 = 0; i4 < i3; i4++) {
                        if (objArr[i4].equals(objArr2[i4])) {
                        }
                    }
                    return true;
                }
                if (iArr[i2] != iArr2[i2]) {
                    break;
                }
                i2++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f24144a;
        int i2 = (527 + i) * 31;
        int[] iArr = this.f24145b;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = (i2 + i3) * 31;
        Object[] objArr = this.f24146c;
        int i6 = this.f24144a;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }
}
