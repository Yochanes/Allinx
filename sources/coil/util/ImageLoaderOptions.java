package coil.util;

import coil.decode.ExifOrientationPolicy;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcoil/util/ImageLoaderOptions;", "", "coil-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class ImageLoaderOptions {

    /* JADX INFO: renamed from: a */
    public final boolean f34007a;

    /* JADX INFO: renamed from: b */
    public final boolean f34008b;

    /* JADX INFO: renamed from: c */
    public final boolean f34009c;

    /* JADX INFO: renamed from: d */
    public final int f34010d;

    /* JADX INFO: renamed from: e */
    public final ExifOrientationPolicy f34011e;

    public ImageLoaderOptions() {
        ExifOrientationPolicy exifOrientationPolicy = ExifOrientationPolicy.f33481a;
        this.f34007a = true;
        this.f34008b = true;
        this.f34009c = true;
        this.f34010d = 4;
        this.f34011e = exifOrientationPolicy;
    }
}
