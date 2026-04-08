package androidx.compose.foundation.text;

import androidx.compose.p013ui.geometry.Rect;
import androidx.compose.runtime.MutableState;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: androidx.compose.foundation.text.BasicTextKt$LayoutWithLinksAndInlineContent$onPlaceholderLayout$1$1 */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, m18302d2 = {"<anonymous>", "", "it", "", "Landroidx/compose/ui/geometry/Rect;", "invoke"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
final class C0674xe0dd42a6 extends Lambda implements Function1<List<? extends Rect>, Unit> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ MutableState f8180a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0674xe0dd42a6(MutableState mutableState) {
        super(1);
        this.f8180a = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List list = (List) obj;
        MutableState mutableState = this.f8180a;
        if (mutableState != null) {
            mutableState.setValue(list);
        }
        return Unit.f51459a;
    }
}
