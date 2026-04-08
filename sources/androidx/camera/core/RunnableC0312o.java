package androidx.camera.core;

import android.util.Range;
import androidx.camera.core.SurfaceRequest;

/* JADX INFO: renamed from: androidx.camera.core.o */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0312o implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3033a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ SurfaceRequest.TransformationInfoListener f3034b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ SurfaceRequest.TransformationInfo f3035c;

    public /* synthetic */ RunnableC0312o(SurfaceRequest.TransformationInfoListener transformationInfoListener, SurfaceRequest.TransformationInfo transformationInfo, int i) {
        this.f3033a = i;
        this.f3034b = transformationInfoListener;
        this.f3035c = transformationInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SurfaceRequest.TransformationInfo transformationInfo = this.f3035c;
        SurfaceRequest.TransformationInfoListener transformationInfoListener = this.f3034b;
        switch (this.f3033a) {
            case 0:
                Range range = SurfaceRequest.f2362m;
                transformationInfoListener.mo1312a(transformationInfo);
                break;
            default:
                Range range2 = SurfaceRequest.f2362m;
                transformationInfoListener.mo1312a(transformationInfo);
                break;
        }
    }
}
