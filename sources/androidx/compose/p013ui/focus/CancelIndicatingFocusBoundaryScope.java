package androidx.compose.p013ui.focus;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/focus/CancelIndicatingFocusBoundaryScope;", "Landroidx/compose/ui/focus/FocusEnterExitScope;", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class CancelIndicatingFocusBoundaryScope implements FocusEnterExitScope {

    /* JADX INFO: renamed from: a */
    public final int f17427a;

    /* JADX INFO: renamed from: b */
    public boolean f17428b;

    public CancelIndicatingFocusBoundaryScope(int i) {
        this.f17427a = i;
    }

    @Override // androidx.compose.p013ui.focus.FocusEnterExitScope
    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getF17427a() {
        return this.f17427a;
    }

    @Override // androidx.compose.p013ui.focus.FocusEnterExitScope
    /* JADX INFO: renamed from: b */
    public final void mo4964b() {
        this.f17428b = true;
    }
}
