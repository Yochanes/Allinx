package androidx.compose.material3;

import androidx.compose.material3.internal.DateInputFormat;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.ranges.IntRange;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Stable
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/material3/DateInputValidator;", "", "material3_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class DateInputValidator {

    /* JADX INFO: renamed from: a */
    public final IntRange f12723a;

    /* JADX INFO: renamed from: b */
    public final SelectableDates f12724b;

    /* JADX INFO: renamed from: c */
    public final DateInputFormat f12725c;

    /* JADX INFO: renamed from: d */
    public final DatePickerFormatter f12726d;

    /* JADX INFO: renamed from: e */
    public final String f12727e;

    /* JADX INFO: renamed from: f */
    public final String f12728f;

    /* JADX INFO: renamed from: g */
    public final String f12729g;

    /* JADX INFO: renamed from: h */
    public Long f12730h = null;

    /* JADX INFO: renamed from: i */
    public Long f12731i = null;

    public DateInputValidator(IntRange intRange, SelectableDates selectableDates, DateInputFormat dateInputFormat, DatePickerFormatter datePickerFormatter, String str, String str2, String str3, String str4) {
        this.f12723a = intRange;
        this.f12724b = selectableDates;
        this.f12725c = dateInputFormat;
        this.f12726d = datePickerFormatter;
        this.f12727e = str;
        this.f12728f = str2;
        this.f12729g = str4;
    }
}
