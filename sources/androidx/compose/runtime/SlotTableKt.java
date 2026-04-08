package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, m18302d2 = {"", "f", "()V", "runtime_release"}, m18303k = 2, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class SlotTableKt {
    /* JADX INFO: renamed from: a */
    public static final int m4461a(int i, int[] iArr) {
        return iArr[(i * 5) + 3];
    }

    /* JADX INFO: renamed from: b */
    public static final int m4462b(ArrayList arrayList, int i, int i2) {
        int iM4465e = m4465e(arrayList, i, i2);
        return iM4465e >= 0 ? iM4465e : -(iM4465e + 1);
    }

    /* JADX INFO: renamed from: c */
    public static final int m4463c(int i, int[] iArr) {
        int i2 = i * 5;
        return Integer.bitCount(iArr[i2 + 1] >> 28) + iArr[i2 + 4];
    }

    /* JADX INFO: renamed from: d */
    public static final void m4464d(int i, int i2, int[] iArr) {
        if (i2 >= 0) {
        }
        int i3 = (i * 5) + 1;
        iArr[i3] = i2 | (iArr[i3] & (-67108864));
    }

    /* JADX INFO: renamed from: e */
    public static final int m4465e(ArrayList arrayList, int i, int i2) {
        int size = arrayList.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            int i5 = ((Anchor) arrayList.get(i4)).f16211a;
            if (i5 < 0) {
                i5 += i2;
            }
            int iM18601i = Intrinsics.m18601i(i5, i);
            if (iM18601i < 0) {
                i3 = i4 + 1;
            } else {
                if (iM18601i <= 0) {
                    return i4;
                }
                size = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    /* JADX INFO: renamed from: f */
    public static final void m4466f() {
        throw new ConcurrentModificationException();
    }
}
