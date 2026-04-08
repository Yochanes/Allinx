package com.exchange.allin.p024ui.page.guess;

import androidx.compose.p013ui.graphics.GraphicsLayerScope;
import androidx.compose.p013ui.util.MathHelpersKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: renamed from: com.exchange.allin.ui.page.guess.i */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3247i implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ float f39724a;

    public /* synthetic */ C3247i(float f) {
        this.f39724a = f;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        GraphicsLayerScope graphicsLayer = (GraphicsLayerScope) obj;
        Intrinsics.m18599g(graphicsLayer, "$this$graphicsLayer");
        float f = this.f39724a;
        float fM6699b = MathHelpersKt.m6699b(0.9f, 1.0f, 1.0f - RangesKt.m18655b(f, 0.0f, 1.0f));
        graphicsLayer.mo5219g(fM6699b);
        graphicsLayer.mo5218f(fM6699b);
        graphicsLayer.mo5213b(MathHelpersKt.m6699b(0.8f, 1.0f, 1.0f - RangesKt.m18655b(f, 0.0f, 1.0f)));
        return Unit.f51459a;
    }
}
