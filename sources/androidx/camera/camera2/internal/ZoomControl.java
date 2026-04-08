package androidx.camera.camera2.internal;

import android.graphics.Rect;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.os.Looper;
import android.util.Range;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.camera2.internal.Camera2CameraControlImpl;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.core.Logger;
import androidx.camera.core.ZoomState;
import androidx.camera.core.internal.ImmutableZoomState;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.lifecycle.MutableLiveData;
import java.util.concurrent.Executor;
import p011a.AbstractC0025b;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
final class ZoomControl {

    /* JADX INFO: renamed from: a */
    public final Camera2CameraControlImpl f1912a;

    /* JADX INFO: renamed from: b */
    public final Executor f1913b;

    /* JADX INFO: renamed from: c */
    public final ZoomStateImpl f1914c;

    /* JADX INFO: renamed from: d */
    public final MutableLiveData f1915d;

    /* JADX INFO: renamed from: e */
    public final ZoomImpl f1916e;

    /* JADX INFO: renamed from: f */
    public boolean f1917f = false;

    /* JADX INFO: renamed from: g */
    public final Camera2CameraControlImpl.CaptureResultListener f1918g;

    /* JADX INFO: renamed from: androidx.camera.camera2.internal.ZoomControl$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C01851 implements Camera2CameraControlImpl.CaptureResultListener {
        public C01851() {
        }

        @Override // androidx.camera.camera2.internal.Camera2CameraControlImpl.CaptureResultListener
        /* JADX INFO: renamed from: a */
        public final boolean mo897a(TotalCaptureResult totalCaptureResult) {
            ZoomControl.this.f1916e.mo820a(totalCaptureResult);
            return false;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface ZoomImpl {
        /* JADX INFO: renamed from: a */
        void mo820a(TotalCaptureResult totalCaptureResult);

        /* JADX INFO: renamed from: b */
        void mo821b(Camera2ImplConfig.Builder builder);

        /* JADX INFO: renamed from: c */
        void mo822c(float f, CallbackToFutureAdapter.Completer completer);

        /* JADX INFO: renamed from: d */
        float mo823d();

        /* JADX INFO: renamed from: e */
        float mo824e();

        /* JADX INFO: renamed from: f */
        Rect mo825f();

        /* JADX INFO: renamed from: g */
        void mo826g();
    }

    public ZoomControl(Camera2CameraControlImpl camera2CameraControlImpl, CameraCharacteristicsCompat cameraCharacteristicsCompat, Executor executor) {
        C01851 c01851 = new C01851();
        this.f1918g = c01851;
        this.f1912a = camera2CameraControlImpl;
        this.f1913b = executor;
        ZoomImpl zoomImplM1070a = m1070a(cameraCharacteristicsCompat);
        this.f1916e = zoomImplM1070a;
        ZoomStateImpl zoomStateImpl = new ZoomStateImpl(zoomImplM1070a.mo823d(), zoomImplM1070a.mo824e());
        this.f1914c = zoomStateImpl;
        zoomStateImpl.m1076e(1.0f);
        this.f1915d = new MutableLiveData(ImmutableZoomState.m1650f(zoomStateImpl));
        camera2CameraControlImpl.m885k(c01851);
    }

    /* JADX INFO: renamed from: a */
    public static ZoomImpl m1070a(CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        Range range;
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                range = (Range) cameraCharacteristicsCompat.m1089a(AbstractC0025b.m114f());
            } catch (AssertionError e) {
                Logger.m1289j("ZoomControl", "AssertionError, fail to get camera characteristic.", e);
                range = null;
            }
            if (range != null) {
                return new AndroidRZoomImpl(cameraCharacteristicsCompat);
            }
        }
        return new CropRegionZoomImpl(cameraCharacteristicsCompat);
    }

    /* JADX INFO: renamed from: b */
    public final void m1071b(ZoomState zoomState) {
        Looper looperMyLooper = Looper.myLooper();
        Looper mainLooper = Looper.getMainLooper();
        MutableLiveData mutableLiveData = this.f1915d;
        if (looperMyLooper == mainLooper) {
            mutableLiveData.mo9147k(zoomState);
        } else {
            mutableLiveData.m9145i(zoomState);
        }
    }
}
