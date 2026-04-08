package kotlin.ranges;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.UInt;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@SinceKotlin
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"Lkotlin/ranges/UIntProgressionIterator;", "", "Lkotlin/UInt;", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
final class UIntProgressionIterator implements Iterator<UInt>, KMappedMarker {

    /* JADX INFO: renamed from: a */
    public final int f51699a;

    /* JADX INFO: renamed from: b */
    public boolean f51700b;

    /* JADX INFO: renamed from: c */
    public final int f51701c;

    /* JADX INFO: renamed from: d */
    public int f51702d;

    public UIntProgressionIterator(int i, int i2) {
        this.f51699a = i;
        boolean z2 = false;
        if (i2 <= 0 ? Integer.compare(Integer.MAX_VALUE, Integer.MIN_VALUE ^ i) >= 0 : Integer.compare(Integer.MAX_VALUE, Integer.MIN_VALUE ^ i) <= 0) {
            z2 = true;
        }
        this.f51700b = z2;
        this.f51701c = i2;
        this.f51702d = z2 ? -1 : i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f51700b;
    }

    @Override // java.util.Iterator
    public final UInt next() {
        int i = this.f51702d;
        if (i != this.f51699a) {
            this.f51702d = this.f51701c + i;
        } else {
            if (!this.f51700b) {
                throw new NoSuchElementException();
            }
            this.f51700b = false;
        }
        return new UInt(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
