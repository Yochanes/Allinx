package androidx.camera.video.internal.encoder;

import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class AutoValue_VideoEncoderDataSpace extends VideoEncoderDataSpace {

    /* JADX INFO: renamed from: e */
    public final int f3460e;

    /* JADX INFO: renamed from: f */
    public final int f3461f;

    /* JADX INFO: renamed from: g */
    public final int f3462g;

    public AutoValue_VideoEncoderDataSpace(int i, int i2, int i3) {
        this.f3460e = i;
        this.f3461f = i2;
        this.f3462g = i3;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderDataSpace
    /* JADX INFO: renamed from: a */
    public final int mo1904a() {
        return this.f3462g;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderDataSpace
    /* JADX INFO: renamed from: b */
    public final int mo1905b() {
        return this.f3460e;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderDataSpace
    /* JADX INFO: renamed from: c */
    public final int mo1906c() {
        return this.f3461f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VideoEncoderDataSpace)) {
            return false;
        }
        VideoEncoderDataSpace videoEncoderDataSpace = (VideoEncoderDataSpace) obj;
        return this.f3460e == videoEncoderDataSpace.mo1905b() && this.f3461f == videoEncoderDataSpace.mo1906c() && this.f3462g == videoEncoderDataSpace.mo1904a();
    }

    public final int hashCode() {
        return this.f3462g ^ ((((this.f3460e ^ 1000003) * 1000003) ^ this.f3461f) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoEncoderDataSpace{standard=");
        sb.append(this.f3460e);
        sb.append(", transfer=");
        sb.append(this.f3461f);
        sb.append(", range=");
        return AbstractC0000a.m11h(this.f3462g, "}", sb);
    }
}
