package androidx.compose.p013ui.semantics;

import kotlin.Function;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u0001\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001H\n¢\u0006\u0002\b\u0007"}, m18302d2 = {"<anonymous>", "Landroidx/compose/ui/semantics/AccessibilityAction;", "T", "Lkotlin/Function;", "", "parentValue", "childValue", "invoke"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class SemanticsPropertiesKt$ActionPropertyKey$1 extends Lambda implements Function2<AccessibilityAction<Function<? extends Boolean>>, AccessibilityAction<Function<? extends Boolean>>, AccessibilityAction<Function<? extends Boolean>>> {

    /* JADX INFO: renamed from: a */
    public static final SemanticsPropertiesKt$ActionPropertyKey$1 f19839a = new SemanticsPropertiesKt$ActionPropertyKey$1(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String str;
        Function function;
        AccessibilityAction accessibilityAction = (AccessibilityAction) obj;
        AccessibilityAction accessibilityAction2 = (AccessibilityAction) obj2;
        if (accessibilityAction == null || (str = accessibilityAction.f19714a) == null) {
            str = accessibilityAction2.f19714a;
        }
        if (accessibilityAction == null || (function = accessibilityAction.f19715b) == null) {
            function = accessibilityAction2.f19715b;
        }
        return new AccessibilityAction(str, function);
    }
}
