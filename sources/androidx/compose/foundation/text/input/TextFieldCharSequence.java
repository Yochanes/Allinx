package androidx.compose.foundation.text.input;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.p013ui.text.TextRange;
import androidx.compose.p013ui.text.TextRangeKt;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class TextFieldCharSequence implements CharSequence {

    /* JADX INFO: renamed from: a */
    public final List f8797a;

    /* JADX INFO: renamed from: b */
    public final CharSequence f8798b;

    /* JADX INFO: renamed from: c */
    public final long f8799c;

    /* JADX INFO: renamed from: d */
    public final TextRange f8800d;

    /* JADX INFO: renamed from: f */
    public final Pair f8801f;

    public TextFieldCharSequence(CharSequence charSequence, long j, TextRange textRange, List list, int i) {
        textRange = (i & 4) != 0 ? null : textRange;
        this.f8797a = (i & 16) != 0 ? null : list;
        this.f8798b = charSequence instanceof TextFieldCharSequence ? ((TextFieldCharSequence) charSequence).f8798b : charSequence;
        this.f8799c = TextRangeKt.m6411b(charSequence.length(), j);
        this.f8800d = textRange != null ? new TextRange(TextRangeKt.m6411b(charSequence.length(), textRange.f20117a)) : null;
        this.f8801f = null;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f8798b.charAt(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TextFieldCharSequence.class != obj.getClass()) {
            return false;
        }
        TextFieldCharSequence textFieldCharSequence = (TextFieldCharSequence) obj;
        return TextRange.m6403b(this.f8799c, textFieldCharSequence.f8799c) && Intrinsics.m18594b(this.f8800d, textFieldCharSequence.f8800d) && Intrinsics.m18594b(this.f8801f, textFieldCharSequence.f8801f) && Intrinsics.m18594b(this.f8797a, textFieldCharSequence.f8797a) && StringsKt.m20437m(this.f8798b, textFieldCharSequence.f8798b);
    }

    public final int hashCode() {
        int iHashCode = this.f8798b.hashCode() * 31;
        int i = TextRange.f20116c;
        int iM2231f = AbstractC0455a.m2231f(this.f8799c, iHashCode, 31);
        TextRange textRange = this.f8800d;
        int iHashCode2 = (iM2231f + (textRange != null ? Long.hashCode(textRange.f20117a) : 0)) * 31;
        Pair pair = this.f8801f;
        int iHashCode3 = (iHashCode2 + (pair != null ? pair.hashCode() : 0)) * 31;
        List list = this.f8797a;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f8798b.length();
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return this.f8798b.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f8798b.toString();
    }
}
