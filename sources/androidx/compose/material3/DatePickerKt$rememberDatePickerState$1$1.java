package androidx.compose.material3;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m18302d2 = {"<anonymous>", "Landroidx/compose/material3/DatePickerStateImpl;", "invoke"}, m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
final class DatePickerKt$rememberDatePickerState$1$1 extends Lambda implements Function0<DatePickerStateImpl> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Long f13089a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Long f13090b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ IntRange f13091c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ DatePickerDefaults$AllDates$1 f13092d;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Locale f13093f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatePickerKt$rememberDatePickerState$1$1(Long l, Long l2, IntRange intRange, DatePickerDefaults$AllDates$1 datePickerDefaults$AllDates$1, Locale locale) {
        super(0);
        this.f13089a = l;
        this.f13090b = l2;
        this.f13091c = intRange;
        this.f13092d = datePickerDefaults$AllDates$1;
        this.f13093f = locale;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new DatePickerStateImpl(this.f13089a, this.f13090b, this.f13091c, 0, this.f13092d, this.f13093f);
    }
}
