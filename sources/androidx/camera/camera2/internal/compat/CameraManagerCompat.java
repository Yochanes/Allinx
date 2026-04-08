package androidx.camera.camera2.internal.compat;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Handler;
import android.util.ArrayMap;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.compat.CameraManagerCompatBaseImpl;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public final class CameraManagerCompat {

    /* JADX INFO: renamed from: a */
    public final CameraManagerCompatImpl f1965a;

    /* JADX INFO: renamed from: b */
    public final ArrayMap f1966b = new ArrayMap(4);

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static final class AvailabilityCallbackExecutorWrapper extends CameraManager.AvailabilityCallback {

        /* JADX INFO: renamed from: a */
        public final Executor f1967a;

        /* JADX INFO: renamed from: b */
        public final CameraManager.AvailabilityCallback f1968b;

        /* JADX INFO: renamed from: c */
        public final Object f1969c = new Object();

        /* JADX INFO: renamed from: d */
        public boolean f1970d = false;

        public AvailabilityCallbackExecutorWrapper(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
            this.f1967a = executor;
            this.f1968b = availabilityCallback;
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public final void onCameraAccessPrioritiesChanged() {
            synchronized (this.f1969c) {
                try {
                    if (!this.f1970d) {
                        this.f1967a.execute(new RunnableC0199j(this));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public final void onCameraAvailable(String str) {
            synchronized (this.f1969c) {
                try {
                    if (!this.f1970d) {
                        this.f1967a.execute(new RunnableC0198i(this, str, 0));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public final void onCameraUnavailable(String str) {
            synchronized (this.f1969c) {
                try {
                    if (!this.f1970d) {
                        this.f1967a.execute(new RunnableC0198i(this, str, 1));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface CameraManagerCompatImpl {
        /* JADX INFO: renamed from: a */
        void mo1096a(Executor executor, CameraManager.AvailabilityCallback availabilityCallback);

        /* JADX INFO: renamed from: b */
        void mo1097b(CameraManager.AvailabilityCallback availabilityCallback);

        /* JADX INFO: renamed from: c */
        CameraCharacteristics mo1098c(String str);

        /* JADX INFO: renamed from: d */
        Set mo1099d();

        /* JADX INFO: renamed from: e */
        void mo1100e(String str, Executor executor, CameraDevice.StateCallback stateCallback);

        /* JADX INFO: renamed from: f */
        String[] mo1101f();
    }

    public CameraManagerCompat(CameraManagerCompatImpl cameraManagerCompatImpl) {
        this.f1965a = cameraManagerCompatImpl;
    }

    /* JADX INFO: renamed from: a */
    public static CameraManagerCompat m1094a(Context context, Handler handler) {
        int i = Build.VERSION.SDK_INT;
        return new CameraManagerCompat(i >= 30 ? new CameraManagerCompatApi30Impl(context, null) : i >= 29 ? new CameraManagerCompatApi29Impl(context, null) : i >= 28 ? new CameraManagerCompatApi28Impl(context, null) : new CameraManagerCompatBaseImpl(context, new CameraManagerCompatBaseImpl.CameraManagerCompatParamsApi21(handler)));
    }

    /* JADX INFO: renamed from: b */
    public final CameraCharacteristicsCompat m1095b(String str) {
        CameraCharacteristicsCompat cameraCharacteristicsCompat;
        synchronized (this.f1966b) {
            cameraCharacteristicsCompat = (CameraCharacteristicsCompat) this.f1966b.get(str);
            if (cameraCharacteristicsCompat == null) {
                try {
                    CameraCharacteristicsCompat cameraCharacteristicsCompat2 = new CameraCharacteristicsCompat(this.f1965a.mo1098c(str), str);
                    this.f1966b.put(str, cameraCharacteristicsCompat2);
                    cameraCharacteristicsCompat = cameraCharacteristicsCompat2;
                } catch (AssertionError e) {
                    throw new CameraAccessExceptionCompat(e.getMessage(), e);
                }
            }
        }
        return cameraCharacteristicsCompat;
    }
}
