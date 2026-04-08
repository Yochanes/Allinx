package androidx.compose.p013ui.text.input;

import androidx.compose.p013ui.text.AnnotatedString;
import androidx.compose.p013ui.text.TextRange;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"ui-text_release"}, m18303k = 2, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class TextFieldValueKt {
    /* JADX INFO: renamed from: a */
    public static final AnnotatedString m6563a(TextFieldValue textFieldValue) {
        AnnotatedString annotatedString = textFieldValue.f20403a;
        annotatedString.getClass();
        long j = textFieldValue.f20404b;
        return annotatedString.m6338d(TextRange.m6407f(j), TextRange.m6406e(j));
    }

    /* JADX INFO: renamed from: b */
    public static final AnnotatedString m6564b(TextFieldValue textFieldValue, int i) {
        AnnotatedString annotatedString = textFieldValue.f20403a;
        long j = textFieldValue.f20404b;
        return annotatedString.m6338d(TextRange.m6406e(j), Math.min(TextRange.m6406e(j) + i, textFieldValue.f20403a.f19890b.length()));
    }

    /* JADX INFO: renamed from: c */
    public static final AnnotatedString m6565c(TextFieldValue textFieldValue, int i) {
        AnnotatedString annotatedString = textFieldValue.f20403a;
        long j = textFieldValue.f20404b;
        return annotatedString.m6338d(Math.max(0, TextRange.m6407f(j) - i), TextRange.m6407f(j));
    }
}
