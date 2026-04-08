package com.google.zxing.common;

import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.google.common.primitives.UnsignedBytes;
import com.google.zxing.DecodeHintType;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.charset.UnsupportedCharsetException;
import java.util.Map;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class StringUtils {
    private static final boolean ASSUME_SHIFT_JIS;
    private static final Charset EUC_JP;
    public static final String GB2312 = "GB2312";
    public static final Charset GB2312_CHARSET;
    private static final Charset PLATFORM_DEFAULT_ENCODING = Charset.defaultCharset();
    public static final String SHIFT_JIS = "SJIS";
    public static final Charset SHIFT_JIS_CHARSET;

    static {
        Charset charsetForName;
        Charset charsetForName2;
        Charset charsetForName3 = null;
        try {
            charsetForName = Charset.forName(SHIFT_JIS);
        } catch (UnsupportedCharsetException unused) {
            charsetForName = null;
        }
        SHIFT_JIS_CHARSET = charsetForName;
        try {
            charsetForName2 = Charset.forName(GB2312);
        } catch (UnsupportedCharsetException unused2) {
            charsetForName2 = null;
        }
        GB2312_CHARSET = charsetForName2;
        try {
            charsetForName3 = Charset.forName("EUC_JP");
        } catch (UnsupportedCharsetException unused3) {
        }
        EUC_JP = charsetForName3;
        Charset charset = SHIFT_JIS_CHARSET;
        ASSUME_SHIFT_JIS = (charset != null && charset.equals(PLATFORM_DEFAULT_ENCODING)) || (charsetForName3 != null && charsetForName3.equals(PLATFORM_DEFAULT_ENCODING));
    }

    private StringUtils() {
    }

    /* JADX WARN: Removed duplicated region for block: B:88:0x00e1 A[PHI: r19
      0x00e1: PHI (r19v6 boolean) = (r19v5 boolean), (r19v5 boolean), (r19v5 boolean), (r19v7 boolean), (r19v7 boolean), (r19v7 boolean) binds: [B:90:0x00e7, B:92:0x00eb, B:94:0x00ef, B:82:0x00d5, B:83:0x00d7, B:85:0x00db] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Charset guessCharset(byte[] bArr, Map<DecodeHintType, ?> map) {
        boolean z2;
        boolean z3;
        boolean z4;
        byte b2;
        byte[] bArr2 = bArr;
        if (map != null) {
            DecodeHintType decodeHintType = DecodeHintType.CHARACTER_SET;
            if (map.containsKey(decodeHintType)) {
                return Charset.forName(map.get(decodeHintType).toString());
            }
        }
        boolean z5 = true;
        int i = 0;
        if (bArr2.length > 2 && (((b2 = bArr2[0]) == -2 && bArr2[1] == -1) || (b2 == -1 && bArr2[1] == -2))) {
            return StandardCharsets.UTF_16;
        }
        int length = bArr2.length;
        boolean z6 = SHIFT_JIS_CHARSET != null;
        boolean z7 = bArr2.length > 3 && bArr2[0] == -17 && bArr2[1] == -69 && bArr2[2] == -65;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        boolean z8 = z6;
        boolean z9 = true;
        while (i3 < length && (z5 || z8 || z9)) {
            byte b3 = bArr2[i3];
            int i13 = b3 & UnsignedBytes.MAX_VALUE;
            if (z9) {
                if (i4 <= 0) {
                    z2 = z5;
                    if ((b3 & UnsignedBytes.MAX_POWER_OF_TWO) != 0) {
                        if ((b3 & SignedBytes.MAX_POWER_OF_TWO) != 0) {
                            int i14 = i4 + 1;
                            if ((b3 & 32) == 0) {
                                i6++;
                            } else {
                                i14 = i4 + 2;
                                if ((b3 & Ascii.DLE) == 0) {
                                    i7++;
                                } else {
                                    i4 += 3;
                                    if ((b3 & 8) == 0) {
                                        i8++;
                                    }
                                }
                            }
                            i4 = i14;
                        }
                    }
                } else if ((b3 & UnsignedBytes.MAX_POWER_OF_TWO) == 0) {
                    z2 = z5;
                } else {
                    i4--;
                    z2 = z5;
                }
                z9 = false;
            } else {
                z2 = z5;
            }
            if (!z2) {
                z3 = z2;
            } else if (i13 <= 127 || i13 >= 160) {
                if (i13 > 159 && (i13 < 192 || i13 == 215 || i13 == 247)) {
                    i10++;
                }
                z3 = z2;
            } else {
                z3 = false;
            }
            if (!z8) {
                z4 = z3;
            } else if (i5 > 0) {
                z4 = z3;
                if (i13 < 64 || i13 == 127 || i13 > 252) {
                    z8 = false;
                } else {
                    i5--;
                }
            } else {
                z4 = z3;
                if (i13 != 128 && i13 != 160 && i13 <= 239) {
                    if (i13 <= 160 || i13 >= 224) {
                        if (i13 > 127) {
                            i5++;
                            int i15 = i11 + 1;
                            if (i15 > i) {
                                i = i15;
                                i11 = i;
                            } else {
                                i11 = i15;
                            }
                        } else {
                            i11 = 0;
                        }
                        i12 = 0;
                    } else {
                        i2++;
                        int i16 = i12 + 1;
                        if (i16 > i9) {
                            i9 = i16;
                            i12 = i9;
                        } else {
                            i12 = i16;
                        }
                        i11 = 0;
                    }
                }
            }
            i3++;
            bArr2 = bArr;
            z5 = z4;
        }
        boolean z10 = z5;
        if (z9 && i4 > 0) {
            z9 = false;
        }
        if (z8 && i5 > 0) {
            z8 = false;
        }
        return (!z9 || (!z7 && (i6 + i7) + i8 <= 0)) ? (!z8 || (!ASSUME_SHIFT_JIS && i9 < 3 && i < 3)) ? (z10 && z8) ? (!(i9 == 2 && i2 == 2) && i10 * 10 < length) ? StandardCharsets.ISO_8859_1 : SHIFT_JIS_CHARSET : z10 ? StandardCharsets.ISO_8859_1 : z8 ? SHIFT_JIS_CHARSET : z9 ? StandardCharsets.UTF_8 : PLATFORM_DEFAULT_ENCODING : SHIFT_JIS_CHARSET : StandardCharsets.UTF_8;
    }

    public static String guessEncoding(byte[] bArr, Map<DecodeHintType, ?> map) {
        Charset charsetGuessCharset = guessCharset(bArr, map);
        return charsetGuessCharset.equals(SHIFT_JIS_CHARSET) ? SHIFT_JIS : charsetGuessCharset.equals(StandardCharsets.UTF_8) ? "UTF8" : charsetGuessCharset.equals(StandardCharsets.ISO_8859_1) ? "ISO8859_1" : charsetGuessCharset.name();
    }
}
