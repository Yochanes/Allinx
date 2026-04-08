package coil.decode;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"coil-base_release"}, m18303k = 2, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class ExifUtilsKt {

    /* JADX INFO: renamed from: a */
    public static final Set f33485a = ArraysKt.m18372h0(new String[]{"image/jpeg", "image/webp", "image/heic", "image/heif"});

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[ExifOrientationPolicy.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ExifOrientationPolicy exifOrientationPolicy = ExifOrientationPolicy.f33481a;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ExifOrientationPolicy exifOrientationPolicy2 = ExifOrientationPolicy.f33481a;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }
}
