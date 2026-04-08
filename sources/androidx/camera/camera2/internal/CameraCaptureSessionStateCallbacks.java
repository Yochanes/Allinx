package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.compat.ApiCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public final class CameraCaptureSessionStateCallbacks {

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static final class ComboSessionStateCallback extends CameraCaptureSession.StateCallback {

        /* JADX INFO: renamed from: a */
        public final ArrayList f1716a = new ArrayList();

        public ComboSessionStateCallback(List list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                CameraCaptureSession.StateCallback stateCallback = (CameraCaptureSession.StateCallback) it.next();
                if (!(stateCallback instanceof NoOpSessionStateCallback)) {
                    this.f1716a.add(stateCallback);
                }
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public final void onActive(CameraCaptureSession cameraCaptureSession) {
            Iterator it = this.f1716a.iterator();
            while (it.hasNext()) {
                ((CameraCaptureSession.StateCallback) it.next()).onActive(cameraCaptureSession);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public final void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
            Iterator it = this.f1716a.iterator();
            while (it.hasNext()) {
                ApiCompat.Api26Impl.m1081b((CameraCaptureSession.StateCallback) it.next(), cameraCaptureSession);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public final void onClosed(CameraCaptureSession cameraCaptureSession) {
            Iterator it = this.f1716a.iterator();
            while (it.hasNext()) {
                ((CameraCaptureSession.StateCallback) it.next()).onClosed(cameraCaptureSession);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
            Iterator it = this.f1716a.iterator();
            while (it.hasNext()) {
                ((CameraCaptureSession.StateCallback) it.next()).onConfigureFailed(cameraCaptureSession);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
            Iterator it = this.f1716a.iterator();
            while (it.hasNext()) {
                ((CameraCaptureSession.StateCallback) it.next()).onConfigured(cameraCaptureSession);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public final void onReady(CameraCaptureSession cameraCaptureSession) {
            Iterator it = this.f1716a.iterator();
            while (it.hasNext()) {
                ((CameraCaptureSession.StateCallback) it.next()).onReady(cameraCaptureSession);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public final void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
            Iterator it = this.f1716a.iterator();
            while (it.hasNext()) {
                ApiCompat.Api23Impl.m1078a((CameraCaptureSession.StateCallback) it.next(), cameraCaptureSession, surface);
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class NoOpSessionStateCallback extends CameraCaptureSession.StateCallback {
        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public final void onActive(CameraCaptureSession cameraCaptureSession) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public final void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public final void onClosed(CameraCaptureSession cameraCaptureSession) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public final void onReady(CameraCaptureSession cameraCaptureSession) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public final void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
        }
    }
}
