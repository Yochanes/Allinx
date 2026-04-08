package kotlin.jvm.internal;

import java.util.Iterator;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"kotlin-stdlib"}, m18303k = 2, m18304mv = {2, 1, 0}, m18306xi = 48)
public final class ArrayIteratorKt {
    /* JADX INFO: renamed from: a */
    public static final Iterator m18576a(Object[] array) {
        Intrinsics.m18599g(array, "array");
        return new ArrayIterator(array);
    }
}
