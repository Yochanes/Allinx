package androidx.compose.foundation.shape;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"foundation_release"}, m18303k = 2, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class RoundedCornerShapeKt {

    /* JADX INFO: renamed from: a */
    public static final RoundedCornerShape f7987a = m3191a(50);

    /* JADX INFO: renamed from: a */
    public static final RoundedCornerShape m3191a(int i) {
        CornerSize cornerSizeM3189a = CornerSizeKt.m3189a(i);
        return new RoundedCornerShape(cornerSizeM3189a, cornerSizeM3189a, cornerSizeM3189a, cornerSizeM3189a);
    }

    /* JADX INFO: renamed from: b */
    public static final RoundedCornerShape m3192b(float f) {
        DpCornerSize dpCornerSize = new DpCornerSize(f);
        return new RoundedCornerShape(dpCornerSize, dpCornerSize, dpCornerSize, dpCornerSize);
    }

    /* JADX INFO: renamed from: c */
    public static final RoundedCornerShape m3193c(float f, float f2, float f3, float f4) {
        return new RoundedCornerShape(new DpCornerSize(f), new DpCornerSize(f2), new DpCornerSize(f3), new DpCornerSize(f4));
    }

    /* JADX INFO: renamed from: d */
    public static RoundedCornerShape m3194d(float f, float f2, float f3, float f4, int i) {
        if ((i & 1) != 0) {
            f = 0;
        }
        if ((i & 2) != 0) {
            f2 = 0;
        }
        if ((i & 4) != 0) {
            f3 = 0;
        }
        if ((i & 8) != 0) {
            f4 = 0;
        }
        return m3193c(f, f2, f3, f4);
    }
}
