package androidx.compose.p013ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u0000*\u000e\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0004¨\u0006\u0005"}, m18302d2 = {"Landroidx/compose/ui/semantics/AccessibilityAction;", "Lkotlin/Function;", "", "T", "", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class AccessibilityAction<T extends Function<? extends Boolean>> {

    /* JADX INFO: renamed from: a */
    public final String f19714a;

    /* JADX INFO: renamed from: b */
    public final Function f19715b;

    public AccessibilityAction(String str, Function function) {
        this.f19714a = str;
        this.f19715b = function;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccessibilityAction)) {
            return false;
        }
        AccessibilityAction accessibilityAction = (AccessibilityAction) obj;
        return Intrinsics.m18594b(this.f19714a, accessibilityAction.f19714a) && Intrinsics.m18594b(this.f19715b, accessibilityAction.f19715b);
    }

    public final int hashCode() {
        String str = this.f19714a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        Function function = this.f19715b;
        return iHashCode + (function != null ? function.hashCode() : 0);
    }

    public final String toString() {
        return "AccessibilityAction(label=" + this.f19714a + ", action=" + this.f19715b + ')';
    }
}
