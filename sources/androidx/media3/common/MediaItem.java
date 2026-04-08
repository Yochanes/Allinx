package androidx.media3.common;

import android.net.Uri;
import androidx.datastore.preferences.protobuf.AbstractC1610a;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final class MediaItem {

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ int f25214g = 0;

    /* JADX INFO: renamed from: a */
    public final String f25215a;

    /* JADX INFO: renamed from: b */
    public final LocalConfiguration f25216b;

    /* JADX INFO: renamed from: c */
    public final LiveConfiguration f25217c;

    /* JADX INFO: renamed from: d */
    public final MediaMetadata f25218d;

    /* JADX INFO: renamed from: e */
    public final ClippingProperties f25219e;

    /* JADX INFO: renamed from: f */
    public final RequestMetadata f25220f;

    /* JADX INFO: compiled from: Proguard */
    public static final class AdsConfiguration {

        /* JADX INFO: compiled from: Proguard */
        public static final class Builder {
        }

        static {
            Util.m9594D(0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AdsConfiguration)) {
                return false;
            }
            ((AdsConfiguration) obj).getClass();
            throw null;
        }

        public final int hashCode() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class Builder {

        /* JADX INFO: renamed from: a */
        public String f25221a;

        /* JADX INFO: renamed from: b */
        public Uri f25222b;

        /* JADX INFO: renamed from: c */
        public String f25223c;

        /* JADX INFO: renamed from: g */
        public String f25227g;

        /* JADX INFO: renamed from: i */
        public Uri f25229i;

        /* JADX INFO: renamed from: k */
        public MediaMetadata f25231k;

        /* JADX INFO: renamed from: d */
        public ClippingConfiguration.Builder f25224d = new ClippingConfiguration.Builder();

        /* JADX INFO: renamed from: e */
        public DrmConfiguration.Builder f25225e = new DrmConfiguration.Builder();

        /* JADX INFO: renamed from: f */
        public List f25226f = Collections.EMPTY_LIST;

        /* JADX INFO: renamed from: h */
        public ImmutableList f25228h = ImmutableList.m14824of();

        /* JADX INFO: renamed from: l */
        public LiveConfiguration.Builder f25232l = new LiveConfiguration.Builder();

        /* JADX INFO: renamed from: m */
        public RequestMetadata f25233m = RequestMetadata.f25254a;

        /* JADX INFO: renamed from: j */
        public long f25230j = -9223372036854775807L;

        /* JADX INFO: renamed from: a */
        public final MediaItem m9320a() {
            LocalConfiguration localConfiguration;
            this.f25225e.getClass();
            Uri uri = this.f25222b;
            if (uri != null) {
                String str = this.f25223c;
                this.f25225e.getClass();
                localConfiguration = new LocalConfiguration(uri, str, null, this.f25226f, this.f25227g, this.f25228h, this.f25229i, this.f25230j);
            } else {
                localConfiguration = null;
            }
            String str2 = this.f25221a;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = str2;
            ClippingConfiguration.Builder builder = this.f25224d;
            builder.getClass();
            ClippingProperties clippingProperties = new ClippingProperties(builder);
            LiveConfiguration.Builder builder2 = this.f25232l;
            builder2.getClass();
            LiveConfiguration liveConfiguration = new LiveConfiguration(builder2);
            MediaMetadata mediaMetadata = this.f25231k;
            if (mediaMetadata == null) {
                mediaMetadata = MediaMetadata.f25257B;
            }
            return new MediaItem(str3, clippingProperties, localConfiguration, liveConfiguration, mediaMetadata, this.f25233m);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class ClippingConfiguration {

        /* JADX INFO: renamed from: a */
        public final long f25234a;

        /* JADX INFO: compiled from: Proguard */
        public static final class Builder {

            /* JADX INFO: renamed from: a */
            public long f25235a = Long.MIN_VALUE;
        }

        static {
            new ClippingConfiguration(new Builder());
            Util.m9594D(0);
            Util.m9594D(1);
            Util.m9594D(2);
            Util.m9594D(3);
            Util.m9594D(4);
            Util.m9594D(5);
            Util.m9594D(6);
        }

        public ClippingConfiguration(Builder builder) {
            builder.getClass();
            int i = Util.f25665a;
            this.f25234a = builder.f25235a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ClippingConfiguration)) {
                return false;
            }
            ClippingConfiguration clippingConfiguration = (ClippingConfiguration) obj;
            clippingConfiguration.getClass();
            return this.f25234a == clippingConfiguration.f25234a;
        }

        public final int hashCode() {
            long j = this.f25234a;
            return ((((int) 0) * 31) + ((int) (j ^ (j >>> 32)))) * 29791;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @UnstableApi
    @Deprecated
    public static final class ClippingProperties extends ClippingConfiguration {
        static {
            new ClippingProperties(new ClippingConfiguration.Builder());
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class DrmConfiguration {

        /* JADX INFO: compiled from: Proguard */
        public static final class Builder {
            public Builder() {
                ImmutableMap.m14843of();
                ImmutableList.m14824of();
            }
        }

        static {
            AbstractC1610a.m8737o(0, 1, 2, 3, 4);
            Util.m9594D(5);
            Util.m9594D(6);
            Util.m9594D(7);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DrmConfiguration)) {
                return false;
            }
            ((DrmConfiguration) obj).getClass();
            throw null;
        }

        public final int hashCode() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class LiveConfiguration {

        /* JADX INFO: renamed from: a */
        public final long f25236a;

        /* JADX INFO: renamed from: b */
        public final long f25237b;

        /* JADX INFO: renamed from: c */
        public final long f25238c;

        /* JADX INFO: renamed from: d */
        public final float f25239d;

        /* JADX INFO: renamed from: e */
        public final float f25240e;

        /* JADX INFO: compiled from: Proguard */
        public static final class Builder {

            /* JADX INFO: renamed from: a */
            public long f25241a = -9223372036854775807L;

            /* JADX INFO: renamed from: b */
            public long f25242b = -9223372036854775807L;

            /* JADX INFO: renamed from: c */
            public long f25243c = -9223372036854775807L;

            /* JADX INFO: renamed from: d */
            public float f25244d = -3.4028235E38f;

            /* JADX INFO: renamed from: e */
            public float f25245e = -3.4028235E38f;
        }

        static {
            new LiveConfiguration(new Builder());
            Util.m9594D(0);
            Util.m9594D(1);
            Util.m9594D(2);
            Util.m9594D(3);
            Util.m9594D(4);
        }

        public LiveConfiguration(Builder builder) {
            long j = builder.f25241a;
            long j2 = builder.f25242b;
            long j3 = builder.f25243c;
            float f = builder.f25244d;
            float f2 = builder.f25245e;
            this.f25236a = j;
            this.f25237b = j2;
            this.f25238c = j3;
            this.f25239d = f;
            this.f25240e = f2;
        }

        /* JADX INFO: renamed from: a */
        public final Builder m9321a() {
            Builder builder = new Builder();
            builder.f25241a = this.f25236a;
            builder.f25242b = this.f25237b;
            builder.f25243c = this.f25238c;
            builder.f25244d = this.f25239d;
            builder.f25245e = this.f25240e;
            return builder;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LiveConfiguration)) {
                return false;
            }
            LiveConfiguration liveConfiguration = (LiveConfiguration) obj;
            return this.f25236a == liveConfiguration.f25236a && this.f25237b == liveConfiguration.f25237b && this.f25238c == liveConfiguration.f25238c && this.f25239d == liveConfiguration.f25239d && this.f25240e == liveConfiguration.f25240e;
        }

        public final int hashCode() {
            long j = this.f25236a;
            long j2 = this.f25237b;
            int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            long j3 = this.f25238c;
            int i2 = (i + ((int) ((j3 >>> 32) ^ j3))) * 31;
            float f = this.f25239d;
            int iFloatToIntBits = (i2 + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31;
            float f2 = this.f25240e;
            return iFloatToIntBits + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class LocalConfiguration {

        /* JADX INFO: renamed from: a */
        public final Uri f25246a;

        /* JADX INFO: renamed from: b */
        public final String f25247b;

        /* JADX INFO: renamed from: c */
        public final DrmConfiguration f25248c;

        /* JADX INFO: renamed from: d */
        public final List f25249d;

        /* JADX INFO: renamed from: e */
        public final String f25250e;

        /* JADX INFO: renamed from: f */
        public final ImmutableList f25251f;

        /* JADX INFO: renamed from: g */
        public final Uri f25252g;

        /* JADX INFO: renamed from: h */
        public final long f25253h;

        static {
            AbstractC1610a.m8737o(0, 1, 2, 3, 4);
            Util.m9594D(5);
            Util.m9594D(6);
            Util.m9594D(7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public LocalConfiguration(Uri uri, String str, DrmConfiguration drmConfiguration, List list, String str2, ImmutableList immutableList, Uri uri2, long j) {
            this.f25246a = uri;
            this.f25247b = MimeTypes.m9342m(str);
            this.f25248c = drmConfiguration;
            this.f25249d = list;
            this.f25250e = str2;
            this.f25251f = immutableList;
            ImmutableList.Builder builder = ImmutableList.builder();
            for (int i = 0; i < immutableList.size(); i++) {
                ((SubtitleConfiguration) immutableList.get(i)).getClass();
                builder.add(new Subtitle());
            }
            builder.build();
            this.f25252g = uri2;
            this.f25253h = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LocalConfiguration)) {
                return false;
            }
            LocalConfiguration localConfiguration = (LocalConfiguration) obj;
            return this.f25246a.equals(localConfiguration.f25246a) && Objects.equals(this.f25247b, localConfiguration.f25247b) && Objects.equals(this.f25248c, localConfiguration.f25248c) && this.f25249d.equals(localConfiguration.f25249d) && Objects.equals(this.f25250e, localConfiguration.f25250e) && this.f25251f.equals(localConfiguration.f25251f) && Objects.equals(this.f25252g, localConfiguration.f25252g) && this.f25253h == localConfiguration.f25253h;
        }

        public final int hashCode() {
            int iHashCode = this.f25246a.hashCode() * 31;
            String str = this.f25247b;
            int iHashCode2 = iHashCode + (str == null ? 0 : str.hashCode());
            if (this.f25248c != null) {
                throw null;
            }
            int iHashCode3 = (this.f25249d.hashCode() + (iHashCode2 * 29791)) * 31;
            String str2 = this.f25250e;
            int iHashCode4 = (this.f25251f.hashCode() + ((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
            Uri uri = this.f25252g;
            return (int) ((((long) (iHashCode4 + (uri != null ? uri.hashCode() : 0))) * 31) + this.f25253h);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class RequestMetadata {

        /* JADX INFO: renamed from: a */
        public static final RequestMetadata f25254a = new RequestMetadata();

        /* JADX INFO: compiled from: Proguard */
        public static final class Builder {
        }

        static {
            Util.m9594D(0);
            Util.m9594D(1);
            Util.m9594D(2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RequestMetadata)) {
                return false;
            }
            ((RequestMetadata) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return 0;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @UnstableApi
    @Deprecated
    public static final class Subtitle extends SubtitleConfiguration {
    }

    /* JADX INFO: compiled from: Proguard */
    public static class SubtitleConfiguration {

        /* JADX INFO: compiled from: Proguard */
        public static final class Builder {
        }

        static {
            AbstractC1610a.m8737o(0, 1, 2, 3, 4);
            Util.m9594D(5);
            Util.m9594D(6);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SubtitleConfiguration)) {
                return false;
            }
            ((SubtitleConfiguration) obj).getClass();
            throw null;
        }

        public final int hashCode() {
            throw null;
        }
    }

    static {
        new Builder().m9320a();
        AbstractC1610a.m8737o(0, 1, 2, 3, 4);
        Util.m9594D(5);
    }

    public MediaItem(String str, ClippingProperties clippingProperties, LocalConfiguration localConfiguration, LiveConfiguration liveConfiguration, MediaMetadata mediaMetadata, RequestMetadata requestMetadata) {
        this.f25215a = str;
        this.f25216b = localConfiguration;
        this.f25217c = liveConfiguration;
        this.f25218d = mediaMetadata;
        this.f25219e = clippingProperties;
        this.f25220f = requestMetadata;
    }

    /* JADX INFO: renamed from: a */
    public final Builder m9319a() {
        DrmConfiguration.Builder builder;
        Builder builder2 = new Builder();
        ClippingProperties clippingProperties = this.f25219e;
        ClippingConfiguration.Builder builder3 = new ClippingConfiguration.Builder();
        builder3.f25235a = clippingProperties.f25234a;
        builder2.f25224d = builder3;
        builder2.f25221a = this.f25215a;
        builder2.f25231k = this.f25218d;
        builder2.f25232l = this.f25217c.m9321a();
        builder2.f25233m = this.f25220f;
        LocalConfiguration localConfiguration = this.f25216b;
        if (localConfiguration != null) {
            builder2.f25227g = localConfiguration.f25250e;
            builder2.f25223c = localConfiguration.f25247b;
            builder2.f25222b = localConfiguration.f25246a;
            builder2.f25226f = localConfiguration.f25249d;
            builder2.f25228h = localConfiguration.f25251f;
            builder2.f25229i = localConfiguration.f25252g;
            DrmConfiguration drmConfiguration = localConfiguration.f25248c;
            if (drmConfiguration != null) {
                drmConfiguration.getClass();
                builder = new DrmConfiguration.Builder();
            } else {
                builder = new DrmConfiguration.Builder();
            }
            builder2.f25225e = builder;
            builder2.f25230j = localConfiguration.f25253h;
        }
        return builder2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaItem)) {
            return false;
        }
        MediaItem mediaItem = (MediaItem) obj;
        return Objects.equals(this.f25215a, mediaItem.f25215a) && this.f25219e.equals(mediaItem.f25219e) && Objects.equals(this.f25216b, mediaItem.f25216b) && this.f25217c.equals(mediaItem.f25217c) && Objects.equals(this.f25218d, mediaItem.f25218d) && Objects.equals(this.f25220f, mediaItem.f25220f);
    }

    public final int hashCode() {
        int iHashCode = this.f25215a.hashCode() * 31;
        LocalConfiguration localConfiguration = this.f25216b;
        int iHashCode2 = (this.f25218d.hashCode() + ((this.f25219e.hashCode() + ((this.f25217c.hashCode() + ((iHashCode + (localConfiguration != null ? localConfiguration.hashCode() : 0)) * 31)) * 31)) * 31)) * 31;
        this.f25220f.getClass();
        return iHashCode2;
    }
}
