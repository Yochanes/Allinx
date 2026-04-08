package androidx.compose.material3.internal;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b \u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/material3/internal/CalendarModel;", "", "material3_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public abstract class CalendarModel {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f15539a = new LinkedHashMap();

    /* JADX INFO: renamed from: a */
    public abstract String mo4144a(long j, String str, Locale locale);

    /* JADX INFO: renamed from: b */
    public abstract CalendarDate mo4145b(long j);

    /* JADX INFO: renamed from: c */
    public abstract DateInputFormat mo4146c(Locale locale);

    /* JADX INFO: renamed from: d */
    public abstract int getF15610b();

    /* JADX INFO: renamed from: e */
    public abstract CalendarMonth mo4148e(int i, int i2);

    /* JADX INFO: renamed from: f */
    public abstract CalendarMonth mo4149f(long j);

    /* JADX INFO: renamed from: g */
    public abstract CalendarMonth mo4150g(CalendarDate calendarDate);

    /* JADX INFO: renamed from: h */
    public abstract CalendarDate mo4151h();

    /* JADX INFO: renamed from: i */
    public abstract List mo4152i();

    /* JADX INFO: renamed from: j */
    public abstract CalendarDate mo4153j(String str, String str2);

    /* JADX INFO: renamed from: k */
    public abstract CalendarMonth mo4154k(CalendarMonth calendarMonth, int i);
}
