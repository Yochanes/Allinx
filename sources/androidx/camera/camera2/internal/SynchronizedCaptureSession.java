package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.view.Surface;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public interface SynchronizedCaptureSession {
    /* JADX INFO: renamed from: a */
    void mo1046a();

    /* JADX INFO: renamed from: b */
    StateCallback mo1047b();

    /* JADX INFO: renamed from: c */
    void mo1048c();

    void close();

    /* JADX INFO: renamed from: e */
    void mo1049e();

    /* JADX INFO: renamed from: f */
    CameraCaptureSessionCompat mo1050f();

    /* JADX INFO: renamed from: g */
    int mo1051g(ArrayList arrayList, CameraCaptureSession.CaptureCallback captureCallback);

    /* JADX INFO: renamed from: h */
    CameraDevice mo1052h();

    /* JADX INFO: renamed from: i */
    int mo1053i(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback);

    /* JADX INFO: renamed from: k */
    ListenableFuture mo1054k();

    /* JADX INFO: compiled from: Proguard */
    public static abstract class StateCallback {
        /* JADX INFO: renamed from: l */
        public void mo1055l(SynchronizedCaptureSession synchronizedCaptureSession) {
        }

        /* JADX INFO: renamed from: m */
        public void mo1056m(SynchronizedCaptureSession synchronizedCaptureSession) {
        }

        /* JADX INFO: renamed from: n */
        public void mo1057n(SynchronizedCaptureSession synchronizedCaptureSession) {
        }

        /* JADX INFO: renamed from: o */
        public void mo1005o(SynchronizedCaptureSession synchronizedCaptureSession) {
        }

        /* JADX INFO: renamed from: p */
        public void mo1006p(SynchronizedCaptureSession synchronizedCaptureSession) {
        }

        /* JADX INFO: renamed from: q */
        public void mo1007q(SynchronizedCaptureSession synchronizedCaptureSession) {
        }

        /* JADX INFO: renamed from: r */
        public void mo1008r(SynchronizedCaptureSession synchronizedCaptureSession) {
        }

        /* JADX INFO: renamed from: s */
        public void mo1058s(SynchronizedCaptureSession synchronizedCaptureSession, Surface surface) {
        }
    }
}
