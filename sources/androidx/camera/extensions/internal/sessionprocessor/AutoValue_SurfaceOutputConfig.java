package androidx.camera.extensions.internal.sessionprocessor;

import android.view.Surface;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class AutoValue_SurfaceOutputConfig extends SurfaceOutputConfig {
    @Override // androidx.camera.extensions.internal.sessionprocessor.SurfaceOutputConfig
    /* JADX INFO: renamed from: a */
    public final Surface mo1761a() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SurfaceOutputConfig)) {
            return false;
        }
        ((AutoValue_SurfaceOutputConfig) ((SurfaceOutputConfig) obj)).getClass();
        Object obj2 = null;
        obj2.getClass();
        return false;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return "SurfaceOutputConfig{id=0, surfaceGroupId=0, physicalCameraId=" + ((String) null) + ", surfaceSharingOutputConfigs=" + ((Object) null) + ", surface=" + ((Object) null) + "}";
    }
}
