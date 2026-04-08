package androidx.camera.core.impl;

import android.graphics.Rect;
import androidx.annotation.RequiresApi;
import androidx.camera.core.CameraControl;
import androidx.camera.core.FocusMeteringAction;
import androidx.camera.core.FocusMeteringResult;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.utils.futures.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public interface CameraControlInternal extends CameraControl {

    /* JADX INFO: renamed from: a */
    public static final CameraControlInternal f2641a = new C02701();

    /* JADX INFO: compiled from: Proguard */
    public static final class CameraControlException extends Exception {
    }

    /* JADX INFO: compiled from: Proguard */
    public interface ControlUpdateCallback {
    }

    /* JADX INFO: renamed from: a */
    void mo875a(Config config);

    /* JADX INFO: renamed from: c */
    Rect mo877c();

    /* JADX INFO: renamed from: d */
    void mo878d(int i);

    /* JADX INFO: renamed from: e */
    void mo879e(SessionConfig.Builder builder);

    /* JADX INFO: renamed from: f */
    ListenableFuture mo880f(ArrayList arrayList, int i, int i2);

    /* JADX INFO: renamed from: h */
    Config mo882h();

    /* JADX INFO: renamed from: i */
    void mo883i();

    /* JADX INFO: renamed from: androidx.camera.core.impl.CameraControlInternal$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C02701 implements CameraControlInternal {
        @Override // androidx.camera.core.CameraControl
        /* JADX INFO: renamed from: b */
        public final ListenableFuture mo876b(float f) {
            return Futures.m1630g(null);
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        /* JADX INFO: renamed from: c */
        public final Rect mo877c() {
            return new Rect();
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        /* JADX INFO: renamed from: f */
        public final ListenableFuture mo880f(ArrayList arrayList, int i, int i2) {
            return Futures.m1630g(Collections.EMPTY_LIST);
        }

        @Override // androidx.camera.core.CameraControl
        /* JADX INFO: renamed from: g */
        public final ListenableFuture mo881g(boolean z2) {
            return Futures.m1630g(null);
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        /* JADX INFO: renamed from: h */
        public final Config mo882h() {
            return null;
        }

        @Override // androidx.camera.core.CameraControl
        /* JADX INFO: renamed from: j */
        public final ListenableFuture mo884j(FocusMeteringAction focusMeteringAction) {
            return Futures.m1630g(new FocusMeteringResult(false));
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        /* JADX INFO: renamed from: i */
        public final void mo883i() {
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        /* JADX INFO: renamed from: a */
        public final void mo875a(Config config) {
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        /* JADX INFO: renamed from: d */
        public final void mo878d(int i) {
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        /* JADX INFO: renamed from: e */
        public final void mo879e(SessionConfig.Builder builder) {
        }
    }
}
