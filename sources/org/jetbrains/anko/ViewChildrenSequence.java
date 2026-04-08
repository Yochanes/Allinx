package org.jetbrains.anko;

import android.view.View;
import android.view.ViewGroup;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.EmptyIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.sequences.Sequence;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m18302d2 = {"Lorg/jetbrains/anko/ViewChildrenSequence;", "Lkotlin/sequences/Sequence;", "Landroid/view/View;", "ViewIterator", "commons-base_release"}, m18303k = 1, m18304mv = {1, 4, 0})
final class ViewChildrenSequence implements Sequence<View> {

    /* JADX INFO: renamed from: a */
    public final ViewGroup f58167a;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"Lorg/jetbrains/anko/ViewChildrenSequence$ViewIterator;", "", "Landroid/view/View;", "commons-base_release"}, m18303k = 1, m18304mv = {1, 4, 0})
    public static final class ViewIterator implements Iterator<View>, KMappedMarker {

        /* JADX INFO: renamed from: a */
        public int f58168a;

        /* JADX INFO: renamed from: b */
        public final int f58169b;

        /* JADX INFO: renamed from: c */
        public final ViewGroup f58170c;

        public ViewIterator(ViewGroup view) {
            Intrinsics.m18600h(view, "view");
            this.f58170c = view;
            this.f58169b = view.getChildCount();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            int childCount = this.f58170c.getChildCount();
            int i = this.f58169b;
            if (i == childCount) {
                return this.f58168a < i;
            }
            throw new ConcurrentModificationException();
        }

        @Override // java.util.Iterator
        public final View next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int i = this.f58168a;
            this.f58168a = i + 1;
            View childAt = this.f58170c.getChildAt(i);
            Intrinsics.m18595c(childAt, "view.getChildAt(index++)");
            return childAt;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public ViewChildrenSequence(ViewGroup view) {
        Intrinsics.m18600h(view, "view");
        this.f58167a = view;
    }

    @Override // kotlin.sequences.Sequence
    /* JADX INFO: renamed from: iterator */
    public final Iterator getF55142a() {
        ViewGroup viewGroup = this.f58167a;
        return viewGroup == null ? EmptyIterator.f51495a : new ViewIterator(viewGroup);
    }
}
