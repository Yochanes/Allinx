package androidx.compose.material3;

import androidx.compose.material3.internal.CalendarDate;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.ranges.IntRange;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Stable
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/compose/material3/DatePickerStateImpl;", "Landroidx/compose/material3/BaseDatePickerStateImpl;", "Landroidx/compose/material3/DatePickerState;", "Companion", "material3_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
final class DatePickerStateImpl extends BaseDatePickerStateImpl implements DatePickerState {

    /* JADX INFO: renamed from: e */
    public final MutableState f13099e;

    /* JADX INFO: renamed from: f */
    public final MutableState f13100f;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/material3/DatePickerStateImpl$Companion;", "", "material3_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class Companion {
    }

    public DatePickerStateImpl(Long l, Long l2, IntRange intRange, int i, DatePickerDefaults$AllDates$1 datePickerDefaults$AllDates$1, Locale locale) {
        CalendarDate calendarDateMo4145b;
        super(l2, intRange, datePickerDefaults$AllDates$1, locale);
        if (l != null) {
            calendarDateMo4145b = this.f12224b.mo4145b(l.longValue());
            int i2 = calendarDateMo4145b.f15535a;
            if (!intRange.m18653j(i2)) {
                throw new IllegalArgumentException(("The provided initial date's year (" + i2 + ") is out of the years range of " + intRange + '.').toString());
            }
        } else {
            calendarDateMo4145b = null;
        }
        this.f13099e = SnapshotStateKt.m4525g(calendarDateMo4145b);
        this.f13100f = SnapshotStateKt.m4525g(new DisplayMode(i));
    }

    @Override // androidx.compose.material3.DatePickerState
    /* JADX INFO: renamed from: a */
    public final void mo3931a(int i) {
        Long lMo3936f = mo3936f();
        if (lMo3936f != null) {
            m3872c(this.f12224b.mo4149f(lMo3936f.longValue()).f15547e);
        }
        ((SnapshotMutableStateImpl) this.f13100f).setValue(new DisplayMode(i));
    }

    @Override // androidx.compose.material3.DatePickerState
    /* JADX INFO: renamed from: b */
    public final int mo3932b() {
        return ((DisplayMode) ((SnapshotMutableStateImpl) this.f13100f).getF20325a()).f13277a;
    }

    @Override // androidx.compose.material3.DatePickerState
    /* JADX INFO: renamed from: f */
    public final Long mo3936f() {
        CalendarDate calendarDate = (CalendarDate) ((SnapshotMutableStateImpl) this.f13099e).getF20325a();
        if (calendarDate != null) {
            return Long.valueOf(calendarDate.f15538d);
        }
        return null;
    }

    @Override // androidx.compose.material3.DatePickerState
    /* JADX INFO: renamed from: h */
    public final void mo3938h(Long l) {
        MutableState mutableState = this.f13099e;
        if (l == null) {
            ((SnapshotMutableStateImpl) mutableState).setValue(null);
            return;
        }
        CalendarDate calendarDateMo4145b = this.f12224b.mo4145b(l.longValue());
        IntRange intRange = this.f12223a;
        int i = calendarDateMo4145b.f15535a;
        if (intRange.m18653j(i)) {
            ((SnapshotMutableStateImpl) mutableState).setValue(calendarDateMo4145b);
            return;
        }
        throw new IllegalArgumentException(("The provided date's year (" + i + ") is out of the years range of " + intRange + '.').toString());
    }
}
