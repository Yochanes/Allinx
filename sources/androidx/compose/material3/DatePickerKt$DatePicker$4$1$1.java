package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m18302d2 = {"<anonymous>", "", "displayMode", "Landroidx/compose/material3/DisplayMode;", "invoke-vCnGnXg", "(I)V"}, m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
final class DatePickerKt$DatePicker$4$1$1 extends Lambda implements Function1<DisplayMode, Unit> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ DatePickerState f12825a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatePickerKt$DatePicker$4$1$1(DatePickerState datePickerState) {
        super(1);
        this.f12825a = datePickerState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        this.f12825a.mo3931a(((DisplayMode) obj).f13277a);
        return Unit.f51459a;
    }
}
