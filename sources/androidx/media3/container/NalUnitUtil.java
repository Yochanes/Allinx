package androidx.media3.container;

import androidx.datastore.preferences.protobuf.AbstractC1610a;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import com.google.common.base.Ascii;
import com.google.common.collect.ImmutableList;
import com.google.common.math.DoubleMath;
import java.lang.reflect.Array;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class NalUnitUtil {

    /* JADX INFO: renamed from: a */
    public static final byte[] f25700a = {0, 0, 0, 1};

    /* JADX INFO: renamed from: b */
    public static final float[] f25701b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* JADX INFO: renamed from: c */
    public static final Object f25702c = new Object();

    /* JADX INFO: renamed from: d */
    public static int[] f25703d = new int[10];

    /* JADX INFO: compiled from: Proguard */
    public static final class H265LayerInfo {

        /* JADX INFO: renamed from: a */
        public final int f25704a;

        /* JADX INFO: renamed from: b */
        public final int f25705b;

        public H265LayerInfo(int i, int i2) {
            this.f25704a = i;
            this.f25705b = i2;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class H265NalHeader {

        /* JADX INFO: renamed from: a */
        public final int f25706a;

        /* JADX INFO: renamed from: b */
        public final int f25707b;

        /* JADX INFO: renamed from: c */
        public final int f25708c;

        public H265NalHeader(int i, int i2, int i3) {
            this.f25706a = i;
            this.f25707b = i2;
            this.f25708c = i3;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class H265ProfileTierLevel {

        /* JADX INFO: renamed from: a */
        public final int f25709a;

        /* JADX INFO: renamed from: b */
        public final boolean f25710b;

        /* JADX INFO: renamed from: c */
        public final int f25711c;

        /* JADX INFO: renamed from: d */
        public final int f25712d;

        /* JADX INFO: renamed from: e */
        public final int[] f25713e;

        /* JADX INFO: renamed from: f */
        public final int f25714f;

        public H265ProfileTierLevel(int i, boolean z2, int i2, int i3, int[] iArr, int i4) {
            this.f25709a = i;
            this.f25710b = z2;
            this.f25711c = i2;
            this.f25712d = i3;
            this.f25713e = iArr;
            this.f25714f = i4;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class H265ProfileTierLevelsAndIndices {

        /* JADX INFO: renamed from: a */
        public final ImmutableList f25715a;

        /* JADX INFO: renamed from: b */
        public final int[] f25716b;

        public H265ProfileTierLevelsAndIndices(ImmutableList immutableList, int[] iArr) {
            this.f25715a = ImmutableList.copyOf((Collection) immutableList);
            this.f25716b = iArr;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class H265RepFormat {

        /* JADX INFO: renamed from: a */
        public final int f25717a;

        /* JADX INFO: renamed from: b */
        public final int f25718b;

        /* JADX INFO: renamed from: c */
        public final int f25719c;

        /* JADX INFO: renamed from: d */
        public final int f25720d;

        /* JADX INFO: renamed from: e */
        public final int f25721e;

        public H265RepFormat(int i, int i2, int i3, int i4, int i5) {
            this.f25717a = i;
            this.f25718b = i2;
            this.f25719c = i3;
            this.f25720d = i4;
            this.f25721e = i5;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class H265RepFormatsAndIndices {

        /* JADX INFO: renamed from: a */
        public final ImmutableList f25722a;

        /* JADX INFO: renamed from: b */
        public final int[] f25723b;

        public H265RepFormatsAndIndices(ImmutableList immutableList, int[] iArr) {
            this.f25722a = ImmutableList.copyOf((Collection) immutableList);
            this.f25723b = iArr;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class H265Sei3dRefDisplayInfoData {

        /* JADX INFO: renamed from: a */
        public final int f25724a;

        public H265Sei3dRefDisplayInfoData(int i) {
            this.f25724a = i;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class H265SpsData {

        /* JADX INFO: renamed from: a */
        public final int f25725a;

        /* JADX INFO: renamed from: b */
        public final H265ProfileTierLevel f25726b;

        /* JADX INFO: renamed from: c */
        public final int f25727c;

        /* JADX INFO: renamed from: d */
        public final int f25728d;

        /* JADX INFO: renamed from: e */
        public final int f25729e;

        /* JADX INFO: renamed from: f */
        public final int f25730f;

        /* JADX INFO: renamed from: g */
        public final float f25731g;

        /* JADX INFO: renamed from: h */
        public final int f25732h;

        /* JADX INFO: renamed from: i */
        public final int f25733i;

        /* JADX INFO: renamed from: j */
        public final int f25734j;

        /* JADX INFO: renamed from: k */
        public final int f25735k;

        public H265SpsData(int i, H265ProfileTierLevel h265ProfileTierLevel, int i2, int i3, int i4, int i5, float f, int i6, int i7, int i8, int i9) {
            this.f25725a = i;
            this.f25726b = h265ProfileTierLevel;
            this.f25727c = i2;
            this.f25728d = i3;
            this.f25729e = i4;
            this.f25730f = i5;
            this.f25731g = f;
            this.f25732h = i6;
            this.f25733i = i7;
            this.f25734j = i8;
            this.f25735k = i9;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class H265VideoSignalInfo {

        /* JADX INFO: renamed from: a */
        public final int f25736a;

        /* JADX INFO: renamed from: b */
        public final int f25737b;

        /* JADX INFO: renamed from: c */
        public final int f25738c;

        public H265VideoSignalInfo(int i, int i2, int i3) {
            this.f25736a = i;
            this.f25737b = i2;
            this.f25738c = i3;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class H265VideoSignalInfosAndIndices {

        /* JADX INFO: renamed from: a */
        public final ImmutableList f25739a;

        /* JADX INFO: renamed from: b */
        public final int[] f25740b;

        public H265VideoSignalInfosAndIndices(ImmutableList immutableList, int[] iArr) {
            this.f25739a = ImmutableList.copyOf((Collection) immutableList);
            this.f25740b = iArr;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class H265VpsData {

        /* JADX INFO: renamed from: a */
        public final ImmutableList f25741a;

        /* JADX INFO: renamed from: b */
        public final H265ProfileTierLevelsAndIndices f25742b;

        /* JADX INFO: renamed from: c */
        public final H265RepFormatsAndIndices f25743c;

        /* JADX INFO: renamed from: d */
        public final H265VideoSignalInfosAndIndices f25744d;

        public H265VpsData(ImmutableList immutableList, H265ProfileTierLevelsAndIndices h265ProfileTierLevelsAndIndices, H265RepFormatsAndIndices h265RepFormatsAndIndices, H265VideoSignalInfosAndIndices h265VideoSignalInfosAndIndices) {
            this.f25741a = immutableList != null ? ImmutableList.copyOf((Collection) immutableList) : ImmutableList.m14824of();
            this.f25742b = h265ProfileTierLevelsAndIndices;
            this.f25743c = h265RepFormatsAndIndices;
            this.f25744d = h265VideoSignalInfosAndIndices;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class PpsData {

        /* JADX INFO: renamed from: a */
        public final int f25745a;

        /* JADX INFO: renamed from: b */
        public final boolean f25746b;

        public PpsData(int i, int i2, boolean z2) {
            this.f25745a = i2;
            this.f25746b = z2;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class SpsData {

        /* JADX INFO: renamed from: a */
        public final int f25747a;

        /* JADX INFO: renamed from: b */
        public final int f25748b;

        /* JADX INFO: renamed from: c */
        public final int f25749c;

        /* JADX INFO: renamed from: d */
        public final int f25750d;

        /* JADX INFO: renamed from: e */
        public final int f25751e;

        /* JADX INFO: renamed from: f */
        public final int f25752f;

        /* JADX INFO: renamed from: g */
        public final float f25753g;

        /* JADX INFO: renamed from: h */
        public final int f25754h;

        /* JADX INFO: renamed from: i */
        public final int f25755i;

        /* JADX INFO: renamed from: j */
        public final boolean f25756j;

        /* JADX INFO: renamed from: k */
        public final boolean f25757k;

        /* JADX INFO: renamed from: l */
        public final int f25758l;

        /* JADX INFO: renamed from: m */
        public final int f25759m;

        /* JADX INFO: renamed from: n */
        public final int f25760n;

        /* JADX INFO: renamed from: o */
        public final boolean f25761o;

        /* JADX INFO: renamed from: p */
        public final int f25762p;

        /* JADX INFO: renamed from: q */
        public final int f25763q;

        /* JADX INFO: renamed from: r */
        public final int f25764r;

        /* JADX INFO: renamed from: s */
        public final int f25765s;

        public SpsData(int i, int i2, int i3, int i4, int i5, int i6, float f, int i7, int i8, boolean z2, boolean z3, int i9, int i10, int i11, boolean z4, int i12, int i13, int i14, int i15) {
            this.f25747a = i;
            this.f25748b = i2;
            this.f25749c = i3;
            this.f25750d = i4;
            this.f25751e = i5;
            this.f25752f = i6;
            this.f25753g = f;
            this.f25754h = i7;
            this.f25755i = i8;
            this.f25756j = z2;
            this.f25757k = z3;
            this.f25758l = i9;
            this.f25759m = i10;
            this.f25760n = i11;
            this.f25761o = z4;
            this.f25762p = i12;
            this.f25763q = i13;
            this.f25764r = i14;
            this.f25765s = i15;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m9643a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    /* JADX INFO: renamed from: b */
    public static int m9644b(byte[] bArr, int i, int i2, boolean[] zArr) {
        int i3 = i2 - i;
        Assertions.m9464e(i3 >= 0);
        if (i3 == 0) {
            return i2;
        }
        if (zArr[0]) {
            m9643a(zArr);
            return i - 3;
        }
        if (i3 > 1 && zArr[1] && bArr[i] == 1) {
            m9643a(zArr);
            return i - 2;
        }
        if (i3 > 2 && zArr[2] && bArr[i] == 0 && bArr[i + 1] == 1) {
            m9643a(zArr);
            return i - 1;
        }
        int i4 = i2 - 1;
        int i5 = i + 2;
        while (i5 < i4) {
            byte b2 = bArr[i5];
            if ((b2 & 254) == 0) {
                int i6 = i5 - 2;
                if (bArr[i6] == 0 && bArr[i5 - 1] == 0 && b2 == 1) {
                    m9643a(zArr);
                    return i6;
                }
                i5 -= 2;
            }
            i5 += 3;
        }
        zArr[0] = i3 <= 2 ? !(i3 != 2 ? !(zArr[1] && bArr[i4] == 1) : !(zArr[2] && bArr[i2 + (-2)] == 0 && bArr[i4] == 1)) : bArr[i2 + (-3)] == 0 && bArr[i2 + (-2)] == 0 && bArr[i4] == 1;
        zArr[1] = i3 <= 1 ? zArr[2] && bArr[i4] == 0 : bArr[i2 + (-2)] == 0 && bArr[i4] == 0;
        zArr[2] = bArr[i4] == 0;
        return i2;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m9645c(byte[] bArr, int i, Format format) {
        int i2;
        if (Objects.equals(format.f25161n, "video/avc")) {
            byte b2 = bArr[4];
            if (((b2 & 96) >> 5) == 0 && ((i2 = b2 & Ascii.f42546US) == 1 || i2 == 9 || i2 == 14)) {
                return false;
            }
        } else if (Objects.equals(format.f25161n, "video/hevc")) {
            H265NalHeader h265NalHeaderM9647e = m9647e(new ParsableNalUnitBitArray(bArr, 4, i + 4));
            int i3 = h265NalHeaderM9647e.f25706a;
            if (i3 == 35) {
                return false;
            }
            if (i3 <= 14 && i3 % 2 == 0) {
                if (h265NalHeaderM9647e.f25708c == format.f25136C - 1) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: d */
    public static int m9646d(Format format) {
        if (Objects.equals(format.f25161n, "video/avc")) {
            return 1;
        }
        return (Objects.equals(format.f25161n, "video/hevc") || MimeTypes.m9331b(format.f25158k, "video/hevc")) ? 2 : 0;
    }

    /* JADX INFO: renamed from: e */
    public static H265NalHeader m9647e(ParsableNalUnitBitArray parsableNalUnitBitArray) {
        parsableNalUnitBitArray.m9665i();
        return new H265NalHeader(parsableNalUnitBitArray.m9661e(6), parsableNalUnitBitArray.m9661e(6), parsableNalUnitBitArray.m9661e(3) - 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0076  */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static H265ProfileTierLevel m9648f(ParsableNalUnitBitArray parsableNalUnitBitArray, boolean z2, int i, H265ProfileTierLevel h265ProfileTierLevel) {
        int[] iArr;
        int i2;
        boolean z3;
        int i3;
        int i4;
        boolean zM9660d;
        int iM9661e;
        int i5;
        int[] iArr2 = new int[6];
        if (z2) {
            int iM9661e2 = parsableNalUnitBitArray.m9661e(2);
            zM9660d = parsableNalUnitBitArray.m9660d();
            iM9661e = parsableNalUnitBitArray.m9661e(5);
            i5 = 0;
            for (int i6 = 0; i6 < 32; i6++) {
                if (parsableNalUnitBitArray.m9660d()) {
                    i5 |= 1 << i6;
                }
            }
            for (int i7 = 0; i7 < 6; i7++) {
                iArr2[i7] = parsableNalUnitBitArray.m9661e(8);
            }
            i2 = iM9661e2;
        } else {
            if (h265ProfileTierLevel == null) {
                iArr = iArr2;
                i2 = 0;
                z3 = false;
                i3 = 0;
                i4 = 0;
                int iM9661e3 = parsableNalUnitBitArray.m9661e(8);
                int i8 = 0;
                for (int i9 = 0; i9 < i; i9++) {
                    if (parsableNalUnitBitArray.m9660d()) {
                        i8 += 88;
                    }
                    if (parsableNalUnitBitArray.m9660d()) {
                        i8 += 8;
                    }
                }
                parsableNalUnitBitArray.m9666j(i8);
                if (i > 0) {
                    parsableNalUnitBitArray.m9666j((8 - i) * 2);
                }
                return new H265ProfileTierLevel(i2, z3, i3, i4, iArr, iM9661e3);
            }
            int i10 = h265ProfileTierLevel.f25709a;
            zM9660d = h265ProfileTierLevel.f25710b;
            iM9661e = h265ProfileTierLevel.f25711c;
            i5 = h265ProfileTierLevel.f25712d;
            iArr2 = h265ProfileTierLevel.f25713e;
            i2 = i10;
        }
        iArr = iArr2;
        z3 = zM9660d;
        i3 = iM9661e;
        i4 = i5;
        int iM9661e32 = parsableNalUnitBitArray.m9661e(8);
        int i82 = 0;
        while (i9 < i) {
        }
        parsableNalUnitBitArray.m9666j(i82);
        if (i > 0) {
        }
        return new H265ProfileTierLevel(i2, z3, i3, i4, iArr, iM9661e32);
    }

    /* JADX INFO: renamed from: g */
    public static H265Sei3dRefDisplayInfoData m9649g(byte[] bArr, int i, int i2) {
        byte b2;
        int i3 = i + 2;
        do {
            i2--;
            b2 = bArr[i2];
            if (b2 != 0) {
                break;
            }
        } while (i2 > i3);
        if (b2 == 0 || i2 <= i3) {
            return null;
        }
        ParsableNalUnitBitArray parsableNalUnitBitArray = new ParsableNalUnitBitArray(bArr, i3, i2 + 1);
        while (parsableNalUnitBitArray.m9658b(16)) {
            int iM9661e = parsableNalUnitBitArray.m9661e(8);
            int i4 = 0;
            while (iM9661e == 255) {
                i4 += 255;
                iM9661e = parsableNalUnitBitArray.m9661e(8);
            }
            int i5 = i4 + iM9661e;
            int iM9661e2 = parsableNalUnitBitArray.m9661e(8);
            int i6 = 0;
            while (iM9661e2 == 255) {
                i6 += 255;
                iM9661e2 = parsableNalUnitBitArray.m9661e(8);
            }
            int i7 = i6 + iM9661e2;
            if (i7 == 0 || !parsableNalUnitBitArray.m9658b(i7)) {
                return null;
            }
            if (i5 == 176) {
                int iM9662f = parsableNalUnitBitArray.m9662f();
                boolean zM9660d = parsableNalUnitBitArray.m9660d();
                int iM9662f2 = zM9660d ? parsableNalUnitBitArray.m9662f() : 0;
                int iM9662f3 = parsableNalUnitBitArray.m9662f();
                int iM9662f4 = -1;
                for (int i8 = 0; i8 <= iM9662f3; i8++) {
                    iM9662f4 = parsableNalUnitBitArray.m9662f();
                    parsableNalUnitBitArray.m9662f();
                    int iM9661e3 = parsableNalUnitBitArray.m9661e(6);
                    if (iM9661e3 == 63) {
                        return null;
                    }
                    parsableNalUnitBitArray.m9661e(iM9661e3 == 0 ? Math.max(0, iM9662f - 30) : Math.max(0, (iM9661e3 + iM9662f) - 31));
                    if (zM9660d) {
                        int iM9661e4 = parsableNalUnitBitArray.m9661e(6);
                        if (iM9661e4 == 63) {
                            return null;
                        }
                        parsableNalUnitBitArray.m9661e(iM9661e4 == 0 ? Math.max(0, iM9662f2 - 30) : Math.max(0, (iM9661e4 + iM9662f2) - 31));
                    }
                    if (parsableNalUnitBitArray.m9660d()) {
                        parsableNalUnitBitArray.m9666j(10);
                    }
                }
                return new H265Sei3dRefDisplayInfoData(iM9662f4);
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a5  */
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static H265SpsData m9650h(byte[] bArr, int i, int i2, H265VpsData h265VpsData) {
        int i3;
        int i4;
        int i5;
        int iM9662f;
        int iM9662f2;
        int iMax;
        int i6;
        int i7;
        int i8;
        int iM9236f;
        int iM9237g;
        int i9;
        H265VideoSignalInfosAndIndices h265VideoSignalInfosAndIndices;
        int i10;
        int i11;
        int i12;
        H265RepFormatsAndIndices h265RepFormatsAndIndices;
        H265NalHeader h265NalHeaderM9647e = m9647e(new ParsableNalUnitBitArray(bArr, i, i2));
        ParsableNalUnitBitArray parsableNalUnitBitArray = new ParsableNalUnitBitArray(bArr, i + 2, i2);
        int i13 = 4;
        parsableNalUnitBitArray.m9666j(4);
        int iM9661e = parsableNalUnitBitArray.m9661e(3);
        int i14 = h265NalHeaderM9647e.f25707b;
        boolean z2 = i14 != 0 && iM9661e == 7;
        if (h265VpsData != null) {
            ImmutableList immutableList = h265VpsData.f25741a;
            i3 = !immutableList.isEmpty() ? ((H265LayerInfo) immutableList.get(Math.min(i14, immutableList.size() - 1))).f25704a : 0;
        }
        H265ProfileTierLevel h265ProfileTierLevelM9648f = null;
        if (!z2) {
            parsableNalUnitBitArray.m9665i();
            h265ProfileTierLevelM9648f = m9648f(parsableNalUnitBitArray, true, iM9661e, null);
        } else if (h265VpsData != null) {
            H265ProfileTierLevelsAndIndices h265ProfileTierLevelsAndIndices = h265VpsData.f25742b;
            int i15 = h265ProfileTierLevelsAndIndices.f25716b[i3];
            ImmutableList immutableList2 = h265ProfileTierLevelsAndIndices.f25715a;
            if (immutableList2.size() > i15) {
                h265ProfileTierLevelM9648f = (H265ProfileTierLevel) immutableList2.get(i15);
            }
        }
        parsableNalUnitBitArray.m9662f();
        if (z2) {
            int iM9661e2 = parsableNalUnitBitArray.m9660d() ? parsableNalUnitBitArray.m9661e(8) : -1;
            if (h265VpsData == null || (h265RepFormatsAndIndices = h265VpsData.f25743c) == null) {
                iM9662f = 0;
                iM9662f2 = 0;
                i5 = 0;
                i4 = 0;
            } else {
                if (iM9661e2 == -1) {
                    iM9661e2 = h265RepFormatsAndIndices.f25723b[i3];
                }
                if (iM9661e2 != -1) {
                    ImmutableList immutableList3 = h265RepFormatsAndIndices.f25722a;
                    if (immutableList3.size() > iM9661e2) {
                        H265RepFormat h265RepFormat = (H265RepFormat) immutableList3.get(iM9661e2);
                        int i16 = h265RepFormat.f25717a;
                        i5 = h265RepFormat.f25720d;
                        i4 = h265RepFormat.f25721e;
                        iM9662f = h265RepFormat.f25718b;
                        iM9662f2 = h265RepFormat.f25719c;
                    }
                }
            }
        } else {
            int iM9662f3 = parsableNalUnitBitArray.m9662f();
            if (iM9662f3 == 3) {
                parsableNalUnitBitArray.m9665i();
            }
            int iM9662f4 = parsableNalUnitBitArray.m9662f();
            int iM9662f5 = parsableNalUnitBitArray.m9662f();
            if (parsableNalUnitBitArray.m9660d()) {
                int iM9662f6 = parsableNalUnitBitArray.m9662f();
                int iM9662f7 = parsableNalUnitBitArray.m9662f();
                int iM9662f8 = parsableNalUnitBitArray.m9662f();
                int iM9662f9 = parsableNalUnitBitArray.m9662f();
                iM9662f4 -= (iM9662f6 + iM9662f7) * ((iM9662f3 == 1 || iM9662f3 == 2) ? 2 : 1);
                iM9662f5 -= (iM9662f8 + iM9662f9) * (iM9662f3 == 1 ? 2 : 1);
            }
            i4 = iM9662f5;
            i5 = iM9662f4;
            iM9662f = parsableNalUnitBitArray.m9662f();
            iM9662f2 = parsableNalUnitBitArray.m9662f();
        }
        int iM9662f10 = parsableNalUnitBitArray.m9662f();
        if (z2) {
            iMax = -1;
        } else {
            iMax = -1;
            for (int i17 = parsableNalUnitBitArray.m9660d() ? 0 : iM9661e; i17 <= iM9661e; i17++) {
                parsableNalUnitBitArray.m9662f();
                iMax = Math.max(parsableNalUnitBitArray.m9662f(), iMax);
                parsableNalUnitBitArray.m9662f();
            }
        }
        parsableNalUnitBitArray.m9662f();
        parsableNalUnitBitArray.m9662f();
        parsableNalUnitBitArray.m9662f();
        parsableNalUnitBitArray.m9662f();
        parsableNalUnitBitArray.m9662f();
        parsableNalUnitBitArray.m9662f();
        if (parsableNalUnitBitArray.m9660d()) {
            int i18 = 6;
            if (z2 ? parsableNalUnitBitArray.m9660d() : false) {
                parsableNalUnitBitArray.m9666j(6);
            } else if (parsableNalUnitBitArray.m9660d()) {
                int i19 = 0;
                while (i19 < i13) {
                    int i20 = 0;
                    while (i20 < i18) {
                        if (parsableNalUnitBitArray.m9660d()) {
                            int iMin = Math.min(64, 1 << ((i19 << 1) + 4));
                            if (i19 > 1) {
                                parsableNalUnitBitArray.m9663g();
                            }
                            for (int i21 = 0; i21 < iMin; i21++) {
                                parsableNalUnitBitArray.m9663g();
                            }
                        } else {
                            parsableNalUnitBitArray.m9662f();
                        }
                        i20 += i19 == 3 ? 3 : 1;
                        i18 = 6;
                    }
                    i19++;
                    i13 = 4;
                    i18 = 6;
                }
            }
        }
        parsableNalUnitBitArray.m9666j(2);
        if (parsableNalUnitBitArray.m9660d()) {
            parsableNalUnitBitArray.m9666j(8);
            parsableNalUnitBitArray.m9662f();
            parsableNalUnitBitArray.m9662f();
            parsableNalUnitBitArray.m9665i();
        }
        int iM9662f11 = parsableNalUnitBitArray.m9662f();
        int[] iArr = new int[0];
        int[] iArrCopyOf = new int[0];
        int i22 = 0;
        int iM9662f12 = -1;
        int i23 = -1;
        while (i22 < iM9662f11) {
            if (i22 == 0 || !parsableNalUnitBitArray.m9660d()) {
                i10 = iM9662f11;
                i11 = i22;
                i12 = i3;
                int iM9662f13 = parsableNalUnitBitArray.m9662f();
                iM9662f12 = parsableNalUnitBitArray.m9662f();
                int[] iArr2 = new int[iM9662f13];
                int i24 = 0;
                while (i24 < iM9662f13) {
                    iArr2[i24] = (i24 > 0 ? iArr2[i24 - 1] : 0) - (parsableNalUnitBitArray.m9662f() + 1);
                    parsableNalUnitBitArray.m9665i();
                    i24++;
                }
                int[] iArr3 = new int[iM9662f12];
                int i25 = 0;
                while (i25 < iM9662f12) {
                    iArr3[i25] = parsableNalUnitBitArray.m9662f() + 1 + (i25 > 0 ? iArr3[i25 - 1] : 0);
                    parsableNalUnitBitArray.m9665i();
                    i25++;
                }
                i23 = iM9662f13;
                iArr = iArr2;
                iArrCopyOf = iArr3;
            } else {
                i10 = iM9662f11;
                int i26 = i23 + iM9662f12;
                int iM9662f14 = (1 - ((parsableNalUnitBitArray.m9660d() ? 1 : 0) * 2)) * (parsableNalUnitBitArray.m9662f() + 1);
                i11 = i22;
                int i27 = i26 + 1;
                i12 = i3;
                boolean[] zArr = new boolean[i27];
                for (int i28 = 0; i28 <= i26; i28++) {
                    if (parsableNalUnitBitArray.m9660d()) {
                        zArr[i28] = true;
                    } else {
                        zArr[i28] = parsableNalUnitBitArray.m9660d();
                    }
                }
                int[] iArr4 = new int[i27];
                int[] iArr5 = new int[i27];
                int i29 = 0;
                for (int i30 = iM9662f12 - 1; i30 >= 0; i30--) {
                    int i31 = iArrCopyOf[i30] + iM9662f14;
                    if (i31 < 0 && zArr[i23 + i30]) {
                        iArr4[i29] = i31;
                        i29++;
                    }
                }
                if (iM9662f14 < 0 && zArr[i26]) {
                    iArr4[i29] = iM9662f14;
                    i29++;
                }
                int i32 = i29;
                int[] iArr6 = iArr;
                for (int i33 = 0; i33 < i23; i33++) {
                    int i34 = iArr6[i33] + iM9662f14;
                    if (i34 < 0 && zArr[i33]) {
                        iArr4[i32] = i34;
                        i32++;
                    }
                }
                int[] iArrCopyOf2 = Arrays.copyOf(iArr4, i32);
                int i35 = 0;
                for (int i36 = i23 - 1; i36 >= 0; i36--) {
                    int i37 = iArr6[i36] + iM9662f14;
                    if (i37 > 0 && zArr[i36]) {
                        iArr5[i35] = i37;
                        i35++;
                    }
                }
                if (iM9662f14 > 0 && zArr[i26]) {
                    iArr5[i35] = iM9662f14;
                    i35++;
                }
                int i38 = i32;
                int i39 = i35;
                for (int i40 = 0; i40 < iM9662f12; i40++) {
                    int i41 = iArrCopyOf[i40] + iM9662f14;
                    if (i41 > 0 && zArr[i23 + i40]) {
                        iArr5[i39] = i41;
                        i39++;
                    }
                }
                iArrCopyOf = Arrays.copyOf(iArr5, i39);
                iM9662f12 = i39;
                i23 = i38;
                iArr = iArrCopyOf2;
            }
            i22 = i11 + 1;
            iM9662f11 = i10;
            i3 = i12;
        }
        int i42 = i3;
        if (parsableNalUnitBitArray.m9660d()) {
            int iM9662f15 = parsableNalUnitBitArray.m9662f();
            for (int i43 = 0; i43 < iM9662f15; i43++) {
                parsableNalUnitBitArray.m9666j(iM9662f10 + 5);
            }
        }
        parsableNalUnitBitArray.m9666j(2);
        float f = 1.0f;
        if (parsableNalUnitBitArray.m9660d()) {
            if (parsableNalUnitBitArray.m9660d()) {
                int iM9661e3 = parsableNalUnitBitArray.m9661e(8);
                if (iM9661e3 == 255) {
                    int iM9661e4 = parsableNalUnitBitArray.m9661e(16);
                    int iM9661e5 = parsableNalUnitBitArray.m9661e(16);
                    if (iM9661e4 != 0 && iM9661e5 != 0) {
                        f = iM9661e4 / iM9661e5;
                    }
                } else if (iM9661e3 < 17) {
                    f = f25701b[iM9661e3];
                } else {
                    AbstractC1610a.m8738p(iM9661e3, "Unexpected aspect_ratio_idc value: ", "NalUnitUtil");
                }
            }
            if (parsableNalUnitBitArray.m9660d()) {
                parsableNalUnitBitArray.m9665i();
            }
            if (parsableNalUnitBitArray.m9660d()) {
                parsableNalUnitBitArray.m9666j(3);
                i9 = parsableNalUnitBitArray.m9660d() ? 1 : 2;
                if (parsableNalUnitBitArray.m9660d()) {
                    int iM9661e6 = parsableNalUnitBitArray.m9661e(8);
                    int iM9661e7 = parsableNalUnitBitArray.m9661e(8);
                    parsableNalUnitBitArray.m9666j(8);
                    iM9236f = ColorInfo.m9236f(iM9661e6);
                    iM9237g = ColorInfo.m9237g(iM9661e7);
                } else {
                    iM9236f = -1;
                    iM9237g = -1;
                }
            } else if (h265VpsData == null || (h265VideoSignalInfosAndIndices = h265VpsData.f25744d) == null) {
                iM9236f = -1;
                iM9237g = -1;
                i9 = -1;
            } else {
                int i44 = h265VideoSignalInfosAndIndices.f25740b[i42];
                ImmutableList immutableList4 = h265VideoSignalInfosAndIndices.f25739a;
                if (immutableList4.size() > i44) {
                    H265VideoSignalInfo h265VideoSignalInfo = (H265VideoSignalInfo) immutableList4.get(i44);
                    int i45 = h265VideoSignalInfo.f25736a;
                    int i46 = h265VideoSignalInfo.f25737b;
                    iM9237g = h265VideoSignalInfo.f25738c;
                    iM9236f = i45;
                    i9 = i46;
                }
            }
            if (parsableNalUnitBitArray.m9660d()) {
                parsableNalUnitBitArray.m9662f();
                parsableNalUnitBitArray.m9662f();
            }
            parsableNalUnitBitArray.m9665i();
            if (parsableNalUnitBitArray.m9660d()) {
                i4 *= 2;
            }
            i6 = iM9236f;
            i8 = iM9237g;
            i7 = i9;
        } else {
            i6 = -1;
            i7 = -1;
            i8 = -1;
        }
        return new H265SpsData(iM9661e, h265ProfileTierLevelM9648f, iM9662f, iM9662f2, i5, i4, f, iMax, i6, i7, i8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0116  */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static H265VpsData m9651i(byte[] bArr, int i, int i2) {
        int[] iArr;
        int[] iArr2;
        H265VideoSignalInfosAndIndices h265VideoSignalInfosAndIndices;
        int iM9661e;
        int iM9661e2;
        int iM9661e3;
        int i3;
        int i4;
        ImmutableList immutableList;
        boolean[][] zArr;
        int i5;
        int i6;
        boolean[][] zArr2;
        int[] iArr3;
        int[] iArr4;
        int i7;
        boolean z2;
        int i8;
        boolean zM9660d;
        int i9;
        int i10;
        int i11;
        boolean zM9660d2;
        int i12;
        int iM9662f;
        boolean z3;
        boolean z4;
        ParsableNalUnitBitArray parsableNalUnitBitArray = new ParsableNalUnitBitArray(bArr, i, i2);
        m9647e(parsableNalUnitBitArray);
        parsableNalUnitBitArray.m9666j(4);
        boolean zM9660d3 = parsableNalUnitBitArray.m9660d();
        boolean zM9660d4 = parsableNalUnitBitArray.m9660d();
        int iM9661e4 = parsableNalUnitBitArray.m9661e(6);
        int i13 = iM9661e4 + 1;
        int iM9661e5 = parsableNalUnitBitArray.m9661e(3);
        parsableNalUnitBitArray.m9666j(17);
        H265ProfileTierLevel h265ProfileTierLevelM9648f = m9648f(parsableNalUnitBitArray, true, iM9661e5, null);
        for (int i14 = parsableNalUnitBitArray.m9660d() ? 0 : iM9661e5; i14 <= iM9661e5; i14++) {
            parsableNalUnitBitArray.m9662f();
            parsableNalUnitBitArray.m9662f();
            parsableNalUnitBitArray.m9662f();
        }
        int iM9661e6 = parsableNalUnitBitArray.m9661e(6);
        int iM9662f2 = parsableNalUnitBitArray.m9662f() + 1;
        int i15 = 6;
        H265ProfileTierLevelsAndIndices h265ProfileTierLevelsAndIndices = new H265ProfileTierLevelsAndIndices(ImmutableList.m14825of(h265ProfileTierLevelM9648f), new int[1]);
        boolean z5 = i13 >= 2 && iM9662f2 >= 2;
        boolean z6 = zM9660d3 && zM9660d4;
        int i16 = iM9661e6 + 1;
        boolean z7 = i16 >= i13;
        if (!z5 || !z6 || !z7) {
            return new H265VpsData(null, h265ProfileTierLevelsAndIndices, null, null);
        }
        Class cls = Integer.TYPE;
        int[][] iArr5 = (int[][]) Array.newInstance((Class<?>) cls, iM9662f2, i16);
        int i17 = 1;
        int[] iArr6 = new int[iM9662f2];
        int[] iArr7 = new int[iM9662f2];
        iArr5[0][0] = 0;
        iArr6[0] = 1;
        iArr7[0] = 0;
        for (int i18 = 1; i18 < iM9662f2; i18++) {
            int i19 = 0;
            for (int i20 = 0; i20 <= iM9661e6; i20++) {
                if (parsableNalUnitBitArray.m9660d()) {
                    iArr5[i18][i19] = i20;
                    iArr7[i18] = i20;
                    i19++;
                }
                iArr6[i18] = i19;
            }
        }
        if (parsableNalUnitBitArray.m9660d()) {
            parsableNalUnitBitArray.m9666j(64);
            if (parsableNalUnitBitArray.m9660d()) {
                parsableNalUnitBitArray.m9662f();
            }
            int iM9662f3 = parsableNalUnitBitArray.m9662f();
            int i21 = 0;
            while (i21 < iM9662f3) {
                parsableNalUnitBitArray.m9662f();
                if (i21 == 0 || parsableNalUnitBitArray.m9660d()) {
                    boolean zM9660d5 = parsableNalUnitBitArray.m9660d();
                    boolean zM9660d6 = parsableNalUnitBitArray.m9660d();
                    z4 = zM9660d5;
                    z3 = zM9660d6;
                    if (zM9660d5 || zM9660d6) {
                        zM9660d = parsableNalUnitBitArray.m9660d();
                        if (zM9660d) {
                            parsableNalUnitBitArray.m9666j(19);
                        }
                        parsableNalUnitBitArray.m9666j(8);
                        if (zM9660d) {
                            parsableNalUnitBitArray.m9666j(4);
                        }
                        parsableNalUnitBitArray.m9666j(15);
                        i10 = zM9660d5;
                        i9 = zM9660d6;
                    }
                    i11 = 0;
                    while (i11 <= iM9661e5) {
                        boolean zM9660d7 = parsableNalUnitBitArray.m9660d();
                        if (!zM9660d7) {
                            zM9660d7 = parsableNalUnitBitArray.m9660d();
                        }
                        if (zM9660d7) {
                            parsableNalUnitBitArray.m9662f();
                            zM9660d2 = false;
                        } else {
                            zM9660d2 = parsableNalUnitBitArray.m9660d();
                        }
                        if (zM9660d2) {
                            i12 = i21;
                            iM9662f = 0;
                        } else {
                            i12 = i21;
                            iM9662f = parsableNalUnitBitArray.m9662f();
                        }
                        int[][] iArr8 = iArr5;
                        int i22 = i10 + i9;
                        int[] iArr9 = iArr7;
                        int i23 = 0;
                        while (i23 < i22) {
                            int i24 = i22;
                            for (int i25 = 0; i25 <= iM9662f; i25++) {
                                parsableNalUnitBitArray.m9662f();
                                parsableNalUnitBitArray.m9662f();
                                if (zM9660d) {
                                    parsableNalUnitBitArray.m9662f();
                                    parsableNalUnitBitArray.m9662f();
                                }
                                parsableNalUnitBitArray.m9665i();
                            }
                            i23++;
                            i22 = i24;
                        }
                        i11++;
                        i21 = i12;
                        iArr5 = iArr8;
                        iArr7 = iArr9;
                    }
                    i21++;
                } else {
                    z4 = false;
                    z3 = false;
                }
                zM9660d = false;
                i10 = z4;
                i9 = z3;
                i11 = 0;
                while (i11 <= iM9661e5) {
                }
                i21++;
            }
        }
        int[][] iArr10 = iArr5;
        int[] iArr11 = iArr7;
        if (!parsableNalUnitBitArray.m9660d()) {
            return new H265VpsData(null, h265ProfileTierLevelsAndIndices, null, null);
        }
        int i26 = parsableNalUnitBitArray.f25778d;
        if (i26 > 0) {
            parsableNalUnitBitArray.m9666j(8 - i26);
        }
        H265ProfileTierLevel h265ProfileTierLevelM9648f2 = m9648f(parsableNalUnitBitArray, false, iM9661e5, h265ProfileTierLevelM9648f);
        boolean zM9660d8 = parsableNalUnitBitArray.m9660d();
        boolean[] zArr3 = new boolean[16];
        int i27 = 0;
        for (int i28 = 0; i28 < 16; i28++) {
            boolean zM9660d9 = parsableNalUnitBitArray.m9660d();
            zArr3[i28] = zM9660d9;
            if (zM9660d9) {
                i27++;
            }
        }
        if (i27 == 0 || !zArr3[1]) {
            return new H265VpsData(null, h265ProfileTierLevelsAndIndices, null, null);
        }
        int[] iArr12 = new int[i27];
        for (int i29 = 0; i29 < i27 - (zM9660d8 ? 1 : 0); i29++) {
            iArr12[i29] = parsableNalUnitBitArray.m9661e(3);
        }
        int[] iArr13 = new int[i27 + 1];
        if (zM9660d8) {
            int i30 = 1;
            while (i30 < i27) {
                int[] iArr14 = iArr13;
                for (int i31 = 0; i31 < i30; i31++) {
                    iArr14[i30] = iArr12[i31] + 1 + iArr14[i30];
                }
                i30++;
                iArr13 = iArr14;
            }
            iArr = iArr13;
            iArr[i27] = 6;
        } else {
            iArr = iArr13;
        }
        int[][] iArr15 = (int[][]) Array.newInstance((Class<?>) cls, i13, i27);
        int[] iArr16 = new int[i13];
        iArr16[0] = 0;
        boolean zM9660d10 = parsableNalUnitBitArray.m9660d();
        int i32 = 1;
        while (i32 < i13) {
            if (zM9660d10) {
                i8 = i32;
                iArr16[i8] = parsableNalUnitBitArray.m9661e(i15);
            } else {
                i8 = i32;
                iArr16[i8] = i8;
            }
            if (zM9660d8) {
                for (int i33 = 0; i33 < i27; i33++) {
                    iArr15[i8][i33] = (iArr16[i8] & ((1 << iArr[r30]) - 1)) >> iArr[i33];
                }
            } else {
                int i34 = 0;
                while (i34 < i27) {
                    int i35 = i34;
                    iArr15[i8][i35] = parsableNalUnitBitArray.m9661e(iArr12[i34] + 1);
                    i34 = i35 + 1;
                }
            }
            i32 = i8 + 1;
            i15 = 6;
        }
        int[] iArr17 = new int[i16];
        int i36 = 1;
        int i37 = 0;
        while (i37 < i13) {
            iArr17[iArr16[i37]] = -1;
            int[] iArr18 = iArr17;
            int i38 = 0;
            int i39 = 0;
            while (i38 < 16) {
                if (zArr3[i38]) {
                    if (i38 == i17) {
                        iArr18[iArr16[i37]] = iArr15[i37][i39];
                    }
                    i39++;
                }
                i38++;
                i17 = 1;
            }
            if (i37 > 0) {
                int i40 = 0;
                while (true) {
                    if (i40 >= i37) {
                        z2 = true;
                        break;
                    }
                    int i41 = i40;
                    if (iArr18[iArr16[i37]] == iArr18[iArr16[i40]]) {
                        z2 = false;
                        break;
                    }
                    i40 = i41 + 1;
                }
                if (z2) {
                    i36++;
                }
            }
            i37++;
            iArr17 = iArr18;
            i17 = 1;
        }
        int[] iArr19 = iArr17;
        int iM9661e7 = parsableNalUnitBitArray.m9661e(4);
        if (i36 < 2 || iM9661e7 == 0) {
            return new H265VpsData(null, h265ProfileTierLevelsAndIndices, null, null);
        }
        int[] iArr20 = new int[i36];
        for (int i42 = 0; i42 < i36; i42++) {
            iArr20[i42] = parsableNalUnitBitArray.m9661e(iM9661e7);
        }
        int[] iArr21 = new int[i16];
        for (int i43 = 0; i43 < i13; i43++) {
            iArr21[Math.min(iArr16[i43], iM9661e6)] = i43;
        }
        ImmutableList.Builder builder = ImmutableList.builder();
        int i44 = 0;
        while (i44 <= iM9661e6) {
            int[] iArr22 = iArr21;
            int i45 = i36;
            int iMin = Math.min(iArr19[i44], i45 - 1);
            builder.add(new H265LayerInfo(iArr22[i44], iMin >= 0 ? iArr20[iMin] : -1));
            i44++;
            iArr21 = iArr22;
            iArr16 = iArr16;
            i36 = i45;
        }
        int[] iArr23 = iArr16;
        ImmutableList immutableListBuild = builder.build();
        if (((H265LayerInfo) immutableListBuild.get(0)).f25705b == -1) {
            return new H265VpsData(null, h265ProfileTierLevelsAndIndices, null, null);
        }
        int i46 = 1;
        while (true) {
            if (i46 > iM9661e6) {
                i46 = -1;
                break;
            }
            if (((H265LayerInfo) immutableListBuild.get(i46)).f25705b != -1) {
                break;
            }
            i46++;
        }
        if (i46 == -1) {
            return new H265VpsData(null, h265ProfileTierLevelsAndIndices, null, null);
        }
        Class cls2 = Boolean.TYPE;
        boolean[][] zArr4 = (boolean[][]) Array.newInstance((Class<?>) cls2, i13, i13);
        boolean[][] zArr5 = (boolean[][]) Array.newInstance((Class<?>) cls2, i13, i13);
        for (int i47 = 1; i47 < i13; i47++) {
            for (int i48 = 0; i48 < i47; i48++) {
                boolean[] zArr6 = zArr4[i47];
                boolean[] zArr7 = zArr5[i47];
                boolean zM9660d11 = parsableNalUnitBitArray.m9660d();
                zArr7[i48] = zM9660d11;
                zArr6[i48] = zM9660d11;
            }
        }
        for (int i49 = 1; i49 < i13; i49++) {
            int i50 = 0;
            while (i50 < iM9661e4) {
                boolean[][] zArr8 = zArr4;
                int i51 = 0;
                while (true) {
                    if (i51 < i49) {
                        boolean[] zArr9 = zArr5[i49];
                        if (zArr9[i51] && zArr5[i51][i50]) {
                            zArr9[i50] = true;
                            break;
                        }
                        i51++;
                    }
                }
                i50++;
                zArr4 = zArr8;
            }
        }
        boolean[][] zArr10 = zArr4;
        int[] iArr24 = new int[i16];
        for (int i52 = 0; i52 < i13; i52++) {
            int i53 = 0;
            for (int i54 = 0; i54 < i52; i54++) {
                i53 += zArr10[i52][i54] ? 1 : 0;
            }
            iArr24[iArr23[i52]] = i53;
        }
        int i55 = 0;
        for (int i56 = 0; i56 < i13; i56++) {
            if (iArr24[iArr23[i56]] == 0) {
                i55++;
            }
        }
        if (i55 > 1) {
            return new H265VpsData(null, h265ProfileTierLevelsAndIndices, null, null);
        }
        int[] iArr25 = new int[i13];
        int[] iArr26 = new int[iM9662f2];
        if (parsableNalUnitBitArray.m9660d()) {
            iArr2 = iArr24;
            int i57 = 0;
            while (i57 < i13) {
                int i58 = i57;
                iArr25[i58] = parsableNalUnitBitArray.m9661e(3);
                i57 = i58 + 1;
            }
        } else {
            iArr2 = iArr24;
            Arrays.fill(iArr25, 0, i13, iM9661e5);
        }
        int i59 = 0;
        while (i59 < iM9662f2) {
            int i60 = i59;
            boolean[][] zArr11 = zArr5;
            int[] iArr27 = iArr25;
            int iMax = 0;
            for (int i61 = 0; i61 < iArr6[i60]; i61++) {
                iMax = Math.max(iMax, iArr27[((H265LayerInfo) immutableListBuild.get(iArr10[i60][i61])).f25704a]);
            }
            iArr26[i60] = iMax + 1;
            i59 = i60 + 1;
            zArr5 = zArr11;
            iArr25 = iArr27;
        }
        boolean[][] zArr12 = zArr5;
        if (parsableNalUnitBitArray.m9660d()) {
            int i62 = 0;
            while (i62 < iM9661e4) {
                int i63 = i62 + 1;
                int i64 = i63;
                while (i64 < i13) {
                    if (zArr10[i64][i62]) {
                        i7 = iM9661e4;
                        parsableNalUnitBitArray.m9666j(3);
                    } else {
                        i7 = iM9661e4;
                    }
                    i64++;
                    iM9661e4 = i7;
                }
                i62 = i63;
            }
        }
        parsableNalUnitBitArray.m9665i();
        int iM9662f4 = parsableNalUnitBitArray.m9662f() + 1;
        ImmutableList.Builder builder2 = ImmutableList.builder();
        builder2.add(h265ProfileTierLevelM9648f);
        if (iM9662f4 > 1) {
            builder2.add(h265ProfileTierLevelM9648f2);
            for (int i65 = 2; i65 < iM9662f4; i65++) {
                h265ProfileTierLevelM9648f2 = m9648f(parsableNalUnitBitArray, parsableNalUnitBitArray.m9660d(), iM9661e5, h265ProfileTierLevelM9648f2);
                builder2.add(h265ProfileTierLevelM9648f2);
            }
        }
        ImmutableList immutableListBuild2 = builder2.build();
        int iM9662f5 = parsableNalUnitBitArray.m9662f() + iM9662f2;
        if (iM9662f5 > iM9662f2) {
            return new H265VpsData(null, h265ProfileTierLevelsAndIndices, null, null);
        }
        int iM9661e8 = parsableNalUnitBitArray.m9661e(2);
        boolean[][] zArr13 = (boolean[][]) Array.newInstance((Class<?>) cls2, iM9662f5, i16);
        int[] iArr28 = new int[iM9662f5];
        int i66 = 0;
        int[] iArr29 = new int[iM9662f5];
        int i67 = 0;
        while (i67 < iM9662f2) {
            iArr28[i67] = i66;
            iArr29[i67] = iArr11[i67];
            if (iM9661e8 == 0) {
                i6 = i67;
                zArr2 = zArr13;
                iArr3 = iArr28;
                iArr4 = iArr26;
                Arrays.fill(zArr13[i6], i66, iArr6[i6], true);
                iArr3[i6] = iArr6[i6];
            } else {
                i6 = i67;
                zArr2 = zArr13;
                iArr3 = iArr28;
                iArr4 = iArr26;
                if (iM9661e8 == 1) {
                    int i68 = iArr11[i6];
                    for (int i69 = 0; i69 < iArr6[i6]; i69++) {
                        zArr2[i6][i69] = iArr10[i6][i69] == i68;
                    }
                    iArr3[i6] = 1;
                } else {
                    i66 = 0;
                    zArr2[0][0] = true;
                    iArr3[0] = 1;
                    i67 = i6 + 1;
                    zArr13 = zArr2;
                    iArr28 = iArr3;
                    iArr26 = iArr4;
                }
            }
            i66 = 0;
            i67 = i6 + 1;
            zArr13 = zArr2;
            iArr28 = iArr3;
            iArr26 = iArr4;
        }
        boolean[][] zArr14 = zArr13;
        int[] iArr30 = iArr28;
        int[] iArr31 = iArr26;
        int[] iArr32 = new int[i16];
        int i70 = 2;
        int[] iArr33 = new int[2];
        iArr33[1] = i16;
        iArr33[i66] = iM9662f5;
        boolean[][] zArr15 = (boolean[][]) Array.newInstance((Class<?>) cls2, iArr33);
        int i71 = 1;
        int i72 = 0;
        while (i71 < iM9662f5) {
            if (iM9661e8 == i70) {
                for (int i73 = 0; i73 < iArr6[i71]; i73++) {
                    zArr14[i71][i73] = parsableNalUnitBitArray.m9660d();
                    int i74 = iArr30[i71];
                    boolean z8 = zArr14[i71][i73];
                    iArr30[i71] = i74 + (z8 ? 1 : 0);
                    if (z8) {
                        iArr29[i71] = iArr10[i71][i73];
                    }
                }
            }
            if (i72 == 0) {
                i4 = 0;
                if (iArr10[i71][0] == 0 && zArr14[i71][0]) {
                    for (int i75 = 1; i75 < iArr6[i71]; i75++) {
                        if (iArr10[i71][i75] == i46 && zArr14[i71][i46]) {
                            i72 = i71;
                        }
                    }
                }
            } else {
                i4 = 0;
            }
            int i76 = i4;
            while (i76 < iArr6[i71]) {
                if (iM9662f4 > 1) {
                    zArr15[i71][i76] = zArr14[i71][i76];
                    immutableList = immutableListBuild2;
                    zArr = zArr15;
                    i5 = iM9662f4;
                    int iLog2 = DoubleMath.log2(iM9662f4, RoundingMode.CEILING);
                    if (!zArr[i71][i76]) {
                        int i77 = ((H265LayerInfo) immutableListBuild.get(iArr10[i71][i76])).f25704a;
                        int i78 = i4;
                        while (true) {
                            if (i78 >= i76) {
                                break;
                            }
                            int i79 = i77;
                            if (zArr12[i79][((H265LayerInfo) immutableListBuild.get(iArr10[i71][i78])).f25704a]) {
                                zArr[i71][i76] = true;
                                break;
                            }
                            i78++;
                            i77 = i79;
                        }
                    }
                    if (zArr[i71][i76]) {
                        if (i72 <= 0 || i71 != i72) {
                            parsableNalUnitBitArray.m9666j(iLog2);
                        } else {
                            iArr32[i76] = parsableNalUnitBitArray.m9661e(iLog2);
                        }
                    }
                } else {
                    immutableList = immutableListBuild2;
                    zArr = zArr15;
                    i5 = iM9662f4;
                }
                i76++;
                immutableListBuild2 = immutableList;
                zArr15 = zArr;
                iM9662f4 = i5;
            }
            ImmutableList immutableList2 = immutableListBuild2;
            boolean[][] zArr16 = zArr15;
            int i80 = iM9662f4;
            if (iArr30[i71] == 1 && iArr2[iArr29[i71]] > 0) {
                parsableNalUnitBitArray.m9665i();
            }
            i71++;
            immutableListBuild2 = immutableList2;
            zArr15 = zArr16;
            iM9662f4 = i80;
            i70 = 2;
        }
        ImmutableList immutableList3 = immutableListBuild2;
        boolean[][] zArr17 = zArr15;
        if (i72 == 0) {
            return new H265VpsData(null, h265ProfileTierLevelsAndIndices, null, null);
        }
        int iM9662f6 = parsableNalUnitBitArray.m9662f();
        int i81 = iM9662f6 + 1;
        ImmutableList.Builder builderBuilderWithExpectedSize = ImmutableList.builderWithExpectedSize(i81);
        int[] iArr34 = new int[i13];
        for (int i82 = 0; i82 < i81; i82 = i3 + 1) {
            int iM9661e9 = parsableNalUnitBitArray.m9661e(16);
            int iM9661e10 = parsableNalUnitBitArray.m9661e(16);
            if (parsableNalUnitBitArray.m9660d()) {
                iM9661e = parsableNalUnitBitArray.m9661e(2);
                if (iM9661e == 3) {
                    parsableNalUnitBitArray.m9665i();
                }
                iM9661e2 = parsableNalUnitBitArray.m9661e(4);
                iM9661e3 = parsableNalUnitBitArray.m9661e(4);
            } else {
                iM9661e = 0;
                iM9661e2 = 0;
                iM9661e3 = 0;
            }
            if (parsableNalUnitBitArray.m9660d()) {
                int iM9662f7 = parsableNalUnitBitArray.m9662f();
                int iM9662f8 = parsableNalUnitBitArray.m9662f();
                int iM9662f9 = parsableNalUnitBitArray.m9662f();
                int iM9662f10 = parsableNalUnitBitArray.m9662f();
                i3 = i82;
                iM9661e9 -= (iM9662f7 + iM9662f8) * ((iM9661e == 1 || iM9661e == 2) ? 2 : 1);
                iM9661e10 -= (iM9662f9 + iM9662f10) * (iM9661e == 1 ? 2 : 1);
            } else {
                i3 = i82;
            }
            builderBuilderWithExpectedSize.add(new H265RepFormat(iM9661e, iM9661e2, iM9661e3, iM9661e9, iM9661e10));
        }
        if (i81 <= 1 || !parsableNalUnitBitArray.m9660d()) {
            for (int i83 = 1; i83 < i13; i83++) {
                iArr34[i83] = Math.min(i83, iM9662f6);
            }
        } else {
            int iLog22 = DoubleMath.log2(i81, RoundingMode.CEILING);
            for (int i84 = 1; i84 < i13; i84++) {
                iArr34[i84] = parsableNalUnitBitArray.m9661e(iLog22);
            }
        }
        H265RepFormatsAndIndices h265RepFormatsAndIndices = new H265RepFormatsAndIndices(builderBuilderWithExpectedSize.build(), iArr34);
        parsableNalUnitBitArray.m9666j(2);
        for (int i85 = 1; i85 < i13; i85++) {
            if (iArr2[iArr23[i85]] == 0) {
                parsableNalUnitBitArray.m9665i();
            }
        }
        for (int i86 = 1; i86 < iM9662f5; i86++) {
            boolean zM9660d12 = parsableNalUnitBitArray.m9660d();
            int i87 = 0;
            while (i87 < iArr31[i86]) {
                if ((i87 <= 0 || !zM9660d12) ? i87 == 0 : parsableNalUnitBitArray.m9660d()) {
                    for (int i88 = 0; i88 < iArr6[i86]; i88++) {
                        if (zArr17[i86][i88]) {
                            parsableNalUnitBitArray.m9662f();
                        }
                    }
                    parsableNalUnitBitArray.m9662f();
                    parsableNalUnitBitArray.m9662f();
                }
                i87++;
            }
        }
        int iM9662f11 = parsableNalUnitBitArray.m9662f() + 2;
        if (parsableNalUnitBitArray.m9660d()) {
            parsableNalUnitBitArray.m9666j(iM9662f11);
        } else {
            for (int i89 = 1; i89 < i13; i89++) {
                for (int i90 = 0; i90 < i89; i90++) {
                    if (zArr10[i89][i90]) {
                        parsableNalUnitBitArray.m9666j(iM9662f11);
                    }
                }
            }
        }
        int iM9662f12 = parsableNalUnitBitArray.m9662f();
        for (int i91 = 1; i91 <= iM9662f12; i91++) {
            parsableNalUnitBitArray.m9666j(8);
        }
        if (parsableNalUnitBitArray.m9660d()) {
            int i92 = parsableNalUnitBitArray.f25778d;
            if (i92 > 0) {
                parsableNalUnitBitArray.m9666j(8 - i92);
            }
            if (!parsableNalUnitBitArray.m9660d() ? parsableNalUnitBitArray.m9660d() : true) {
                parsableNalUnitBitArray.m9665i();
            }
            boolean zM9660d13 = parsableNalUnitBitArray.m9660d();
            boolean zM9660d14 = parsableNalUnitBitArray.m9660d();
            if (zM9660d13 || zM9660d14) {
                for (int i93 = 0; i93 < iM9662f2; i93++) {
                    for (int i94 = 0; i94 < iArr31[i93]; i94++) {
                        boolean zM9660d15 = zM9660d13 ? parsableNalUnitBitArray.m9660d() : false;
                        boolean zM9660d16 = zM9660d14 ? parsableNalUnitBitArray.m9660d() : false;
                        if (zM9660d15) {
                            parsableNalUnitBitArray.m9666j(32);
                        }
                        if (zM9660d16) {
                            parsableNalUnitBitArray.m9666j(18);
                        }
                    }
                }
            }
            boolean zM9660d17 = parsableNalUnitBitArray.m9660d();
            int iM9661e11 = zM9660d17 ? parsableNalUnitBitArray.m9661e(4) + 1 : i13;
            ImmutableList.Builder builderBuilderWithExpectedSize2 = ImmutableList.builderWithExpectedSize(iM9661e11);
            int[] iArr35 = new int[i13];
            for (int i95 = 0; i95 < iM9661e11; i95++) {
                parsableNalUnitBitArray.m9666j(3);
                int i96 = parsableNalUnitBitArray.m9660d() ? 1 : 2;
                int iM9236f = ColorInfo.m9236f(parsableNalUnitBitArray.m9661e(8));
                int iM9237g = ColorInfo.m9237g(parsableNalUnitBitArray.m9661e(8));
                parsableNalUnitBitArray.m9666j(8);
                builderBuilderWithExpectedSize2.add(new H265VideoSignalInfo(iM9236f, i96, iM9237g));
            }
            if (zM9660d17 && iM9661e11 > 1) {
                for (int i97 = 0; i97 < i13; i97++) {
                    iArr35[i97] = parsableNalUnitBitArray.m9661e(4);
                }
            }
            h265VideoSignalInfosAndIndices = new H265VideoSignalInfosAndIndices(builderBuilderWithExpectedSize2.build(), iArr35);
        } else {
            h265VideoSignalInfosAndIndices = null;
        }
        return new H265VpsData(immutableListBuild, new H265ProfileTierLevelsAndIndices(immutableList3, iArr32), h265RepFormatsAndIndices, h265VideoSignalInfosAndIndices);
    }

    /* JADX WARN: Removed duplicated region for block: B:140:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x018e  */
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static SpsData m9652j(byte[] bArr, int i, int i2) {
        int iM9662f;
        boolean zM9660d;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int iM9662f2;
        boolean z2;
        boolean zM9660d2;
        boolean z3;
        int i8;
        boolean z4;
        int i9;
        int i10;
        int i11;
        int i12;
        float f;
        int i13;
        int i14;
        int i15;
        ParsableNalUnitBitArray parsableNalUnitBitArray = new ParsableNalUnitBitArray(bArr, i + 1, i2);
        int iM9661e = parsableNalUnitBitArray.m9661e(8);
        int iM9661e2 = parsableNalUnitBitArray.m9661e(8);
        int iM9661e3 = parsableNalUnitBitArray.m9661e(8);
        int iM9662f3 = parsableNalUnitBitArray.m9662f();
        if (iM9661e == 100 || iM9661e == 110 || iM9661e == 122 || iM9661e == 244 || iM9661e == 44 || iM9661e == 83 || iM9661e == 86 || iM9661e == 118 || iM9661e == 128 || iM9661e == 138) {
            iM9662f = parsableNalUnitBitArray.m9662f();
            zM9660d = iM9662f == 3 ? parsableNalUnitBitArray.m9660d() : false;
            int iM9662f4 = parsableNalUnitBitArray.m9662f();
            int iM9662f5 = parsableNalUnitBitArray.m9662f();
            parsableNalUnitBitArray.m9665i();
            if (parsableNalUnitBitArray.m9660d()) {
                int i16 = iM9662f != 3 ? 8 : 12;
                i3 = 16;
                int i17 = 0;
                while (i17 < i16) {
                    if (parsableNalUnitBitArray.m9660d()) {
                        int i18 = i17 < 6 ? 16 : 64;
                        int iM9663g = 8;
                        int i19 = 8;
                        for (int i20 = 0; i20 < i18; i20++) {
                            if (iM9663g != 0) {
                                iM9663g = ((parsableNalUnitBitArray.m9663g() + i19) + 256) % 256;
                            }
                            if (iM9663g != 0) {
                                i19 = iM9663g;
                            }
                        }
                    }
                    i17++;
                }
            } else {
                i3 = 16;
            }
            i4 = iM9662f4;
            i5 = iM9662f5;
        } else {
            iM9662f = 1;
            i3 = 16;
            i4 = 0;
            i5 = 0;
            zM9660d = false;
        }
        int iM9662f6 = parsableNalUnitBitArray.m9662f() + 4;
        int iM9662f7 = parsableNalUnitBitArray.m9662f();
        if (iM9662f7 == 0) {
            iM9662f2 = parsableNalUnitBitArray.m9662f() + 4;
            i6 = 1;
            i7 = iM9662f6;
        } else {
            if (iM9662f7 == 1) {
                boolean zM9660d3 = parsableNalUnitBitArray.m9660d();
                parsableNalUnitBitArray.m9663g();
                parsableNalUnitBitArray.m9663g();
                long jM9662f = parsableNalUnitBitArray.m9662f();
                i6 = 1;
                i7 = iM9662f6;
                for (int i21 = 0; i21 < jM9662f; i21++) {
                    parsableNalUnitBitArray.m9662f();
                }
                z2 = zM9660d3;
                iM9662f2 = 0;
                parsableNalUnitBitArray.m9662f();
                parsableNalUnitBitArray.m9665i();
                int iM9662f8 = parsableNalUnitBitArray.m9662f() + 1;
                int iM9662f9 = parsableNalUnitBitArray.m9662f() + 1;
                zM9660d2 = parsableNalUnitBitArray.m9660d();
                int i22 = 2 - (zM9660d2 ? 1 : 0);
                int i23 = iM9662f9 * i22;
                if (!zM9660d2) {
                    parsableNalUnitBitArray.m9665i();
                }
                parsableNalUnitBitArray.m9665i();
                int i24 = iM9662f8 * 16;
                int i25 = i23 * 16;
                if (!parsableNalUnitBitArray.m9660d()) {
                    int iM9662f10 = parsableNalUnitBitArray.m9662f();
                    int iM9662f11 = parsableNalUnitBitArray.m9662f();
                    int iM9662f12 = parsableNalUnitBitArray.m9662f();
                    int iM9662f13 = parsableNalUnitBitArray.m9662f();
                    if (iM9662f != 0) {
                        int i26 = i6;
                        if (iM9662f != 3) {
                            i6 = 2;
                        }
                        i22 *= iM9662f == i26 ? 2 : i26;
                    }
                    i24 -= (iM9662f10 + iM9662f11) * i6;
                    i25 -= (iM9662f12 + iM9662f13) * i22;
                }
                int i27 = i25;
                int i28 = i24;
                int iM9662f14 = ((iM9661e != 44 || iM9661e == 86 || iM9661e == 100 || iM9661e == 110 || iM9661e == 122 || iM9661e == 244) && (iM9661e2 & 16) != 0) ? 0 : i3;
                int i29 = -1;
                float f2 = 1.0f;
                if (parsableNalUnitBitArray.m9660d()) {
                    z3 = zM9660d2 ? 1 : 0;
                    i8 = iM9662f14;
                    z4 = zM9660d;
                    i9 = -1;
                    i10 = -1;
                    i11 = iM9662f7;
                    i12 = iM9662f2;
                    f = 1.0f;
                    i13 = -1;
                } else {
                    if (parsableNalUnitBitArray.m9660d()) {
                        int iM9661e4 = parsableNalUnitBitArray.m9661e(8);
                        if (iM9661e4 == 255) {
                            int i30 = i3;
                            int iM9661e5 = parsableNalUnitBitArray.m9661e(i30);
                            int iM9661e6 = parsableNalUnitBitArray.m9661e(i30);
                            if (iM9661e5 != 0 && iM9661e6 != 0) {
                                f2 = iM9661e5 / iM9661e6;
                            }
                        } else if (iM9661e4 < 17) {
                            f2 = f25701b[iM9661e4];
                        } else {
                            AbstractC1610a.m8738p(iM9661e4, "Unexpected aspect_ratio_idc value: ", "NalUnitUtil");
                        }
                    }
                    if (parsableNalUnitBitArray.m9660d()) {
                        parsableNalUnitBitArray.m9665i();
                    }
                    if (parsableNalUnitBitArray.m9660d()) {
                        parsableNalUnitBitArray.m9666j(3);
                        i14 = parsableNalUnitBitArray.m9660d() ? 1 : 2;
                        if (parsableNalUnitBitArray.m9660d()) {
                            int iM9661e7 = parsableNalUnitBitArray.m9661e(8);
                            int iM9661e8 = parsableNalUnitBitArray.m9661e(8);
                            parsableNalUnitBitArray.m9666j(8);
                            int iM9236f = ColorInfo.m9236f(iM9661e7);
                            int iM9237g = ColorInfo.m9237g(iM9661e8);
                            i29 = iM9236f;
                            i15 = iM9237g;
                        } else {
                            i15 = -1;
                        }
                    } else {
                        i14 = -1;
                        i15 = -1;
                    }
                    if (parsableNalUnitBitArray.m9660d()) {
                        parsableNalUnitBitArray.m9662f();
                        parsableNalUnitBitArray.m9662f();
                    }
                    if (parsableNalUnitBitArray.m9660d()) {
                        parsableNalUnitBitArray.m9666j(65);
                    }
                    boolean zM9660d4 = parsableNalUnitBitArray.m9660d();
                    if (zM9660d4) {
                        m9653k(parsableNalUnitBitArray);
                    }
                    boolean zM9660d5 = parsableNalUnitBitArray.m9660d();
                    if (zM9660d5) {
                        m9653k(parsableNalUnitBitArray);
                    }
                    if (zM9660d4 || zM9660d5) {
                        parsableNalUnitBitArray.m9665i();
                    }
                    parsableNalUnitBitArray.m9665i();
                    if (parsableNalUnitBitArray.m9660d()) {
                        parsableNalUnitBitArray.m9665i();
                        parsableNalUnitBitArray.m9662f();
                        parsableNalUnitBitArray.m9662f();
                        parsableNalUnitBitArray.m9662f();
                        parsableNalUnitBitArray.m9662f();
                        iM9662f14 = parsableNalUnitBitArray.m9662f();
                        parsableNalUnitBitArray.m9662f();
                    }
                    int i31 = i29;
                    i12 = iM9662f2;
                    f = f2;
                    i13 = i31;
                    i9 = i14;
                    i10 = i15;
                    z3 = zM9660d2 ? 1 : 0;
                    i8 = iM9662f14;
                    z4 = zM9660d;
                    i11 = iM9662f7;
                }
                return new SpsData(iM9661e, iM9661e2, iM9661e3, iM9662f3, i28, i27, f, i4, i5, z4, z3, i7, i11, i12, z2, i13, i9, i10, i8);
            }
            i6 = 1;
            i7 = iM9662f6;
            iM9662f2 = 0;
        }
        z2 = false;
        parsableNalUnitBitArray.m9662f();
        parsableNalUnitBitArray.m9665i();
        int iM9662f82 = parsableNalUnitBitArray.m9662f() + 1;
        int iM9662f92 = parsableNalUnitBitArray.m9662f() + 1;
        zM9660d2 = parsableNalUnitBitArray.m9660d();
        int i222 = 2 - (zM9660d2 ? 1 : 0);
        int i232 = iM9662f92 * i222;
        if (!zM9660d2) {
        }
        parsableNalUnitBitArray.m9665i();
        int i242 = iM9662f82 * 16;
        int i252 = i232 * 16;
        if (!parsableNalUnitBitArray.m9660d()) {
        }
        int i272 = i252;
        int i282 = i242;
        if (iM9661e != 44) {
        }
        int i292 = -1;
        float f22 = 1.0f;
        if (parsableNalUnitBitArray.m9660d()) {
        }
        return new SpsData(iM9661e, iM9661e2, iM9661e3, iM9662f3, i282, i272, f, i4, i5, z4, z3, i7, i11, i12, z2, i13, i9, i10, i8);
    }

    /* JADX INFO: renamed from: k */
    public static void m9653k(ParsableNalUnitBitArray parsableNalUnitBitArray) {
        int iM9662f = parsableNalUnitBitArray.m9662f() + 1;
        parsableNalUnitBitArray.m9666j(8);
        for (int i = 0; i < iM9662f; i++) {
            parsableNalUnitBitArray.m9662f();
            parsableNalUnitBitArray.m9662f();
            parsableNalUnitBitArray.m9665i();
        }
        parsableNalUnitBitArray.m9666j(20);
    }

    /* JADX INFO: renamed from: l */
    public static int m9654l(int i, byte[] bArr) {
        int i2;
        synchronized (f25702c) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < i) {
                while (true) {
                    if (i3 >= i - 2) {
                        i3 = i;
                        break;
                    }
                    try {
                        if (bArr[i3] == 0 && bArr[i3 + 1] == 0 && bArr[i3 + 2] == 3) {
                            break;
                        }
                        i3++;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i3 < i) {
                    int[] iArr = f25703d;
                    if (iArr.length <= i4) {
                        f25703d = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    f25703d[i4] = i3;
                    i3 += 3;
                    i4++;
                }
            }
            i2 = i - i4;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < i4; i7++) {
                int i8 = f25703d[i7] - i6;
                System.arraycopy(bArr, i6, bArr, i5, i8);
                int i9 = i5 + i8;
                int i10 = i9 + 1;
                bArr[i9] = 0;
                i5 = i9 + 2;
                bArr[i10] = 0;
                i6 += i8 + 3;
            }
            System.arraycopy(bArr, i6, bArr, i5, i2 - i5);
        }
        return i2;
    }
}
