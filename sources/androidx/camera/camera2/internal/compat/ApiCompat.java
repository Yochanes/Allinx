package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.OutputConfiguration;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AbstractC0083c;
import androidx.appcompat.widget.AbstractC0151d;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final class ApiCompat {

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api21Impl {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static void m1077a(@NonNull CameraDevice cameraDevice) {
            cameraDevice.close();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api23Impl {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static void m1078a(@NonNull CameraCaptureSession.StateCallback stateCallback, @NonNull CameraCaptureSession cameraCaptureSession, @NonNull Surface surface) {
            stateCallback.onSurfacePrepared(cameraCaptureSession, surface);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api24Impl {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static void m1079a(@NonNull CameraCaptureSession.CaptureCallback captureCallback, @NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull Surface surface, long j) {
            captureCallback.onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api26Impl {
        @NonNull
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static <T> OutputConfiguration m1080a(@NonNull Size size, @NonNull Class<T> cls) {
            return AbstractC0083c.m372d(size, cls);
        }

        @DoNotInline
        /* JADX INFO: renamed from: b */
        public static void m1081b(@NonNull CameraCaptureSession.StateCallback stateCallback, @NonNull CameraCaptureSession cameraCaptureSession) {
            AbstractC0083c.m365A(stateCallback, cameraCaptureSession);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api29Impl {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static void m1082a(@NonNull CameraManager.AvailabilityCallback availabilityCallback) {
            AbstractC0151d.m784h(availabilityCallback);
        }
    }
}
