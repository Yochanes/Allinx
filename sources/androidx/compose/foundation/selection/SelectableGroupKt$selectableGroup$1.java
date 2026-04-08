package androidx.compose.foundation.selection;

import androidx.compose.p013ui.semantics.SemanticsProperties;
import androidx.compose.p013ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p013ui.semantics.SemanticsPropertyKey;
import androidx.compose.p013ui.semantics.SemanticsPropertyReceiver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KProperty;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m18302d2 = {"<anonymous>", "", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "invoke"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
final class SelectableGroupKt$selectableGroup$1 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

    /* JADX INFO: renamed from: a */
    public static final SelectableGroupKt$selectableGroup$1 f7945a = new SelectableGroupKt$selectableGroup$1(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        KProperty[] kPropertyArr = SemanticsPropertiesKt.f19838a;
        SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.f19801e;
        Unit unit = Unit.f51459a;
        ((SemanticsPropertyReceiver) obj).mo6263c(semanticsPropertyKey, unit);
        return unit;
    }
}
