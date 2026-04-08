package androidx.compose.p013ui.graphics;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.layout.Measurable;
import androidx.compose.p013ui.layout.MeasureResult;
import androidx.compose.p013ui.layout.MeasureScope;
import androidx.compose.p013ui.layout.Placeable;
import androidx.compose.p013ui.node.LayoutModifierNode;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/ui/graphics/SimpleGraphicsLayerModifier;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
final class SimpleGraphicsLayerModifier extends Modifier.Node implements LayoutModifierNode {

    /* JADX INFO: renamed from: A */
    public Shape f17660A;

    /* JADX INFO: renamed from: B */
    public boolean f17661B;

    /* JADX INFO: renamed from: C */
    public long f17662C;

    /* JADX INFO: renamed from: D */
    public long f17663D;

    /* JADX INFO: renamed from: E */
    public Function1 f17664E;

    /* JADX INFO: renamed from: t */
    public float f17665t;

    /* JADX INFO: renamed from: u */
    public float f17666u;

    /* JADX INFO: renamed from: v */
    public float f17667v;

    /* JADX INFO: renamed from: w */
    public float f17668w;

    /* JADX INFO: renamed from: x */
    public float f17669x;

    /* JADX INFO: renamed from: y */
    public float f17670y;

    /* JADX INFO: renamed from: z */
    public long f17671z;

    @Override // androidx.compose.ui.Modifier.Node
    /* JADX INFO: renamed from: M1 */
    public final boolean mo2398M1() {
        return false;
    }

    @Override // androidx.compose.p013ui.node.LayoutModifierNode
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final MeasureResult mo21913measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        Placeable placeableMo5611P = measurable.mo5611P(j);
        return measureScope.mo3065n1(placeableMo5611P.f18567a, placeableMo5611P.f18568b, MapsKt.m18481d(), new SimpleGraphicsLayerModifier$measure$1(placeableMo5611P, this));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SimpleGraphicsLayerModifier(scaleX=");
        sb.append(this.f17665t);
        sb.append(", scaleY=");
        sb.append(this.f17666u);
        sb.append(", alpha = ");
        sb.append(this.f17667v);
        sb.append(", translationX=0.0, translationY=0.0, shadowElevation=");
        sb.append(this.f17668w);
        sb.append(", rotationX=0.0, rotationY=0.0, rotationZ=");
        sb.append(this.f17669x);
        sb.append(", cameraDistance=");
        sb.append(this.f17670y);
        sb.append(", transformOrigin=");
        sb.append((Object) TransformOrigin.m5251d(this.f17671z));
        sb.append(", shape=");
        sb.append(this.f17660A);
        sb.append(", clip=");
        sb.append(this.f17661B);
        sb.append(", renderEffect=null, ambientShadowColor=");
        AbstractC0455a.m2223B(this.f17662C, ", spotShadowColor=", sb);
        sb.append((Object) Color.m5187i(this.f17663D));
        sb.append(", compositingStrategy=CompositingStrategy(value=0))");
        return sb.toString();
    }
}
