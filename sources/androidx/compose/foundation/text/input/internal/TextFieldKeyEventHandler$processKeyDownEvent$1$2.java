package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.input.internal.selection.TextFieldPreparedSelection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m18302d2 = {"<anonymous>", "", "Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;", "invoke"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
final class TextFieldKeyEventHandler$processKeyDownEvent$1$2 extends Lambda implements Function1<TextFieldPreparedSelection, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        TextFieldPreparedSelection textFieldPreparedSelection = (TextFieldPreparedSelection) obj;
        if (textFieldPreparedSelection.m3473a()) {
            textFieldPreparedSelection.m3474b();
        } else {
            textFieldPreparedSelection.m3475c();
        }
        return Unit.f51459a;
    }
}
