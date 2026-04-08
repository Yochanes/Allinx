package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.camera.camera2.internal.Camera2CameraControlImpl;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.camera2.internal.compat.workaround.FlashAvailabilityChecker;
import androidx.camera.camera2.internal.compat.workaround.OverrideAeModeForStillCapture;
import androidx.camera.camera2.internal.compat.workaround.UseTorchAsFlash;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CameraCaptureFailure;
import androidx.camera.core.impl.CameraCaptureMetaData;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.Quirks;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureChain;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
class Camera2CapturePipeline {

    /* JADX INFO: renamed from: h */
    public static final Set f1657h = Collections.unmodifiableSet(EnumSet.of(CameraCaptureMetaData.AfState.f2618d, CameraCaptureMetaData.AfState.f2619f, CameraCaptureMetaData.AfState.f2620g, CameraCaptureMetaData.AfState.f2621i));

    /* JADX INFO: renamed from: i */
    public static final Set f1658i = Collections.unmodifiableSet(EnumSet.of(CameraCaptureMetaData.AwbState.f2626d, CameraCaptureMetaData.AwbState.f2623a));

    /* JADX INFO: renamed from: j */
    public static final Set f1659j;

    /* JADX INFO: renamed from: k */
    public static final Set f1660k;

    /* JADX INFO: renamed from: a */
    public final Camera2CameraControlImpl f1661a;

    /* JADX INFO: renamed from: b */
    public final UseTorchAsFlash f1662b;

    /* JADX INFO: renamed from: c */
    public final boolean f1663c;

    /* JADX INFO: renamed from: d */
    public final Quirks f1664d;

    /* JADX INFO: renamed from: e */
    public final Executor f1665e;

    /* JADX INFO: renamed from: f */
    public final boolean f1666f;

    /* JADX INFO: renamed from: g */
    public int f1667g = 1;

    /* JADX INFO: compiled from: Proguard */
    public static class AePreCaptureTask implements PipelineTask {

        /* JADX INFO: renamed from: a */
        public final Camera2CameraControlImpl f1668a;

        /* JADX INFO: renamed from: b */
        public final OverrideAeModeForStillCapture f1669b;

        /* JADX INFO: renamed from: c */
        public final int f1670c;

        /* JADX INFO: renamed from: d */
        public boolean f1671d = false;

        public AePreCaptureTask(Camera2CameraControlImpl camera2CameraControlImpl, int i, OverrideAeModeForStillCapture overrideAeModeForStillCapture) {
            this.f1668a = camera2CameraControlImpl;
            this.f1670c = i;
            this.f1669b = overrideAeModeForStillCapture;
        }

        @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
        /* JADX INFO: renamed from: a */
        public final ListenableFuture mo966a(TotalCaptureResult totalCaptureResult) {
            if (!Camera2CapturePipeline.m965b(totalCaptureResult, this.f1670c)) {
                return Futures.m1630g(Boolean.FALSE);
            }
            Logger.m1280a("Camera2CapturePipeline", "Trigger AE");
            this.f1671d = true;
            FutureChain futureChainM1623a = FutureChain.m1623a(CallbackToFutureAdapter.m6740a(new C0213n(this, 0)));
            C0218s c0218s = new C0218s(1);
            Executor executorM1615a = CameraXExecutors.m1615a();
            futureChainM1623a.getClass();
            return (FutureChain) Futures.m1634k(futureChainM1623a, c0218s, executorM1615a);
        }

        @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
        /* JADX INFO: renamed from: b */
        public final boolean mo967b() {
            return this.f1670c == 0;
        }

