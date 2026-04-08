package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import androidx.annotation.RequiresApi;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
class CameraManagerCompatApi28Impl extends CameraManagerCompatBaseImpl {
    /* JADX INFO: renamed from: g */
    public static boolean m1102g(RuntimeException runtimeException) {
        StackTraceElement[] stackTrace;
        if (Build.VERSION.SDK_INT == 28) {
            if ((!runtimeException.getClass().equals(RuntimeException.class) || (stackTrace = runtimeException.getStackTrace()) == null || stackTrace.length < 0) ? false : "_enableShutterSound".equals(stackTrace[0].getMethodName())) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.camera2.internal.compat.CameraManagerCompatBaseImpl, androidx.camera.camera2.internal.compat.CameraManagerCompat.CameraManagerCompatImpl
    /* JADX INFO: renamed from: a */
    public final void mo1096a(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
        this.f1971a.registerAvailabilityCallback(executor, availabilityCallback);
    }

    @Override // androidx.camera.camera2.internal.compat.CameraManagerCompatBaseImpl, androidx.camera.camera2.internal.compat.CameraManagerCompat.CameraManagerCompatImpl
    /* JADX INFO: renamed from: b */
    public final void mo1097b(CameraManager.AvailabilityCallback availabilityCallback) {
        this.f1971a.unregisterAvailabilityCallback(availabilityCallback);
    }

    @Override // androidx.camera.camera2.internal.compat.CameraManagerCompatBaseImpl, androidx.camera.camera2.internal.compat.CameraManagerCompat.CameraManagerCompatImpl
    /* JADX INFO: renamed from: c */
    public CameraCharacteristics mo1098c(String str) throws CameraAccessExceptionCompat {
        try {
            return super.mo1098c(str);
        } catch (RuntimeException e) {
            if (m1102g(e)) {
                throw new CameraAccessExceptionCompat(e);
            }
            throw e;
        }
    }

    @Override // androidx.camera.camera2.internal.compat.CameraManagerCompatBaseImpl, androidx.camera.camera2.internal.compat.CameraManagerCompat.CameraManagerCompatImpl
    /* JADX INFO: renamed from: e */
    public void mo1100e(String str, Executor executor, CameraDevice.StateCallback stateCallback) throws CameraAccessExceptionCompat {
        try {
            this.f1971a.openCamera(str, executor, stateCallback);
        } catch (CameraAccessException e) {
            throw new CameraAccessExceptionCompat(e);
        } catch (IllegalArgumentException e2) {
        } catch (SecurityException e3) {
            throw e3;
        } catch (RuntimeException e4) {
            if (!m1102g(e4)) {
                throw e4;
            }
            throw new CameraAccessExceptionCompat(e4);
        }
    }
}
