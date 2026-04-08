package androidx.viewpager2.widget;

import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.adapter.StatefulAdapter;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final class ViewPager2 extends ViewGroup {

    /* JADX INFO: renamed from: a */
    public int f32518a;

    /* JADX INFO: renamed from: b */
    public int f32519b;

    /* JADX INFO: renamed from: c */
    public Parcelable f32520c;

    /* JADX INFO: renamed from: d */
    public int f32521d;

    /* JADX INFO: renamed from: androidx.viewpager2.widget.ViewPager2$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C22571 extends DataSetChangeObserver {
        @Override // androidx.viewpager2.widget.ViewPager2.DataSetChangeObserver, androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onChanged() {
            throw null;
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager2.widget.ViewPager2$2 */
    /* JADX INFO: compiled from: Proguard */
    class C22582 extends OnPageChangeCallback {
    }

    /* JADX INFO: renamed from: androidx.viewpager2.widget.ViewPager2$3 */
    /* JADX INFO: compiled from: Proguard */
    class C22593 extends OnPageChangeCallback {
    }

    /* JADX INFO: compiled from: Proguard */
    public abstract class AccessibilityProvider {
    }

    /* JADX INFO: compiled from: Proguard */
    public class BasicAccessibilityProvider extends AccessibilityProvider {
    }

    /* JADX INFO: compiled from: Proguard */
    public static abstract class DataSetChangeObserver extends RecyclerView.AdapterDataObserver {
        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public abstract void onChanged();

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeChanged(int i, int i2) {
            onChanged();
            throw null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeInserted(int i, int i2) {
            onChanged();
            throw null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeMoved(int i, int i2, int i3) {
            onChanged();
            throw null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeRemoved(int i, int i2) {
            onChanged();
            throw null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeChanged(int i, int i2, Object obj) {
            onChanged();
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public class LinearLayoutManagerImpl extends LinearLayoutManager {
        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public final void calculateExtraLayoutSpace(RecyclerView.State state, int[] iArr) {
            throw null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
        public final void onInitializeAccessibilityNodeInfo(RecyclerView.Recycler recycler, RecyclerView.State state, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(recycler, state, accessibilityNodeInfoCompat);
            throw null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
        public final boolean performAccessibilityAction(RecyclerView.Recycler recycler, RecyclerView.State state, int i, Bundle bundle) {
            throw null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
        public final boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z2, boolean z3) {
            return false;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @IntRange
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface OffscreenPageLimit {
    }

    /* JADX INFO: compiled from: Proguard */
    public static abstract class OnPageChangeCallback {
    }

    /* JADX INFO: compiled from: Proguard */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface Orientation {
    }

    /* JADX INFO: compiled from: Proguard */
    public class PageAwareAccessibilityProvider extends AccessibilityProvider {

        /* JADX INFO: renamed from: androidx.viewpager2.widget.ViewPager2$PageAwareAccessibilityProvider$1 */
        /* JADX INFO: compiled from: Proguard */
        public class C22611 implements AccessibilityViewCommand {
            @Override // androidx.core.view.accessibility.AccessibilityViewCommand
            public final boolean perform(View view, AccessibilityViewCommand.CommandArguments commandArguments) {
                ((ViewPager2) view).getCurrentItem();
                throw null;
            }
        }

        /* JADX INFO: renamed from: androidx.viewpager2.widget.ViewPager2$PageAwareAccessibilityProvider$2 */
        /* JADX INFO: compiled from: Proguard */
        public class C22622 implements AccessibilityViewCommand {
            @Override // androidx.core.view.accessibility.AccessibilityViewCommand
            public final boolean perform(View view, AccessibilityViewCommand.CommandArguments commandArguments) {
                ((ViewPager2) view).getCurrentItem();
                throw null;
            }
        }

        /* JADX INFO: renamed from: androidx.viewpager2.widget.ViewPager2$PageAwareAccessibilityProvider$3 */
        /* JADX INFO: compiled from: Proguard */
        class C22633 extends DataSetChangeObserver {
            @Override // androidx.viewpager2.widget.ViewPager2.DataSetChangeObserver, androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public final void onChanged() {
                throw null;
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface PageTransformer {
    }

    /* JADX INFO: compiled from: Proguard */
    public class PagerSnapHelperImpl extends PagerSnapHelper {
        @Override // androidx.recyclerview.widget.PagerSnapHelper, androidx.recyclerview.widget.SnapHelper
        public final View findSnapView(RecyclerView.LayoutManager layoutManager) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public class RecyclerViewImpl extends RecyclerView {
        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
        public final CharSequence getAccessibilityClassName() {
            throw null;
        }

        @Override // android.view.View
        public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            throw null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            throw null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface ScrollState {
    }

    /* JADX INFO: compiled from: Proguard */
    public static class SmoothScrollToPosition implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        throw null;
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        RecyclerView.Adapter adapter;
        Parcelable parcelable = (Parcelable) sparseArray.get(getId());
        if (parcelable instanceof SavedState) {
            int i = ((SavedState) parcelable).f32522a;
            throw null;
        }
        super.dispatchRestoreInstanceState(sparseArray);
        if (this.f32519b == -1 || (adapter = getAdapter()) == 0) {
            return;
        }
        if (this.f32520c != null) {
            if (adapter instanceof StatefulAdapter) {
                ((StatefulAdapter) adapter).mo12083a();
                throw null;
            }
            this.f32520c = null;
        }
        this.f32518a = Math.max(0, Math.min(this.f32519b, adapter.getItemCount() - 1));
        this.f32519b = -1;
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    @RequiresApi
    public CharSequence getAccessibilityClassName() {
        throw null;
    }

    @Nullable
    public RecyclerView.Adapter getAdapter() {
        throw null;
    }

    public int getCurrentItem() {
        return this.f32518a;
    }

    public int getItemDecorationCount() {
        throw null;
    }

    public int getOffscreenPageLimit() {
        return this.f32521d;
    }

    public int getOrientation() {
        throw null;
    }

    public int getPageSize() {
        if (getOrientation() == 0) {
            throw null;
        }
        throw null;
    }

    public int getScrollState() {
        throw null;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        throw null;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        measureChild(null, i, i2);
        throw null;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f32519b = savedState.f32523b;
        this.f32520c = savedState.f32524c;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        new SavedState(super.onSaveInstanceState());
        throw null;
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        throw new IllegalStateException("ViewPager2 does not support direct child views");
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        throw null;
    }

    public void setAdapter(@Nullable RecyclerView.Adapter adapter) {
        throw null;
    }

    public void setCurrentItem(int i) {
        throw null;
    }

    @Override // android.view.View
    @RequiresApi
    public void setLayoutDirection(int i) {
        super.setLayoutDirection(i);
        throw null;
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1 && i != -1) {
            throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        }
        this.f32521d = i;
        throw null;
    }

    public void setOrientation(int i) {
        throw null;
    }

    public void setPageTransformer(@Nullable PageTransformer pageTransformer) {
        if (pageTransformer == null) {
            throw null;
        }
        throw null;
    }

    public void setUserInputEnabled(boolean z2) {
        throw null;
    }

    /* JADX INFO: compiled from: Proguard */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C22641();

        /* JADX INFO: renamed from: a */
        public int f32522a;

        /* JADX INFO: renamed from: b */
        public int f32523b;

        /* JADX INFO: renamed from: c */
        public Parcelable f32524c;

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f32522a);
            parcel.writeInt(this.f32523b);
            parcel.writeParcelable(this.f32524c, i);
        }

        /* JADX INFO: renamed from: androidx.viewpager2.widget.ViewPager2$SavedState$1 */
        /* JADX INFO: compiled from: Proguard */
        public static class C22641 implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                SavedState savedState = new SavedState(parcel, null);
                savedState.f32522a = parcel.readInt();
                savedState.f32523b = parcel.readInt();
                savedState.f32524c = parcel.readParcelable(null);
                return savedState;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                SavedState savedState = new SavedState(parcel, classLoader);
                savedState.f32522a = parcel.readInt();
                savedState.f32523b = parcel.readInt();
                savedState.f32524c = parcel.readParcelable(classLoader);
                return savedState;
            }
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager2.widget.ViewPager2$4 */
    /* JADX INFO: compiled from: Proguard */
    class C22604 implements RecyclerView.OnChildAttachStateChangeListener {
        @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
        /* JADX INFO: renamed from: c */
        public final void mo11587c(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            if (((ViewGroup.MarginLayoutParams) layoutParams).width != -1 || ((ViewGroup.MarginLayoutParams) layoutParams).height != -1) {
                throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
        /* JADX INFO: renamed from: b */
        public final void mo11586b(View view) {
        }
    }
}
