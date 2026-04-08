package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import java.util.ConcurrentModificationException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"collection"}, m18303k = 2, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class ArraySetKt {
    /* JADX INFO: renamed from: a */
    public static final void m1981a(ArraySet arraySet, int i) {
        Intrinsics.m18599g(arraySet, "<this>");
        arraySet.f3646a = new int[i];
        arraySet.f3647b = new Object[i];
    }

    /* JADX INFO: renamed from: b */
    public static final int m1982b(ArraySet arraySet, Object obj, int i) {
        Intrinsics.m18599g(arraySet, "<this>");
        int i2 = arraySet.f3648c;
        if (i2 == 0) {
            return -1;
        }
        try {
            int iM2141a = ContainerHelpersKt.m2141a(arraySet.f3648c, i, arraySet.f3646a);
            if (iM2141a < 0 || Intrinsics.m18594b(obj, arraySet.f3647b[iM2141a])) {
                return iM2141a;
            }
            int i3 = iM2141a + 1;
            while (i3 < i2 && arraySet.f3646a[i3] == i) {
                if (Intrinsics.m18594b(obj, arraySet.f3647b[i3])) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = iM2141a - 1; i4 >= 0 && arraySet.f3646a[i4] == i; i4--) {
                if (Intrinsics.m18594b(obj, arraySet.f3647b[i4])) {
                    return i4;
                }
            }
            return ~i3;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }
}
