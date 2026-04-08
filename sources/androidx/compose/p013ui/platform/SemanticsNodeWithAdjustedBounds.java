package androidx.compose.p013ui.platform;

import android.graphics.Rect;
import androidx.compose.p013ui.semantics.SemanticsNode;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/platform/SemanticsNodeWithAdjustedBounds;", "", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class SemanticsNodeWithAdjustedBounds {

    /* JADX INFO: renamed from: a */
    public final SemanticsNode f19526a;

    /* JADX INFO: renamed from: b */
    public final Rect f19527b;

    public SemanticsNodeWithAdjustedBounds(SemanticsNode semanticsNode, Rect rect) {
        this.f19526a = semanticsNode;
        this.f19527b = rect;
    }
}
