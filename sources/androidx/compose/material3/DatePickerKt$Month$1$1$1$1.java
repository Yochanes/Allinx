package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m18302d2 = {"<anonymous>", "", "invoke"}, m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
final class DatePickerKt$Month$1$1$1$1 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Function1 f12950a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ long f12951b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatePickerKt$Month$1$1$1$1(Function1 function1, long j) {
        super(0);
        this.f12950a = function1;
        this.f12951b = j;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f12950a.invoke(Long.valueOf(this.f12951b));
        return Unit.f51459a;
    }
}
