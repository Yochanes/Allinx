package androidx.media3.common.util;

import androidx.compose.animation.AbstractC0455a;
import com.google.common.collect.ImmutableSet;
import com.google.common.primitives.Chars;
import com.google.common.primitives.Ints;
import com.google.common.primitives.UnsignedBytes;
import com.google.errorprone.annotations.CheckReturnValue;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@CheckReturnValue
@UnstableApi
public final class ParsableByteArray {

    /* JADX INFO: renamed from: d */
    public static final char[] f25641d = {'\r', '\n'};

    /* JADX INFO: renamed from: e */
    public static final char[] f25642e = {'\n'};

    /* JADX INFO: renamed from: f */
    public static final ImmutableSet f25643f = ImmutableSet.m14877of(StandardCharsets.US_ASCII, StandardCharsets.UTF_8, StandardCharsets.UTF_16, StandardCharsets.UTF_16BE, StandardCharsets.UTF_16LE);

    /* JADX INFO: renamed from: a */
    public byte[] f25644a;

    /* JADX INFO: renamed from: b */
    public int f25645b;

    /* JADX INFO: renamed from: c */
    public int f25646c;

    public ParsableByteArray() {
        this.f25644a = Util.f25667c;
    }

    /* JADX INFO: renamed from: A */
    public final int m9540A() {
        byte[] bArr = this.f25644a;
        int i = this.f25645b;
        int i2 = i + 1;
        this.f25645b = i2;
        int i3 = (bArr[i] & UnsignedBytes.MAX_VALUE) << 8;
        this.f25645b = i + 2;
        return (bArr[i2] & UnsignedBytes.MAX_VALUE) | i3;
    }

    /* JADX INFO: renamed from: B */
    public final long m9541B() {
        int i;
        int i2;
        long j = this.f25644a[this.f25645b];
        int i3 = 7;
        while (true) {
            if (i3 < 0) {
                break;
            }
            int i4 = 1 << i3;
            if ((((long) i4) & j) != 0) {
                i3--;
            } else if (i3 < 6) {
                j &= (long) (i4 - 1);
                i2 = 7 - i3;
            } else if (i3 == 7) {
                i2 = 1;
            }
        }
        i2 = 0;
        if (i2 == 0) {
            throw new NumberFormatException(AbstractC0455a.m2238m(j, "Invalid UTF-8 sequence first byte: "));
        }
        for (i = 1; i < i2; i++) {
            byte b2 = this.f25644a[this.f25645b + i];
            if ((b2 & 192) != 128) {
                throw new NumberFormatException(AbstractC0455a.m2238m(j, "Invalid UTF-8 sequence continuation byte: "));
            }
            j = (j << 6) | ((long) (b2 & 63));
        }
        this.f25645b += i2;
        return j;
    }

    /* JADX INFO: renamed from: C */
    public final Charset m9542C() {
        if (m9548a() >= 3) {
            byte[] bArr = this.f25644a;
            int i = this.f25645b;
            if (bArr[i] == -17 && bArr[i + 1] == -69 && bArr[i + 2] == -65) {
                this.f25645b = i + 3;
                return StandardCharsets.UTF_8;
            }
        }
        if (m9548a() < 2) {
            return null;
        }
        byte[] bArr2 = this.f25644a;
        int i2 = this.f25645b;
        byte b2 = bArr2[i2];
        if (b2 == -2 && bArr2[i2 + 1] == -1) {
            this.f25645b = i2 + 2;
            return StandardCharsets.UTF_16BE;
        }
        if (b2 != -1 || bArr2[i2 + 1] != -2) {
            return null;
        }
        this.f25645b = i2 + 2;
        return StandardCharsets.UTF_16LE;
    }

    /* JADX INFO: renamed from: D */
    public final void m9543D(int i) {
        byte[] bArr = this.f25644a;
        if (bArr.length < i) {
            bArr = new byte[i];
        }
        m9544E(i, bArr);
    }

