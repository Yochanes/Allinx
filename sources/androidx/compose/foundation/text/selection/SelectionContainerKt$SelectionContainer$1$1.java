package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m18302d2 = {"<anonymous>", "", "it", "Landroidx/compose/foundation/text/selection/Selection;", "invoke"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
final class SelectionContainerKt$SelectionContainer$1$1 extends Lambda implements Function1<Selection, Unit> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ MutableState f9680a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionContainerKt$SelectionContainer$1$1(MutableState mutableState) {
        super(1);
        this.f9680a = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        this.f9680a.setValue((Selection) obj);
        return Unit.f51459a;
    }
}
