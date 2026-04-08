package androidx.camera.camera2.internal;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Range;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.camera2.internal.ZoomControl;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.core.CameraControl;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import p011a.AbstractC0025b;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
final class AndroidRZoomImpl implements ZoomControl.ZoomImpl {

    /* JADX INFO: renamed from: a */
    public final CameraCharacteristicsCompat f1531a;

    /* JADX INFO: renamed from: b */
    public final Range f1532b;

    /* JADX INFO: renamed from: d */
    public CallbackToFutureAdapter.Completer f1534d;

    /* JADX INFO: renamed from: c */
    public float f1533c = 1.0f;

    /* JADX INFO: renamed from: e */
    public float f1535e = 1.0f;

    public AndroidRZoomImpl(CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        this.f1531a = cameraCharacteristicsCompat;
        this.f1532b = (Range) cameraCharacteristicsCompat.m1089a(AbstractC0025b.m114f());
    }

    @Override // androidx.camera.camera2.internal.ZoomControl.ZoomImpl
    /* JADX INFO: renamed from: a */
    public final void mo820a(TotalCaptureResult totalCaptureResult) {
        if (this.f1534d != null) {
            CaptureRequest request = totalCaptureResult.getRequest();
            Float f = request == null ? null : (Float) request.get(AbstractC0025b.m115g());
            if (f == null) {
                return;
            }
            if (this.f1535e == f.floatValue()) {
                this.f1534d.m6742b(null);
                this.f1534d = null;
            }
        }
    }

    @Override // androidx.camera.camera2.internal.ZoomControl.ZoomImpl
    /* JADX INFO: renamed from: b */
    public final void mo821b(Camera2ImplConfig.Builder builder) {
        builder.m816d(AbstractC0025b.m115g(), Float.valueOf(this.f1533c));
    }

    @Override // androidx.camera.camera2.internal.ZoomControl.ZoomImpl
    /* JADX INFO: renamed from: c */
    public final void mo822c(float f, CallbackToFutureAdapter.Completer completer) {
        this.f1533c = f;
        CallbackToFutureAdapter.Completer completer2 = this.f1534d;
        if (completer2 != null) {
            completer2.m6744d(new CameraControl.OperationCanceledException("There is a new zoomRatio being set"));
        }
        this.f1535e = this.f1533c;
        this.f1534d = completer;
    }

    @Override // androidx.camera.camera2.internal.ZoomControl.ZoomImpl
    /* JADX INFO: renamed from: d */
    public final float mo823d() {
        return ((Float) this.f1532b.getUpper()).floatValue();
    }

    @Override // androidx.camera.camera2.internal.ZoomControl.ZoomImpl
    /* JADX INFO: renamed from: e */
    public final float mo824e() {
        return ((Float) this.f1532b.getLower()).floatValue();
    }

    @Override // androidx.camera.camera2.internal.ZoomControl.ZoomImpl
    /* JADX INFO: renamed from: f */
    public final Rect mo825f() {
        Rect rect = (Rect) this.f1531a.m1089a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        rect.getClass();
        return rect;
    }

    @Override // androidx.camera.camera2.internal.ZoomControl.ZoomImpl
    /* JADX INFO: renamed from: g */
    public final void mo826g() {
        this.f1533c = 1.0f;
        CallbackToFutureAdapter.Completer completer = this.f1534d;
        if (completer != null) {
            completer.m6744d(new CameraControl.OperationCanceledException("Camera is not active."));
            this.f1534d = null;
        }
    }
}
