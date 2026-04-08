package androidx.collection;

import kotlin.Metadata;
import kotlin.collections.IntIterator;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"androidx/collection/SparseArrayKt$keyIterator$1", "Lkotlin/collections/IntIterator;", "collection"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class SparseArrayKt$keyIterator$1 extends IntIterator {

    /* JADX INFO: renamed from: a */
    public int f3890a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ SparseArrayCompat f3891b;

    public SparseArrayKt$keyIterator$1(SparseArrayCompat sparseArrayCompat) {
        this.f3891b = sparseArrayCompat;
    }

    @Override // kotlin.collections.IntIterator
    /* JADX INFO: renamed from: c */
    public final int mo2140c() {
        int i = this.f3890a;
        this.f3890a = i + 1;
        return this.f3891b.m2135d(i);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3890a < this.f3891b.m2137f();
    }
}
