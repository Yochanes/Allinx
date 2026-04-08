package androidx.camera.core.impl;

import androidx.camera.core.impl.SurfaceConfig;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class AutoValue_SurfaceConfig extends SurfaceConfig {

    /* JADX INFO: renamed from: a */
    public final SurfaceConfig.ConfigType f2591a;

    /* JADX INFO: renamed from: b */
    public final SurfaceConfig.ConfigSize f2592b;

    /* JADX INFO: renamed from: c */
    public final long f2593c;

    public AutoValue_SurfaceConfig(SurfaceConfig.ConfigType configType, SurfaceConfig.ConfigSize configSize, long j) {
        this.f2591a = configType;
        this.f2592b = configSize;
        this.f2593c = j;
    }

    @Override // androidx.camera.core.impl.SurfaceConfig
    /* JADX INFO: renamed from: c */
    public final SurfaceConfig.ConfigSize mo1427c() {
        return this.f2592b;
    }

    @Override // androidx.camera.core.impl.SurfaceConfig
    /* JADX INFO: renamed from: d */
    public final SurfaceConfig.ConfigType mo1428d() {
        return this.f2591a;
    }

    @Override // androidx.camera.core.impl.SurfaceConfig
    /* JADX INFO: renamed from: e */
    public final long mo1429e() {
        return this.f2593c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SurfaceConfig)) {
            return false;
        }
        SurfaceConfig surfaceConfig = (SurfaceConfig) obj;
        return this.f2591a.equals(surfaceConfig.mo1428d()) && this.f2592b.equals(surfaceConfig.mo1427c()) && this.f2593c == surfaceConfig.mo1429e();
    }

    public final int hashCode() {
        int iHashCode = (((this.f2591a.hashCode() ^ 1000003) * 1000003) ^ this.f2592b.hashCode()) * 1000003;
        long j = this.f2593c;
        return iHashCode ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SurfaceConfig{configType=");
        sb.append(this.f2591a);
        sb.append(", configSize=");
        sb.append(this.f2592b);
        sb.append(", streamUseCase=");
        return AbstractC0000a.m12i(this.f2593c, "}", sb);
    }
}
