package androidx.compose.runtime.saveable;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m18302d2 = {"<anonymous>", "", "Original", "Saveable", "Landroidx/compose/runtime/saveable/SaverScope;", "it", "invoke", "(Landroidx/compose/runtime/saveable/SaverScope;Ljava/lang/Object;)Ljava/lang/Object;"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
final class ListSaverKt$listSaver$1 extends Lambda implements Function2<SaverScope, Object, Object> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Function2 f16953a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListSaverKt$listSaver$1(Function2 function2) {
        super(2);
        this.f16953a = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        SaverScope saverScope = (SaverScope) obj;
        List list = (List) this.f16953a.invoke(saverScope, obj2);
        List list2 = list;
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            Object obj3 = list.get(i);
            if (obj3 != null && !saverScope.mo4753a(obj3)) {
                throw new IllegalArgumentException("item can't be saved");
            }
        }
        if (list2.isEmpty()) {
            return null;
        }
        return new ArrayList(list2);
    }
}
