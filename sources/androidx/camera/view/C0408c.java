package androidx.camera.view;

import android.util.Size;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.Logger;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureChain;
import androidx.camera.view.PreviewStreamStateObserver;
import androidx.camera.view.PreviewView;
import androidx.camera.view.PreviewViewImplementation;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: androidx.camera.view.c */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0408c implements CallbackToFutureAdapter.Resolver, SurfaceRequest.TransformationInfoListener, PreviewViewImplementation.OnSurfaceNotInUseListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f3582a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f3583b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f3584c;

    public /* synthetic */ C0408c(PreviewView.C04021 c04021, PreviewStreamStateObserver previewStreamStateObserver, CameraInternal cameraInternal) {
        this.f3583b = c04021;
        this.f3582a = previewStreamStateObserver;
        this.f3584c = cameraInternal;
    }

    @Override // androidx.camera.core.SurfaceRequest.TransformationInfoListener
    /* JADX INFO: renamed from: a */
    public void mo1312a(SurfaceRequest.TransformationInfo transformationInfo) {
        PreviewViewImplementation previewViewImplementation;
        PreviewView.C04021 c04021 = (PreviewView.C04021) this.f3582a;
        c04021.getClass();
        Logger.m1280a("PreviewView", "Preview transformation info updated. " + transformationInfo);
        boolean z2 = ((CameraInternal) this.f3583b).mo930q().mo949h() == 0;
        PreviewView previewView = PreviewView.this;
        Size size = ((SurfaceRequest) this.f3584c).f2364b;
        PreviewTransformation previewTransformation = previewView.f3521c;
        previewTransformation.getClass();
        Logger.m1280a("PreviewTransform", "Transformation info set: " + transformationInfo + " " + size + " " + z2);
        previewTransformation.f3510b = transformationInfo.mo1206a();
        previewTransformation.f3511c = transformationInfo.mo1208c();
        previewTransformation.f3513e = transformationInfo.mo1210e();
        previewTransformation.f3509a = size;
        previewTransformation.f3514f = z2;
        previewTransformation.f3515g = transformationInfo.mo1211f();
        previewTransformation.f3512d = transformationInfo.mo1209d();
        if (transformationInfo.mo1210e() == -1 || ((previewViewImplementation = previewView.f3520b) != null && (previewViewImplementation instanceof SurfaceViewImplementation))) {
            previewView.f3522d = true;
        } else {
            previewView.f3522d = false;
        }
        previewView.m1937b();
    }

    /* JADX INFO: renamed from: b */
    public void m1949b() {
        PreviewStreamStateObserver previewStreamStateObserver;
        AtomicReference atomicReference = PreviewView.this.f3524g;
        while (true) {
            previewStreamStateObserver = (PreviewStreamStateObserver) this.f3582a;
            if (atomicReference.compareAndSet(previewStreamStateObserver, null)) {
                previewStreamStateObserver.m1928b(PreviewView.StreamState.f3547a);
                break;
            } else if (atomicReference.get() != previewStreamStateObserver) {
                break;
            }
        }
        FutureChain futureChain = previewStreamStateObserver.f3502e;
        if (futureChain != null) {
            futureChain.cancel(false);
            previewStreamStateObserver.f3502e = null;
        }
        ((CameraInternal) this.f3584c).mo921g().mo1474a(previewStreamStateObserver);
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    /* JADX INFO: renamed from: d */
    public Object mo188d(CallbackToFutureAdapter.Completer completer) {
        ((PreviewStreamStateObserver) this.f3582a).getClass();
        CameraInfo cameraInfo = (CameraInfo) this.f3583b;
        PreviewStreamStateObserver.C04002 c04002 = new PreviewStreamStateObserver.C04002(completer, cameraInfo);
        ((ArrayList) this.f3584c).add(c04002);
        ((CameraInfoInternal) cameraInfo).mo948g(CameraXExecutors.m1615a(), c04002);
        return "waitForCaptureResult";
    }

    public /* synthetic */ C0408c(Object obj, Object obj2, Object obj3) {
        this.f3582a = obj;
        this.f3583b = obj2;
        this.f3584c = obj3;
    }
}
