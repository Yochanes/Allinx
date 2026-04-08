package coil.util;

import coil.size.Dimension;
import coil.size.Scale;
import coil.transform.PixelOpacity;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: coil.util.-GifUtils, reason: invalid class name */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"coil-gif_release"}, m18303k = 2, m18304mv = {2, 0, 0}, m18306xi = 48)
@JvmName
@SourceDebugExtension
public final class GifUtils {

    /* JADX INFO: renamed from: coil.util.-GifUtils$WhenMappings */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[PixelOpacity.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                PixelOpacity pixelOpacity = PixelOpacity.f33968a;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                PixelOpacity pixelOpacity2 = PixelOpacity.f33968a;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[Scale.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                Scale scale = Scale.f33951a;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static final int m12528a(Dimension dimension, Scale scale) {
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
