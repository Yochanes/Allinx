package androidx.compose.p013ui.semantics;

import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.node.ModifierNodeElement;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/ui/semantics/EmptySemanticsElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/semantics/EmptySemanticsModifier;", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class EmptySemanticsElement extends ModifierNodeElement<EmptySemanticsModifier> {

    /* JADX INFO: renamed from: a */
    public final EmptySemanticsModifier f19726a;

    public EmptySemanticsElement(EmptySemanticsModifier emptySemanticsModifier) {
        this.f19726a = emptySemanticsModifier;
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    /* JADX INFO: renamed from: a */
    public final Modifier.Node mo2159a() {
        return this.f19726a;
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ void mo2160b(Modifier.Node node) {
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return System.identityHashCode(this);
    }
}
