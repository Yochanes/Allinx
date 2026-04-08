package okio;

import androidx.compose.p013ui.platform.AbstractC1313i;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0003¨\u0006\u0004"}, m18302d2 = {"Lokio/ByteString;", "Ljava/io/Serializable;", "", "Companion", "okio"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public class ByteString implements Serializable, Comparable<ByteString> {

    /* JADX INFO: renamed from: d */
    public static final Companion f57840d = new Companion();

    /* JADX INFO: renamed from: f */
    public static final ByteString f57841f = new ByteString(new byte[0]);

    /* JADX INFO: renamed from: a */
    public final byte[] f57842a;

    /* JADX INFO: renamed from: b */
    public transient int f57843b;

    /* JADX INFO: renamed from: c */
    public transient String f57844c;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m18302d2 = {"Lokio/ByteString$Companion;", "", "Lokio/ByteString;", "EMPTY", "Lokio/ByteString;", "", "serialVersionUID", "J", "okio"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        /* JADX INFO: renamed from: a */
        public static ByteString m21631a(String str) {
            char c2;
            int i;
            char cCharAt;
            char c3 = 'A';
            Intrinsics.m18599g(str, "<this>");
            byte[] bArr = Base64.f57815a;
            int length = str.length();
            while (true) {
                c2 = '\t';
                if (length <= 0 || !((cCharAt = str.charAt(length - 1)) == '=' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == ' ' || cCharAt == '\t')) {
                    break;
                }
                length--;
            }
            int i2 = (int) ((((long) length) * 6) / 8);
            byte[] bArrCopyOf = new byte[i2];
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (true) {
                if (i3 < length) {
                    char cCharAt2 = str.charAt(i3);
                    char c4 = c3;
                    if (c3 <= cCharAt2 && cCharAt2 < '[') {
                        i = cCharAt2 - 'A';
                    } else if ('a' <= cCharAt2 && cCharAt2 < '{') {
                        i = cCharAt2 - 'G';
                    } else if ('0' <= cCharAt2 && cCharAt2 < ':') {
                        i = cCharAt2 + 4;
                    } else if (cCharAt2 != '+' && cCharAt2 != '-') {
                        if (cCharAt2 != '/' && cCharAt2 != '_') {
                            if (cCharAt2 != '\n' && cCharAt2 != '\r' && cCharAt2 != ' ' && cCharAt2 != c2) {
                                break;
                            }
                            i3++;
                            c3 = c4;
                            c2 = '\t';
                        } else {
                            i = 63;
                        }
                    } else {
                        i = 62;
                    }
                    int i7 = i | (i5 << 6);
                    i4++;
                    if (i4 % 4 == 0) {
                        bArrCopyOf[i6] = (byte) (i7 >> 16);
                        int i8 = i6 + 2;
                        bArrCopyOf[i6 + 1] = (byte) (i7 >> 8);
                        i6 += 3;
                        bArrCopyOf[i8] = (byte) i7;
                    }
                    i5 = i7;
                    i3++;
                    c3 = c4;
                    c2 = '\t';
                } else {
                    int i9 = i4 % 4;
                    if (i9 != 1) {
                        if (i9 == 2) {
                            bArrCopyOf[i6] = (byte) ((i5 << 12) >> 16);
                            i6 = 1 + i6;
                        } else if (i9 == 3) {
                            int i10 = i5 << 6;
                            int i11 = 1 + i6;
                            bArrCopyOf[i6] = (byte) (i10 >> 16);
                            i6 += 2;
                            bArrCopyOf[i11] = (byte) (i10 >> 8);
                        }
                        if (i6 != i2) {
                            bArrCopyOf = Arrays.copyOf(bArrCopyOf, i6);
                            Intrinsics.m18598f(bArrCopyOf, "copyOf(...)");
                        }
                    }
                }
            }
            bArrCopyOf = null;
            if (bArrCopyOf != null) {
                return new ByteString(bArrCopyOf);
            }
            return null;
        }

        /* JADX INFO: renamed from: b */
        public static ByteString m21632b(String str) {
            if (str.length() % 2 != 0) {
                throw new IllegalArgumentException("Unexpected hex string: ".concat(str).toString());
            }
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                int i2 = i * 2;
                bArr[i] = (byte) (okio.internal.ByteString.m21716a(str.charAt(i2 + 1)) + (okio.internal.ByteString.m21716a(str.charAt(i2)) << 4));
            }
            return new ByteString(bArr);
        }

        /* JADX INFO: renamed from: c */
        public static ByteString m21633c(String str) {
            Intrinsics.m18599g(str, "<this>");
            byte[] bytes = str.getBytes(Charsets.f55167a);
            Intrinsics.m18598f(bytes, "getBytes(...)");
            ByteString byteString = new ByteString(bytes);
            byteString.f57844c = str;
            return byteString;
        }

        /* JADX INFO: renamed from: d */
        public static ByteString m21634d(byte[] bArr) {
            int length = bArr.length;
            SegmentedByteString.m21554b(bArr.length, 0, length);
            return new ByteString(ArraysKt.m18386u(bArr, 0, length));
        }
    }

    public ByteString(byte[] data) {
        Intrinsics.m18599g(data, "data");
        this.f57842a = data;
    }

    /* JADX INFO: renamed from: h */
    public static int m21611h(ByteString byteString, ByteString other) {
        byteString.getClass();
        Intrinsics.m18599g(other, "other");
        return byteString.mo21619f(0, other.f57842a);
    }

    /* JADX INFO: renamed from: l */
    public static int m21612l(ByteString byteString, ByteString other) {
        byteString.getClass();
        Intrinsics.m18599g(other, "other");
        return byteString.mo21622k(other.f57842a);
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ ByteString m21613q(ByteString byteString, int i, int i2, int i3) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = -1234567890;
        }
        return byteString.mo21626p(i, i2);
    }

    /* JADX INFO: renamed from: a */
    public String mo21614a() {
        byte[] map = Base64.f57815a;
        byte[] bArr = this.f57842a;
        Intrinsics.m18599g(bArr, "<this>");
        Intrinsics.m18599g(map, "map");
        byte[] bArr2 = new byte[((bArr.length + 2) / 3) * 4];
        int length = bArr.length - (bArr.length % 3);
        int i = 0;
        int i2 = 0;
        while (i < length) {
            byte b2 = bArr[i];
            int i3 = i + 2;
            byte b3 = bArr[i + 1];
            i += 3;
            byte b4 = bArr[i3];
            bArr2[i2] = map[(b2 & UnsignedBytes.MAX_VALUE) >> 2];
            bArr2[i2 + 1] = map[((b2 & 3) << 4) | ((b3 & UnsignedBytes.MAX_VALUE) >> 4)];
            int i4 = i2 + 3;
            bArr2[i2 + 2] = map[((b3 & Ascii.f42543SI) << 2) | ((b4 & UnsignedBytes.MAX_VALUE) >> 6)];
            i2 += 4;
            bArr2[i4] = map[b4 & 63];
        }
        int length2 = bArr.length - length;
        if (length2 == 1) {
            byte b5 = bArr[i];
            bArr2[i2] = map[(b5 & UnsignedBytes.MAX_VALUE) >> 2];
            bArr2[i2 + 1] = map[(b5 & 3) << 4];
            bArr2[i2 + 2] = 61;
            bArr2[i2 + 3] = 61;
        } else if (length2 == 2) {
            int i5 = i + 1;
            byte b6 = bArr[i];
            byte b7 = bArr[i5];
            bArr2[i2] = map[(b6 & UnsignedBytes.MAX_VALUE) >> 2];
            bArr2[i2 + 1] = map[((b6 & 3) << 4) | ((b7 & UnsignedBytes.MAX_VALUE) >> 4)];
            bArr2[i2 + 2] = map[(b7 & Ascii.f42543SI) << 2];
            bArr2[i2 + 3] = 61;
        }
        return new String(bArr2, Charsets.f55167a);
    }

    /* JADX INFO: renamed from: b */
    public final int m21615b(ByteString other) {
        Intrinsics.m18599g(other, "other");
        int iMo21617d = mo21617d();
        int iMo21617d2 = other.mo21617d();
        int iMin = Math.min(iMo21617d, iMo21617d2);
        for (int i = 0; i < iMin; i++) {
            int iMo21621j = mo21621j(i) & UnsignedBytes.MAX_VALUE;
            int iMo21621j2 = other.mo21621j(i) & UnsignedBytes.MAX_VALUE;
            if (iMo21621j != iMo21621j2) {
                return iMo21621j < iMo21621j2 ? -1 : 1;
            }
        }
        if (iMo21617d == iMo21617d2) {
            return 0;
        }
        return iMo21617d < iMo21617d2 ? -1 : 1;
    }

    /* JADX INFO: renamed from: c */
    public ByteString mo21616c(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        messageDigest.update(this.f57842a, 0, mo21617d());
        byte[] bArrDigest = messageDigest.digest();
        Intrinsics.m18596d(bArrDigest);
        return new ByteString(bArrDigest);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(ByteString byteString) {
        return m21615b(byteString);
    }

    /* JADX INFO: renamed from: d */
    public int mo21617d() {
        return this.f57842a.length;
    }

    /* JADX INFO: renamed from: e */
    public String mo21618e() {
        byte[] bArr = this.f57842a;
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b2 : bArr) {
            int i2 = i + 1;
            char[] cArr2 = okio.internal.ByteString.f57921a;
            cArr[i] = cArr2[(b2 >> 4) & 15];
            i += 2;
            cArr[i2] = cArr2[b2 & Ascii.f42543SI];
        }
        return new String(cArr);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            int iMo21617d = byteString.mo21617d();
            byte[] bArr = this.f57842a;
            if (iMo21617d == bArr.length && byteString.mo21624n(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public int mo21619f(int i, byte[] other) {
        Intrinsics.m18599g(other, "other");
        byte[] bArr = this.f57842a;
        int length = bArr.length - other.length;
        int iMax = Math.max(i, 0);
        if (iMax > length) {
            return -1;
        }
        while (!SegmentedByteString.m21553a(bArr, iMax, other, 0, other.length)) {
            if (iMax == length) {
                return -1;
            }
            iMax++;
        }
        return iMax;
    }

    public int hashCode() {
        int i = this.f57843b;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.f57842a);
        this.f57843b = iHashCode;
        return iHashCode;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public byte[] getF57842a() {
        return this.f57842a;
    }

    /* JADX INFO: renamed from: j */
    public byte mo21621j(int i) {
        return this.f57842a[i];
    }

    /* JADX INFO: renamed from: k */
    public int mo21622k(byte[] other) {
        Intrinsics.m18599g(other, "other");
        int iMo21617d = mo21617d();
        byte[] bArr = this.f57842a;
        for (int iMin = Math.min(iMo21617d, bArr.length - other.length); -1 < iMin; iMin--) {
            if (SegmentedByteString.m21553a(bArr, iMin, other, 0, other.length)) {
                return iMin;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: m */
    public boolean mo21623m(int i, ByteString other, int i2) {
        Intrinsics.m18599g(other, "other");
        return other.mo21624n(0, this.f57842a, i, i2);
    }

    /* JADX INFO: renamed from: n */
    public boolean mo21624n(int i, byte[] other, int i2, int i3) {
        Intrinsics.m18599g(other, "other");
        if (i < 0) {
            return false;
        }
        byte[] bArr = this.f57842a;
        return i <= bArr.length - i3 && i2 >= 0 && i2 <= other.length - i3 && SegmentedByteString.m21553a(bArr, i, other, i2, i3);
    }

    /* JADX INFO: renamed from: o */
    public final boolean m21625o(ByteString prefix) {
        Intrinsics.m18599g(prefix, "prefix");
        return mo21623m(0, prefix, prefix.mo21617d());
    }

    /* JADX INFO: renamed from: p */
    public ByteString mo21626p(int i, int i2) {
        if (i2 == -1234567890) {
            i2 = mo21617d();
        }
        if (i < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        byte[] bArr = this.f57842a;
        if (i2 > bArr.length) {
            throw new IllegalArgumentException(AbstractC0000a.m17n(new StringBuilder("endIndex > length("), bArr.length, ')').toString());
        }
        if (i2 - i >= 0) {
            return (i == 0 && i2 == bArr.length) ? this : new ByteString(ArraysKt.m18386u(bArr, i, i2));
        }
        throw new IllegalArgumentException("endIndex < beginIndex");
    }

    /* JADX INFO: renamed from: r */
    public ByteString mo21627r() {
        int i = 0;
        while (true) {
            byte[] bArr = this.f57842a;
            if (i >= bArr.length) {
                return this;
            }
            byte b2 = bArr[i];
            if (b2 >= 65 && b2 <= 90) {
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                Intrinsics.m18598f(bArrCopyOf, "copyOf(...)");
                bArrCopyOf[i] = (byte) (b2 + 32);
                for (int i2 = i + 1; i2 < bArrCopyOf.length; i2++) {
                    byte b3 = bArrCopyOf[i2];
                    if (b3 >= 65 && b3 <= 90) {
                        bArrCopyOf[i2] = (byte) (b3 + 32);
                    }
                }
                return new ByteString(bArrCopyOf);
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: s */
    public byte[] mo21628s() {
        byte[] bArr = this.f57842a;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        Intrinsics.m18598f(bArrCopyOf, "copyOf(...)");
        return bArrCopyOf;
    }

    /* JADX INFO: renamed from: t */
    public final String m21629t() {
        String str = this.f57844c;
        if (str != null) {
            return str;
        }
        byte[] f57842a = getF57842a();
        Intrinsics.m18599g(f57842a, "<this>");
        String str2 = new String(f57842a, Charsets.f55167a);
        this.f57844c = str2;
        return str2;
    }

    public String toString() {
        byte b2;
        int i;
        byte[] bArr = this.f57842a;
        if (bArr.length == 0) {
            return "[size=0]";
        }
        int length = bArr.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        loop0: while (true) {
            if (i2 >= length) {
                break;
            }
            byte b3 = bArr[i2];
            if (b3 >= 0) {
                int i5 = i4 + 1;
                if (i4 == 64) {
                    break;
                }
                if ((b3 != 10 && b3 != 13 && ((b3 >= 0 && b3 < 32) || (127 <= b3 && b3 < 160))) || b3 == 65533) {
                    break;
                }
                i3 += b3 < 65536 ? 1 : 2;
                i2++;
                while (true) {
                    i4 = i5;
                    if (i2 < length && (b2 = bArr[i2]) >= 0) {
                        i2++;
                        i5 = i4 + 1;
                        if (i4 == 64) {
                            break loop0;
                        }
                        if ((b2 != 10 && b2 != 13 && ((b2 >= 0 && b2 < 32) || (127 <= b2 && b2 < 160))) || b2 == 65533) {
                            break loop0;
                        }
                        i3 += b2 < 65536 ? 1 : 2;
                    } else {
                        break;
                    }
                }
            } else if ((b3 >> 5) == -2) {
                int i6 = i2 + 1;
                if (length > i6) {
                    byte b4 = bArr[i6];
                    if ((b4 & 192) == 128) {
                        int i7 = (b4 ^ UnsignedBytes.MAX_POWER_OF_TWO) ^ (b3 << 6);
                        if (i7 >= 128) {
                            i = i4 + 1;
                            if (i4 == 64) {
                                break;
                            }
                            if ((i7 != 10 && i7 != 13 && ((i7 >= 0 && i7 < 32) || (127 <= i7 && i7 < 160))) || i7 == 65533) {
                                break;
                            }
                            i3 += i7 < 65536 ? 1 : 2;
                            i2 += 2;
                            i4 = i;
                        } else if (i4 != 64) {
                            break;
                        }
                    } else if (i4 != 64) {
                        break;
                    }
                } else if (i4 != 64) {
                    break;
                }
            } else if ((b3 >> 4) == -2) {
                int i8 = i2 + 2;
                if (length > i8) {
                    byte b5 = bArr[i2 + 1];
                    if ((b5 & 192) == 128) {
                        byte b6 = bArr[i8];
                        if ((b6 & 192) == 128) {
                            int i9 = ((b6 ^ UnsignedBytes.MAX_POWER_OF_TWO) ^ (b5 << 6)) ^ (b3 << Ascii.f42536FF);
                            if (i9 < 2048) {
                                if (i4 != 64) {
                                    break;
                                }
                            } else if (55296 > i9 || i9 >= 57344) {
                                i = i4 + 1;
                                if (i4 == 64) {
                                    break;
                                }
                                if ((i9 != 10 && i9 != 13 && ((i9 >= 0 && i9 < 32) || (127 <= i9 && i9 < 160))) || i9 == 65533) {
                                    break;
                                }
                                i3 += i9 < 65536 ? 1 : 2;
                                i2 += 3;
                                i4 = i;
                            } else if (i4 != 64) {
                                break;
                            }
                        } else if (i4 != 64) {
                            break;
                        }
                    } else if (i4 != 64) {
                        break;
                    }
                } else if (i4 != 64) {
                    break;
                }
            } else if ((b3 >> 3) == -2) {
                int i10 = i2 + 3;
                if (length > i10) {
                    byte b7 = bArr[i2 + 1];
                    if ((b7 & 192) == 128) {
                        byte b8 = bArr[i2 + 2];
                        if ((b8 & 192) == 128) {
                            byte b9 = bArr[i10];
                            if ((b9 & 192) == 128) {
                                int i11 = (((b9 ^ UnsignedBytes.MAX_POWER_OF_TWO) ^ (b8 << 6)) ^ (b7 << Ascii.f42536FF)) ^ (b3 << Ascii.DC2);
                                if (i11 > 1114111) {
                                    if (i4 != 64) {
                                        break;
                                    }
                                } else if (55296 > i11 || i11 >= 57344) {
                                    if (i11 >= 65536) {
                                        i = i4 + 1;
                                        if (i4 == 64) {
                                            break;
                                        }
                                        if ((i11 != 10 && i11 != 13 && ((i11 >= 0 && i11 < 32) || (127 <= i11 && i11 < 160))) || i11 == 65533) {
                                            break;
                                        }
                                        i3 += i11 < 65536 ? 1 : 2;
                                        i2 += 4;
                                        i4 = i;
                                    } else if (i4 != 64) {
                                        break;
                                    }
                                } else if (i4 != 64) {
                                    break;
                                }
                            } else if (i4 != 64) {
                                break;
                            }
                        } else if (i4 != 64) {
                            break;
                        }
                    } else if (i4 != 64) {
                        break;
                    }
                } else if (i4 != 64) {
                    break;
                }
            } else if (i4 != 64) {
                break;
            }
        }
        i3 = -1;
        if (i3 != -1) {
            String strM21629t = m21629t();
            String strSubstring = strM21629t.substring(0, i3);
            Intrinsics.m18598f(strSubstring, "substring(...)");
            String strM20411I = StringsKt.m20411I(StringsKt.m20411I(StringsKt.m20411I(strSubstring, "\\", "\\\\"), "\n", "\\n"), "\r", "\\r");
            if (i3 >= strM21629t.length()) {
                return AbstractC1313i.m6244a(']', "[text=", strM20411I);
            }
            return "[size=" + bArr.length + " text=" + strM20411I + "…]";
        }
        if (bArr.length <= 64) {
            return "[hex=" + mo21618e() + ']';
        }
        StringBuilder sb = new StringBuilder("[size=");
        sb.append(bArr.length);
        sb.append(" hex=");
        if (64 > bArr.length) {
            throw new IllegalArgumentException(AbstractC0000a.m17n(new StringBuilder("endIndex > length("), bArr.length, ')').toString());
        }
        sb.append((64 == bArr.length ? this : new ByteString(ArraysKt.m18386u(bArr, 0, 64))).mo21618e());
        sb.append("…]");
        return sb.toString();
    }

    /* JADX INFO: renamed from: u */
    public void mo21630u(Buffer buffer, int i) {
        Intrinsics.m18599g(buffer, "buffer");
        buffer.m21561B0(this.f57842a, 0, i);
    }
}