        @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
        /* JADX INFO: renamed from: c */
        public final void mo968c() {
            if (this.f1671d) {
                Logger.m1280a("Camera2CapturePipeline", "cancel TriggerAePreCapture");
                this.f1668a.f1554h.m1022a(false, true);
                this.f1669b.f2085b = false;
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class AfTask implements PipelineTask {

        /* JADX INFO: renamed from: a */
        public final Camera2CameraControlImpl f1672a;

        /* JADX INFO: renamed from: b */
        public boolean f1673b = false;

        public AfTask(Camera2CameraControlImpl camera2CameraControlImpl) {
            this.f1672a = camera2CameraControlImpl;
        }

        @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
        /* JADX INFO: renamed from: a */
        public final ListenableFuture mo966a(TotalCaptureResult totalCaptureResult) {
            Integer num;
            int iIntValue;
            ListenableFuture listenableFutureM1630g = Futures.m1630g(Boolean.TRUE);
            if (totalCaptureResult != null && (num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_MODE)) != null && ((iIntValue = num.intValue()) == 1 || iIntValue == 2)) {
                Logger.m1280a("Camera2CapturePipeline", "TriggerAf? AF mode auto");
                Integer num2 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
                if (num2 != null && num2.intValue() == 0) {
                    Logger.m1280a("Camera2CapturePipeline", "Trigger AF");
                    this.f1673b = true;
                    this.f1672a.f1554h.m1026e(false);
                }
            }
            return listenableFutureM1630g;
        }

        @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
        /* JADX INFO: renamed from: b */
        public final boolean mo967b() {
            return true;
        }

        @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
        /* JADX INFO: renamed from: c */
        public final void mo968c() {
            if (this.f1673b) {
                Logger.m1280a("Camera2CapturePipeline", "cancel TriggerAF");
                this.f1672a.f1554h.m1022a(true, false);
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @VisibleForTesting
    public static class Pipeline {

        /* JADX INFO: renamed from: i */
        public static final long f1674i;

        /* JADX INFO: renamed from: j */
        public static final long f1675j;

        /* JADX INFO: renamed from: k */
        public static final /* synthetic */ int f1676k = 0;

        /* JADX INFO: renamed from: a */
        public final int f1677a;

        /* JADX INFO: renamed from: b */
        public final Executor f1678b;

        /* JADX INFO: renamed from: c */
        public final Camera2CameraControlImpl f1679c;

        /* JADX INFO: renamed from: d */
        public final OverrideAeModeForStillCapture f1680d;

        /* JADX INFO: renamed from: e */
        public final boolean f1681e;

        /* JADX INFO: renamed from: f */
        public long f1682f = f1674i;

        /* JADX INFO: renamed from: g */
        public final ArrayList f1683g = new ArrayList();

        /* JADX INFO: renamed from: h */
        public final C01611 f1684h = new C01611();

        /* JADX INFO: renamed from: androidx.camera.camera2.internal.Camera2CapturePipeline$Pipeline$1 */
        /* JADX INFO: compiled from: Proguard */
        public class C01611 implements PipelineTask {
            public C01611() {
            }

            @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
            /* JADX INFO: renamed from: a */
            public final ListenableFuture mo966a(TotalCaptureResult totalCaptureResult) {
                ArrayList arrayList = new ArrayList();
                Iterator it = Pipeline.this.f1683g.iterator();
                while (it.hasNext()) {
                    arrayList.add(((PipelineTask) it.next()).mo966a(totalCaptureResult));
                }
                return Futures.m1634k(Futures.m1625b(arrayList), new C0218s(2), CameraXExecutors.m1615a());
            }

            @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
            /* JADX INFO: renamed from: b */
            public final boolean mo967b() {
                Iterator it = Pipeline.this.f1683g.iterator();
                while (it.hasNext()) {
                    if (((PipelineTask) it.next()).mo967b()) {
                        return true;
                    }
                }
                return false;
            }

            @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
            /* JADX INFO: renamed from: c */
            public final void mo968c() {
                Iterator it = Pipeline.this.f1683g.iterator();
                while (it.hasNext()) {
                    ((PipelineTask) it.next()).mo968c();
                }
            }
        }

        /* JADX INFO: renamed from: androidx.camera.camera2.internal.Camera2CapturePipeline$Pipeline$2 */
        /* JADX INFO: compiled from: Proguard */
        class C01622 extends CameraCaptureCallback {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ CallbackToFutureAdapter.Completer f1686a;

            public C01622(CallbackToFutureAdapter.Completer completer) {
                this.f1686a = completer;
            }

            @Override // androidx.camera.core.impl.CameraCaptureCallback
            /* JADX INFO: renamed from: a */
            public final void mo894a() {
                this.f1686a.m6744d(new ImageCaptureException("Capture request is cancelled because camera is closed", null));
            }

            @Override // androidx.camera.core.impl.CameraCaptureCallback
            /* JADX INFO: renamed from: b */
            public final void mo895b(CameraCaptureResult cameraCaptureResult) {
                this.f1686a.m6742b(null);
            }

            @Override // androidx.camera.core.impl.CameraCaptureCallback
            /* JADX INFO: renamed from: c */
            public final void mo896c(CameraCaptureFailure cameraCaptureFailure) {
                this.f1686a.m6744d(new ImageCaptureException("Capture request failed with reason " + CameraCaptureFailure.Reason.f2601a, null));
            }
        }

        static {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            f1674i = timeUnit.toNanos(1L);
            f1675j = timeUnit.toNanos(5L);
        }

        public Pipeline(int i, Executor executor, Camera2CameraControlImpl camera2CameraControlImpl, boolean z2, OverrideAeModeForStillCapture overrideAeModeForStillCapture) {
            this.f1677a = i;
            this.f1678b = executor;
            this.f1679c = camera2CameraControlImpl;
            this.f1681e = z2;
            this.f1680d = overrideAeModeForStillCapture;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface PipelineTask {
        /* JADX INFO: renamed from: a */
        ListenableFuture mo966a(TotalCaptureResult totalCaptureResult);

        /* JADX INFO: renamed from: b */
        boolean mo967b();

        /* JADX INFO: renamed from: c */
        void mo968c();
    }

    /* JADX INFO: compiled from: Proguard */
    public static class ResultListener implements Camera2CameraControlImpl.CaptureResultListener {

        /* JADX INFO: renamed from: a */
        public CallbackToFutureAdapter.Completer f1687a;

        /* JADX INFO: renamed from: c */
        public final long f1689c;

        /* JADX INFO: renamed from: d */
        public final Checker f1690d;

        /* JADX INFO: renamed from: b */
        public final ListenableFuture f1688b = CallbackToFutureAdapter.m6740a(new C0213n(this, 3));

        /* JADX INFO: renamed from: e */
        public volatile Long f1691e = null;

        /* JADX INFO: compiled from: Proguard */
        public interface Checker {
            /* JADX INFO: renamed from: a */
            boolean mo969a(TotalCaptureResult totalCaptureResult);
        }

        public ResultListener(long j, Checker checker) {
            this.f1689c = j;
            this.f1690d = checker;
        }

        @Override // androidx.camera.camera2.internal.Camera2CameraControlImpl.CaptureResultListener
        /* JADX INFO: renamed from: a */
        public final boolean mo897a(TotalCaptureResult totalCaptureResult) {
            Long l = (Long) totalCaptureResult.get(CaptureResult.SENSOR_TIMESTAMP);
            if (l != null && this.f1691e == null) {
                this.f1691e = l;
            }
            Long l2 = this.f1691e;
            if (0 == this.f1689c || l2 == null || l == null || l.longValue() - l2.longValue() <= this.f1689c) {
                Checker checker = this.f1690d;
                if (checker != null && !checker.mo969a(totalCaptureResult)) {
                    return false;
                }
                this.f1687a.m6742b(totalCaptureResult);
                return true;
            }
            this.f1687a.m6742b(null);
            Logger.m1280a("Camera2CapturePipeline", "Wait for capture result timeout, current:" + l + " first: " + l2);
            return true;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class TorchTask implements PipelineTask {

        /* JADX INFO: renamed from: e */
        public static final long f1692e = TimeUnit.SECONDS.toNanos(2);

        /* JADX INFO: renamed from: f */
        public static final /* synthetic */ int f1693f = 0;

        /* JADX INFO: renamed from: a */
        public final Camera2CameraControlImpl f1694a;

        /* JADX INFO: renamed from: b */
        public final int f1695b;

        /* JADX INFO: renamed from: c */
        public boolean f1696c = false;

        /* JADX INFO: renamed from: d */
        public final Executor f1697d;

        public TorchTask(Camera2CameraControlImpl camera2CameraControlImpl, int i, Executor executor) {
            this.f1694a = camera2CameraControlImpl;
            this.f1695b = i;
            this.f1697d = executor;
        }

        @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
        /* JADX INFO: renamed from: a */
        public final ListenableFuture mo966a(TotalCaptureResult totalCaptureResult) {
            if (Camera2CapturePipeline.m965b(totalCaptureResult, this.f1695b)) {
                if (!this.f1694a.f1562p) {
                    Logger.m1280a("Camera2CapturePipeline", "Turn on torch");
                    this.f1696c = true;
                    FutureChain futureChainM1623a = FutureChain.m1623a(CallbackToFutureAdapter.m6740a(new C0217r(this)));
                    C0217r c0217r = new C0217r(this);
                    Executor executor = this.f1697d;
                    futureChainM1623a.getClass();
                    return (FutureChain) Futures.m1634k((FutureChain) Futures.m1635l(futureChainM1623a, c0217r, executor), new C0218s(0), CameraXExecutors.m1615a());
                }
                Logger.m1280a("Camera2CapturePipeline", "Torch already on, not turn on");
            }
            return Futures.m1630g(Boolean.FALSE);
        }

        @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
        /* JADX INFO: renamed from: b */
        public final boolean mo967b() {
            return this.f1695b == 0;
        }

        @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
        /* JADX INFO: renamed from: c */
        public final void mo968c() {
            if (this.f1696c) {
                this.f1694a.f1556j.m1069a(null, false);
                Logger.m1280a("Camera2CapturePipeline", "Turn off torch");
            }
        }
    }

    static {
        CameraCaptureMetaData.AeState aeState = CameraCaptureMetaData.AeState.f2607f;
        CameraCaptureMetaData.AeState aeState2 = CameraCaptureMetaData.AeState.f2606d;
        CameraCaptureMetaData.AeState aeState3 = CameraCaptureMetaData.AeState.f2603a;
        Set setUnmodifiableSet = Collections.unmodifiableSet(EnumSet.of(aeState, aeState2, aeState3));
        f1659j = setUnmodifiableSet;
        EnumSet enumSetCopyOf = EnumSet.copyOf((Collection) setUnmodifiableSet);
        enumSetCopyOf.remove(aeState2);
        enumSetCopyOf.remove(aeState3);
        f1660k = Collections.unmodifiableSet(enumSetCopyOf);
    }

    public Camera2CapturePipeline(Camera2CameraControlImpl camera2CameraControlImpl, CameraCharacteristicsCompat cameraCharacteristicsCompat, Quirks quirks, Executor executor) {
        this.f1661a = camera2CameraControlImpl;
        Integer num = (Integer) cameraCharacteristicsCompat.m1089a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        this.f1666f = num != null && num.intValue() == 2;
        this.f1665e = executor;
        this.f1664d = quirks;
        this.f1662b = new UseTorchAsFlash(quirks);
        this.f1663c = FlashAvailabilityChecker.m1158a(new C0213n(cameraCharacteristicsCompat, 7));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007b  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m964a(TotalCaptureResult totalCaptureResult, boolean z2) {
        boolean z3;
        boolean z4;
        boolean z5;
        if (totalCaptureResult != null) {
            Camera2CameraCaptureResult camera2CameraCaptureResult = new Camera2CameraCaptureResult(totalCaptureResult);
            if (camera2CameraCaptureResult.m872i() == CameraCaptureMetaData.AfMode.f2611b || camera2CameraCaptureResult.m872i() == CameraCaptureMetaData.AfMode.f2610a) {
                z3 = true;
                boolean z6 = ((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_MODE)).intValue() != 0;
                if (z2) {
                    if (!z6) {
                        if (f1659j.contains(camera2CameraCaptureResult.mo869f())) {
                        }
                    }
                    z4 = true;
                } else {
                    if (!z6) {
                        if (!f1660k.contains(camera2CameraCaptureResult.mo869f())) {
                            z4 = false;
                        }
                    }
                    z4 = true;
                }
                if (((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AWB_MODE)).intValue() != 0) {
                    z5 = true;
                    Logger.m1280a("Camera2CapturePipeline", "checkCaptureResult, AE=" + camera2CameraCaptureResult.mo869f() + " AF =" + camera2CameraCaptureResult.mo871h() + " AWB=" + camera2CameraCaptureResult.mo867d());
                    if (!z3 && z4 && z5) {
                        return true;
                    }
                } else {
                    if (!f1658i.contains(camera2CameraCaptureResult.mo867d())) {
                        z5 = false;
                    }
                    Logger.m1280a("Camera2CapturePipeline", "checkCaptureResult, AE=" + camera2CameraCaptureResult.mo869f() + " AF =" + camera2CameraCaptureResult.mo871h() + " AWB=" + camera2CameraCaptureResult.mo867d());
                    if (!z3) {
                    }
                }
            } else {
                if (!f1657h.contains(camera2CameraCaptureResult.mo871h())) {
                    z3 = false;
                }
                if (((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_MODE)).intValue() != 0) {
                }
                if (z2) {
                }
                if (((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AWB_MODE)).intValue() != 0) {
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m965b(TotalCaptureResult totalCaptureResult, int i) {
        if (i == 0) {
            Integer num = totalCaptureResult != null ? (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE) : null;
            return num != null && num.intValue() == 4;
        }
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        throw new AssertionError(i);
    }
}
