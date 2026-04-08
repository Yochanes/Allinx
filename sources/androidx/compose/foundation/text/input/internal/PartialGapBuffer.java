package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/foundation/text/input/internal/PartialGapBuffer;", "", "Companion", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class PartialGapBuffer implements CharSequence {

    /* JADX INFO: renamed from: a */
    public CharSequence f9001a;

    /* JADX INFO: renamed from: b */
    public GapBuffer f9002b;

    /* JADX INFO: renamed from: c */
    public int f9003c;

    /* JADX INFO: renamed from: d */
    public int f9004d;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, m18302d2 = {"Landroidx/compose/foundation/text/input/internal/PartialGapBuffer$Companion;", "", "", "BUF_SIZE", "I", "NOWHERE", "SURROUNDING_SIZE", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m3343b(PartialGapBuffer partialGapBuffer, int i, int i2, CharSequence charSequence) {
        partialGapBuffer.m3344a(i, i2, charSequence, 0, charSequence.length());
    }

    /* JADX INFO: renamed from: a */
    public final void m3344a(int i, int i2, CharSequence charSequence, int i3, int i4) {
        if (i > i2) {
            InlineClassHelperKt.m2705a("start=" + i + " > end=" + i2);
        }
        if (i3 > i4) {
            InlineClassHelperKt.m2705a("textStart=" + i3 + " > textEnd=" + i4);
        }
        if (i < 0) {
            InlineClassHelperKt.m2705a("start must be non-negative, but was " + i);
        }
        if (i3 < 0) {
            InlineClassHelperKt.m2705a("textStart must be non-negative, but was " + i3);
        }
        GapBuffer gapBuffer = this.f9002b;
        int i5 = i4 - i3;
        if (gapBuffer == null) {
            int iMax = Math.max(255, i5 + UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
            char[] cArr = new char[iMax];
            int iMin = Math.min(i, 64);
            int iMin2 = Math.min(this.f9001a.length() - i2, 64);
            int i6 = i - iMin;
            ToCharArray_androidKt.m3373a(this.f9001a, cArr, 0, i6, i);
            int i7 = iMax - iMin2;
            int i8 = iMin2 + i2;
            ToCharArray_androidKt.m3373a(this.f9001a, cArr, i7, i2, i8);
            ToCharArray_androidKt.m3373a(charSequence, cArr, iMin, i3, i4);
            GapBuffer gapBuffer2 = new GapBuffer();
            gapBuffer2.f8921a = iMax;
            gapBuffer2.f8922b = cArr;
            gapBuffer2.f8923c = iMin + i5;
            gapBuffer2.f8924d = i7;
            this.f9002b = gapBuffer2;
            this.f9003c = i6;
            this.f9004d = i8;
            return;
        }
        int i9 = this.f9003c;
        int i10 = i - i9;
        int i11 = i2 - i9;
        if (i10 < 0 || i11 > gapBuffer.f8921a - gapBuffer.m3315a()) {
            this.f9001a = toString();
            this.f9002b = null;
            this.f9003c = -1;
            this.f9004d = -1;
            m3344a(i, i2, charSequence, i3, i4);
            return;
        }
        int i12 = i5 - (i11 - i10);
        if (i12 > gapBuffer.m3315a()) {
            int iM3315a = i12 - gapBuffer.m3315a();
            int i13 = gapBuffer.f8921a;
            do {
                i13 *= 2;
            } while (i13 - gapBuffer.f8921a < iM3315a);
            char[] cArr2 = new char[i13];
            ArraysKt.m18381p(gapBuffer.f8922b, cArr2, 0, 0, gapBuffer.f8923c);
            int i14 = gapBuffer.f8921a;
            int i15 = gapBuffer.f8924d;
            int i16 = i14 - i15;
            int i17 = i13 - i16;
            ArraysKt.m18381p(gapBuffer.f8922b, cArr2, i17, i15, i16 + i15);
            gapBuffer.f8922b = cArr2;
            gapBuffer.f8921a = i13;
            gapBuffer.f8924d = i17;
        }
        int i18 = gapBuffer.f8923c;
        if (i10 < i18 && i11 <= i18) {
            int i19 = i18 - i11;
            char[] cArr3 = gapBuffer.f8922b;
            ArraysKt.m18381p(cArr3, cArr3, gapBuffer.f8924d - i19, i11, i18);
            gapBuffer.f8923c = i10;
            gapBuffer.f8924d -= i19;
        } else if (i10 >= i18 || i11 < i18) {
            int iM3315a2 = i10 + gapBuffer.m3315a();
            int iM3315a3 = i11 + gapBuffer.m3315a();
            int i20 = gapBuffer.f8924d;
            char[] cArr4 = gapBuffer.f8922b;
            ArraysKt.m18381p(cArr4, cArr4, gapBuffer.f8923c, i20, iM3315a2);
            gapBuffer.f8923c += iM3315a2 - i20;
            gapBuffer.f8924d = iM3315a3;
        } else {
            gapBuffer.f8924d = i11 + gapBuffer.m3315a();
            gapBuffer.f8923c = i10;
        }
        ToCharArray_androidKt.m3373a(charSequence, gapBuffer.f8922b, gapBuffer.f8923c, i3, i4);
        gapBuffer.f8923c += i5;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        GapBuffer gapBuffer = this.f9002b;
        if (gapBuffer == null) {
            return this.f9001a.charAt(i);
        }
        if (i < this.f9003c) {
            return this.f9001a.charAt(i);
        }
        int iM3315a = gapBuffer.f8921a - gapBuffer.m3315a();
        int i2 = this.f9003c;
        if (i >= iM3315a + i2) {
            return this.f9001a.charAt(i - ((iM3315a - this.f9004d) + i2));
        }
        int i3 = i - i2;
        int i4 = gapBuffer.f8923c;
        return i3 < i4 ? gapBuffer.f8922b[i3] : gapBuffer.f8922b[(i3 - i4) + gapBuffer.f8924d];
    }

    @Override // java.lang.CharSequence
    public final int length() {
        GapBuffer gapBuffer = this.f9002b;
        if (gapBuffer == null) {
            return this.f9001a.length();
        }
        return (gapBuffer.f8921a - gapBuffer.m3315a()) + (this.f9001a.length() - (this.f9004d - this.f9003c));
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return toString().subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        GapBuffer gapBuffer = this.f9002b;
        if (gapBuffer == null) {
            return this.f9001a.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f9001a, 0, this.f9003c);
        sb.append(gapBuffer.f8922b, 0, gapBuffer.f8923c);
        char[] cArr = gapBuffer.f8922b;
        int i = gapBuffer.f8924d;
        sb.append(cArr, i, gapBuffer.f8921a - i);
        CharSequence charSequence = this.f9001a;
        sb.append(charSequence, this.f9004d, charSequence.length());
        return sb.toString();
    }
}
