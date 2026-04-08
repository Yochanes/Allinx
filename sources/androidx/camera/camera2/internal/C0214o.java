package androidx.camera.camera2.internal;

import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.camera2.internal.Camera2CapturePipeline;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: renamed from: androidx.camera.camera2.internal.o */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0214o implements AsyncFunction {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Camera2CapturePipeline.Pipeline f2136a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f2137b;

    public /* synthetic */ C0214o(Camera2CapturePipeline.Pipeline pipeline, int i) {
        this.f2136a = pipeline;
        this.f2137b = i;
    }

    @Override // androidx.camera.core.impl.utils.futures.AsyncFunction, com.google.android.datatransport.Transformer
    public final ListenableFuture apply(Object obj) {
        TotalCaptureResult totalCaptureResult = (TotalCaptureResult) obj;
        int i = Camera2CapturePipeline.Pipeline.f1676k;
        Camera2CapturePipeline.Pipeline pipeline = this.f2136a;
        if (Camera2CapturePipeline.m965b(totalCaptureResult, this.f2137b)) {
            pipeline.f1682f = Camera2CapturePipeline.Pipeline.f1675j;
        }
        return pipeline.f1684h.mo966a(totalCaptureResult);
    }
}
