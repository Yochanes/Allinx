package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"kotlinx/coroutines/internal/SystemPropsKt__SystemPropsKt", "kotlinx/coroutines/internal/SystemPropsKt__SystemProps_commonKt"}, m18303k = 4, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class SystemPropsKt {
    /* JADX INFO: renamed from: a */
    public static final int m20853a() {
        return SystemPropsKt__SystemPropsKt.f56358a;
    }

    /* JADX INFO: renamed from: b */
    public static final long m20854b(long j, long j2, long j3, String str) {
        String strM20855c = m20855c(str);
        if (strM20855c == null) {
            return j;
        }
        Long lM20429a0 = StringsKt.m20429a0(strM20855c);
        if (lM20429a0 == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + strM20855c + '\'').toString());
        }
        long jLongValue = lM20429a0.longValue();
        if (j2 <= jLongValue && jLongValue <= j3) {
            return jLongValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j2 + ".." + j3 + ", but is '" + jLongValue + '\'').toString());
    }

    /* JADX INFO: renamed from: c */
    public static final String m20855c(String str) {
        int i = SystemPropsKt__SystemPropsKt.f56358a;
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static int m20856d(int i, int i2, String str) {
        return (int) m20854b(i, 1, (i2 & 8) != 0 ? Integer.MAX_VALUE : 2097150, str);
    }
}
