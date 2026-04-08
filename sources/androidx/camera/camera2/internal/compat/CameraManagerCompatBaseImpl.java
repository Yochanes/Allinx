package androidx.camera.camera2.internal.compat;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Handler;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.compat.CameraDeviceCompat;
import androidx.camera.camera2.internal.compat.CameraManagerCompat;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
class CameraManagerCompatBaseImpl implements CameraManagerCompat.CameraManagerCompatImpl {

    /* JADX INFO: renamed from: a */
    public final CameraManager f1971a;

    /* JADX INFO: renamed from: b */
    public final Object f1972b;

    /* JADX INFO: compiled from: Proguard */
    public static final class CameraManagerCompatParamsApi21 {

        /* JADX INFO: renamed from: a */
        public final HashMap f1973a = new HashMap();

        /* JADX INFO: renamed from: b */
        public final Handler f1974b;

        public CameraManagerCompatParamsApi21(Handler handler) {
            this.f1974b = handler;
        }
    }

    public CameraManagerCompatBaseImpl(Context context, Object obj) {
        this.f1971a = (CameraManager) context.getSystemService("camera");
        this.f1972b = obj;
    }

    @Override // androidx.camera.camera2.internal.compat.CameraManagerCompat.CameraManagerCompatImpl
    /* JADX INFO: renamed from: a */
    public void mo1096a(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
        CameraManagerCompat.AvailabilityCallbackExecutorWrapper availabilityCallbackExecutorWrapper;
        CameraManagerCompatParamsApi21 cameraManagerCompatParamsApi21 = (CameraManagerCompatParamsApi21) this.f1972b;
        synchronized (cameraManagerCompatParamsApi21.f1973a) {
            try {
                availabilityCallbackExecutorWrapper = (CameraManagerCompat.AvailabilityCallbackExecutorWrapper) cameraManagerCompatParamsApi21.f1973a.get(availabilityCallback);
                if (availabilityCallbackExecutorWrapper == null) {
                    availabilityCallbackExecutorWrapper = new CameraManagerCompat.AvailabilityCallbackExecutorWrapper(executor, availabilityCallback);
                    cameraManagerCompatParamsApi21.f1973a.put(availabilityCallback, availabilityCallbackExecutorWrapper);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f1971a.registerAvailabilityCallback(availabilityCallbackExecutorWrapper, cameraManagerCompatParamsApi21.f1974b);
    }

    @Override // androidx.camera.camera2.internal.compat.CameraManagerCompat.CameraManagerCompatImpl
    /* JADX INFO: renamed from: b */
    public void mo1097b(CameraManager.AvailabilityCallback availabilityCallback) {
        CameraManagerCompat.AvailabilityCallbackExecutorWrapper availabilityCallbackExecutorWrapper;
        if (availabilityCallback != null) {
            CameraManagerCompatParamsApi21 cameraManagerCompatParamsApi21 = (CameraManagerCompatParamsApi21) this.f1972b;
            synchronized (cameraManagerCompatParamsApi21.f1973a) {
                availabilityCallbackExecutorWrapper = (CameraManagerCompat.AvailabilityCallbackExecutorWrapper) cameraManagerCompatParamsApi21.f1973a.remove(availabilityCallback);
            }
        } else {
            availabilityCallbackExecutorWrapper = null;
        }
        if (availabilityCallbackExecutorWrapper != null) {
            synchronized (availabilityCallbackExecutorWrapper.f1969c) {
                availabilityCallbackExecutorWrapper.f1970d = true;
            }
        }
        this.f1971a.unregisterAvailabilityCallback(availabilityCallbackExecutorWrapper);
    }

    @Override // androidx.camera.camera2.internal.compat.CameraManagerCompat.CameraManagerCompatImpl
    /* JADX INFO: renamed from: c */
    public CameraCharacteristics mo1098c(String str) throws CameraAccessExceptionCompat {
        try {
            return this.f1971a.getCameraCharacteristics(str);
        } catch (CameraAccessException e) {
            throw new CameraAccessExceptionCompat(e);
        }
    }

    @Override // androidx.camera.camera2.internal.compat.CameraManagerCompat.CameraManagerCompatImpl
    /* JADX INFO: renamed from: d */
    public Set mo1099d() {
        return Collections.EMPTY_SET;
    }

    @Override // androidx.camera.camera2.internal.compat.CameraManagerCompat.CameraManagerCompatImpl
    /* JADX INFO: renamed from: e */
    public void mo1100e(String str, Executor executor, CameraDevice.StateCallback stateCallback) throws CameraAccessExceptionCompat {
        executor.getClass();
        stateCallback.getClass();
        try {
            this.f1971a.openCamera(str, new CameraDeviceCompat.StateCallbackExecutorWrapper(executor, stateCallback), ((CameraManagerCompatParamsApi21) this.f1972b).f1974b);
        } catch (CameraAccessException e) {
            throw new CameraAccessExceptionCompat(e);
        }
    }

    @Override // androidx.camera.camera2.internal.compat.CameraManagerCompat.CameraManagerCompatImpl
    /* JADX INFO: renamed from: f */
    public final String[] mo1101f() throws CameraAccessExceptionCompat {
        try {
            return this.f1971a.getCameraIdList();
        } catch (CameraAccessException e) {
            throw new CameraAccessExceptionCompat(e);
        }
    }
}
