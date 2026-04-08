package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.ByteString;
import androidx.datastore.preferences.protobuf.UnsafeUtil;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public abstract class CodedInputStream {

    /* JADX INFO: renamed from: a */
    public int f23869a;

    /* JADX INFO: renamed from: b */
    public CodedInputStreamReader f23870b;

    /* JADX INFO: compiled from: Proguard */
    public static final class ArrayDecoder extends CodedInputStream {

        /* JADX INFO: renamed from: c */
        public final byte[] f23871c;

        /* JADX INFO: renamed from: d */
        public int f23872d;

        /* JADX INFO: renamed from: e */
        public int f23873e;

        /* JADX INFO: renamed from: f */
        public int f23874f;

        /* JADX INFO: renamed from: g */
        public final int f23875g;

        /* JADX INFO: renamed from: h */
        public int f23876h;

        /* JADX INFO: renamed from: i */
        public int f23877i = Integer.MAX_VALUE;

        public ArrayDecoder(byte[] bArr, int i, int i2, boolean z2) {
            this.f23871c = bArr;
            this.f23872d = i2 + i;
            this.f23874f = i;
            this.f23875g = i;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        /* JADX INFO: renamed from: A */
        public final boolean mo8367A(int i) throws InvalidProtocolBufferException {
            int iMo8388x;
            int i2 = i & 7;
            int i3 = 0;
            if (i2 == 0) {
                int i4 = this.f23872d - this.f23874f;
                byte[] bArr = this.f23871c;
                if (i4 >= 10) {
                    while (i3 < 10) {
                        int i5 = this.f23874f;
                        this.f23874f = i5 + 1;
                        if (bArr[i5] < 0) {
                            i3++;
                        }
                    }
                    throw InvalidProtocolBufferException.m8521d();
                }
                while (i3 < 10) {
                    int i6 = this.f23874f;
                    if (i6 == this.f23872d) {
                        throw InvalidProtocolBufferException.m8524g();
                    }
                    this.f23874f = i6 + 1;
                    if (bArr[i6] < 0) {
                        i3++;
                    }
                }
                throw InvalidProtocolBufferException.m8521d();
                return true;
            }
            if (i2 == 1) {
                m8397H(8);
                return true;
            }
            if (i2 == 2) {
                m8397H(m8393D());
                return true;
            }
            if (i2 != 3) {
                if (i2 == 4) {
                    return false;
                }
                if (i2 != 5) {
                    throw InvalidProtocolBufferException.m8520c();
                }
                m8397H(4);
                return true;
            }
            do {
                iMo8388x = mo8388x();
                if (iMo8388x == 0) {
                    break;
                }
            } while (mo8367A(iMo8388x));
            mo8368a(((i >>> 3) << 3) | 4);
            return true;
        }

        /* JADX INFO: renamed from: B */
        public final int m8391B() throws InvalidProtocolBufferException {
            int i = this.f23874f;
            if (this.f23872d - i < 4) {
                throw InvalidProtocolBufferException.m8524g();
            }
            this.f23874f = i + 4;
            byte[] bArr = this.f23871c;
            return ((bArr[i + 3] & UnsignedBytes.MAX_VALUE) << 24) | (bArr[i] & UnsignedBytes.MAX_VALUE) | ((bArr[i + 1] & UnsignedBytes.MAX_VALUE) << 8) | ((bArr[i + 2] & UnsignedBytes.MAX_VALUE) << 16);
        }

        /* JADX INFO: renamed from: C */
        public final long m8392C() throws InvalidProtocolBufferException {
            int i = this.f23874f;
            if (this.f23872d - i < 8) {
                throw InvalidProtocolBufferException.m8524g();
            }
            this.f23874f = i + 8;
            byte[] bArr = this.f23871c;
            return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
        }

        /* JADX INFO: renamed from: D */
        public final int m8393D() {
            int i;
            int i2 = this.f23874f;
            int i3 = this.f23872d;
            if (i3 != i2) {
                int i4 = i2 + 1;
                byte[] bArr = this.f23871c;
                byte b2 = bArr[i2];
                if (b2 >= 0) {
                    this.f23874f = i4;
                    return b2;
                }
                if (i3 - i4 >= 9) {
                    int i5 = i2 + 2;
                    int i6 = (bArr[i4] << 7) ^ b2;
                    if (i6 < 0) {
                        i = i6 ^ (-128);
                    } else {
                        int i7 = i2 + 3;
                        int i8 = (bArr[i5] << Ascii.f42544SO) ^ i6;
                        if (i8 >= 0) {
                            i = i8 ^ 16256;
                        } else {
                            int i9 = i2 + 4;
                            int i10 = i8 ^ (bArr[i7] << Ascii.NAK);
                            if (i10 < 0) {
                                i = (-2080896) ^ i10;
                            } else {
                                i7 = i2 + 5;
                                byte b3 = bArr[i9];
                                int i11 = (i10 ^ (b3 << Ascii.f42537FS)) ^ 266354560;
                                if (b3 < 0) {
                                    i9 = i2 + 6;
                                    if (bArr[i7] < 0) {
                                        i7 = i2 + 7;
                                        if (bArr[i9] < 0) {
                                            i9 = i2 + 8;
                                            if (bArr[i7] < 0) {
                                                i7 = i2 + 9;
                                                if (bArr[i9] < 0) {
                                                    int i12 = i2 + 10;
                                                    if (bArr[i7] >= 0) {
                                                        i5 = i12;
                                                        i = i11;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i = i11;
                                }
                                i = i11;
                            }
                            i5 = i9;
                        }
                        i5 = i7;
                    }
                    this.f23874f = i5;
                    return i;
                }
            }
            return (int) m8395F();
        }

        /* JADX INFO: renamed from: E */
        public final long m8394E() {
            long j;
            long j2;
            long j3;
            long j4;
            int i = this.f23874f;
            int i2 = this.f23872d;
            if (i2 != i) {
                int i3 = i + 1;
                byte[] bArr = this.f23871c;
                byte b2 = bArr[i];
                if (b2 >= 0) {
                    this.f23874f = i3;
                    return b2;
                }
                if (i2 - i3 >= 9) {
                    int i4 = i + 2;
                    int i5 = (bArr[i3] << 7) ^ b2;
                    if (i5 < 0) {
                        j = i5 ^ (-128);
                    } else {
                        int i6 = i + 3;
                        int i7 = (bArr[i4] << Ascii.f42544SO) ^ i5;
                        if (i7 >= 0) {
                            j = i7 ^ 16256;
                            i4 = i6;
                        } else {
                            int i8 = i + 4;
                            int i9 = i7 ^ (bArr[i6] << Ascii.NAK);
                            if (i9 < 0) {
                                j4 = (-2080896) ^ i9;
                            } else {
                                long j5 = i9;
                                i4 = i + 5;
                                long j6 = j5 ^ (((long) bArr[i8]) << 28);
                                if (j6 >= 0) {
                                    j3 = 266354560;
                                } else {
                                    i8 = i + 6;
                                    long j7 = j6 ^ (((long) bArr[i4]) << 35);
                                    if (j7 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        i4 = i + 7;
                                        j6 = j7 ^ (((long) bArr[i8]) << 42);
                                        if (j6 >= 0) {
                                            j3 = 4363953127296L;
                                        } else {
                                            i8 = i + 8;
                                            j7 = j6 ^ (((long) bArr[i4]) << 49);
                                            if (j7 < 0) {
                                                j2 = -558586000294016L;
                                            } else {
                                                i4 = i + 9;
                                                long j8 = (j7 ^ (((long) bArr[i8]) << 56)) ^ 71499008037633920L;
                                                if (j8 < 0) {
                                                    int i10 = i + 10;
                                                    if (bArr[i4] >= 0) {
                                                        i4 = i10;
                                                    }
                                                }
                                                j = j8;
                                            }
                                        }
                                    }
                                    j4 = j2 ^ j7;
                                }
                                j = j3 ^ j6;
                            }
                            i4 = i8;
                            j = j4;
                        }
                    }
                    this.f23874f = i4;
                    return j;
                }
            }
            return m8395F();
        }

        /* JADX INFO: renamed from: F */
        public final long m8395F() throws InvalidProtocolBufferException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                int i2 = this.f23874f;
                if (i2 == this.f23872d) {
                    throw InvalidProtocolBufferException.m8524g();
                }
                this.f23874f = i2 + 1;
                byte b2 = this.f23871c[i2];
                j |= ((long) (b2 & Ascii.DEL)) << i;
                if ((b2 & UnsignedBytes.MAX_POWER_OF_TWO) == 0) {
                    return j;
                }
            }
            throw InvalidProtocolBufferException.m8521d();
        }

        /* JADX INFO: renamed from: G */
        public final void m8396G() {
            int i = this.f23872d + this.f23873e;
            this.f23872d = i;
            int i2 = i - this.f23875g;
            int i3 = this.f23877i;
            if (i2 <= i3) {
                this.f23873e = 0;
                return;
            }
            int i4 = i2 - i3;
            this.f23873e = i4;
            this.f23872d = i - i4;
        }

        /* JADX INFO: renamed from: H */
        public final void m8397H(int i) throws InvalidProtocolBufferException {
            if (i >= 0) {
                int i2 = this.f23872d;
                int i3 = this.f23874f;
                if (i <= i2 - i3) {
                    this.f23874f = i3 + i;
                    return;
                }
            }
            if (i >= 0) {
                throw InvalidProtocolBufferException.m8524g();
            }
            throw InvalidProtocolBufferException.m8522e();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        /* JADX INFO: renamed from: a */
        public final void mo8368a(int i) throws InvalidProtocolBufferException {
            if (this.f23876h != i) {
                throw InvalidProtocolBufferException.m8518a();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        /* JADX INFO: renamed from: d */
        public final int mo8369d() {
            return this.f23874f - this.f23875g;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        /* JADX INFO: renamed from: e */
        public final boolean mo8370e() {
            return this.f23874f == this.f23872d;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        /* JADX INFO: renamed from: g */
        public final void mo8371g(int i) {
            this.f23877i = i;
            m8396G();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        /* JADX INFO: renamed from: h */
        public final int mo8372h(int i) {
            if (i < 0) {
                throw InvalidProtocolBufferException.m8522e();
            }
            int iMo8369d = i + mo8369d();
            int i2 = this.f23877i;
            if (iMo8369d > i2) {
                throw InvalidProtocolBufferException.m8524g();
            }
            this.f23877i = iMo8369d;
            m8396G();
            return i2;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        /* JADX INFO: renamed from: i */
        public final boolean mo8373i() {
            return m8394E() != 0;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        /* JADX INFO: renamed from: j */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final ByteString mo8374j() throws InvalidProtocolBufferException {
            byte[] bArrCopyOfRange;
            int iM8393D = m8393D();
            byte[] bArr = this.f23871c;
            if (iM8393D > 0) {
                int i = this.f23872d;
                int i2 = this.f23874f;
                if (iM8393D <= i - i2) {
                    ByteString byteStringM8347f = ByteString.m8347f(bArr, i2, iM8393D);
                    this.f23874f += iM8393D;
                    return byteStringM8347f;
                }
            }
            if (iM8393D == 0) {
                return ByteString.f23857b;
            }
            if (iM8393D > 0) {
                int i3 = this.f23872d;
                int i4 = this.f23874f;
                if (iM8393D <= i3 - i4) {
                    int i5 = iM8393D + i4;
                    this.f23874f = i5;
                    bArrCopyOfRange = Arrays.copyOfRange(bArr, i4, i5);
                } else {
                    if (iM8393D > 0) {
                        throw InvalidProtocolBufferException.m8524g();
                    }
                    if (iM8393D != 0) {
                        throw InvalidProtocolBufferException.m8522e();
                    }
                    bArrCopyOfRange = Internal.f24004b;
                }
            }
            ByteString byteString = ByteString.f23857b;
            return new ByteString.LiteralByteString(bArrCopyOfRange);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        /* JADX INFO: renamed from: k */
        public final double mo8375k() {
            return Double.longBitsToDouble(m8392C());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        /* JADX INFO: renamed from: l */
        public final int mo8376l() {
            return m8393D();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        /* JADX INFO: renamed from: m */
        public final int mo8377m() {
            return m8391B();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        /* JADX INFO: renamed from: n */
        public final long mo8378n() {
            return m8392C();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        /* JADX INFO: renamed from: o */
        public final float mo8379o() {
            return Float.intBitsToFloat(m8391B());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        /* JADX INFO: renamed from: p */
        public final int mo8380p() {
            return m8393D();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        /* JADX INFO: renamed from: q */
        public final long mo8381q() {
            return m8394E();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        /* JADX INFO: renamed from: r */
        public final int mo8382r() {
            return m8391B();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        /* JADX INFO: renamed from: s */
        public final long mo8383s() {
            return m8392C();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        /* JADX INFO: renamed from: t */
        public final int mo8384t() {
            return CodedInputStream.m8364b(m8393D());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        /* JADX INFO: renamed from: u */
        public final long mo8385u() {
            return CodedInputStream.m8365c(m8394E());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        /* JADX INFO: renamed from: v */
        public final String mo8386v() throws InvalidProtocolBufferException {
            int iM8393D = m8393D();
            if (iM8393D > 0) {
                int i = this.f23872d;
                int i2 = this.f23874f;
                if (iM8393D <= i - i2) {
                    String str = new String(this.f23871c, i2, iM8393D, Internal.f24003a);
                    this.f23874f += iM8393D;
                    return str;
                }
            }
            if (iM8393D == 0) {
                return "";
            }
            if (iM8393D < 0) {
                throw InvalidProtocolBufferException.m8522e();
            }
            throw InvalidProtocolBufferException.m8524g();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        /* JADX INFO: renamed from: w */
        public final String mo8387w() throws InvalidProtocolBufferException {
            int iM8393D = m8393D();
            if (iM8393D > 0) {
                int i = this.f23872d;
                int i2 = this.f23874f;
                if (iM8393D <= i - i2) {
                    String strMo8713a = Utf8.f24162a.mo8713a(this.f23871c, i2, iM8393D);
                    this.f23874f += iM8393D;
                    return strMo8713a;
                }
            }
            if (iM8393D == 0) {
                return "";
            }
            if (iM8393D <= 0) {
                throw InvalidProtocolBufferException.m8522e();
            }
            throw InvalidProtocolBufferException.m8524g();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        /* JADX INFO: renamed from: x */
        public final int mo8388x() throws InvalidProtocolBufferException {
            if (mo8370e()) {
                this.f23876h = 0;
                return 0;
            }
            int iM8393D = m8393D();
            this.f23876h = iM8393D;
            if ((iM8393D >>> 3) != 0) {
                return iM8393D;
            }
            throw new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        /* JADX INFO: renamed from: y */
        public final int mo8389y() {
            return m8393D();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        /* JADX INFO: renamed from: z */
        public final long mo8390z() {
            return m8394E();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class IterableDirectByteBufferDecoder extends CodedInputStream {

        /* JADX INFO: renamed from: c */
        public int f23878c;

        /* JADX INFO: renamed from: d */
        public int f23879d;

        /* JADX INFO: renamed from: e */
        public int f23880e;

        /* JADX INFO: renamed from: f */
        public int f23881f;

        /* JADX INFO: renamed from: g */
        public long f23882g;

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        /* JADX INFO: renamed from: A */
        public final boolean mo8367A(int i) throws InvalidProtocolBufferException {
            int iMo8388x;
            int i2 = i & 7;
            if (i2 == 0) {
                for (int i3 = 0; i3 < 10; i3++) {
                    if (m8399C() >= 0) {
                        return true;
                    }
                }
                throw InvalidProtocolBufferException.m8521d();
            }
            if (i2 == 1) {
                m8406J(8);
                return true;
            }
            if (i2 == 2) {
                m8406J(m8403G());
                return true;
            }
            if (i2 != 3) {
                if (i2 == 4) {
                    return false;
                }
                if (i2 != 5) {
                    throw InvalidProtocolBufferException.m8520c();
                }
                m8406J(4);
                return true;
            }
            do {
                iMo8388x = mo8388x();
                if (iMo8388x == 0) {
                    break;
                }
            } while (mo8367A(iMo8388x));
            mo8368a(((i >>> 3) << 3) | 4);
            return true;
        }

        /* JADX INFO: renamed from: B */
        public final long m8398B() {
            return 0 - this.f23882g;
        }

        /* JADX INFO: renamed from: C */
        public final byte m8399C() {
            if (m8398B() == 0) {
                throw null;
            }
            long j = this.f23882g;
            this.f23882g = 1 + j;
            return UnsafeUtil.f24155d.mo8682f(j);
        }

        /* JADX INFO: renamed from: D */
        public final void m8400D(int i, byte[] bArr) throws InvalidProtocolBufferException {
            if (i < 0 || i > ((int) (((long) this.f23878c) - this.f23882g))) {
                if (i > 0) {
                    throw InvalidProtocolBufferException.m8524g();
                }
                if (i != 0) {
                    throw InvalidProtocolBufferException.m8522e();
                }
                return;
            }
            int i2 = i;
            while (i2 > 0) {
                if (m8398B() == 0) {
                    throw null;
                }
                int iMin = Math.min(i2, (int) m8398B());
                long j = iMin;
                byte[] bArr2 = bArr;
                UnsafeUtil.f24155d.mo8679c(this.f23882g, bArr2, i - i2, j);
                i2 -= iMin;
                this.f23882g += j;
                bArr = bArr2;
            }
        }

        /* JADX INFO: renamed from: E */
        public final int m8401E() {
            if (m8398B() < 4) {
                return (m8399C() & UnsignedBytes.MAX_VALUE) | ((m8399C() & UnsignedBytes.MAX_VALUE) << 8) | ((m8399C() & UnsignedBytes.MAX_VALUE) << 16) | ((m8399C() & UnsignedBytes.MAX_VALUE) << 24);
            }
            long j = this.f23882g;
            this.f23882g = 4 + j;
            UnsafeUtil.MemoryAccessor memoryAccessor = UnsafeUtil.f24155d;
            return ((memoryAccessor.mo8682f(j + 3) & UnsignedBytes.MAX_VALUE) << 24) | (memoryAccessor.mo8682f(j) & UnsignedBytes.MAX_VALUE) | ((memoryAccessor.mo8682f(1 + j) & UnsignedBytes.MAX_VALUE) << 8) | ((memoryAccessor.mo8682f(2 + j) & UnsignedBytes.MAX_VALUE) << 16);
        }

        /* JADX INFO: renamed from: F */
        public final long m8402F() {
            if (m8398B() < 8) {
                return (((long) m8399C()) & 255) | ((((long) m8399C()) & 255) << 8) | ((((long) m8399C()) & 255) << 16) | ((((long) m8399C()) & 255) << 24) | ((((long) m8399C()) & 255) << 32) | ((((long) m8399C()) & 255) << 40) | ((((long) m8399C()) & 255) << 48) | ((((long) m8399C()) & 255) << 56);
            }
            long j = this.f23882g;
            this.f23882g = 8 + j;
            UnsafeUtil.MemoryAccessor memoryAccessor = UnsafeUtil.f24155d;
            return (((long) memoryAccessor.mo8682f(j)) & 255) | ((((long) memoryAccessor.mo8682f(j + 1)) & 255) << 8) | ((((long) memoryAccessor.mo8682f(j + 2)) & 255) << 16) | ((((long) memoryAccessor.mo8682f(3 + j)) & 255) << 24) | ((((long) memoryAccessor.mo8682f(4 + j)) & 255) << 32) | ((((long) memoryAccessor.mo8682f(5 + j)) & 255) << 40) | ((((long) memoryAccessor.mo8682f(6 + j)) & 255) << 48) | ((((long) memoryAccessor.mo8682f(j + 7)) & 255) << 56);
        }

        /* JADX INFO: renamed from: G */
        public final int m8403G() {
            int i;
            long j = this.f23882g;
            if (0 != j) {
                long j2 = j + 1;
                UnsafeUtil.MemoryAccessor memoryAccessor = UnsafeUtil.f24155d;
                byte bMo8682f = memoryAccessor.mo8682f(j);
                if (bMo8682f >= 0) {
                    this.f23882g++;
                    return bMo8682f;
                }
                if (0 - this.f23882g >= 10) {
                    long j3 = 2 + j;
                    int iMo8682f = (memoryAccessor.mo8682f(j2) << 7) ^ bMo8682f;
                    if (iMo8682f < 0) {
                        i = iMo8682f ^ (-128);
                    } else {
                        long j4 = 3 + j;
                        int iMo8682f2 = (memoryAccessor.mo8682f(j3) << Ascii.f42544SO) ^ iMo8682f;
                        if (iMo8682f2 >= 0) {
                            i = iMo8682f2 ^ 16256;
                        } else {
                            long j5 = 4 + j;
                            int iMo8682f3 = iMo8682f2 ^ (memoryAccessor.mo8682f(j4) << Ascii.NAK);
                            if (iMo8682f3 < 0) {
                                i = (-2080896) ^ iMo8682f3;
                            } else {
                                j4 = 5 + j;
                                byte bMo8682f2 = memoryAccessor.mo8682f(j5);
                                int i2 = (iMo8682f3 ^ (bMo8682f2 << Ascii.f42537FS)) ^ 266354560;
                                if (bMo8682f2 < 0) {
                                    j5 = 6 + j;
                                    if (memoryAccessor.mo8682f(j4) < 0) {
                                        j4 = 7 + j;
                                        if (memoryAccessor.mo8682f(j5) < 0) {
                                            j5 = 8 + j;
                                            if (memoryAccessor.mo8682f(j4) < 0) {
                                                j4 = 9 + j;
                                                if (memoryAccessor.mo8682f(j5) < 0) {
                                                    long j6 = j + 10;
                                                    if (memoryAccessor.mo8682f(j4) >= 0) {
                                                        i = i2;
                                                        j3 = j6;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i = i2;
                                }
                                i = i2;
                            }
                            j3 = j5;
                        }
                        j3 = j4;
                    }
                    this.f23882g = j3;
                    return i;
                }
            }
            return (int) m8405I();
        }

        /* JADX INFO: renamed from: H */
        public final long m8404H() {
            long j;
            long j2;
            long j3 = this.f23882g;
            if (0 != j3) {
                long j4 = j3 + 1;
                UnsafeUtil.MemoryAccessor memoryAccessor = UnsafeUtil.f24155d;
                byte bMo8682f = memoryAccessor.mo8682f(j3);
                if (bMo8682f >= 0) {
                    this.f23882g++;
                    return bMo8682f;
                }
                if (0 - this.f23882g >= 10) {
                    long j5 = 2 + j3;
                    int iMo8682f = (memoryAccessor.mo8682f(j4) << 7) ^ bMo8682f;
                    if (iMo8682f < 0) {
                        j = iMo8682f ^ (-128);
                    } else {
                        long j6 = 3 + j3;
                        int iMo8682f2 = (memoryAccessor.mo8682f(j5) << Ascii.f42544SO) ^ iMo8682f;
                        if (iMo8682f2 >= 0) {
                            j = iMo8682f2 ^ 16256;
                            j5 = j6;
                        } else {
                            long j7 = 4 + j3;
                            int iMo8682f3 = iMo8682f2 ^ (memoryAccessor.mo8682f(j6) << Ascii.NAK);
                            if (iMo8682f3 < 0) {
                                j = (-2080896) ^ iMo8682f3;
                                j5 = j7;
                            } else {
                                long j8 = j3 + 5;
                                long jMo8682f = (((long) memoryAccessor.mo8682f(j7)) << 28) ^ ((long) iMo8682f3);
                                if (jMo8682f >= 0) {
                                    j = 266354560 ^ jMo8682f;
                                    j5 = j8;
                                } else {
                                    long j9 = 6 + j3;
                                    long jMo8682f2 = (((long) memoryAccessor.mo8682f(j8)) << 35) ^ jMo8682f;
                                    if (jMo8682f2 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        j5 = 7 + j3;
                                        long jMo8682f3 = jMo8682f2 ^ (((long) memoryAccessor.mo8682f(j9)) << 42);
                                        if (jMo8682f3 >= 0) {
                                            j = 4363953127296L ^ jMo8682f3;
                                        } else {
                                            j9 = 8 + j3;
                                            jMo8682f2 = jMo8682f3 ^ (((long) memoryAccessor.mo8682f(j5)) << 49);
                                            if (jMo8682f2 < 0) {
                                                j2 = -558586000294016L;
                                            } else {
                                                j5 = 9 + j3;
                                                long jMo8682f4 = (jMo8682f2 ^ (((long) memoryAccessor.mo8682f(j9)) << 56)) ^ 71499008037633920L;
                                                if (jMo8682f4 < 0) {
                                                    long j10 = j3 + 10;
                                                    if (memoryAccessor.mo8682f(j5) >= 0) {
                                                        j5 = j10;
                                                    }
                                                }
                                                j = jMo8682f4;
                                            }
                                        }
                                    }
                                    j = j2 ^ jMo8682f2;
                                    j5 = j9;
                                }
                            }
                        }
                    }
                    this.f23882g = j5;
                    return j;
                }
            }
            return m8405I();
        }

        /* JADX INFO: renamed from: I */
        public final long m8405I() throws InvalidProtocolBufferException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte bM8399C = m8399C();
                j |= ((long) (bM8399C & Ascii.DEL)) << i;
                if ((bM8399C & UnsignedBytes.MAX_POWER_OF_TWO) == 0) {
                    return j;
                }
            }
            throw InvalidProtocolBufferException.m8521d();
        }

        /* JADX INFO: renamed from: J */
        public final void m8406J(int i) throws InvalidProtocolBufferException {
            if (i < 0 || i > ((long) this.f23878c) - this.f23882g) {
                if (i >= 0) {
                    throw InvalidProtocolBufferException.m8524g();
                }
                throw InvalidProtocolBufferException.m8522e();
            }
            while (i > 0) {
                if (m8398B() == 0) {
                    throw null;
                }
                int iMin = Math.min(i, (int) m8398B());
                i -= iMin;
                this.f23882g += (long) iMin;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        /* JADX INFO: renamed from: a */
        public final void mo8368a(int i) throws InvalidProtocolBufferException {
            if (this.f23881f != i) {
                throw InvalidProtocolBufferException.m8518a();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        /* JADX INFO: renamed from: d */
        public final int mo8369d() {
            return (int) (((long) 0) + this.f23882g);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        /* JADX INFO: renamed from: e */
        public final boolean mo8370e() {
            return ((long) 0) + this.f23882g == ((long) this.f23878c);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        /* JADX INFO: renamed from: g */
        public final void mo8371g(int i) {
            this.f23880e = i;
            int i2 = this.f23878c + this.f23879d;
            this.f23878c = i2;
            if (i2 <= i) {
                this.f23879d = 0;
                return;
            }
            int i3 = i2 - i;
            this.f23879d = i3;
            this.f23878c = i2 - i3;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        /* JADX INFO: renamed from: h */
        public final int mo8372h(int i) throws InvalidProtocolBufferException {
            if (i < 0) {
                throw InvalidProtocolBufferException.m8522e();
            }
            int iMo8369d = i + mo8369d();
            int i2 = this.f23880e;
            if (iMo8369d > i2) {
                throw InvalidProtocolBufferException.m8524g();
            }
            this.f23880e = iMo8369d;
            int i3 = this.f23878c + this.f23879d;
            this.f23878c = i3;
            if (i3 <= iMo8369d) {
                this.f23879d = 0;
                return i2;
            }
            int i4 = i3 - iMo8369d;
            this.f23879d = i4;
            this.f23878c = i3 - i4;
            return i2;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        /* JADX INFO: renamed from: i */
        public final boolean mo8373i() {
            return m8404H() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        /* JADX INFO: renamed from: j */
        public final ByteString mo8374j() throws InvalidProtocolBufferException {
            int iM8403G = m8403G();
            if (iM8403G > 0) {
                long j = iM8403G;
                long j2 = this.f23882g;
                if (j <= 0 - j2) {
                    byte[] bArr = new byte[iM8403G];
                    UnsafeUtil.f24155d.mo8679c(j2, bArr, 0L, j);
                    this.f23882g += j;
                    ByteString byteString = ByteString.f23857b;
                    return new ByteString.LiteralByteString(bArr);
                }
            }
            if (iM8403G > 0 && iM8403G <= ((int) (((long) this.f23878c) - this.f23882g))) {
                byte[] bArr2 = new byte[iM8403G];
                m8400D(iM8403G, bArr2);
                ByteString byteString2 = ByteString.f23857b;
                return new ByteString.LiteralByteString(bArr2);
            }
            if (iM8403G == 0) {
                return ByteString.f23857b;
            }
            if (iM8403G < 0) {
                throw InvalidProtocolBufferException.m8522e();
            }
            throw InvalidProtocolBufferException.m8524g();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        /* JADX INFO: renamed from: k */
        public final double mo8375k() {
            return Double.longBitsToDouble(m8402F());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        /* JADX INFO: renamed from: l */
        public final int mo8376l() {
            return m8403G();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        /* JADX INFO: renamed from: m */
        public final int mo8377m() {
            return m8401E();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        /* JADX INFO: renamed from: n */
        public final long mo8378n() {
            return m8402F();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        /* JADX INFO: renamed from: o */
        public final float mo8379o() {
            return Float.intBitsToFloat(m8401E());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        /* JADX INFO: renamed from: p */
        public final int mo8380p() {
            return m8403G();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        /* JADX INFO: renamed from: q */
        public final long mo8381q() {
            return m8404H();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        /* JADX INFO: renamed from: r */
        public final int mo8382r() {
            return m8401E();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        /* JADX INFO: renamed from: s */
        public final long mo8383s() {
            return m8402F();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        /* JADX INFO: renamed from: t */
        public final int mo8384t() {
            return CodedInputStream.m8364b(m8403G());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        /* JADX INFO: renamed from: u */
        public final long mo8385u() {
            return CodedInputStream.m8365c(m8404H());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        /* JADX INFO: renamed from: v */
        public final String mo8386v() throws InvalidProtocolBufferException {
            int iM8403G = m8403G();
            if (iM8403G > 0) {
                long j = iM8403G;
                long j2 = this.f23882g;
                if (j <= 0 - j2) {
                    byte[] bArr = new byte[iM8403G];
                    UnsafeUtil.f24155d.mo8679c(j2, bArr, 0L, j);
                    String str = new String(bArr, Internal.f24003a);
                    this.f23882g += j;
                    return str;
                }
            }
            if (iM8403G > 0 && iM8403G <= ((int) (((long) this.f23878c) - this.f23882g))) {
                byte[] bArr2 = new byte[iM8403G];
                m8400D(iM8403G, bArr2);
                return new String(bArr2, Internal.f24003a);
            }
            if (iM8403G == 0) {
                return "";
            }
            if (iM8403G < 0) {
                throw InvalidProtocolBufferException.m8522e();
            }
            throw InvalidProtocolBufferException.m8524g();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        /* JADX INFO: renamed from: w */
        public final String mo8387w() throws InvalidProtocolBufferException {
            int iM8403G = m8403G();
            if (iM8403G > 0) {
                long j = iM8403G;
                long j2 = this.f23882g;
                if (j <= 0 - j2) {
                    String strM8703c = Utf8.m8703c(null, (int) j2, iM8403G);
                    this.f23882g += j;
                    return strM8703c;
                }
            }
            if (iM8403G >= 0 && iM8403G <= ((int) (((long) this.f23878c) - this.f23882g))) {
                byte[] bArr = new byte[iM8403G];
                m8400D(iM8403G, bArr);
                return Utf8.f24162a.mo8713a(bArr, 0, iM8403G);
            }
            if (iM8403G == 0) {
                return "";
            }
            if (iM8403G <= 0) {
                throw InvalidProtocolBufferException.m8522e();
            }
            throw InvalidProtocolBufferException.m8524g();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        /* JADX INFO: renamed from: x */
        public final int mo8388x() throws InvalidProtocolBufferException {
            if (mo8370e()) {
                this.f23881f = 0;
                return 0;
            }
            int iM8403G = m8403G();
            this.f23881f = iM8403G;
            if ((iM8403G >>> 3) != 0) {
                return iM8403G;
            }
            throw new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        /* JADX INFO: renamed from: y */
        public final int mo8389y() {
            return m8403G();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        /* JADX INFO: renamed from: z */
        public final long mo8390z() {
            return m8404H();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class StreamDecoder extends CodedInputStream {

        /* JADX INFO: renamed from: c */
        public final InputStream f23883c;

        /* JADX INFO: renamed from: d */
        public final byte[] f23884d;

        /* JADX INFO: renamed from: e */
        public int f23885e;

        /* JADX INFO: renamed from: f */
        public int f23886f;

        /* JADX INFO: renamed from: g */
        public int f23887g;

        /* JADX INFO: renamed from: h */
        public int f23888h;

        /* JADX INFO: renamed from: i */
        public int f23889i;

        /* JADX INFO: renamed from: j */
        public int f23890j = Integer.MAX_VALUE;

        /* JADX INFO: compiled from: Proguard */
        public interface RefillCallback {
        }

        /* JADX INFO: compiled from: Proguard */
        public class SkippedDataSink implements RefillCallback {
        }

        public StreamDecoder(InputStream inputStream) {
            Charset charset = Internal.f24003a;
            this.f23883c = inputStream;
            this.f23884d = new byte[4096];
            this.f23885e = 0;
            this.f23887g = 0;
            this.f23889i = 0;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        /* JADX INFO: renamed from: A */
        public final boolean mo8367A(int i) throws InvalidProtocolBufferException {
            int iMo8388x;
            int i2 = i & 7;
            int i3 = 0;
            if (i2 == 0) {
                int i4 = this.f23885e - this.f23887g;
                byte[] bArr = this.f23884d;
                if (i4 >= 10) {
                    while (i3 < 10) {
                        int i5 = this.f23887g;
                        this.f23887g = i5 + 1;
                        if (bArr[i5] < 0) {
                            i3++;
                        }
                    }
                    throw InvalidProtocolBufferException.m8521d();
                }
                while (i3 < 10) {
                    if (this.f23887g == this.f23885e) {
                        m8416K(1);
                    }
                    int i6 = this.f23887g;
                    this.f23887g = i6 + 1;
                    if (bArr[i6] < 0) {
                        i3++;
                    }
                }
                throw InvalidProtocolBufferException.m8521d();
                return true;
            }
            if (i2 == 1) {
                m8417L(8);
                return true;
            }
            if (i2 == 2) {
                m8417L(m8412G());
                return true;
            }
            if (i2 != 3) {
                if (i2 == 4) {
                    return false;
                }
                if (i2 != 5) {
                    throw InvalidProtocolBufferException.m8520c();
                }
                m8417L(4);
                return true;
            }
            do {
                iMo8388x = mo8388x();
                if (iMo8388x == 0) {
                    break;
                }
            } while (mo8367A(iMo8388x));
            mo8368a(((i >>> 3) << 3) | 4);
            return true;
        }

        /* JADX INFO: renamed from: B */
        public final byte[] m8407B(int i) throws IOException {
            byte[] bArrM8408C = m8408C(i);
            if (bArrM8408C != null) {
                return bArrM8408C;
            }
            int i2 = this.f23887g;
            int i3 = this.f23885e;
            int length = i3 - i2;
            this.f23889i += i3;
            this.f23887g = 0;
            this.f23885e = 0;
            ArrayList<byte[]> arrayListM8409D = m8409D(i - length);
            byte[] bArr = new byte[i];
            System.arraycopy(this.f23884d, i2, bArr, 0, length);
            for (byte[] bArr2 : arrayListM8409D) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return bArr;
        }

        /* JADX INFO: renamed from: C */
        public final byte[] m8408C(int i) throws IOException {
            if (i == 0) {
                return Internal.f24004b;
            }
            if (i < 0) {
                throw InvalidProtocolBufferException.m8522e();
            }
            int i2 = this.f23889i;
            int i3 = this.f23887g;
            int i4 = i2 + i3 + i;
            if (i4 - Integer.MAX_VALUE > 0) {
                throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
            }
            int i5 = this.f23890j;
            if (i4 > i5) {
                m8417L((i5 - i2) - i3);
                throw InvalidProtocolBufferException.m8524g();
            }
            int i6 = this.f23885e - i3;
            int i7 = i - i6;
            InputStream inputStream = this.f23883c;
            if (i7 >= 4096 && i7 > inputStream.available()) {
                return null;
            }
            byte[] bArr = new byte[i];
            System.arraycopy(this.f23884d, this.f23887g, bArr, 0, i6);
            this.f23889i += this.f23885e;
            this.f23887g = 0;
            this.f23885e = 0;
            while (i6 < i) {
                int i8 = inputStream.read(bArr, i6, i - i6);
                if (i8 == -1) {
                    throw InvalidProtocolBufferException.m8524g();
                }
                this.f23889i += i8;
                i6 += i8;
            }
            return bArr;
        }

        /* JADX INFO: renamed from: D */
        public final ArrayList m8409D(int i) throws IOException {
            ArrayList arrayList = new ArrayList();
            while (i > 0) {
                int iMin = Math.min(i, 4096);
                byte[] bArr = new byte[iMin];
                int i2 = 0;
                while (i2 < iMin) {
                    int i3 = this.f23883c.read(bArr, i2, iMin - i2);
                    if (i3 == -1) {
                        throw InvalidProtocolBufferException.m8524g();
                    }
                    this.f23889i += i3;
                    i2 += i3;
                }
                i -= iMin;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        /* JADX INFO: renamed from: E */
        public final int m8410E() throws InvalidProtocolBufferException {
            int i = this.f23887g;
            if (this.f23885e - i < 4) {
                m8416K(4);
                i = this.f23887g;
            }
            this.f23887g = i + 4;
            byte[] bArr = this.f23884d;
            return ((bArr[i + 3] & UnsignedBytes.MAX_VALUE) << 24) | (bArr[i] & UnsignedBytes.MAX_VALUE) | ((bArr[i + 1] & UnsignedBytes.MAX_VALUE) << 8) | ((bArr[i + 2] & UnsignedBytes.MAX_VALUE) << 16);
        }

        /* JADX INFO: renamed from: F */
        public final long m8411F() throws InvalidProtocolBufferException {
            int i = this.f23887g;
            if (this.f23885e - i < 8) {
                m8416K(8);
                i = this.f23887g;
            }
            this.f23887g = i + 8;
            byte[] bArr = this.f23884d;
            return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
        }

        /* JADX INFO: renamed from: G */
        public final int m8412G() {
            int i;
            int i2 = this.f23887g;
            int i3 = this.f23885e;
            if (i3 != i2) {
                int i4 = i2 + 1;
                byte[] bArr = this.f23884d;
                byte b2 = bArr[i2];
                if (b2 >= 0) {
                    this.f23887g = i4;
                    return b2;
                }
                if (i3 - i4 >= 9) {
                    int i5 = i2 + 2;
                    int i6 = (bArr[i4] << 7) ^ b2;
                    if (i6 < 0) {
                        i = i6 ^ (-128);
                    } else {
                        int i7 = i2 + 3;
                        int i8 = (bArr[i5] << Ascii.f42544SO) ^ i6;
                        if (i8 >= 0) {
                            i = i8 ^ 16256;
                        } else {
                            int i9 = i2 + 4;
                            int i10 = i8 ^ (bArr[i7] << Ascii.NAK);
                            if (i10 < 0) {
                                i = (-2080896) ^ i10;
                            } else {
                                i7 = i2 + 5;
                                byte b3 = bArr[i9];
                                int i11 = (i10 ^ (b3 << Ascii.f42537FS)) ^ 266354560;
                                if (b3 < 0) {
                                    i9 = i2 + 6;
                                    if (bArr[i7] < 0) {
                                        i7 = i2 + 7;
                                        if (bArr[i9] < 0) {
                                            i9 = i2 + 8;
                                            if (bArr[i7] < 0) {
                                                i7 = i2 + 9;
                                                if (bArr[i9] < 0) {
                                                    int i12 = i2 + 10;
                                                    if (bArr[i7] >= 0) {
                                                        i5 = i12;
                                                        i = i11;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i = i11;
                                }
                                i = i11;
                            }
                            i5 = i9;
                        }
                        i5 = i7;
                    }
                    this.f23887g = i5;
                    return i;
                }
            }
            return (int) m8414I();
        }

        /* JADX INFO: renamed from: H */
        public final long m8413H() {
            long j;
            long j2;
            long j3;
            long j4;
            int i = this.f23887g;
            int i2 = this.f23885e;
            if (i2 != i) {
                int i3 = i + 1;
                byte[] bArr = this.f23884d;
                byte b2 = bArr[i];
                if (b2 >= 0) {
                    this.f23887g = i3;
                    return b2;
                }
                if (i2 - i3 >= 9) {
                    int i4 = i + 2;
                    int i5 = (bArr[i3] << 7) ^ b2;
                    if (i5 < 0) {
                        j = i5 ^ (-128);
                    } else {
                        int i6 = i + 3;
                        int i7 = (bArr[i4] << Ascii.f42544SO) ^ i5;
                        if (i7 >= 0) {
                            j = i7 ^ 16256;
                            i4 = i6;
                        } else {
                            int i8 = i + 4;
                            int i9 = i7 ^ (bArr[i6] << Ascii.NAK);
                            if (i9 < 0) {
                                j4 = (-2080896) ^ i9;
                            } else {
                                long j5 = i9;
                                i4 = i + 5;
                                long j6 = j5 ^ (((long) bArr[i8]) << 28);
                                if (j6 >= 0) {
                                    j3 = 266354560;
                                } else {
                                    i8 = i + 6;
                                    long j7 = j6 ^ (((long) bArr[i4]) << 35);
                                    if (j7 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        i4 = i + 7;
                                        j6 = j7 ^ (((long) bArr[i8]) << 42);
                                        if (j6 >= 0) {
                                            j3 = 4363953127296L;
                                        } else {
                                            i8 = i + 8;
                                            j7 = j6 ^ (((long) bArr[i4]) << 49);
                                            if (j7 < 0) {
                                                j2 = -558586000294016L;
                                            } else {
                                                i4 = i + 9;
                                                long j8 = (j7 ^ (((long) bArr[i8]) << 56)) ^ 71499008037633920L;
                                                if (j8 < 0) {
                                                    int i10 = i + 10;
                                                    if (bArr[i4] >= 0) {
                                                        i4 = i10;
                                                    }
                                                }
                                                j = j8;
                                            }
                                        }
                                    }
                                    j4 = j2 ^ j7;
                                }
                                j = j3 ^ j6;
                            }
                            i4 = i8;
                            j = j4;
                        }
                    }
                    this.f23887g = i4;
                    return j;
                }
            }
            return m8414I();
        }

        /* JADX INFO: renamed from: I */
        public final long m8414I() throws InvalidProtocolBufferException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                if (this.f23887g == this.f23885e) {
                    m8416K(1);
                }
                int i2 = this.f23887g;
                this.f23887g = i2 + 1;
                byte b2 = this.f23884d[i2];
                j |= ((long) (b2 & Ascii.DEL)) << i;
                if ((b2 & UnsignedBytes.MAX_POWER_OF_TWO) == 0) {
                    return j;
                }
            }
            throw InvalidProtocolBufferException.m8521d();
        }

        /* JADX INFO: renamed from: J */
        public final void m8415J() {
            int i = this.f23885e + this.f23886f;
            this.f23885e = i;
            int i2 = this.f23889i + i;
            int i3 = this.f23890j;
            if (i2 <= i3) {
                this.f23886f = 0;
                return;
            }
            int i4 = i2 - i3;
            this.f23886f = i4;
            this.f23885e = i - i4;
        }

        /* JADX INFO: renamed from: K */
        public final void m8416K(int i) throws InvalidProtocolBufferException {
            if (m8418M(i)) {
                return;
            }
            if (i <= (Integer.MAX_VALUE - this.f23889i) - this.f23887g) {
                throw InvalidProtocolBufferException.m8524g();
            }
            throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }

        /* JADX INFO: renamed from: L */
        public final void m8417L(int i) throws InvalidProtocolBufferException {
            int i2 = this.f23885e;
            int i3 = this.f23887g;
            if (i <= i2 - i3 && i >= 0) {
                this.f23887g = i3 + i;
                return;
            }
            InputStream inputStream = this.f23883c;
            if (i < 0) {
                throw InvalidProtocolBufferException.m8522e();
            }
            int i4 = this.f23889i;
            int i5 = i4 + i3;
            int i6 = i5 + i;
            int i7 = this.f23890j;
            if (i6 > i7) {
                m8417L((i7 - i4) - i3);
                throw InvalidProtocolBufferException.m8524g();
            }
            this.f23889i = i5;
            int i8 = i2 - i3;
            this.f23885e = 0;
            this.f23887g = 0;
            while (i8 < i) {
                long j = i - i8;
                try {
                    long jSkip = inputStream.skip(j);
                    if (jSkip < 0 || jSkip > j) {
                        throw new IllegalStateException(inputStream.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i8 += (int) jSkip;
                    }
                } finally {
                    this.f23889i += i8;
                    m8415J();
                }
            }
            if (i8 >= i) {
                return;
            }
            int i9 = this.f23885e;
            int i10 = i9 - this.f23887g;
            this.f23887g = i9;
            m8416K(1);
            while (true) {
                int i11 = i - i10;
                int i12 = this.f23885e;
                if (i11 <= i12) {
                    this.f23887g = i11;
                    return;
                } else {
                    i10 += i12;
                    this.f23887g = i12;
                    m8416K(1);
                }
            }
        }

        /* JADX INFO: renamed from: M */
        public final boolean m8418M(int i) throws IOException {
            int i2 = this.f23887g;
            int i3 = i2 + i;
            int i4 = this.f23885e;
            if (i3 <= i4) {
                throw new IllegalStateException(AbstractC0000a.m10g(i, "refillBuffer() called when ", " bytes were already available in buffer"));
            }
            int i5 = this.f23889i;
            if (i <= (Integer.MAX_VALUE - i5) - i2 && i5 + i2 + i <= this.f23890j) {
                byte[] bArr = this.f23884d;
                if (i2 > 0) {
                    if (i4 > i2) {
                        System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                    }
                    this.f23889i += i2;
                    this.f23885e -= i2;
                    this.f23887g = 0;
                }
                int i6 = this.f23885e;
                int iMin = Math.min(bArr.length - i6, (Integer.MAX_VALUE - this.f23889i) - i6);
                InputStream inputStream = this.f23883c;
                int i7 = inputStream.read(bArr, i6, iMin);
                if (i7 == 0 || i7 < -1 || i7 > bArr.length) {
                    throw new IllegalStateException(inputStream.getClass() + "#read(byte[]) returned invalid result: " + i7 + "\nThe InputStream implementation is buggy.");
                }
                if (i7 > 0) {
                    this.f23885e += i7;
                    m8415J();
                    if (this.f23885e >= i) {
                        return true;
                    }
                    return m8418M(i);
                }
            }
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        /* JADX INFO: renamed from: a */
        public final void mo8368a(int i) throws InvalidProtocolBufferException {
            if (this.f23888h != i) {
                throw InvalidProtocolBufferException.m8518a();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        /* JADX INFO: renamed from: d */
        public final int mo8369d() {
            return this.f23889i + this.f23887g;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        /* JADX INFO: renamed from: e */
        public final boolean mo8370e() {
            return this.f23887g == this.f23885e && !m8418M(1);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        /* JADX INFO: renamed from: g */
        public final void mo8371g(int i) {
            this.f23890j = i;
            m8415J();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        /* JADX INFO: renamed from: h */
        public final int mo8372h(int i) throws InvalidProtocolBufferException {
            if (i < 0) {
                throw InvalidProtocolBufferException.m8522e();
            }
            int i2 = this.f23889i + this.f23887g + i;
            int i3 = this.f23890j;
            if (i2 > i3) {
                throw InvalidProtocolBufferException.m8524g();
            }
            this.f23890j = i2;
            m8415J();
            return i3;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        /* JADX INFO: renamed from: i */
        public final boolean mo8373i() {
            return m8413H() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        /* JADX INFO: renamed from: j */
        public final ByteString mo8374j() throws IOException {
            int iM8412G = m8412G();
            int i = this.f23885e;
            int i2 = this.f23887g;
            int i3 = i - i2;
            byte[] bArr = this.f23884d;
            if (iM8412G <= i3 && iM8412G > 0) {
                ByteString byteStringM8347f = ByteString.m8347f(bArr, i2, iM8412G);
                this.f23887g += iM8412G;
                return byteStringM8347f;
            }
            if (iM8412G == 0) {
                return ByteString.f23857b;
            }
            byte[] bArrM8408C = m8408C(iM8412G);
            if (bArrM8408C != null) {
                return ByteString.m8347f(bArrM8408C, 0, bArrM8408C.length);
            }
            int i4 = this.f23887g;
            int i5 = this.f23885e;
            int length = i5 - i4;
            this.f23889i += i5;
            this.f23887g = 0;
            this.f23885e = 0;
            ArrayList<byte[]> arrayListM8409D = m8409D(iM8412G - length);
            byte[] bArr2 = new byte[iM8412G];
            System.arraycopy(bArr, i4, bArr2, 0, length);
            for (byte[] bArr3 : arrayListM8409D) {
                System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
                length += bArr3.length;
            }
            ByteString byteString = ByteString.f23857b;
            return new ByteString.LiteralByteString(bArr2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        /* JADX INFO: renamed from: k */
        public final double mo8375k() {
            return Double.longBitsToDouble(m8411F());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        /* JADX INFO: renamed from: l */
        public final int mo8376l() {
            return m8412G();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        /* JADX INFO: renamed from: m */
        public final int mo8377m() {
            return m8410E();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        /* JADX INFO: renamed from: n */
        public final long mo8378n() {
            return m8411F();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        /* JADX INFO: renamed from: o */
        public final float mo8379o() {
            return Float.intBitsToFloat(m8410E());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        /* JADX INFO: renamed from: p */
        public final int mo8380p() {
            return m8412G();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        /* JADX INFO: renamed from: q */
        public final long mo8381q() {
            return m8413H();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        /* JADX INFO: renamed from: r */
        public final int mo8382r() {
            return m8410E();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        /* JADX INFO: renamed from: s */
        public final long mo8383s() {
            return m8411F();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        /* JADX INFO: renamed from: t */
        public final int mo8384t() {
            return CodedInputStream.m8364b(m8412G());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        /* JADX INFO: renamed from: u */
        public final long mo8385u() {
            return CodedInputStream.m8365c(m8413H());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        /* JADX INFO: renamed from: v */
        public final String mo8386v() throws InvalidProtocolBufferException {
            int iM8412G = m8412G();
            byte[] bArr = this.f23884d;
            if (iM8412G > 0) {
                int i = this.f23885e;
                int i2 = this.f23887g;
                if (iM8412G <= i - i2) {
                    String str = new String(bArr, i2, iM8412G, Internal.f24003a);
                    this.f23887g += iM8412G;
                    return str;
                }
            }
            if (iM8412G == 0) {
                return "";
            }
            if (iM8412G > this.f23885e) {
                return new String(m8407B(iM8412G), Internal.f24003a);
            }
            m8416K(iM8412G);
            String str2 = new String(bArr, this.f23887g, iM8412G, Internal.f24003a);
            this.f23887g += iM8412G;
            return str2;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        /* JADX INFO: renamed from: w */
        public final String mo8387w() throws IOException {
            int iM8412G = m8412G();
            int i = this.f23887g;
            int i2 = this.f23885e;
            int i3 = i2 - i;
            byte[] bArrM8407B = this.f23884d;
            if (iM8412G <= i3 && iM8412G > 0) {
                this.f23887g = i + iM8412G;
            } else {
                if (iM8412G == 0) {
                    return "";
                }
                i = 0;
                if (iM8412G <= i2) {
                    m8416K(iM8412G);
                    this.f23887g = iM8412G;
                } else {
                    bArrM8407B = m8407B(iM8412G);
                }
            }
            return Utf8.f24162a.mo8713a(bArrM8407B, i, iM8412G);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        /* JADX INFO: renamed from: x */
        public final int mo8388x() throws InvalidProtocolBufferException {
            if (mo8370e()) {
                this.f23888h = 0;
                return 0;
            }
            int iM8412G = m8412G();
            this.f23888h = iM8412G;
            if ((iM8412G >>> 3) != 0) {
                return iM8412G;
            }
            throw new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        /* JADX INFO: renamed from: y */
        public final int mo8389y() {
            return m8412G();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        /* JADX INFO: renamed from: z */
        public final long mo8390z() {
            return m8413H();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class UnsafeDirectNioDecoder extends CodedInputStream {

        /* JADX INFO: renamed from: c */
        public long f23891c;

        /* JADX INFO: renamed from: d */
        public long f23892d;

        /* JADX INFO: renamed from: e */
        public int f23893e;

        /* JADX INFO: renamed from: f */
        public int f23894f;

        /* JADX INFO: renamed from: g */
        public int f23895g;

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        /* JADX INFO: renamed from: A */
        public final boolean mo8367A(int i) throws InvalidProtocolBufferException {
            int iMo8388x;
            int i2 = i & 7;
            int i3 = 0;
            if (i2 == 0) {
                if (((int) (this.f23891c - this.f23892d)) >= 10) {
                    while (i3 < 10) {
                        long j = this.f23892d;
                        this.f23892d = j + 1;
                        if (UnsafeUtil.f24155d.mo8682f(j) < 0) {
                            i3++;
                        }
                    }
                    throw InvalidProtocolBufferException.m8521d();
                }
                while (i3 < 10) {
                    long j2 = this.f23892d;
                    if (j2 == this.f23891c) {
                        throw InvalidProtocolBufferException.m8524g();
                    }
                    this.f23892d = j2 + 1;
                    if (UnsafeUtil.f24155d.mo8682f(j2) < 0) {
                        i3++;
                    }
                }
                throw InvalidProtocolBufferException.m8521d();
                return true;
            }
            if (i2 == 1) {
                m8425H(8);
                return true;
            }
            if (i2 == 2) {
                m8425H(m8421D());
                return true;
            }
            if (i2 != 3) {
                if (i2 == 4) {
                    return false;
                }
                if (i2 != 5) {
                    throw InvalidProtocolBufferException.m8520c();
                }
                m8425H(4);
                return true;
            }
            do {
                iMo8388x = mo8388x();
                if (iMo8388x == 0) {
                    break;
                }
            } while (mo8367A(iMo8388x));
            mo8368a(((i >>> 3) << 3) | 4);
            return true;
        }

        /* JADX INFO: renamed from: B */
        public final int m8419B() throws InvalidProtocolBufferException {
            long j = this.f23892d;
            if (this.f23891c - j < 4) {
                throw InvalidProtocolBufferException.m8524g();
            }
            this.f23892d = 4 + j;
            UnsafeUtil.MemoryAccessor memoryAccessor = UnsafeUtil.f24155d;
            return ((memoryAccessor.mo8682f(j + 3) & UnsignedBytes.MAX_VALUE) << 24) | (memoryAccessor.mo8682f(j) & UnsignedBytes.MAX_VALUE) | ((memoryAccessor.mo8682f(1 + j) & UnsignedBytes.MAX_VALUE) << 8) | ((memoryAccessor.mo8682f(2 + j) & UnsignedBytes.MAX_VALUE) << 16);
        }

        /* JADX INFO: renamed from: C */
        public final long m8420C() throws InvalidProtocolBufferException {
            long j = this.f23892d;
            if (this.f23891c - j < 8) {
                throw InvalidProtocolBufferException.m8524g();
            }
            this.f23892d = 8 + j;
            UnsafeUtil.MemoryAccessor memoryAccessor = UnsafeUtil.f24155d;
            return ((((long) memoryAccessor.mo8682f(j + 7)) & 255) << 56) | (((long) memoryAccessor.mo8682f(j)) & 255) | ((((long) memoryAccessor.mo8682f(1 + j)) & 255) << 8) | ((((long) memoryAccessor.mo8682f(2 + j)) & 255) << 16) | ((((long) memoryAccessor.mo8682f(3 + j)) & 255) << 24) | ((((long) memoryAccessor.mo8682f(4 + j)) & 255) << 32) | ((((long) memoryAccessor.mo8682f(5 + j)) & 255) << 40) | ((((long) memoryAccessor.mo8682f(6 + j)) & 255) << 48);
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0091, code lost:
        
            if (r4.mo8682f(r8) < 0) goto L34;
         */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0099 A[PHI: r6
          0x0099: PHI (r6v7 long) = (r6v6 long), (r6v8 long), (r6v10 long) binds: [B:25:0x006d, B:29:0x0080, B:33:0x0091] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX INFO: renamed from: D */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final int m8421D() {
            int i;
            long j = this.f23892d;
            if (this.f23891c != j) {
                long j2 = 1 + j;
                UnsafeUtil.MemoryAccessor memoryAccessor = UnsafeUtil.f24155d;
                byte bMo8682f = memoryAccessor.mo8682f(j);
                if (bMo8682f >= 0) {
                    this.f23892d = j2;
                    return bMo8682f;
                }
                if (this.f23891c - j2 >= 9) {
                    long j3 = 2 + j;
                    int iMo8682f = (memoryAccessor.mo8682f(j2) << 7) ^ bMo8682f;
                    if (iMo8682f < 0) {
                        i = iMo8682f ^ (-128);
                    } else {
                        long j4 = 3 + j;
                        int iMo8682f2 = iMo8682f ^ (memoryAccessor.mo8682f(j3) << Ascii.f42544SO);
                        if (iMo8682f2 >= 0) {
                            i = iMo8682f2 ^ 16256;
                        } else {
                            j3 = j + 4;
                            int iMo8682f3 = iMo8682f2 ^ (memoryAccessor.mo8682f(j4) << Ascii.NAK);
                            if (iMo8682f3 < 0) {
                                i = (-2080896) ^ iMo8682f3;
                            } else {
                                j4 = 5 + j;
                                byte bMo8682f2 = memoryAccessor.mo8682f(j3);
                                int i2 = (iMo8682f3 ^ (bMo8682f2 << Ascii.f42537FS)) ^ 266354560;
                                if (bMo8682f2 < 0) {
                                    j3 = j + 6;
                                    if (memoryAccessor.mo8682f(j4) < 0) {
                                        j4 = 7 + j;
                                        if (memoryAccessor.mo8682f(j3) < 0) {
                                            j3 = j + 8;
                                            if (memoryAccessor.mo8682f(j4) < 0) {
                                                long j5 = 9 + j;
                                                if (memoryAccessor.mo8682f(j3) < 0) {
                                                    j3 = j + 10;
                                                } else {
                                                    i = i2;
                                                    j3 = j5;
                                                }
                                            } else {
                                                i = i2;
                                            }
                                        }
                                    }
                                }
                                i = i2;
                            }
                        }
                        j3 = j4;
                    }
                    this.f23892d = j3;
                    return i;
                }
            }
            return (int) m8423F();
        }

        /* JADX INFO: renamed from: E */
        public final long m8422E() {
            long j;
            long j2;
            long j3;
            int i;
            long j4 = this.f23892d;
            if (this.f23891c != j4) {
                long j5 = 1 + j4;
                UnsafeUtil.MemoryAccessor memoryAccessor = UnsafeUtil.f24155d;
                byte bMo8682f = memoryAccessor.mo8682f(j4);
                if (bMo8682f >= 0) {
                    this.f23892d = j5;
                    return bMo8682f;
                }
                if (this.f23891c - j5 >= 9) {
                    long j6 = 2 + j4;
                    int iMo8682f = (memoryAccessor.mo8682f(j5) << 7) ^ bMo8682f;
                    if (iMo8682f >= 0) {
                        long j7 = 3 + j4;
                        int iMo8682f2 = iMo8682f ^ (memoryAccessor.mo8682f(j6) << Ascii.f42544SO);
                        if (iMo8682f2 >= 0) {
                            j = iMo8682f2 ^ 16256;
                        } else {
                            j6 = j4 + 4;
                            int iMo8682f3 = iMo8682f2 ^ (memoryAccessor.mo8682f(j7) << Ascii.NAK);
                            if (iMo8682f3 < 0) {
                                i = (-2080896) ^ iMo8682f3;
                            } else {
                                j7 = 5 + j4;
                                long jMo8682f = ((long) iMo8682f3) ^ (((long) memoryAccessor.mo8682f(j6)) << 28);
                                if (jMo8682f < 0) {
                                    long j8 = 6 + j4;
                                    long jMo8682f2 = jMo8682f ^ (((long) memoryAccessor.mo8682f(j7)) << 35);
                                    if (jMo8682f2 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        j7 = 7 + j4;
                                        jMo8682f = jMo8682f2 ^ (((long) memoryAccessor.mo8682f(j8)) << 42);
                                        if (jMo8682f >= 0) {
                                            j3 = 4363953127296L;
                                        } else {
                                            j8 = 8 + j4;
                                            jMo8682f2 = jMo8682f ^ (((long) memoryAccessor.mo8682f(j7)) << 49);
                                            if (jMo8682f2 >= 0) {
                                                long j9 = j4 + 9;
                                                long jMo8682f3 = (jMo8682f2 ^ (((long) memoryAccessor.mo8682f(j8)) << 56)) ^ 71499008037633920L;
                                                if (jMo8682f3 < 0) {
                                                    long j10 = j4 + 10;
                                                    if (memoryAccessor.mo8682f(j9) >= 0) {
                                                        j6 = j10;
                                                        j = jMo8682f3;
                                                    }
                                                } else {
                                                    j = jMo8682f3;
                                                    j6 = j9;
                                                }
                                                this.f23892d = j6;
                                                return j;
                                            }
                                            j2 = -558586000294016L;
                                        }
                                    }
                                    j = j2 ^ jMo8682f2;
                                    j6 = j8;
                                    this.f23892d = j6;
                                    return j;
                                }
                                j3 = 266354560;
                                j = j3 ^ jMo8682f;
                            }
                        }
                        j6 = j7;
                        this.f23892d = j6;
                        return j;
                    }
                    i = iMo8682f ^ (-128);
                    j = i;
                    this.f23892d = j6;
                    return j;
                }
            }
            return m8423F();
        }

        /* JADX INFO: renamed from: F */
        public final long m8423F() throws InvalidProtocolBufferException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                long j2 = this.f23892d;
                if (j2 == this.f23891c) {
                    throw InvalidProtocolBufferException.m8524g();
                }
                this.f23892d = 1 + j2;
                byte bMo8682f = UnsafeUtil.f24155d.mo8682f(j2);
                j |= ((long) (bMo8682f & Ascii.DEL)) << i;
                if ((bMo8682f & UnsignedBytes.MAX_POWER_OF_TWO) == 0) {
                    return j;
                }
            }
            throw InvalidProtocolBufferException.m8521d();
        }

        /* JADX INFO: renamed from: G */
        public final void m8424G() {
            long j = this.f23891c + ((long) this.f23893e);
            this.f23891c = j;
            int i = (int) (j - 0);
            int i2 = this.f23895g;
            if (i <= i2) {
                this.f23893e = 0;
                return;
            }
            int i3 = i - i2;
            this.f23893e = i3;
            this.f23891c = j - ((long) i3);
        }

        /* JADX INFO: renamed from: H */
        public final void m8425H(int i) throws InvalidProtocolBufferException {
            if (i >= 0) {
                long j = this.f23891c;
                long j2 = this.f23892d;
                if (i <= ((int) (j - j2))) {
                    this.f23892d = j2 + ((long) i);
                    return;
                }
            }
            if (i >= 0) {
                throw InvalidProtocolBufferException.m8524g();
            }
            throw InvalidProtocolBufferException.m8522e();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        /* JADX INFO: renamed from: a */
        public final void mo8368a(int i) throws InvalidProtocolBufferException {
            if (this.f23894f != i) {
                throw InvalidProtocolBufferException.m8518a();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        /* JADX INFO: renamed from: d */
        public final int mo8369d() {
            return (int) (this.f23892d - 0);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        /* JADX INFO: renamed from: e */
        public final boolean mo8370e() {
            return this.f23892d == this.f23891c;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        /* JADX INFO: renamed from: g */
        public final void mo8371g(int i) {
            this.f23895g = i;
            m8424G();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        /* JADX INFO: renamed from: h */
        public final int mo8372h(int i) throws InvalidProtocolBufferException {
            if (i < 0) {
                throw InvalidProtocolBufferException.m8522e();
            }
            int iMo8369d = i + mo8369d();
            int i2 = this.f23895g;
            if (iMo8369d > i2) {
                throw InvalidProtocolBufferException.m8524g();
            }
            this.f23895g = iMo8369d;
            m8424G();
            return i2;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        /* JADX INFO: renamed from: i */
        public final boolean mo8373i() {
            return m8422E() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        /* JADX INFO: renamed from: j */
        public final ByteString mo8374j() throws InvalidProtocolBufferException {
            int iM8421D = m8421D();
            if (iM8421D > 0) {
                long j = this.f23891c;
                long j2 = this.f23892d;
                if (iM8421D <= ((int) (j - j2))) {
                    byte[] bArr = new byte[iM8421D];
                    long j3 = iM8421D;
                    UnsafeUtil.f24155d.mo8679c(j2, bArr, 0L, j3);
                    this.f23892d += j3;
                    ByteString byteString = ByteString.f23857b;
                    return new ByteString.LiteralByteString(bArr);
                }
            }
            if (iM8421D == 0) {
                return ByteString.f23857b;
            }
            if (iM8421D < 0) {
                throw InvalidProtocolBufferException.m8522e();
            }
            throw InvalidProtocolBufferException.m8524g();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        /* JADX INFO: renamed from: k */
        public final double mo8375k() {
            return Double.longBitsToDouble(m8420C());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        /* JADX INFO: renamed from: l */
        public final int mo8376l() {
            return m8421D();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        /* JADX INFO: renamed from: m */
        public final int mo8377m() {
            return m8419B();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        /* JADX INFO: renamed from: n */
        public final long mo8378n() {
            return m8420C();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        /* JADX INFO: renamed from: o */
        public final float mo8379o() {
            return Float.intBitsToFloat(m8419B());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        /* JADX INFO: renamed from: p */
        public final int mo8380p() {
            return m8421D();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        /* JADX INFO: renamed from: q */
        public final long mo8381q() {
            return m8422E();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        /* JADX INFO: renamed from: r */
        public final int mo8382r() {
            return m8419B();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        /* JADX INFO: renamed from: s */
        public final long mo8383s() {
            return m8420C();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        /* JADX INFO: renamed from: t */
        public final int mo8384t() {
            return CodedInputStream.m8364b(m8421D());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        /* JADX INFO: renamed from: u */
        public final long mo8385u() {
            return CodedInputStream.m8365c(m8422E());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        /* JADX INFO: renamed from: v */
        public final String mo8386v() throws InvalidProtocolBufferException {
            int iM8421D = m8421D();
            if (iM8421D > 0) {
                long j = this.f23891c;
                long j2 = this.f23892d;
                if (iM8421D <= ((int) (j - j2))) {
                    byte[] bArr = new byte[iM8421D];
                    long j3 = iM8421D;
                    UnsafeUtil.f24155d.mo8679c(j2, bArr, 0L, j3);
                    String str = new String(bArr, Internal.f24003a);
                    this.f23892d += j3;
                    return str;
                }
            }
            if (iM8421D == 0) {
                return "";
            }
            if (iM8421D < 0) {
                throw InvalidProtocolBufferException.m8522e();
            }
            throw InvalidProtocolBufferException.m8524g();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        /* JADX INFO: renamed from: w */
        public final String mo8387w() throws InvalidProtocolBufferException {
            int iM8421D = m8421D();
            if (iM8421D > 0) {
                long j = this.f23891c;
                long j2 = this.f23892d;
                if (iM8421D <= ((int) (j - j2))) {
                    String strM8703c = Utf8.m8703c(null, (int) (j2 - 0), iM8421D);
                    this.f23892d += (long) iM8421D;
                    return strM8703c;
                }
            }
            if (iM8421D == 0) {
                return "";
            }
            if (iM8421D <= 0) {
                throw InvalidProtocolBufferException.m8522e();
            }
            throw InvalidProtocolBufferException.m8524g();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        /* JADX INFO: renamed from: x */
        public final int mo8388x() throws InvalidProtocolBufferException {
            if (mo8370e()) {
                this.f23894f = 0;
                return 0;
            }
            int iM8421D = m8421D();
            this.f23894f = iM8421D;
            if ((iM8421D >>> 3) != 0) {
                return iM8421D;
            }
            throw new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        /* JADX INFO: renamed from: y */
        public final int mo8389y() {
            return m8421D();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        /* JADX INFO: renamed from: z */
        public final long mo8390z() {
            return m8422E();
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m8364b(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    /* JADX INFO: renamed from: c */
    public static long m8365c(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    /* JADX INFO: renamed from: f */
    public static CodedInputStream m8366f(InputStream inputStream) {
        return new StreamDecoder(inputStream);
    }

    /* JADX INFO: renamed from: A */
    public abstract boolean mo8367A(int i);

    /* JADX INFO: renamed from: a */
    public abstract void mo8368a(int i);

    /* JADX INFO: renamed from: d */
    public abstract int mo8369d();

    /* JADX INFO: renamed from: e */
    public abstract boolean mo8370e();

    /* JADX INFO: renamed from: g */
    public abstract void mo8371g(int i);

    /* JADX INFO: renamed from: h */
    public abstract int mo8372h(int i);

    /* JADX INFO: renamed from: i */
    public abstract boolean mo8373i();

    /* JADX INFO: renamed from: j */
    public abstract ByteString mo8374j();

    /* JADX INFO: renamed from: k */
    public abstract double mo8375k();

    /* JADX INFO: renamed from: l */
    public abstract int mo8376l();

    /* JADX INFO: renamed from: m */
    public abstract int mo8377m();

    /* JADX INFO: renamed from: n */
    public abstract long mo8378n();

    /* JADX INFO: renamed from: o */
    public abstract float mo8379o();

    /* JADX INFO: renamed from: p */
    public abstract int mo8380p();

    /* JADX INFO: renamed from: q */
    public abstract long mo8381q();

    /* JADX INFO: renamed from: r */
    public abstract int mo8382r();

    /* JADX INFO: renamed from: s */
    public abstract long mo8383s();

    /* JADX INFO: renamed from: t */
    public abstract int mo8384t();

    /* JADX INFO: renamed from: u */
    public abstract long mo8385u();

    /* JADX INFO: renamed from: v */
    public abstract String mo8386v();

    /* JADX INFO: renamed from: w */
    public abstract String mo8387w();

    /* JADX INFO: renamed from: x */
    public abstract int mo8388x();

    /* JADX INFO: renamed from: y */
    public abstract int mo8389y();

    /* JADX INFO: renamed from: z */
    public abstract long mo8390z();
}
