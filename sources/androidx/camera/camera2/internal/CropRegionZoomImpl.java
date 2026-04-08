package androidx.camera.camera2.internal;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.camera2.internal.ZoomControl;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.core.CameraControl;
import androidx.concurrent.futures.CallbackToFutureAdapter;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
final class CropRegionZoomImpl implements ZoomControl.ZoomImpl {

    /* JADX INFO: renamed from: a */
    public final CameraCharacteristicsCompat f1762a;

    /* JADX INFO: renamed from: c */
    public CallbackToFutureAdapter.Completer f1764c;

    /* JADX INFO: renamed from: b */
    public Rect f1763b = null;

    /* JADX INFO: renamed from: d */
    public Rect f1765d = null;

    public CropRegionZoomImpl(CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        this.f1762a = cameraCharacteristicsCompat;
    }

    @Override // androidx.camera.camera2.internal.ZoomControl.ZoomImpl
    /* JADX INFO: renamed from: a */
    public final void mo820a(TotalCaptureResult totalCaptureResult) {
        if (this.f1764c != null) {
            CaptureRequest request = totalCaptureResult.getRequest();
            Rect rect = request == null ? null : (Rect) request.get(CaptureRequest.SCALER_CROP_REGION);
            Rect rect2 = this.f1765d;
            if (rect2 == null || !rect2.equals(rect)) {
                return;
            }
            this.f1764c.m6742b(null);
            this.f1764c = null;
            this.f1765d = null;
        }
    }

    @Override // androidx.camera.camera2.internal.ZoomControl.ZoomImpl
    /* JADX INFO: renamed from: b */
    public final void mo821b(Camera2ImplConfig.Builder builder) {
        Rect rect = this.f1763b;
        if (rect != null) {
            builder.m816d(CaptureRequest.SCALER_CROP_REGION, rect);
        }
    }

    @Override // androidx.camera.camera2.internal.ZoomControl.ZoomImpl
    /* JADX INFO: renamed from: c */
    public final void mo822c(float f, CallbackToFutureAdapter.Completer completer) {
        ((Rect) this.f1762a.m1089a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE)).getClass();
        float fWidth = r0.width() / f;
        float fHeight = r0.height() / f;
        float fWidth2 = (r0.width() - fWidth) / 2.0f;
        float fHeight2 = (r0.height() - fHeight) / 2.0f;
        this.f1763b = new Rect((int) fWidth2, (int) fHeight2, (int) (fWidth2 + fWidth), (int) (fHeight2 + fHeight));
        CallbackToFutureAdapter.Completer completer2 = this.f1764c;
        if (completer2 != null) {
            completer2.m6744d(new CameraControl.OperationCanceledException("There is a new zoomRatio being set"));
        }
        this.f1765d = this.f1763b;
        this.f1764c = completer;
    }

    @Override // androidx.camera.camera2.internal.ZoomControl.ZoomImpl
    /* JADX INFO: renamed from: d */
    public final float mo823d() {
        Float f = (Float) this.f1762a.m1089a(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
        if (f != null && f.floatValue() >= 1.0f) {
            return f.floatValue();
        }
        return 1.0f;
    }

    @Override // androidx.camera.camera2.internal.ZoomControl.ZoomImpl
    /* JADX INFO: renamed from: e */
    public final float mo824e() {
        return 1.0f;
    }

    @Override // androidx.camera.camera2.internal.ZoomControl.ZoomImpl
    /* JADX INFO: renamed from: f */
    public final Rect mo825f() {
        Rect rect = this.f1763b;
        if (rect != null) {
            return rect;
        }
        Rect rect2 = (Rect) this.f1762a.m1089a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        rect2.getClass();
        return rect2;
    }

    @Override // androidx.camera.camera2.internal.ZoomControl.ZoomImpl
    /* JADX INFO: renamed from: g */
    public final void mo826g() {
        this.f1765d = null;
        this.f1763b = null;
        CallbackToFutureAdapter.Completer completer = this.f1764c;
        if (completer != null) {
            completer.m6744d(new CameraControl.OperationCanceledException("Camera is not active."));
            this.f1764c = null;
        }
    }
}
