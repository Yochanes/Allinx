package androidx.compose.p013ui.text.input;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.p013ui.text.AnnotatedString;
import androidx.compose.p013ui.text.TextRange;
import androidx.compose.p013ui.text.TextRangeKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverKt$Saver$1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/ui/text/input/TextFieldValue;", "", "Companion", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class TextFieldValue {

    /* JADX INFO: renamed from: d */
    public static final SaverKt$Saver$1 f20402d;

    /* JADX INFO: renamed from: a */
    public final AnnotatedString f20403a;

    /* JADX INFO: renamed from: b */
    public final long f20404b;

    /* JADX INFO: renamed from: c */
    public final TextRange f20405c;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/text/input/TextFieldValue$Companion;", "", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Companion {
    }

    static {
        TextFieldValue$Companion$Saver$1 textFieldValue$Companion$Saver$1 = TextFieldValue$Companion$Saver$1.f20406a;
        TextFieldValue$Companion$Saver$2 textFieldValue$Companion$Saver$2 = TextFieldValue$Companion$Saver$2.f20407a;
        SaverKt$Saver$1 saverKt$Saver$1 = SaverKt.f16993a;
        f20402d = new SaverKt$Saver$1(textFieldValue$Companion$Saver$2, textFieldValue$Companion$Saver$1);
    }

    public TextFieldValue(AnnotatedString annotatedString, long j, TextRange textRange) {
        this.f20403a = annotatedString;
        this.f20404b = TextRangeKt.m6411b(annotatedString.f19890b.length(), j);
        this.f20405c = textRange != null ? new TextRange(TextRangeKt.m6411b(annotatedString.f19890b.length(), textRange.f20117a)) : null;
    }

    /* JADX INFO: renamed from: a */
    public static TextFieldValue m6560a(TextFieldValue textFieldValue, AnnotatedString annotatedString, long j, int i) {
        if ((i & 1) != 0) {
            annotatedString = textFieldValue.f20403a;
        }
        if ((i & 2) != 0) {
            j = textFieldValue.f20404b;
        }
        TextRange textRange = (i & 4) != 0 ? textFieldValue.f20405c : null;
        textFieldValue.getClass();
        return new TextFieldValue(annotatedString, j, textRange);
    }

    /* JADX INFO: renamed from: b */
    public static TextFieldValue m6561b(TextFieldValue textFieldValue, String str, long j, int i) {
        if ((i & 2) != 0) {
            j = textFieldValue.f20404b;
        }
        TextRange textRange = textFieldValue.f20405c;
        textFieldValue.getClass();
        return new TextFieldValue(new AnnotatedString(str), j, textRange);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextFieldValue)) {
            return false;
        }
        TextFieldValue textFieldValue = (TextFieldValue) obj;
        return TextRange.m6403b(this.f20404b, textFieldValue.f20404b) && Intrinsics.m18594b(this.f20405c, textFieldValue.f20405c) && Intrinsics.m18594b(this.f20403a, textFieldValue.f20403a);
    }

    public final int hashCode() {
        int iHashCode = this.f20403a.hashCode() * 31;
        int i = TextRange.f20116c;
        int iM2231f = AbstractC0455a.m2231f(this.f20404b, iHashCode, 31);
        TextRange textRange = this.f20405c;
        return iM2231f + (textRange != null ? Long.hashCode(textRange.f20117a) : 0);
    }

    public final String toString() {
        return "TextFieldValue(text='" + ((Object) this.f20403a) + "', selection=" + ((Object) TextRange.m6409h(this.f20404b)) + ", composition=" + this.f20405c + ')';
    }

    public TextFieldValue(String str, long j, int i) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? TextRange.f20115b : j, (TextRange) null);
    }

    public TextFieldValue(String str, long j, TextRange textRange) {
        this(new AnnotatedString(str), j, textRange);
    }
}
