package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.saveable.SaverScope;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0018\u0012\u0004\u0012\u00020\u0002\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u0018\u00010\u0001*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0002\b\b"}, m18302d2 = {"<anonymous>", "", "", "", "", "Landroidx/compose/runtime/saveable/SaverScope;", "it", "Landroidx/compose/foundation/lazy/layout/LazySaveableStateHolder;", "invoke"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
final class LazySaveableStateHolder$Companion$saver$1 extends Lambda implements Function2<SaverScope, LazySaveableStateHolder, Map<String, ? extends List<? extends Object>>> {

    /* JADX INFO: renamed from: a */
    public static final LazySaveableStateHolder$Companion$saver$1 f7419a = new LazySaveableStateHolder$Companion$saver$1(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Map mapMo3080b = ((LazySaveableStateHolder) obj2).mo3080b();
        if (mapMo3080b.isEmpty()) {
            return null;
        }
        return mapMo3080b;
    }
}
