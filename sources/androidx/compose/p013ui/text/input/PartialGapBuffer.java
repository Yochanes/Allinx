package androidx.compose.p013ui.text.input;

import androidx.annotation.RestrictTo;
import androidx.compose.p013ui.text.InternalTextApi;
import androidx.compose.p013ui.text.internal.InlineClassHelperKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/ui/text/input/PartialGapBuffer;", "", "Companion", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@InternalTextApi
@RestrictTo
@SourceDebugExtension
public final class PartialGapBuffer {

    /* JADX INFO: renamed from: a */
    public String f20384a;

    /* JADX INFO: renamed from: b */
    public GapBuffer f20385b;

    /* JADX INFO: renamed from: c */
    public int f20386c;

    /* JADX INFO: renamed from: d */
    public int f20387d;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, m18302d2 = {"Landroidx/compose/ui/text/input/PartialGapBuffer$Companion;", "", "", "BUF_SIZE", "I", "NOWHERE", "SURROUNDING_SIZE", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: renamed from: a */
    public final int m6555a() {
        GapBuffer gapBuffer = this.f20385b;
        if (gapBuffer == null) {
            return this.f20384a.length();
        }
        return (gapBuffer.f20362a - gapBuffer.m6546a()) + (this.f20384a.length() - (this.f20387d - this.f20386c));
    }

    /* JADX INFO: renamed from: b */
    public final void m6556b(int i, int i2, String str) {
        if (i > i2) {
            InlineClassHelperKt.m6567a("start index must be less than or equal to end index: " + i + " > " + i2);
        }
        if (i < 0) {
            InlineClassHelperKt.m6567a("start must be non-negative, but was " + i);
        }
        GapBuffer gapBuffer = this.f20385b;
        if (gapBuffer == null) {
            int iMax = Math.max(255, str.length() + UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
            char[] cArr = new char[iMax];
            int iMin = Math.min(i, 64);
            int iMin2 = Math.min(this.f20384a.length() - i2, 64);
            String str2 = this.f20384a;
            int i3 = i - iMin;
            Intrinsics.m18597e(str2, "null cannot be cast to non-null type java.lang.String");
            str2.getChars(i3, i, cArr, 0);
            String str3 = this.f20384a;
            int i4 = iMax - iMin2;
            int i5 = iMin2 + i2;
            Intrinsics.m18597e(str3, "null cannot be cast to non-null type java.lang.String");
            str3.getChars(i2, i5, cArr, i4);
            str.getChars(0, str.length(), cArr, iMin);
            int length = str.length() + iMin;
            GapBuffer gapBuffer2 = new GapBuffer();
            gapBuffer2.f20362a = iMax;
            gapBuffer2.f20363b = cArr;
            gapBuffer2.f20364c = length;
            gapBuffer2.f20365d = i4;
            this.f20385b = gapBuffer2;
            this.f20386c = i3;
            this.f20387d = i5;
            return;
        }
        int i6 = this.f20386c;
        int i7 = i - i6;
        int i8 = i2 - i6;
        if (i7 < 0 || i8 > gapBuffer.f20362a - gapBuffer.m6546a()) {
            this.f20384a = toString();
            this.f20385b = null;
            this.f20386c = -1;
            this.f20387d = -1;
            m6556b(i, i2, str);
            return;
        }
        int length2 = str.length() - (i8 - i7);
        if (length2 > gapBuffer.m6546a()) {
            int iM6546a = length2 - gapBuffer.m6546a();
            int i9 = gapBuffer.f20362a;
            do {
                i9 *= 2;
            } while (i9 - gapBuffer.f20362a < iM6546a);
            char[] cArr2 = new char[i9];
            ArraysKt.m18381p(gapBuffer.f20363b, cArr2, 0, 0, gapBuffer.f20364c);
            int i10 = gapBuffer.f20362a;
            int i11 = gapBuffer.f20365d;
            int i12 = i10 - i11;
            int i13 = i9 - i12;
            ArraysKt.m18381p(gapBuffer.f20363b, cArr2, i13, i11, i12 + i11);
            gapBuffer.f20363b = cArr2;
            gapBuffer.f20362a = i9;
            gapBuffer.f20365d = i13;
        }
        int i14 = gapBuffer.f20364c;
        if (i7 < i14 && i8 <= i14) {
            int i15 = i14 - i8;
            char[] cArr3 = gapBuffer.f20363b;
            ArraysKt.m18381p(cArr3, cArr3, gapBuffer.f20365d - i15, i8, i14);
            gapBuffer.f20364c = i7;
            gapBuffer.f20365d -= i15;
        } else if (i7 >= i14 || i8 < i14) {
            int iM6546a2 = i7 + gapBuffer.m6546a();
            int iM6546a3 = i8 + gapBuffer.m6546a();
            int i16 = gapBuffer.f20365d;
            char[] cArr4 = gapBuffer.f20363b;
            ArraysKt.m18381p(cArr4, cArr4, gapBuffer.f20364c, i16, iM6546a2);
            gapBuffer.f20364c += iM6546a2 - i16;
            gapBuffer.f20365d = iM6546a3;
        } else {
            gapBuffer.f20365d = i8 + gapBuffer.m6546a();
            gapBuffer.f20364c = i7;
        }
        str.getChars(0, str.length(), gapBuffer.f20363b, gapBuffer.f20364c);
        gapBuffer.f20364c = str.length() + gapBuffer.f20364c;
    }

    public final String toString() {
        GapBuffer gapBuffer = this.f20385b;
        if (gapBuffer == null) {
            return this.f20384a;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) this.f20384a, 0, this.f20386c);
        sb.append(gapBuffer.f20363b, 0, gapBuffer.f20364c);
        char[] cArr = gapBuffer.f20363b;
        int i = gapBuffer.f20365d;
        sb.append(cArr, i, gapBuffer.f20362a - i);
        String str = this.f20384a;
        sb.append((CharSequence) str, this.f20387d, str.length());
        return sb.toString();
    }
}
