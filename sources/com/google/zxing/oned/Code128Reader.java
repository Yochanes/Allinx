package com.google.zxing.oned;

import com.engagelab.privates.common.observer.MTObservable;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitArray;
import io.intercom.android.sdk.models.Config;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class Code128Reader extends OneDReader {
    private static final int CODE_CODE_A = 101;
    private static final int CODE_CODE_B = 100;
    private static final int CODE_CODE_C = 99;
    private static final int CODE_FNC_1 = 102;
    private static final int CODE_FNC_2 = 97;
    private static final int CODE_FNC_3 = 96;
    private static final int CODE_FNC_4_A = 101;
    private static final int CODE_FNC_4_B = 100;
    static final int[][] CODE_PATTERNS = {new int[]{2, 1, 2, 2, 2, 2}, new int[]{2, 2, 2, 1, 2, 2}, new int[]{2, 2, 2, 2, 2, 1}, new int[]{1, 2, 1, 2, 2, 3}, new int[]{1, 2, 1, 3, 2, 2}, new int[]{1, 3, 1, 2, 2, 2}, new int[]{1, 2, 2, 2, 1, 3}, new int[]{1, 2, 2, 3, 1, 2}, new int[]{1, 3, 2, 2, 1, 2}, new int[]{2, 2, 1, 2, 1, 3}, new int[]{2, 2, 1, 3, 1, 2}, new int[]{2, 3, 1, 2, 1, 2}, new int[]{1, 1, 2, 2, 3, 2}, new int[]{1, 2, 2, 1, 3, 2}, new int[]{1, 2, 2, 2, 3, 1}, new int[]{1, 1, 3, 2, 2, 2}, new int[]{1, 2, 3, 1, 2, 2}, new int[]{1, 2, 3, 2, 2, 1}, new int[]{2, 2, 3, 2, 1, 1}, new int[]{2, 2, 1, 1, 3, 2}, new int[]{2, 2, 1, 2, 3, 1}, new int[]{2, 1, 3, 2, 1, 2}, new int[]{2, 2, 3, 1, 1, 2}, new int[]{3, 1, 2, 1, 3, 1}, new int[]{3, 1, 1, 2, 2, 2}, new int[]{3, 2, 1, 1, 2, 2}, new int[]{3, 2, 1, 2, 2, 1}, new int[]{3, 1, 2, 2, 1, 2}, new int[]{3, 2, 2, 1, 1, 2}, new int[]{3, 2, 2, 2, 1, 1}, new int[]{2, 1, 2, 1, 2, 3}, new int[]{2, 1, 2, 3, 2, 1}, new int[]{2, 3, 2, 1, 2, 1}, new int[]{1, 1, 1, 3, 2, 3}, new int[]{1, 3, 1, 1, 2, 3}, new int[]{1, 3, 1, 3, 2, 1}, new int[]{1, 1, 2, 3, 1, 3}, new int[]{1, 3, 2, 1, 1, 3}, new int[]{1, 3, 2, 3, 1, 1}, new int[]{2, 1, 1, 3, 1, 3}, new int[]{2, 3, 1, 1, 1, 3}, new int[]{2, 3, 1, 3, 1, 1}, new int[]{1, 1, 2, 1, 3, 3}, new int[]{1, 1, 2, 3, 3, 1}, new int[]{1, 3, 2, 1, 3, 1}, new int[]{1, 1, 3, 1, 2, 3}, new int[]{1, 1, 3, 3, 2, 1}, new int[]{1, 3, 3, 1, 2, 1}, new int[]{3, 1, 3, 1, 2, 1}, new int[]{2, 1, 1, 3, 3, 1}, new int[]{2, 3, 1, 1, 3, 1}, new int[]{2, 1, 3, 1, 1, 3}, new int[]{2, 1, 3, 3, 1, 1}, new int[]{2, 1, 3, 1, 3, 1}, new int[]{3, 1, 1, 1, 2, 3}, new int[]{3, 1, 1, 3, 2, 1}, new int[]{3, 3, 1, 1, 2, 1}, new int[]{3, 1, 2, 1, 1, 3}, new int[]{3, 1, 2, 3, 1, 1}, new int[]{3, 3, 2, 1, 1, 1}, new int[]{3, 1, 4, 1, 1, 1}, new int[]{2, 2, 1, 4, 1, 1}, new int[]{4, 3, 1, 1, 1, 1}, new int[]{1, 1, 1, 2, 2, 4}, new int[]{1, 1, 1, 4, 2, 2}, new int[]{1, 2, 1, 1, 2, 4}, new int[]{1, 2, 1, 4, 2, 1}, new int[]{1, 4, 1, 1, 2, 2}, new int[]{1, 4, 1, 2, 2, 1}, new int[]{1, 1, 2, 2, 1, 4}, new int[]{1, 1, 2, 4, 1, 2}, new int[]{1, 2, 2, 1, 1, 4}, new int[]{1, 2, 2, 4, 1, 1}, new int[]{1, 4, 2, 1, 1, 2}, new int[]{1, 4, 2, 2, 1, 1}, new int[]{2, 4, 1, 2, 1, 1}, new int[]{2, 2, 1, 1, 1, 4}, new int[]{4, 1, 3, 1, 1, 1}, new int[]{2, 4, 1, 1, 1, 2}, new int[]{1, 3, 4, 1, 1, 1}, new int[]{1, 1, 1, 2, 4, 2}, new int[]{1, 2, 1, 1, 4, 2}, new int[]{1, 2, 1, 2, 4, 1}, new int[]{1, 1, 4, 2, 1, 2}, new int[]{1, 2, 4, 1, 1, 2}, new int[]{1, 2, 4, 2, 1, 1}, new int[]{4, 1, 1, 2, 1, 2}, new int[]{4, 2, 1, 1, 1, 2}, new int[]{4, 2, 1, 2, 1, 1}, new int[]{2, 1, 2, 1, 4, 1}, new int[]{2, 1, 4, 1, 2, 1}, new int[]{4, 1, 2, 1, 2, 1}, new int[]{1, 1, 1, 1, 4, 3}, new int[]{1, 1, 1, 3, 4, 1}, new int[]{1, 3, 1, 1, 4, 1}, new int[]{1, 1, 4, 1, 1, 3}, new int[]{1, 1, 4, 3, 1, 1}, new int[]{4, 1, 1, 1, 1, 3}, new int[]{4, 1, 1, 3, 1, 1}, new int[]{1, 1, 3, 1, 4, 1}, new int[]{1, 1, 4, 1, 3, 1}, new int[]{3, 1, 1, 1, 4, 1}, new int[]{4, 1, 1, 1, 3, 1}, new int[]{2, 1, 1, 4, 1, 2}, new int[]{2, 1, 1, 2, 1, 4}, new int[]{2, 1, 1, 2, 3, 2}, new int[]{2, 3, 3, 1, 1, 1, 2}};
    private static final int CODE_SHIFT = 98;
    private static final int CODE_START_A = 103;
    private static final int CODE_START_B = 104;
    private static final int CODE_START_C = 105;
    private static final int CODE_STOP = 106;
    private static final float MAX_AVG_VARIANCE = 0.25f;
    private static final float MAX_INDIVIDUAL_VARIANCE = 0.7f;

    private static int decodeCode(BitArray bitArray, int[] iArr, int i) throws NotFoundException {
        OneDReader.recordPattern(bitArray, i, iArr);
        float f = MAX_AVG_VARIANCE;
        int i2 = -1;
        int i3 = 0;
        while (true) {
            int[][] iArr2 = CODE_PATTERNS;
            if (i3 >= iArr2.length) {
                break;
            }
            float fPatternMatchVariance = OneDReader.patternMatchVariance(iArr, iArr2[i3], MAX_INDIVIDUAL_VARIANCE);
            if (fPatternMatchVariance < f) {
                i2 = i3;
                f = fPatternMatchVariance;
            }
            i3++;
        }
        if (i2 >= 0) {
            return i2;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    private static int[] findStartPattern(BitArray bitArray) throws NotFoundException {
        int size = bitArray.getSize();
        int nextSet = bitArray.getNextSet(0);
        int[] iArr = new int[6];
        boolean z2 = false;
        int i = 0;
        int i2 = nextSet;
        while (nextSet < size) {
            if (bitArray.get(nextSet) != z2) {
                iArr[i] = iArr[i] + 1;
            } else {
                if (i == 5) {
                    int i3 = -1;
                    float f = MAX_AVG_VARIANCE;
                    for (int i4 = CODE_START_A; i4 <= CODE_START_C; i4++) {
                        float fPatternMatchVariance = OneDReader.patternMatchVariance(iArr, CODE_PATTERNS[i4], MAX_INDIVIDUAL_VARIANCE);
                        if (fPatternMatchVariance < f) {
                            i3 = i4;
                            f = fPatternMatchVariance;
                        }
                    }
                    if (i3 >= 0 && bitArray.isRange(Math.max(0, i2 - ((nextSet - i2) / 2)), i2, false)) {
                        return new int[]{i2, nextSet, i3};
                    }
                    i2 += iArr[0] + iArr[1];
                    int i5 = i - 1;
                    System.arraycopy(iArr, 2, iArr, 0, i5);
                    iArr[i5] = 0;
                    iArr[i] = 0;
                    i--;
                } else {
                    i++;
                }
                iArr[i] = 1;
                z2 = !z2;
            }
            nextSet++;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c4 A[FALL_THROUGH, PHI: r20 r21
      0x00c4: PHI (r20v14 boolean) = 
      (r20v5 boolean)
      (r20v5 boolean)
      (r20v5 boolean)
      (r20v5 boolean)
      (r20v15 boolean)
      (r20v15 boolean)
      (r20v15 boolean)
      (r20v15 boolean)
     binds: [B:77:0x012c, B:85:0x0142, B:89:0x014e, B:88:0x014a, B:43:0x00c1, B:51:0x00d8, B:55:0x00e4, B:54:0x00e0] A[DONT_GENERATE, DONT_INLINE]
      0x00c4: PHI (r21v10 int) = (r21v1 int), (r21v6 int), (r21v6 int), (r21v6 int), (r21v1 int), (r21v12 int), (r21v12 int), (r21v12 int) binds: [B:77:0x012c, B:85:0x0142, B:89:0x014e, B:88:0x014a, B:43:0x00c1, B:51:0x00d8, B:55:0x00e4, B:54:0x00e0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f6 A[PHI: r20
      0x00f6: PHI (r20v11 boolean) = (r20v5 boolean), (r20v15 boolean) binds: [B:96:0x015f, B:60:0x00f4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00fa A[PHI: r20
      0x00fa: PHI (r20v10 boolean) = (r20v5 boolean), (r20v5 boolean), (r20v15 boolean), (r20v15 boolean) binds: [B:95:0x015d, B:96:0x015f, B:59:0x00f2, B:60:0x00f4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0101 A[PHI: r20
      0x0101: PHI (r20v9 boolean) = (r20v5 boolean), (r20v15 boolean) binds: [B:77:0x012c, B:43:0x00c1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0107 A[PHI: r20
      0x0107: PHI (r20v8 boolean) = (r20v5 boolean), (r20v15 boolean) binds: [B:77:0x012c, B:43:0x00c1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x010b A[PHI: r20
      0x010b: PHI (r20v7 boolean) = (r20v5 boolean), (r20v15 boolean) binds: [B:76:0x012a, B:42:0x00bf] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.zxing.oned.OneDReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Result decodeRow(int i, BitArray bitArray, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException {
        char c2;
        char c3;
        boolean z2;
        boolean z3;
        boolean z4 = true;
        boolean z5 = false;
        boolean z6 = map != null && map.containsKey(DecodeHintType.ASSUME_GS1);
        int[] iArrFindStartPattern = findStartPattern(bitArray);
        int i2 = iArrFindStartPattern[2];
        ArrayList arrayList = new ArrayList(20);
        arrayList.add(Byte.valueOf((byte) i2));
        switch (i2) {
            case CODE_START_A /* 103 */:
                c2 = 'e';
                break;
            case CODE_START_B /* 104 */:
                c2 = 'd';
                break;
            case CODE_START_C /* 105 */:
                c2 = 'c';
                break;
            default:
                throw FormatException.getFormatInstance();
        }
        StringBuilder sb = new StringBuilder(20);
        int i3 = 6;
        int[] iArr = new int[6];
        char c4 = c2;
        int i4 = iArrFindStartPattern[0];
        int i5 = iArrFindStartPattern[1];
        char c5 = c4;
        boolean z7 = true;
        int i6 = 0;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (!z9) {
            int iDecodeCode = decodeCode(bitArray, iArr, i5);
            arrayList.add(Byte.valueOf((byte) iDecodeCode));
            if (iDecodeCode != CODE_STOP) {
                z7 = z4;
            }
            if (iDecodeCode != CODE_STOP) {
                i8++;
                i2 = (i8 * iDecodeCode) + i2;
            }
            int i10 = i5;
            for (int i11 = 0; i11 < i3; i11++) {
                i10 += iArr[i11];
            }
            switch (iDecodeCode) {
                case CODE_START_A /* 103 */:
                case CODE_START_B /* 104 */:
                case CODE_START_C /* 105 */:
                    throw FormatException.getFormatInstance();
                default:
                    switch (c5) {
                        case CODE_CODE_C /* 99 */:
                            c3 = 'd';
                            if (iDecodeCode >= 100) {
                                if (iDecodeCode != CODE_STOP) {
                                    z7 = false;
                                }
                                if (iDecodeCode == CODE_STOP) {
                                    z2 = false;
                                    z9 = true;
                                    break;
                                } else {
                                    switch (iDecodeCode) {
                                        case Config.DEFAULT_RATE_LIMIT_COUNT /* 100 */:
                                            c5 = 'd';
                                            break;
                                        case MTObservable.WHAT_OBSERVER /* 101 */:
                                            z2 = false;
                                            c5 = 'e';
                                            break;
                                        case CODE_FNC_1 /* 102 */:
                                            if (sb.length() == 0) {
                                                i9 = 1;
                                            } else if (sb.length() == 1) {
                                                i9 = 2;
                                            }
                                            if (z6) {
                                                if (sb.length() == 0) {
                                                    sb.append("]C1");
                                                } else {
                                                    sb.append((char) 29);
                                                }
                                            }
                                            break;
                                    }
                                }
                            } else {
                                if (iDecodeCode < 10) {
                                    sb.append('0');
                                }
                                sb.append(iDecodeCode);
                            }
                            z2 = false;
                            break;
                        case Config.DEFAULT_RATE_LIMIT_COUNT /* 100 */:
                            if (iDecodeCode < CODE_FNC_3) {
                                if (z5 == z8) {
                                    sb.append((char) (iDecodeCode + 32));
                                } else {
                                    sb.append((char) (iDecodeCode + 160));
                                }
                                c3 = 'd';
                                z5 = false;
                                z2 = false;
                            } else {
                                if (iDecodeCode != CODE_STOP) {
                                    z7 = false;
                                }
                                if (iDecodeCode != CODE_STOP) {
                                    switch (iDecodeCode) {
                                        case CODE_FNC_2 /* 97 */:
                                            z3 = false;
                                            i9 = 4;
                                            break;
                                        case CODE_SHIFT /* 98 */:
                                            z3 = true;
                                            c5 = 'e';
                                            break;
                                        case CODE_CODE_C /* 99 */:
                                            z3 = false;
                                            c5 = 'c';
                                            break;
                                        case Config.DEFAULT_RATE_LIMIT_COUNT /* 100 */:
                                            if (z8 || !z5) {
                                                if (z8 && z5) {
                                                    z3 = false;
                                                    z5 = false;
                                                    z8 = false;
                                                } else {
                                                    z3 = false;
                                                    z5 = true;
                                                }
                                            }
                                            z3 = false;
                                            z5 = false;
                                            z8 = true;
                                            break;
                                        case MTObservable.WHAT_OBSERVER /* 101 */:
                                            z3 = false;
                                            c5 = 'e';
                                            break;
                                        case CODE_FNC_1 /* 102 */:
                                            if (sb.length() == 0) {
                                                i9 = 1;
                                            } else if (sb.length() == 1) {
                                                i9 = 2;
                                            }
                                            if (z6) {
                                                if (sb.length() == 0) {
                                                    sb.append("]C1");
                                                } else {
                                                    sb.append((char) 29);
                                                }
                                                break;
                                            }
                                        default:
                                            z3 = false;
                                            break;
                                    }
                                } else {
                                    z3 = false;
                                    z9 = true;
                                }
                                z2 = z3;
                                c3 = 'd';
                            }
                            break;
                        case MTObservable.WHAT_OBSERVER /* 101 */:
                            if (iDecodeCode >= 64) {
                                if (iDecodeCode >= CODE_FNC_3) {
                                    if (iDecodeCode != CODE_STOP) {
                                        z7 = false;
                                    }
                                    if (iDecodeCode != CODE_STOP) {
                                        switch (iDecodeCode) {
                                            case CODE_SHIFT /* 98 */:
                                                z3 = true;
                                                c5 = 'd';
                                                break;
                                            case Config.DEFAULT_RATE_LIMIT_COUNT /* 100 */:
                                                z3 = false;
                                                c5 = 'd';
                                                break;
                                            case MTObservable.WHAT_OBSERVER /* 101 */:
                                                if (z8 || !z5) {
                                                    if (!z8 || !z5) {
                                                    }
                                                }
                                                z3 = false;
                                                z5 = false;
                                                z8 = true;
                                                break;
                                            case CODE_FNC_1 /* 102 */:
                                                if (sb.length() == 0) {
                                                    i9 = 1;
                                                } else if (sb.length() == 1) {
                                                    i9 = 2;
                                                }
                                                if (z6) {
                                                    if (sb.length() == 0) {
                                                        sb.append("]C1");
                                                    } else {
                                                        sb.append((char) 29);
                                                    }
                                                    break;
                                                }
                                        }
                                    }
                                    z2 = z3;
                                    c3 = 'd';
                                    break;
                                } else if (z5 == z8) {
                                    sb.append((char) (iDecodeCode - 64));
                                } else {
                                    sb.append((char) (iDecodeCode + 64));
                                }
                            } else if (z5 == z8) {
                                sb.append((char) (iDecodeCode + 32));
                            } else {
                                sb.append((char) (iDecodeCode + 160));
                            }
                            c3 = 'd';
                            z5 = false;
                            z2 = false;
                            break;
                        default:
                            c3 = 'd';
                            z2 = false;
                            break;
                    }
                    if (z10) {
                        c5 = c5 == 'e' ? c3 : 'e';
                    }
                    int i12 = i7;
                    i7 = iDecodeCode;
                    i6 = i12;
                    i4 = i5;
                    z10 = z2;
                    i5 = i10;
                    z4 = true;
                    i3 = 6;
                    break;
            }
            while (!z9) {
            }
        }
        int i13 = i5 - i4;
        int nextUnset = bitArray.getNextUnset(i5);
        if (!bitArray.isRange(nextUnset, Math.min(bitArray.getSize(), ((nextUnset - i4) / 2) + nextUnset), false)) {
            throw NotFoundException.getNotFoundInstance();
        }
        if ((i2 - (i8 * i6)) % CODE_START_A != i6) {
            throw ChecksumException.getChecksumInstance();
        }
        int length = sb.length();
        if (length == 0) {
            throw NotFoundException.getNotFoundInstance();
        }
        if (length > 0 && z7) {
            if (c5 == CODE_CODE_C) {
                sb.delete(length - 2, length);
            } else {
                sb.delete(length - 1, length);
            }
        }
        float f = (iArrFindStartPattern[1] + iArrFindStartPattern[0]) / 2.0f;
        float f2 = (i13 / 2.0f) + i4;
        int size = arrayList.size();
        byte[] bArr = new byte[size];
        for (int i14 = 0; i14 < size; i14++) {
            bArr[i14] = ((Byte) arrayList.get(i14)).byteValue();
        }
        float f3 = i;
        Result result = new Result(sb.toString(), bArr, new ResultPoint[]{new ResultPoint(f, f3), new ResultPoint(f2, f3)}, BarcodeFormat.CODE_128);
        result.putMetadata(ResultMetadataType.SYMBOLOGY_IDENTIFIER, "]C" + i9);
        return result;
    }
}
