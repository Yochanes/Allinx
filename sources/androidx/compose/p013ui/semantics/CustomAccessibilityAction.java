package androidx.compose.p013ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/semantics/CustomAccessibilityAction;", "", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class CustomAccessibilityAction {

    /* JADX INFO: renamed from: a */
    public final String f19724a;

    /* JADX INFO: renamed from: b */
    public final Lambda f19725b;

    /* JADX WARN: Multi-variable type inference failed */
    public CustomAccessibilityAction(String str, Function0 function0) {
        this.f19724a = str;
        this.f19725b = (Lambda) function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomAccessibilityAction)) {
            return false;
        }
        CustomAccessibilityAction customAccessibilityAction = (CustomAccessibilityAction) obj;
        return Intrinsics.m18594b(this.f19724a, customAccessibilityAction.f19724a) && this.f19725b == customAccessibilityAction.f19725b;
    }

    public final int hashCode() {
        return this.f19725b.hashCode() + (this.f19724a.hashCode() * 31);
    }

    public final String toString() {
        return "CustomAccessibilityAction(label=" + this.f19724a + ", action=" + this.f19725b + ')';
    }
}
