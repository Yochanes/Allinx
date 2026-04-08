package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.compat.CameraCaptureSessionCompatBaseImpl;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public final class CameraCaptureSessionCompat {

    /* JADX INFO: renamed from: a */
    public final CameraCaptureSessionCompatBaseImpl f1946a;

    /* JADX INFO: compiled from: Proguard */
    public interface CameraCaptureSessionCompatImpl {
        /* JADX INFO: renamed from: a */
        int mo1086a(ArrayList arrayList, Executor executor, CameraCaptureSession.CaptureCallback captureCallback);

        /* JADX INFO: renamed from: b */
        int mo1087b(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback);
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static final class CaptureCallbackExecutorWrapper extends CameraCaptureSession.CaptureCallback {

        /* JADX INFO: renamed from: a */
        public final CameraCaptureSession.CaptureCallback f1947a;

        /* JADX INFO: renamed from: b */
        public final Executor f1948b;

        public CaptureCallbackExecutorWrapper(Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
            this.f1948b = executor;
            this.f1947a = captureCallback;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j) {
            this.f1948b.execute(new RunnableC0193d(this, cameraCaptureSession, captureRequest, surface, j));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            this.f1948b.execute(new RunnableC0191b(this, cameraCaptureSession, captureRequest, totalCaptureResult, 0));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
            this.f1948b.execute(new RunnableC0191b(this, cameraCaptureSession, captureRequest, captureFailure, 2));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
            this.f1948b.execute(new RunnableC0191b(this, cameraCaptureSession, captureRequest, captureResult, 1));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i) {
            this.f1948b.execute(new RunnableC0194e(this, cameraCaptureSession, i, 0));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i, long j) {
            this.f1948b.execute(new RunnableC0192c(this, cameraCaptureSession, i, j));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
            this.f1948b.execute(new RunnableC0190a(this, cameraCaptureSession, captureRequest, j, j2));
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static final class StateCallbackExecutorWrapper extends CameraCaptureSession.StateCallback {

        /* JADX INFO: renamed from: a */
        public final CameraCaptureSession.StateCallback f1949a;

        /* JADX INFO: renamed from: b */
        public final Executor f1950b;

        public StateCallbackExecutorWrapper(Executor executor, CameraCaptureSession.StateCallback stateCallback) {
            this.f1950b = executor;
            this.f1949a = stateCallback;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public final void onActive(CameraCaptureSession cameraCaptureSession) {
            this.f1950b.execute(new RunnableC0195f(this, cameraCaptureSession, 0));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public final void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
            this.f1950b.execute(new RunnableC0195f(this, cameraCaptureSession, 2));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public final void onClosed(CameraCaptureSession cameraCaptureSession) {
            this.f1950b.execute(new RunnableC0195f(this, cameraCaptureSession, 1));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
            this.f1950b.execute(new RunnableC0195f(this, cameraCaptureSession, 5));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
            this.f1950b.execute(new RunnableC0195f(this, cameraCaptureSession, 3));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public final void onReady(CameraCaptureSession cameraCaptureSession) {
            this.f1950b.execute(new RunnableC0195f(this, cameraCaptureSession, 4));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public final void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
            this.f1950b.execute(new RunnableC0196g(this, cameraCaptureSession, surface));
        }
    }

    public CameraCaptureSessionCompat(CameraCaptureSession cameraCaptureSession, Handler handler) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f1946a = new CameraCaptureSessionCompatApi28Impl(cameraCaptureSession, null);
        } else {
            this.f1946a = new CameraCaptureSessionCompatBaseImpl(cameraCaptureSession, new CameraCaptureSessionCompatBaseImpl.CameraCaptureSessionCompatParamsApi21(handler));
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m1083a(ArrayList arrayList, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f1946a.mo1086a(arrayList, executor, captureCallback);
    }

    /* JADX INFO: renamed from: b */
    public final int m1084b(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f1946a.mo1087b(captureRequest, executor, captureCallback);
    }

    /* JADX INFO: renamed from: c */
    public final CameraCaptureSession m1085c() {
        return this.f1946a.f1951a;
    }
}
