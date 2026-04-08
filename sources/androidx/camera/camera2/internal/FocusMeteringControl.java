package androidx.camera.camera2.internal;

import android.graphics.PointF;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import android.util.Rational;
import androidx.annotation.OptIn;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.camera2.internal.Camera2CameraImpl;
import androidx.camera.camera2.internal.compat.quirk.AfRegionFlipHorizontallyQuirk;
import androidx.camera.camera2.internal.compat.workaround.MeteringRegionCorrection;
import androidx.camera.core.CameraControl;
import androidx.camera.core.FocusMeteringAction;
import androidx.camera.core.Logger;
import androidx.camera.core.MeteringPoint;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CameraCaptureFailure;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.Quirks;
import androidx.camera.core.impl.SessionConfig;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@OptIn
@RequiresApi
class FocusMeteringControl {

    /* JADX INFO: renamed from: t */
    public static final MeteringRectangle[] f1791t = new MeteringRectangle[0];

    /* JADX INFO: renamed from: a */
    public final Camera2CameraControlImpl f1792a;

    /* JADX INFO: renamed from: b */
    public final Executor f1793b;

    /* JADX INFO: renamed from: c */
    public final ScheduledExecutorService f1794c;

    /* JADX INFO: renamed from: f */
    public final MeteringRegionCorrection f1797f;

    /* JADX INFO: renamed from: i */
    public ScheduledFuture f1800i;

    /* JADX INFO: renamed from: j */
    public ScheduledFuture f1801j;

    /* JADX INFO: renamed from: p */
    public MeteringRectangle[] f1807p;

    /* JADX INFO: renamed from: q */
    public MeteringRectangle[] f1808q;

    /* JADX INFO: renamed from: r */
    public MeteringRectangle[] f1809r;

    /* JADX INFO: renamed from: s */
    public CallbackToFutureAdapter.Completer f1810s;

    /* JADX INFO: renamed from: d */
    public volatile boolean f1795d = false;

    /* JADX INFO: renamed from: e */
    public volatile Rational f1796e = null;

    /* JADX INFO: renamed from: g */
    public boolean f1798g = false;

    /* JADX INFO: renamed from: h */
    public Integer f1799h = 0;

    /* JADX INFO: renamed from: k */
    public long f1802k = 0;

    /* JADX INFO: renamed from: l */
    public boolean f1803l = false;

    /* JADX INFO: renamed from: m */
    public boolean f1804m = false;

    /* JADX INFO: renamed from: n */
    public int f1805n = 1;

    /* JADX INFO: renamed from: o */
    public C0222w f1806o = null;

    /* JADX INFO: renamed from: androidx.camera.camera2.internal.FocusMeteringControl$2 */
    /* JADX INFO: compiled from: Proguard */
    class C01742 extends CameraCaptureCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ CallbackToFutureAdapter.Completer f1811a;

