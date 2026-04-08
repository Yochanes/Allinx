package androidx.camera.core.impl;

import androidx.annotation.RequiresApi;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public final class CameraCaptureCallbacks {

    /* JADX INFO: compiled from: Proguard */
    public static final class ComboCameraCaptureCallback extends CameraCaptureCallback {
        @Override // androidx.camera.core.impl.CameraCaptureCallback
        /* JADX INFO: renamed from: a */
        public final void mo894a() {
            throw null;
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        /* JADX INFO: renamed from: b */
        public final void mo895b(CameraCaptureResult cameraCaptureResult) {
            throw null;
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        /* JADX INFO: renamed from: c */
        public final void mo896c(CameraCaptureFailure cameraCaptureFailure) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class NoOpCameraCaptureCallback extends CameraCaptureCallback {
        @Override // androidx.camera.core.impl.CameraCaptureCallback
        /* JADX INFO: renamed from: b */
        public final void mo895b(CameraCaptureResult cameraCaptureResult) {
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        /* JADX INFO: renamed from: c */
        public final void mo896c(CameraCaptureFailure cameraCaptureFailure) {
        }
    }
}
