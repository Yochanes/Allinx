package androidx.camera.core.imagecapture;

import android.util.Size;
import androidx.annotation.RequiresApi;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.ImageReaderProxyProvider;
import androidx.camera.core.Logger;
import androidx.camera.core.SafeCloseImageReaderProxy;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.ImmediateSurface;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.processing.Edge;
import androidx.camera.core.processing.Node;
import androidx.core.util.Preconditions;
import com.google.auto.value.AutoValue;
import java.util.HashSet;
import java.util.Objects;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
class CaptureNode implements Node<AbstractC0253In, Out> {

    /* JADX INFO: renamed from: a */
    public final HashSet f2457a = new HashSet();

    /* JADX INFO: renamed from: b */
    public ProcessingRequest f2458b = null;

    /* JADX INFO: renamed from: c */
    public SafeCloseImageReaderProxy f2459c;

    /* JADX INFO: renamed from: d */
    public AutoValue_CaptureNode_Out f2460d;

    /* JADX INFO: renamed from: e */
    public AutoValue_CaptureNode_In f2461e;

    /* JADX INFO: renamed from: androidx.camera.core.imagecapture.CaptureNode$1 */
    /* JADX INFO: compiled from: Proguard */
    class C02521 implements FutureCallback<Void> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ProcessingRequest f2462a;

        public C02521(ProcessingRequest processingRequest) {
            this.f2462a = processingRequest;
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public final void onFailure(Throwable th) {
            Threads.m1607a();
            CaptureNode captureNode = CaptureNode.this;
            if (this.f2462a == captureNode.f2458b) {
                captureNode.f2458b = null;
            }
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        }
    }

    /* JADX INFO: renamed from: androidx.camera.core.imagecapture.CaptureNode$In */
    /* JADX INFO: compiled from: Proguard */
    @AutoValue
    public static abstract class AbstractC0253In {

        /* JADX INFO: renamed from: a */
        public ImmediateSurface f2464a;

        /* JADX INFO: renamed from: androidx.camera.core.imagecapture.CaptureNode$In$1, reason: invalid class name */
        /* JADX INFO: compiled from: Proguard */
        public class AnonymousClass1 extends CameraCaptureCallback {
        }

        /* JADX INFO: renamed from: a */
        public abstract Edge mo1334a();

        /* JADX INFO: renamed from: b */
        public abstract ImageReaderProxyProvider mo1335b();

        /* JADX INFO: renamed from: c */
        public abstract int mo1336c();

        /* JADX INFO: renamed from: d */
        public abstract int mo1337d();

        /* JADX INFO: renamed from: e */
        public abstract Edge mo1338e();

        /* JADX INFO: renamed from: f */
        public abstract Size mo1339f();

        /* JADX INFO: renamed from: g */
        public abstract boolean mo1340g();
    }

    /* JADX INFO: compiled from: Proguard */
    @AutoValue
    public static abstract class Out {
        /* JADX INFO: renamed from: a */
        public abstract Edge mo1341a();

        /* JADX INFO: renamed from: b */
        public abstract int mo1342b();

        /* JADX INFO: renamed from: c */
        public abstract int mo1343c();

        /* JADX INFO: renamed from: d */
        public abstract Edge mo1344d();
    }

    /* JADX INFO: renamed from: a */
    public final int m1354a() {
        int iMo1188f;
        Threads.m1607a();
        Preconditions.m7699f(this.f2459c != null, "The ImageReader is not initialized.");
        SafeCloseImageReaderProxy safeCloseImageReaderProxy = this.f2459c;
        synchronized (safeCloseImageReaderProxy.f2350a) {
            iMo1188f = safeCloseImageReaderProxy.f2353d.mo1188f() - safeCloseImageReaderProxy.f2351b;
        }
        return iMo1188f;
    }

    /* JADX INFO: renamed from: b */
    public final void m1355b(ImageProxy imageProxy) {
        Threads.m1607a();
        if (this.f2458b == null) {
            Logger.m1280a("CaptureNode", "Discarding ImageProxy which was inadvertently acquired: " + imageProxy);
            imageProxy.close();
            return;
        }
        Object obj = imageProxy.mo1180s0().mo1195a().f2799a.get(this.f2458b.f2491g);
        Objects.requireNonNull(obj);
        Integer num = (Integer) obj;
        int iIntValue = num.intValue();
        HashSet hashSet = this.f2457a;
        Preconditions.m7699f(hashSet.contains(num), "Received an unexpected stage id" + iIntValue);
        hashSet.remove(num);
        AutoValue_CaptureNode_Out autoValue_CaptureNode_Out = this.f2460d;
        Objects.requireNonNull(autoValue_CaptureNode_Out);
        autoValue_CaptureNode_Out.f2443a.accept(imageProxy);
        if (hashSet.isEmpty()) {
            ProcessingRequest processingRequest = this.f2458b;
            this.f2458b = null;
            RequestWithCallback requestWithCallback = processingRequest.f2490f;
            Threads.m1607a();
            if (requestWithCallback.f2500g) {
                return;
            }
            requestWithCallback.f2498e.m6742b(null);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m1356c(ProcessingRequest processingRequest) {
        Threads.m1607a();
        Preconditions.m7699f(m1354a() > 0, "Too many acquire images. Close image to be able to process next.");
        ProcessingRequest processingRequest2 = this.f2458b;
        HashSet hashSet = this.f2457a;
        Preconditions.m7699f(processingRequest2 == null || hashSet.isEmpty(), "The previous request is not complete");
        this.f2458b = processingRequest;
        hashSet.addAll(processingRequest.f2492h);
        AutoValue_CaptureNode_Out autoValue_CaptureNode_Out = this.f2460d;
        Objects.requireNonNull(autoValue_CaptureNode_Out);
        autoValue_CaptureNode_Out.f2444b.accept(processingRequest);
        Futures.m1624a(processingRequest.f2493i, new C02521(processingRequest), CameraXExecutors.m1615a());
    }
}
