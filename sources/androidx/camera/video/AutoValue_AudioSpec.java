package androidx.camera.video;

import android.util.Range;
import androidx.camera.video.AudioSpec;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class AutoValue_AudioSpec extends AudioSpec {

    /* JADX INFO: renamed from: c */
    public final Range f3274c;

    /* JADX INFO: renamed from: d */
    public final int f3275d;

    /* JADX INFO: renamed from: e */
    public final int f3276e;

    /* JADX INFO: renamed from: f */
    public final Range f3277f;

    /* JADX INFO: renamed from: g */
    public final int f3278g;

    /* JADX INFO: compiled from: Proguard */
    public static final class Builder extends AudioSpec.Builder {

        /* JADX INFO: renamed from: a */
        public Range f3279a;

        /* JADX INFO: renamed from: b */
        public Integer f3280b;

        /* JADX INFO: renamed from: c */
        public Integer f3281c;

        /* JADX INFO: renamed from: d */
        public Range f3282d;

        /* JADX INFO: renamed from: e */
        public Integer f3283e;

        @Override // androidx.camera.video.AudioSpec.Builder
        /* JADX INFO: renamed from: a */
        public final AudioSpec mo1798a() {
            String strM2C = this.f3279a == null ? " bitrate" : "";
            if (this.f3280b == null) {
                strM2C = strM2C.concat(" sourceFormat");
            }
            if (this.f3281c == null) {
                strM2C = AbstractC0000a.m2C(strM2C, " source");
            }
            if (this.f3282d == null) {
                strM2C = AbstractC0000a.m2C(strM2C, " sampleRate");
            }
            if (this.f3283e == null) {
                strM2C = AbstractC0000a.m2C(strM2C, " channelCount");
            }
            if (strM2C.isEmpty()) {
                return new AutoValue_AudioSpec(this.f3279a, this.f3280b.intValue(), this.f3281c.intValue(), this.f3282d, this.f3283e.intValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(strM2C));
        }
    }

    public AutoValue_AudioSpec(Range range, int i, int i2, Range range2, int i3) {
        this.f3274c = range;
        this.f3275d = i;
        this.f3276e = i2;
        this.f3277f = range2;
        this.f3278g = i3;
    }

    @Override // androidx.camera.video.AudioSpec
    /* JADX INFO: renamed from: b */
    public final Range mo1793b() {
        return this.f3274c;
    }

    @Override // androidx.camera.video.AudioSpec
    /* JADX INFO: renamed from: c */
    public final int mo1794c() {
        return this.f3278g;
    }

    @Override // androidx.camera.video.AudioSpec
    /* JADX INFO: renamed from: d */
    public final Range mo1795d() {
        return this.f3277f;
    }

    @Override // androidx.camera.video.AudioSpec
    /* JADX INFO: renamed from: e */
    public final int mo1796e() {
        return this.f3276e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AudioSpec)) {
            return false;
        }
        AudioSpec audioSpec = (AudioSpec) obj;
        return this.f3274c.equals(audioSpec.mo1793b()) && this.f3275d == audioSpec.mo1797f() && this.f3276e == audioSpec.mo1796e() && this.f3277f.equals(audioSpec.mo1795d()) && this.f3278g == audioSpec.mo1794c();
    }

    @Override // androidx.camera.video.AudioSpec
    /* JADX INFO: renamed from: f */
    public final int mo1797f() {
        return this.f3275d;
    }

    public final int hashCode() {
        return ((((((((this.f3274c.hashCode() ^ 1000003) * 1000003) ^ this.f3275d) * 1000003) ^ this.f3276e) * 1000003) ^ this.f3277f.hashCode()) * 1000003) ^ this.f3278g;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioSpec{bitrate=");
        sb.append(this.f3274c);
        sb.append(", sourceFormat=");
        sb.append(this.f3275d);
        sb.append(", source=");
        sb.append(this.f3276e);
        sb.append(", sampleRate=");
        sb.append(this.f3277f);
        sb.append(", channelCount=");
        return AbstractC0000a.m11h(this.f3278g, "}", sb);
    }
}
