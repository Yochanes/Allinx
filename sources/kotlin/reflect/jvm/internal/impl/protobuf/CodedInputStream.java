package kotlin.reflect.jvm.internal.impl.protobuf;

import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class CodedInputStream {

    /* JADX INFO: renamed from: c */
    public int f54084c;

    /* JADX INFO: renamed from: e */
    public final InputStream f54086e;

    /* JADX INFO: renamed from: f */
    public int f54087f;

    /* JADX INFO: renamed from: i */
    public int f54090i;

    /* JADX INFO: renamed from: h */
    public int f54089h = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: a */
    public final byte[] f54082a = new byte[4096];

    /* JADX INFO: renamed from: b */
    public int f54083b = 0;

    /* JADX INFO: renamed from: d */
    public int f54085d = 0;

    /* JADX INFO: renamed from: g */
    public int f54088g = 0;

    /* JADX INFO: compiled from: Proguard */
    public interface RefillCallback {
    }

    public CodedInputStream(InputStream inputStream) {
        this.f54086e = inputStream;
    }

    /* JADX INFO: renamed from: a */
    public final void m19639a(int i) throws InvalidProtocolBufferException {
        if (this.f54087f != i) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m19640b() {
        int i = this.f54089h;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - (this.f54088g + this.f54085d);
    }

    /* JADX INFO: renamed from: c */
    public final void m19641c(int i) {
        this.f54089h = i;
        m19653o();
    }

    /* JADX INFO: renamed from: d */
    public final int m19642d(int i) throws InvalidProtocolBufferException {
        if (i < 0) {
            throw new InvalidProtocolBufferException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i2 = this.f54088g + this.f54085d + i;
        int i3 = this.f54089h;
        if (i2 > i3) {
            throw InvalidProtocolBufferException.m19710a();
        }
        this.f54089h = i2;
        m19653o();
        return i3;
    }

    /* JADX INFO: renamed from: e */
    public final ByteString m19643e() {
        int iM19649k = m19649k();
        int i = this.f54083b;
        int i2 = this.f54085d;
        if (iM19649k > i - i2 || iM19649k <= 0) {
            return iM19649k == 0 ? ByteString.f54075a : new LiteralByteString(m19646h(iM19649k));
        }
        byte[] bArr = new byte[iM19649k];
        System.arraycopy(this.f54082a, i2, bArr, 0, iM19649k);
        LiteralByteString literalByteString = new LiteralByteString(bArr);
        this.f54085d += iM19649k;
        return literalByteString;
    }

    /* JADX INFO: renamed from: f */
    public final int m19644f() {
        return m19649k();
    }

    /* JADX INFO: renamed from: g */
    public final MessageLite m19645g(Parser parser, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        int iM19649k = m19649k();
        if (this.f54090i >= 64) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int iM19642d = m19642d(iM19649k);
        this.f54090i++;
        MessageLite messageLite = (MessageLite) parser.mo19417a(this, extensionRegistryLite);
        m19639a(0);
        this.f54090i--;
        m19641c(iM19642d);
        return messageLite;
    }

    /* JADX INFO: renamed from: h */
    public final byte[] m19646h(int i) throws InvalidProtocolBufferException {
        if (i <= 0) {
            if (i == 0) {
                return Internal.f54120a;
            }
            throw new InvalidProtocolBufferException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i2 = this.f54088g;
        int i3 = this.f54085d;
        int i4 = i2 + i3 + i;
        int i5 = this.f54089h;
        if (i4 > i5) {
            m19656r((i5 - i2) - i3);
            throw InvalidProtocolBufferException.m19710a();
        }
        byte[] bArr = this.f54082a;
        if (i < 4096) {
            byte[] bArr2 = new byte[i];
            int i6 = this.f54083b - i3;
            System.arraycopy(bArr, i3, bArr2, 0, i6);
            this.f54085d = this.f54083b;
            int i7 = i - i6;
            if (i7 > 0) {
                m19654p(i7);
            }
            System.arraycopy(bArr, 0, bArr2, i6, i7);
            this.f54085d = i7;
            return bArr2;
        }
        int i8 = this.f54083b;
        this.f54088g = i2 + i8;
        this.f54085d = 0;
        this.f54083b = 0;
        int length = i8 - i3;
        int i9 = i - length;
        ArrayList<byte[]> arrayList = new ArrayList();
        while (i9 > 0) {
            int iMin = Math.min(i9, 4096);
            byte[] bArr3 = new byte[iMin];
            int i10 = 0;
            while (i10 < iMin) {
                InputStream inputStream = this.f54086e;
                int i11 = inputStream == null ? -1 : inputStream.read(bArr3, i10, iMin - i10);
                if (i11 == -1) {
                    throw InvalidProtocolBufferException.m19710a();
                }
                this.f54088g += i11;
                i10 += i11;
            }
            i9 -= iMin;
            arrayList.add(bArr3);
        }
        byte[] bArr4 = new byte[i];
        System.arraycopy(bArr, i3, bArr4, 0, length);
        for (byte[] bArr5 : arrayList) {
            System.arraycopy(bArr5, 0, bArr4, length, bArr5.length);
            length += bArr5.length;
        }
        return bArr4;
    }

    /* JADX INFO: renamed from: i */
    public final int m19647i() throws InvalidProtocolBufferException {
        int i = this.f54085d;
        if (this.f54083b - i < 4) {
            m19654p(4);
            i = this.f54085d;
        }
        this.f54085d = i + 4;
        byte[] bArr = this.f54082a;
        return ((bArr[i + 3] & UnsignedBytes.MAX_VALUE) << 24) | (bArr[i] & UnsignedBytes.MAX_VALUE) | ((bArr[i + 1] & UnsignedBytes.MAX_VALUE) << 8) | ((bArr[i + 2] & UnsignedBytes.MAX_VALUE) << 16);
    }

    /* JADX INFO: renamed from: j */
    public final long m19648j() throws InvalidProtocolBufferException {
        int i = this.f54085d;
        if (this.f54083b - i < 8) {
            m19654p(8);
            i = this.f54085d;
        }
        this.f54085d = i + 8;
        byte[] bArr = this.f54082a;
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    /* JADX INFO: renamed from: k */
    public final int m19649k() {
        int i;
        int i2 = this.f54085d;
        int i3 = this.f54083b;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.f54082a;
            byte b2 = bArr[i2];
            if (b2 >= 0) {
                this.f54085d = i4;
                return b2;
            }
            if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                int i6 = (bArr[i4] << 7) ^ b2;
                long j = i6;
                if (j < 0) {
                    i = (int) ((-128) ^ j);
                } else {
                    int i7 = i2 + 3;
                    int i8 = (bArr[i5] << Ascii.f42544SO) ^ i6;
                    long j2 = i8;
                    if (j2 >= 0) {
                        i = (int) (16256 ^ j2);
                    } else {
                        int i9 = i2 + 4;
                        int i10 = i8 ^ (bArr[i7] << Ascii.NAK);
                        long j3 = i10;
                        if (j3 < 0) {
                            i = (int) ((-2080896) ^ j3);
                        } else {
                            i7 = i2 + 5;
                            byte b3 = bArr[i9];
                            int i11 = (int) (((long) (i10 ^ (b3 << Ascii.f42537FS))) ^ 266354560);
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
                this.f54085d = i5;
                return i;
            }
        }
        return (int) m19651m();
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b6, code lost:
    
        if (r3[r2] < 0) goto L39;
     */
    /* JADX INFO: renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long m19650l() {
        long j;
        long j2;
        long j3;
        int i = this.f54085d;
        int i2 = this.f54083b;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.f54082a;
            byte b2 = bArr[i];
            if (b2 >= 0) {
                this.f54085d = i3;
                return b2;
            }
            if (i2 - i3 >= 9) {
                int i4 = i + 2;
                long j4 = (bArr[i3] << 7) ^ b2;
                if (j4 >= 0) {
                    int i5 = i + 3;
                    long j5 = j4 ^ ((long) (bArr[i4] << Ascii.f42544SO));
                    if (j5 >= 0) {
                        j3 = 16256;
                    } else {
                        i4 = i + 4;
                        j4 = j5 ^ ((long) (bArr[i5] << Ascii.NAK));
                        if (j4 < 0) {
                            j2 = -2080896;
                        } else {
                            i5 = i + 5;
                            j5 = j4 ^ (((long) bArr[i4]) << 28);
                            if (j5 >= 0) {
                                j3 = 266354560;
                            } else {
                                i4 = i + 6;
                                j4 = j5 ^ (((long) bArr[i5]) << 35);
                                if (j4 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    i5 = i + 7;
                                    j5 = j4 ^ (((long) bArr[i4]) << 42);
                                    if (j5 >= 0) {
                                        j3 = 4363953127296L;
                                    } else {
                                        i4 = i + 8;
                                        j4 = j5 ^ (((long) bArr[i5]) << 49);
                                        if (j4 >= 0) {
                                            int i6 = i + 9;
                                            long j6 = (j4 ^ (((long) bArr[i4]) << 56)) ^ 71499008037633920L;
                                            i4 = j6 < 0 ? i + 10 : i6;
                                            j = j6;
                                            this.f54085d = i4;
                                            return j;
                                        }
                                        j2 = -558586000294016L;
                                    }
                                }
                            }
                        }
                    }
                    i4 = i5;
                    j = j3 ^ j5;
                    this.f54085d = i4;
                    return j;
                }
                j2 = -128;
                j = j2 ^ j4;
                this.f54085d = i4;
                return j;
            }
        }
        return m19651m();
    }

    /* JADX INFO: renamed from: m */
    public final long m19651m() throws InvalidProtocolBufferException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            if (this.f54085d == this.f54083b) {
                m19654p(1);
            }
            int i2 = this.f54085d;
            this.f54085d = i2 + 1;
            byte b2 = this.f54082a[i2];
            j |= ((long) (b2 & Ascii.DEL)) << i;
            if ((b2 & UnsignedBytes.MAX_POWER_OF_TWO) == 0) {
                return j;
            }
        }
        throw new InvalidProtocolBufferException("CodedInputStream encountered a malformed varint.");
    }

    /* JADX INFO: renamed from: n */
    public final int m19652n() throws InvalidProtocolBufferException {
        if (this.f54085d == this.f54083b && !m19657s(1)) {
            this.f54087f = 0;
            return 0;
        }
        int iM19649k = m19649k();
        this.f54087f = iM19649k;
        if ((iM19649k >>> 3) != 0) {
            return iM19649k;
        }
        throw new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
    }

    /* JADX INFO: renamed from: o */
    public final void m19653o() {
        int i = this.f54083b + this.f54084c;
        this.f54083b = i;
        int i2 = this.f54088g + i;
        int i3 = this.f54089h;
        if (i2 <= i3) {
            this.f54084c = 0;
            return;
        }
        int i4 = i2 - i3;
        this.f54084c = i4;
        this.f54083b = i - i4;
    }

    /* JADX INFO: renamed from: p */
    public final void m19654p(int i) throws InvalidProtocolBufferException {
        if (!m19657s(i)) {
            throw InvalidProtocolBufferException.m19710a();
        }
    }

    /* JADX INFO: renamed from: q */
    public final boolean m19655q(int i, CodedOutputStream codedOutputStream) throws InvalidProtocolBufferException {
        int iM19652n;
        int i2 = i & 7;
        if (i2 == 0) {
            long jM19650l = m19650l();
            codedOutputStream.m19679v(i);
            codedOutputStream.m19680w(jM19650l);
            return true;
        }
        if (i2 == 1) {
            long jM19648j = m19648j();
            codedOutputStream.m19679v(i);
            codedOutputStream.m19678u(jM19648j);
            return true;
        }
        if (i2 == 2) {
            ByteString byteStringM19643e = m19643e();
            codedOutputStream.m19679v(i);
            codedOutputStream.m19679v(byteStringM19643e.size());
            codedOutputStream.m19675r(byteStringM19643e);
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw new InvalidProtocolBufferException("Protocol message tag had invalid wire type.");
            }
            int iM19647i = m19647i();
            codedOutputStream.m19679v(i);
            codedOutputStream.m19677t(iM19647i);
            return true;
        }
        codedOutputStream.m19679v(i);
        do {
            iM19652n = m19652n();
            if (iM19652n == 0) {
                break;
            }
        } while (m19655q(iM19652n, codedOutputStream));
        int i3 = ((i >>> 3) << 3) | 4;
        m19639a(i3);
        codedOutputStream.m19679v(i3);
        return true;
    }

    /* JADX INFO: renamed from: r */
    public final void m19656r(int i) throws InvalidProtocolBufferException {
        int i2 = this.f54083b;
        int i3 = this.f54085d;
        int i4 = i2 - i3;
        if (i <= i4 && i >= 0) {
            this.f54085d = i3 + i;
            return;
        }
        if (i < 0) {
            throw new InvalidProtocolBufferException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i5 = this.f54088g;
        int i6 = i5 + i3 + i;
        int i7 = this.f54089h;
        if (i6 > i7) {
            m19656r((i7 - i5) - i3);
            throw InvalidProtocolBufferException.m19710a();
        }
        this.f54085d = i2;
        m19654p(1);
        while (true) {
            int i8 = i - i4;
            int i9 = this.f54083b;
            if (i8 <= i9) {
                this.f54085d = i8;
                return;
            } else {
                i4 += i9;
                this.f54085d = i9;
                m19654p(1);
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public final boolean m19657s(int i) throws IOException {
        InputStream inputStream;
        int i2 = this.f54085d;
        int i3 = i2 + i;
        int i4 = this.f54083b;
        if (i3 <= i4) {
            StringBuilder sb = new StringBuilder(77);
            sb.append("refillBuffer() called when ");
            sb.append(i);
            sb.append(" bytes were already available in buffer");
            throw new IllegalStateException(sb.toString());
        }
        if (this.f54088g + i2 + i <= this.f54089h && (inputStream = this.f54086e) != null) {
            byte[] bArr = this.f54082a;
            if (i2 > 0) {
                if (i4 > i2) {
                    System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                }
                this.f54088g += i2;
                this.f54083b -= i2;
                this.f54085d = 0;
            }
            int i5 = this.f54083b;
            int i6 = inputStream.read(bArr, i5, bArr.length - i5);
            if (i6 == 0 || i6 < -1 || i6 > bArr.length) {
                StringBuilder sb2 = new StringBuilder(102);
                sb2.append("InputStream#read(byte[]) returned invalid result: ");
                sb2.append(i6);
                sb2.append("\nThe InputStream implementation is buggy.");
                throw new IllegalStateException(sb2.toString());
            }
            if (i6 > 0) {
                this.f54083b += i6;
                if ((this.f54088g + i) - 67108864 > 0) {
                    throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
                }
                m19653o();
                if (this.f54083b >= i) {
                    return true;
                }
                return m19657s(i);
            }
        }
        return false;
    }
}
