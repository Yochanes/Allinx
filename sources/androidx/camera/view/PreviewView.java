package androidx.camera.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Rational;
import android.util.Size;
import android.view.Display;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.UiThread;
import androidx.camera.core.Logger;
import androidx.camera.core.MeteringPointFactory;
import androidx.camera.core.Preview;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.ViewPort;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.Quirks;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.TransformUtils;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.view.internal.compat.quirk.DeviceQuirks;
import androidx.camera.view.internal.compat.quirk.SurfaceViewNotCroppedByParentQuirk;
import androidx.camera.view.internal.compat.quirk.SurfaceViewStretchedQuirk;
import androidx.camera.view.transform.OutputTransform;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.google.firebase.messaging.Constants;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public final class PreviewView extends FrameLayout {

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ int f3518t = 0;

    /* JADX INFO: renamed from: a */
    public ImplementationMode f3519a;

    /* JADX INFO: renamed from: b */
    public PreviewViewImplementation f3520b;

    /* JADX INFO: renamed from: c */
    public final PreviewTransformation f3521c;

    /* JADX INFO: renamed from: d */
    public boolean f3522d;

    /* JADX INFO: renamed from: f */
    public final MutableLiveData f3523f;

    /* JADX INFO: renamed from: g */
    public final AtomicReference f3524g;

    /* JADX INFO: renamed from: i */
    public CameraController f3525i;

    /* JADX INFO: renamed from: j */
    public final PreviewViewMeteringPointFactory f3526j;

    /* JADX INFO: renamed from: n */
    public final ScaleGestureDetector f3527n;

    /* JADX INFO: renamed from: o */
    public CameraInfoInternal f3528o;

    /* JADX INFO: renamed from: p */
    public MotionEvent f3529p;

    /* JADX INFO: renamed from: q */
    public final DisplayRotationListener f3530q;

    /* JADX INFO: renamed from: r */
    public final ViewOnLayoutChangeListenerC0409d f3531r;

    /* JADX INFO: renamed from: s */
    public final Preview.SurfaceProvider f3532s;

    /* JADX INFO: renamed from: androidx.camera.view.PreviewView$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C04021 implements Preview.SurfaceProvider {
        public C04021() {
        }

        @Override // androidx.camera.core.Preview.SurfaceProvider
        /* JADX INFO: renamed from: a */
        public final void mo37a(SurfaceRequest surfaceRequest) {
            PreviewViewImplementation surfaceViewImplementation;
            boolean zM1608b = Threads.m1608b();
            PreviewView previewView = PreviewView.this;
            if (!zM1608b) {
                ContextCompat.m7486c(previewView.getContext()).execute(new RunnableC0410e(this, surfaceRequest, 0));
                return;
            }
            Logger.m1280a("PreviewView", "Surface requested by Preview.");
            CameraInternal cameraInternal = surfaceRequest.f2365c;
            previewView.f3528o = cameraInternal.mo930q();
            surfaceRequest.m1308b(ContextCompat.m7486c(previewView.getContext()), new C0408c(this, cameraInternal, surfaceRequest));
            PreviewViewImplementation previewViewImplementation = previewView.f3520b;
            ImplementationMode implementationMode = previewView.f3519a;
            if (!(previewViewImplementation instanceof SurfaceViewImplementation) || PreviewView.m1935c(surfaceRequest, implementationMode)) {
                boolean zM1935c = PreviewView.m1935c(surfaceRequest, previewView.f3519a);
                PreviewTransformation previewTransformation = previewView.f3521c;
                if (zM1935c) {
                    TextureViewImplementation textureViewImplementation = new TextureViewImplementation(previewView, previewTransformation);
                    textureViewImplementation.f3573i = false;
                    textureViewImplementation.f3575k = new AtomicReference();
                    surfaceViewImplementation = textureViewImplementation;
                } else {
                    surfaceViewImplementation = new SurfaceViewImplementation(previewView, previewTransformation);
                }
                previewView.f3520b = surfaceViewImplementation;
            }
            PreviewStreamStateObserver previewStreamStateObserver = new PreviewStreamStateObserver(cameraInternal.mo930q(), previewView.f3523f, previewView.f3520b);
            previewView.f3524g.set(previewStreamStateObserver);
            cameraInternal.mo921g().mo1475b(ContextCompat.m7486c(previewView.getContext()), previewStreamStateObserver);
            previewView.f3520b.mo1942e(surfaceRequest, new C0408c(this, previewStreamStateObserver, cameraInternal));
        }
    }

    /* JADX INFO: renamed from: androidx.camera.view.PreviewView$2 */
    /* JADX INFO: compiled from: Proguard */
    public static /* synthetic */ class C04032 {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f3534a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f3535b;

        static {
            int[] iArr = new int[ImplementationMode.values().length];
            f3535b = iArr;
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3535b[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[ScaleType.values().length];
            f3534a = iArr2;
            try {
                iArr2[2] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3534a[1] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3534a[0] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3534a[5] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3534a[4] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f3534a[3] = 6;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public enum ImplementationMode {
        PERFORMANCE(0),
        /* JADX INFO: Fake field, exist only in values array */
        COMPATIBLE(1);


        /* JADX INFO: renamed from: a */
        public final int f3539a;

        ImplementationMode(int i) {
            this.f3539a = i;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RestrictTo
    public interface OnFrameUpdateListener {
    }

    /* JADX INFO: compiled from: Proguard */
    public class PinchToZoomOnScaleGestureListener extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        public PinchToZoomOnScaleGestureListener() {
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            if (PreviewView.this.f3525i == null) {
                return true;
            }
            scaleGestureDetector.getScaleFactor();
            Logger.m1288i("CameraController", "Use cases not attached to camera.");
            return true;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public enum ScaleType {
        /* JADX INFO: Fake field, exist only in values array */
        FILL_START(0),
        FILL_CENTER(1),
        /* JADX INFO: Fake field, exist only in values array */
        FILL_END(2),
        FIT_START(3),
        FIT_CENTER(4),
        FIT_END(5);


        /* JADX INFO: renamed from: a */
        public final int f3546a;

        ScaleType(int i) {
            this.f3546a = i;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Proguard */
    public static final class StreamState {

        /* JADX INFO: renamed from: a */
        public static final StreamState f3547a;

        /* JADX INFO: renamed from: b */
        public static final StreamState f3548b;

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ StreamState[] f3549c;

        static {
            StreamState streamState = new StreamState("IDLE", 0);
            f3547a = streamState;
            StreamState streamState2 = new StreamState("STREAMING", 1);
            f3548b = streamState2;
            f3549c = new StreamState[]{streamState, streamState2};
        }

        public static StreamState valueOf(String str) {
            return (StreamState) Enum.valueOf(StreamState.class, str);
        }

        public static StreamState[] values() {
            return (StreamState[]) f3549c.clone();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @UiThread
    public PreviewView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0);
        this.f3519a = ImplementationMode.PERFORMANCE;
        PreviewTransformation previewTransformation = new PreviewTransformation();
        previewTransformation.f3516h = ScaleType.FILL_CENTER;
        this.f3521c = previewTransformation;
        this.f3522d = true;
        this.f3523f = new MutableLiveData(StreamState.f3547a);
        this.f3524g = new AtomicReference();
        this.f3526j = new PreviewViewMeteringPointFactory(previewTransformation);
        this.f3530q = new DisplayRotationListener();
        this.f3531r = new ViewOnLayoutChangeListenerC0409d(this);
        this.f3532s = new C04021();
        Threads.m1607a();
        Resources.Theme theme = context.getTheme();
        int[] iArr = R.styleable.f3557a;
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        ViewCompat.m7807z(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0);
        try {
            int integer = typedArrayObtainStyledAttributes.getInteger(1, previewTransformation.f3516h.f3546a);
            for (ScaleType scaleType : ScaleType.values()) {
                if (scaleType.f3546a == integer) {
                    setScaleType(scaleType);
                    int integer2 = typedArrayObtainStyledAttributes.getInteger(0, 0);
                    for (ImplementationMode implementationMode : ImplementationMode.values()) {
                        if (implementationMode.f3539a == integer2) {
                            setImplementationMode(implementationMode);
                            typedArrayObtainStyledAttributes.recycle();
                            this.f3527n = new ScaleGestureDetector(context, new PinchToZoomOnScaleGestureListener());
                            if (getBackground() == null) {
                                setBackgroundColor(getContext().getColor(android.R.color.black));
                                return;
                            }
                            return;
                        }
                    }
                    throw new IllegalArgumentException("Unknown implementation mode id " + integer2);
                }
            }
            throw new IllegalArgumentException("Unknown scale type id " + integer);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m1935c(SurfaceRequest surfaceRequest, ImplementationMode implementationMode) {
        boolean zEquals = surfaceRequest.f2365c.mo930q().mo951j().equals("androidx.camera.camera2.legacy");
        Quirks quirks = DeviceQuirks.f3596a;
        boolean z2 = (quirks.m1514b(SurfaceViewStretchedQuirk.class) == null && quirks.m1514b(SurfaceViewNotCroppedByParentQuirk.class) == null) ? false : true;
        if (Build.VERSION.SDK_INT <= 24 || zEquals || z2) {
            return true;
        }
        int iOrdinal = implementationMode.ordinal();
        if (iOrdinal == 0) {
            return false;
        }
        if (iOrdinal == 1) {
            return true;
        }
        throw new IllegalArgumentException("Invalid implementation mode: " + implementationMode);
    }

    @Nullable
    private DisplayManager getDisplayManager() {
        Context context = getContext();
        if (context == null) {
            return null;
        }
        return (DisplayManager) context.getApplicationContext().getSystemService(Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION);
    }

    private int getViewPortScaleType() {
        int iOrdinal = getScaleType().ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        int i = 1;
        if (iOrdinal != 1) {
            i = 2;
            if (iOrdinal != 2) {
                i = 3;
                if (iOrdinal != 3 && iOrdinal != 4 && iOrdinal != 5) {
                    throw new IllegalStateException("Unexpected scale type: " + getScaleType());
                }
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: a */
    public final void m1936a(boolean z2) {
        Threads.m1607a();
        ViewPort viewPort = getViewPort();
        if (this.f3525i == null || viewPort == null || !isAttachedToWindow()) {
            return;
        }
        try {
            CameraController cameraController = this.f3525i;
            Preview.SurfaceProvider surfaceProvider = getSurfaceProvider();
            cameraController.getClass();
            Threads.m1607a();
            if (cameraController.f3497a != surfaceProvider) {
                cameraController.f3497a = surfaceProvider;
                throw null;
            }
            CameraXExecutors.m1618d();
            throw null;
        } catch (IllegalStateException e) {
            if (!z2) {
                throw e;
            }
            Logger.m1283d("PreviewView", e.toString(), e);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m1937b() {
        Display display;
        CameraInfoInternal cameraInfoInternal;
        Threads.m1607a();
        if (this.f3520b != null) {
            if (this.f3522d && (display = getDisplay()) != null && (cameraInfoInternal = this.f3528o) != null) {
                int iMo952k = cameraInfoInternal.mo952k(display.getRotation());
                int rotation = display.getRotation();
                PreviewTransformation previewTransformation = this.f3521c;
                if (previewTransformation.f3515g) {
                    previewTransformation.f3511c = iMo952k;
                    previewTransformation.f3513e = rotation;
                }
            }
            this.f3520b.m1943f();
        }
        PreviewViewMeteringPointFactory previewViewMeteringPointFactory = this.f3526j;
        Size size = new Size(getWidth(), getHeight());
        int layoutDirection = getLayoutDirection();
        previewViewMeteringPointFactory.getClass();
        Threads.m1607a();
        synchronized (previewViewMeteringPointFactory) {
            try {
                if (size.getWidth() == 0 || size.getHeight() == 0) {
                    previewViewMeteringPointFactory.f3556b = null;
                } else {
                    previewViewMeteringPointFactory.f3556b = previewViewMeteringPointFactory.f3555a.m1929a(size, layoutDirection);
                }
            } finally {
            }
        }
        if (this.f3525i != null) {
            getSensorToViewTransform();
            Threads.m1607a();
        }
    }

    @Nullable
    @UiThread
    public Bitmap getBitmap() {
        Bitmap bitmapMo1939b;
        Threads.m1607a();
        PreviewViewImplementation previewViewImplementation = this.f3520b;
        if (previewViewImplementation == null || (bitmapMo1939b = previewViewImplementation.mo1939b()) == null) {
            return null;
        }
        FrameLayout frameLayout = previewViewImplementation.f3551b;
        Size size = new Size(frameLayout.getWidth(), frameLayout.getHeight());
        int layoutDirection = frameLayout.getLayoutDirection();
        PreviewTransformation previewTransformation = previewViewImplementation.f3552c;
        if (!previewTransformation.m1934f()) {
            return bitmapMo1939b;
        }
        Matrix matrixM1932d = previewTransformation.m1932d();
        RectF rectFM1933e = previewTransformation.m1933e(size, layoutDirection);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(size.getWidth(), size.getHeight(), bitmapMo1939b.getConfig());
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Matrix matrix = new Matrix();
        matrix.postConcat(matrixM1932d);
        matrix.postScale(rectFM1933e.width() / previewTransformation.f3509a.getWidth(), rectFM1933e.height() / previewTransformation.f3509a.getHeight());
        matrix.postTranslate(rectFM1933e.left, rectFM1933e.top);
        canvas.drawBitmap(bitmapMo1939b, matrix, new Paint(7));
        return bitmapCreateBitmap;
    }

    @Nullable
    @UiThread
    public CameraController getController() {
        Threads.m1607a();
        return this.f3525i;
    }

    @NonNull
    @UiThread
    public ImplementationMode getImplementationMode() {
        Threads.m1607a();
        return this.f3519a;
    }

    @NonNull
    @UiThread
    public MeteringPointFactory getMeteringPointFactory() {
        Threads.m1607a();
        return this.f3526j;
    }

    @Nullable
    @TransformExperimental
    public OutputTransform getOutputTransform() {
        Matrix matrixM1931c;
        PreviewTransformation previewTransformation = this.f3521c;
        Threads.m1607a();
        try {
            matrixM1931c = previewTransformation.m1931c(new Size(getWidth(), getHeight()), getLayoutDirection());
        } catch (IllegalStateException unused) {
            matrixM1931c = null;
        }
        Rect rect = previewTransformation.f3510b;
        if (matrixM1931c == null || rect == null) {
            Logger.m1280a("PreviewView", "Transform info is not ready");
            return null;
        }
        RectF rectF = TransformUtils.f2896a;
        RectF rectF2 = new RectF(rect);
        Matrix matrix = new Matrix();
        matrix.setRectToRect(TransformUtils.f2896a, rectF2, Matrix.ScaleToFit.FILL);
        matrixM1931c.preConcat(matrix);
        if (this.f3520b instanceof TextureViewImplementation) {
            matrixM1931c.postConcat(getMatrix());
        } else if (!getMatrix().isIdentity()) {
            Logger.m1288i("PreviewView", "PreviewView needs to be in COMPATIBLE mode for the transform to work correctly.");
        }
        new Size(rect.width(), rect.height());
        return new OutputTransform();
    }

    @NonNull
    public LiveData<StreamState> getPreviewStreamState() {
        return this.f3523f;
    }

    @NonNull
    @UiThread
    public ScaleType getScaleType() {
        Threads.m1607a();
        return this.f3521c.f3516h;
    }

    @Nullable
    @RestrictTo
    public Matrix getSensorToViewTransform() {
        Threads.m1607a();
        Size size = new Size(getWidth(), getHeight());
        int layoutDirection = getLayoutDirection();
        PreviewTransformation previewTransformation = this.f3521c;
        if (!previewTransformation.m1934f()) {
            return null;
        }
        Matrix matrix = new Matrix(previewTransformation.f3512d);
        matrix.postConcat(previewTransformation.m1931c(size, layoutDirection));
        return matrix;
    }

    @NonNull
    @UiThread
    public Preview.SurfaceProvider getSurfaceProvider() {
        Threads.m1607a();
        return this.f3532s;
    }

    @Nullable
    @UiThread
    public ViewPort getViewPort() {
        Threads.m1607a();
        if (getDisplay() == null) {
            return null;
        }
        getDisplay().getRotation();
        Threads.m1607a();
        if (getWidth() == 0 || getHeight() == 0) {
            return null;
        }
        new Rational(getWidth(), getHeight());
        getViewPortScaleType();
        getLayoutDirection();
        return new ViewPort();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        DisplayManager displayManager = getDisplayManager();
        if (displayManager != null) {
            displayManager.registerDisplayListener(this.f3530q, new Handler(Looper.getMainLooper()));
        }
        addOnLayoutChangeListener(this.f3531r);
        PreviewViewImplementation previewViewImplementation = this.f3520b;
        if (previewViewImplementation != null) {
            previewViewImplementation.mo1940c();
        }
        m1936a(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeOnLayoutChangeListener(this.f3531r);
        PreviewViewImplementation previewViewImplementation = this.f3520b;
        if (previewViewImplementation != null) {
            previewViewImplementation.mo1941d();
        }
        if (this.f3525i != null) {
            Threads.m1607a();
            throw null;
        }
        DisplayManager displayManager = getDisplayManager();
        if (displayManager == null) {
            return;
        }
        displayManager.unregisterDisplayListener(this.f3530q);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f3525i == null) {
            return super.onTouchEvent(motionEvent);
        }
        boolean z2 = motionEvent.getPointerCount() == 1;
        boolean z3 = motionEvent.getAction() == 1;
        boolean z4 = motionEvent.getEventTime() - motionEvent.getDownTime() < ((long) ViewConfiguration.getLongPressTimeout());
        if (!z2 || !z3 || !z4) {
            return this.f3527n.onTouchEvent(motionEvent) || super.onTouchEvent(motionEvent);
        }
        this.f3529p = motionEvent;
        performClick();
        return true;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (this.f3525i != null) {
            MotionEvent motionEvent = this.f3529p;
            if (motionEvent != null) {
                motionEvent.getX();
            } else {
                getWidth();
            }
            MotionEvent motionEvent2 = this.f3529p;
            if (motionEvent2 != null) {
                motionEvent2.getY();
            } else {
                getHeight();
            }
            this.f3525i.getClass();
            Logger.m1288i("CameraController", "Use cases not attached to camera.");
        }
        this.f3529p = null;
        return super.performClick();
    }

    @UiThread
    public void setController(@Nullable CameraController cameraController) {
        Threads.m1607a();
        CameraController cameraController2 = this.f3525i;
        if (cameraController2 != null && cameraController2 != cameraController) {
            Threads.m1607a();
            throw null;
        }
        this.f3525i = cameraController;
        m1936a(false);
    }

    @UiThread
    public void setImplementationMode(@NonNull ImplementationMode implementationMode) {
        Threads.m1607a();
        this.f3519a = implementationMode;
    }

    @UiThread
    public void setScaleType(@NonNull ScaleType scaleType) {
        Threads.m1607a();
        this.f3521c.f3516h = scaleType;
        m1937b();
        m1936a(false);
    }

    /* JADX INFO: compiled from: Proguard */
    public class DisplayRotationListener implements DisplayManager.DisplayListener {
        public DisplayRotationListener() {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayChanged(int i) {
            PreviewView previewView = PreviewView.this;
            Display display = previewView.getDisplay();
            if (display == null || display.getDisplayId() != i) {
                return;
            }
            previewView.m1937b();
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayAdded(int i) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayRemoved(int i) {
        }
    }
}
