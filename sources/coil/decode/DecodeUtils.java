package coil.decode;

import coil.size.Scale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcoil/decode/DecodeUtils;", "", "coil-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class DecodeUtils {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[Scale.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Scale scale = Scale.f33951a;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static final double m12416a(int i, int i2, int i3, int i4, Scale scale) {
        double d = ((double) i3) / ((double) i);
        double d2 = ((double) i4) / ((double) i2);
        int iOrdinal = scale.ordinal();
        if (iOrdinal == 0) {
            return Math.max(d, d2);
        }
        if (iOrdinal == 1) {
            return Math.min(d, d2);
        }
        throw new NoWhenBranchMatchedException();
    }
}
