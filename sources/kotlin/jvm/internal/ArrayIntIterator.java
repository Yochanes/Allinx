package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.IntIterator;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlin/jvm/internal/ArrayIntIterator;", "Lkotlin/collections/IntIterator;", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
final class ArrayIntIterator extends IntIterator {

    /* JADX INFO: renamed from: a */
    public final int[] f51641a;

    /* JADX INFO: renamed from: b */
    public int f51642b;

    public ArrayIntIterator(int[] array) {
        Intrinsics.m18599g(array, "array");
        this.f51641a = array;
    }

    @Override // kotlin.collections.IntIterator
    /* JADX INFO: renamed from: c */
    public final int mo2140c() {
        try {
            int[] iArr = this.f51641a;
            int i = this.f51642b;
            this.f51642b = i + 1;
            return iArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f51642b--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f51642b < this.f51641a.length;
    }
}
