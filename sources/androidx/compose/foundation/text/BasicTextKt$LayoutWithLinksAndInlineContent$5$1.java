package androidx.compose.foundation.text;

import androidx.compose.p013ui.geometry.Rect;
import androidx.compose.runtime.MutableState;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, m18302d2 = {"<anonymous>", "", "Landroidx/compose/ui/geometry/Rect;", "invoke"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
final class BasicTextKt$LayoutWithLinksAndInlineContent$5$1 extends Lambda implements Function0<List<? extends Rect>> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ MutableState f8163a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicTextKt$LayoutWithLinksAndInlineContent$5$1(MutableState mutableState) {
        super(0);
        this.f8163a = mutableState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        MutableState mutableState = this.f8163a;
        if (mutableState != null) {
            return (List) mutableState.getF20325a();
        }
        return null;
    }
}
