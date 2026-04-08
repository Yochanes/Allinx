package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m18302d2 = {"<anonymous>", "", "invoke"}, m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
final class TimePickerKt$TimeSelector$2$1 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f15181a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AnalogTimePickerState f15182b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimePickerKt$TimeSelector$2$1(int i, AnalogTimePickerState analogTimePickerState) {
        super(0);
        this.f15181a = i;
        this.f15182b = analogTimePickerState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        AnalogTimePickerState analogTimePickerState = this.f15182b;
        int iMo3857f = analogTimePickerState.f12022a.mo3857f();
        int i = this.f15181a;
        if (i != iMo3857f) {
            analogTimePickerState.mo3856e(i);
        }
        return Unit.f51459a;
    }
}
