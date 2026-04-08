package androidx.media3.datasource;

import android.net.Uri;
import androidx.media3.common.MediaLibraryInfo;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class DataSpec {

    /* JADX INFO: renamed from: a */
    public final Uri f25819a;

    /* JADX INFO: renamed from: b */
    public final int f25820b;

    /* JADX INFO: renamed from: c */
    public final byte[] f25821c;

    /* JADX INFO: renamed from: d */
    public final Map f25822d;

    /* JADX INFO: renamed from: e */
    public final long f25823e;

    /* JADX INFO: renamed from: f */
    public final long f25824f;

    /* JADX INFO: renamed from: g */
    public final String f25825g;

    /* JADX INFO: renamed from: h */
    public final int f25826h;

    /* JADX INFO: compiled from: Proguard */
    public static final class Builder {

        /* JADX INFO: renamed from: a */
        public Uri f25827a;

        /* JADX INFO: renamed from: c */
        public byte[] f25829c;

        /* JADX INFO: renamed from: e */
        public long f25831e;

        /* JADX INFO: renamed from: g */
        public String f25833g;

        /* JADX INFO: renamed from: h */
        public int f25834h;

        /* JADX INFO: renamed from: b */
        public int f25828b = 1;

        /* JADX INFO: renamed from: d */
        public Map f25830d = Collections.EMPTY_MAP;

        /* JADX INFO: renamed from: f */
        public long f25832f = -1;

        /* JADX INFO: renamed from: a */
        public final DataSpec m9680a() {
            if (this.f25827a != null) {
                return new DataSpec(this.f25827a, this.f25828b, this.f25829c, this.f25830d, this.f25831e, this.f25832f, this.f25833g, this.f25834h);
            }
            throw new IllegalStateException("The uri must be set.");
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    /* JADX INFO: compiled from: Proguard */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface HttpMethod {
    }

    static {
        MediaLibraryInfo.m9322a("media3.datasource");
    }

    public DataSpec(Uri uri, int i, byte[] bArr, Map map, long j, long j2, String str, int i2) {
        Assertions.m9460a(j >= 0);
        Assertions.m9460a(j >= 0);
        Assertions.m9460a(j2 > 0 || j2 == -1);
        uri.getClass();
        this.f25819a = uri;
        this.f25820b = i;
        this.f25821c = (bArr == null || bArr.length == 0) ? null : bArr;
        this.f25822d = Collections.unmodifiableMap(new HashMap(map));
        this.f25823e = j;
        this.f25824f = j2;
        this.f25825g = str;
        this.f25826h = i2;
    }

    /* JADX INFO: renamed from: b */
    public static String m9678b(int i) {
        if (i == 1) {
            return "GET";
        }
        if (i == 2) {
            return "POST";
        }
        if (i == 3) {
            return "HEAD";
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: renamed from: a */
    public final Builder m9679a() {
        Builder builder = new Builder();
        builder.f25827a = this.f25819a;
        builder.f25828b = this.f25820b;
        builder.f25829c = this.f25821c;
        builder.f25830d = this.f25822d;
        builder.f25831e = this.f25823e;
        builder.f25832f = this.f25824f;
        builder.f25833g = this.f25825g;
        builder.f25834h = this.f25826h;
        return builder;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataSpec[");
        sb.append(m9678b(this.f25820b));
        sb.append(" ");
        sb.append(this.f25819a);
        sb.append(", ");
        sb.append(this.f25823e);
        sb.append(", ");
        sb.append(this.f25824f);
        sb.append(", ");
        sb.append(this.f25825g);
        sb.append(", ");
        return AbstractC0000a.m11h(this.f25826h, "]", sb);
    }
}
