package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.StringHelpersKt;
import androidx.compose.foundation.text.selection.BaseTextPreparedSelection;
import androidx.compose.p013ui.text.AnnotatedString;
import androidx.compose.p013ui.text.MultiParagraph;
import androidx.compose.p013ui.text.TextLayoutResult;
import androidx.compose.p013ui.text.TextRange;
import androidx.compose.p013ui.text.TextRangeKt;
import androidx.compose.p013ui.text.input.OffsetMapping;
import androidx.compose.p013ui.text.style.ResolvedTextDirection;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b \u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;", "T", "", "Companion", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public abstract class BaseTextPreparedSelection<T extends BaseTextPreparedSelection<T>> {

    /* JADX INFO: renamed from: a */
    public final AnnotatedString f9607a;

    /* JADX INFO: renamed from: b */
    public final long f9608b;

    /* JADX INFO: renamed from: c */
    public final TextLayoutResult f9609c;

    /* JADX INFO: renamed from: d */
    public final OffsetMapping f9610d;

    /* JADX INFO: renamed from: e */
    public final TextPreparedSelectionState f9611e;

    /* JADX INFO: renamed from: f */
    public long f9612f;

    /* JADX INFO: renamed from: g */
    public final AnnotatedString f9613g;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m18302d2 = {"Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection$Companion;", "", "", "NoCharacterFound", "I", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Companion {
    }

    public BaseTextPreparedSelection(AnnotatedString annotatedString, long j, TextLayoutResult textLayoutResult, OffsetMapping offsetMapping, TextPreparedSelectionState textPreparedSelectionState) {
        this.f9607a = annotatedString;
        this.f9608b = j;
        this.f9609c = textLayoutResult;
        this.f9610d = offsetMapping;
        this.f9611e = textPreparedSelectionState;
        this.f9612f = j;
        this.f9613g = annotatedString;
    }

    /* JADX INFO: renamed from: a */
    public final Integer m3537a() {
        TextLayoutResult textLayoutResult = this.f9609c;
        if (textLayoutResult == null) {
            return null;
        }
        int iM6406e = TextRange.m6406e(this.f9612f);
        OffsetMapping offsetMapping = this.f9610d;
        int iMo3273b = offsetMapping.mo3273b(iM6406e);
        MultiParagraph multiParagraph = textLayoutResult.f20102b;
        return Integer.valueOf(offsetMapping.mo3272a(multiParagraph.m6361c(multiParagraph.m6362d(iMo3273b), true)));
    }

    /* JADX INFO: renamed from: b */
    public final Integer m3538b() {
        TextLayoutResult textLayoutResult = this.f9609c;
        if (textLayoutResult == null) {
            return null;
        }
        int iM6407f = TextRange.m6407f(this.f9612f);
        OffsetMapping offsetMapping = this.f9610d;
        return Integer.valueOf(offsetMapping.mo3272a(textLayoutResult.m6398g(textLayoutResult.f20102b.m6362d(offsetMapping.mo3273b(iM6407f)))));
    }

    /* JADX INFO: renamed from: c */
    public final Integer m3539c() {
        int length;
        TextLayoutResult textLayoutResult = this.f9609c;
        if (textLayoutResult == null) {
            return null;
        }
        int iM3549m = m3549m();
        while (true) {
            AnnotatedString annotatedString = this.f9607a;
            if (iM3549m < annotatedString.f19890b.length()) {
                int length2 = this.f9613g.f19890b.length() - 1;
                if (iM3549m <= length2) {
                    length2 = iM3549m;
                }
                long jM6401j = textLayoutResult.m6401j(length2);
                int i = TextRange.f20116c;
                int i2 = (int) (jM6401j & 4294967295L);
                if (i2 > iM3549m) {
                    length = this.f9610d.mo3272a(i2);
                    break;
                }
                iM3549m++;
            } else {
                length = annotatedString.f19890b.length();
                break;
            }
        }
        return Integer.valueOf(length);
    }

    /* JADX INFO: renamed from: d */
    public final Integer m3540d() {
        int iMo3272a;
        TextLayoutResult textLayoutResult = this.f9609c;
        if (textLayoutResult == null) {
            return null;
        }
        int iM3549m = m3549m();
        while (true) {
            if (iM3549m <= 0) {
                iMo3272a = 0;
                break;
            }
            int length = this.f9613g.f19890b.length() - 1;
            if (iM3549m <= length) {
                length = iM3549m;
            }
            long jM6401j = textLayoutResult.m6401j(length);
            int i = TextRange.f20116c;
            int i2 = (int) (jM6401j >> 32);
            if (i2 < iM3549m) {
                iMo3272a = this.f9610d.mo3272a(i2);
                break;
            }
            iM3549m--;
        }
        return Integer.valueOf(iMo3272a);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m3541e() {
        TextLayoutResult textLayoutResult = this.f9609c;
        return (textLayoutResult != null ? textLayoutResult.m6399h(m3549m()) : null) != ResolvedTextDirection.f20529b;
    }

    /* JADX INFO: renamed from: f */
    public final int m3542f(TextLayoutResult textLayoutResult, int i) {
        int iM3549m = m3549m();
        TextPreparedSelectionState textPreparedSelectionState = this.f9611e;
        if (textPreparedSelectionState.f9979a == null) {
            textPreparedSelectionState.f9979a = Float.valueOf(textLayoutResult.m6394c(iM3549m).f17526a);
        }
        int iM6362d = textLayoutResult.f20102b.m6362d(iM3549m) + i;
        if (iM6362d < 0) {
            return 0;
        }
        MultiParagraph multiParagraph = textLayoutResult.f20102b;
        if (iM6362d >= multiParagraph.f19938f) {
            return this.f9613g.f19890b.length();
        }
        float fM6360b = multiParagraph.m6360b(iM6362d) - 1;
        Float f = textPreparedSelectionState.f9979a;
        Intrinsics.m18596d(f);
        float fFloatValue = f.floatValue();
        if ((m3541e() && fFloatValue >= textLayoutResult.m6397f(iM6362d)) || (!m3541e() && fFloatValue <= textLayoutResult.m6396e(iM6362d))) {
            return multiParagraph.m6361c(iM6362d, true);
        }
        return this.f9610d.mo3272a(multiParagraph.m6365g((((long) Float.floatToRawIntBits(f.floatValue())) << 32) | (((long) Float.floatToRawIntBits(fM6360b)) & 4294967295L)));
    }

    /* JADX INFO: renamed from: g */
    public final void m3543g() {
        this.f9611e.f9979a = null;
        AnnotatedString annotatedString = this.f9613g;
        if (annotatedString.f19890b.length() > 0) {
            int iM6406e = TextRange.m6406e(this.f9612f);
            String str = annotatedString.f19890b;
            int iM3241a = StringHelpersKt.m3241a(str, iM6406e);
            if (iM3241a == TextRange.m6406e(this.f9612f) && iM3241a != str.length()) {
                iM3241a = StringHelpersKt.m3241a(str, iM3241a + 1);
            }
            m3548l(iM3241a, iM3241a);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m3544h() {
        this.f9611e.f9979a = null;
        AnnotatedString annotatedString = this.f9613g;
        if (annotatedString.f19890b.length() > 0) {
            int iM6407f = TextRange.m6407f(this.f9612f);
            String str = annotatedString.f19890b;
            int iM3242b = StringHelpersKt.m3242b(str, iM6407f);
            if (iM3242b == TextRange.m6407f(this.f9612f) && iM3242b != 0) {
                iM3242b = StringHelpersKt.m3242b(str, iM3242b - 1);
            }
            m3548l(iM3242b, iM3242b);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m3545i() {
        Integer numM3537a;
        this.f9611e.f9979a = null;
        if (this.f9613g.f19890b.length() <= 0 || (numM3537a = m3537a()) == null) {
            return;
        }
        int iIntValue = numM3537a.intValue();
        m3548l(iIntValue, iIntValue);
    }

    /* JADX INFO: renamed from: j */
    public final void m3546j() {
        Integer numM3538b;
        this.f9611e.f9979a = null;
        if (this.f9613g.f19890b.length() <= 0 || (numM3538b = m3538b()) == null) {
            return;
        }
        int iIntValue = numM3538b.intValue();
        m3548l(iIntValue, iIntValue);
    }

    /* JADX INFO: renamed from: k */
    public final void m3547k() {
        if (this.f9613g.f19890b.length() > 0) {
            int i = TextRange.f20116c;
            this.f9612f = TextRangeKt.m6410a((int) (this.f9608b >> 32), (int) (this.f9612f & 4294967295L));
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m3548l(int i, int i2) {
        this.f9612f = TextRangeKt.m6410a(i, i2);
    }

    /* JADX INFO: renamed from: m */
    public final int m3549m() {
        long j = this.f9612f;
        int i = TextRange.f20116c;
        return this.f9610d.mo3273b((int) (j & 4294967295L));
    }
}
