package androidx.media3.extractor;

import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.UnstableApi;
import com.google.android.material.internal.ViewUtils;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Arrays;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class DtsUtil {

    /* JADX INFO: renamed from: a */
    public static final int[] f28197a = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* JADX INFO: renamed from: b */
    public static final int[] f28198b = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* JADX INFO: renamed from: c */
    public static final int[] f28199c = {64, 112, UserMetadata.MAX_ROLLOUT_ASSIGNMENTS, 192, 224, 256, 384, 448, 512, 640, ViewUtils.EDGE_TO_EDGE_FLAGS, 896, UserMetadata.MAX_ATTRIBUTE_SIZE, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    /* JADX INFO: renamed from: d */
    public static final int[] f28200d = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};

    /* JADX INFO: renamed from: e */
    public static final int[] f28201e = {5, 8, 10, 12};

    /* JADX INFO: renamed from: f */
    public static final int[] f28202f = {6, 9, 12, 15};

    /* JADX INFO: renamed from: g */
    public static final int[] f28203g = {2, 4, 6, 8};

    /* JADX INFO: renamed from: h */
    public static final int[] f28204h = {9, 11, 13, 16};

    /* JADX INFO: renamed from: i */
    public static final int[] f28205i = {5, 8, 10, 12};

    /* JADX INFO: compiled from: Proguard */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface DtsAudioMimeType {
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class DtsHeader {

        /* JADX INFO: renamed from: a */
        public final String f28206a;

        /* JADX INFO: renamed from: b */
        public final int f28207b;

        /* JADX INFO: renamed from: c */
        public final int f28208c;

        public DtsHeader(int i, int i2, int i3, String str, long j) {
            this.f28206a = str;
            this.f28208c = i;
            this.f28207b = i2;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface FrameType {
    }

    /* JADX INFO: renamed from: a */
    public static ParsableBitArray m10797a(byte[] bArr) {
        byte b2 = bArr[0];
        if (b2 == 127 || b2 == 100 || b2 == 64 || b2 == 113) {
            return new ParsableBitArray(bArr, bArr.length);
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        byte b3 = bArrCopyOf[0];
        if (b3 == -2 || b3 == -1 || b3 == 37 || b3 == -14 || b3 == -24) {
            for (int i = 0; i < bArrCopyOf.length - 1; i += 2) {
                byte b4 = bArrCopyOf[i];
                int i2 = i + 1;
                bArrCopyOf[i] = bArrCopyOf[i2];
                bArrCopyOf[i2] = b4;
            }
        }
        ParsableBitArray parsableBitArray = new ParsableBitArray(bArrCopyOf, bArrCopyOf.length);
        if (bArrCopyOf[0] == 31) {
            ParsableBitArray parsableBitArray2 = new ParsableBitArray(bArrCopyOf, bArrCopyOf.length);
            while (parsableBitArray2.m9525b() >= 16) {
                parsableBitArray2.m9538o(2);
                int iM9530g = parsableBitArray2.m9530g(14) & 16383;
                int iMin = Math.min(8 - parsableBitArray.f25639c, 14);
                int i3 = parsableBitArray.f25639c;
                int i4 = (8 - i3) - iMin;
                byte[] bArr2 = parsableBitArray.f25637a;
                int i5 = parsableBitArray.f25638b;
                byte b5 = (byte) (((65280 >> i3) | ((1 << i4) - 1)) & bArr2[i5]);
                bArr2[i5] = b5;
                int i6 = 14 - iMin;
                bArr2[i5] = (byte) (b5 | ((iM9530g >>> i6) << i4));
                int i7 = i5 + 1;
                while (i6 > 8) {
                    parsableBitArray.f25637a[i7] = (byte) (iM9530g >>> (i6 - 8));
                    i6 -= 8;
                    i7++;
                }
                int i8 = 8 - i6;
                byte[] bArr3 = parsableBitArray.f25637a;
                byte b6 = (byte) (bArr3[i7] & ((1 << i8) - 1));
                bArr3[i7] = b6;
                bArr3[i7] = (byte) (((iM9530g & ((1 << i6) - 1)) << i8) | b6);
                parsableBitArray.m9538o(14);
                parsableBitArray.m9524a();
            }
        }
        parsableBitArray.m9534k(bArrCopyOf.length, bArrCopyOf);
        return parsableBitArray;
    }

    /* JADX INFO: renamed from: b */
    public static int m10798b(ParsableBitArray parsableBitArray, int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 3 && parsableBitArray.m9529f(); i2++) {
            i++;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            i3 += 1 << iArr[i4];
        }
        return parsableBitArray.m9530g(iArr[i]) + i3;
    }
}
