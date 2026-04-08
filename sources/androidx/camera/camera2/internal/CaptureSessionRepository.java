package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraDevice;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
class CaptureSessionRepository {

    /* JADX INFO: renamed from: a */
    public final Executor f1754a;

    /* JADX INFO: renamed from: b */
    public final Object f1755b = new Object();

    /* JADX INFO: renamed from: c */
    public final LinkedHashSet f1756c = new LinkedHashSet();

    /* JADX INFO: renamed from: d */
    public final LinkedHashSet f1757d = new LinkedHashSet();

    /* JADX INFO: renamed from: e */
    public final LinkedHashSet f1758e = new LinkedHashSet();

    /* JADX INFO: renamed from: f */
    public final CameraDevice.StateCallback f1759f = new C01691();

    public CaptureSessionRepository(Executor executor) {
        this.f1754a = executor;
    }

    /* JADX INFO: renamed from: a */
    public final ArrayList m1009a() {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        synchronized (this.f1755b) {
            arrayList = new ArrayList();
            synchronized (this.f1755b) {
                arrayList2 = new ArrayList(this.f1756c);
            }
            arrayList.addAll(arrayList2);
            synchronized (this.f1755b) {
                arrayList3 = new ArrayList(this.f1758e);
            }
            arrayList.addAll(arrayList3);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: androidx.camera.camera2.internal.CaptureSessionRepository$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C01691 extends CameraDevice.StateCallback {

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int f1760b = 0;

        public C01691() {
        }

        /* JADX INFO: renamed from: a */
        public final void m1010a() {
            ArrayList arrayListM1009a;
            synchronized (CaptureSessionRepository.this.f1755b) {
                arrayListM1009a = CaptureSessionRepository.this.m1009a();
                CaptureSessionRepository.this.f1758e.clear();
                CaptureSessionRepository.this.f1756c.clear();
                CaptureSessionRepository.this.f1757d.clear();
            }
            Iterator it = arrayListM1009a.iterator();
            while (it.hasNext()) {
                ((SynchronizedCaptureSession) it.next()).mo1049e();
            }
        }

        /* JADX INFO: renamed from: b */
        public final void m1011b() {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            synchronized (CaptureSessionRepository.this.f1755b) {
                linkedHashSet.addAll(CaptureSessionRepository.this.f1758e);
                linkedHashSet.addAll(CaptureSessionRepository.this.f1756c);
            }
            CaptureSessionRepository.this.f1754a.execute(new RunnableC0211l(linkedHashSet, 2));
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onClosed(CameraDevice cameraDevice) {
            m1010a();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onDisconnected(CameraDevice cameraDevice) {
            m1011b();
            m1010a();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onError(CameraDevice cameraDevice, int i) {
            m1011b();
            m1010a();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onOpened(CameraDevice cameraDevice) {
        }
    }
}
