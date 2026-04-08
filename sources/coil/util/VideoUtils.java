package coil.util;

import coil.size.Dimension;
import coil.size.Scale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: coil.util.-VideoUtils, reason: invalid class name */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"coil-video_release"}, m18303k = 2, m18304mv = {2, 0, 0}, m18306xi = 48)
@JvmName
@SourceDebugExtension
public final class VideoUtils {

    /* JADX INFO: renamed from: coil.util.-VideoUtils$WhenMappings */
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
    public static final int m12538a(Dimension dimension, Scale scale) {
        if (dimension instanceof Dimension.Pixels) {
            return ((Dimension.Pixels) dimension).f33941a;
        }
        int iOrdinal = scale.ordinal();
        if (iOrdinal == 0) {
            return Integer.MIN_VALUE;
        }
        if (iOrdinal == 1) {
            return Integer.MAX_VALUE;
        }
        throw new NoWhenBranchMatchedException();
    }
}
