package androidx.compose.material3;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0001\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, m18302d2 = {"<anonymous>", "Landroidx/compose/material3/DateRangePickerStateImpl;", "value", "", "", "invoke"}, m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
final class DateRangePickerStateImpl$Companion$Saver$2 extends Lambda implements Function1<List, DateRangePickerStateImpl> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List list = (List) obj;
        Long l = (Long) list.get(0);
        Long l2 = (Long) list.get(1);
        Long l3 = (Long) list.get(2);
        Object obj2 = list.get(3);
        Intrinsics.m18597e(obj2, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue = ((Integer) obj2).intValue();
        Object obj3 = list.get(4);
        Intrinsics.m18597e(obj3, "null cannot be cast to non-null type kotlin.Int");
        IntRange intRange = new IntRange(iIntValue, ((Integer) obj3).intValue(), 1);
        Object obj4 = list.get(5);
        Intrinsics.m18597e(obj4, "null cannot be cast to non-null type kotlin.Int");
        return new DateRangePickerStateImpl(l, l2, l3, intRange, ((Integer) obj4).intValue());
    }
}
