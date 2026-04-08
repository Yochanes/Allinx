package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m18302d2 = {"<anonymous>", "Landroidx/compose/material3/TimePickerStateImpl;", "invoke"}, m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
final class TimePickerKt$rememberTimePickerState$state$1$1 extends Lambda implements Function0<TimePickerStateImpl> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f15223a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f15224b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimePickerKt$rememberTimePickerState$state$1$1(int i, int i2) {
        super(0);
        this.f15223a = i;
        this.f15224b = i2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new TimePickerStateImpl(this.f15223a, this.f15224b, true);
    }
}
