package androidx.camera.core.impl;

import androidx.annotation.RequiresApi;
import androidx.camera.core.FocusMeteringAction;
import androidx.camera.core.impl.utils.futures.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public class RestrictedCameraControl extends ForwardingCameraControl {

    /* JADX INFO: renamed from: c */
    public final CameraControlInternal f2756c;

    /* JADX INFO: renamed from: d */
    public volatile boolean f2757d;

    /* JADX INFO: renamed from: e */
    public volatile Set f2758e;

    /* JADX INFO: compiled from: Proguard */
    public @interface CameraOperation {
    }

    public RestrictedCameraControl(CameraControlInternal cameraControlInternal) {
        super(cameraControlInternal);
        this.f2757d = false;
        this.f2756c = cameraControlInternal;
    }

    @Override // androidx.camera.core.impl.ForwardingCameraControl, androidx.camera.core.CameraControl
    /* JADX INFO: renamed from: b */
    public final ListenableFuture mo876b(float f) {
        return !m1517l(0) ? Futures.m1628e(new IllegalStateException("Zoom is not supported")) : this.f2756c.mo876b(f);
    }

    @Override // androidx.camera.core.impl.ForwardingCameraControl, androidx.camera.core.CameraControl
    /* JADX INFO: renamed from: g */
    public final ListenableFuture mo881g(boolean z2) {
        return !m1517l(6) ? Futures.m1628e(new IllegalStateException("Torch is not supported")) : this.f2756c.mo881g(z2);
    }

    @Override // androidx.camera.core.impl.ForwardingCameraControl, androidx.camera.core.CameraControl
    /* JADX INFO: renamed from: j */
    public final ListenableFuture mo884j(FocusMeteringAction focusMeteringAction) {
        FocusMeteringAction focusMeteringActionM1516k = m1516k(focusMeteringAction);
        return focusMeteringActionM1516k == null ? Futures.m1628e(new IllegalStateException("FocusMetering is not supported")) : this.f2756c.mo884j(focusMeteringActionM1516k);
    }

    /* JADX INFO: renamed from: k */
    public final FocusMeteringAction m1516k(FocusMeteringAction focusMeteringAction) {
        boolean z2;
        FocusMeteringAction.Builder builder = new FocusMeteringAction.Builder(focusMeteringAction);
        boolean z3 = true;
        if (focusMeteringAction.f2255a.isEmpty() || m1517l(1, 2)) {
            z2 = false;
        } else {
            builder.m1232a(1);
            z2 = true;
        }
        if (!focusMeteringAction.f2256b.isEmpty() && !m1517l(3)) {
            builder.m1232a(2);
            z2 = true;
        }
        if (focusMeteringAction.f2257c.isEmpty() || m1517l(4)) {
            z3 = z2;
        } else {
            builder.m1232a(4);
        }
        if (!z3) {
            return focusMeteringAction;
        }
        FocusMeteringAction focusMeteringAction2 = new FocusMeteringAction(builder);
        if (focusMeteringAction2.f2255a.isEmpty() && focusMeteringAction2.f2256b.isEmpty() && focusMeteringAction2.f2257c.isEmpty()) {
            return null;
        }
        return new FocusMeteringAction(builder);
    }

    /* JADX INFO: renamed from: l */
    public final boolean m1517l(int... iArr) {
        if (!this.f2757d || this.f2758e == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i : iArr) {
            arrayList.add(Integer.valueOf(i));
        }
        return this.f2758e.containsAll(arrayList);
    }
}
