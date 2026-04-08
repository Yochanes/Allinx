package androidx.compose.foundation;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.p013ui.Modifier;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"foundation_release"}, m18303k = 2, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class FocusableKt {
    /* JADX INFO: renamed from: a */
    public static final Modifier m2466a(Modifier modifier, boolean z2, MutableInteractionSource mutableInteractionSource) {
        return modifier.then(z2 ? new FocusableElement(mutableInteractionSource) : Modifier.Companion.f17180a);
    }
}
