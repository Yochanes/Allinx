package androidx.compose.foundation.text;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.p013ui.text.AnnotatedString;
import androidx.compose.p013ui.text.input.OffsetMapping;
import androidx.compose.p013ui.text.input.TransformedText;
import androidx.compose.p013ui.text.input.VisualTransformation;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"foundation_release"}, m18303k = 2, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class ValidatingOffsetMappingKt {

    /* JADX INFO: renamed from: a */
    public static final OffsetMapping f8758a = new ValidatingOffsetMapping(OffsetMapping.Companion.f20383a, 0, 0);

    /* JADX INFO: renamed from: a */
    public static final TransformedText m3274a(VisualTransformation visualTransformation, AnnotatedString annotatedString) {
        OffsetMapping offsetMapping;
        TransformedText transformedTextMo42f = visualTransformation.mo42f(annotatedString);
        int length = annotatedString.f19890b.length();
        AnnotatedString annotatedString2 = transformedTextMo42f.f20438a;
        int length2 = annotatedString2.f19890b.length();
        int iMin = Math.min(length, 100);
        int i = 0;
        while (true) {
            offsetMapping = transformedTextMo42f.f20439b;
            if (i >= iMin) {
                break;
            }
            m3275b(offsetMapping.mo3273b(i), length2, i);
            i++;
        }
        m3275b(offsetMapping.mo3273b(length), length2, length);
        int iMin2 = Math.min(length2, 100);
        for (int i2 = 0; i2 < iMin2; i2++) {
            m3276c(offsetMapping.mo3272a(i2), length, i2);
        }
        m3276c(offsetMapping.mo3272a(length2), length, length2);
        return new TransformedText(annotatedString2, new ValidatingOffsetMapping(offsetMapping, annotatedString.f19890b.length(), annotatedString2.f19890b.length()));
    }

    /* JADX INFO: renamed from: b */
    public static final void m3275b(int i, int i2, int i3) {
        boolean z2 = false;
        if (i >= 0 && i <= i2) {
            z2 = true;
        }
        if (z2) {
            return;
        }
        StringBuilder sbM24u = AbstractC0000a.m24u("OffsetMapping.originalToTransformed returned invalid mapping: ", " -> ", " is not in range of transformed text [0, ", i3, i);
        sbM24u.append(i2);
        sbM24u.append(']');
        InlineClassHelperKt.m2707c(sbM24u.toString());
    }

    /* JADX INFO: renamed from: c */
    public static final void m3276c(int i, int i2, int i3) {
        boolean z2 = false;
        if (i >= 0 && i <= i2) {
            z2 = true;
        }
        if (z2) {
            return;
        }
        StringBuilder sbM24u = AbstractC0000a.m24u("OffsetMapping.transformedToOriginal returned invalid mapping: ", " -> ", " is not in range of original text [0, ", i3, i);
        sbM24u.append(i2);
        sbM24u.append(']');
        InlineClassHelperKt.m2707c(sbM24u.toString());
    }
}
