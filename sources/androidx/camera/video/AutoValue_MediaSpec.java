package androidx.camera.video;

import androidx.camera.video.MediaSpec;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class AutoValue_MediaSpec extends MediaSpec {

    /* JADX INFO: compiled from: Proguard */
    public static final class Builder extends MediaSpec.Builder {

        /* JADX INFO: renamed from: a */
        public AudioSpec f3286a;

        /* JADX INFO: renamed from: b */
        public Integer f3287b;
    }

    @Override // androidx.camera.video.MediaSpec
    /* JADX INFO: renamed from: a */
    public final AudioSpec mo1804a() {
        return null;
    }

    @Override // androidx.camera.video.MediaSpec
    /* JADX INFO: renamed from: b */
    public final int mo1805b() {
        return 0;
    }

    @Override // androidx.camera.video.MediaSpec
    /* JADX INFO: renamed from: c */
    public final VideoSpec mo1806c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MediaSpec)) {
            return false;
        }
        ((MediaSpec) obj).mo1806c();
        throw null;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaSpec{videoSpec=");
        sb.append((Object) null);
        sb.append(", audioSpec=");
        sb.append((Object) null);
        sb.append(", outputFormat=");
        return AbstractC0000a.m11h(0, "}", sb);
    }
}
