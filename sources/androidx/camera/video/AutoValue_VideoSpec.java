package androidx.camera.video;

import android.util.Range;
import androidx.camera.video.VideoSpec;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class AutoValue_VideoSpec extends VideoSpec {

    /* JADX INFO: renamed from: d */
    public final QualitySelector f3293d;

    /* JADX INFO: renamed from: e */
    public final Range f3294e;

    /* JADX INFO: renamed from: f */
    public final Range f3295f;

    /* JADX INFO: renamed from: g */
    public final int f3296g;

    /* JADX INFO: compiled from: Proguard */
    public static final class Builder extends VideoSpec.Builder {

        /* JADX INFO: renamed from: a */
        public QualitySelector f3297a;

        /* JADX INFO: renamed from: b */
        public Range f3298b;

        /* JADX INFO: renamed from: c */
        public Range f3299c;

        /* JADX INFO: renamed from: d */
        public Integer f3300d;

        @Override // androidx.camera.video.VideoSpec.Builder
        /* JADX INFO: renamed from: a */
        public final VideoSpec mo1821a() {
            String strM2C = this.f3297a == null ? " qualitySelector" : "";
            if (this.f3298b == null) {
                strM2C = strM2C.concat(" frameRate");
            }
            if (this.f3299c == null) {
                strM2C = AbstractC0000a.m2C(strM2C, " bitrate");
            }
            if (this.f3300d == null) {
                strM2C = AbstractC0000a.m2C(strM2C, " aspectRatio");
            }
            if (strM2C.isEmpty()) {
                return new AutoValue_VideoSpec(this.f3297a, this.f3298b, this.f3299c, this.f3300d.intValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(strM2C));
        }
    }

    public AutoValue_VideoSpec(QualitySelector qualitySelector, Range range, Range range2, int i) {
        this.f3293d = qualitySelector;
        this.f3294e = range;
        this.f3295f = range2;
        this.f3296g = i;
    }

    @Override // androidx.camera.video.VideoSpec
    /* JADX INFO: renamed from: b */
    public final int mo1817b() {
        return this.f3296g;
    }

    @Override // androidx.camera.video.VideoSpec
    /* JADX INFO: renamed from: c */
    public final Range mo1818c() {
        return this.f3295f;
    }

    @Override // androidx.camera.video.VideoSpec
    /* JADX INFO: renamed from: d */
    public final Range mo1819d() {
        return this.f3294e;
    }

    @Override // androidx.camera.video.VideoSpec
    /* JADX INFO: renamed from: e */
    public final QualitySelector mo1820e() {
        return this.f3293d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VideoSpec)) {
            return false;
        }
        VideoSpec videoSpec = (VideoSpec) obj;
        return this.f3293d.equals(videoSpec.mo1820e()) && this.f3294e.equals(videoSpec.mo1819d()) && this.f3295f.equals(videoSpec.mo1818c()) && this.f3296g == videoSpec.mo1817b();
    }

    public final int hashCode() {
        return ((((((this.f3293d.hashCode() ^ 1000003) * 1000003) ^ this.f3294e.hashCode()) * 1000003) ^ this.f3295f.hashCode()) * 1000003) ^ this.f3296g;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoSpec{qualitySelector=");
        sb.append(this.f3293d);
        sb.append(", frameRate=");
        sb.append(this.f3294e);
        sb.append(", bitrate=");
        sb.append(this.f3295f);
        sb.append(", aspectRatio=");
        return AbstractC0000a.m11h(this.f3296g, "}", sb);
    }
}
