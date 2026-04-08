package androidx.camera.core;

import androidx.camera.core.CameraState;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class AutoValue_CameraState extends CameraState {

    /* JADX INFO: renamed from: a */
    public final CameraState.Type f2176a;

    /* JADX INFO: renamed from: b */
    public final CameraState.StateError f2177b;

    public AutoValue_CameraState(CameraState.Type type, CameraState.StateError stateError) {
        this.f2176a = type;
        this.f2177b = stateError;
    }

    @Override // androidx.camera.core.CameraState
    /* JADX INFO: renamed from: c */
    public final CameraState.StateError mo1191c() {
        return this.f2177b;
    }

    @Override // androidx.camera.core.CameraState
    /* JADX INFO: renamed from: d */
    public final CameraState.Type mo1192d() {
        return this.f2176a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CameraState)) {
            return false;
        }
        CameraState cameraState = (CameraState) obj;
        if (!this.f2176a.equals(cameraState.mo1192d())) {
            return false;
        }
        CameraState.StateError stateError = this.f2177b;
        return stateError == null ? cameraState.mo1191c() == null : stateError.equals(cameraState.mo1191c());
    }

    public final int hashCode() {
        int iHashCode = (this.f2176a.hashCode() ^ 1000003) * 1000003;
        CameraState.StateError stateError = this.f2177b;
        return iHashCode ^ (stateError == null ? 0 : stateError.hashCode());
    }

    public final String toString() {
        return "CameraState{type=" + this.f2176a + ", error=" + this.f2177b + "}";
    }
}
