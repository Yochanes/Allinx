package androidx.core.util;

import androidx.annotation.RestrictTo;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo
public final class TimeUtils {

    /* JADX INFO: renamed from: a */
    public static final Object f23343a = new Object();

    /* JADX INFO: renamed from: b */
    public static char[] f23344b = new char[24];

    /* JADX INFO: renamed from: a */
    public static int m7703a(long j) {
        char c2;
        int i;
        int i2;
        int i3;
        if (f23344b.length < 0) {
            f23344b = new char[0];
        }
        char[] cArr = f23344b;
        if (j == 0) {
            cArr[0] = '0';
            return 1;
        }
        if (j > 0) {
            c2 = '+';
        } else {
            j = -j;
            c2 = '-';
        }
        int i4 = (int) (j % 1000);
        int iFloor = (int) Math.floor(j / 1000);
        if (iFloor > 86400) {
            i = iFloor / 86400;
            iFloor -= 86400 * i;
        } else {
            i = 0;
        }
        if (iFloor > 3600) {
            i2 = iFloor / 3600;
            iFloor -= i2 * 3600;
        } else {
            i2 = 0;
        }
        if (iFloor > 60) {
            int i5 = iFloor / 60;
            iFloor -= i5 * 60;
            i3 = i5;
        } else {
            i3 = 0;
        }
        cArr[0] = c2;
        int iM7704b = m7704b(cArr, i, 'd', 1, false, 0);
        int iM7704b2 = m7704b(cArr, i2, 'h', iM7704b, iM7704b != 1, 0);
        int iM7704b3 = m7704b(cArr, i3, 'm', iM7704b2, iM7704b2 != 1, 0);
        int iM7704b4 = m7704b(cArr, i4, 'm', m7704b(cArr, iFloor, 's', iM7704b3, iM7704b3 != 1, 0), true, 0);
        cArr[iM7704b4] = 's';
        return iM7704b4 + 1;
    }

    /* JADX INFO: renamed from: b */
    public static int m7704b(char[] cArr, int i, char c2, int i2, boolean z2, int i3) {
        int i4;
        if (!z2 && i <= 0) {
            return i2;
        }
        if ((!z2 || i3 < 3) && i <= 99) {
            i4 = i2;
        } else {
            int i5 = i / 100;
            cArr[i2] = (char) (i5 + 48);
            i4 = i2 + 1;
            i -= i5 * 100;
        }
        if ((z2 && i3 >= 2) || i > 9 || i2 != i4) {
            int i6 = i / 10;
            cArr[i4] = (char) (i6 + 48);
            i4++;
            i -= i6 * 10;
        }
        cArr[i4] = (char) (i + 48);
        cArr[i4 + 1] = c2;
        return i4 + 2;
    }
}
