package io.ktor.util.date;

import java.util.Calendar;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\b\u0002\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Lio/ktor/util/date/GMTDate;", "", "Companion", "ktor-utils"}, m18303k = 1, m18304mv = {1, 4, 2})
public final /* data */ class GMTDate implements Comparable<GMTDate> {

    /* JADX INFO: renamed from: a */
    public final int f46586a;

    /* JADX INFO: renamed from: b */
    public final int f46587b;

    /* JADX INFO: renamed from: c */
    public final int f46588c;

    /* JADX INFO: renamed from: d */
    public final WeekDay f46589d;

    /* JADX INFO: renamed from: f */
    public final int f46590f;

    /* JADX INFO: renamed from: g */
    public final int f46591g;

    /* JADX INFO: renamed from: i */
    public final Month f46592i;

    /* JADX INFO: renamed from: j */
    public final int f46593j;

    /* JADX INFO: renamed from: n */
    public final long f46594n;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/util/date/GMTDate$Companion;", "", "ktor-utils"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static final class Companion {
    }

    static {
        Calendar calendar = Calendar.getInstance(DateJvmKt.f46585a, Locale.ROOT);
        Intrinsics.m18596d(calendar);
        DateJvmKt.m17198c(calendar, 0L);
    }

    public GMTDate(int i, int i2, int i3, WeekDay dayOfWeek, int i4, int i5, Month month, int i6, long j) {
        Intrinsics.m18599g(dayOfWeek, "dayOfWeek");
        Intrinsics.m18599g(month, "month");
        this.f46586a = i;
        this.f46587b = i2;
        this.f46588c = i3;
        this.f46589d = dayOfWeek;
        this.f46590f = i4;
        this.f46591g = i5;
        this.f46592i = month;
        this.f46593j = i6;
        this.f46594n = j;
    }

    @Override // java.lang.Comparable
    public final int compareTo(GMTDate gMTDate) {
        GMTDate other = gMTDate;
        Intrinsics.m18599g(other, "other");
        return (this.f46594n > other.f46594n ? 1 : (this.f46594n == other.f46594n ? 0 : -1));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GMTDate)) {
            return false;
        }
        GMTDate gMTDate = (GMTDate) obj;
        return this.f46586a == gMTDate.f46586a && this.f46587b == gMTDate.f46587b && this.f46588c == gMTDate.f46588c && Intrinsics.m18594b(this.f46589d, gMTDate.f46589d) && this.f46590f == gMTDate.f46590f && this.f46591g == gMTDate.f46591g && Intrinsics.m18594b(this.f46592i, gMTDate.f46592i) && this.f46593j == gMTDate.f46593j && this.f46594n == gMTDate.f46594n;
    }

    public final int hashCode() {
        int i = ((((this.f46586a * 31) + this.f46587b) * 31) + this.f46588c) * 31;
        WeekDay weekDay = this.f46589d;
        int iHashCode = (((((i + (weekDay != null ? weekDay.hashCode() : 0)) * 31) + this.f46590f) * 31) + this.f46591g) * 31;
        Month month = this.f46592i;
        int iHashCode2 = (((iHashCode + (month != null ? month.hashCode() : 0)) * 31) + this.f46593j) * 31;
        long j = this.f46594n;
        return iHashCode2 + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GMTDate(seconds=");
        sb.append(this.f46586a);
        sb.append(", minutes=");
        sb.append(this.f46587b);
        sb.append(", hours=");
        sb.append(this.f46588c);
        sb.append(", dayOfWeek=");
        sb.append(this.f46589d);
        sb.append(", dayOfMonth=");
        sb.append(this.f46590f);
        sb.append(", dayOfYear=");
        sb.append(this.f46591g);
        sb.append(", month=");
        sb.append(this.f46592i);
        sb.append(", year=");
        sb.append(this.f46593j);
        sb.append(", timestamp=");
        return AbstractC0000a.m12i(this.f46594n, ")", sb);
    }
}
