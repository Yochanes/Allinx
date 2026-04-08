package androidx.compose.p013ui.text.input;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.p013ui.text.AnnotatedString;
import androidx.compose.p013ui.text.TextRange;
import androidx.compose.p013ui.text.TextRangeKt;
import androidx.compose.p013ui.text.internal.InlineClassHelperKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/ui/text/input/EditingBuffer;", "", "Companion", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class EditingBuffer {

    /* JADX INFO: renamed from: a */
    public final PartialGapBuffer f20357a;

    /* JADX INFO: renamed from: b */
    public int f20358b;

    /* JADX INFO: renamed from: c */
    public int f20359c;

    /* JADX INFO: renamed from: d */
    public int f20360d;

    /* JADX INFO: renamed from: e */
    public int f20361e;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m18302d2 = {"Landroidx/compose/ui/text/input/EditingBuffer$Companion;", "", "", "NOWHERE", "I", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Companion {
    }

    public EditingBuffer(AnnotatedString annotatedString, long j) {
        String str = annotatedString.f19890b;
        PartialGapBuffer partialGapBuffer = new PartialGapBuffer();
        partialGapBuffer.f20384a = str;
        partialGapBuffer.f20386c = -1;
        partialGapBuffer.f20387d = -1;
        this.f20357a = partialGapBuffer;
        this.f20358b = TextRange.m6407f(j);
        this.f20359c = TextRange.m6406e(j);
        this.f20360d = -1;
        this.f20361e = -1;
        int iM6407f = TextRange.m6407f(j);
        int iM6406e = TextRange.m6406e(j);
        String str2 = annotatedString.f19890b;
        if (iM6407f < 0 || iM6407f > str2.length()) {
            StringBuilder sbM20q = AbstractC0000a.m20q(iM6407f, "start (", ") offset is outside of text region ");
            sbM20q.append(str2.length());
            throw new IndexOutOfBoundsException(sbM20q.toString());
        }
        if (iM6406e < 0 || iM6406e > str2.length()) {
            StringBuilder sbM20q2 = AbstractC0000a.m20q(iM6406e, "end (", ") offset is outside of text region ");
            sbM20q2.append(str2.length());
            throw new IndexOutOfBoundsException(sbM20q2.toString());
        }
        if (iM6407f > iM6406e) {
            throw new IllegalArgumentException(AbstractC0455a.m2237l(iM6407f, iM6406e, "Do not set reversed range: ", " > "));
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m6535a(int i, int i2) {
        long jM6410a = TextRangeKt.m6410a(i, i2);
        this.f20357a.m6556b(i, i2, "");
        long jM6545a = EditingBufferKt.m6545a(TextRangeKt.m6410a(this.f20358b, this.f20359c), jM6410a);
        m6544j(TextRange.m6407f(jM6545a));
        m6543i(TextRange.m6406e(jM6545a));
        if (m6539e()) {
            long jM6545a2 = EditingBufferKt.m6545a(TextRangeKt.m6410a(this.f20360d, this.f20361e), jM6410a);
            if (TextRange.m6404c(jM6545a2)) {
                this.f20360d = -1;
                this.f20361e = -1;
            } else {
                this.f20360d = TextRange.m6407f(jM6545a2);
                this.f20361e = TextRange.m6406e(jM6545a2);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final char m6536b(int i) {
        PartialGapBuffer partialGapBuffer = this.f20357a;
        GapBuffer gapBuffer = partialGapBuffer.f20385b;
        if (gapBuffer == null) {
            return partialGapBuffer.f20384a.charAt(i);
        }
        if (i < partialGapBuffer.f20386c) {
            return partialGapBuffer.f20384a.charAt(i);
        }
        int iM6546a = gapBuffer.f20362a - gapBuffer.m6546a();
        int i2 = partialGapBuffer.f20386c;
        if (i >= iM6546a + i2) {
            return partialGapBuffer.f20384a.charAt(i - ((iM6546a - partialGapBuffer.f20387d) + i2));
        }
        int i3 = i - i2;
        int i4 = gapBuffer.f20364c;
        return i3 < i4 ? gapBuffer.f20363b[i3] : gapBuffer.f20363b[(i3 - i4) + gapBuffer.f20365d];
    }

    /* JADX INFO: renamed from: c */
    public final TextRange m6537c() {
        if (m6539e()) {
            return new TextRange(TextRangeKt.m6410a(this.f20360d, this.f20361e));
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final int m6538d() {
        int i = this.f20358b;
        int i2 = this.f20359c;
        if (i == i2) {
            return i2;
        }
        return -1;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m6539e() {
        return this.f20360d != -1;
    }

    /* JADX INFO: renamed from: f */
    public final void m6540f(int i, int i2, String str) {
        PartialGapBuffer partialGapBuffer = this.f20357a;
        if (i < 0 || i > partialGapBuffer.m6555a()) {
            StringBuilder sbM20q = AbstractC0000a.m20q(i, "start (", ") offset is outside of text region ");
            sbM20q.append(partialGapBuffer.m6555a());
            throw new IndexOutOfBoundsException(sbM20q.toString());
        }
        if (i2 < 0 || i2 > partialGapBuffer.m6555a()) {
            StringBuilder sbM20q2 = AbstractC0000a.m20q(i2, "end (", ") offset is outside of text region ");
            sbM20q2.append(partialGapBuffer.m6555a());
            throw new IndexOutOfBoundsException(sbM20q2.toString());
        }
        if (i > i2) {
            throw new IllegalArgumentException(AbstractC0455a.m2237l(i, i2, "Do not set reversed range: ", " > "));
        }
        partialGapBuffer.m6556b(i, i2, str);
        m6544j(str.length() + i);
        m6543i(str.length() + i);
        this.f20360d = -1;
        this.f20361e = -1;
    }

    /* JADX INFO: renamed from: g */
    public final void m6541g(int i, int i2) {
        PartialGapBuffer partialGapBuffer = this.f20357a;
        if (i < 0 || i > partialGapBuffer.m6555a()) {
            StringBuilder sbM20q = AbstractC0000a.m20q(i, "start (", ") offset is outside of text region ");
            sbM20q.append(partialGapBuffer.m6555a());
            throw new IndexOutOfBoundsException(sbM20q.toString());
        }
        if (i2 < 0 || i2 > partialGapBuffer.m6555a()) {
            StringBuilder sbM20q2 = AbstractC0000a.m20q(i2, "end (", ") offset is outside of text region ");
            sbM20q2.append(partialGapBuffer.m6555a());
            throw new IndexOutOfBoundsException(sbM20q2.toString());
        }
        if (i >= i2) {
            throw new IllegalArgumentException(AbstractC0455a.m2237l(i, i2, "Do not set reversed or empty range: ", " > "));
        }
        this.f20360d = i;
        this.f20361e = i2;
    }

    /* JADX INFO: renamed from: h */
    public final void m6542h(int i, int i2) {
        PartialGapBuffer partialGapBuffer = this.f20357a;
        if (i < 0 || i > partialGapBuffer.m6555a()) {
            StringBuilder sbM20q = AbstractC0000a.m20q(i, "start (", ") offset is outside of text region ");
            sbM20q.append(partialGapBuffer.m6555a());
            throw new IndexOutOfBoundsException(sbM20q.toString());
        }
        if (i2 < 0 || i2 > partialGapBuffer.m6555a()) {
            StringBuilder sbM20q2 = AbstractC0000a.m20q(i2, "end (", ") offset is outside of text region ");
            sbM20q2.append(partialGapBuffer.m6555a());
            throw new IndexOutOfBoundsException(sbM20q2.toString());
        }
        if (i > i2) {
            throw new IllegalArgumentException(AbstractC0455a.m2237l(i, i2, "Do not set reversed range: ", " > "));
        }
        m6544j(i);
        m6543i(i2);
    }

    /* JADX INFO: renamed from: i */
    public final void m6543i(int i) {
        if (!(i >= 0)) {
            InlineClassHelperKt.m6567a("Cannot set selectionEnd to a negative value: " + i);
        }
        this.f20359c = i;
    }

    /* JADX INFO: renamed from: j */
    public final void m6544j(int i) {
        if (!(i >= 0)) {
            InlineClassHelperKt.m6567a("Cannot set selectionStart to a negative value: " + i);
        }
        this.f20358b = i;
    }

    public final String toString() {
        return this.f20357a.toString();
    }
}
