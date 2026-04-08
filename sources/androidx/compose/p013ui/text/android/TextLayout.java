package androidx.compose.p013ui.text.android;

import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.os.Trace;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.compose.p013ui.text.android.selection.WordIterator;
import androidx.compose.p013ui.text.android.style.BaselineShiftSpan;
import androidx.compose.p013ui.text.android.style.IndentationFixSpan_androidKt;
import androidx.compose.p013ui.text.android.style.LineHeightStyleSpan;
import androidx.compose.p013ui.text.internal.InlineClassHelperKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p011a.AbstractC0024a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/text/android/TextLayout;", "", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class TextLayout {

    /* JADX INFO: renamed from: a */
    public final TextPaint f20150a;

    /* JADX INFO: renamed from: b */
    public final TextUtils.TruncateAt f20151b;

    /* JADX INFO: renamed from: c */
    public final boolean f20152c;

    /* JADX INFO: renamed from: d */
    public final boolean f20153d;

    /* JADX INFO: renamed from: e */
    public WordIterator f20154e;

    /* JADX INFO: renamed from: f */
    public final Layout f20155f;

    /* JADX INFO: renamed from: g */
    public final int f20156g;

    /* JADX INFO: renamed from: h */
    public final int f20157h;

    /* JADX INFO: renamed from: i */
    public final int f20158i;

    /* JADX INFO: renamed from: j */
    public final float f20159j;

    /* JADX INFO: renamed from: k */
    public final float f20160k;

    /* JADX INFO: renamed from: l */
    public final boolean f20161l;

    /* JADX INFO: renamed from: m */
    public final Paint.FontMetricsInt f20162m;

    /* JADX INFO: renamed from: n */
    public final int f20163n;

    /* JADX INFO: renamed from: o */
    public final LineHeightStyleSpan[] f20164o;

    /* JADX INFO: renamed from: p */
    public final Rect f20165p = new Rect();

    /* JADX INFO: renamed from: q */
    public LayoutHelper f20166q;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01be  */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TextLayout(CharSequence charSequence, float f, TextPaint textPaint, int i, TextUtils.TruncateAt truncateAt, int i2, boolean z2, int i3, int i4, int i5, int i6, int i7, int i8, LayoutIntrinsics layoutIntrinsics) {
        int i9;
        int i10;
        int i11;
        Layout layoutM6432a;
        long j;
        LineHeightStyleSpan[] lineHeightStyleSpanArr;
        long j2;
        int i12;
        ?? M104z;
        this.f20150a = textPaint;
        this.f20151b = truncateAt;
        this.f20152c = z2;
        int length = charSequence.length();
        TextDirectionHeuristic textDirectionHeuristicM6446a = TextLayout_androidKt.m6446a(i2);
        Layout.Alignment alignment = TextAlignmentAdapter.f20147a;
        Layout.Alignment alignment2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? Layout.Alignment.ALIGN_NORMAL : TextAlignmentAdapter.f20148b : TextAlignmentAdapter.f20147a : Layout.Alignment.ALIGN_CENTER : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        boolean z3 = (charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(-1, length, BaselineShiftSpan.class) < length;
        Trace.beginSection("TextLayout:initLayout");
        try {
            BoringLayout.Metrics metricsM6427a = layoutIntrinsics.m6427a();
            double d = f;
            int iCeil = (int) Math.ceil(d);
            if (metricsM6427a == null || layoutIntrinsics.m6429c() > f || z3) {
                this.f20161l = false;
                i9 = i3;
                i10 = 1;
                i11 = 33;
                layoutM6432a = StaticLayoutFactory.m6432a(charSequence, textPaint, iCeil, charSequence.length(), textDirectionHeuristicM6446a, alignment2, i9, truncateAt, (int) Math.ceil(d), i8, z2, i4, i5, i6, i7);
                textDirectionHeuristicM6446a = textDirectionHeuristicM6446a;
            } else {
                this.f20161l = true;
                if (iCeil < 0) {
                    InlineClassHelperKt.m6567a("negative width");
                }
                if (iCeil < 0) {
                    InlineClassHelperKt.m6567a("negative ellipsized width");
                }
                i9 = i3;
                layoutM6432a = Build.VERSION.SDK_INT >= 33 ? AbstractC0024a.m86h(charSequence, textPaint, iCeil, alignment2, metricsM6427a, z2, truncateAt, iCeil) : new BoringLayout(charSequence, textPaint, iCeil, alignment2, 1.0f, 0.0f, metricsM6427a, z2, truncateAt, iCeil);
                i10 = 1;
                i11 = 33;
            }
            this.f20155f = layoutM6432a;
            Trace.endSection();
            int iMin = Math.min(layoutM6432a.getLineCount(), i9);
            this.f20156g = iMin;
            int i13 = iMin - 1;
            this.f20153d = (iMin >= i9 && (layoutM6432a.getEllipsisCount(i13) > 0 || layoutM6432a.getLineEnd(i13) != charSequence.length())) ? i10 : 0;
            if (z2) {
                j = TextLayout_androidKt.f20168b;
            } else if (this.f20161l) {
                M104z = Build.VERSION.SDK_INT >= i11 ? AbstractC0024a.m103y((BoringLayout) layoutM6432a) : 0;
                if (M104z == 0) {
                    TextPaint paint = layoutM6432a.getPaint();
                    CharSequence text = layoutM6432a.getText();
                    Rect rectM6430a = PaintExtensions_androidKt.m6430a(paint, text, layoutM6432a.getLineStart(0), layoutM6432a.getLineEnd(0));
                    int lineAscent = layoutM6432a.getLineAscent(0);
                    int i14 = rectM6430a.top;
                    int topPadding = i14 < lineAscent ? lineAscent - i14 : layoutM6432a.getTopPadding();
                    rectM6430a = iMin != i10 ? PaintExtensions_androidKt.m6430a(paint, text, layoutM6432a.getLineStart(i13), layoutM6432a.getLineEnd(i13)) : rectM6430a;
                    int lineDescent = layoutM6432a.getLineDescent(i13);
                    int i15 = rectM6430a.bottom;
                    int bottomPadding = i15 > lineDescent ? i15 - lineDescent : layoutM6432a.getBottomPadding();
                    if (topPadding != 0 || bottomPadding != 0) {
                        j = (((long) topPadding) << 32) | (((long) bottomPadding) & 4294967295L);
                    }
                }
            } else {
                StaticLayout staticLayout = (StaticLayout) layoutM6432a;
                int i16 = Build.VERSION.SDK_INT;
                if (i16 >= i11) {
                    M104z = AbstractC0024a.m104z(staticLayout);
                } else if (i16 >= 28) {
                    M104z = i10;
                }
                if (M104z == 0) {
                }
            }
            Paint.FontMetricsInt fontMetricsInt = null;
            if (layoutM6432a.getText() instanceof Spanned) {
                CharSequence text2 = layoutM6432a.getText();
                Intrinsics.m18597e(text2, "null cannot be cast to non-null type android.text.Spanned");
                if (SpannedExtensions_androidKt.m6431a((Spanned) text2, LineHeightStyleSpan.class) || layoutM6432a.getText().length() <= 0) {
                    CharSequence text3 = layoutM6432a.getText();
                    Intrinsics.m18597e(text3, "null cannot be cast to non-null type android.text.Spanned");
                    lineHeightStyleSpanArr = (LineHeightStyleSpan[]) ((Spanned) text3).getSpans(0, layoutM6432a.getText().length(), LineHeightStyleSpan.class);
                }
            } else {
                lineHeightStyleSpanArr = null;
            }
            this.f20164o = lineHeightStyleSpanArr;
            if (lineHeightStyleSpanArr != null) {
                int iMax = 0;
                int iMax2 = 0;
                for (LineHeightStyleSpan lineHeightStyleSpan : lineHeightStyleSpanArr) {
                    int i17 = lineHeightStyleSpan.f20196k;
                    iMax = i17 < 0 ? Math.max(iMax, Math.abs(i17)) : iMax;
                    int i18 = lineHeightStyleSpan.f20197l;
                    if (i18 < 0) {
                        iMax2 = Math.max(iMax, Math.abs(i18));
                    }
                }
                j2 = (iMax == 0 && iMax2 == 0) ? TextLayout_androidKt.f20168b : (((long) iMax) << 32) | (((long) iMax2) & 4294967295L);
            } else {
                j2 = TextLayout_androidKt.f20168b;
            }
            this.f20157h = Math.max((int) (j >> 32), (int) (j2 >> 32));
            this.f20158i = Math.max((int) (j & 4294967295L), (int) (j2 & 4294967295L));
            TextPaint textPaint2 = this.f20150a;
            LineHeightStyleSpan[] lineHeightStyleSpanArr2 = this.f20164o;
            int i19 = this.f20156g - 1;
            Layout layout = this.f20155f;
            if (layout.getLineStart(i19) != layout.getLineEnd(i19) || lineHeightStyleSpanArr2 == null || lineHeightStyleSpanArr2.length == 0) {
                i12 = 0;
            } else {
                SpannableString spannableString = new SpannableString("\u200b");
                LineHeightStyleSpan lineHeightStyleSpan2 = (LineHeightStyleSpan) ArraysKt.m18335B(lineHeightStyleSpanArr2);
                spannableString.setSpan(new LineHeightStyleSpan(lineHeightStyleSpan2.f20186a, spannableString.length(), (i19 == 0 || !lineHeightStyleSpan2.f20189d) ? lineHeightStyleSpan2.f20189d : false, lineHeightStyleSpan2.f20189d, lineHeightStyleSpan2.f20190e, lineHeightStyleSpan2.f20191f), 0, spannableString.length(), i11);
                StaticLayout staticLayoutM6432a = StaticLayoutFactory.m6432a(spannableString, textPaint2, Integer.MAX_VALUE, spannableString.length(), textDirectionHeuristicM6446a, LayoutCompat.f20130a, Integer.MAX_VALUE, null, Integer.MAX_VALUE, 0, this.f20152c, 0, 0, 0, 0);
                fontMetricsInt = new Paint.FontMetricsInt();
                i12 = 0;
                fontMetricsInt.ascent = staticLayoutM6432a.getLineAscent(0);
                fontMetricsInt.descent = staticLayoutM6432a.getLineDescent(0);
                fontMetricsInt.top = staticLayoutM6432a.getLineTop(0);
                fontMetricsInt.bottom = staticLayoutM6432a.getLineBottom(0);
            }
            this.f20163n = fontMetricsInt != null ? fontMetricsInt.bottom - ((int) (m6438f(i13) - m6440h(i13))) : i12;
            this.f20162m = fontMetricsInt;
            Layout layout2 = this.f20155f;
            this.f20159j = IndentationFixSpan_androidKt.m6502a(layout2, i13, layout2.getPaint());
            Layout layout3 = this.f20155f;
            this.f20160k = IndentationFixSpan_androidKt.m6503b(layout3, i13, layout3.getPaint());
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m6433a(float[] fArr, int i, int i2, int i3) {
        float fM6419a;
        float fM6419a2;
        TextLayout textLayout = this;
        Layout layout = textLayout.f20155f;
        int length = layout.getText().length();
        if (i < 0) {
            InlineClassHelperKt.m6567a("startOffset must be > 0");
        }
        if (i >= length) {
            InlineClassHelperKt.m6567a("startOffset must be less than text length");
        }
        if (i2 <= i) {
            InlineClassHelperKt.m6567a("endOffset must be greater than startOffset");
        }
        if (i2 > length) {
            InlineClassHelperKt.m6567a("endOffset must be smaller or equal to text length");
        }
        if (fArr.length - i3 < (i2 - i) * 4) {
            InlineClassHelperKt.m6567a("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4");
        }
        int lineForOffset = layout.getLineForOffset(i);
        int lineForOffset2 = layout.getLineForOffset(i2 - 1);
        HorizontalPositionCache horizontalPositionCache = new HorizontalPositionCache(textLayout);
        if (lineForOffset > lineForOffset2) {
            return;
        }
        int i4 = lineForOffset;
        int i5 = i3;
        while (true) {
            int lineStart = layout.getLineStart(i4);
            int iM6439g = textLayout.m6439g(i4);
            int iMin = Math.min(i2, iM6439g);
            float fM6440h = textLayout.m6440h(i4);
            float fM6438f = textLayout.m6438f(i4);
            boolean z2 = false;
            boolean z3 = layout.getParagraphDirection(i4) == 1;
            for (int iMax = Math.max(i, lineStart); iMax < iMin; iMax++) {
                boolean zIsRtlCharAt = layout.isRtlCharAt(iMax);
                if (!z3 || zIsRtlCharAt) {
                    if (z3 && zIsRtlCharAt) {
                        z2 = false;
                        float fM6419a3 = horizontalPositionCache.m6419a(iMax, false, false, false);
                        fM6419a = horizontalPositionCache.m6419a(iMax + 1, true, true, false);
                        fM6419a2 = fM6419a3;
                    } else {
                        z2 = false;
                        if (z3 || !zIsRtlCharAt) {
                            fM6419a = horizontalPositionCache.m6419a(iMax, false, false, false);
                            fM6419a2 = horizontalPositionCache.m6419a(iMax + 1, true, true, false);
                        } else {
                            fM6419a2 = horizontalPositionCache.m6419a(iMax, false, false, true);
                            fM6419a = horizontalPositionCache.m6419a(iMax + 1, true, true, true);
                        }
                    }
                    fArr[i5] = fM6419a;
                    fArr[i5 + 1] = fM6440h;
                    fArr[i5 + 2] = fM6419a2;
                    fArr[i5 + 3] = fM6438f;
                    i5 += 4;
                } else {
                    fM6419a = horizontalPositionCache.m6419a(iMax, z2, z2, true);
                    fM6419a2 = horizontalPositionCache.m6419a(iMax + 1, true, true, true);
                }
                z2 = false;
                fArr[i5] = fM6419a;
                fArr[i5 + 1] = fM6440h;
                fArr[i5 + 2] = fM6419a2;
                fArr[i5 + 3] = fM6438f;
                i5 += 4;
            }
            if (i4 == lineForOffset2) {
                return;
            }
            i4++;
            textLayout = this;
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m6434b() {
        boolean z2 = this.f20153d;
        Layout layout = this.f20155f;
        return (z2 ? layout.getLineBottom(this.f20156g - 1) : layout.getHeight()) + this.f20157h + this.f20158i + this.f20163n;
    }

    /* JADX INFO: renamed from: c */
    public final float m6435c(int i) {
        if (i == this.f20156g - 1) {
            return this.f20159j + this.f20160k;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: d */
    public final LayoutHelper m6436d() {
        LayoutHelper layoutHelper = this.f20166q;
        if (layoutHelper != null) {
            return layoutHelper;
        }
        LayoutHelper layoutHelper2 = new LayoutHelper(this.f20155f);
        this.f20166q = layoutHelper2;
        return layoutHelper2;
    }

    /* JADX INFO: renamed from: e */
    public final float m6437e(int i) {
        Paint.FontMetricsInt fontMetricsInt;
        return this.f20157h + ((i != this.f20156g + (-1) || (fontMetricsInt = this.f20162m) == null) ? this.f20155f.getLineBaseline(i) : m6440h(i) - fontMetricsInt.ascent);
    }

    /* JADX INFO: renamed from: f */
    public final float m6438f(int i) {
        Paint.FontMetricsInt fontMetricsInt;
        int i2 = this.f20156g;
        int i3 = i2 - 1;
        Layout layout = this.f20155f;
        if (i != i3 || (fontMetricsInt = this.f20162m) == null) {
            return this.f20157h + layout.getLineBottom(i) + (i == i2 + (-1) ? this.f20158i : 0);
        }
        return layout.getLineBottom(i - 1) + fontMetricsInt.bottom;
    }

    /* JADX INFO: renamed from: g */
    public final int m6439g(int i) {
        TextAndroidCanvas textAndroidCanvas = TextLayout_androidKt.f20167a;
        Layout layout = this.f20155f;
        return (layout.getEllipsisCount(i) <= 0 || this.f20151b != TextUtils.TruncateAt.END) ? layout.getLineEnd(i) : layout.getText().length();
    }

    /* JADX INFO: renamed from: h */
    public final float m6440h(int i) {
        return this.f20155f.getLineTop(i) + (i == 0 ? 0 : this.f20157h);
    }

    /* JADX INFO: renamed from: i */
    public final float m6441i(int i, boolean z2) {
        return m6435c(this.f20155f.getLineForOffset(i)) + m6436d().m6423c(i, true, z2);
    }

    /* JADX INFO: renamed from: j */
    public final float m6442j(int i, boolean z2) {
        return m6435c(this.f20155f.getLineForOffset(i)) + m6436d().m6423c(i, false, z2);
    }

    /* JADX INFO: renamed from: k */
    public final WordIterator m6443k() {
        WordIterator wordIterator = this.f20154e;
        if (wordIterator != null) {
            return wordIterator;
        }
        Layout layout = this.f20155f;
        WordIterator wordIterator2 = new WordIterator(layout.getText(), layout.getText().length(), this.f20150a.getTextLocale());
        this.f20154e = wordIterator2;
        return wordIterator2;
    }
}
