package androidx.camera.camera2.internal;

import java.util.Objects;

/* JADX INFO: renamed from: androidx.camera.camera2.internal.D */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0170D implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1766a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ SynchronizedCaptureSessionBaseImpl f1767b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ SynchronizedCaptureSession f1768c;

    public /* synthetic */ RunnableC0170D(SynchronizedCaptureSessionBaseImpl synchronizedCaptureSessionBaseImpl, SynchronizedCaptureSession synchronizedCaptureSession, int i) {
        this.f1766a = i;
        this.f1767b = synchronizedCaptureSessionBaseImpl;
        this.f1768c = synchronizedCaptureSession;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1766a) {
            case 0:
                SynchronizedCaptureSessionBaseImpl synchronizedCaptureSessionBaseImpl = this.f1767b;
                SynchronizedCaptureSession synchronizedCaptureSession = this.f1768c;
                CaptureSessionRepository captureSessionRepository = synchronizedCaptureSessionBaseImpl.f1873b;
                synchronized (captureSessionRepository.f1755b) {
                    captureSessionRepository.f1756c.remove(synchronizedCaptureSessionBaseImpl);
                    captureSessionRepository.f1757d.remove(synchronizedCaptureSessionBaseImpl);
                    break;
                }
                synchronizedCaptureSessionBaseImpl.mo1008r(synchronizedCaptureSession);
                Objects.requireNonNull(synchronizedCaptureSessionBaseImpl.f1877f);
                synchronizedCaptureSessionBaseImpl.f1877f.mo1057n(synchronizedCaptureSession);
                return;
            default:
                SynchronizedCaptureSessionBaseImpl synchronizedCaptureSessionBaseImpl2 = this.f1767b;
                Objects.requireNonNull(synchronizedCaptureSessionBaseImpl2.f1877f);
                synchronizedCaptureSessionBaseImpl2.f1877f.mo1008r(this.f1768c);
                return;
        }
    }
}
