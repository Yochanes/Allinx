package androidx.compose.material3;

import androidx.compose.material3.internal.CalendarModel_androidKt;
import androidx.compose.runtime.Immutable;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/material3/DatePickerFormatterImpl;", "Landroidx/compose/material3/DatePickerFormatter;", "material3_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
final class DatePickerFormatterImpl implements DatePickerFormatter {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f12797a = new LinkedHashMap();

    @Override // androidx.compose.material3.DatePickerFormatter
    /* JADX INFO: renamed from: a */
    public final String mo3914a(Long l, Locale locale, boolean z2) {
        if (l == null) {
            return null;
        }
        return CalendarModel_androidKt.m4159b(l.longValue(), z2 ? "yMMMMEEEEd" : "yMMMd", locale, this.f12797a);
    }

    @Override // androidx.compose.material3.DatePickerFormatter
    /* JADX INFO: renamed from: b */
    public final String mo3915b(Long l, Locale locale) {
        return CalendarModel_androidKt.m4159b(l.longValue(), "yMMMM", locale, this.f12797a);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof DatePickerFormatterImpl)) {
            return false;
        }
        ((DatePickerFormatterImpl) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return 436998964;
    }
}
