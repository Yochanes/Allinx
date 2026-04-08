package org.jetbrains.anko.collections;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.sequences.Sequence;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u0003¨\u0006\u0004"}, m18302d2 = {"Lorg/jetbrains/anko/collections/SparseArraySequence;", "T", "Lkotlin/sequences/Sequence;", "SparseArrayIterator", "commons-base_release"}, m18303k = 1, m18304mv = {1, 4, 0})
@PublishedApi
public final class SparseArraySequence<T> implements Sequence<T> {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0000\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Lorg/jetbrains/anko/collections/SparseArraySequence$SparseArrayIterator;", "", "commons-base_release"}, m18303k = 1, m18304mv = {1, 4, 0})
    public final class SparseArrayIterator implements Iterator<T>, KMappedMarker {
        public SparseArrayIterator() {
            SparseArraySequence.this.getClass();
            throw null;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public final Object next() {
            SparseArraySequence.this.getClass();
            throw null;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // kotlin.sequences.Sequence
    /* JADX INFO: renamed from: iterator */
    public final Iterator getF55142a() {
        new SparseArrayIterator();
        throw null;
    }
}
