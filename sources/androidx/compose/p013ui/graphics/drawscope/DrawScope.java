package androidx.compose.p013ui.graphics.drawscope;

import androidx.compose.p013ui.geometry.Size;
import androidx.compose.p013ui.geometry.SizeKt;
import androidx.compose.p013ui.graphics.AndroidPathEffect;
import androidx.compose.p013ui.graphics.BlendModeColorFilter;
import androidx.compose.p013ui.graphics.Brush;
import androidx.compose.p013ui.graphics.ColorFilter;
import androidx.compose.p013ui.graphics.ImageBitmap;
import androidx.compose.p013ui.graphics.Path;
import androidx.compose.p013ui.graphics.PathEffect;
import androidx.compose.p013ui.graphics.layer.GraphicsLayer;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.p013ui.unit.LayoutDirection;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@DrawScopeMarker
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0003"}, m18302d2 = {"Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Landroidx/compose/ui/unit/Density;", "Companion", "ui-graphics_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public interface DrawScope extends Density {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/graphics/drawscope/DrawScope$Companion;", "", "ui-graphics_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class DefaultImpls {
    }

    /* JADX INFO: renamed from: E0 */
    static /* synthetic */ void m5370E0(DrawScope drawScope, Path path, Brush brush, float f, DrawStyle drawStyle, int i) {
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        if ((i & 8) != 0) {
            drawStyle = Fill.f17783a;
        }
        drawScope.mo5345i1(path, brush, f2, drawStyle, (i & 32) != 0 ? 3 : 0);
    }

    /* JADX INFO: renamed from: J */
    static /* synthetic */ void m5371J(DrawScope drawScope, long j, long j2, long j3, float f, Stroke stroke, ColorFilter colorFilter, int i) {
        long j4 = (i & 2) != 0 ? 0L : j2;
        drawScope.mo5348l0(j, j4, (i & 4) != 0 ? m5373O0(drawScope.mo5383h(), j4) : j3, (i & 8) != 0 ? 1.0f : f, (i & 16) != 0 ? Fill.f17783a : stroke, (i & 32) != 0 ? null : colorFilter, (i & 64) != 0 ? 3 : 0);
    }

    /* JADX INFO: renamed from: L0 */
    static /* synthetic */ void m5372L0(DrawScope drawScope, long j, float f, float f2, long j2, long j3, float f3, Stroke stroke, int i) {
        drawScope.mo5342b1(j, f, f2, j2, j3, (i & 64) != 0 ? 1.0f : f3, stroke);
    }

    /* JADX INFO: renamed from: O0 */
    static long m5373O0(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (j2 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (j2 & 4294967295L));
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    /* JADX INFO: renamed from: Y0 */
    static /* synthetic */ void m5374Y0(DrawScope drawScope, long j, float f, long j2, DrawStyle drawStyle, int i, int i2) {
        if ((i2 & 2) != 0) {
            f = Size.m5082c(drawScope.mo5383h()) / 2.0f;
        }
        float f2 = f;
        if ((i2 & 4) != 0) {
            j2 = drawScope.mo5384o1();
        }
        long j3 = j2;
        if ((i2 & 16) != 0) {
            drawStyle = Fill.f17783a;
        }
        drawScope.mo5343c0(j, f2, j3, drawStyle, (i2 & 64) != 0 ? 3 : i);
    }

    /* JADX INFO: renamed from: d0 */
    static /* synthetic */ void m5375d0(DrawScope drawScope, Path path, long j, float f, DrawStyle drawStyle, BlendModeColorFilter blendModeColorFilter, int i) {
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        if ((i & 8) != 0) {
            drawStyle = Fill.f17783a;
        }
        DrawStyle drawStyle2 = drawStyle;
        if ((i & 16) != 0) {
            blendModeColorFilter = null;
        }
        drawScope.mo5347k0(path, j, f2, drawStyle2, blendModeColorFilter);
    }

    /* JADX INFO: renamed from: e0 */
    static /* synthetic */ void m5376e0(DrawScope drawScope, Brush brush, long j, long j2, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i) {
        if ((i & 2) != 0) {
            j = 0;
        }
        long j3 = j;
        drawScope.mo5349m1(brush, j3, (i & 4) != 0 ? m5373O0(drawScope.mo5383h(), j3) : j2, (i & 8) != 0 ? 1.0f : f, (i & 16) != 0 ? Fill.f17783a : drawStyle, (i & 32) != 0 ? null : colorFilter);
    }

    /* JADX INFO: renamed from: f1 */
    static /* synthetic */ void m5377f1(DrawScope drawScope, long j, long j2, long j3, float f, int i, AndroidPathEffect androidPathEffect, int i2) {
        drawScope.mo5352s0(j, j2, j3, f, (i2 & 16) != 0 ? 0 : i, (i2 & 32) != 0 ? null : androidPathEffect, 3);
    }

    /* JADX INFO: renamed from: j0 */
    static void m5378j0(DrawScope drawScope, ImageBitmap imageBitmap, long j, long j2, long j3, long j4, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, int i3) {
        drawScope.mo5351r1(imageBitmap, (i3 & 2) != 0 ? 0L : j, j2, (i3 & 8) != 0 ? 0L : j3, (i3 & 16) != 0 ? j2 : j4, (i3 & 32) != 0 ? 1.0f : f, (i3 & 64) != 0 ? Fill.f17783a : drawStyle, colorFilter, (i3 & 256) != 0 ? 3 : i, (i3 & 512) != 0 ? 1 : i2);
    }

    /* JADX INFO: renamed from: n0 */
    static /* synthetic */ void m5379n0(DrawScope drawScope, Brush brush, long j, long j2, float f, float f2, int i) {
        drawScope.mo5354y1(brush, j, j2, f, (i & 64) != 0 ? 1.0f : f2);
    }

    /* JADX INFO: renamed from: s1 */
    static /* synthetic */ void m5380s1(DrawScope drawScope, long j, long j2, long j3, long j4, DrawStyle drawStyle, int i) {
        drawScope.mo5344i0(j, (i & 2) != 0 ? 0L : j2, j3, j4, (i & 16) != 0 ? Fill.f17783a : drawStyle);
    }

    /* JADX INFO: renamed from: u0 */
    static /* synthetic */ void m5381u0(DrawScope drawScope, Brush brush, long j, long j2, long j3, DrawStyle drawStyle, int i) {
        if ((i & 2) != 0) {
            j = 0;
        }
        long j4 = j;
        drawScope.mo5340E1(brush, j4, (i & 4) != 0 ? m5373O0(drawScope.mo5383h(), j4) : j2, j3, 1.0f, (i & 32) != 0 ? Fill.f17783a : drawStyle);
    }

    /* JADX INFO: renamed from: B0 */
    default void mo5382B0(long j, GraphicsLayer graphicsLayer, Function1 function1) {
        graphicsLayer.m5389e(this, getLayoutDirection(), j, new DrawScope$record$1(this, function1));
    }

    /* JADX INFO: renamed from: D1 */
    void mo5339D1(ImageBitmap imageBitmap, BlendModeColorFilter blendModeColorFilter);

    /* JADX INFO: renamed from: E1 */
    void mo5340E1(Brush brush, long j, long j2, long j3, float f, DrawStyle drawStyle);

    /* JADX INFO: renamed from: a1 */
    CanvasDrawScope$drawContext$1 getF17768b();

    /* JADX INFO: renamed from: b1 */
    void mo5342b1(long j, float f, float f2, long j2, long j3, float f3, Stroke stroke);

    /* JADX INFO: renamed from: c0 */
    void mo5343c0(long j, float f, long j2, DrawStyle drawStyle, int i);

    LayoutDirection getLayoutDirection();

    /* JADX INFO: renamed from: h */
    default long mo5383h() {
        return getF17768b().m5358d();
    }

    /* JADX INFO: renamed from: i0 */
    void mo5344i0(long j, long j2, long j3, long j4, DrawStyle drawStyle);

    /* JADX INFO: renamed from: i1 */
    void mo5345i1(Path path, Brush brush, float f, DrawStyle drawStyle, int i);

    /* JADX INFO: renamed from: j1 */
    void mo5346j1(ArrayList arrayList, long j, float f);

    /* JADX INFO: renamed from: k0 */
    void mo5347k0(Path path, long j, float f, DrawStyle drawStyle, ColorFilter colorFilter);

    /* JADX INFO: renamed from: l0 */
    void mo5348l0(long j, long j2, long j3, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i);

    /* JADX INFO: renamed from: m1 */
    void mo5349m1(Brush brush, long j, long j2, float f, DrawStyle drawStyle, ColorFilter colorFilter);

    /* JADX INFO: renamed from: o1 */
    default long mo5384o1() {
        return SizeKt.m5087b(getF17768b().m5358d());
    }

    /* JADX INFO: renamed from: r1 */
    default void mo5351r1(ImageBitmap imageBitmap, long j, long j2, long j3, long j4, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2) {
        m5378j0(this, imageBitmap, j, j2, j3, j4, f, drawStyle, colorFilter, i, 0, 512);
    }

    /* JADX INFO: renamed from: s0 */
    void mo5352s0(long j, long j2, long j3, float f, int i, PathEffect pathEffect, int i2);

    /* JADX INFO: renamed from: y1 */
    void mo5354y1(Brush brush, long j, long j2, float f, float f2);
}
