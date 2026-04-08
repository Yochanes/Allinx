package androidx.camera.video.internal.encoder;

import android.util.Size;
import androidx.camera.core.impl.Timebase;
import androidx.camera.video.internal.encoder.VideoEncoderConfig;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class AutoValue_VideoEncoderConfig extends VideoEncoderConfig {

    /* JADX INFO: renamed from: a */
    public final String f3442a;

    /* JADX INFO: renamed from: b */
    public final int f3443b;

    /* JADX INFO: renamed from: c */
    public final Timebase f3444c;

    /* JADX INFO: renamed from: d */
    public final Size f3445d;

    /* JADX INFO: renamed from: e */
    public final int f3446e;

    /* JADX INFO: renamed from: f */
    public final VideoEncoderDataSpace f3447f;

    /* JADX INFO: renamed from: g */
    public final int f3448g;

    /* JADX INFO: renamed from: h */
    public final int f3449h;

    /* JADX INFO: renamed from: i */
    public final int f3450i;

    /* JADX INFO: compiled from: Proguard */
    public static final class Builder extends VideoEncoderConfig.Builder {

        /* JADX INFO: renamed from: a */
        public String f3451a;

        /* JADX INFO: renamed from: b */
        public Integer f3452b;

        /* JADX INFO: renamed from: c */
        public Timebase f3453c;

        /* JADX INFO: renamed from: d */
        public Size f3454d;

        /* JADX INFO: renamed from: e */
        public Integer f3455e;

        /* JADX INFO: renamed from: f */
        public VideoEncoderDataSpace f3456f;

        /* JADX INFO: renamed from: g */
        public Integer f3457g;

        /* JADX INFO: renamed from: h */
        public Integer f3458h;

        /* JADX INFO: renamed from: i */
        public Integer f3459i;

        @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig.Builder
        /* JADX INFO: renamed from: a */
        public final VideoEncoderConfig mo1896a() {
            String strM2C = this.f3451a == null ? " mimeType" : "";
            if (this.f3452b == null) {
                strM2C = strM2C.concat(" profile");
            }
            if (this.f3453c == null) {
                strM2C = AbstractC0000a.m2C(strM2C, " inputTimebase");
            }
            if (this.f3454d == null) {
                strM2C = AbstractC0000a.m2C(strM2C, " resolution");
            }
            if (this.f3455e == null) {
                strM2C = AbstractC0000a.m2C(strM2C, " colorFormat");
            }
            if (this.f3456f == null) {
                strM2C = AbstractC0000a.m2C(strM2C, " dataSpace");
            }
            if (this.f3457g == null) {
                strM2C = AbstractC0000a.m2C(strM2C, " frameRate");
            }
            if (this.f3458h == null) {
                strM2C = AbstractC0000a.m2C(strM2C, " IFrameInterval");
            }
            if (this.f3459i == null) {
                strM2C = AbstractC0000a.m2C(strM2C, " bitrate");
            }
            if (strM2C.isEmpty()) {
                return new AutoValue_VideoEncoderConfig(this.f3451a, this.f3452b.intValue(), this.f3453c, this.f3454d, this.f3455e.intValue(), this.f3456f, this.f3457g.intValue(), this.f3458h.intValue(), this.f3459i.intValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(strM2C));
        }

        @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig.Builder
        /* JADX INFO: renamed from: b */
        public final VideoEncoderConfig.Builder mo1897b(int i) {
            this.f3459i = Integer.valueOf(i);
            return this;
        }

        @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig.Builder
        /* JADX INFO: renamed from: c */
        public final VideoEncoderConfig.Builder mo1898c(VideoEncoderDataSpace videoEncoderDataSpace) {
            this.f3456f = videoEncoderDataSpace;
            return this;
        }

        @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig.Builder
        /* JADX INFO: renamed from: d */
        public final VideoEncoderConfig.Builder mo1899d(int i) {
            this.f3457g = Integer.valueOf(i);
            return this;
        }

        @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig.Builder
        /* JADX INFO: renamed from: e */
        public final VideoEncoderConfig.Builder mo1900e() {
            this.f3453c = Timebase.f2800a;
            return this;
        }

        @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig.Builder
        /* JADX INFO: renamed from: f */
        public final VideoEncoderConfig.Builder mo1901f(String str) {
            if (str == null) {
                throw new NullPointerException("Null mimeType");
            }
            this.f3451a = str;
            return this;
        }

        @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig.Builder
        /* JADX INFO: renamed from: g */
        public final VideoEncoderConfig.Builder mo1902g(int i) {
            this.f3452b = Integer.valueOf(i);
            return this;
        }

        @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig.Builder
        /* JADX INFO: renamed from: h */
        public final VideoEncoderConfig.Builder mo1903h(Size size) {
            if (size == null) {
                throw new NullPointerException("Null resolution");
            }
            this.f3454d = size;
            return this;
        }
    }

    public AutoValue_VideoEncoderConfig(String str, int i, Timebase timebase, Size size, int i2, VideoEncoderDataSpace videoEncoderDataSpace, int i3, int i4, int i5) {
        this.f3442a = str;
        this.f3443b = i;
        this.f3444c = timebase;
        this.f3445d = size;
        this.f3446e = i2;
        this.f3447f = videoEncoderDataSpace;
        this.f3448g = i3;
        this.f3449h = i4;
        this.f3450i = i5;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig
    /* JADX INFO: renamed from: b */
    public final int mo1889b() {
        return this.f3450i;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig
    /* JADX INFO: renamed from: c */
    public final int mo1890c() {
        return this.f3446e;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig
    /* JADX INFO: renamed from: d */
    public final VideoEncoderDataSpace mo1891d() {
        return this.f3447f;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig
    /* JADX INFO: renamed from: e */
    public final int mo1892e() {
        return this.f3448g;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VideoEncoderConfig)) {
            return false;
        }
        VideoEncoderConfig videoEncoderConfig = (VideoEncoderConfig) obj;
        if (this.f3442a.equals(((AutoValue_VideoEncoderConfig) videoEncoderConfig).f3442a)) {
            return this.f3443b == videoEncoderConfig.mo1894g() && this.f3444c.equals(((AutoValue_VideoEncoderConfig) videoEncoderConfig).f3444c) && this.f3445d.equals(videoEncoderConfig.mo1895h()) && this.f3446e == videoEncoderConfig.mo1890c() && this.f3447f.equals(videoEncoderConfig.mo1891d()) && this.f3448g == videoEncoderConfig.mo1892e() && this.f3449h == videoEncoderConfig.mo1893f() && this.f3450i == videoEncoderConfig.mo1889b();
        }
        return false;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig
    /* JADX INFO: renamed from: f */
    public final int mo1893f() {
        return this.f3449h;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig
    /* JADX INFO: renamed from: g */
    public final int mo1894g() {
        return this.f3443b;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderConfig
    /* JADX INFO: renamed from: h */
    public final Size mo1895h() {
        return this.f3445d;
    }

    public final int hashCode() {
        return ((((((((((((((((this.f3442a.hashCode() ^ 1000003) * 1000003) ^ this.f3443b) * 1000003) ^ this.f3444c.hashCode()) * 1000003) ^ this.f3445d.hashCode()) * 1000003) ^ this.f3446e) * 1000003) ^ this.f3447f.hashCode()) * 1000003) ^ this.f3448g) * 1000003) ^ this.f3449h) * 1000003) ^ this.f3450i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoEncoderConfig{mimeType=");
        sb.append(this.f3442a);
        sb.append(", profile=");
        sb.append(this.f3443b);
        sb.append(", inputTimebase=");
        sb.append(this.f3444c);
        sb.append(", resolution=");
        sb.append(this.f3445d);
        sb.append(", colorFormat=");
        sb.append(this.f3446e);
        sb.append(", dataSpace=");
        sb.append(this.f3447f);
        sb.append(", frameRate=");
        sb.append(this.f3448g);
        sb.append(", IFrameInterval=");
        sb.append(this.f3449h);
        sb.append(", bitrate=");
        return AbstractC0000a.m11h(this.f3450i, "}", sb);
    }
}
