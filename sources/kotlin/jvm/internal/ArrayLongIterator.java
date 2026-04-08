package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.LongIterator;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlin/jvm/internal/ArrayLongIterator;", "Lkotlin/collections/LongIterator;", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
final class ArrayLongIterator extends LongIterator {

    /* JADX INFO: renamed from: a */
    public final long[] f51645a;

    /* JADX INFO: renamed from: b */
    public int f51646b;

    public ArrayLongIterator(long[] array) {
        Intrinsics.m18599g(array, "array");
        this.f51645a = array;
    }

    @Override // kotlin.collections.LongIterator
    /* JADX INFO: renamed from: c */
    public final long mo2009c() {
        try {
            long[] jArr = this.f51645a;
            int i = this.f51646b;
            this.f51646b = i + 1;
            return jArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f51646b--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f51646b < this.f51645a.length;
    }
}
