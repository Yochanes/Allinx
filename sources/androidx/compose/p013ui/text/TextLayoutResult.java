package androidx.compose.p013ui.text;

import android.graphics.RectF;
import android.text.Layout;
import androidx.compose.animation.AbstractC0455a;
import androidx.compose.p013ui.geometry.Rect;
import androidx.compose.p013ui.graphics.AndroidPath;
import androidx.compose.p013ui.graphics.AndroidPath_androidKt;
import androidx.compose.p013ui.text.android.TextLayout;
import androidx.compose.p013ui.text.android.selection.WordIterator;
import androidx.compose.p013ui.text.internal.InlineClassHelperKt;
import androidx.compose.p013ui.text.style.ResolvedTextDirection;
import androidx.compose.p013ui.unit.IntSize;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/text/TextLayoutResult;", "", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class TextLayoutResult {

    /* JADX INFO: renamed from: a */
    public final TextLayoutInput f20101a;

    /* JADX INFO: renamed from: b */
    public final MultiParagraph f20102b;

    /* JADX INFO: renamed from: c */
    public final long f20103c;

    /* JADX INFO: renamed from: d */
    public final float f20104d;

    /* JADX INFO: renamed from: e */
    public final float f20105e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f20106f;

    public TextLayoutResult(TextLayoutInput textLayoutInput, MultiParagraph multiParagraph, long j) {
        this.f20101a = textLayoutInput;
        this.f20102b = multiParagraph;
        this.f20103c = j;
        ArrayList arrayList = multiParagraph.f19940h;
        float fM6328f = 0.0f;
        this.f20104d = arrayList.isEmpty() ? 0.0f : ((ParagraphInfo) arrayList.get(0)).f19956a.m6325c();
        if (!arrayList.isEmpty()) {
            ParagraphInfo paragraphInfo = (ParagraphInfo) CollectionsKt.m18411L(arrayList);
            fM6328f = paragraphInfo.f19956a.m6328f() + paragraphInfo.f19961f;
        }
        this.f20105e = fM6328f;
        this.f20106f = multiParagraph.f19939g;
    }

    /* JADX INFO: renamed from: a */
    public final ResolvedTextDirection m6392a(int i) {
        MultiParagraph multiParagraph = this.f20102b;
        multiParagraph.m6368l(i);
        int length = multiParagraph.f19933a.f19948a.f19890b.length();
        ArrayList arrayList = multiParagraph.f19940h;
        ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(i == length ? CollectionsKt.m18405F(arrayList) : MultiParagraphKt.m6373a(i, arrayList));
        return paragraphInfo.f19956a.m6324b(paragraphInfo.m6380d(i));
    }

    /* JADX INFO: renamed from: b */
    public final Rect m6393b(int i) {
        float fM6442j;
        float fM6442j2;
        float fM6441i;
        float fM6441i2;
        MultiParagraph multiParagraph = this.f20102b;
        multiParagraph.m6367k(i);
        ArrayList arrayList = multiParagraph.f19940h;
        ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(MultiParagraphKt.m6373a(i, arrayList));
        AndroidParagraph androidParagraph = paragraphInfo.f19956a;
        int iM6380d = paragraphInfo.m6380d(i);
        CharSequence charSequence = androidParagraph.f19886e;
        if (iM6380d < 0 || iM6380d >= charSequence.length()) {
            StringBuilder sbM20q = AbstractC0000a.m20q(iM6380d, "offset(", ") is out of bounds [0,");
            sbM20q.append(charSequence.length());
            sbM20q.append(')');
            InlineClassHelperKt.m6567a(sbM20q.toString());
        }
        TextLayout textLayout = androidParagraph.f19885d;
        Layout layout = textLayout.f20155f;
        int lineForOffset = layout.getLineForOffset(iM6380d);
        float fM6440h = textLayout.m6440h(lineForOffset);
        float fM6438f = textLayout.m6438f(lineForOffset);
        boolean z2 = layout.getParagraphDirection(lineForOffset) == 1;
        boolean zIsRtlCharAt = layout.isRtlCharAt(iM6380d);
        if (!z2 || zIsRtlCharAt) {
            if (z2 && zIsRtlCharAt) {
                fM6441i = textLayout.m6442j(iM6380d, false);
                fM6441i2 = textLayout.m6442j(iM6380d + 1, true);
            } else if (zIsRtlCharAt) {
                fM6441i = textLayout.m6441i(iM6380d, false);
                fM6441i2 = textLayout.m6441i(iM6380d + 1, true);
            } else {
                fM6442j = textLayout.m6442j(iM6380d, false);
                fM6442j2 = textLayout.m6442j(iM6380d + 1, true);
            }
            float f = fM6441i;
            fM6442j = fM6441i2;
            fM6442j2 = f;
        } else {
            fM6442j = textLayout.m6441i(iM6380d, false);
            fM6442j2 = textLayout.m6441i(iM6380d + 1, true);
        }
        RectF rectF = new RectF(fM6442j, fM6440h, fM6442j2, fM6438f);
        return paragraphInfo.m6377a(new Rect(rectF.left, rectF.top, rectF.right, rectF.bottom));
    }

    /* JADX INFO: renamed from: c */
    public final Rect m6394c(int i) {
        MultiParagraph multiParagraph = this.f20102b;
        multiParagraph.m6368l(i);
        int length = multiParagraph.f19933a.f19948a.f19890b.length();
        ArrayList arrayList = multiParagraph.f19940h;
        ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(i == length ? CollectionsKt.m18405F(arrayList) : MultiParagraphKt.m6373a(i, arrayList));
        AndroidParagraph androidParagraph = paragraphInfo.f19956a;
        int iM6380d = paragraphInfo.m6380d(i);
        CharSequence charSequence = androidParagraph.f19886e;
        if (iM6380d < 0 || iM6380d > charSequence.length()) {
            StringBuilder sbM20q = AbstractC0000a.m20q(iM6380d, "offset(", ") is out of bounds [0,");
            sbM20q.append(charSequence.length());
            sbM20q.append(']');
            InlineClassHelperKt.m6567a(sbM20q.toString());
        }
        TextLayout textLayout = androidParagraph.f19885d;
        float fM6441i = textLayout.m6441i(iM6380d, false);
        int lineForOffset = textLayout.f20155f.getLineForOffset(iM6380d);
        return paragraphInfo.m6377a(new Rect(fM6441i, textLayout.m6440h(lineForOffset), fM6441i, textLayout.m6438f(lineForOffset)));
    }

    /* JADX INFO: renamed from: d */
    public final boolean m6395d() {
        MultiParagraph multiParagraph = this.f20102b;
        return multiParagraph.f19935c || ((float) ((int) (this.f20103c & 4294967295L))) < multiParagraph.f19937e;
    }

    /* JADX INFO: renamed from: e */
    public final float m6396e(int i) {
        MultiParagraph multiParagraph = this.f20102b;
        multiParagraph.m6369m(i);
        ArrayList arrayList = multiParagraph.f19940h;
        ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(MultiParagraphKt.m6374b(i, arrayList));
        AndroidParagraph androidParagraph = paragraphInfo.f19956a;
        int i2 = i - paragraphInfo.f19959d;
        TextLayout textLayout = androidParagraph.f19885d;
        return textLayout.f20155f.getLineLeft(i2) + (i2 == textLayout.f20156g + (-1) ? textLayout.f20159j : 0.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextLayoutResult)) {
            return false;
        }
        TextLayoutResult textLayoutResult = (TextLayoutResult) obj;
        return this.f20101a.equals(textLayoutResult.f20101a) && this.f20102b.equals(textLayoutResult.f20102b) && IntSize.m6665b(this.f20103c, textLayoutResult.f20103c) && this.f20104d == textLayoutResult.f20104d && this.f20105e == textLayoutResult.f20105e && Intrinsics.m18594b(this.f20106f, textLayoutResult.f20106f);
    }

    /* JADX INFO: renamed from: f */
    public final float m6397f(int i) {
        MultiParagraph multiParagraph = this.f20102b;
        multiParagraph.m6369m(i);
        ArrayList arrayList = multiParagraph.f19940h;
        ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(MultiParagraphKt.m6374b(i, arrayList));
        AndroidParagraph androidParagraph = paragraphInfo.f19956a;
        int i2 = i - paragraphInfo.f19959d;
        TextLayout textLayout = androidParagraph.f19885d;
        return textLayout.f20155f.getLineRight(i2) + (i2 == textLayout.f20156g + (-1) ? textLayout.f20160k : 0.0f);
    }

    /* JADX INFO: renamed from: g */
    public final int m6398g(int i) {
        MultiParagraph multiParagraph = this.f20102b;
        multiParagraph.m6369m(i);
        ArrayList arrayList = multiParagraph.f19940h;
        ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(MultiParagraphKt.m6374b(i, arrayList));
        AndroidParagraph androidParagraph = paragraphInfo.f19956a;
        return androidParagraph.f19885d.f20155f.getLineStart(i - paragraphInfo.f19959d) + paragraphInfo.f19957b;
    }

    /* JADX INFO: renamed from: h */
    public final ResolvedTextDirection m6399h(int i) {
        MultiParagraph multiParagraph = this.f20102b;
        multiParagraph.m6368l(i);
        int length = multiParagraph.f19933a.f19948a.f19890b.length();
        ArrayList arrayList = multiParagraph.f19940h;
        ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(i == length ? CollectionsKt.m18405F(arrayList) : MultiParagraphKt.m6373a(i, arrayList));
        AndroidParagraph androidParagraph = paragraphInfo.f19956a;
        int iM6380d = paragraphInfo.m6380d(i);
        TextLayout textLayout = androidParagraph.f19885d;
        return textLayout.f20155f.getParagraphDirection(textLayout.f20155f.getLineForOffset(iM6380d)) == 1 ? ResolvedTextDirection.f20528a : ResolvedTextDirection.f20529b;
    }

    public final int hashCode() {
        return this.f20106f.hashCode() + AbstractC0455a.m2226a(AbstractC0455a.m2226a(AbstractC0455a.m2231f(this.f20103c, (this.f20102b.hashCode() + (this.f20101a.hashCode() * 31)) * 31, 31), this.f20104d, 31), this.f20105e, 31);
    }

    /* JADX INFO: renamed from: i */
    public final AndroidPath m6400i(int i, int i2) {
        MultiParagraph multiParagraph = this.f20102b;
        MultiParagraphIntrinsics multiParagraphIntrinsics = multiParagraph.f19933a;
        if (i < 0 || i > i2 || i2 > multiParagraphIntrinsics.f19948a.f19890b.length()) {
            StringBuilder sbM24u = AbstractC0000a.m24u("Start(", ") or End(", ") is out of range [0..", i, i2);
            sbM24u.append(multiParagraphIntrinsics.f19948a.f19890b.length());
            sbM24u.append("), or start > end!");
            InlineClassHelperKt.m6567a(sbM24u.toString());
        }
        if (i == i2) {
            return AndroidPath_androidKt.m5161a();
        }
        AndroidPath androidPathM5161a = AndroidPath_androidKt.m5161a();
        MultiParagraphKt.m6376d(multiParagraph.f19940h, TextRangeKt.m6410a(i, i2), new MultiParagraph$getPathForRange$2(androidPathM5161a, i, i2));
        return androidPathM5161a;
    }

    /* JADX INFO: renamed from: j */
    public final long m6401j(int i) {
        int iM6500i;
        int iM6499h;
        int iM6499h2;
        MultiParagraph multiParagraph = this.f20102b;
        multiParagraph.m6368l(i);
        int length = multiParagraph.f19933a.f19948a.f19890b.length();
        ArrayList arrayList = multiParagraph.f19940h;
        ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(i == length ? CollectionsKt.m18405F(arrayList) : MultiParagraphKt.m6373a(i, arrayList));
        AndroidParagraph androidParagraph = paragraphInfo.f19956a;
        int iM6380d = paragraphInfo.m6380d(i);
        WordIterator wordIteratorM6443k = androidParagraph.f19885d.m6443k();
        if (wordIteratorM6443k.m6498g(wordIteratorM6443k.m6500i(iM6380d))) {
            wordIteratorM6443k.m6492a(iM6380d);
            iM6500i = iM6380d;
            while (iM6500i != -1 && (!wordIteratorM6443k.m6498g(iM6500i) || wordIteratorM6443k.m6494c(iM6500i))) {
                iM6500i = wordIteratorM6443k.m6500i(iM6500i);
            }
        } else {
            wordIteratorM6443k.m6492a(iM6380d);
            iM6500i = wordIteratorM6443k.m6497f(iM6380d) ? (!wordIteratorM6443k.m6495d(iM6380d) || wordIteratorM6443k.m6493b(iM6380d)) ? wordIteratorM6443k.m6500i(iM6380d) : iM6380d : wordIteratorM6443k.m6493b(iM6380d) ? wordIteratorM6443k.m6500i(iM6380d) : -1;
        }
        if (iM6500i == -1) {
            iM6500i = iM6380d;
        }
        if (wordIteratorM6443k.m6494c(wordIteratorM6443k.m6499h(iM6380d))) {
            wordIteratorM6443k.m6492a(iM6380d);
            iM6499h = iM6380d;
            while (iM6499h != -1 && (wordIteratorM6443k.m6498g(iM6499h) || !wordIteratorM6443k.m6494c(iM6499h))) {
                iM6499h = wordIteratorM6443k.m6499h(iM6499h);
            }
        } else {
            wordIteratorM6443k.m6492a(iM6380d);
            if (wordIteratorM6443k.m6493b(iM6380d)) {
                if (!wordIteratorM6443k.m6495d(iM6380d) || wordIteratorM6443k.m6497f(iM6380d)) {
                    iM6499h2 = wordIteratorM6443k.m6499h(iM6380d);
                    iM6499h = iM6499h2;
                } else {
                    iM6499h = iM6380d;
                }
            } else if (wordIteratorM6443k.m6497f(iM6380d)) {
                iM6499h2 = wordIteratorM6443k.m6499h(iM6380d);
                iM6499h = iM6499h2;
            } else {
                iM6499h = -1;
            }
        }
        if (iM6499h != -1) {
            iM6380d = iM6499h;
        }
        return paragraphInfo.m6378b(TextRangeKt.m6410a(iM6500i, iM6380d), false);
    }

    public final String toString() {
        return "TextLayoutResult(layoutInput=" + this.f20101a + ", multiParagraph=" + this.f20102b + ", size=" + ((Object) IntSize.m6666c(this.f20103c)) + ", firstBaseline=" + this.f20104d + ", lastBaseline=" + this.f20105e + ", placeholderRects=" + this.f20106f + ')';
    }
}
