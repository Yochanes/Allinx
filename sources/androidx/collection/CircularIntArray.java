package androidx.collection;

import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/collection/CircularIntArray;", "", "collection"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class CircularIntArray {

    /* JADX INFO: renamed from: a */
    public int[] f3650a;

    /* JADX INFO: renamed from: b */
    public int f3651b;

    /* JADX INFO: renamed from: c */
    public int f3652c;

    /* JADX INFO: renamed from: d */
    public int f3653d;

    public CircularIntArray() {
        int iHighestOneBit = Integer.bitCount(8) != 1 ? Integer.highestOneBit(7) << 1 : 8;
        this.f3653d = iHighestOneBit - 1;
        this.f3650a = new int[iHighestOneBit];
    }

    /* JADX INFO: renamed from: a */
    public final void m1983a(int i) {
        int[] iArr = this.f3650a;
        int i2 = this.f3652c;
        iArr[i2] = i;
        int i3 = this.f3653d & (i2 + 1);
        this.f3652c = i3;
        int i4 = this.f3651b;
        if (i3 == i4) {
            int length = iArr.length;
            int i5 = length - i4;
            int i6 = length << 1;
            if (i6 < 0) {
                throw new RuntimeException("Max array capacity exceeded");
            }
            int[] iArr2 = new int[i6];
            ArraysKt.m18379n(0, i4, iArr, iArr2, length);
            ArraysKt.m18379n(i5, 0, this.f3650a, iArr2, this.f3651b);
            this.f3650a = iArr2;
            this.f3651b = 0;
            this.f3652c = length;
            this.f3653d = i6 - 1;
        }
    }
}
