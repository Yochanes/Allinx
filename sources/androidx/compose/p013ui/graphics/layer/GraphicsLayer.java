package androidx.compose.p013ui.graphics.layer;

import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.geometry.Rect;
import androidx.compose.p013ui.geometry.RoundRectKt;
import androidx.compose.p013ui.geometry.Size;
import androidx.compose.p013ui.graphics.AndroidPaint;
import androidx.compose.p013ui.graphics.AndroidPath;
import androidx.compose.p013ui.graphics.Outline;
import androidx.compose.p013ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.p013ui.graphics.drawscope.DrawContextKt;
import androidx.compose.p013ui.graphics.drawscope.DrawScope;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.p013ui.unit.IntSize;
import androidx.compose.p013ui.unit.IntSizeKt;
import androidx.compose.p013ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p011a.AbstractC0025b;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "", "Companion", "ui-graphics_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class GraphicsLayer {

    /* JADX INFO: renamed from: y */
    public static final LayerSnapshotImpl f17794y;

    /* JADX INFO: renamed from: a */
    public final GraphicsLayerImpl f17795a;

    /* JADX INFO: renamed from: f */
    public Outline f17800f;

    /* JADX INFO: renamed from: j */
    public float f17804j;

    /* JADX INFO: renamed from: k */
    public androidx.compose.p013ui.graphics.Outline f17805k;

    /* JADX INFO: renamed from: l */
    public AndroidPath f17806l;

    /* JADX INFO: renamed from: m */
    public AndroidPath f17807m;

    /* JADX INFO: renamed from: n */
    public boolean f17808n;

    /* JADX INFO: renamed from: o */
    public CanvasDrawScope f17809o;

    /* JADX INFO: renamed from: p */
    public AndroidPaint f17810p;

    /* JADX INFO: renamed from: q */
    public int f17811q;

    /* JADX INFO: renamed from: s */
    public boolean f17813s;

    /* JADX INFO: renamed from: t */
    public long f17814t;

    /* JADX INFO: renamed from: u */
    public long f17815u;

    /* JADX INFO: renamed from: v */
    public long f17816v;

    /* JADX INFO: renamed from: w */
    public boolean f17817w;

    /* JADX INFO: renamed from: x */
    public RectF f17818x;

    /* JADX INFO: renamed from: b */
    public Density f17796b = DrawContextKt.f17779a;

    /* JADX INFO: renamed from: c */
    public LayoutDirection f17797c = LayoutDirection.f20569a;

    /* JADX INFO: renamed from: d */
    public Lambda f17798d = GraphicsLayer$drawBlock$1.f17820a;

    /* JADX INFO: renamed from: e */
    public final Function1 f17799e = new GraphicsLayer$clipDrawBlock$1(this);

    /* JADX INFO: renamed from: g */
    public boolean f17801g = true;

    /* JADX INFO: renamed from: h */
    public long f17802h = 0;

    /* JADX INFO: renamed from: i */
    public long f17803i = 9205357640488583168L;

    /* JADX INFO: renamed from: r */
    public final ChildLayerDependenciesTracker f17812r = new ChildLayerDependenciesTracker();

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m18302d2 = {"Landroidx/compose/ui/graphics/layer/GraphicsLayer$Companion;", "", "Landroidx/compose/ui/graphics/layer/LayerSnapshotImpl;", "SnapshotImpl", "Landroidx/compose/ui/graphics/layer/LayerSnapshotImpl;", "ui-graphics_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Companion {
    }

    static {
        boolean z2 = LayerManager.f17905a;
        f17794y = LayerManager.f17905a ? LayerSnapshotV21.f17906a : Build.VERSION.SDK_INT >= 28 ? LayerSnapshotV28.f17911a : LayerSnapshotV22.f17907a;
    }

    public GraphicsLayer(GraphicsLayerImpl graphicsLayerImpl) {
        this.f17795a = graphicsLayerImpl;
        graphicsLayerImpl.mo5396E(false);
        this.f17814t = 0L;
        this.f17815u = 0L;
        this.f17816v = 9205357640488583168L;
    }

    /* JADX INFO: renamed from: a */
    public final void m5385a() {
        Outline outline;
        if (this.f17801g) {
            boolean z2 = this.f17817w;
            GraphicsLayerImpl graphicsLayerImpl = this.f17795a;
            Outline outline2 = null;
            if (z2 || graphicsLayerImpl.mo5400I() > 0.0f) {
                AndroidPath androidPath = this.f17806l;
                if (androidPath != null) {
                    RectF rectF = this.f17818x;
                    if (rectF == null) {
                        rectF = new RectF();
                        this.f17818x = rectF;
                    }
                    Path path = androidPath.f17555a;
                    path.computeBounds(rectF, false);
                    int i = Build.VERSION.SDK_INT;
                    if (i > 28 || path.isConvex()) {
                        outline = this.f17800f;
                        if (outline == null) {
                            outline = new Outline();
                            this.f17800f = outline;
                        }
                        if (i >= 30) {
                            AbstractC0025b.m123o(outline, path);
                        } else {
                            outline.setConvexPath(path);
                        }
                        this.f17808n = !outline.canClip();
                    } else {
                        Outline outline3 = this.f17800f;
                        if (outline3 != null) {
                            outline3.setEmpty();
                        }
                        this.f17808n = true;
                        outline = null;
                    }
                    this.f17806l = androidPath;
                    if (outline != null) {
                        outline.setAlpha(graphicsLayerImpl.mo5404a());
                        outline2 = outline;
                    }
                    graphicsLayerImpl.mo5421r(outline2, (4294967295L & ((long) Math.round(rectF.height()))) | (((long) Math.round(rectF.width())) << 32));
                    if (this.f17808n && this.f17817w) {
                        graphicsLayerImpl.mo5396E(false);
                        graphicsLayerImpl.mo5411h();
                    } else {
                        graphicsLayerImpl.mo5396E(this.f17817w);
                    }
                } else {
                    graphicsLayerImpl.mo5396E(this.f17817w);
                    Outline outline4 = this.f17800f;
                    if (outline4 == null) {
                        outline4 = new Outline();
                        this.f17800f = outline4;
                    }
                    Outline outline5 = outline4;
                    long jM6670d = IntSizeKt.m6670d(this.f17815u);
                    long j = this.f17802h;
                    long j2 = this.f17803i;
                    long j3 = j2 == 9205357640488583168L ? jM6670d : j2;
                    int i2 = (int) (j >> 32);
                    int i3 = (int) (j & 4294967295L);
                    outline5.setRoundRect(Math.round(Float.intBitsToFloat(i2)), Math.round(Float.intBitsToFloat(i3)), Math.round(Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i2)), Math.round(Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i3)), this.f17804j);
                    outline5.setAlpha(graphicsLayerImpl.mo5404a());
                    graphicsLayerImpl.mo5421r(outline5, IntSizeKt.m6669c(j3));
                }
            } else {
                graphicsLayerImpl.mo5396E(false);
                graphicsLayerImpl.mo5421r(null, 0L);
            }
        }
        this.f17801g = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0064  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m5386b() {
        if (this.f17813s && this.f17811q == 0) {
            ChildLayerDependenciesTracker childLayerDependenciesTracker = this.f17812r;
            GraphicsLayer graphicsLayer = childLayerDependenciesTracker.f17789a;
            if (graphicsLayer != null) {
                graphicsLayer.f17811q--;
                graphicsLayer.m5386b();
                childLayerDependenciesTracker.f17789a = null;
            }
            MutableScatterSet mutableScatterSet = childLayerDependenciesTracker.f17791c;
            if (mutableScatterSet != null) {
                Object[] objArr = mutableScatterSet.f3847b;
                long[] jArr = mutableScatterSet.f3846a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    r11.f17811q--;
                                    ((GraphicsLayer) objArr[(i << 3) + i3]).m5386b();
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                                break;
                            } else if (i == length) {
                                break;
                            } else {
                                i++;
                            }
                        }
                    }
                }
                mutableScatterSet.m2084g();
            }
            this.f17795a.mo5411h();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x008d  */
    /* JADX WARN: Type inference failed for: r3v2, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m5387c(DrawScope drawScope) {
        ChildLayerDependenciesTracker childLayerDependenciesTracker = this.f17812r;
        childLayerDependenciesTracker.f17790b = childLayerDependenciesTracker.f17789a;
        MutableScatterSet mutableScatterSet = childLayerDependenciesTracker.f17791c;
        if (mutableScatterSet != null && mutableScatterSet.m2119d()) {
            MutableScatterSet mutableScatterSet2 = childLayerDependenciesTracker.f17792d;
            if (mutableScatterSet2 == null) {
                int i = ScatterSetKt.f3851a;
                mutableScatterSet2 = new MutableScatterSet();
                childLayerDependenciesTracker.f17792d = mutableScatterSet2;
            }
            mutableScatterSet2.m2089l(mutableScatterSet);
            mutableScatterSet.m2084g();
        }
        childLayerDependenciesTracker.f17793e = true;
        this.f17798d.invoke(drawScope);
        childLayerDependenciesTracker.f17793e = false;
        GraphicsLayer graphicsLayer = childLayerDependenciesTracker.f17790b;
        if (graphicsLayer != null) {
            graphicsLayer.f17811q--;
            graphicsLayer.m5386b();
        }
        MutableScatterSet mutableScatterSet3 = childLayerDependenciesTracker.f17792d;
        if (mutableScatterSet3 == null || !mutableScatterSet3.m2119d()) {
            return;
        }
        Object[] objArr = mutableScatterSet3.f3847b;
        long[] jArr = mutableScatterSet3.f3846a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            r13.f17811q--;
                            ((GraphicsLayer) objArr[(i2 << 3) + i4]).m5386b();
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    } else if (i2 == length) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        mutableScatterSet3.m2084g();
    }

    /* JADX INFO: renamed from: d */
    public final androidx.compose.p013ui.graphics.Outline m5388d() {
        androidx.compose.p013ui.graphics.Outline rectangle;
        androidx.compose.p013ui.graphics.Outline outline = this.f17805k;
        AndroidPath androidPath = this.f17806l;
        if (outline != null) {
            return outline;
        }
        if (androidPath != null) {
            Outline.Generic generic = new Outline.Generic(androidPath);
            this.f17805k = generic;
            return generic;
        }
        long jM6670d = IntSizeKt.m6670d(this.f17815u);
        long j = this.f17802h;
        long j2 = this.f17803i;
        if (j2 != 9205357640488583168L) {
            jM6670d = j2;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jM6670d >> 32)) + fIntBitsToFloat;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jM6670d & 4294967295L)) + fIntBitsToFloat2;
        float f = this.f17804j;
        if (f > 0.0f) {
            rectangle = new Outline.Rounded(RoundRectKt.m5078b(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4, (((long) Float.floatToRawIntBits(f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(f)))));
        } else {
            rectangle = new Outline.Rectangle(new Rect(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4));
        }
        this.f17805k = rectangle;
        return rectangle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public final void m5389e(Density density, LayoutDirection layoutDirection, long j, Function1 function1) {
        boolean zM6665b = IntSize.m6665b(this.f17815u, j);
        GraphicsLayerImpl graphicsLayerImpl = this.f17795a;
        if (!zM6665b) {
            this.f17815u = j;
            long j2 = this.f17814t;
            graphicsLayerImpl.mo5392A(j, (int) (j2 >> 32), (int) (j2 & 4294967295L));
            if (this.f17803i == 9205357640488583168L) {
                this.f17801g = true;
                m5385a();
            }
        }
        this.f17796b = density;
        this.f17797c = layoutDirection;
        this.f17798d = (Lambda) function1;
        graphicsLayerImpl.mo5420q(density, layoutDirection, this, this.f17799e);
    }

    /* JADX INFO: renamed from: f */
    public final void m5390f(float f) {
        GraphicsLayerImpl graphicsLayerImpl = this.f17795a;
        if (graphicsLayerImpl.mo5404a() == f) {
            return;
        }
        graphicsLayerImpl.mo5405b(f);
    }

    /* JADX INFO: renamed from: g */
    public final void m5391g(float f, long j, long j2) {
        if (Offset.m5053c(this.f17802h, j) && Size.m5080a(this.f17803i, j2) && this.f17804j == f && this.f17806l == null) {
            return;
        }
        this.f17805k = null;
        this.f17806l = null;
        this.f17801g = true;
        this.f17808n = false;
        this.f17802h = j;
        this.f17803i = j2;
        this.f17804j = f;
        m5385a();
    }
}
