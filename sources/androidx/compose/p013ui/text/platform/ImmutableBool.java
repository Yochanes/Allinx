package androidx.compose.p013ui.text.platform;

import androidx.compose.runtime.State;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/ui/text/platform/ImmutableBool;", "Landroidx/compose/runtime/State;", "", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
final class ImmutableBool implements State<Boolean> {

    /* JADX INFO: renamed from: a */
    public final boolean f20485a;

    public ImmutableBool(boolean z2) {
        this.f20485a = z2;
    }

    @Override // androidx.compose.runtime.State
    public final Object getValue() {
        return Boolean.valueOf(this.f20485a);
    }
}
