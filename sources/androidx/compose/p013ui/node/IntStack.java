package androidx.compose.p013ui.node;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/node/IntStack;", "", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
final class IntStack {

    /* JADX INFO: renamed from: a */
    public int[] f18683a;

    /* JADX INFO: renamed from: b */
    public int f18684b;

    public IntStack(int i) {
        this.f18683a = new int[i];
    }

    /* JADX INFO: renamed from: a */
    public final void m5769a(int i, int i2, int i3) {
        int i4 = this.f18684b;
        int[] iArrCopyOf = this.f18683a;
        int i5 = i4 + 3;
        if (i5 >= iArrCopyOf.length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
            Intrinsics.m18598f(iArrCopyOf, "copyOf(...)");
            this.f18683a = iArrCopyOf;
        }
        iArrCopyOf[i4] = i + i3;
        iArrCopyOf[i4 + 1] = i2 + i3;
        iArrCopyOf[i4 + 2] = i3;
        this.f18684b = i5;
    }

    /* JADX INFO: renamed from: b */
    public final void m5770b(int i, int i2, int i3, int i4) {
        int i5 = this.f18684b;
        int[] iArrCopyOf = this.f18683a;
        int i6 = i5 + 4;
        if (i6 >= iArrCopyOf.length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
            Intrinsics.m18598f(iArrCopyOf, "copyOf(...)");
            this.f18683a = iArrCopyOf;
        }
        iArrCopyOf[i5] = i;
        iArrCopyOf[i5 + 1] = i2;
        iArrCopyOf[i5 + 2] = i3;
        iArrCopyOf[i5 + 3] = i4;
        this.f18684b = i6;
    }

    /* JADX INFO: renamed from: c */
    public final void m5771c(int i, int i2) {
        if (i < i2) {
            int i3 = i - 3;
            for (int i4 = i; i4 < i2; i4 += 3) {
                int[] iArr = this.f18683a;
                int i5 = iArr[i4];
                int i6 = iArr[i2];
                if (i5 < i6 || (i5 == i6 && iArr[i4 + 1] <= iArr[i2 + 1])) {
                    i3 += 3;
                    m5772d(i3, i4);
                }
            }
            m5772d(i3 + 3, i2);
            m5771c(i, i3);
            m5771c(i3 + 6, i2);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m5772d(int i, int i2) {
        int[] iArr = this.f18683a;
        int i3 = iArr[i];
        iArr[i] = iArr[i2];
        iArr[i2] = i3;
        int i4 = i + 1;
        int i5 = i2 + 1;
        int i6 = iArr[i4];
        iArr[i4] = iArr[i5];
        iArr[i5] = i6;
        int i7 = i + 2;
        int i8 = i2 + 2;
        int i9 = iArr[i7];
        iArr[i7] = iArr[i8];
        iArr[i8] = i9;
    }
}
