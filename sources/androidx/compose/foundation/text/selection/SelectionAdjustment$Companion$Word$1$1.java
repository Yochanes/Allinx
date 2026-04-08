package androidx.compose.foundation.text.selection;

import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m18302d2 = {"<anonymous>", "Landroidx/compose/ui/text/TextRange;", "Landroidx/compose/foundation/text/selection/SelectableInfo;", "it", "", "getBoundary-fzxv0v0", "(Landroidx/compose/foundation/text/selection/SelectableInfo;I)J"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class SelectionAdjustment$Companion$Word$1$1 implements BoundaryFunction {

    /* JADX INFO: renamed from: a */
    public static final SelectionAdjustment$Companion$Word$1$1 f9671a = new SelectionAdjustment$Companion$Word$1$1();

    @Override // androidx.compose.foundation.text.selection.BoundaryFunction
    /* JADX INFO: renamed from: a */
    public final long mo3550a(SelectableInfo selectableInfo, int i) {
        return selectableInfo.f9659f.m6401j(i);
    }
}
