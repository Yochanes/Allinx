package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.SelectionRegistrar;
import androidx.compose.foundation.text.selection.SelectionRegistrarKt;
import androidx.compose.runtime.saveable.SaverScope;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m18302d2 = {"<anonymous>", "", "Landroidx/compose/runtime/saveable/SaverScope;", "it", "invoke", "(Landroidx/compose/runtime/saveable/SaverScope;J)Ljava/lang/Long;"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
final class BasicTextKt$selectionIdSaver$1 extends Lambda implements Function2<SaverScope, Long, Long> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ SelectionRegistrar f8184a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicTextKt$selectionIdSaver$1(SelectionRegistrar selectionRegistrar) {
        super(2);
        this.f8184a = selectionRegistrar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        long jLongValue = ((Number) obj2).longValue();
        if (SelectionRegistrarKt.m3643a(this.f8184a, jLongValue)) {
            return Long.valueOf(jLongValue);
        }
        return null;
    }
}
