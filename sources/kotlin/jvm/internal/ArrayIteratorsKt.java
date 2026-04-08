package kotlin.jvm.internal;

import kotlin.Metadata;
import kotlin.collections.DoubleIterator;
import kotlin.collections.FloatIterator;
import kotlin.collections.IntIterator;
import kotlin.collections.LongIterator;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"kotlin-stdlib"}, m18303k = 2, m18304mv = {2, 1, 0}, m18306xi = 48)
public final class ArrayIteratorsKt {
    /* JADX INFO: renamed from: a */
    public static final DoubleIterator m18577a(double[] array) {
        Intrinsics.m18599g(array, "array");
        return new ArrayDoubleIterator(array);
    }

    /* JADX INFO: renamed from: b */
    public static final FloatIterator m18578b(float[] array) {
        Intrinsics.m18599g(array, "array");
        return new ArrayFloatIterator(array);
    }

    /* JADX INFO: renamed from: c */
    public static final IntIterator m18579c(int[] array) {
        Intrinsics.m18599g(array, "array");
        return new ArrayIntIterator(array);
    }

    /* JADX INFO: renamed from: d */
    public static final LongIterator m18580d(long[] array) {
        Intrinsics.m18599g(array, "array");
        return new ArrayLongIterator(array);
    }

    /* JADX INFO: renamed from: e */
    public static final void m18581e() {
        Intrinsics.m18599g(null, "array");
        Intrinsics.m18599g(null, "array");
    }

    /* JADX INFO: renamed from: f */
    public static final void m18582f() {
        Intrinsics.m18599g(null, "array");
        Intrinsics.m18599g(null, "array");
    }

    /* JADX INFO: renamed from: g */
    public static final void m18583g() {
        Intrinsics.m18599g(null, "array");
        Intrinsics.m18599g(null, "array");
    }

    /* JADX INFO: renamed from: h */
    public static final void m18584h() {
        Intrinsics.m18599g(null, "array");
        Intrinsics.m18599g(null, "array");
    }
}
