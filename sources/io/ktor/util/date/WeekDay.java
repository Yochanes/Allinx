package io.ktor.util.date;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Lio/ktor/util/date/WeekDay;", "", "Companion", "ktor-utils"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class WeekDay {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ WeekDay[] f46604a = {new WeekDay("MONDAY", 0), new WeekDay("TUESDAY", 1), new WeekDay("WEDNESDAY", 2), new WeekDay("THURSDAY", 3), new WeekDay("FRIDAY", 4), new WeekDay("SATURDAY", 5), new WeekDay("SUNDAY", 6)};

    /* JADX INFO: Fake field, exist only in values array */
    WeekDay EF5;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/util/date/WeekDay$Companion;", "", "ktor-utils"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static final class Companion {
    }

    public static WeekDay valueOf(String str) {
        return (WeekDay) Enum.valueOf(WeekDay.class, str);
    }

    public static WeekDay[] values() {
        return (WeekDay[]) f46604a.clone();
    }
}
