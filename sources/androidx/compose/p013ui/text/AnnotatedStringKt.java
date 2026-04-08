package androidx.compose.p013ui.text;

import androidx.compose.p013ui.text.AnnotatedString;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"ui-text_release"}, m18303k = 2, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class AnnotatedStringKt {

    /* JADX INFO: renamed from: a */
    public static final AnnotatedString f19904a = new AnnotatedString("");

    /* JADX INFO: renamed from: a */
    public static final List m6351a(AnnotatedString annotatedString, int i, int i2, Function1 function1) {
        List list;
        if (i == i2 || (list = annotatedString.f19889a) == null) {
            return null;
        }
        if (i != 0 || i2 < annotatedString.f19890b.length()) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                AnnotatedString.Range range = (AnnotatedString.Range) list.get(i3);
                if ((function1 != null ? ((Boolean) ((AnnotatedStringKt$substringWithoutParagraphStyles$1) function1).invoke(range.f19900a)).booleanValue() : true) && m6352b(i, i2, range.f19901b, range.f19902c)) {
                    arrayList.add(new AnnotatedString.Range(RangesKt.m18656c(range.f19901b, i, i2) - i, range.f19903d, (AnnotatedString.Annotation) range.f19900a, RangesKt.m18656c(range.f19902c, i, i2) - i));
                }
            }
            return arrayList;
        }
        if (function1 == null) {
            return list;
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        int size2 = list.size();
        for (int i4 = 0; i4 < size2; i4++) {
            Object obj = list.get(i4);
            if (((Boolean) ((AnnotatedStringKt$substringWithoutParagraphStyles$1) function1).invoke(((AnnotatedString.Range) obj).f19900a)).booleanValue()) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m6352b(int i, int i2, int i3, int i4) {
        return ((i < i4) & (i3 < i2)) | (((i == i2) | (i3 == i4)) & (i == i3));
    }
}
