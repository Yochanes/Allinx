package androidx.compose.material3;

import androidx.compose.material3.internal.CalendarDate;
import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@ExperimentalMaterial3Api
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/compose/material3/DateRangePickerStateImpl;", "Landroidx/compose/material3/BaseDatePickerStateImpl;", "Landroidx/compose/material3/DateRangePickerState;", "Companion", "material3_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
@Stable
@SourceDebugExtension
final class DateRangePickerStateImpl extends BaseDatePickerStateImpl implements DateRangePickerState {

    /* JADX INFO: renamed from: e */
    public final MutableState f13260e;

    /* JADX INFO: renamed from: f */
    public final MutableState f13261f;

    /* JADX INFO: renamed from: g */
    public final MutableState f13262g;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/material3/DateRangePickerStateImpl$Companion;", "", "material3_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class Companion {
    }

    public DateRangePickerStateImpl(Long l, Long l2, Long l3, IntRange intRange, int i) {
        super(l3, intRange, null, null);
        this.f13260e = SnapshotStateKt.m4525g(null);
        this.f13261f = SnapshotStateKt.m4525g(null);
        CalendarModel calendarModel = this.f12224b;
        CalendarDate calendarDateMo4145b = l != null ? calendarModel.mo4145b(l.longValue()) : null;
        CalendarDate calendarDateMo4145b2 = l2 != null ? calendarModel.mo4145b(l2.longValue()) : null;
        if (calendarDateMo4145b != null) {
            int i2 = calendarDateMo4145b.f15535a;
            if (!intRange.m18653j(i2)) {
                throw new IllegalArgumentException(("The provided start date year (" + i2 + ") is out of the years range of " + intRange + '.').toString());
            }
        }
        if (calendarDateMo4145b2 != null) {
            int i3 = calendarDateMo4145b2.f15535a;
            if (!intRange.m18653j(i3)) {
                throw new IllegalArgumentException(("The provided end date year (" + i3 + ") is out of the years range of " + intRange + '.').toString());
            }
        }
        if (calendarDateMo4145b2 != null) {
            if (calendarDateMo4145b == null) {
                throw new IllegalArgumentException("An end date was provided without a start date.");
            }
            if (calendarDateMo4145b.f15538d > calendarDateMo4145b2.f15538d) {
                throw new IllegalArgumentException("The provided end date appears before the start date.");
            }
        }
        ((SnapshotMutableStateImpl) this.f13260e).setValue(calendarDateMo4145b);
        ((SnapshotMutableStateImpl) this.f13261f).setValue(calendarDateMo4145b2);
        this.f13262g = SnapshotStateKt.m4525g(new DisplayMode(i));
    }
}
