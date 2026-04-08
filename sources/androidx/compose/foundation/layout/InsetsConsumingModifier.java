package androidx.compose.foundation.layout;

import androidx.compose.p013ui.modifier.ModifierLocalConsumer;
import androidx.compose.p013ui.modifier.ModifierLocalProvider;
import androidx.compose.p013ui.modifier.ModifierLocalReadScope;
import androidx.compose.p013ui.modifier.ProvidableModifierLocal;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Stable
@Metadata(m18301d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b3\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m18302d2 = {"Landroidx/compose/foundation/layout/InsetsConsumingModifier;", "Landroidx/compose/ui/modifier/ModifierLocalConsumer;", "Landroidx/compose/ui/modifier/ModifierLocalProvider;", "Landroidx/compose/foundation/layout/WindowInsets;", "Landroidx/compose/foundation/layout/PaddingValuesConsumingModifier;", "Landroidx/compose/foundation/layout/UnionInsetsConsumingModifier;", "foundation-layout_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
abstract class InsetsConsumingModifier implements ModifierLocalConsumer, ModifierLocalProvider<WindowInsets> {

    /* JADX INFO: renamed from: a */
    public final MutableState f6449a = SnapshotStateKt.m4525g(new FixedIntInsets());

    /* JADX INFO: renamed from: a */
    public abstract WindowInsets mo2778a(WindowInsets windowInsets);

    @Override // androidx.compose.p013ui.modifier.ModifierLocalProvider
    public final ProvidableModifierLocal getKey() {
        return WindowInsetsPaddingKt.f6691a;
    }

    @Override // androidx.compose.p013ui.modifier.ModifierLocalProvider
    public final Object getValue() {
        return (WindowInsets) ((SnapshotMutableStateImpl) this.f6449a).getF20325a();
    }

    @Override // androidx.compose.p013ui.modifier.ModifierLocalConsumer
    /* JADX INFO: renamed from: p0 */
    public final void mo2759p0(ModifierLocalReadScope modifierLocalReadScope) {
        ((SnapshotMutableStateImpl) this.f6449a).setValue(mo2778a((WindowInsets) modifierLocalReadScope.mo5697s(WindowInsetsPaddingKt.f6691a)));
    }
}
