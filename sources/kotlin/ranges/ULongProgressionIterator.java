package kotlin.ranges;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.ULong;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@SinceKotlin
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"Lkotlin/ranges/ULongProgressionIterator;", "", "Lkotlin/ULong;", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
final class ULongProgressionIterator implements Iterator<ULong>, KMappedMarker {

    /* JADX INFO: renamed from: a */
    public final long f51705a;

    /* JADX INFO: renamed from: b */
    public boolean f51706b;

    /* JADX INFO: renamed from: c */
    public final long f51707c;

    /* JADX INFO: renamed from: d */
    public long f51708d;

    public ULongProgressionIterator(long j, long j2) {
        this.f51705a = j;
        boolean z2 = false;
        if (j2 <= 0 ? Long.compare(Long.MAX_VALUE, Long.MIN_VALUE ^ j) >= 0 : Long.compare(Long.MAX_VALUE, Long.MIN_VALUE ^ j) <= 0) {
            z2 = true;
        }
        this.f51706b = z2;
        this.f51707c = j2;
        this.f51708d = z2 ? -1L : j;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f51706b;
    }

    @Override // java.util.Iterator
    public final ULong next() {
        long j = this.f51708d;
        if (j != this.f51705a) {
            this.f51708d = this.f51707c + j;
        } else {
            if (!this.f51706b) {
                throw new NoSuchElementException();
            }
            this.f51706b = false;
        }
        return new ULong(j);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
