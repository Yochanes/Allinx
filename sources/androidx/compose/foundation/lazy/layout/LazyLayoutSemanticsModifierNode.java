package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.node.SemanticsModifierNode;
import androidx.compose.p013ui.semantics.AccessibilityAction;
import androidx.compose.p013ui.semantics.CollectionInfo;
import androidx.compose.p013ui.semantics.ScrollAxisRange;
import androidx.compose.p013ui.semantics.SemanticsActions;
import androidx.compose.p013ui.semantics.SemanticsProperties;
import androidx.compose.p013ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p013ui.semantics.SemanticsPropertyKey;
import androidx.compose.p013ui.semantics.SemanticsPropertyReceiver;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlin.reflect.KProperty0;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/SemanticsModifierNode;", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
final class LazyLayoutSemanticsModifierNode extends Modifier.Node implements SemanticsModifierNode {

    /* JADX INFO: renamed from: A */
    public Function1 f7399A;

    /* JADX INFO: renamed from: t */
    public KProperty0 f7400t;

    /* JADX INFO: renamed from: u */
    public LazyLayoutSemanticState f7401u;

    /* JADX INFO: renamed from: v */
    public Orientation f7402v;

    /* JADX INFO: renamed from: w */
    public boolean f7403w;

    /* JADX INFO: renamed from: x */
    public boolean f7404x;

    /* JADX INFO: renamed from: y */
    public ScrollAxisRange f7405y;

    /* JADX INFO: renamed from: z */
    public final Function1 f7406z = new LazyLayoutSemanticsModifierNode$indexForKeyMapping$1(this);

    public LazyLayoutSemanticsModifierNode(KProperty0 kProperty0, LazyLayoutSemanticState lazyLayoutSemanticState, Orientation orientation, boolean z2, boolean z3) {
        this.f7400t = kProperty0;
        this.f7401u = lazyLayoutSemanticState;
        this.f7402v = orientation;
        this.f7403w = z2;
        this.f7404x = z3;
        m3077X1();
    }

    @Override // androidx.compose.ui.Modifier.Node
    /* JADX INFO: renamed from: M1 */
    public final boolean mo2398M1() {
        return false;
    }

    /* JADX INFO: renamed from: X1 */
    public final void m3077X1() {
        this.f7405y = new ScrollAxisRange(new LazyLayoutSemanticsModifierNode$updateCachedSemanticsValues$1(this), new LazyLayoutSemanticsModifierNode$updateCachedSemanticsValues$2(this), this.f7404x);
        this.f7399A = this.f7403w ? new LazyLayoutSemanticsModifierNode$updateCachedSemanticsValues$3(this) : null;
    }

    @Override // androidx.compose.p013ui.node.SemanticsModifierNode
    /* JADX INFO: renamed from: t1 */
    public final void mo2410t1(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.m6306r(semanticsPropertyReceiver);
        semanticsPropertyReceiver.mo6263c(SemanticsProperties.f19794K, this.f7406z);
        if (this.f7402v == Orientation.f5829a) {
            ScrollAxisRange scrollAxisRange = this.f7405y;
            if (scrollAxisRange == null) {
                Intrinsics.m18606n("scrollAxisRange");
                throw null;
            }
            SemanticsPropertiesKt.m6308t(semanticsPropertyReceiver, scrollAxisRange);
        } else {
            ScrollAxisRange scrollAxisRange2 = this.f7405y;
            if (scrollAxisRange2 == null) {
                Intrinsics.m18606n("scrollAxisRange");
                throw null;
            }
            SemanticsPropertiesKt.m6299k(semanticsPropertyReceiver, scrollAxisRange2);
        }
        Function1 function1 = this.f7399A;
        if (function1 != null) {
            semanticsPropertyReceiver.mo6263c(SemanticsActions.f19743f, new AccessibilityAction(null, function1));
        }
        SemanticsPropertiesKt.m6293e(semanticsPropertyReceiver, new LazyLayoutSemanticsModifierNode$applySemantics$2(this));
        CollectionInfo collectionInfoMo2910f = this.f7401u.mo2910f();
        SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.f19802f;
        KProperty kProperty = SemanticsPropertiesKt.f19838a[21];
        semanticsPropertyKey.getClass();
        semanticsPropertyReceiver.mo6263c(semanticsPropertyKey, collectionInfoMo2910f);
    }
}
