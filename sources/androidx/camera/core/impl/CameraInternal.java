package androidx.camera.core.impl;

import androidx.annotation.RequiresApi;
import androidx.camera.core.Camera;
import androidx.camera.core.CameraControl;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.UseCase;
import java.util.ArrayList;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public interface CameraInternal extends Camera, UseCase.StateChangeCallback {

    /* JADX INFO: compiled from: Proguard */
    public enum State {
        PENDING_OPEN(false),
        OPENING(true),
        OPEN(true),
        CONFIGURED(true),
        CLOSING(true),
        CLOSED(false),
        RELEASING(true),
        RELEASED(false);


        /* JADX INFO: renamed from: a */
        public final boolean f2652a;

        State(boolean z2) {
            this.f2652a = z2;
        }
    }

    @Override // androidx.camera.core.Camera
    /* JADX INFO: renamed from: b */
    default CameraControl mo1212b() {
        return mo922h();
    }

    @Override // androidx.camera.core.Camera
    /* JADX INFO: renamed from: c */
    default CameraInfo mo1213c() {
        return mo930q();
    }

    /* JADX INFO: renamed from: d */
    default boolean m1444d() {
        return mo1213c().mo949h() == 0;
    }

    /* JADX INFO: renamed from: g */
    Observable mo921g();

    /* JADX INFO: renamed from: h */
    CameraControlInternal mo922h();

    /* JADX INFO: renamed from: k */
    default CameraConfig mo925k() {
        return CameraConfigs.f2639a;
    }

    /* JADX INFO: renamed from: m */
    void mo927m(ArrayList arrayList);

    /* JADX INFO: renamed from: o */
    void mo929o(ArrayList arrayList);

    /* JADX INFO: renamed from: p */
    default boolean mo1445p() {
        return true;
    }

    /* JADX INFO: renamed from: q */
    CameraInfoInternal mo930q();

    /* JADX INFO: renamed from: f */
    default void mo920f(CameraConfig cameraConfig) {
    }

    /* JADX INFO: renamed from: l */
    default void mo926l(boolean z2) {
    }
}