    /* JADX INFO: renamed from: E */
    public final void m9544E(int i, byte[] bArr) {
        this.f25644a = bArr;
        this.f25646c = i;
        this.f25645b = 0;
    }

    /* JADX INFO: renamed from: F */
    public final void m9545F(int i) {
        Assertions.m9460a(i >= 0 && i <= this.f25644a.length);
        this.f25646c = i;
    }

    /* JADX INFO: renamed from: G */
    public final void m9546G(int i) {
        Assertions.m9460a(i >= 0 && i <= this.f25646c);
        this.f25645b = i;
    }

    /* JADX INFO: renamed from: H */
    public final void m9547H(int i) {
        m9546G(this.f25645b + i);
    }

    /* JADX INFO: renamed from: a */
    public final int m9548a() {
        return this.f25646c - this.f25645b;
    }

    /* JADX INFO: renamed from: b */
    public final void m9549b(int i) {
        byte[] bArr = this.f25644a;
        if (i > bArr.length) {
            this.f25644a = Arrays.copyOf(bArr, i);
        }
    }

    /* JADX INFO: renamed from: c */
    public final char m9550c(Charset charset) {
        Assertions.m9461b(f25643f.contains(charset), "Unsupported charset: " + charset);
        return (char) (m9551d(charset) >> 16);
    }

    /* JADX INFO: renamed from: d */
    public final int m9551d(Charset charset) {
        byte b2;
        byte b3;
        byte b4 = 1;
        if ((charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) && m9548a() >= 1) {
            b2 = this.f25644a[this.f25645b];
            b3 = 0;
        } else {
            if ((charset.equals(StandardCharsets.UTF_16) || charset.equals(StandardCharsets.UTF_16BE)) && m9548a() >= 2) {
                byte[] bArr = this.f25644a;
                int i = this.f25645b;
                b3 = bArr[i];
                b2 = bArr[i + 1];
            } else {
                if (!charset.equals(StandardCharsets.UTF_16LE) || m9548a() < 2) {
                    return 0;
                }
                byte[] bArr2 = this.f25644a;
                int i2 = this.f25645b;
                b3 = bArr2[i2 + 1];
                b2 = bArr2[i2];
            }
            b4 = 2;
        }
        return Ints.fromBytes(b3, b2, (byte) 0, b4);
    }

    /* JADX INFO: renamed from: e */
    public final void m9552e(byte[] bArr, int i, int i2) {
        System.arraycopy(this.f25644a, this.f25645b, bArr, i, i2);
        this.f25645b += i2;
    }

    /* JADX INFO: renamed from: f */
    public final char m9553f(Charset charset, char[] cArr) {
        int iM9551d = m9551d(charset);
        if (iM9551d == 0) {
            return (char) 0;
        }
        char c2 = (char) (iM9551d >> 16);
        if (!Chars.contains(cArr, c2)) {
            return (char) 0;
        }
        this.f25645b += iM9551d & 65535;
        return c2;
    }

