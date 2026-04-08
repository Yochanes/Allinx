package androidx.compose.p013ui.text;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m18302d2 = {"<anonymous>", "Landroidx/compose/ui/text/TextRange;", "it", "", "invoke-VqIyPBM"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class SaversKt$TextRangeSaver$2 extends Lambda implements Function1<Object, TextRange> {

    /* JADX INFO: renamed from: a */
    public static final SaversKt$TextRangeSaver$2 f20048a = new SaversKt$TextRangeSaver$2(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Intrinsics.m18597e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        Integer num = obj2 != null ? (Integer) obj2 : null;
        Intrinsics.m18596d(num);
        int iIntValue = num.intValue();
        Object obj3 = list.get(1);
        Integer num2 = obj3 != null ? (Integer) obj3 : null;
        Intrinsics.m18596d(num2);
        return new TextRange(TextRangeKt.m6410a(iIntValue, num2.intValue()));
    }
}
