package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.camera2.internal.Camera2CameraImpl;
import androidx.camera.camera2.internal.Camera2CapturePipeline;
import androidx.camera.camera2.internal.FocusMeteringControl;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat;
import androidx.camera.camera2.internal.compat.workaround.CameraCharacteristicsProvider;
import androidx.camera.camera2.internal.compat.workaround.WaitForRepeatingRequestStart;
import androidx.camera.core.CameraControl;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.ImageReaderProxy;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: androidx.camera.camera2.internal.n */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0213n implements CallbackToFutureAdapter.Resolver, AsyncFunction, WaitForRepeatingRequestStart.OpenCaptureSession, ImageReaderProxy.OnImageAvailableListener, CameraCharacteristicsProvider {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2134a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f2135b;

    public /* synthetic */ C0213n(Camera2CapturePipeline.Pipeline pipeline, CaptureConfig.Builder builder) {
        this.f2134a = 2;
        this.f2135b = builder;
    }

    /* JADX INFO: renamed from: a */
    public ListenableFuture m1167a(CameraDevice cameraDevice, SessionConfigurationCompat sessionConfigurationCompat, List list) {
        return SynchronizedCaptureSessionImpl.m1065w((SynchronizedCaptureSessionImpl) this.f2135b, cameraDevice, sessionConfigurationCompat, list);
    }

    @Override // androidx.camera.core.impl.utils.futures.AsyncFunction, com.google.android.datatransport.Transformer
    public ListenableFuture apply(Object obj) {
        int i = Camera2CapturePipeline.Pipeline.f1676k;
        Camera2CapturePipeline.Pipeline pipeline = (Camera2CapturePipeline.Pipeline) this.f2135b;
        if (!Boolean.TRUE.equals((Boolean) obj)) {
            return Futures.m1630g(null);
        }
        long j = pipeline.f1682f;
        C0216q c0216q = new C0216q(0);
        Set set = Camera2CapturePipeline.f1657h;
        Camera2CapturePipeline.ResultListener resultListener = new Camera2CapturePipeline.ResultListener(j, c0216q);
        pipeline.f1679c.m885k(resultListener);
        return resultListener.f1688b;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener
    /* JADX INFO: renamed from: b */
    public void mo1168b(ImageReaderProxy imageReaderProxy) {
        ZslControlImpl zslControlImpl = (ZslControlImpl) this.f2135b;
        zslControlImpl.getClass();
        try {
            ImageProxy imageProxyMo1185b = imageReaderProxy.mo1185b();
            if (imageProxyMo1185b != null) {
                zslControlImpl.f1925b.m1664b(imageProxyMo1185b);
            }
        } catch (IllegalStateException e) {
            Logger.m1282c("ZslControlImpl", "Failed to acquire latest image IllegalStateException = " + e.getMessage());
        }
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    /* JADX INFO: renamed from: d */
    public Object mo188d(CallbackToFutureAdapter.Completer completer) {
        CameraCaptureResult cameraCaptureResult;
        switch (this.f2134a) {
            case 0:
                Camera2CapturePipeline.AePreCaptureTask aePreCaptureTask = (Camera2CapturePipeline.AePreCaptureTask) this.f2135b;
                FocusMeteringControl focusMeteringControl = aePreCaptureTask.f1668a.f1554h;
                if (focusMeteringControl.f1795d) {
                    CaptureConfig.Builder builder = new CaptureConfig.Builder();
                    builder.f2678c = focusMeteringControl.f1805n;
                    builder.f2681f = true;
                    Camera2ImplConfig.Builder builder2 = new Camera2ImplConfig.Builder();
                    builder2.m816d(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1);
                    builder.m1459c(builder2.m815c());
                    builder.m1458b(new FocusMeteringControl.C01742(completer));
                    Camera2CameraControlImpl camera2CameraControlImpl = focusMeteringControl.f1792a;
                    List<CaptureConfig> listSingletonList = Collections.singletonList(builder.m1461e());
                    Camera2CameraImpl.ControlUpdateListenerInternal controlUpdateListenerInternal = (Camera2CameraImpl.ControlUpdateListenerInternal) camera2CameraControlImpl.f1552f;
                    controlUpdateListenerInternal.getClass();
                    listSingletonList.getClass();
                    Camera2CameraImpl camera2CameraImpl = Camera2CameraImpl.this;
                    camera2CameraImpl.getClass();
                    ArrayList arrayList = new ArrayList();
                    for (CaptureConfig captureConfig : listSingletonList) {
                        CaptureConfig.Builder builder3 = new CaptureConfig.Builder(captureConfig);
                        if (captureConfig.f2670c == 5 && (cameraCaptureResult = captureConfig.f2675h) != null) {
                            builder3.f2683h = cameraCaptureResult;
                        }
                        if (Collections.unmodifiableList(captureConfig.f2668a).isEmpty() && captureConfig.f2673f) {
                            HashSet hashSet = builder3.f2676a;
                            if (hashSet.isEmpty()) {
                                Iterator it = camera2CameraImpl.f1590a.m1557b().iterator();
                                while (it.hasNext()) {
                                    List listUnmodifiableList = Collections.unmodifiableList(((SessionConfig) it.next()).f2766f.f2668a);
                                    if (!listUnmodifiableList.isEmpty()) {
                                        Iterator it2 = listUnmodifiableList.iterator();
                                        while (it2.hasNext()) {
                                            builder3.m1460d((DeferrableSurface) it2.next());
                                        }
                                    }
                                }
                                if (hashSet.isEmpty()) {
                                    Logger.m1288i("Camera2CameraImpl", "Unable to find a repeating surface to attach to CaptureConfig");
                                }
                            } else {
                                Logger.m1288i("Camera2CameraImpl", "The capture config builder already has surface inside.");
                            }
                        }
                        arrayList.add(builder3.m1461e());
                    }
                    camera2CameraImpl.m932s("Issue capture request", null);
                    camera2CameraImpl.f1602r.mo996d(arrayList);
                } else {
                    completer.m6744d(new CameraControl.OperationCanceledException("Camera is not active."));
                }
                aePreCaptureTask.f1669b.f2085b = true;
                return "AePreCapture";
            case 1:
            default:
                Camera2CameraControlImpl camera2CameraControlImpl2 = (Camera2CameraControlImpl) this.f2135b;
                camera2CameraControlImpl2.getClass();
                camera2CameraControlImpl2.f1549c.execute(new RunnableC0188b(4, camera2CameraControlImpl2, completer));
                return "updateSessionConfigAsync";
            case 2:
                int i = Camera2CapturePipeline.Pipeline.f1676k;
                ((CaptureConfig.Builder) this.f2135b).m1458b(new Camera2CapturePipeline.Pipeline.C01622(completer));
                return "submitStillCapture";
            case 3:
                ((Camera2CapturePipeline.ResultListener) this.f2135b).f1687a = completer;
                return "waitFor3AResult";
        }
    }

    @Override // androidx.camera.camera2.internal.compat.workaround.CameraCharacteristicsProvider
    public Object get() {
        return ((CameraCharacteristicsCompat) this.f2135b).m1089a(CameraCharacteristics.FLASH_INFO_AVAILABLE);
    }

    public /* synthetic */ C0213n(Object obj, int i) {
        this.f2134a = i;
        this.f2135b = obj;
    }
}
