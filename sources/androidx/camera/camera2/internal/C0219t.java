package androidx.camera.camera2.internal;

import androidx.camera.camera2.internal.CameraBurstCaptureCallback;
import androidx.camera.camera2.internal.CaptureSession;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Preconditions;

/* JADX INFO: renamed from: androidx.camera.camera2.internal.t */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0219t implements CameraBurstCaptureCallback.CaptureSequenceCallback, CallbackToFutureAdapter.Resolver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ CaptureSession f2144a;

    public /* synthetic */ C0219t(CaptureSession captureSession) {
        this.f2144a = captureSession;
    }

    /* JADX INFO: renamed from: a */
    public void m1169a() {
        CaptureSession captureSession = this.f2144a;
        synchronized (captureSession.f1723a) {
            try {
                if (captureSession.f1734l == CaptureSession.State.f1748f) {
                    captureSession.m1003l(captureSession.f1729g);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    /* JADX INFO: renamed from: d */
    public Object mo188d(CallbackToFutureAdapter.Completer completer) {
        String str;
        CaptureSession captureSession = this.f2144a;
        synchronized (captureSession.f1723a) {
            Preconditions.m7699f(captureSession.f1736n == null, "Release completer expected to be null");
            captureSession.f1736n = completer;
            str = "Release[session=" + captureSession + "]";
        }
        return str;
    }
}
