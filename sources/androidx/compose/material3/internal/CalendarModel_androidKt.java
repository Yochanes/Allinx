package androidx.compose.material3.internal;

import android.os.Build;
import android.text.format.DateFormat;
import androidx.compose.material3.internal.CalendarModelImpl;
import androidx.compose.material3.internal.LegacyCalendarModelImpl;
import java.time.ZoneId;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"material3_release"}, m18303k = 2, m18304mv = {1, 8, 0}, m18306xi = 48)
@SourceDebugExtension
public final class CalendarModel_androidKt {
    /* JADX INFO: renamed from: a */
    public static final CalendarModel m4158a(Locale locale) {
        return Build.VERSION.SDK_INT >= 26 ? new CalendarModelImpl(locale) : new LegacyCalendarModelImpl(locale);
    }

    /* JADX INFO: renamed from: b */
    public static final String m4159b(long j, String str, Locale locale, LinkedHashMap linkedHashMap) {
        String str2 = "S:" + str + locale.toLanguageTag();
        Object bestDateTimePattern = linkedHashMap.get(str2);
        if (bestDateTimePattern == null) {
            bestDateTimePattern = DateFormat.getBestDateTimePattern(locale, str);
            linkedHashMap.put(str2, bestDateTimePattern);
        }
        String string = bestDateTimePattern.toString();
        if (Build.VERSION.SDK_INT >= 26) {
            ZoneId zoneId = CalendarModelImpl.f15540d;
            return CalendarModelImpl.Companion.m4156a(j, string, locale, linkedHashMap);
        }
        TimeZone timeZone = LegacyCalendarModelImpl.f15609d;
        return LegacyCalendarModelImpl.Companion.m4170a(j, string, locale, linkedHashMap);
    }
}
