package kotlin.ranges;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.LongIterator;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlin/ranges/LongProgressionIterator;", "Lkotlin/collections/LongIterator;", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
public final class LongProgressionIterator extends LongIterator {

    /* JADX INFO: renamed from: a */
    public final long f51693a;

    /* JADX INFO: renamed from: b */
    public final long f51694b;

    /* JADX INFO: renamed from: c */
    public boolean f51695c;

    /* JADX INFO: renamed from: d */
    public long f51696d;

    public LongProgressionIterator(long j, long j2, long j3) {
        this.f51693a = j3;
        this.f51694b = j2;
        boolean z2 = false;
        if (j3 <= 0 ? j >= j2 : j <= j2) {
            z2 = true;
        }
        this.f51695c = z2;
        this.f51696d = z2 ? j : j2;
    }

    @Override // kotlin.collections.LongIterator
    /* JADX INFO: renamed from: c */
    public final long mo2009c() {
        long j = this.f51696d;
        if (j != this.f51694b) {
            this.f51696d = this.f51693a + j;
            return j;
        }
        if (!this.f51695c) {
            throw new NoSuchElementException();
        }
        this.f51695c = false;
        return j;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f51695c;
    }
}