        public C01742(CallbackToFutureAdapter.Completer completer) {
            this.f1811a = completer;
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        /* JADX INFO: renamed from: a */
        public final void mo894a() {
            CallbackToFutureAdapter.Completer completer = this.f1811a;
            if (completer != null) {
                completer.m6744d(new CameraControl.OperationCanceledException("Camera is closed"));
            }
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        /* JADX INFO: renamed from: b */
        public final void mo895b(CameraCaptureResult cameraCaptureResult) {
            CallbackToFutureAdapter.Completer completer = this.f1811a;
            if (completer != null) {
                completer.m6742b(null);
            }
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        /* JADX INFO: renamed from: c */
        public final void mo896c(CameraCaptureFailure cameraCaptureFailure) {
            CallbackToFutureAdapter.Completer completer = this.f1811a;
            if (completer != null) {
                completer.m6744d(new CameraControlInternal.CameraControlException());
            }
        }
    }

    public FocusMeteringControl(Camera2CameraControlImpl camera2CameraControlImpl, ScheduledExecutorService scheduledExecutorService, Executor executor, Quirks quirks) {
        MeteringRectangle[] meteringRectangleArr = f1791t;
        this.f1807p = meteringRectangleArr;
        this.f1808q = meteringRectangleArr;
        this.f1809r = meteringRectangleArr;
        this.f1810s = null;
        this.f1792a = camera2CameraControlImpl;
        this.f1793b = executor;
        this.f1794c = scheduledExecutorService;
        this.f1797f = new MeteringRegionCorrection(quirks);
    }

    /* JADX INFO: renamed from: a */
    public final void m1022a(boolean z2, boolean z3) {
        CameraCaptureResult cameraCaptureResult;
        if (this.f1795d) {
            CaptureConfig.Builder builder = new CaptureConfig.Builder();
            builder.f2681f = true;
            builder.f2678c = this.f1805n;
            Camera2ImplConfig.Builder builder2 = new Camera2ImplConfig.Builder();
            if (z2) {
                builder2.m816d(CaptureRequest.CONTROL_AF_TRIGGER, 2);
            }
            if (z3) {
                builder2.m816d(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 2);
            }
            builder.m1459c(builder2.m815c());
            Camera2CameraControlImpl camera2CameraControlImpl = this.f1792a;
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
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m1023b() {
        Camera2CameraControlImpl camera2CameraControlImpl = this.f1792a;
        camera2CameraControlImpl.f1548b.f1574a.remove(null);
        camera2CameraControlImpl.f1548b.f1574a.remove(this.f1806o);
        CallbackToFutureAdapter.Completer completer = this.f1810s;
        if (completer != null) {
            completer.m6744d(new CameraControl.OperationCanceledException("Cancelled by cancelFocusAndMetering()"));
            this.f1810s = null;
        }
        ScheduledFuture scheduledFuture = this.f1800i;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.f1800i = null;
        }
        ScheduledFuture scheduledFuture2 = this.f1801j;
        if (scheduledFuture2 != null) {
            scheduledFuture2.cancel(true);
            this.f1801j = null;
        }
        if (this.f1807p.length > 0) {
            m1022a(true, false);
        }
        MeteringRectangle[] meteringRectangleArr = f1791t;
        this.f1807p = meteringRectangleArr;
        this.f1808q = meteringRectangleArr;
        this.f1809r = meteringRectangleArr;
        this.f1798g = false;
        camera2CameraControlImpl.m893u();
    }

    /* JADX INFO: renamed from: c */
    public final List m1024c(List list, int i, Rational rational, Rect rect, int i2) {
        if (list.isEmpty() || i == 0) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        Rational rational2 = new Rational(rect.width(), rect.height());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MeteringPoint meteringPoint = (MeteringPoint) it.next();
            if (arrayList.size() == i) {
                break;
            }
            float f = meteringPoint.f2336a;
            if (f >= 0.0f && f <= 1.0f) {
                float f2 = meteringPoint.f2337b;
                if (f2 >= 0.0f && f2 <= 1.0f) {
                    PointF pointF = (i2 == 1 && this.f1797f.f2081a.m1513a(AfRegionFlipHorizontallyQuirk.class)) ? new PointF(1.0f - f, f2) : new PointF(f, f2);
                    if (!rational.equals(rational2)) {
                        if (rational.compareTo(rational2) > 0) {
                            float fDoubleValue = (float) (rational.doubleValue() / rational2.doubleValue());
                            pointF.y = (1.0f / fDoubleValue) * (((float) ((((double) fDoubleValue) - 1.0d) / 2.0d)) + pointF.y);
                        } else {
                            float fDoubleValue2 = (float) (rational2.doubleValue() / rational.doubleValue());
                            pointF.x = (1.0f / fDoubleValue2) * (((float) ((((double) fDoubleValue2) - 1.0d) / 2.0d)) + pointF.x);
                        }
                    }
                    int iWidth = (int) ((pointF.x * rect.width()) + rect.left);
                    int iHeight = (int) ((pointF.y * rect.height()) + rect.top);
                    float fWidth = rect.width();
                    float f3 = meteringPoint.f2338c;
                    int i3 = ((int) (fWidth * f3)) / 2;
                    int iHeight2 = ((int) (f3 * rect.height())) / 2;
                    Rect rect2 = new Rect(iWidth - i3, iHeight - iHeight2, iWidth + i3, iHeight + iHeight2);
                    rect2.left = Math.min(Math.max(rect2.left, rect.left), rect.right);
                    rect2.right = Math.min(Math.max(rect2.right, rect.left), rect.right);
                    rect2.top = Math.min(Math.max(rect2.top, rect.top), rect.bottom);
                    rect2.bottom = Math.min(Math.max(rect2.bottom, rect.top), rect.bottom);
                    MeteringRectangle meteringRectangle = new MeteringRectangle(rect2, 1000);
                    if (meteringRectangle.getWidth() != 0 && meteringRectangle.getHeight() != 0) {
                        arrayList.add(meteringRectangle);
                    }
                }
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m1025d(FocusMeteringAction focusMeteringAction) {
        Rational rational;
        Camera2CameraControlImpl camera2CameraControlImpl = this.f1792a;
        Rect rectMo825f = camera2CameraControlImpl.f1555i.f1916e.mo825f();
        if (this.f1796e != null) {
            rational = this.f1796e;
        } else {
            Rect rectMo825f2 = this.f1792a.f1555i.f1916e.mo825f();
            rational = new Rational(rectMo825f2.width(), rectMo825f2.height());
        }
        List list = focusMeteringAction.f2255a;
        Integer num = (Integer) camera2CameraControlImpl.f1551e.m1089a(CameraCharacteristics.CONTROL_MAX_REGIONS_AF);
        List listM1024c = m1024c(list, num == null ? 0 : num.intValue(), rational, rectMo825f, 1);
        Integer num2 = (Integer) camera2CameraControlImpl.f1551e.m1089a(CameraCharacteristics.CONTROL_MAX_REGIONS_AE);
        List listM1024c2 = m1024c(focusMeteringAction.f2256b, num2 == null ? 0 : num2.intValue(), rational, rectMo825f, 2);
        Integer num3 = (Integer) camera2CameraControlImpl.f1551e.m1089a(CameraCharacteristics.CONTROL_MAX_REGIONS_AWB);
        return (listM1024c.isEmpty() && listM1024c2.isEmpty() && m1024c(focusMeteringAction.f2257c, num3 == null ? 0 : num3.intValue(), rational, rectMo825f, 4).isEmpty()) ? false : true;
    }

    /* JADX INFO: renamed from: e */
    public final void m1026e(boolean z2) {
        CameraCaptureResult cameraCaptureResult;
        if (this.f1795d) {
            CaptureConfig.Builder builder = new CaptureConfig.Builder();
            builder.f2678c = this.f1805n;
            builder.f2681f = true;
            Camera2ImplConfig.Builder builder2 = new Camera2ImplConfig.Builder();
            builder2.m816d(CaptureRequest.CONTROL_AF_TRIGGER, 1);
            if (z2) {
                builder2.m816d(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(this.f1792a.m889o(1)));
            }
            builder.m1459c(builder2.m815c());
            builder.m1458b(new C01731());
            Camera2CameraControlImpl camera2CameraControlImpl = this.f1792a;
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
        }
    }

    /* JADX INFO: renamed from: androidx.camera.camera2.internal.FocusMeteringControl$1 */
    /* JADX INFO: compiled from: Proguard */
    class C01731 extends CameraCaptureCallback {
        @Override // androidx.camera.core.impl.CameraCaptureCallback
        /* JADX INFO: renamed from: a */
        public final void mo894a() {
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        /* JADX INFO: renamed from: b */
        public final void mo895b(CameraCaptureResult cameraCaptureResult) {
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        /* JADX INFO: renamed from: c */
        public final void mo896c(CameraCaptureFailure cameraCaptureFailure) {
        }
    }
}
