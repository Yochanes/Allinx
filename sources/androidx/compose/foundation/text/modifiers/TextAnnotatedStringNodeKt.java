package androidx.compose.foundation.text.modifiers;

import androidx.compose.p013ui.text.AnnotatedString;
import androidx.compose.p013ui.text.AnnotatedStringKt;
import androidx.compose.p013ui.text.LinkAnnotation;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"foundation_release"}, m18303k = 2, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class TextAnnotatedStringNodeKt {
    /* JADX INFO: renamed from: a */
    public static final boolean m3530a(AnnotatedString annotatedString) {
        int length = annotatedString.f19890b.length();
        List list = annotatedString.f19889a;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                AnnotatedString.Range range = (AnnotatedString.Range) list.get(i);
                if ((range.f19900a instanceof LinkAnnotation) && AnnotatedStringKt.m6352b(0, length, range.f19901b, range.f19902c)) {
                    return true;
                }
            }
        }
        return false;
    }
}
