package androidx.compose.p013ui;

import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.layout.Measurable;
import androidx.compose.p013ui.layout.MeasureResult;
import androidx.compose.p013ui.layout.MeasureScope;
import androidx.compose.p013ui.layout.Placeable;
import androidx.compose.p013ui.node.LayoutModifierNode;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/ui/ZIndexNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class ZIndexNode extends Modifier.Node implements LayoutModifierNode {

    /* JADX INFO: renamed from: t */
    public float f17206t;

    @Override // androidx.compose.p013ui.node.LayoutModifierNode
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final MeasureResult mo21913measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        Placeable placeableMo5611P = measurable.mo5611P(j);
        return measureScope.mo3065n1(placeableMo5611P.f18567a, placeableMo5611P.f18568b, MapsKt.m18481d(), new ZIndexNode$measure$1(placeableMo5611P, this));
    }

    public final String toString() {
        return AbstractC0000a.m16m(new StringBuilder("ZIndexModifier(zIndex="), this.f17206t, ')');
    }
}
