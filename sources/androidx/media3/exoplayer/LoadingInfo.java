package androidx.media3.exoplayer;

import androidx.media3.common.util.UnstableApi;
import java.util.Objects;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class LoadingInfo {

    /* JADX INFO: renamed from: a */
    public final long f26225a;

    /* JADX INFO: renamed from: b */
    public final float f26226b;

    /* JADX INFO: renamed from: c */
    public final long f26227c;

    /* JADX INFO: compiled from: Proguard */
    public static final class Builder {

        /* JADX INFO: renamed from: a */
        public long f26228a = -9223372036854775807L;

        /* JADX INFO: renamed from: b */
        public float f26229b = -3.4028235E38f;

        /* JADX INFO: renamed from: c */
        public long f26230c = -9223372036854775807L;
    }

    public LoadingInfo(Builder builder) {
        this.f26225a = builder.f26228a;
        this.f26226b = builder.f26229b;
        this.f26227c = builder.f26230c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoadingInfo)) {
            return false;
        }
        LoadingInfo loadingInfo = (LoadingInfo) obj;
        return this.f26225a == loadingInfo.f26225a && this.f26226b == loadingInfo.f26226b && this.f26227c == loadingInfo.f26227c;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f26225a), Float.valueOf(this.f26226b), Long.valueOf(this.f26227c));
    }
}
