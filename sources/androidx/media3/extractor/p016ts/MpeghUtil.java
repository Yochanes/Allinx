package androidx.media3.extractor.p016ts;

import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableBitArray;
import com.google.common.math.IntMath;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class MpeghUtil {

    /* JADX INFO: compiled from: Proguard */
    public static class MhasPacketHeader {

        /* JADX INFO: renamed from: a */
        public int f29651a;

        /* JADX INFO: renamed from: b */
        public long f29652b;

        /* JADX INFO: renamed from: c */
        public int f29653c;

        /* JADX INFO: compiled from: Proguard */
        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface Type {
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class Mpegh3daConfig {
    }

    /* JADX INFO: renamed from: a */
    public static int m11061a(ParsableBitArray parsableBitArray, int i, int i2, int i3) {
        Assertions.m9460a(Math.max(Math.max(i, i2), i3) <= 31);
        int i4 = (1 << i) - 1;
        int i5 = (1 << i2) - 1;
        IntMath.checkedAdd(IntMath.checkedAdd(i4, i5), 1 << i3);
        if (parsableBitArray.m9525b() < i) {
            return -1;
        }
        int iM9530g = parsableBitArray.m9530g(i);
        if (iM9530g == i4) {
            if (parsableBitArray.m9525b() < i2) {
                return -1;
            }
            int iM9530g2 = parsableBitArray.m9530g(i2);
            iM9530g += iM9530g2;
            if (iM9530g2 == i5) {
                if (parsableBitArray.m9525b() < i3) {
                    return -1;
                }
                return parsableBitArray.m9530g(i3) + iM9530g;
            }
        }
        return iM9530g;
    }

    /* JADX INFO: renamed from: b */
    public static void m11062b(ParsableBitArray parsableBitArray) {
        parsableBitArray.m9538o(3);
        parsableBitArray.m9538o(8);
        boolean zM9529f = parsableBitArray.m9529f();
        boolean zM9529f2 = parsableBitArray.m9529f();
        if (zM9529f) {
            parsableBitArray.m9538o(5);
        }
        if (zM9529f2) {
            parsableBitArray.m9538o(6);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m11063c(ParsableBitArray parsableBitArray) {
        int iM9530g;
        int iM9530g2 = parsableBitArray.m9530g(2);
        if (iM9530g2 == 0) {
            parsableBitArray.m9538o(6);
            return;
        }
        int iM11061a = m11061a(parsableBitArray, 5, 8, 16) + 1;
        if (iM9530g2 == 1) {
            parsableBitArray.m9538o(iM11061a * 7);
            return;
        }
        if (iM9530g2 == 2) {
            boolean zM9529f = parsableBitArray.m9529f();
            int i = zM9529f ? 1 : 5;
            int i2 = zM9529f ? 7 : 5;
            int i3 = zM9529f ? 8 : 6;
            int i4 = 0;
            while (i4 < iM11061a) {
                if (parsableBitArray.m9529f()) {
                    parsableBitArray.m9538o(7);
                    iM9530g = 0;
                } else {
                    if (parsableBitArray.m9530g(2) == 3 && parsableBitArray.m9530g(i2) * i != 0) {
                        parsableBitArray.m9537n();
                    }
                    iM9530g = parsableBitArray.m9530g(i3) * i;
                    if (iM9530g != 0 && iM9530g != 180) {
                        parsableBitArray.m9537n();
                    }
                    parsableBitArray.m9537n();
                }
                if (iM9530g != 0 && iM9530g != 180 && parsableBitArray.m9529f()) {
                    i4++;
                }
                i4++;
            }
        }
    }
}
