package androidx.compose.p013ui.draw;

import androidx.compose.p013ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.p013ui.graphics.layer.GraphicsLayer;
import androidx.compose.p013ui.node.LayoutNodeDrawScope;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.p013ui.unit.LayoutDirection;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/draw/CacheDrawScope;", "Landroidx/compose/ui/unit/Density;", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class CacheDrawScope implements Density {

    /* JADX INFO: renamed from: a */
    public BuildDrawCacheParams f17387a = EmptyBuildDrawCacheParams.f17404a;

    /* JADX INFO: renamed from: b */
    public DrawResult f17388b;

    /* JADX INFO: renamed from: c */
    public LayoutNodeDrawScope f17389c;

    /* JADX INFO: renamed from: d */
    public Function0 f17390d;

    /* JADX INFO: renamed from: s */
    public static void m4941s(CacheDrawScope cacheDrawScope, GraphicsLayer graphicsLayer, Function1 function1) {
        LayoutDirection layoutDirection = cacheDrawScope.f17387a.getLayoutDirection();
        long jMo4938h = cacheDrawScope.f17387a.mo4938h();
        long jIntBitsToFloat = (((long) ((int) Float.intBitsToFloat((int) (jMo4938h >> 32)))) << 32) | (((long) ((int) Float.intBitsToFloat((int) (jMo4938h & 4294967295L)))) & 4294967295L);
        LayoutNodeDrawScope layoutNodeDrawScope = cacheDrawScope.f17389c;
        Intrinsics.m18596d(layoutNodeDrawScope);
        CanvasDrawScope canvasDrawScope = layoutNodeDrawScope.f18771a;
        layoutNodeDrawScope.mo5382B0(jIntBitsToFloat, graphicsLayer, new CacheDrawScope$record$1$1(function1, layoutNodeDrawScope, cacheDrawScope, layoutDirection, canvasDrawScope.f17768b.m5356b(), canvasDrawScope.f17768b.m5357c()));
    }

    @Override // androidx.compose.p013ui.unit.FontScaling
    /* JADX INFO: renamed from: S0 */
    public final float getF20557b() {
        return this.f17387a.getDensity().getF20557b();
    }

    @Override // androidx.compose.p013ui.unit.Density
    /* JADX INFO: renamed from: getDensity */
    public final float getF20556a() {
        return this.f17387a.getDensity().getF20556a();
    }

    /* JADX INFO: renamed from: m */
    public final DrawResult m4942m(Function1 function1) {
        return m4943p(new CacheDrawScope$onDrawBehind$1(function1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p */
    public final DrawResult m4943p(Function1 function1) {
        DrawResult drawResult = new DrawResult();
        drawResult.f17400a = (Lambda) function1;
        this.f17388b = drawResult;
        return drawResult;
    }
}
