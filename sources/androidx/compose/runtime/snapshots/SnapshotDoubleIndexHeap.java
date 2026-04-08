package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/runtime/snapshots/SnapshotDoubleIndexHeap;", "", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class SnapshotDoubleIndexHeap {

    /* JADX INFO: renamed from: a */
    public int f17024a;

    /* JADX INFO: renamed from: b */
    public long[] f17025b;

    /* JADX INFO: renamed from: c */
    public int[] f17026c;

    /* JADX INFO: renamed from: d */
    public int[] f17027d;

    /* JADX INFO: renamed from: e */
    public int f17028e;

    /* JADX INFO: renamed from: a */
    public final int m4795a(long j) {
        int i = this.f17024a + 1;
        long[] jArr = this.f17025b;
        int length = jArr.length;
        if (i > length) {
            int i2 = length * 2;
            long[] jArr2 = new long[i2];
            int[] iArr = new int[i2];
            ArraysKt.m18382q(jArr, jArr2, 0, 0, jArr.length);
            ArraysKt.m18384s(0, 0, this.f17026c, iArr, 14);
            this.f17025b = jArr2;
            this.f17026c = iArr;
        }
        int i3 = this.f17024a;
        this.f17024a = i3 + 1;
        int length2 = this.f17027d.length;
        if (this.f17028e >= length2) {
            int i4 = length2 * 2;
            int[] iArr2 = new int[i4];
            int i5 = 0;
            while (i5 < i4) {
                int i6 = i5 + 1;
                iArr2[i5] = i6;
                i5 = i6;
            }
            ArraysKt.m18384s(0, 0, this.f17027d, iArr2, 14);
            this.f17027d = iArr2;
        }
        int i7 = this.f17028e;
        int[] iArr3 = this.f17027d;
        this.f17028e = iArr3[i7];
        long[] jArr3 = this.f17025b;
        jArr3[i3] = j;
        this.f17026c[i3] = i7;
        iArr3[i7] = i3;
        while (i3 > 0) {
            int i8 = ((i3 + 1) >> 1) - 1;
            if (jArr3[i8] <= j) {
                break;
            }
            m4796b(i8, i3);
            i3 = i8;
        }
        return i7;
    }

    /* JADX INFO: renamed from: b */
    public final void m4796b(int i, int i2) {
        long[] jArr = this.f17025b;
        int[] iArr = this.f17026c;
        int[] iArr2 = this.f17027d;
        long j = jArr[i];
        jArr[i] = jArr[i2];
        jArr[i2] = j;
        int i3 = iArr[i];
        int i4 = iArr[i2];
        iArr[i] = i4;
        iArr[i2] = i3;
        iArr2[i4] = i;
        iArr2[i3] = i2;
    }
}
