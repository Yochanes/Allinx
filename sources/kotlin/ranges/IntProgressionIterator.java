package kotlin.ranges;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.IntIterator;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlin/ranges/IntProgressionIterator;", "Lkotlin/collections/IntIterator;", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
public final class IntProgressionIterator extends IntIterator {

    /* JADX INFO: renamed from: a */
    public final int f51688a;

    /* JADX INFO: renamed from: b */
    public final int f51689b;

    /* JADX INFO: renamed from: c */
    public boolean f51690c;

    /* JADX INFO: renamed from: d */
    public int f51691d;

    public IntProgressionIterator(int i, int i2, int i3) {
        this.f51688a = i3;
        this.f51689b = i2;
        boolean z2 = false;
        if (i3 <= 0 ? i >= i2 : i <= i2) {
            z2 = true;
        }
        this.f51690c = z2;
        this.f51691d = z2 ? i : i2;
    }

    @Override // kotlin.collections.IntIterator
    /* JADX INFO: renamed from: c */
    public final int mo2140c() {
        int i = this.f51691d;
        if (i != this.f51689b) {
            this.f51691d = this.f51688a + i;
            return i;
        }
        if (!this.f51690c) {
            throw new NoSuchElementException();
        }
        this.f51690c = false;
        return i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f51690c;
    }
}
