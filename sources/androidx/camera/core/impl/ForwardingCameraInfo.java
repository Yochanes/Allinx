package androidx.camera.core.impl;

import androidx.annotation.RequiresApi;
import androidx.camera.core.FocusMeteringAction;
import androidx.lifecycle.LiveData;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public class ForwardingCameraInfo implements CameraInfoInternal {

    /* JADX INFO: renamed from: a */
    public final CameraInfoInternal f2712a;

    public ForwardingCameraInfo(CameraInfoInternal cameraInfoInternal) {
        this.f2712a = cameraInfoInternal;
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    /* JADX INFO: renamed from: a */
    public final Set mo943a() {
        return this.f2712a.mo943a();
    }

    @Override // androidx.camera.core.CameraInfo
    /* JADX INFO: renamed from: b */
    public final int mo944b() {
        return this.f2712a.mo944b();
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    /* JADX INFO: renamed from: c */
    public final String mo945c() {
        return this.f2712a.mo945c();
    }

    @Override // androidx.camera.core.CameraInfo
    /* JADX INFO: renamed from: d */
    public boolean mo946d(FocusMeteringAction focusMeteringAction) {
        return this.f2712a.mo946d(focusMeteringAction);
    }

    @Override // androidx.camera.core.CameraInfo
    /* JADX INFO: renamed from: e */
    public LiveData mo947e() {
        return this.f2712a.mo947e();
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    /* JADX INFO: renamed from: f */
    public CameraInfoInternal mo1443f() {
        return this.f2712a.mo1443f();
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    /* JADX INFO: renamed from: g */
    public final void mo948g(Executor executor, CameraCaptureCallback cameraCaptureCallback) {
        this.f2712a.mo948g(executor, cameraCaptureCallback);
    }

    @Override // androidx.camera.core.CameraInfo
    /* JADX INFO: renamed from: h */
    public final int mo949h() {
        return this.f2712a.mo949h();
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    /* JADX INFO: renamed from: i */
    public final Timebase mo950i() {
        return this.f2712a.mo950i();
    }

    @Override // androidx.camera.core.CameraInfo
    /* JADX INFO: renamed from: j */
    public final String mo951j() {
        return this.f2712a.mo951j();
    }

    @Override // androidx.camera.core.CameraInfo
    /* JADX INFO: renamed from: k */
    public final int mo952k(int i) {
        return this.f2712a.mo952k(i);
    }

    @Override // androidx.camera.core.CameraInfo
    /* JADX INFO: renamed from: l */
    public boolean mo953l() {
        return this.f2712a.mo953l();
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    /* JADX INFO: renamed from: m */
    public final EncoderProfilesProvider mo954m() {
        return this.f2712a.mo954m();
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    /* JADX INFO: renamed from: n */
    public final Quirks mo955n() {
        return this.f2712a.mo955n();
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    /* JADX INFO: renamed from: o */
    public final List mo956o(int i) {
        return this.f2712a.mo956o(i);
    }

    @Override // androidx.camera.core.CameraInfo
    /* JADX INFO: renamed from: p */
    public LiveData mo957p() {
        return this.f2712a.mo957p();
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    /* JADX INFO: renamed from: q */
    public final void mo958q(CameraCaptureCallback cameraCaptureCallback) {
        this.f2712a.mo958q(cameraCaptureCallback);
    }
}
