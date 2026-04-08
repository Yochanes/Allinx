package coil.transform;

import coil.annotation.ExperimentalCoilApi;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Lcoil/transform/PixelOpacity;", "", "coil-gif_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@ExperimentalCoilApi
public final class PixelOpacity {

    /* JADX INFO: renamed from: a */
    public static final PixelOpacity f33968a;

    /* JADX INFO: renamed from: b */
    public static final PixelOpacity f33969b;

    /* JADX INFO: renamed from: c */
    public static final PixelOpacity f33970c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ PixelOpacity[] f33971d;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ EnumEntries f33972f;

    static {
        PixelOpacity pixelOpacity = new PixelOpacity("UNCHANGED", 0);
        f33968a = pixelOpacity;
        PixelOpacity pixelOpacity2 = new PixelOpacity("TRANSLUCENT", 1);
        f33969b = pixelOpacity2;
        PixelOpacity pixelOpacity3 = new PixelOpacity("OPAQUE", 2);
        f33970c = pixelOpacity3;
        PixelOpacity[] pixelOpacityArr = {pixelOpacity, pixelOpacity2, pixelOpacity3};
        f33971d = pixelOpacityArr;
        f33972f = EnumEntriesKt.m18563a(pixelOpacityArr);
    }

    public static PixelOpacity valueOf(String str) {
        return (PixelOpacity) Enum.valueOf(PixelOpacity.class, str);
    }

    public static PixelOpacity[] values() {
        return (PixelOpacity[]) f33971d.clone();
    }
}
