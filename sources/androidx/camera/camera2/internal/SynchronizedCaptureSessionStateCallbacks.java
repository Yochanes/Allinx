package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.CameraCaptureSessionStateCallbacks;
import androidx.camera.camera2.internal.SynchronizedCaptureSession;
import androidx.camera.camera2.internal.compat.ApiCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
final class SynchronizedCaptureSessionStateCallbacks extends SynchronizedCaptureSession.StateCallback {

    /* JADX INFO: renamed from: a */
    public final ArrayList f1902a;

    public SynchronizedCaptureSessionStateCallbacks(List list) {
        ArrayList arrayList = new ArrayList();
        this.f1902a = arrayList;
        arrayList.addAll(list);
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    /* JADX INFO: renamed from: l */
    public final void mo1055l(SynchronizedCaptureSession synchronizedCaptureSession) {
        Iterator it = this.f1902a.iterator();
        while (it.hasNext()) {
            ((SynchronizedCaptureSession.StateCallback) it.next()).mo1055l(synchronizedCaptureSession);
        }
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    /* JADX INFO: renamed from: m */
    public final void mo1056m(SynchronizedCaptureSession synchronizedCaptureSession) {
        Iterator it = this.f1902a.iterator();
        while (it.hasNext()) {
            ((SynchronizedCaptureSession.StateCallback) it.next()).mo1056m(synchronizedCaptureSession);
        }
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    /* JADX INFO: renamed from: n */
    public final void mo1057n(SynchronizedCaptureSession synchronizedCaptureSession) {
        Iterator it = this.f1902a.iterator();
        while (it.hasNext()) {
            ((SynchronizedCaptureSession.StateCallback) it.next()).mo1057n(synchronizedCaptureSession);
        }
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    /* JADX INFO: renamed from: o */
    public final void mo1005o(SynchronizedCaptureSession synchronizedCaptureSession) {
        Iterator it = this.f1902a.iterator();
        while (it.hasNext()) {
            ((SynchronizedCaptureSession.StateCallback) it.next()).mo1005o(synchronizedCaptureSession);
        }
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    /* JADX INFO: renamed from: p */
    public final void mo1006p(SynchronizedCaptureSession synchronizedCaptureSession) {
        Iterator it = this.f1902a.iterator();
        while (it.hasNext()) {
            ((SynchronizedCaptureSession.StateCallback) it.next()).mo1006p(synchronizedCaptureSession);
        }
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    /* JADX INFO: renamed from: q */
    public final void mo1007q(SynchronizedCaptureSession synchronizedCaptureSession) {
        Iterator it = this.f1902a.iterator();
        while (it.hasNext()) {
            ((SynchronizedCaptureSession.StateCallback) it.next()).mo1007q(synchronizedCaptureSession);
        }
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    /* JADX INFO: renamed from: r */
    public final void mo1008r(SynchronizedCaptureSession synchronizedCaptureSession) {
        Iterator it = this.f1902a.iterator();
        while (it.hasNext()) {
            ((SynchronizedCaptureSession.StateCallback) it.next()).mo1008r(synchronizedCaptureSession);
        }
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    /* JADX INFO: renamed from: s */
    public final void mo1058s(SynchronizedCaptureSession synchronizedCaptureSession, Surface surface) {
        Iterator it = this.f1902a.iterator();
        while (it.hasNext()) {
            ((SynchronizedCaptureSession.StateCallback) it.next()).mo1058s(synchronizedCaptureSession, surface);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Adapter extends SynchronizedCaptureSession.StateCallback {

        /* JADX INFO: renamed from: a */
        public final CameraCaptureSession.StateCallback f1903a;

        public Adapter(List list) {
            this.f1903a = list.isEmpty() ? new CameraCaptureSessionStateCallbacks.NoOpSessionStateCallback() : list.size() == 1 ? (CameraCaptureSession.StateCallback) list.get(0) : new CameraCaptureSessionStateCallbacks.ComboSessionStateCallback(list);
        }

        @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
        /* JADX INFO: renamed from: l */
        public final void mo1055l(SynchronizedCaptureSession synchronizedCaptureSession) {
            this.f1903a.onActive(synchronizedCaptureSession.mo1050f().m1085c());
        }

        @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
        /* JADX INFO: renamed from: m */
        public final void mo1056m(SynchronizedCaptureSession synchronizedCaptureSession) {
            ApiCompat.Api26Impl.m1081b(this.f1903a, synchronizedCaptureSession.mo1050f().m1085c());
        }

        @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
        /* JADX INFO: renamed from: n */
        public final void mo1057n(SynchronizedCaptureSession synchronizedCaptureSession) {
            this.f1903a.onClosed(synchronizedCaptureSession.mo1050f().m1085c());
        }

        @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
        /* JADX INFO: renamed from: o */
        public final void mo1005o(SynchronizedCaptureSession synchronizedCaptureSession) {
            this.f1903a.onConfigureFailed(synchronizedCaptureSession.mo1050f().m1085c());
        }

        @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
        /* JADX INFO: renamed from: p */
        public final void mo1006p(SynchronizedCaptureSession synchronizedCaptureSession) {
            this.f1903a.onConfigured(synchronizedCaptureSession.mo1050f().m1085c());
        }

        @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
        /* JADX INFO: renamed from: q */
        public final void mo1007q(SynchronizedCaptureSession synchronizedCaptureSession) {
            this.f1903a.onReady(synchronizedCaptureSession.mo1050f().m1085c());
        }

        @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
        /* JADX INFO: renamed from: s */
        public final void mo1058s(SynchronizedCaptureSession synchronizedCaptureSession, Surface surface) {
            ApiCompat.Api23Impl.m1078a(this.f1903a, synchronizedCaptureSession.mo1050f().m1085c(), surface);
        }

        @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
        /* JADX INFO: renamed from: r */
        public final void mo1008r(SynchronizedCaptureSession synchronizedCaptureSession) {
        }
    }
}
