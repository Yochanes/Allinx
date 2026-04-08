package okio;

import androidx.compose.animation.AbstractC0455a;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p001A.AbstractC0000a;

/* JADX INFO: renamed from: okio.SegmentedByteString, reason: case insensitive filesystem */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lokio/SegmentedByteString;", "Lokio/ByteString;", "okio"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class C6465SegmentedByteString extends ByteString {

    /* JADX INFO: renamed from: g */
    public final transient byte[][] f57909g;

    /* JADX INFO: renamed from: i */
    public final transient int[] f57910i;

    public C6465SegmentedByteString(byte[][] bArr, int[] iArr) {
        super(ByteString.f57841f.f57842a);
        this.f57909g = bArr;
        this.f57910i = iArr;
    }

    @Override // okio.ByteString
    /* JADX INFO: renamed from: a */
    public final String mo21614a() {
        throw null;
    }

    @Override // okio.ByteString
    /* JADX INFO: renamed from: c */
    public final ByteString mo21616c(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        byte[][] bArr = this.f57909g;
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.f57910i;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            messageDigest.update(bArr[i], i3, i4 - i2);
            i++;
            i2 = i4;
        }
        byte[] bArrDigest = messageDigest.digest();
        Intrinsics.m18596d(bArrDigest);
        return new ByteString(bArrDigest);
    }

    @Override // okio.ByteString
    /* JADX INFO: renamed from: d */
    public final int mo21617d() {
        return this.f57910i[this.f57909g.length - 1];
    }

    @Override // okio.ByteString
    /* JADX INFO: renamed from: e */
    public final String mo21618e() {
        return m21712v().mo21618e();
    }

    @Override // okio.ByteString
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            if (byteString.mo21617d() == mo21617d() && mo21623m(0, byteString, mo21617d())) {
                return true;
            }
        }
        return false;
    }

    @Override // okio.ByteString
    /* JADX INFO: renamed from: f */
    public final int mo21619f(int i, byte[] other) {
        Intrinsics.m18599g(other, "other");
        return m21712v().mo21619f(i, other);
    }

    @Override // okio.ByteString
    public final int hashCode() {
        int i = this.f57843b;
        if (i != 0) {
            return i;
        }
        byte[][] bArr = this.f57909g;
        int length = bArr.length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            int[] iArr = this.f57910i;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            byte[] bArr2 = bArr[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr2[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        this.f57843b = i3;
        return i3;
    }

    @Override // okio.ByteString
    /* JADX INFO: renamed from: i */
    public final byte[] getF57842a() {
        return mo21628s();
    }

    @Override // okio.ByteString
    /* JADX INFO: renamed from: j */
    public final byte mo21621j(int i) {
        byte[][] bArr = this.f57909g;
        int length = bArr.length - 1;
        int[] iArr = this.f57910i;
        SegmentedByteString.m21554b(iArr[length], i, 1L);
        int iM21724a = okio.internal.SegmentedByteString.m21724a(this, i);
        return bArr[iM21724a][(i - (iM21724a == 0 ? 0 : iArr[iM21724a - 1])) + iArr[bArr.length + iM21724a]];
    }

    @Override // okio.ByteString
    /* JADX INFO: renamed from: k */
    public final int mo21622k(byte[] other) {
        Intrinsics.m18599g(other, "other");
        return m21712v().mo21622k(other);
    }

    @Override // okio.ByteString
    /* JADX INFO: renamed from: m */
    public final boolean mo21623m(int i, ByteString other, int i2) {
        Intrinsics.m18599g(other, "other");
        if (i >= 0 && i <= mo21617d() - i2) {
            int i3 = i2 + i;
            int iM21724a = okio.internal.SegmentedByteString.m21724a(this, i);
            int i4 = 0;
            while (i < i3) {
                int[] iArr = this.f57910i;
                int i5 = iM21724a == 0 ? 0 : iArr[iM21724a - 1];
                int i6 = iArr[iM21724a] - i5;
                byte[][] bArr = this.f57909g;
                int i7 = iArr[bArr.length + iM21724a];
                int iMin = Math.min(i3, i6 + i5) - i;
                if (other.mo21624n(i4, bArr[iM21724a], (i - i5) + i7, iMin)) {
                    i4 += iMin;
                    i += iMin;
                    iM21724a++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // okio.ByteString
    /* JADX INFO: renamed from: n */
    public final boolean mo21624n(int i, byte[] other, int i2, int i3) {
        Intrinsics.m18599g(other, "other");
        if (i < 0 || i > mo21617d() - i3 || i2 < 0 || i2 > other.length - i3) {
            return false;
        }
        int i4 = i3 + i;
        int iM21724a = okio.internal.SegmentedByteString.m21724a(this, i);
        while (i < i4) {
            int[] iArr = this.f57910i;
            int i5 = iM21724a == 0 ? 0 : iArr[iM21724a - 1];
            int i6 = iArr[iM21724a] - i5;
            byte[][] bArr = this.f57909g;
            int i7 = iArr[bArr.length + iM21724a];
            int iMin = Math.min(i4, i6 + i5) - i;
            if (!SegmentedByteString.m21553a(bArr[iM21724a], (i - i5) + i7, other, i2, iMin)) {
                return false;
            }
            i2 += iMin;
            i += iMin;
            iM21724a++;
        }
        return true;
    }

    @Override // okio.ByteString
    /* JADX INFO: renamed from: p */
    public final ByteString mo21626p(int i, int i2) {
        if (i2 == -1234567890) {
            i2 = mo21617d();
        }
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC0000a.m10g(i, "beginIndex=", " < 0").toString());
        }
        if (i2 > mo21617d()) {
            StringBuilder sbM20q = AbstractC0000a.m20q(i2, "endIndex=", " > length(");
            sbM20q.append(mo21617d());
            sbM20q.append(')');
            throw new IllegalArgumentException(sbM20q.toString().toString());
        }
        int i3 = i2 - i;
        if (i3 < 0) {
            throw new IllegalArgumentException(AbstractC0455a.m2237l(i2, i, "endIndex=", " < beginIndex=").toString());
        }
        if (i == 0 && i2 == mo21617d()) {
            return this;
        }
        if (i == i2) {
            return ByteString.f57841f;
        }
        int iM21724a = okio.internal.SegmentedByteString.m21724a(this, i);
        int iM21724a2 = okio.internal.SegmentedByteString.m21724a(this, i2 - 1);
        byte[][] bArr = this.f57909g;
        byte[][] bArr2 = (byte[][]) ArraysKt.m18387v(iM21724a, iM21724a2 + 1, bArr);
        int[] iArr = new int[bArr2.length * 2];
        int[] iArr2 = this.f57910i;
        if (iM21724a <= iM21724a2) {
            int i4 = iM21724a;
            int i5 = 0;
            while (true) {
                iArr[i5] = Math.min(iArr2[i4] - i, i3);
                int i6 = i5 + 1;
                iArr[i5 + bArr2.length] = iArr2[bArr.length + i4];
                if (i4 == iM21724a2) {
                    break;
                }
                i4++;
                i5 = i6;
            }
        }
        int i7 = iM21724a != 0 ? iArr2[iM21724a - 1] : 0;
        int length = bArr2.length;
        iArr[length] = (i - i7) + iArr[length];
        return new C6465SegmentedByteString(bArr2, iArr);
    }

    @Override // okio.ByteString
    /* JADX INFO: renamed from: r */
    public final ByteString mo21627r() {
        return m21712v().mo21627r();
    }

    @Override // okio.ByteString
    /* JADX INFO: renamed from: s */
    public final byte[] mo21628s() {
        byte[] bArr = new byte[mo21617d()];
        byte[][] bArr2 = this.f57909g;
        int length = bArr2.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int[] iArr = this.f57910i;
            int i4 = iArr[length + i];
            int i5 = iArr[i];
            int i6 = i5 - i2;
            ArraysKt.m18380o(bArr2[i], i3, bArr, i4, i4 + i6);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    @Override // okio.ByteString
    public final String toString() {
        return m21712v().toString();
    }

    @Override // okio.ByteString
    /* JADX INFO: renamed from: u */
    public final void mo21630u(Buffer buffer, int i) {
        Intrinsics.m18599g(buffer, "buffer");
        int iM21724a = okio.internal.SegmentedByteString.m21724a(this, 0);
        int i2 = 0;
        while (i2 < i) {
            int[] iArr = this.f57910i;
            int i3 = iM21724a == 0 ? 0 : iArr[iM21724a - 1];
            int i4 = iArr[iM21724a] - i3;
            byte[][] bArr = this.f57909g;
            int i5 = iArr[bArr.length + iM21724a];
            int iMin = Math.min(i, i4 + i3) - i2;
            int i6 = (i2 - i3) + i5;
            Segment segment = new Segment(bArr[iM21724a], i6, i6 + iMin, true, false);
            Segment segment2 = buffer.f57829a;
            if (segment2 == null) {
                segment.f57905g = segment;
                segment.f57904f = segment;
                buffer.f57829a = segment;
            } else {
                Segment segment3 = segment2.f57905g;
                Intrinsics.m18596d(segment3);
                segment3.m21707b(segment);
            }
            i2 += iMin;
            iM21724a++;
        }
        buffer.f57830b += (long) i;
    }

    /* JADX INFO: renamed from: v */
    public final ByteString m21712v() {
        return new ByteString(mo21628s());
    }
}
