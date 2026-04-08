package androidx.media3.common;

import androidx.media3.common.util.Util;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final class VideoSize {

    /* JADX INFO: renamed from: d */
    public static final VideoSize f25425d = new VideoSize(0, 0, 1.0f);

    /* JADX INFO: renamed from: a */
    public final int f25426a;

    /* JADX INFO: renamed from: b */
    public final int f25427b;

    /* JADX INFO: renamed from: c */
    public final float f25428c;

    static {
        Util.m9594D(0);
        Util.m9594D(1);
        Util.m9594D(3);
    }

    public VideoSize(int i, int i2, float f) {
        this.f25426a = i;
        this.f25427b = i2;
        this.f25428c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof VideoSize) {
            VideoSize videoSize = (VideoSize) obj;
            if (this.f25426a == videoSize.f25426a && this.f25427b == videoSize.f25427b && this.f25428c == videoSize.f25428c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f25428c) + ((((217 + this.f25426a) * 31) + this.f25427b) * 31);
    }
}
