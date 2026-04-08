package androidx.compose.p013ui.platform;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import androidx.annotation.RequiresApi;
import androidx.compose.p013ui.geometry.MutableRect;
import androidx.compose.p013ui.graphics.AndroidCanvas;
import androidx.compose.p013ui.graphics.BlurEffect;
import androidx.compose.p013ui.graphics.CanvasHolder;
import androidx.compose.p013ui.graphics.ColorKt;
import androidx.compose.p013ui.graphics.Matrix;
import androidx.compose.p013ui.graphics.Path;
import androidx.compose.p013ui.graphics.RectangleShapeKt;
import androidx.compose.p013ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.p013ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.p013ui.graphics.TransformOrigin;
import androidx.compose.p013ui.graphics.layer.GraphicsLayer;
import androidx.compose.p013ui.layout.GraphicLayerInfo;
import androidx.compose.p013ui.node.OwnedLayer;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002./R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR*\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00108\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001d\u001a\u00020\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010!\u001a\u00020\u001e8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u001cR$\u0010)\u001a\u00020$2\u0006\u0010\u0011\u001a\u00020$8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0016\u0010-\u001a\u0004\u0018\u00010*8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00060"}, m18302d2 = {"Landroidx/compose/ui/platform/ViewLayer;", "Landroid/view/View;", "Landroidx/compose/ui/node/OwnedLayer;", "Landroidx/compose/ui/layout/GraphicLayerInfo;", "Landroidx/compose/ui/platform/AndroidComposeView;", "a", "Landroidx/compose/ui/platform/AndroidComposeView;", "getOwnerView", "()Landroidx/compose/ui/platform/AndroidComposeView;", "ownerView", "Landroidx/compose/ui/platform/DrawChildContainer;", "b", "Landroidx/compose/ui/platform/DrawChildContainer;", "getContainer", "()Landroidx/compose/ui/platform/DrawChildContainer;", "container", "", "value", "j", "Z", "isInvalidated", "()Z", "setInvalidated", "(Z)V", "", "s", "J", "getLayerId", "()J", "layerId", "Landroidx/compose/ui/graphics/Matrix;", "getUnderlyingMatrix-sQKQjiQ", "()[F", "underlyingMatrix", "getOwnerViewId", "ownerViewId", "", "getCameraDistancePx", "()F", "setCameraDistancePx", "(F)V", "cameraDistancePx", "Landroidx/compose/ui/graphics/Path;", "getManualClipPath", "()Landroidx/compose/ui/graphics/Path;", "manualClipPath", "Companion", "UniqueDrawingIdApi29", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class ViewLayer extends View implements OwnedLayer, GraphicLayerInfo {

    /* JADX INFO: renamed from: u */
    public static final Function2 f19551u = null;

    /* JADX INFO: renamed from: v */
    public static final ViewLayer$Companion$OutlineProvider$1 f19552v = new ViewLayer$Companion$OutlineProvider$1();

    /* JADX INFO: renamed from: w */
    public static Method f19553w;

    /* JADX INFO: renamed from: x */
    public static Field f19554x;

    /* JADX INFO: renamed from: y */
    public static boolean f19555y;

    /* JADX INFO: renamed from: z */
    public static boolean f19556z;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final AndroidComposeView ownerView;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final DrawChildContainer container;

    /* JADX INFO: renamed from: c */
    public Function2 f19559c;

    /* JADX INFO: renamed from: d */
    public Function0 f19560d;

    /* JADX INFO: renamed from: f */
    public final OutlineResolver f19561f;

    /* JADX INFO: renamed from: g */
    public boolean f19562g;

    /* JADX INFO: renamed from: i */
    public Rect f19563i;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public boolean isInvalidated;

    /* JADX INFO: renamed from: n */
    public boolean f19565n;

    /* JADX INFO: renamed from: o */
    public final CanvasHolder f19566o;

    /* JADX INFO: renamed from: p */
    public final LayerMatrixCache f19567p;

    /* JADX INFO: renamed from: q */
    public long f19568q;

    /* JADX INFO: renamed from: r */
    public boolean f19569r;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public final long layerId;

    /* JADX INFO: renamed from: t */
    public int f19571t;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R&\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, m18302d2 = {"Landroidx/compose/ui/platform/ViewLayer$Companion;", "", "Lkotlin/Function2;", "Landroid/view/View;", "Landroid/graphics/Matrix;", "", "getMatrix", "Lkotlin/jvm/functions/Function2;", "Ljava/lang/reflect/Field;", "recreateDisplayList", "Ljava/lang/reflect/Field;", "Ljava/lang/reflect/Method;", "updateDisplayListIfDirtyMethod", "Ljava/lang/reflect/Method;", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Companion {
        /* JADX INFO: renamed from: a */
        public static void m6193a(View view) {
            try {
                if (!ViewLayer.f19555y) {
                    ViewLayer.f19555y = true;
                    if (Build.VERSION.SDK_INT < 28) {
                        ViewLayer.f19553w = View.class.getDeclaredMethod("updateDisplayListIfDirty", new Class[0]);
                        ViewLayer.f19554x = View.class.getDeclaredField("mRecreateDisplayList");
                    } else {
                        ViewLayer.f19553w = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass()).invoke(View.class, "updateDisplayListIfDirty", new Class[0]);
                        ViewLayer.f19554x = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(View.class, "mRecreateDisplayList");
                    }
                    Method method = ViewLayer.f19553w;
                    if (method != null) {
                        method.setAccessible(true);
                    }
                    Field field = ViewLayer.f19554x;
                    if (field != null) {
                        field.setAccessible(true);
                    }
                }
                Field field2 = ViewLayer.f19554x;
                if (field2 != null) {
                    field2.setBoolean(view, true);
                }
                Method method2 = ViewLayer.f19553w;
                if (method2 != null) {
                    method2.invoke(view, new Object[0]);
                }
            } catch (Throwable unused) {
                ViewLayer.f19556z = true;
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/platform/ViewLayer$UniqueDrawingIdApi29;", "", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class UniqueDrawingIdApi29 {
    }

    public ViewLayer(AndroidComposeView androidComposeView, DrawChildContainer drawChildContainer, Function2 function2, Function0 function0) {
        super(androidComposeView.getContext());
        this.ownerView = androidComposeView;
        this.container = drawChildContainer;
        this.f19559c = function2;
        this.f19560d = function0;
        this.f19561f = new OutlineResolver();
        this.f19566o = new CanvasHolder();
        this.f19567p = new LayerMatrixCache(ViewLayer$Companion$getMatrix$1.f19572a);
        this.f19568q = TransformOrigin.f17678b;
        this.f19569r = true;
        setWillNotDraw(false);
        drawChildContainer.addView(this);
        this.layerId = View.generateViewId();
    }

    private final Path getManualClipPath() {
        if (!getClipToOutline()) {
            return null;
        }
        OutlineResolver outlineResolver = this.f19561f;
        if (!outlineResolver.f19479g) {
            return null;
        }
        outlineResolver.m6166e();
        return outlineResolver.f19477e;
    }

    private final void setInvalidated(boolean z2) {
        if (z2 != this.isInvalidated) {
            this.isInvalidated = z2;
            this.ownerView.m6010D(this, z2);
        }
    }

    @Override // androidx.compose.p013ui.node.OwnedLayer
    /* JADX INFO: renamed from: a */
    public final void mo5955a(float[] fArr) {
        Matrix.m5232e(fArr, this.f19567p.m6154b(this));
    }

    @Override // androidx.compose.p013ui.node.OwnedLayer
    /* JADX INFO: renamed from: b */
    public final void mo5956b() {
        setInvalidated(false);
        AndroidComposeView androidComposeView = this.ownerView;
        androidComposeView.f19063K = true;
        this.f19559c = null;
        this.f19560d = null;
        androidComposeView.m6019M(this);
        this.container.removeViewInLayout(this);
    }

    @Override // androidx.compose.p013ui.node.OwnedLayer
    /* JADX INFO: renamed from: c */
    public final boolean mo5957c(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (4294967295L & j));
        if (this.f19562g) {
            return 0.0f <= fIntBitsToFloat && fIntBitsToFloat < ((float) getWidth()) && 0.0f <= fIntBitsToFloat2 && fIntBitsToFloat2 < ((float) getHeight());
        }
        if (getClipToOutline()) {
            return this.f19561f.m6164c(j);
        }
        return true;
    }

    @Override // androidx.compose.p013ui.node.OwnedLayer
    /* JADX INFO: renamed from: d */
    public final void mo5958d(ReusableGraphicsLayerScope reusableGraphicsLayerScope) {
        Function0 function0;
        int i = reusableGraphicsLayerScope.f17633a | this.f19571t;
        if ((i & 4096) != 0) {
            long j = reusableGraphicsLayerScope.f17646s;
            this.f19568q = j;
            setPivotX(TransformOrigin.m5249b(j) * getWidth());
            setPivotY(TransformOrigin.m5250c(this.f19568q) * getHeight());
        }
        if ((i & 1) != 0) {
            setScaleX(reusableGraphicsLayerScope.f17634b);
        }
        if ((i & 2) != 0) {
            setScaleY(reusableGraphicsLayerScope.f17635c);
        }
        if ((i & 4) != 0) {
            setAlpha(reusableGraphicsLayerScope.f17636d);
        }
        if ((i & 8) != 0) {
            setTranslationX(reusableGraphicsLayerScope.f17637f);
        }
        if ((i & 16) != 0) {
            setTranslationY(reusableGraphicsLayerScope.f17638g);
        }
        if ((i & 32) != 0) {
            setElevation(reusableGraphicsLayerScope.f17639i);
        }
        if ((i & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
            setRotation(reusableGraphicsLayerScope.f17644q);
        }
        if ((i & 256) != 0) {
            setRotationX(reusableGraphicsLayerScope.f17642o);
        }
        if ((i & 512) != 0) {
            setRotationY(reusableGraphicsLayerScope.f17643p);
        }
        if ((i & 2048) != 0) {
            setCameraDistancePx(reusableGraphicsLayerScope.f17645r);
        }
        boolean z2 = getManualClipPath() != null;
        boolean z3 = reusableGraphicsLayerScope.f17648u;
        RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = RectangleShapeKt.f17631a;
        boolean z4 = z3 && reusableGraphicsLayerScope.f17647t != rectangleShapeKt$RectangleShape$1;
        if ((i & 24576) != 0) {
            this.f19562g = z3 && reusableGraphicsLayerScope.f17647t == rectangleShapeKt$RectangleShape$1;
            m6192m();
            setClipToOutline(z4);
        }
        boolean zM6165d = this.f19561f.m6165d(reusableGraphicsLayerScope.f17653z, reusableGraphicsLayerScope.f17636d, z4, reusableGraphicsLayerScope.f17639i, reusableGraphicsLayerScope.f17649v);
        OutlineResolver outlineResolver = this.f19561f;
        if (outlineResolver.f19478f) {
            setOutlineProvider(outlineResolver.m6163b() != null ? f19552v : null);
        }
        boolean z5 = getManualClipPath() != null;
        if (z2 != z5 || (z5 && zM6165d)) {
            invalidate();
        }
        if (!this.f19565n && getElevation() > 0.0f && (function0 = this.f19560d) != null) {
            function0.invoke();
        }
        if ((i & 7963) != 0) {
            this.f19567p.m6155c();
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            if ((i & 64) != 0) {
                AbstractC1316l.m6251b(this, ColorKt.m5201j(reusableGraphicsLayerScope.f17640j));
            }
            if ((i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                AbstractC1316l.m6252c(this, ColorKt.m5201j(reusableGraphicsLayerScope.f17641n));
            }
        }
        if (i2 >= 31 && (131072 & i) != 0) {
            BlurEffect blurEffect = reusableGraphicsLayerScope.f17652y;
            AbstractC1305a.m6201d(this, blurEffect != null ? blurEffect.m5247a() : null);
        }
        if ((i & 32768) != 0) {
            setLayerType(0, null);
            this.f19569r = true;
        }
        this.f19571t = reusableGraphicsLayerScope.f17633a;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean z2;
        CanvasHolder canvasHolder = this.f19566o;
        AndroidCanvas androidCanvas = canvasHolder.f17570a;
        Canvas canvas2 = androidCanvas.f17539a;
        androidCanvas.f17539a = canvas;
        if (getManualClipPath() == null && canvas.isHardwareAccelerated()) {
            z2 = false;
        } else {
            androidCanvas.mo5098i();
            this.f19561f.m6162a(androidCanvas);
            z2 = true;
        }
        Function2 function2 = this.f19559c;
        if (function2 != null) {
            function2.invoke(androidCanvas, null);
        }
        if (z2) {
            androidCanvas.mo5106r();
        }
        canvasHolder.f17570a.f17539a = canvas2;
        setInvalidated(false);
    }

    @Override // androidx.compose.p013ui.node.OwnedLayer
    /* JADX INFO: renamed from: e */
    public final long mo5959e(long j, boolean z2) {
        LayerMatrixCache layerMatrixCache = this.f19567p;
        if (!z2) {
            return !layerMatrixCache.f19464h ? Matrix.m5229b(layerMatrixCache.m6154b(this), j) : j;
        }
        float[] fArrM6153a = layerMatrixCache.m6153a(this);
        if (fArrM6153a == null) {
            return 9187343241974906880L;
        }
        return !layerMatrixCache.f19464h ? Matrix.m5229b(fArrM6153a, j) : j;
    }

    @Override // androidx.compose.p013ui.node.OwnedLayer
    /* JADX INFO: renamed from: f */
    public final void mo5960f(Function2 function2, Function0 function0) {
        this.container.addView(this);
        LayerMatrixCache layerMatrixCache = this.f19567p;
        layerMatrixCache.f19461e = false;
        layerMatrixCache.f19462f = false;
        layerMatrixCache.f19464h = true;
        layerMatrixCache.f19463g = true;
        Matrix.m5231d(layerMatrixCache.f19459c);
        Matrix.m5231d(layerMatrixCache.f19460d);
        this.f19562g = false;
        this.f19565n = false;
        this.f19568q = TransformOrigin.f17678b;
        this.f19559c = function2;
        this.f19560d = function0;
        setInvalidated(false);
    }

    @Override // androidx.compose.p013ui.node.OwnedLayer
    /* JADX INFO: renamed from: g */
    public final void mo5961g(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        if (i == getWidth() && i2 == getHeight()) {
            return;
        }
        setPivotX(TransformOrigin.m5249b(this.f19568q) * i);
        setPivotY(TransformOrigin.m5250c(this.f19568q) * i2);
        setOutlineProvider(this.f19561f.m6163b() != null ? f19552v : null);
        layout(getLeft(), getTop(), getLeft() + i, getTop() + i2);
        m6192m();
        this.f19567p.m6155c();
    }

    public final float getCameraDistancePx() {
        return getCameraDistance() / getResources().getDisplayMetrics().densityDpi;
    }

    @NotNull
    public final DrawChildContainer getContainer() {
        return this.container;
    }

    public long getLayerId() {
        return this.layerId;
    }

    @NotNull
    public final AndroidComposeView getOwnerView() {
        return this.ownerView;
    }

    public long getOwnerViewId() {
        if (Build.VERSION.SDK_INT >= 29) {
            return AbstractC1311g.m6226c(this.ownerView);
        }
        return -1L;
    }

    @Override // androidx.compose.p013ui.node.OwnedLayer
    @NotNull
    /* JADX INFO: renamed from: getUnderlyingMatrix-sQKQjiQ */
    public float[] mo21929getUnderlyingMatrixsQKQjiQ() {
        return this.f19567p.m6154b(this);
    }

    @Override // androidx.compose.p013ui.node.OwnedLayer
    /* JADX INFO: renamed from: h */
    public final void mo5962h(androidx.compose.p013ui.graphics.Canvas canvas, GraphicsLayer graphicsLayer) {
        boolean z2 = getElevation() > 0.0f;
        this.f19565n = z2;
        if (z2) {
            canvas.mo5108t();
        }
        this.container.m6141a(canvas, this, getDrawingTime());
        if (this.f19565n) {
            canvas.mo5099j();
        }
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.f19569r;
    }

    @Override // androidx.compose.p013ui.node.OwnedLayer
    /* JADX INFO: renamed from: i */
    public final void mo5963i(float[] fArr) {
        float[] fArrM6153a = this.f19567p.m6153a(this);
        if (fArrM6153a != null) {
            Matrix.m5232e(fArr, fArrM6153a);
        }
    }

    @Override // android.view.View, androidx.compose.p013ui.node.OwnedLayer
    public final void invalidate() {
        if (this.isInvalidated) {
            return;
        }
        setInvalidated(true);
        super.invalidate();
        this.ownerView.invalidate();
    }

    @Override // androidx.compose.p013ui.node.OwnedLayer
    /* JADX INFO: renamed from: j */
    public final void mo5964j(MutableRect mutableRect, boolean z2) {
        LayerMatrixCache layerMatrixCache = this.f19567p;
        if (!z2) {
            float[] fArrM6154b = layerMatrixCache.m6154b(this);
            if (layerMatrixCache.f19464h) {
                return;
            }
            Matrix.m5230c(fArrM6154b, mutableRect);
            return;
        }
        float[] fArrM6153a = layerMatrixCache.m6153a(this);
        if (fArrM6153a != null) {
            if (layerMatrixCache.f19464h) {
                return;
            }
            Matrix.m5230c(fArrM6153a, mutableRect);
        } else {
            mutableRect.f17520a = 0.0f;
            mutableRect.f17521b = 0.0f;
            mutableRect.f17522c = 0.0f;
            mutableRect.f17523d = 0.0f;
        }
    }

    @Override // androidx.compose.p013ui.node.OwnedLayer
    /* JADX INFO: renamed from: k */
    public final void mo5965k(long j) {
        int i = (int) (j >> 32);
        int left = getLeft();
        LayerMatrixCache layerMatrixCache = this.f19567p;
        if (i != left) {
            offsetLeftAndRight(i - getLeft());
            layerMatrixCache.m6155c();
        }
        int i2 = (int) (j & 4294967295L);
        if (i2 != getTop()) {
            offsetTopAndBottom(i2 - getTop());
            layerMatrixCache.m6155c();
        }
    }

    @Override // androidx.compose.p013ui.node.OwnedLayer
    /* JADX INFO: renamed from: l */
    public final void mo5966l() {
        if (!this.isInvalidated || f19556z) {
            return;
        }
        Companion.m6193a(this);
        setInvalidated(false);
    }

    /* JADX INFO: renamed from: m */
    public final void m6192m() {
        Rect rect;
        if (this.f19562g) {
            Rect rect2 = this.f19563i;
            if (rect2 == null) {
                this.f19563i = new Rect(0, 0, getWidth(), getHeight());
            } else {
                Intrinsics.m18596d(rect2);
                rect2.set(0, 0, getWidth(), getHeight());
            }
            rect = this.f19563i;
        } else {
            rect = null;
        }
        setClipBounds(rect);
    }

    public final void setCameraDistancePx(float f) {
        setCameraDistance(f * getResources().getDisplayMetrics().densityDpi);
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
    }
}
