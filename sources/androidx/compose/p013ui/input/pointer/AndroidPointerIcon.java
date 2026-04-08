package androidx.compose.p013ui.input.pointer;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/input/pointer/AndroidPointerIcon;", "Landroidx/compose/ui/input/pointer/PointerIcon;", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class AndroidPointerIcon implements PointerIcon {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!AndroidPointerIcon.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.m18597e(obj, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIcon");
        return true;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return "AndroidPointerIcon(pointerIcon=null)";
    }
}
