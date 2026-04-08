package androidx.compose.foundation.text.selection;

import androidx.compose.p013ui.input.pointer.PointerInputChange;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m18302d2 = {"<anonymous>", "", "it", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "invoke"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
final class SelectionGesturesKt$mouseSelectionBtf2$shouldConsumeUp$2 extends Lambda implements Function1<PointerInputChange, Unit> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ MouseSelectionObserver f9724a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ SelectionAdjustment f9725b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Ref.BooleanRef f9726c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionGesturesKt$mouseSelectionBtf2$shouldConsumeUp$2(MouseSelectionObserver mouseSelectionObserver, SelectionAdjustment selectionAdjustment, Ref.BooleanRef booleanRef) {
        super(1);
        this.f9724a = mouseSelectionObserver;
        this.f9725b = selectionAdjustment;
        this.f9726c = booleanRef;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        PointerInputChange pointerInputChange = (PointerInputChange) obj;
        if (this.f9724a.mo3501c(pointerInputChange.f18299c, this.f9725b)) {
            pointerInputChange.m5562a();
            this.f9726c.f51655a = true;
        }
        return Unit.f51459a;
    }
}
