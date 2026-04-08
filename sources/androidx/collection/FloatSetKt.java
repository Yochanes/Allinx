package androidx.collection;

import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"collection"}, m18303k = 2, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class FloatSetKt {

    /* JADX INFO: renamed from: a */
    public static final float[] f3668a;

    static {
        long[] jArr = ScatterMapKt.f3844a;
        int iM2115e = ScatterMapKt.m2115e(0);
        int iMax = iM2115e > 0 ? Math.max(7, ScatterMapKt.m2114d(iM2115e)) : 0;
        if (iMax != 0) {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            ArraysKt.m18390y(jArr, -9187201950435737472L);
        }
        int i = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i] = (jArr[i] & (~j)) | j;
        float[] fArr = new float[iMax];
        f3668a = new float[0];
    }
}
