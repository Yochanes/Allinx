package androidx.camera.core;

import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: androidx.camera.core.i */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0250i implements CallbackToFutureAdapter.Resolver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ImageAnalysisAbstractAnalyzer f2427a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Executor f2428b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ImageProxy f2429c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Matrix f2430d;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ImageProxy f2431f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Rect f2432g;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C0249h f2433i;

    public /* synthetic */ C0250i(ImageAnalysisAbstractAnalyzer imageAnalysisAbstractAnalyzer, Executor executor, ImageProxy imageProxy, Matrix matrix, ImageProxy imageProxy2, Rect rect, C0249h c0249h) {
        this.f2427a = imageAnalysisAbstractAnalyzer;
        this.f2428b = executor;
        this.f2429c = imageProxy;
        this.f2430d = matrix;
        this.f2431f = imageProxy2;
        this.f2432g = rect;
        this.f2433i = c0249h;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    /* JADX INFO: renamed from: d */
    public final Object mo188d(CallbackToFutureAdapter.Completer completer) {
        this.f2428b.execute(new RunnableC0307j(this.f2427a, this.f2429c, this.f2430d, this.f2431f, this.f2432g, this.f2433i, completer));
        return "analyzeImage";
    }
}
