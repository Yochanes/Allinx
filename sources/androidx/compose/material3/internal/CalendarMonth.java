package androidx.compose.material3.internal;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/material3/internal/CalendarMonth;", "", "material3_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final /* data */ class CalendarMonth {

    /* JADX INFO: renamed from: a */
    public final int f15543a;

    /* JADX INFO: renamed from: b */
    public final int f15544b;

    /* JADX INFO: renamed from: c */
    public final int f15545c;

    /* JADX INFO: renamed from: d */
    public final int f15546d;

    /* JADX INFO: renamed from: e */
    public final long f15547e;

    /* JADX INFO: renamed from: f */
    public final long f15548f;

    public CalendarMonth(int i, int i2, int i3, int i4, long j) {
        this.f15543a = i;
        this.f15544b = i2;
        this.f15545c = i3;
        this.f15546d = i4;
        this.f15547e = j;
        this.f15548f = ((((long) i3) * 86400000) + j) - 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarMonth)) {
            return false;
        }
        CalendarMonth calendarMonth = (CalendarMonth) obj;
        return this.f15543a == calendarMonth.f15543a && this.f15544b == calendarMonth.f15544b && this.f15545c == calendarMonth.f15545c && this.f15546d == calendarMonth.f15546d && this.f15547e == calendarMonth.f15547e;
    }

    public final int hashCode() {
        return Long.hashCode(this.f15547e) + AbstractC0455a.m2228c(this.f15546d, AbstractC0455a.m2228c(this.f15545c, AbstractC0455a.m2228c(this.f15544b, Integer.hashCode(this.f15543a) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CalendarMonth(year=");
        sb.append(this.f15543a);
        sb.append(", month=");
        sb.append(this.f15544b);
        sb.append(", numberOfDays=");
        sb.append(this.f15545c);
        sb.append(", daysFromStartOfWeekToFirstOfMonth=");
        sb.append(this.f15546d);
        sb.append(", startUtcTimeMillis=");
        return AbstractC0455a.m2240o(sb, this.f15547e, ')');
    }
}
