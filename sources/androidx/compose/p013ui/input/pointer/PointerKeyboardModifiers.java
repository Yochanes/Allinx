package androidx.compose.p013ui.input.pointer;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00060\u0003j\u0002`\u0004¨\u0006\u0005"}, m18302d2 = {"Landroidx/compose/ui/input/pointer/PointerKeyboardModifiers;", "", "packedValue", "", "Landroidx/compose/ui/input/pointer/NativePointerKeyboardModifiers;", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@JvmInline
public final class PointerKeyboardModifiers {

    /* JADX INFO: renamed from: a */
    public final int f18353a;

    public /* synthetic */ PointerKeyboardModifiers(int i) {
        this.f18353a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof PointerKeyboardModifiers) {
            return this.f18353a == ((PointerKeyboardModifiers) obj).f18353a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f18353a);
    }

    public final String toString() {
        return "PointerKeyboardModifiers(packedValue=" + this.f18353a + ')';
    }
}
