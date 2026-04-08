package androidx.compose.p013ui.modifier;

import androidx.compose.p013ui.internal.InlineClassHelperKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/modifier/SingleLocalMap;", "Landroidx/compose/ui/modifier/ModifierLocalMap;", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class SingleLocalMap extends ModifierLocalMap {

    /* JADX INFO: renamed from: a */
    public final ModifierLocal f18613a;

    /* JADX INFO: renamed from: b */
    public final MutableState f18614b = SnapshotStateKt.m4525g(null);

    public SingleLocalMap(ModifierLocal modifierLocal) {
        this.f18613a = modifierLocal;
    }

    @Override // androidx.compose.p013ui.modifier.ModifierLocalMap
    /* JADX INFO: renamed from: a */
    public final boolean mo5692a(ModifierLocal modifierLocal) {
        return modifierLocal == this.f18613a;
    }

    @Override // androidx.compose.p013ui.modifier.ModifierLocalMap
    /* JADX INFO: renamed from: b */
    public final Object mo5693b(ProvidableModifierLocal providableModifierLocal) {
        if (providableModifierLocal != this.f18613a) {
            InlineClassHelperKt.m5597b("Check failed.");
        }
        Object f20325a = ((SnapshotMutableStateImpl) this.f18614b).getF20325a();
        if (f20325a == null) {
            return null;
        }
        return f20325a;
    }

    @Override // androidx.compose.p013ui.modifier.ModifierLocalMap
    /* JADX INFO: renamed from: c */
    public final void mo5694c(ModifierLocal modifierLocal, Object obj) {
        if (!(modifierLocal == this.f18613a)) {
            InlineClassHelperKt.m5597b("Check failed.");
        }
        ((SnapshotMutableStateImpl) this.f18614b).setValue(obj);
    }
}
