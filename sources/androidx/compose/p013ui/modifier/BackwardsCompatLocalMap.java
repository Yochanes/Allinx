package androidx.compose.p013ui.modifier;

import androidx.compose.p013ui.internal.InlineClassHelperKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/modifier/BackwardsCompatLocalMap;", "Landroidx/compose/ui/modifier/ModifierLocalMap;", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class BackwardsCompatLocalMap extends ModifierLocalMap {

    /* JADX INFO: renamed from: a */
    public ModifierLocalProvider f18603a;

    @Override // androidx.compose.p013ui.modifier.ModifierLocalMap
    /* JADX INFO: renamed from: a */
    public final boolean mo5692a(ModifierLocal modifierLocal) {
        return modifierLocal == this.f18603a.getKey();
    }

    @Override // androidx.compose.p013ui.modifier.ModifierLocalMap
    /* JADX INFO: renamed from: b */
    public final Object mo5693b(ProvidableModifierLocal providableModifierLocal) {
        if (providableModifierLocal != this.f18603a.getKey()) {
            InlineClassHelperKt.m5597b("Check failed.");
        }
        return this.f18603a.getValue();
    }

    @Override // androidx.compose.p013ui.modifier.ModifierLocalMap
    /* JADX INFO: renamed from: c */
    public final void mo5694c(ModifierLocal modifierLocal, Object obj) {
        throw new IllegalStateException("Set is not allowed on a backwards compat provider");
    }
}
