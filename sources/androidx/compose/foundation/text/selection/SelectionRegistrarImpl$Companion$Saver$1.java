package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.saveable.SaverScope;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m18302d2 = {"<anonymous>", "", "Landroidx/compose/runtime/saveable/SaverScope;", "it", "Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;", "invoke", "(Landroidx/compose/runtime/saveable/SaverScope;Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;)Ljava/lang/Long;"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class SelectionRegistrarImpl$Companion$Saver$1 extends Lambda implements Function2<SaverScope, SelectionRegistrarImpl, Long> {

    /* JADX INFO: renamed from: a */
    public static final SelectionRegistrarImpl$Companion$Saver$1 f9885a = new SelectionRegistrarImpl$Companion$Saver$1(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return Long.valueOf(((SelectionRegistrarImpl) obj2).f9876d.get());
    }
}
