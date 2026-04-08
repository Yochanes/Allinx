package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.ByteIterator;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlin/jvm/internal/ArrayByteIterator;", "Lkotlin/collections/ByteIterator;", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
final class ArrayByteIterator extends ByteIterator {

    /* JADX INFO: renamed from: a */
    public int f51635a;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        throw null;
    }

    @Override // kotlin.collections.ByteIterator
    public final byte nextByte() {
        try {
            this.f51635a++;
            throw null;
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f51635a--;
            throw new NoSuchElementException(e.getMessage());
        }
    }
}
