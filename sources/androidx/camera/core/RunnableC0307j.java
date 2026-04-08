package androidx.camera.core;

import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.os.OperationCanceledException;

/* JADX INFO: renamed from: androidx.camera.core.j */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0307j implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ImageAnalysisAbstractAnalyzer f3019a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ImageProxy f3020b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Matrix f3021c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ImageProxy f3022d;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Rect f3023f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C0249h f3024g;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ CallbackToFutureAdapter.Completer f3025i;

    public /* synthetic */ RunnableC0307j(ImageAnalysisAbstractAnalyzer imageAnalysisAbstractAnalyzer, ImageProxy imageProxy, Matrix matrix, ImageProxy imageProxy2, Rect rect, C0249h c0249h, CallbackToFutureAdapter.Completer completer) {
        this.f3019a = imageAnalysisAbstractAnalyzer;
        this.f3020b = imageProxy;
        this.f3021c = matrix;
        this.f3022d = imageProxy2;
        this.f3023f = rect;
        this.f3024g = c0249h;
        this.f3025i = completer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ImageAnalysisAbstractAnalyzer imageAnalysisAbstractAnalyzer = this.f3019a;
        ImageProxy imageProxy = this.f3020b;
        Matrix matrix = this.f3021c;
        ImageProxy imageProxy2 = this.f3022d;
        Rect rect = this.f3023f;
        C0249h c0249h = this.f3024g;
        CallbackToFutureAdapter.Completer completer = this.f3025i;
        if (!imageAnalysisAbstractAnalyzer.f2293x) {
            completer.m6744d(new OperationCanceledException("ImageAnalysis is detached"));
            return;
        }
        SettableImageProxy settableImageProxy = new SettableImageProxy(imageProxy2, null, new AutoValue_ImmutableImageInfo(imageProxy.mo1180s0().mo1195a(), imageProxy.mo1180s0().mo1196c(), imageAnalysisAbstractAnalyzer.f2279f ? 0 : imageAnalysisAbstractAnalyzer.f2276b, matrix));
        if (!rect.isEmpty()) {
            settableImageProxy.m1302b(rect);
        }
        c0249h.mo1247a(settableImageProxy);
        completer.m6742b(null);
    }
}
