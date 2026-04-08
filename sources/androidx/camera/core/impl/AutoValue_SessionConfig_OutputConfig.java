package androidx.camera.core.impl;

import androidx.camera.core.DynamicRange;
import androidx.camera.core.impl.SessionConfig;
import java.util.List;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class AutoValue_SessionConfig_OutputConfig extends SessionConfig.OutputConfig {

    /* JADX INFO: renamed from: a */
    public final DeferrableSurface f2575a;

    /* JADX INFO: renamed from: b */
    public final List f2576b;

    /* JADX INFO: renamed from: c */
    public final int f2577c;

    /* JADX INFO: renamed from: d */
    public final DynamicRange f2578d;

    /* JADX INFO: compiled from: Proguard */
    public static final class Builder extends SessionConfig.OutputConfig.Builder {

        /* JADX INFO: renamed from: a */
        public DeferrableSurface f2579a;

        /* JADX INFO: renamed from: b */
        public List f2580b;

        /* JADX INFO: renamed from: c */
        public Integer f2581c;

        /* JADX INFO: renamed from: d */
        public DynamicRange f2582d;

        @Override // androidx.camera.core.impl.SessionConfig.OutputConfig.Builder
        /* JADX INFO: renamed from: a */
        public final SessionConfig.OutputConfig mo1416a() {
            String strM2C = this.f2579a == null ? " surface" : "";
            if (this.f2580b == null) {
                strM2C = strM2C.concat(" sharedSurfaces");
            }
            if (this.f2581c == null) {
                strM2C = AbstractC0000a.m2C(strM2C, " surfaceGroupId");
            }
            if (this.f2582d == null) {
                strM2C = AbstractC0000a.m2C(strM2C, " dynamicRange");
            }
            if (strM2C.isEmpty()) {
                return new AutoValue_SessionConfig_OutputConfig(this.f2579a, this.f2580b, this.f2581c.intValue(), this.f2582d);
            }
            throw new IllegalStateException("Missing required properties:".concat(strM2C));
        }
    }

    public AutoValue_SessionConfig_OutputConfig(DeferrableSurface deferrableSurface, List list, int i, DynamicRange dynamicRange) {
        this.f2575a = deferrableSurface;
        this.f2576b = list;
        this.f2577c = i;
        this.f2578d = dynamicRange;
    }

    @Override // androidx.camera.core.impl.SessionConfig.OutputConfig
    /* JADX INFO: renamed from: b */
    public final DynamicRange mo1411b() {
        return this.f2578d;
    }

    @Override // androidx.camera.core.impl.SessionConfig.OutputConfig
    /* JADX INFO: renamed from: c */
    public final String mo1412c() {
        return null;
    }

    @Override // androidx.camera.core.impl.SessionConfig.OutputConfig
    /* JADX INFO: renamed from: d */
    public final List mo1413d() {
        return this.f2576b;
    }

    @Override // androidx.camera.core.impl.SessionConfig.OutputConfig
    /* JADX INFO: renamed from: e */
    public final DeferrableSurface mo1414e() {
        return this.f2575a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SessionConfig.OutputConfig)) {
            return false;
        }
        SessionConfig.OutputConfig outputConfig = (SessionConfig.OutputConfig) obj;
        return this.f2575a.equals(outputConfig.mo1414e()) && this.f2576b.equals(outputConfig.mo1413d()) && outputConfig.mo1412c() == null && this.f2577c == outputConfig.mo1415f() && this.f2578d.equals(outputConfig.mo1411b());
    }

    @Override // androidx.camera.core.impl.SessionConfig.OutputConfig
    /* JADX INFO: renamed from: f */
    public final int mo1415f() {
        return this.f2577c;
    }

    public final int hashCode() {
        return ((((((this.f2575a.hashCode() ^ 1000003) * 1000003) ^ this.f2576b.hashCode()) * (-721379959)) ^ this.f2577c) * 1000003) ^ this.f2578d.hashCode();
    }

    public final String toString() {
        return "OutputConfig{surface=" + this.f2575a + ", sharedSurfaces=" + this.f2576b + ", physicalCameraId=null, surfaceGroupId=" + this.f2577c + ", dynamicRange=" + this.f2578d + "}";
    }
}
