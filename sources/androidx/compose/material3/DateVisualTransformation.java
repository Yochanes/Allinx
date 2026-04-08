package androidx.compose.material3;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.material3.internal.DateInputFormat;
import androidx.compose.p013ui.text.AnnotatedString;
import androidx.compose.p013ui.text.input.TransformedText;
import androidx.compose.p013ui.text.input.VisualTransformation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/material3/DateVisualTransformation;", "Landroidx/compose/ui/text/input/VisualTransformation;", "material3_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
@SourceDebugExtension
final class DateVisualTransformation implements VisualTransformation {

    /* JADX INFO: renamed from: a */
    public final DateInputFormat f13263a;

    /* JADX INFO: renamed from: b */
    public final int f13264b;

    /* JADX INFO: renamed from: c */
    public final int f13265c;

    /* JADX INFO: renamed from: d */
    public final int f13266d;

    /* JADX INFO: renamed from: f */
    public final DateVisualTransformation$dateOffsetTranslator$1 f13267f;

    public DateVisualTransformation(DateInputFormat dateInputFormat) {
        this.f13263a = dateInputFormat;
        String str = dateInputFormat.f15549a;
        char c2 = dateInputFormat.f15550b;
        this.f13264b = StringsKt.m20445u(str, c2, 0, 6);
        this.f13265c = StringsKt.m20403A(str, c2, 0, 6);
        this.f13266d = dateInputFormat.f15551c.length();
        this.f13267f = new DateVisualTransformation$dateOffsetTranslator$1(this);
    }

    @Override // androidx.compose.p013ui.text.input.VisualTransformation
    /* JADX INFO: renamed from: f */
    public final TransformedText mo42f(AnnotatedString annotatedString) {
        int length = annotatedString.f19890b.length();
        int i = 0;
        String strSubstring = annotatedString.f19890b;
        int i2 = this.f13266d;
        if (length > i2) {
            IntRange range = RangesKt.m18664k(0, i2);
            Intrinsics.m18599g(strSubstring, "<this>");
            Intrinsics.m18599g(range, "range");
            strSubstring = strSubstring.substring(range.f51685a, range.f51686b + 1);
            Intrinsics.m18598f(strSubstring, "substring(...)");
        }
        String string = "";
        int i3 = 0;
        while (i < strSubstring.length()) {
            int i4 = i3 + 1;
            string = string + strSubstring.charAt(i);
            if (i4 == this.f13264b || i3 + 2 == this.f13265c) {
                StringBuilder sbM2244s = AbstractC0455a.m2244s(string);
                sbM2244s.append(this.f13263a.f15550b);
                string = sbM2244s.toString();
            }
            i++;
            i3 = i4;
        }
        return new TransformedText(new AnnotatedString(6, string, null), this.f13267f);
    }
}
