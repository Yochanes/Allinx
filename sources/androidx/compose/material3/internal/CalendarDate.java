package androidx.compose.material3.internal;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/material3/internal/CalendarDate;", "", "material3_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final /* data */ class CalendarDate implements Comparable<CalendarDate> {

    /* JADX INFO: renamed from: a */
    public final int f15535a;

    /* JADX INFO: renamed from: b */
    public final int f15536b;

    /* JADX INFO: renamed from: c */
    public final int f15537c;

    /* JADX INFO: renamed from: d */
    public final long f15538d;

    public CalendarDate(int i, int i2, int i3, long j) {
        this.f15535a = i;
        this.f15536b = i2;
        this.f15537c = i3;
        this.f15538d = j;
    }

    @Override // java.lang.Comparable
    public final int compareTo(CalendarDate calendarDate) {
        long j = calendarDate.f15538d;
        long j2 = this.f15538d;
        if (j2 < j) {
            return -1;
        }
        return j2 == j ? 0 : 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarDate)) {
            return false;
        }
        CalendarDate calendarDate = (CalendarDate) obj;
        return this.f15535a == calendarDate.f15535a && this.f15536b == calendarDate.f15536b && this.f15537c == calendarDate.f15537c && this.f15538d == calendarDate.f15538d;
    }

    public final int hashCode() {
        return Long.hashCode(this.f15538d) + AbstractC0455a.m2228c(this.f15537c, AbstractC0455a.m2228c(this.f15536b, Integer.hashCode(this.f15535a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CalendarDate(year=");
        sb.append(this.f15535a);
        sb.append(", month=");
        sb.append(this.f15536b);
        sb.append(", dayOfMonth=");
        sb.append(this.f15537c);
        sb.append(", utcTimeMillis=");
        return AbstractC0455a.m2240o(sb, this.f15538d, ')');
    }
}
