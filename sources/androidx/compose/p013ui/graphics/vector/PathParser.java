package androidx.compose.p013ui.graphics.vector;

import androidx.compose.p013ui.graphics.vector.PathNode;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.zxing.pdf417.PDF417Common;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/graphics/vector/PathParser;", "", "ui-graphics_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class PathParser {

    /* JADX INFO: renamed from: a */
    public float[] f18079a;

    /* JADX WARN: Code restructure failed: missing block: B:313:0x0171, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0419 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01a3  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList m5498a(PathParser pathParser, String str) {
        int i;
        int i2;
        char cCharAt;
        char c2;
        int i3;
        char c3;
        int i4;
        long j;
        char cCharAt2;
        int i5;
        int i6;
        int i7;
        char c4;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        long j2;
        int i14;
        char c5;
        long j3;
        int iFloatToRawIntBits;
        long jFloatToRawIntBits;
        int i15;
        int i16;
        long j4;
        long jFloatToRawIntBits2;
        char cCharAt3;
        float fIntBitsToFloat;
        ArrayList arrayList = new ArrayList();
        int length = str.length();
        int i17 = 0;
        while (true) {
            i = 32;
            if (i17 >= length || Intrinsics.m18601i(str.charAt(i17), 32) > 0) {
                break;
            }
            i17++;
        }
        while (length > i17 && Intrinsics.m18601i(str.charAt(length - 1), 32) <= 0) {
            length--;
        }
        int i18 = 0;
        while (i17 < length) {
            while (true) {
                i2 = i17 + 1;
                cCharAt = str.charAt(i17);
                int i19 = cCharAt | ' ';
                if ((i19 - 122) * (i19 - 97) > 0 || i19 == 101) {
                    if (i2 >= length) {
                        cCharAt = 0;
                    } else {
                        i17 = i2;
                    }
                }
            }
            if (cCharAt != 0) {
                if ((cCharAt | ' ') != 122) {
                    i18 = 0;
                    while (true) {
                        if (i2 >= length || Intrinsics.m18601i(str.charAt(i2), i) > 0) {
                            if (i2 == length) {
                                int i20 = i;
                                i4 = i18;
                                jFloatToRawIntBits = (((long) i2) << i20) | (((long) Float.floatToRawIntBits(Float.NaN)) & 4294967295L);
                                c2 = cCharAt;
                                i3 = i20;
                            } else {
                                int i21 = i;
                                i4 = i18;
                                char cCharAt4 = str.charAt(i2);
                                boolean z2 = cCharAt4 == '-';
                                i3 = i21;
                                if (z2) {
                                    i5 = i2 + 1;
                                    if (i5 == length) {
                                        jFloatToRawIntBits = (((long) i5) << i3) | (((long) Float.floatToRawIntBits(Float.NaN)) & 4294967295L);
                                        c2 = cCharAt;
                                    } else {
                                        c3 = 1;
                                        cCharAt2 = str.charAt(i5);
                                        j = 4294967295L;
                                        if (((char) (cCharAt2 - '0')) >= '\n' && cCharAt2 != '.') {
                                            j4 = ((long) i5) << i3;
                                            jFloatToRawIntBits2 = Float.floatToRawIntBits(Float.NaN);
                                        }
                                        jFloatToRawIntBits = j4 | (jFloatToRawIntBits2 & j);
                                        c2 = cCharAt;
                                        int i22 = (int) (jFloatToRawIntBits >>> i3);
                                        fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits & j));
                                        if (Float.isNaN(fIntBitsToFloat)) {
                                            i2 = i22;
                                            i18 = i4;
                                        } else {
                                            float[] fArr = pathParser.f18079a;
                                            i18 = i4 + 1;
                                            fArr[i4] = fIntBitsToFloat;
                                            if (i18 >= fArr.length) {
                                                float[] fArr2 = new float[i18 * 2];
                                                pathParser.f18079a = fArr2;
                                                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                                            }
                                            i2 = i22;
                                        }
                                        while (i2 < length && str.charAt(i2) == ',') {
                                            i2++;
                                        }
                                        if (i2 < length && !Float.isNaN(fIntBitsToFloat)) {
                                            i = i3;
                                            cCharAt = c2;
                                        }
                                    }
                                } else {
                                    j = 4294967295L;
                                    c3 = 1;
                                    cCharAt2 = cCharAt4;
                                    i5 = i2;
                                }
                                int length2 = str.length();
                                int i23 = i5;
                                long j5 = 0;
                                while (i23 != length) {
                                    int i24 = cCharAt2 - '0';
                                    if (((char) i24) < '\n') {
                                        j5 = (j5 * 10) + ((long) i24);
                                        i23++;
                                        cCharAt2 = i23 < length2 ? str.charAt(i23) : (char) 0;
                                    } else {
                                        i6 = i23 - i5;
                                        if (i23 == length && cCharAt2 == '.') {
                                            int i25 = i23 + 1;
                                            i9 = i25;
                                            c4 = '0';
                                            while (true) {
                                                if (length - i9 >= 4) {
                                                    int i26 = length2;
                                                    long jCharAt = ((long) str.charAt(i9)) | (((long) str.charAt(i9 + 1)) << 16) | (((long) str.charAt(i9 + 2)) << i3) | (((long) str.charAt(i9 + 3)) << 48);
                                                    long j6 = jCharAt - 13511005043687472L;
                                                    int i27 = (((jCharAt + 19703549022044230L) | j6) & (-35747867511423104L)) != 0 ? -1 : (int) ((j6 * 281475406208040961L) >>> 48);
                                                    if (i27 >= 0) {
                                                        j5 = (j5 * 10000) + ((long) i27);
                                                        i9 += 4;
                                                        length2 = i26;
                                                    } else {
                                                        i7 = i26;
                                                    }
                                                } else {
                                                    i7 = length2;
                                                }
                                            }
                                            if (i9 < i7) {
                                                cCharAt3 = str.charAt(i9);
                                                while (i9 != length) {
                                                    int i28 = cCharAt3 - '0';
                                                    if (((char) i28) < '\n') {
                                                        j5 = (j5 * 10) + ((long) i28);
                                                        i9++;
                                                        if (i9 < i7) {
                                                            cCharAt3 = str.charAt(i9);
                                                        }
                                                    } else {
                                                        i10 = i25 - i9;
                                                        i6 -= i10;
                                                        cCharAt2 = cCharAt3;
                                                        i8 = i25;
                                                    }
                                                }
                                                i10 = i25 - i9;
                                                i6 -= i10;
                                                cCharAt2 = cCharAt3;
                                                i8 = i25;
                                            }
                                            cCharAt3 = 0;
                                        } else {
                                            i7 = length2;
                                            c4 = '0';
                                            i8 = i23;
                                            i9 = i8;
                                            i10 = 0;
                                        }
                                        if (i6 != 0) {
                                            j4 = ((long) i9) << i3;
                                            jFloatToRawIntBits2 = Float.floatToRawIntBits(Float.NaN);
                                            jFloatToRawIntBits = j4 | (jFloatToRawIntBits2 & j);
                                            c2 = cCharAt;
                                            int i222 = (int) (jFloatToRawIntBits >>> i3);
                                            fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits & j));
                                            if (Float.isNaN(fIntBitsToFloat)) {
                                            }
                                            while (i2 < length) {
                                                i2++;
                                            }
                                            if (i2 < length) {
                                            }
                                        } else {
                                            if ((cCharAt2 | ' ') == 101) {
                                                int i29 = i9 + 1;
                                                char cCharAt5 = i29 < i7 ? str.charAt(i29) : (char) 0;
                                                char c6 = cCharAt5 == '-' ? c3 : (char) 0;
                                                int i30 = i10;
                                                if (c6 != 0 || cCharAt5 == '+') {
                                                    i29 = i9 + 2;
                                                }
                                                char cCharAt6 = str.charAt(i29);
                                                i12 = 0;
                                                while (true) {
                                                    if (i29 != length) {
                                                        int i31 = cCharAt6 - '0';
                                                        i16 = i29;
                                                        if (((char) i31) < '\n') {
                                                            if (i12 < 1024) {
                                                                i12 = (i12 * 10) + i31;
                                                            }
                                                            i29 = i16 + 1;
                                                            cCharAt6 = i29 < i7 ? str.charAt(i29) : (char) 0;
                                                        }
                                                    } else {
                                                        i16 = i29;
                                                    }
                                                }
                                                if (c6 != 0) {
                                                    i12 = -i12;
                                                }
                                                i10 = i30 + i12;
                                                i11 = i16;
                                            } else {
                                                i11 = i9;
                                                i12 = 0;
                                            }
                                            if (i6 > 19) {
                                                int i32 = i5;
                                                char cCharAt7 = str.charAt(i5);
                                                while (true) {
                                                    i13 = i10;
                                                    if (i11 != length && (cCharAt7 == c4 || cCharAt7 == '.')) {
                                                        if (cCharAt7 == '0') {
                                                            i6--;
                                                        }
                                                        int i33 = i32 + 1;
                                                        cCharAt7 = i33 < i7 ? str.charAt(i33) : (char) 0;
                                                        i32 = i33;
                                                        i10 = i13;
                                                        c4 = '0';
                                                    }
                                                }
                                                if (i6 > 19) {
                                                    char cCharAt8 = str.charAt(i5);
                                                    int i34 = i12;
                                                    long j7 = 0;
                                                    while (true) {
                                                        if (i5 != i23) {
                                                            char c7 = cCharAt8;
                                                            c2 = cCharAt;
                                                            if (Long.compare(j7 ^ Long.MIN_VALUE, -8223372036854775808L) < 0) {
                                                                j7 = (j7 * 10) + ((long) (c7 - '0'));
                                                                i5++;
                                                                cCharAt8 = i5 < i7 ? str.charAt(i5) : (char) 0;
                                                                cCharAt = c2;
                                                            }
                                                        } else {
                                                            c2 = cCharAt;
                                                        }
                                                    }
                                                    if (Long.compare(j7 ^ Long.MIN_VALUE, -8223372036854775808L) >= 0) {
                                                        i14 = i34 + (i23 - i5);
                                                    } else {
                                                        char cCharAt9 = str.charAt(i8);
                                                        int i35 = i8;
                                                        while (true) {
                                                            if (i35 != i9) {
                                                                char c8 = cCharAt9;
                                                                i15 = i35;
                                                                if (Long.compare(j7 ^ Long.MIN_VALUE, -8223372036854775808L) < 0) {
                                                                    j7 = (j7 * 10) + ((long) (c8 - '0'));
                                                                    i35 = i15 + 1;
                                                                    cCharAt9 = i35 < i7 ? str.charAt(i35) : (char) 0;
                                                                }
                                                            } else {
                                                                i15 = i35;
                                                            }
                                                        }
                                                        i14 = i34 + (i8 - i15);
                                                    }
                                                    c5 = c3;
                                                    j2 = j7;
                                                }
                                                if (-10 > i14 && i14 < 11 && c5 == 0 && Long.compare(j2 ^ Long.MIN_VALUE, -9223372036837998592L) <= 0) {
                                                    float f = j2;
                                                    float[] fArr3 = FastFloatParserKt.f17943a;
                                                    float f2 = i14 < 0 ? f / fArr3[-i14] : f * fArr3[i14];
                                                    if (z2) {
                                                        f2 = -f2;
                                                    }
                                                    j3 = ((long) i11) << i3;
                                                    iFloatToRawIntBits = Float.floatToRawIntBits(f2);
                                                } else if (j2 != 0) {
                                                    j3 = ((long) i11) << i3;
                                                    iFloatToRawIntBits = Float.floatToRawIntBits(z2 ? -0.0f : 0.0f);
                                                } else if (-126 > i14 || i14 >= 128) {
                                                    String strSubstring = str.substring(i2, i11);
                                                    Intrinsics.m18598f(strSubstring, "substring(...)");
                                                    j3 = ((long) i11) << i3;
                                                    iFloatToRawIntBits = Float.floatToRawIntBits(Float.parseFloat(strSubstring));
                                                } else {
                                                    long j8 = FastFloatParserKt.f17944b[i14 + 325];
                                                    int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(j2);
                                                    long j9 = j2 << iNumberOfLeadingZeros;
                                                    long j10 = j9 & j;
                                                    long j11 = j9 >>> i3;
                                                    long j12 = j8 & j;
                                                    long j13 = j8 >>> i3;
                                                    long j14 = j11 * j13;
                                                    long j15 = j13 * j10;
                                                    long j16 = j14 + ((((j11 * j12) + ((j10 * j12) >>> i3)) + (j15 & j)) >>> i3) + (j15 >>> i3);
                                                    int i36 = (int) (j16 >>> 63);
                                                    long j17 = j16 >>> (i36 + 9);
                                                    int i37 = iNumberOfLeadingZeros + (i36 ^ 1);
                                                    long j18 = j16 & 511;
                                                    if (j18 == 511 || (j18 == 0 && (j17 & 3) == 1)) {
                                                        String strSubstring2 = str.substring(i2, i11);
                                                        Intrinsics.m18598f(strSubstring2, "substring(...)");
                                                        j3 = ((long) i11) << i3;
                                                        iFloatToRawIntBits = Float.floatToRawIntBits(Float.parseFloat(strSubstring2));
                                                    } else {
                                                        long j19 = (j17 + 1) >>> c3;
                                                        if (j19 >= 9007199254740992L) {
                                                            i37--;
                                                            j19 = 4503599627370496L;
                                                        }
                                                        long j20 = j19 & (-4503599627370497L);
                                                        long j21 = ((((((long) i14) * 217706) >> 16) + ((long) UserMetadata.MAX_ATTRIBUTE_SIZE)) + ((long) 63)) - ((long) i37);
                                                        if (j21 < 1 || j21 > 2046) {
                                                            String strSubstring3 = str.substring(i2, i11);
                                                            Intrinsics.m18598f(strSubstring3, "substring(...)");
                                                            j3 = ((long) i11) << i3;
                                                            iFloatToRawIntBits = Float.floatToRawIntBits(Float.parseFloat(strSubstring3));
                                                        } else {
                                                            j3 = ((long) i11) << i3;
                                                            iFloatToRawIntBits = Float.floatToRawIntBits((float) Double.longBitsToDouble((j21 << 52) | j20 | (z2 ? Long.MIN_VALUE : 0L)));
                                                        }
                                                    }
                                                }
                                                jFloatToRawIntBits = j3 | (((long) iFloatToRawIntBits) & j);
                                                int i2222 = (int) (jFloatToRawIntBits >>> i3);
                                                fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits & j));
                                                if (Float.isNaN(fIntBitsToFloat)) {
                                                }
                                                while (i2 < length) {
                                                }
                                                if (i2 < length) {
                                                }
                                            } else {
                                                i13 = i10;
                                            }
                                            c2 = cCharAt;
                                            j2 = j5;
                                            i14 = i13;
                                            c5 = 0;
                                            if (-10 > i14) {
                                                if (j2 != 0) {
                                                }
                                                jFloatToRawIntBits = j3 | (((long) iFloatToRawIntBits) & j);
                                                int i22222 = (int) (jFloatToRawIntBits >>> i3);
                                                fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits & j));
                                                if (Float.isNaN(fIntBitsToFloat)) {
                                                }
                                                while (i2 < length) {
                                                }
                                                if (i2 < length) {
                                                }
                                            }
                                        }
                                    }
                                }
                                i6 = i23 - i5;
                                if (i23 == length) {
                                    i7 = length2;
                                    c4 = '0';
                                    i8 = i23;
                                    i9 = i8;
                                    i10 = 0;
                                    if (i6 != 0) {
                                    }
                                }
                            }
                            j = 4294967295L;
                            c3 = 1;
                            int i222222 = (int) (jFloatToRawIntBits >>> i3);
                            fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits & j));
                            if (Float.isNaN(fIntBitsToFloat)) {
                            }
                            while (i2 < length) {
                            }
                            if (i2 < length) {
                            }
                        } else {
                            i2++;
                        }
                    }
                } else {
                    c2 = cCharAt;
                    i3 = i;
                    c3 = 1;
                }
                i17 = i2;
                float[] fArr4 = pathParser.f18079a;
                int i38 = 2;
                switch (c2) {
                    case 'A':
                        int i39 = i18 - 7;
                        for (int i40 = 0; i40 <= i39; i40 += 7) {
                            arrayList.add(new PathNode.ArcTo(fArr4[i40], fArr4[i40 + 1], fArr4[i40 + 2], Float.compare(fArr4[i40 + 3], 0.0f) != 0 ? c3 : 0, Float.compare(fArr4[i40 + 4], 0.0f) != 0 ? c3 : 0, fArr4[i40 + 5], fArr4[i40 + 6]));
                        }
                        i = i3;
                        break;
                    case 'C':
                        int i41 = i18 - 6;
                        for (int i42 = 0; i42 <= i41; i42 += 6) {
                            arrayList.add(new PathNode.CurveTo(fArr4[i42], fArr4[i42 + 1], fArr4[i42 + 2], fArr4[i42 + 3], fArr4[i42 + 4], fArr4[i42 + 5]));
                        }
                        i = i3;
                        break;
                    case 'H':
                        int i43 = i18 - 1;
                        for (int i44 = 0; i44 <= i43; i44++) {
                            arrayList.add(new PathNode.HorizontalTo(fArr4[i44]));
                        }
                        i = i3;
                        break;
                    case 'L':
                        int i45 = i18 - 2;
                        for (int i46 = 0; i46 <= i45; i46 += 2) {
                            arrayList.add(new PathNode.LineTo(fArr4[i46], fArr4[i46 + 1]));
                        }
                        i = i3;
                        break;
                    case 'M':
                        int i47 = i18 - 2;
                        if (i47 >= 0) {
                            arrayList.add(new PathNode.MoveTo(fArr4[0], fArr4[c3]));
                            while (i38 <= i47) {
                                arrayList.add(new PathNode.LineTo(fArr4[i38], fArr4[i38 + 1]));
                                i38 += 2;
                            }
                        }
                        i = i3;
                        break;
                    case 'Q':
                        int i48 = i18 - 4;
                        for (int i49 = 0; i49 <= i48; i49 += 4) {
                            arrayList.add(new PathNode.QuadTo(fArr4[i49], fArr4[i49 + 1], fArr4[i49 + 2], fArr4[i49 + 3]));
                        }
                        i = i3;
                        break;
                    case 'S':
                        int i50 = i18 - 4;
                        for (int i51 = 0; i51 <= i50; i51 += 4) {
                            arrayList.add(new PathNode.ReflectiveCurveTo(fArr4[i51], fArr4[i51 + 1], fArr4[i51 + 2], fArr4[i51 + 3]));
                        }
                        i = i3;
                        break;
                    case 'T':
                        int i52 = i18 - 2;
                        for (int i53 = 0; i53 <= i52; i53 += 2) {
                            arrayList.add(new PathNode.ReflectiveQuadTo(fArr4[i53], fArr4[i53 + 1]));
                        }
                        i = i3;
                        break;
                    case 'V':
                        int i54 = i18 - 1;
                        for (int i55 = 0; i55 <= i54; i55++) {
                            arrayList.add(new PathNode.VerticalTo(fArr4[i55]));
                        }
                        i = i3;
                        break;
                    case PDF417Common.MAX_ROWS_IN_BARCODE /* 90 */:
                    case ModuleDescriptor.MODULE_VERSION /* 122 */:
                        arrayList.add(PathNode.Close.f18027c);
                        i = i3;
                        break;
                    case 'a':
                        int i56 = i18 - 7;
                        for (int i57 = 0; i57 <= i56; i57 += 7) {
                            arrayList.add(new PathNode.RelativeArcTo(fArr4[i57], fArr4[i57 + 1], fArr4[i57 + 2], Float.compare(fArr4[i57 + 3], 0.0f) != 0 ? c3 : 0, Float.compare(fArr4[i57 + 4], 0.0f) != 0 ? c3 : 0, fArr4[i57 + 5], fArr4[i57 + 6]));
                        }
                        i = i3;
                        break;
                    case 'c':
                        int i58 = i18 - 6;
                        for (int i59 = 0; i59 <= i58; i59 += 6) {
                            arrayList.add(new PathNode.RelativeCurveTo(fArr4[i59], fArr4[i59 + 1], fArr4[i59 + 2], fArr4[i59 + 3], fArr4[i59 + 4], fArr4[i59 + 5]));
                        }
                        i = i3;
                        break;
                    case 'h':
                        int i60 = i18 - 1;
                        for (int i61 = 0; i61 <= i60; i61++) {
                            arrayList.add(new PathNode.RelativeHorizontalTo(fArr4[i61]));
                        }
                        i = i3;
                        break;
                    case 'l':
                        int i62 = i18 - 2;
                        for (int i63 = 0; i63 <= i62; i63 += 2) {
                            arrayList.add(new PathNode.RelativeLineTo(fArr4[i63], fArr4[i63 + 1]));
                        }
                        i = i3;
                        break;
                    case 'm':
                        int i64 = i18 - 2;
                        if (i64 >= 0) {
                            arrayList.add(new PathNode.RelativeMoveTo(fArr4[0], fArr4[c3]));
                            while (i38 <= i64) {
                                arrayList.add(new PathNode.RelativeLineTo(fArr4[i38], fArr4[i38 + 1]));
                                i38 += 2;
                            }
                        }
                        i = i3;
                        break;
                    case 'q':
                        int i65 = i18 - 4;
                        for (int i66 = 0; i66 <= i65; i66 += 4) {
                            arrayList.add(new PathNode.RelativeQuadTo(fArr4[i66], fArr4[i66 + 1], fArr4[i66 + 2], fArr4[i66 + 3]));
                        }
                        i = i3;
                        break;
                    case 's':
                        int i67 = i18 - 4;
                        for (int i68 = 0; i68 <= i67; i68 += 4) {
                            arrayList.add(new PathNode.RelativeReflectiveCurveTo(fArr4[i68], fArr4[i68 + 1], fArr4[i68 + 2], fArr4[i68 + 3]));
                        }
                        i = i3;
                        break;
                    case 't':
                        int i69 = i18 - 2;
                        for (int i70 = 0; i70 <= i69; i70 += 2) {
                            arrayList.add(new PathNode.RelativeReflectiveQuadTo(fArr4[i70], fArr4[i70 + 1]));
                        }
                        i = i3;
                        break;
                    case 'v':
                        int i71 = i18 - 1;
                        for (int i72 = 0; i72 <= i71; i72++) {
                            arrayList.add(new PathNode.RelativeVerticalTo(fArr4[i72]));
                        }
                        i = i3;
                        break;
                    default:
                        throw new IllegalArgumentException("Unknown command for: " + c2);
                }
            } else {
                i17 = i2;
            }
        }
        return arrayList;
    }
}
