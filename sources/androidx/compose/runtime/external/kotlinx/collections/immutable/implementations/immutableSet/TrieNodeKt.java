package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import kotlin.Metadata;
import kotlin.collections.ArraysKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"runtime_release"}, m18303k = 2, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class TrieNodeKt {
    /* JADX INFO: renamed from: a */
    public static final Object[] m4715a(Object obj, Object[] objArr, int i) {
        Object[] objArr2 = new Object[objArr.length + 1];
        ArraysKt.m18385t(objArr, 0, objArr2, i, 6);
        ArraysKt.m18383r(objArr, i + 1, objArr2, i, objArr.length);
        objArr2[i] = obj;
        return objArr2;
    }

    /* JADX INFO: renamed from: b */
    public static final Object[] m4716b(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 1];
        ArraysKt.m18385t(objArr, 0, objArr2, i, 6);
        ArraysKt.m18383r(objArr, i, objArr2, i + 1, objArr.length);
        return objArr2;
    }

    /* JADX INFO: renamed from: c */
    public static final int m4717c(int i, int i2) {
        return (i >> i2) & 31;
    }
}