    /* JADX INFO: renamed from: g */
    public final int m9554g() {
        byte[] bArr = this.f25644a;
        int i = this.f25645b;
        int i2 = i + 1;
        this.f25645b = i2;
        int i3 = (bArr[i] & UnsignedBytes.MAX_VALUE) << 24;
        int i4 = i + 2;
        this.f25645b = i4;
        int i5 = ((bArr[i2] & UnsignedBytes.MAX_VALUE) << 16) | i3;
        int i6 = i + 3;
        this.f25645b = i6;
        int i7 = i5 | ((bArr[i4] & UnsignedBytes.MAX_VALUE) << 8);
        this.f25645b = i + 4;
        return (bArr[i6] & UnsignedBytes.MAX_VALUE) | i7;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b2  */
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String m9555h(Charset charset) {
        int i;
        Assertions.m9461b(f25643f.contains(charset), "Unsupported charset: " + charset);
        if (m9548a() == 0) {
            return null;
        }
        Charset charset2 = StandardCharsets.US_ASCII;
        if (!charset.equals(charset2)) {
            m9542C();
        }
        if (charset.equals(StandardCharsets.UTF_8) || charset.equals(charset2)) {
            i = 1;
        } else {
            if (!charset.equals(StandardCharsets.UTF_16) && !charset.equals(StandardCharsets.UTF_16LE) && !charset.equals(StandardCharsets.UTF_16BE)) {
                throw new IllegalArgumentException("Unsupported charset: " + charset);
            }
            i = 2;
        }
        int i2 = this.f25645b;
        while (true) {
            int i3 = this.f25646c;
            if (i2 >= i3 - (i - 1)) {
                i2 = i3;
                break;
            }
            if (charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) {
                byte b2 = this.f25644a[i2];
                int i4 = Util.f25665a;
                if (b2 == 10 || b2 == 13) {
                    break;
                }
                if (charset.equals(StandardCharsets.UTF_16) || charset.equals(StandardCharsets.UTF_16BE)) {
                    byte[] bArr = this.f25644a;
                    if (bArr[i2] == 0) {
                        byte b3 = bArr[i2 + 1];
                        int i5 = Util.f25665a;
                        if (b3 == 10 || b3 == 13) {
                            break;
                        }
                        if (charset.equals(StandardCharsets.UTF_16LE)) {
                            byte[] bArr2 = this.f25644a;
                            if (bArr2[i2 + 1] == 0) {
                                byte b4 = bArr2[i2];
                                int i6 = Util.f25665a;
                                if (b4 == 10 || b4 == 13) {
                                    break;
                                }
                            } else {
                                continue;
                            }
                        }
                        i2 += i;
                    }
                }
            }
        }
        String strM9566s = m9566s(i2 - this.f25645b, charset);
        if (this.f25645b != this.f25646c && m9553f(charset, f25641d) == '\r') {
            m9553f(charset, f25642e);
        }
        return strM9566s;
    }

    /* JADX INFO: renamed from: i */
    public final int m9556i() {
        byte[] bArr = this.f25644a;
        int i = this.f25645b;
        int i2 = i + 1;
        this.f25645b = i2;
        int i3 = bArr[i] & UnsignedBytes.MAX_VALUE;
        int i4 = i + 2;
        this.f25645b = i4;
        int i5 = ((bArr[i2] & UnsignedBytes.MAX_VALUE) << 8) | i3;
        int i6 = i + 3;
        this.f25645b = i6;
        int i7 = i5 | ((bArr[i4] & UnsignedBytes.MAX_VALUE) << 16);
        this.f25645b = i + 4;
        return ((bArr[i6] & UnsignedBytes.MAX_VALUE) << 24) | i7;
    }

    /* JADX INFO: renamed from: j */
    public final long m9557j() {
        byte[] bArr = this.f25644a;
        int i = this.f25645b;
        int i2 = i + 1;
        this.f25645b = i2;
        long j = ((long) bArr[i]) & 255;
        int i3 = i + 2;
        this.f25645b = i3;
        long j2 = j | ((((long) bArr[i2]) & 255) << 8);
        int i4 = i + 3;
        this.f25645b = i4;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 16);
        int i5 = i + 4;
        this.f25645b = i5;
        long j4 = j3 | ((((long) bArr[i4]) & 255) << 24);
        int i6 = i + 5;
        this.f25645b = i6;
        long j5 = j4 | ((((long) bArr[i5]) & 255) << 32);
        int i7 = i + 6;
        this.f25645b = i7;
        long j6 = j5 | ((((long) bArr[i6]) & 255) << 40);
        int i8 = i + 7;
        this.f25645b = i8;
        long j7 = j6 | ((((long) bArr[i7]) & 255) << 48);
        this.f25645b = i + 8;
        return ((((long) bArr[i8]) & 255) << 56) | j7;
    }

