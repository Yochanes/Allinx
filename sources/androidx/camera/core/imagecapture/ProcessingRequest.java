package androidx.camera.core.imagecapture;

import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.annotation.RequiresApi;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.impl.CaptureBundle;
import androidx.camera.core.impl.CaptureStage;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
class ProcessingRequest {

    /* JADX INFO: renamed from: a */
    public final ImageCapture.OutputFileOptions f2485a;

    /* JADX INFO: renamed from: b */
    public final Rect f2486b;

    /* JADX INFO: renamed from: c */
    public final int f2487c;

    /* JADX INFO: renamed from: d */
    public final int f2488d;

    /* JADX INFO: renamed from: e */
    public final Matrix f2489e;

    /* JADX INFO: renamed from: f */
    public final RequestWithCallback f2490f;

    /* JADX INFO: renamed from: g */
    public final String f2491g;

    /* JADX INFO: renamed from: h */
    public final ArrayList f2492h = new ArrayList();

    /* JADX INFO: renamed from: i */
    public final ListenableFuture f2493i;

    public ProcessingRequest(CaptureBundle captureBundle, ImageCapture.OutputFileOptions outputFileOptions, Rect rect, int i, int i2, Matrix matrix, RequestWithCallback requestWithCallback, ListenableFuture listenableFuture) {
        this.f2485a = outputFileOptions;
        this.f2488d = i2;
        this.f2487c = i;
        this.f2486b = rect;
        this.f2489e = matrix;
        this.f2490f = requestWithCallback;
        this.f2491g = String.valueOf(captureBundle.hashCode());
        List<CaptureStage> listMo1228a = captureBundle.mo1228a();
        Objects.requireNonNull(listMo1228a);
        for (CaptureStage captureStage : listMo1228a) {
            ArrayList arrayList = this.f2492h;
            captureStage.getClass();
            arrayList.add(0);
        }
        this.f2493i = listenableFuture;
    }
}
