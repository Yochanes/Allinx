package androidx.camera.camera2.internal;

import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.camera2.internal.compat.workaround.FlashAvailabilityChecker;
import androidx.camera.core.CameraControl;
import androidx.camera.core.impl.utils.Threads;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.lifecycle.MutableLiveData;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
final class TorchControl {

    /* JADX INFO: renamed from: a */
    public final Camera2CameraControlImpl f1905a;

    /* JADX INFO: renamed from: b */
    public final MutableLiveData f1906b = new MutableLiveData(0);

    /* JADX INFO: renamed from: c */
    public final boolean f1907c;

    /* JADX INFO: renamed from: d */
    public final Executor f1908d;

    /* JADX INFO: renamed from: e */
    public boolean f1909e;

    /* JADX INFO: renamed from: f */
    public CallbackToFutureAdapter.Completer f1910f;

    /* JADX INFO: renamed from: g */
    public boolean f1911g;

    public TorchControl(Camera2CameraControlImpl camera2CameraControlImpl, CameraCharacteristicsCompat cameraCharacteristicsCompat, Executor executor) {
        this.f1905a = camera2CameraControlImpl;
        this.f1908d = executor;
        this.f1907c = FlashAvailabilityChecker.m1158a(new C0213n(cameraCharacteristicsCompat, 7));
        camera2CameraControlImpl.m885k(new C0176H(this));
    }

    /* JADX INFO: renamed from: b */
    public static void m1068b(MutableLiveData mutableLiveData, Integer num) {
        if (Threads.m1608b()) {
            mutableLiveData.mo9147k(num);
        } else {
            mutableLiveData.m9145i(num);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m1069a(CallbackToFutureAdapter.Completer completer, boolean z2) {
        if (!this.f1907c) {
            if (completer != null) {
                completer.m6744d(new IllegalStateException("No flash unit"));
                return;
            }
            return;
        }
        boolean z3 = this.f1909e;
        MutableLiveData mutableLiveData = this.f1906b;
        if (!z3) {
            m1068b(mutableLiveData, 0);
            if (completer != null) {
                completer.m6744d(new CameraControl.OperationCanceledException("Camera is not active."));
                return;
            }
            return;
        }
        this.f1911g = z2;
        this.f1905a.m887m(z2);
        m1068b(mutableLiveData, Integer.valueOf(z2 ? 1 : 0));
        CallbackToFutureAdapter.Completer completer2 = this.f1910f;
        if (completer2 != null) {
            completer2.m6744d(new CameraControl.OperationCanceledException("There is a new enableTorch being set"));
        }
        this.f1910f = completer;
    }
}
