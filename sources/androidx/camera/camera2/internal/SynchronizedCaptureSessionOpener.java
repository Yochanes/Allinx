package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraDevice;
import android.os.Handler;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat;
import androidx.camera.camera2.internal.compat.workaround.ForceCloseCaptureSession;
import androidx.camera.camera2.internal.compat.workaround.ForceCloseDeferrableSurface;
import androidx.camera.camera2.internal.compat.workaround.WaitForRepeatingRequestStart;
import androidx.camera.core.impl.Quirks;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
final class SynchronizedCaptureSessionOpener {

    /* JADX INFO: renamed from: a */
    public final SynchronizedCaptureSessionBaseImpl f1894a;

    /* JADX INFO: compiled from: Proguard */
    public static class Builder {

        /* JADX INFO: renamed from: a */
        public final Executor f1895a;

        /* JADX INFO: renamed from: b */
        public final ScheduledExecutorService f1896b;

        /* JADX INFO: renamed from: c */
        public final Handler f1897c;

        /* JADX INFO: renamed from: d */
        public final CaptureSessionRepository f1898d;

        /* JADX INFO: renamed from: e */
        public final Quirks f1899e;

        /* JADX INFO: renamed from: f */
        public final Quirks f1900f;

        /* JADX INFO: renamed from: g */
        public final boolean f1901g;

        public Builder(Handler handler, CaptureSessionRepository captureSessionRepository, Quirks quirks, Quirks quirks2, Executor executor, ScheduledExecutorService scheduledExecutorService) {
            this.f1895a = executor;
            this.f1896b = scheduledExecutorService;
            this.f1897c = handler;
            this.f1898d = captureSessionRepository;
            this.f1899e = quirks;
            this.f1900f = quirks2;
            ForceCloseDeferrableSurface forceCloseDeferrableSurface = new ForceCloseDeferrableSurface(quirks, quirks2);
            this.f1901g = forceCloseDeferrableSurface.f2077a || forceCloseDeferrableSurface.f2078b || forceCloseDeferrableSurface.f2079c || new WaitForRepeatingRequestStart(quirks).f2094a || new ForceCloseCaptureSession(quirks2).f2076a != null;
        }

        /* JADX INFO: renamed from: a */
        public final SynchronizedCaptureSessionOpener m1067a() {
            SynchronizedCaptureSessionBaseImpl synchronizedCaptureSessionBaseImpl;
            boolean z2 = this.f1901g;
            Executor executor = this.f1895a;
            CaptureSessionRepository captureSessionRepository = this.f1898d;
            ScheduledExecutorService scheduledExecutorService = this.f1896b;
            if (z2) {
                synchronizedCaptureSessionBaseImpl = new SynchronizedCaptureSessionImpl(this.f1897c, captureSessionRepository, this.f1899e, this.f1900f, executor, scheduledExecutorService);
            } else {
                synchronizedCaptureSessionBaseImpl = new SynchronizedCaptureSessionBaseImpl(captureSessionRepository, executor, scheduledExecutorService, this.f1897c);
            }
            return new SynchronizedCaptureSessionOpener(synchronizedCaptureSessionBaseImpl);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface OpenerImpl {
        /* JADX INFO: renamed from: d */
        ListenableFuture mo1059d(ArrayList arrayList);

        /* JADX INFO: renamed from: j */
        ListenableFuture mo1060j(CameraDevice cameraDevice, SessionConfigurationCompat sessionConfigurationCompat, List list);

        boolean stop();
    }

    public SynchronizedCaptureSessionOpener(SynchronizedCaptureSessionBaseImpl synchronizedCaptureSessionBaseImpl) {
        this.f1894a = synchronizedCaptureSessionBaseImpl;
    }
}
