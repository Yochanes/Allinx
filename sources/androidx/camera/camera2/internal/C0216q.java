package androidx.camera.camera2.internal;

import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.camera2.internal.Camera2CapturePipeline;
import androidx.camera.core.internal.utils.RingBuffer;

/* JADX INFO: renamed from: androidx.camera.camera2.internal.q */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0216q implements Camera2CapturePipeline.ResultListener.Checker, RingBuffer.OnRemoveCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2141a;

    public /* synthetic */ C0216q(int i) {
        this.f2141a = i;
    }

    @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.ResultListener.Checker
    /* JADX INFO: renamed from: a */
    public boolean mo969a(TotalCaptureResult totalCaptureResult) {
        switch (this.f2141a) {
            case 0:
                int i = Camera2CapturePipeline.Pipeline.f1676k;
                return Camera2CapturePipeline.m964a(totalCaptureResult, false);
            default:
                int i2 = Camera2CapturePipeline.TorchTask.f1693f;
                return Camera2CapturePipeline.m964a(totalCaptureResult, true);
        }
    }
}
