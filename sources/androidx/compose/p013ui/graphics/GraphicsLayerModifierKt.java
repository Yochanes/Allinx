package androidx.compose.p013ui.graphics;

import androidx.compose.p013ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"ui_release"}, m18303k = 2, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class GraphicsLayerModifierKt {
    /* JADX INFO: renamed from: a */
    public static final Modifier m5206a(Modifier modifier, Function1 function1) {
        return modifier.then(new BlockGraphicsLayerElement(function1));
    }

    /* JADX INFO: renamed from: b */
    public static Modifier m5207b(Modifier modifier, float f, float f2, float f3, float f4, float f5, Shape shape, boolean z2, int i) {
        float f6 = (i & 1) != 0 ? 1.0f : f;
        float f7 = (i & 2) != 0 ? 1.0f : f2;
        float f8 = (i & 4) != 0 ? 1.0f : f3;
        float f9 = (i & 32) != 0 ? 0.0f : f4;
        float f10 = (i & 256) != 0 ? 0.0f : f5;
        long j = TransformOrigin.f17678b;
        Shape shape2 = (i & 2048) != 0 ? RectangleShapeKt.f17631a : shape;
        boolean z3 = (i & 4096) != 0 ? false : z2;
        long j2 = GraphicsLayerScopeKt.f17599a;
        return modifier.then(new GraphicsLayerElement(f6, f7, f8, f9, f10, j, shape2, z3, j2, j2));
    }
}
