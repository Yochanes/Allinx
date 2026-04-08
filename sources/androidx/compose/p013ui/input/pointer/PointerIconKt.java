package androidx.compose.p013ui.input.pointer;

import androidx.compose.p013ui.Modifier;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"ui_release"}, m18303k = 2, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class PointerIconKt {
    /* JADX INFO: renamed from: a */
    public static Modifier m5556a(Modifier modifier, AndroidPointerIconType androidPointerIconType) {
        return modifier.then(new PointerHoverIconModifierElement(androidPointerIconType));
    }
}
