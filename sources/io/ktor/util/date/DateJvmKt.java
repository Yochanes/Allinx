package io.ktor.util.date;

import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"ktor-utils"}, m18303k = 2, m18304mv = {1, 4, 2})
public final class DateJvmKt {

    /* JADX INFO: renamed from: a */
    public static final TimeZone f46585a = TimeZone.getTimeZone("GMT");

    /* JADX INFO: renamed from: a */
    public static final GMTDate m17196a(int i, int i2, int i3, int i4, Month month, int i5) {
        Intrinsics.m18599g(month, "month");
        Calendar calendar = Calendar.getInstance(f46585a, Locale.ROOT);
        Intrinsics.m18596d(calendar);
        calendar.set(1, i5);
        calendar.set(2, month.ordinal());
        calendar.set(5, i4);
        calendar.set(11, i3);
        calendar.set(12, i2);
        calendar.set(13, i);
        calendar.set(14, 0);
        return m17198c(calendar, null);
    }

    /* JADX INFO: renamed from: b */
    public static GMTDate m17197b() {
        Calendar calendar = Calendar.getInstance(f46585a, Locale.ROOT);
        Intrinsics.m18596d(calendar);
        return m17198c(calendar, null);
    }

    /* JADX INFO: renamed from: c */
    public static final GMTDate m17198c(Calendar calendar, Long l) {
        if (l != null) {
            calendar.setTimeInMillis(l.longValue());
        }
        return new GMTDate(calendar.get(13), calendar.get(12), calendar.get(11), WeekDay.values()[(calendar.get(7) + 5) % 7], calendar.get(5), calendar.get(6), Month.values()[calendar.get(2)], calendar.get(1), calendar.getTimeInMillis());
    }
}
