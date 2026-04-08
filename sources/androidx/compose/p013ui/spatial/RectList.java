package androidx.compose.p013ui.spatial;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/spatial/RectList;", "", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class RectList {

    /* JADX INFO: renamed from: a */
    public long[] f19847a;

    /* JADX INFO: renamed from: b */
    public long[] f19848b;

    /* JADX INFO: renamed from: c */
    public int f19849c;

    /* JADX INFO: renamed from: a */
    public static void m6309a(RectList rectList, int i, int i2, int i3, int i4, int i5, int i6) {
        long[] jArr = rectList.f19847a;
        int i7 = rectList.f19849c;
        int i8 = i7 + 3;
        rectList.f19849c = i8;
        int length = jArr.length;
        if (length <= i8) {
            int iMax = Math.max(length * 2, i8);
            long[] jArrCopyOf = Arrays.copyOf(jArr, iMax);
            Intrinsics.m18598f(jArrCopyOf, "copyOf(...)");
            rectList.f19847a = jArrCopyOf;
            long[] jArrCopyOf2 = Arrays.copyOf(rectList.f19848b, iMax);
            Intrinsics.m18598f(jArrCopyOf2, "copyOf(...)");
            rectList.f19848b = jArrCopyOf2;
        }
        long[] jArr2 = rectList.f19847a;
        jArr2[i7] = (((long) i2) << 32) | (((long) i3) & 4294967295L);
        jArr2[i7 + 1] = (((long) i5) & 4294967295L) | (((long) i4) << 32);
        int i9 = i6 & 67108863;
        jArr2[i7 + 2] = (((long) 0) << 63) | (((long) 0) << 62) | (((long) 1) << 61) | (((long) 0) << 52) | (((long) i9) << 26) | ((long) (i & 67108863));
        if (i6 < 0) {
            return;
        }
        for (int i10 = i7 - 3; i10 >= 0; i10 -= 3) {
            int i11 = i10 + 2;
            long j = jArr2[i11];
            if ((((int) j) & 67108863) == i9) {
                jArr2[i11] = (j & (-2301339409586323457L)) | (((long) ((i7 - i10) & 511)) << 52);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m6310b(int i, Function4 function4) {
        int i2 = i & 67108863;
        long[] jArr = this.f19847a;
        int i3 = this.f19849c;
        for (int i4 = 0; i4 < jArr.length - 2 && i4 < i3; i4 += 3) {
            if ((((int) jArr[i4 + 2]) & 67108863) == i2) {
                long j = jArr[i4];
                long j2 = jArr[i4 + 1];
                function4.invoke(Integer.valueOf((int) (j >> 32)), Integer.valueOf((int) j), Integer.valueOf((int) (j2 >> 32)), Integer.valueOf((int) j2));
                return;
            }
        }
    }
}
