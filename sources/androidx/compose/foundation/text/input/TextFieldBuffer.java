package androidx.compose.foundation.text.input;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.text.input.internal.ChangeTracker;
import androidx.compose.foundation.text.input.internal.OffsetMappingCalculator;
import androidx.compose.foundation.text.input.internal.PartialGapBuffer;
import androidx.compose.p013ui.text.AnnotatedString;
import androidx.compose.p013ui.text.TextRange;
import androidx.compose.p013ui.text.TextRangeKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/compose/foundation/text/input/TextFieldBuffer;", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "ChangeList", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class TextFieldBuffer implements Appendable {

    /* JADX INFO: renamed from: a */
    public final OffsetMappingCalculator f8790a;

    /* JADX INFO: renamed from: b */
    public final PartialGapBuffer f8791b;

    /* JADX INFO: renamed from: c */
    public ChangeTracker f8792c;

    /* JADX INFO: renamed from: d */
    public long f8793d;

    /* JADX INFO: renamed from: f */
    public TextRange f8794f;

    /* JADX INFO: renamed from: g */
    public MutableVector f8795g;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, m18302d2 = {"Landroidx/compose/foundation/text/input/TextFieldBuffer$ChangeList;", "", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public interface ChangeList {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TextFieldBuffer(TextFieldCharSequence textFieldCharSequence, ChangeTracker changeTracker, TextFieldCharSequence textFieldCharSequence2, OffsetMappingCalculator offsetMappingCalculator, int i) {
        MutableVector mutableVector = null;
        changeTracker = (i & 2) != 0 ? null : changeTracker;
        this.f8790a = (i & 8) != 0 ? null : offsetMappingCalculator;
        PartialGapBuffer partialGapBuffer = new PartialGapBuffer();
        partialGapBuffer.f9001a = textFieldCharSequence;
        partialGapBuffer.f9003c = -1;
        partialGapBuffer.f9004d = -1;
        this.f8791b = partialGapBuffer;
        this.f8792c = changeTracker != null ? new ChangeTracker(changeTracker) : null;
        this.f8793d = textFieldCharSequence.f8799c;
        this.f8794f = textFieldCharSequence.f8800d;
        List list = textFieldCharSequence.f8797a;
        List list2 = list;
        if (list2 != null && !list2.isEmpty()) {
            int size = list.size();
            TextFieldBuffer$composingAnnotations$1 textFieldBuffer$composingAnnotations$1 = new TextFieldBuffer$composingAnnotations$1(textFieldCharSequence);
            AnnotatedString.Range[] rangeArr = new AnnotatedString.Range[size];
            for (int i2 = 0; i2 < size; i2++) {
                rangeArr[i2] = textFieldBuffer$composingAnnotations$1.invoke(Integer.valueOf(i2));
            }
            mutableVector = new MutableVector(rangeArr, size);
        }
        this.f8795g = mutableVector;
    }

    /* JADX INFO: renamed from: a */
    public final void m3281a(int i, int i2, int i3) {
        ChangeTracker changeTracker = this.f8792c;
        if (changeTracker == null) {
            changeTracker = new ChangeTracker(null);
            this.f8792c = changeTracker;
        }
        changeTracker.m3306b(i, i2, i3);
        OffsetMappingCalculator offsetMappingCalculator = this.f8790a;
        if (offsetMappingCalculator != null) {
            offsetMappingCalculator.getClass();
            if (!(i3 >= 0)) {
                InlineClassHelperKt.m2705a("Expected newLen to be ≥ 0, was " + i3);
            }
            int iMin = Math.min(i, i2);
            int iMax = Math.max(iMin, i2) - iMin;
            if (iMax >= 2 || iMax != i3) {
                int i4 = offsetMappingCalculator.f9000b + 1;
                int[] iArr = offsetMappingCalculator.f8999a;
                if (i4 > iArr.length / 3) {
                    int[] iArrCopyOf = Arrays.copyOf(offsetMappingCalculator.f8999a, Math.max(i4 * 2, (iArr.length / 3) * 2) * 3);
                    Intrinsics.m18598f(iArrCopyOf, "copyOf(...)");
                    offsetMappingCalculator.f8999a = iArrCopyOf;
                }
                int[] iArr2 = offsetMappingCalculator.f8999a;
                int i5 = offsetMappingCalculator.f9000b * 3;
                iArr2[i5] = iMin;
                iArr2[i5 + 1] = iMax;
                iArr2[i5 + 2] = i3;
                offsetMappingCalculator.f9000b = i4;
            }
        }
        this.f8793d = TextFieldBufferKt.m3286a(i, i2, i3, this.f8793d);
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c2) {
        PartialGapBuffer partialGapBuffer = this.f8791b;
        m3281a(partialGapBuffer.length(), partialGapBuffer.length(), 1);
        PartialGapBuffer.m3343b(partialGapBuffer, partialGapBuffer.length(), partialGapBuffer.length(), String.valueOf(c2));
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final void m3282b(int i, int i2, CharSequence charSequence, int i3, int i4) {
        if (!(i <= i2)) {
            InlineClassHelperKt.m2705a("Expected start=" + i + " <= end=" + i2);
        }
        if (!(i3 <= i4)) {
            InlineClassHelperKt.m2705a("Expected textStart=" + i3 + " <= textEnd=" + i4);
        }
        m3281a(i, i2, i4 - i3);
        this.f8791b.m3344a(i, i2, charSequence, i3, i4);
        m3284d(null);
    }

    /* JADX INFO: renamed from: c */
    public final void m3283c(ArrayList arrayList, int i, int i2) {
        PartialGapBuffer partialGapBuffer = this.f8791b;
        if (i < 0 || i > partialGapBuffer.length()) {
            StringBuilder sbM20q = AbstractC0000a.m20q(i, "start (", ") offset is outside of text region ");
            sbM20q.append(partialGapBuffer.length());
            throw new IndexOutOfBoundsException(sbM20q.toString());
        }
        if (i2 < 0 || i2 > partialGapBuffer.length()) {
            StringBuilder sbM20q2 = AbstractC0000a.m20q(i2, "end (", ") offset is outside of text region ");
            sbM20q2.append(partialGapBuffer.length());
            throw new IndexOutOfBoundsException(sbM20q2.toString());
        }
        if (i >= i2) {
            throw new IllegalArgumentException(AbstractC0455a.m2237l(i, i2, "Do not set reversed or empty range: ", " > "));
        }
        m3284d(new TextRange(TextRangeKt.m6410a(i, i2)));
        MutableVector mutableVector = this.f8795g;
        if (mutableVector != null) {
            mutableVector.m4573g();
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        if (this.f8795g == null) {
            this.f8795g = new MutableVector(new AnnotatedString.Range[16], 0);
        }
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            AnnotatedString.Range range = (AnnotatedString.Range) arrayList.get(i3);
            MutableVector mutableVector2 = this.f8795g;
            if (mutableVector2 != null) {
                mutableVector2.m4568b(AnnotatedString.Range.m6350a(range, null, range.f19901b + i, range.f19902c + i, 9));
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m3284d(TextRange textRange) {
        if (textRange != null && !TextRange.m6404c(textRange.f20117a)) {
            this.f8794f = textRange;
            return;
        }
        this.f8794f = null;
        MutableVector mutableVector = this.f8795g;
        if (mutableVector != null) {
            mutableVector.m4573g();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m3285e(long j) {
        long jM6410a = TextRangeKt.m6410a(0, this.f8791b.length());
        if (!TextRange.m6402a(jM6410a, j)) {
            InlineClassHelperKt.m2705a("Expected " + ((Object) TextRange.m6409h(j)) + " to be in " + ((Object) TextRange.m6409h(jM6410a)));
        }
        this.f8793d = j;
    }

    public final String toString() {
        return this.f8791b.toString();
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        if (charSequence != null) {
            PartialGapBuffer partialGapBuffer = this.f8791b;
            m3281a(partialGapBuffer.length(), partialGapBuffer.length(), charSequence.length());
            partialGapBuffer.m3344a(partialGapBuffer.length(), partialGapBuffer.length(), charSequence, 0, charSequence.length());
        }
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        if (charSequence != null) {
            PartialGapBuffer partialGapBuffer = this.f8791b;
            m3281a(partialGapBuffer.length(), partialGapBuffer.length(), i2 - i);
            PartialGapBuffer.m3343b(partialGapBuffer, partialGapBuffer.length(), partialGapBuffer.length(), charSequence.subSequence(i, i2));
        }
        return this;
    }
}
