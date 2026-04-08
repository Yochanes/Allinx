package androidx.camera.core.impl;

import android.graphics.Rect;
import androidx.annotation.RequiresApi;
import androidx.camera.core.FocusMeteringAction;
import androidx.camera.core.impl.SessionConfig;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public class ForwardingCameraControl implements CameraControlInternal {

    /* JADX INFO: renamed from: b */
    public final CameraControlInternal f2711b;

    public ForwardingCameraControl(CameraControlInternal cameraControlInternal) {
        this.f2711b = cameraControlInternal;
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    /* JADX INFO: renamed from: a */
    public final void mo875a(Config config) {
        this.f2711b.mo875a(config);
    }

    @Override // androidx.camera.core.CameraControl
    /* JADX INFO: renamed from: b */
    public ListenableFuture mo876b(float f) {
        return this.f2711b.mo876b(f);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    /* JADX INFO: renamed from: c */
    public final Rect mo877c() {
        return this.f2711b.mo877c();
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    /* JADX INFO: renamed from: d */
    public final void mo878d(int i) {
        this.f2711b.mo878d(i);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    /* JADX INFO: renamed from: e */
    public final void mo879e(SessionConfig.Builder builder) {
        this.f2711b.mo879e(builder);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    /* JADX INFO: renamed from: f */
    public ListenableFuture mo880f(ArrayList arrayList, int i, int i2) {
        return this.f2711b.mo880f(arrayList, i, i2);
    }

    @Override // androidx.camera.core.CameraControl
    /* JADX INFO: renamed from: g */
    public ListenableFuture mo881g(boolean z2) {
        return this.f2711b.mo881g(z2);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    /* JADX INFO: renamed from: h */
    public final Config mo882h() {
        return this.f2711b.mo882h();
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    /* JADX INFO: renamed from: i */
    public final void mo883i() {
        this.f2711b.mo883i();
    }

    @Override // androidx.camera.core.CameraControl
    /* JADX INFO: renamed from: j */
    public ListenableFuture mo884j(FocusMeteringAction focusMeteringAction) {
        return this.f2711b.mo884j(focusMeteringAction);
    }
}
