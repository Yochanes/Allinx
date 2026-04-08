package androidx.compose.material3;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0001\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, m18302d2 = {"<anonymous>", "Landroidx/compose/material3/TimePickerStateImpl;", "value", "", "", "invoke"}, m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
final class TimePickerStateImpl$Companion$Saver$2 extends Lambda implements Function1<List, TimePickerStateImpl> {

    /* JADX INFO: renamed from: a */
    public static final TimePickerStateImpl$Companion$Saver$2 f15232a = new TimePickerStateImpl$Companion$Saver$2(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List list = (List) obj;
        Object obj2 = list.get(0);
        Intrinsics.m18597e(obj2, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue = ((Integer) obj2).intValue();
        Object obj3 = list.get(1);
        Intrinsics.m18597e(obj3, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue2 = ((Integer) obj3).intValue();
        Object obj4 = list.get(2);
        Intrinsics.m18597e(obj4, "null cannot be cast to non-null type kotlin.Boolean");
        return new TimePickerStateImpl(iIntValue, iIntValue2, ((Boolean) obj4).booleanValue());
    }
}
