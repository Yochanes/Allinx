package androidx.collection.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"collection"}, m18303k = 2, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class ContainerHelpersKt {

    /* JADX INFO: renamed from: a */
    public static final int[] f3905a = new int[0];

    /* JADX INFO: renamed from: b */
    public static final long[] f3906b = new long[0];

    /* JADX INFO: renamed from: c */
    public static final Object[] f3907c = new Object[0];

    /* JADX INFO: renamed from: a */
    public static final int m2141a(int i, int i2, int[] array) {
        Intrinsics.m18599g(array, "array");
        int i3 = i - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int i6 = array[i5];
            if (i6 < i2) {
                i4 = i5 + 1;
            } else {
                if (i6 <= i2) {
                    return i5;
                }
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }

    /* JADX INFO: renamed from: b */
    public static final int m2142b(long[] array, int i, long j) {
        Intrinsics.m18599g(array, "array");
        int i2 = i - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            long j2 = array[i4];
            if (j2 < j) {
                i3 = i4 + 1;
            } else {
                if (j2 <= j) {
                    return i4;
                }
                i2 = i4 - 1;
            }
        }
        return ~i3;
    }
}
