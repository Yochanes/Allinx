package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CameraCaptureFailure;
import androidx.camera.core.impl.TagBundle;
import androidx.core.util.Preconditions;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
final class CaptureCallbackAdapter extends CameraCaptureSession.CaptureCallback {

    /* JADX INFO: renamed from: a */
    public final CameraCaptureCallback f1721a;

    public CaptureCallbackAdapter(CameraCaptureCallback cameraCaptureCallback) {
        if (cameraCaptureCallback == null) {
            throw new NullPointerException("cameraCaptureCallback is null");
        }
        this.f1721a = cameraCaptureCallback;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        TagBundle tagBundle;
        super.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
        Object tag = captureRequest.getTag();
        if (tag != null) {
            Preconditions.m7695b(tag instanceof TagBundle, "The tagBundle object from the CaptureResult is not a TagBundle object.");
            tagBundle = (TagBundle) tag;
        } else {
            tagBundle = TagBundle.f2798b;
        }
        this.f1721a.mo895b(new Camera2CameraCaptureResult(tagBundle, totalCaptureResult));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
        this.f1721a.mo896c(new CameraCaptureFailure());
    }
}
