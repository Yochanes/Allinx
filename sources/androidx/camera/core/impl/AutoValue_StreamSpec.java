package androidx.camera.core.impl;

import android.util.Range;
import android.util.Size;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.impl.StreamSpec;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class AutoValue_StreamSpec extends StreamSpec {

    /* JADX INFO: renamed from: b */
    public final Size f2583b;

    /* JADX INFO: renamed from: c */
    public final DynamicRange f2584c;

    /* JADX INFO: renamed from: d */
    public final Range f2585d;

    /* JADX INFO: renamed from: e */
    public final Config f2586e;

    /* JADX INFO: compiled from: Proguard */
    public static final class Builder extends StreamSpec.Builder {

        /* JADX INFO: renamed from: a */
        public Size f2587a;

        /* JADX INFO: renamed from: b */
        public DynamicRange f2588b;

        /* JADX INFO: renamed from: c */
        public Range f2589c;

        /* JADX INFO: renamed from: d */
        public Config f2590d;

        @Override // androidx.camera.core.impl.StreamSpec.Builder
        /* JADX INFO: renamed from: a */
        public final StreamSpec mo1422a() {
            String strM2C = this.f2587a == null ? " resolution" : "";
            if (this.f2588b == null) {
                strM2C = strM2C.concat(" dynamicRange");
            }
            if (this.f2589c == null) {
                strM2C = AbstractC0000a.m2C(strM2C, " expectedFrameRateRange");
            }
            if (strM2C.isEmpty()) {
                return new AutoValue_StreamSpec(this.f2587a, this.f2588b, this.f2589c, this.f2590d);
            }
            throw new IllegalStateException("Missing required properties:".concat(strM2C));
        }

        @Override // androidx.camera.core.impl.StreamSpec.Builder
        /* JADX INFO: renamed from: b */
        public final StreamSpec.Builder mo1423b(DynamicRange dynamicRange) {
            if (dynamicRange == null) {
                throw new NullPointerException("Null dynamicRange");
            }
            this.f2588b = dynamicRange;
            return this;
        }

        @Override // androidx.camera.core.impl.StreamSpec.Builder
        /* JADX INFO: renamed from: c */
        public final StreamSpec.Builder mo1424c(Range range) {
            if (range == null) {
                throw new NullPointerException("Null expectedFrameRateRange");
            }
            this.f2589c = range;
            return this;
        }

        @Override // androidx.camera.core.impl.StreamSpec.Builder
        /* JADX INFO: renamed from: d */
        public final StreamSpec.Builder mo1425d(Config config) {
            this.f2590d = config;
            return this;
        }

        @Override // androidx.camera.core.impl.StreamSpec.Builder
        /* JADX INFO: renamed from: e */
        public final StreamSpec.Builder mo1426e(Size size) {
            if (size == null) {
                throw new NullPointerException("Null resolution");
            }
            this.f2587a = size;
            return this;
        }
    }

    public AutoValue_StreamSpec(Size size, DynamicRange dynamicRange, Range range, Config config) {
        this.f2583b = size;
        this.f2584c = dynamicRange;
        this.f2585d = range;
        this.f2586e = config;
    }

    @Override // androidx.camera.core.impl.StreamSpec
    /* JADX INFO: renamed from: b */
    public final DynamicRange mo1417b() {
        return this.f2584c;
    }

    @Override // androidx.camera.core.impl.StreamSpec
    /* JADX INFO: renamed from: c */
    public final Range mo1418c() {
        return this.f2585d;
    }

    @Override // androidx.camera.core.impl.StreamSpec
    /* JADX INFO: renamed from: d */
    public final Config mo1419d() {
        return this.f2586e;
    }

    @Override // androidx.camera.core.impl.StreamSpec
    /* JADX INFO: renamed from: e */
    public final Size mo1420e() {
        return this.f2583b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StreamSpec)) {
            return false;
        }
        StreamSpec streamSpec = (StreamSpec) obj;
        if (!this.f2583b.equals(streamSpec.mo1420e()) || !this.f2584c.equals(streamSpec.mo1417b()) || !this.f2585d.equals(streamSpec.mo1418c())) {
            return false;
        }
        Config config = this.f2586e;
        return config == null ? streamSpec.mo1419d() == null : config.equals(streamSpec.mo1419d());
    }

    @Override // androidx.camera.core.impl.StreamSpec
    /* JADX INFO: renamed from: f */
    public final StreamSpec.Builder mo1421f() {
        Builder builder = new Builder();
        builder.f2587a = mo1420e();
        builder.f2588b = mo1417b();
        builder.f2589c = mo1418c();
        builder.f2590d = mo1419d();
        return builder;
    }

    public final int hashCode() {
        int iHashCode = (((((this.f2583b.hashCode() ^ 1000003) * 1000003) ^ this.f2584c.hashCode()) * 1000003) ^ this.f2585d.hashCode()) * 1000003;
        Config config = this.f2586e;
        return iHashCode ^ (config == null ? 0 : config.hashCode());
    }

    public final String toString() {
        return "StreamSpec{resolution=" + this.f2583b + ", dynamicRange=" + this.f2584c + ", expectedFrameRateRange=" + this.f2585d + ", implementationOptions=" + this.f2586e + "}";
    }
}
