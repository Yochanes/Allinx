package androidx.media3.exoplayer.audio;

import androidx.media3.common.util.UnstableApi;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class AudioOffloadSupport {

    /* JADX INFO: renamed from: d */
    public static final AudioOffloadSupport f26514d = new Builder().m10212a();

    /* JADX INFO: renamed from: a */
    public final boolean f26515a;

    /* JADX INFO: renamed from: b */
    public final boolean f26516b;

    /* JADX INFO: renamed from: c */
    public final boolean f26517c;

    /* JADX INFO: compiled from: Proguard */
    public static final class Builder {

        /* JADX INFO: renamed from: a */
        public boolean f26518a;

        /* JADX INFO: renamed from: b */
        public boolean f26519b;

        /* JADX INFO: renamed from: c */
        public boolean f26520c;

        /* JADX INFO: renamed from: a */
        public final AudioOffloadSupport m10212a() {
            if (this.f26518a || !(this.f26519b || this.f26520c)) {
                return new AudioOffloadSupport(this);
            }
            throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
        }
    }

    public AudioOffloadSupport(Builder builder) {
        this.f26515a = builder.f26518a;
        this.f26516b = builder.f26519b;
        this.f26517c = builder.f26520c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AudioOffloadSupport.class != obj.getClass()) {
            return false;
        }
        AudioOffloadSupport audioOffloadSupport = (AudioOffloadSupport) obj;
        return this.f26515a == audioOffloadSupport.f26515a && this.f26516b == audioOffloadSupport.f26516b && this.f26517c == audioOffloadSupport.f26517c;
    }

    public final int hashCode() {
        return ((this.f26515a ? 1 : 0) << 2) + ((this.f26516b ? 1 : 0) << 1) + (this.f26517c ? 1 : 0);
    }
}
