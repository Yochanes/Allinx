package androidx.collection;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"collection"}, m18303k = 2, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class SparseArrayCompatKt {

    /* JADX INFO: renamed from: a */
    public static final Object f3889a = new Object();

    /* JADX INFO: renamed from: a */
    public static final void m2139a(SparseArrayCompat sparseArrayCompat) {
        int i = sparseArrayCompat.f3888d;
        int[] iArr = sparseArrayCompat.f3886b;
        Object[] objArr = sparseArrayCompat.f3887c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f3889a) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        sparseArrayCompat.f3885a = false;
        sparseArrayCompat.f3888d = i2;
    }
}
