package androidx.compose.material3.internal;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/material3/internal/DateInputFormat;", "", "material3_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final /* data */ class DateInputFormat {

    /* JADX INFO: renamed from: a */
    public final String f15549a;

    /* JADX INFO: renamed from: b */
    public final char f15550b;

    /* JADX INFO: renamed from: c */
    public final String f15551c;

    public DateInputFormat(String str, char c2) {
        this.f15549a = str;
        this.f15550b = c2;
        this.f15551c = StringsKt.m20411I(str, String.valueOf(c2), "");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DateInputFormat)) {
            return false;
        }
        DateInputFormat dateInputFormat = (DateInputFormat) obj;
        return Intrinsics.m18594b(this.f15549a, dateInputFormat.f15549a) && this.f15550b == dateInputFormat.f15550b;
    }

    public final int hashCode() {
        return Character.hashCode(this.f15550b) + (this.f15549a.hashCode() * 31);
    }

    public final String toString() {
        return "DateInputFormat(patternWithDelimiters=" + this.f15549a + ", delimiter=" + this.f15550b + ')';
    }
}