    /* JADX INFO: renamed from: k */
    public final short m9558k() {
        byte[] bArr = this.f25644a;
        int i = this.f25645b;
        int i2 = i + 1;
        this.f25645b = i2;
        int i3 = bArr[i] & UnsignedBytes.MAX_VALUE;
        this.f25645b = i + 2;
        return (short) (((bArr[i2] & UnsignedBytes.MAX_VALUE) << 8) | i3);
    }

    /* JADX INFO: renamed from: l */
    public final long m9559l() {
        byte[] bArr = this.f25644a;
        int i = this.f25645b;
        int i2 = i + 1;
        this.f25645b = i2;
        long j = ((long) bArr[i]) & 255;
        int i3 = i + 2;
        this.f25645b = i3;
        long j2 = j | ((((long) bArr[i2]) & 255) << 8);
        int i4 = i + 3;
        this.f25645b = i4;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 16);
        this.f25645b = i + 4;
        return ((((long) bArr[i4]) & 255) << 24) | j3;
    }

    /* JADX INFO: renamed from: m */
    public final int m9560m() {
        int iM9556i = m9556i();
        if (iM9556i >= 0) {
            return iM9556i;
        }
        throw new IllegalStateException(AbstractC0000a.m9f(iM9556i, "Top bit not zero: "));
    }

    /* JADX INFO: renamed from: n */
    public final int m9561n() {
        byte[] bArr = this.f25644a;
        int i = this.f25645b;
        int i2 = i + 1;
        this.f25645b = i2;
        int i3 = bArr[i] & UnsignedBytes.MAX_VALUE;
        this.f25645b = i + 2;
        return ((bArr[i2] & UnsignedBytes.MAX_VALUE) << 8) | i3;
    }

    /* JADX INFO: renamed from: o */
    public final long m9562o() {
        byte[] bArr = this.f25644a;
        int i = this.f25645b;
        int i2 = i + 1;
        this.f25645b = i2;
        long j = (((long) bArr[i]) & 255) << 56;
        int i3 = i + 2;
        this.f25645b = i3;
        long j2 = j | ((((long) bArr[i2]) & 255) << 48);
        int i4 = i + 3;
        this.f25645b = i4;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 40);
        int i5 = i + 4;
        this.f25645b = i5;
        long j4 = j3 | ((((long) bArr[i4]) & 255) << 32);
        int i6 = i + 5;
        this.f25645b = i6;
        long j5 = j4 | ((((long) bArr[i5]) & 255) << 24);
        int i7 = i + 6;
        this.f25645b = i7;
        long j6 = j5 | ((((long) bArr[i6]) & 255) << 16);
        int i8 = i + 7;
        this.f25645b = i8;
        long j7 = j6 | ((((long) bArr[i7]) & 255) << 8);
        this.f25645b = i + 8;
        return (((long) bArr[i8]) & 255) | j7;
    }

    /* JADX INFO: renamed from: p */
    public final String m9563p() {
        if (m9548a() == 0) {
            return null;
        }
        int i = this.f25645b;
        while (i < this.f25646c && this.f25644a[i] != 0) {
            i++;
        }
        byte[] bArr = this.f25644a;
        int i2 = this.f25645b;
        int i3 = Util.f25665a;
        String str = new String(bArr, i2, i - i2, StandardCharsets.UTF_8);
        this.f25645b = i;
        if (i < this.f25646c) {
            this.f25645b = i + 1;
        }
        return str;
    }

    /* JADX INFO: renamed from: q */
    public final String m9564q(int i) {
        if (i == 0) {
            return "";
        }
        int i2 = this.f25645b;
        int i3 = (i2 + i) - 1;
        int i4 = (i3 >= this.f25646c || this.f25644a[i3] != 0) ? i : i - 1;
        byte[] bArr = this.f25644a;
        int i5 = Util.f25665a;
        String str = new String(bArr, i2, i4, StandardCharsets.UTF_8);
        this.f25645b += i;
        return str;
    }

    /* JADX INFO: renamed from: r */
    public final short m9565r() {
        byte[] bArr = this.f25644a;
        int i = this.f25645b;
        int i2 = i + 1;
        this.f25645b = i2;
        int i3 = (bArr[i] & UnsignedBytes.MAX_VALUE) << 8;
        this.f25645b = i + 2;
        return (short) ((bArr[i2] & UnsignedBytes.MAX_VALUE) | i3);
    }

    /* JADX INFO: renamed from: s */
    public final String m9566s(int i, Charset charset) {
        String str = new String(this.f25644a, this.f25645b, i, charset);
        this.f25645b += i;
        return str;
    }

    /* JADX INFO: renamed from: t */
    public final int m9567t() {
        return (m9568u() << 21) | (m9568u() << 14) | (m9568u() << 7) | m9568u();
    }

    /* JADX INFO: renamed from: u */
    public final int m9568u() {
        byte[] bArr = this.f25644a;
        int i = this.f25645b;
        this.f25645b = i + 1;
        return bArr[i] & UnsignedBytes.MAX_VALUE;
    }

    /* JADX INFO: renamed from: v */
    public final int m9569v() {
        byte[] bArr = this.f25644a;
        int i = this.f25645b;
        int i2 = i + 1;
        this.f25645b = i2;
        int i3 = (bArr[i] & UnsignedBytes.MAX_VALUE) << 8;
        this.f25645b = i + 2;
        int i4 = (bArr[i2] & UnsignedBytes.MAX_VALUE) | i3;
        this.f25645b = i + 4;
        return i4;
    }

    /* JADX INFO: renamed from: w */
    public final long m9570w() {
        byte[] bArr = this.f25644a;
        int i = this.f25645b;
        int i2 = i + 1;
        this.f25645b = i2;
        long j = (((long) bArr[i]) & 255) << 24;
        int i3 = i + 2;
        this.f25645b = i3;
        long j2 = j | ((((long) bArr[i2]) & 255) << 16);
        int i4 = i + 3;
        this.f25645b = i4;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 8);
        this.f25645b = i + 4;
        return (((long) bArr[i4]) & 255) | j3;
    }

    /* JADX INFO: renamed from: x */
    public final int m9571x() {
        byte[] bArr = this.f25644a;
        int i = this.f25645b;
        int i2 = i + 1;
        this.f25645b = i2;
        int i3 = (bArr[i] & UnsignedBytes.MAX_VALUE) << 16;
        int i4 = i + 2;
        this.f25645b = i4;
        int i5 = ((bArr[i2] & UnsignedBytes.MAX_VALUE) << 8) | i3;
        this.f25645b = i + 3;
        return (bArr[i4] & UnsignedBytes.MAX_VALUE) | i5;
    }

    /* JADX INFO: renamed from: y */
    public final int m9572y() {
        int iM9554g = m9554g();
        if (iM9554g >= 0) {
            return iM9554g;
        }
        throw new IllegalStateException(AbstractC0000a.m9f(iM9554g, "Top bit not zero: "));
    }

    /* JADX INFO: renamed from: z */
    public final long m9573z() {
        long jM9562o = m9562o();
        if (jM9562o >= 0) {
            return jM9562o;
        }
        throw new IllegalStateException(AbstractC0455a.m2238m(jM9562o, "Top bit not zero: "));
    }

    public ParsableByteArray(int i) {
        this.f25644a = new byte[i];
        this.f25646c = i;
    }

    public ParsableByteArray(byte[] bArr) {
        this.f25644a = bArr;
        this.f25646c = bArr.length;
    }

    public ParsableByteArray(byte[] bArr, int i) {
        this.f25644a = bArr;
        this.f25646c = i;
    }
}
