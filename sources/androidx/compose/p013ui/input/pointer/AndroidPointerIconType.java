package androidx.compose.p013ui.input.pointer;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/input/pointer/AndroidPointerIconType;", "Landroidx/compose/ui/input/pointer/PointerIcon;", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class AndroidPointerIconType implements PointerIcon {

    /* JADX INFO: renamed from: b */
    public final int f18243b;

    public AndroidPointerIconType(int i) {
        this.f18243b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!AndroidPointerIconType.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.m18597e(obj, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIconType");
        return this.f18243b == ((AndroidPointerIconType) obj).f18243b;
    }

    /* JADX INFO: renamed from: hashCode, reason: from getter */
    public final int getF18243b() {
        return this.f18243b;
    }

    public final String toString() {
        return AbstractC0000a.m17n(new StringBuilder("AndroidPointerIcon(type="), this.f18243b, ')');
    }
}
