package androidx.camera.video.internal;

import androidx.camera.core.impl.EncoderProfilesProxy;
import java.util.List;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class AutoValue_VideoValidatedEncoderProfilesProxy extends VideoValidatedEncoderProfilesProxy {

    /* JADX INFO: renamed from: a */
    public final int f3391a;

    /* JADX INFO: renamed from: b */
    public final int f3392b;

    /* JADX INFO: renamed from: c */
    public final List f3393c;

    /* JADX INFO: renamed from: d */
    public final List f3394d;

    /* JADX INFO: renamed from: e */
    public final EncoderProfilesProxy.AudioProfileProxy f3395e;

    /* JADX INFO: renamed from: f */
    public final EncoderProfilesProxy.VideoProfileProxy f3396f;

    public AutoValue_VideoValidatedEncoderProfilesProxy(int i, int i2, List list, List list2, EncoderProfilesProxy.AudioProfileProxy audioProfileProxy, EncoderProfilesProxy.VideoProfileProxy videoProfileProxy) {
        this.f3391a = i;
        this.f3392b = i2;
        if (list == null) {
            throw new NullPointerException("Null audioProfiles");
        }
        this.f3393c = list;
        if (list2 == null) {
            throw new NullPointerException("Null videoProfiles");
        }
        this.f3394d = list2;
        this.f3395e = audioProfileProxy;
        if (videoProfileProxy == null) {
            throw new NullPointerException("Null defaultVideoProfile");
        }
        this.f3396f = videoProfileProxy;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy
    /* JADX INFO: renamed from: a */
    public final int mo1393a() {
        return this.f3391a;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy
    /* JADX INFO: renamed from: b */
    public final int mo1394b() {
        return this.f3392b;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy
    /* JADX INFO: renamed from: c */
    public final List mo1395c() {
        return this.f3393c;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy
    /* JADX INFO: renamed from: d */
    public final List mo1396d() {
        return this.f3394d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VideoValidatedEncoderProfilesProxy)) {
            return false;
        }
        VideoValidatedEncoderProfilesProxy videoValidatedEncoderProfilesProxy = (VideoValidatedEncoderProfilesProxy) obj;
        AutoValue_VideoValidatedEncoderProfilesProxy autoValue_VideoValidatedEncoderProfilesProxy = (AutoValue_VideoValidatedEncoderProfilesProxy) videoValidatedEncoderProfilesProxy;
        if (this.f3391a != autoValue_VideoValidatedEncoderProfilesProxy.f3391a) {
            return false;
        }
        if (this.f3392b != autoValue_VideoValidatedEncoderProfilesProxy.f3392b || !this.f3393c.equals(autoValue_VideoValidatedEncoderProfilesProxy.f3393c) || !this.f3394d.equals(autoValue_VideoValidatedEncoderProfilesProxy.f3394d)) {
            return false;
        }
        EncoderProfilesProxy.AudioProfileProxy audioProfileProxy = this.f3395e;
        if (audioProfileProxy == null) {
            if (videoValidatedEncoderProfilesProxy.mo1843f() != null) {
                return false;
            }
        } else if (!audioProfileProxy.equals(videoValidatedEncoderProfilesProxy.mo1843f())) {
            return false;
        }
        return this.f3396f.equals(videoValidatedEncoderProfilesProxy.mo1844g());
    }

    @Override // androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy
    /* JADX INFO: renamed from: f */
    public final EncoderProfilesProxy.AudioProfileProxy mo1843f() {
        return this.f3395e;
    }

    @Override // androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy
    /* JADX INFO: renamed from: g */
    public final EncoderProfilesProxy.VideoProfileProxy mo1844g() {
        return this.f3396f;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f3391a ^ 1000003) * 1000003) ^ this.f3392b) * 1000003) ^ this.f3393c.hashCode()) * 1000003) ^ this.f3394d.hashCode()) * 1000003;
        EncoderProfilesProxy.AudioProfileProxy audioProfileProxy = this.f3395e;
        return ((iHashCode ^ (audioProfileProxy == null ? 0 : audioProfileProxy.hashCode())) * 1000003) ^ this.f3396f.hashCode();
    }

    public final String toString() {
        return "VideoValidatedEncoderProfilesProxy{defaultDurationSeconds=" + this.f3391a + ", recommendedFileFormat=" + this.f3392b + ", audioProfiles=" + this.f3393c + ", videoProfiles=" + this.f3394d + ", defaultAudioProfile=" + this.f3395e + ", defaultVideoProfile=" + this.f3396f + "}";
    }
}
