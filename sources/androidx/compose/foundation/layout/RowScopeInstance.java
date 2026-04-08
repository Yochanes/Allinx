package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.internal.InlineClassHelperKt;
import androidx.compose.p013ui.Alignment;
import androidx.compose.p013ui.BiasAlignment;
import androidx.compose.p013ui.Modifier;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/layout/RowScopeInstance;", "Landroidx/compose/foundation/layout/RowScope;", "foundation-layout_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class RowScopeInstance implements RowScope {

    /* JADX INFO: renamed from: a */
    public static final RowScopeInstance f6554a = new RowScopeInstance();

    @Override // androidx.compose.foundation.layout.RowScope
    /* JADX INFO: renamed from: a */
    public final Modifier mo2761a(Modifier modifier, float f, boolean z2) {
        if (f <= 0.0d) {
            InlineClassHelperKt.m2896a("invalid weight; must be greater than zero");
        }
        if (f > Float.MAX_VALUE) {
            f = Float.MAX_VALUE;
        }
        return modifier.then(new LayoutWeightElement(f, z2));
    }

    /* JADX INFO: renamed from: c */
    public final Modifier m2805c(Modifier modifier, Alignment.Vertical vertical) {
        return modifier.then(new VerticalAlignElement((BiasAlignment.Vertical) vertical));
    }
}
