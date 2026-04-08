package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.os.Trace;
import androidx.core.os.TraceCompat;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class GapWorker implements Runnable {

    /* JADX INFO: renamed from: f */
    public static final ThreadLocal f31625f = new ThreadLocal();

    /* JADX INFO: renamed from: g */
    public static final Comparator f31626g = new C21251();

    /* JADX INFO: renamed from: a */
    public ArrayList f31627a;

    /* JADX INFO: renamed from: b */
    public long f31628b;

    /* JADX INFO: renamed from: c */
    public long f31629c;

    /* JADX INFO: renamed from: d */
    public ArrayList f31630d;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.GapWorker$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C21251 implements Comparator<Task> {
        @Override // java.util.Comparator
        public final int compare(Task task, Task task2) {
            Task task3 = task;
            Task task4 = task2;
            RecyclerView recyclerView = task3.f31638d;
            if ((recyclerView == null) == (task4.f31638d == null)) {
                boolean z2 = task3.f31635a;
                if (z2 == task4.f31635a) {
                    int i = task4.f31636b - task3.f31636b;
                    if (i != 0) {
                        return i;
                    }
                    int i2 = task3.f31637c - task4.f31637c;
                    if (i2 != 0) {
                        return i2;
                    }
                    return 0;
                }
                if (z2) {
                    return -1;
                }
            } else if (recyclerView != null) {
                return -1;
            }
            return 1;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @SuppressLint({"VisibleForTests"})
    public static class LayoutPrefetchRegistryImpl implements RecyclerView.LayoutManager.LayoutPrefetchRegistry {

        /* JADX INFO: renamed from: a */
        public int f31631a;

        /* JADX INFO: renamed from: b */
        public int f31632b;

        /* JADX INFO: renamed from: c */
        public int[] f31633c;

        /* JADX INFO: renamed from: d */
        public int f31634d;

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager.LayoutPrefetchRegistry
        /* JADX INFO: renamed from: a */
        public final void mo11573a(int i, int i2) {
            if (i < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            }
            if (i2 < 0) {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
            int i3 = this.f31634d;
            int i4 = i3 * 2;
            int[] iArr = this.f31633c;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.f31633c = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i4 >= iArr.length) {
                int[] iArr3 = new int[i3 * 4];
                this.f31633c = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            }
            int[] iArr4 = this.f31633c;
            iArr4[i4] = i;
            iArr4[i4 + 1] = i2;
            this.f31634d++;
        }

        /* JADX INFO: renamed from: b */
        public final void m11574b(RecyclerView recyclerView, boolean z2) {
            this.f31634d = 0;
            int[] iArr = this.f31633c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.LayoutManager layoutManager = recyclerView.mLayout;
            if (recyclerView.mAdapter == null || layoutManager == null || !layoutManager.isItemPrefetchEnabled()) {
                return;
            }
            if (z2) {
                if (!recyclerView.mAdapterHelper.m11528g()) {
                    layoutManager.collectInitialPrefetchPositions(recyclerView.mAdapter.getItemCount(), this);
                }
            } else if (!recyclerView.hasPendingAdapterUpdates()) {
                layoutManager.collectAdjacentPrefetchPositions(this.f31631a, this.f31632b, recyclerView.mState, this);
            }
            int i = this.f31634d;
            if (i > layoutManager.mPrefetchMaxCountObserved) {
                layoutManager.mPrefetchMaxCountObserved = i;
                layoutManager.mPrefetchMaxObservedInInitialPrefetch = z2;
                recyclerView.mRecycler.m11697n();
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class Task {

        /* JADX INFO: renamed from: a */
        public boolean f31635a;

        /* JADX INFO: renamed from: b */
        public int f31636b;

        /* JADX INFO: renamed from: c */
        public int f31637c;

        /* JADX INFO: renamed from: d */
        public RecyclerView f31638d;

        /* JADX INFO: renamed from: e */
        public int f31639e;
    }

    /* JADX INFO: renamed from: c */
    public static RecyclerView.ViewHolder m11570c(RecyclerView recyclerView, int i, long j) {
        int childCount = RecyclerView.this.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            RecyclerView.ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(RecyclerView.this.getChildAt(i2));
            if (childViewHolderInt.mPosition == i && !childViewHolderInt.isInvalid()) {
                return null;
            }
        }
        RecyclerView.Recycler recycler = recyclerView.mRecycler;
        try {
            recyclerView.onEnterLayoutOrScroll();
            RecyclerView.ViewHolder viewHolderM11695l = recycler.m11695l(i, j);
            if (viewHolderM11695l != null) {
                if (!viewHolderM11695l.isBound() || viewHolderM11695l.isInvalid()) {
                    recycler.m11685a(viewHolderM11695l, false);
                } else {
                    recycler.m11692i(viewHolderM11695l.itemView);
                }
            }
            recyclerView.onExitLayoutOrScroll(false);
            return viewHolderM11695l;
        } catch (Throwable th) {
            recyclerView.onExitLayoutOrScroll(false);
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m11571a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.isAttachedToWindow() && this.f31628b == 0) {
            this.f31628b = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        LayoutPrefetchRegistryImpl layoutPrefetchRegistryImpl = recyclerView.mPrefetchRegistry;
        layoutPrefetchRegistryImpl.f31631a = i;
        layoutPrefetchRegistryImpl.f31632b = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00ca  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m11572b(long j) {
        Task task;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        Task task2;
        ArrayList arrayList = this.f31627a;
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList.get(i2);
            if (recyclerView3.getWindowVisibility() == 0) {
                recyclerView3.mPrefetchRegistry.m11574b(recyclerView3, false);
                i += recyclerView3.mPrefetchRegistry.f31634d;
            }
        }
        ArrayList arrayList2 = this.f31630d;
        arrayList2.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList.get(i4);
            if (recyclerView4.getWindowVisibility() == 0) {
                LayoutPrefetchRegistryImpl layoutPrefetchRegistryImpl = recyclerView4.mPrefetchRegistry;
                int iAbs = Math.abs(layoutPrefetchRegistryImpl.f31632b) + Math.abs(layoutPrefetchRegistryImpl.f31631a);
                for (int i5 = 0; i5 < layoutPrefetchRegistryImpl.f31634d * 2; i5 += 2) {
                    if (i3 >= arrayList2.size()) {
                        task2 = new Task();
                        arrayList2.add(task2);
                    } else {
                        task2 = (Task) arrayList2.get(i3);
                    }
                    int[] iArr = layoutPrefetchRegistryImpl.f31633c;
                    int i6 = iArr[i5 + 1];
                    task2.f31635a = i6 <= iAbs;
                    task2.f31636b = iAbs;
                    task2.f31637c = i6;
                    task2.f31638d = recyclerView4;
                    task2.f31639e = iArr[i5];
                    i3++;
                }
            }
        }
        Collections.sort(arrayList2, f31626g);
        for (int i7 = 0; i7 < arrayList2.size() && (recyclerView = (task = (Task) arrayList2.get(i7)).f31638d) != null; i7++) {
            RecyclerView.ViewHolder viewHolderM11570c = m11570c(recyclerView, task.f31639e, task.f31635a ? Long.MAX_VALUE : j);
            if (viewHolderM11570c != null && viewHolderM11570c.mNestedRecyclerView != null && viewHolderM11570c.isBound() && !viewHolderM11570c.isInvalid() && (recyclerView2 = viewHolderM11570c.mNestedRecyclerView.get()) != null) {
                if (recyclerView2.mDataSetHasChangedAfterLayout && RecyclerView.this.getChildCount() != 0) {
                    recyclerView2.removeAndRecycleViews();
                }
                LayoutPrefetchRegistryImpl layoutPrefetchRegistryImpl2 = recyclerView2.mPrefetchRegistry;
                layoutPrefetchRegistryImpl2.m11574b(recyclerView2, true);
                if (layoutPrefetchRegistryImpl2.f31634d != 0) {
                    try {
                        int i8 = TraceCompat.f23262a;
                        Trace.beginSection("RV Nested Prefetch");
                        RecyclerView.State state = recyclerView2.mState;
                        RecyclerView.Adapter adapter = recyclerView2.mAdapter;
                        state.f31752d = 1;
                        state.f31753e = adapter.getItemCount();
                        state.f31755g = false;
                        state.f31756h = false;
                        state.f31757i = false;
                        for (int i9 = 0; i9 < layoutPrefetchRegistryImpl2.f31634d * 2; i9 += 2) {
                            m11570c(recyclerView2, layoutPrefetchRegistryImpl2.f31633c[i9], j);
                        }
                        Trace.endSection();
                    } catch (Throwable th) {
                        int i10 = TraceCompat.f23262a;
                        Trace.endSection();
                        throw th;
                    }
                }
            }
            task.f31635a = false;
            task.f31636b = 0;
            task.f31637c = 0;
            task.f31638d = null;
            task.f31639e = 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i = TraceCompat.f23262a;
            Trace.beginSection("RV Prefetch");
            ArrayList arrayList = this.f31627a;
            if (arrayList.isEmpty()) {
                this.f31628b = 0L;
                Trace.endSection();
                return;
            }
            int size = arrayList.size();
            long jMax = 0;
            for (int i2 = 0; i2 < size; i2++) {
                RecyclerView recyclerView = (RecyclerView) arrayList.get(i2);
                if (recyclerView.getWindowVisibility() == 0) {
                    jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                }
            }
            if (jMax == 0) {
                this.f31628b = 0L;
                Trace.endSection();
            } else {
                m11572b(TimeUnit.MILLISECONDS.toNanos(jMax) + this.f31629c);
                this.f31628b = 0L;
                Trace.endSection();
            }
        } catch (Throwable th) {
            this.f31628b = 0L;
            int i3 = TraceCompat.f23262a;
            Trace.endSection();
            throw th;
        }
    }
}
