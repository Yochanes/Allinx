package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.DoubleIterator;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlin/jvm/internal/ArrayDoubleIterator;", "Lkotlin/collections/DoubleIterator;", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
final class ArrayDoubleIterator extends DoubleIterator {

    /* JADX INFO: renamed from: a */
    public final double[] f51637a;

    /* JADX INFO: renamed from: b */
    public int f51638b;

    public ArrayDoubleIterator(double[] array) {
        Intrinsics.m18599g(array, "array");
        this.f51637a = array;
    }

    @Override // kotlin.collections.DoubleIterator
    /* JADX INFO: renamed from: c */
    public final double mo18478c() {
        try {
            double[] dArr = this.f51637a;
            int i = this.f51638b;
            this.f51638b = i + 1;
            return dArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f51638b--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f51638b < this.f51637a.length;
    }
}
