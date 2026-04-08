package androidx.camera.camera2.internal;

import androidx.camera.camera2.internal.Camera2CameraImpl;
import androidx.camera.camera2.internal.Camera2CapturePipeline;
import androidx.camera.camera2.internal.CaptureSessionRepository;
import androidx.camera.core.Logger;
import androidx.camera.core.SafeCloseImageReaderProxy;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.SessionConfig;
import androidx.core.util.Preconditions;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: androidx.camera.camera2.internal.l */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0211l implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2131a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f2132b;

    public /* synthetic */ RunnableC0211l(SessionConfig.ErrorListener errorListener, SessionConfig sessionConfig) {
        this.f2131a = 7;
        this.f2132b = errorListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2131a) {
            case 0:
                Camera2CameraImpl.StateCallback.ScheduledReopen scheduledReopen = (Camera2CameraImpl.StateCallback.ScheduledReopen) this.f2132b;
                if (scheduledReopen.f1639b) {
                    return;
                }
                Preconditions.m7699f(Camera2CameraImpl.this.f1594f == Camera2CameraImpl.InternalState.f1626i, null);
                if (Camera2CameraImpl.StateCallback.this.m941c()) {
                    Camera2CameraImpl.this.m914I(true);
                    return;
                } else {
                    Camera2CameraImpl.this.m915J(true);
                    return;
                }
            case 1:
                ((Camera2CapturePipeline.Pipeline.C01611) this.f2132b).mo968c();
                return;
            case 2:
                int i = CaptureSessionRepository.C01691.f1760b;
                for (SynchronizedCaptureSession synchronizedCaptureSession : (LinkedHashSet) this.f2132b) {
                    synchronizedCaptureSession.mo1047b().mo1057n(synchronizedCaptureSession);
                }
                return;
            case 3:
                int i2 = ProcessingCaptureSession.f1825n;
                StringBuilder sb = new StringBuilder("== deInitSession (id=");
                ProcessingCaptureSession processingCaptureSession = (ProcessingCaptureSession) this.f2132b;
                sb.append(processingCaptureSession.f1838m);
                sb.append(")");
                Logger.m1280a("ProcessingCaptureSession", sb.toString());
                processingCaptureSession.f1826a.mo1545e();
                throw null;
            case 4:
                SynchronizedCaptureSessionBaseImpl synchronizedCaptureSessionBaseImpl = (SynchronizedCaptureSessionBaseImpl) this.f2132b;
                synchronizedCaptureSessionBaseImpl.mo1008r(synchronizedCaptureSessionBaseImpl);
                return;
            case 5:
                SynchronizedCaptureSessionImpl.m1064v((SynchronizedCaptureSessionImpl) this.f2132b);
                return;
            case 6:
                ((CameraCaptureCallback) this.f2132b).mo894a();
                return;
            case 7:
                ((SessionConfig.ErrorListener) this.f2132b).mo1170a();
                return;
            default:
                ((SafeCloseImageReaderProxy) this.f2132b).m1301c();
                return;
        }
    }

    public /* synthetic */ RunnableC0211l(Object obj, int i) {
        this.f2131a = i;
        this.f2132b = obj;
    }
}
