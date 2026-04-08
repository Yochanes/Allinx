package org.jetbrains.anko;

import android.view.View;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.EmptyIterator;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.sequences.Sequence;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m18302d2 = {"Lorg/jetbrains/anko/ViewChildrenRecursiveSequence;", "Lkotlin/sequences/Sequence;", "Landroid/view/View;", "RecursiveViewIterator", "commons-base_release"}, m18303k = 1, m18304mv = {1, 4, 0})
final class ViewChildrenRecursiveSequence implements Sequence<View> {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"Lorg/jetbrains/anko/ViewChildrenRecursiveSequence$RecursiveViewIterator;", "", "Landroid/view/View;", "commons-base_release"}, m18303k = 1, m18304mv = {1, 4, 0})
    public static final class RecursiveViewIterator implements Iterator<View>, KMappedMarker {
        @Override // java.util.Iterator
        public final boolean hasNext() {
            throw null;
        }

        @Override // java.util.Iterator
        public final View next() {
            if (hasNext()) {
                throw null;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // kotlin.sequences.Sequence
    /* JADX INFO: renamed from: iterator */
    public final Iterator getF55142a() {
        return EmptyIterator.f51495a;
    }
}
