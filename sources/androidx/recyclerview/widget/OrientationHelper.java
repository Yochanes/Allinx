package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public abstract class OrientationHelper {

    /* JADX INFO: renamed from: a */
    public final RecyclerView.LayoutManager f31691a;

    /* JADX INFO: renamed from: b */
    public int f31692b = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: c */
    public final Rect f31693c = new Rect();

    /* JADX INFO: renamed from: androidx.recyclerview.widget.OrientationHelper$1 */
    /* JADX INFO: compiled from: Proguard */
    class C21391 extends OrientationHelper {
        @Override // androidx.recyclerview.widget.OrientationHelper
        /* JADX INFO: renamed from: b */
        public final int mo11612b(View view) {
            return this.f31691a.getDecoratedRight(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).rightMargin;
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        /* JADX INFO: renamed from: c */
        public final int mo11613c(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            return this.f31691a.getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        /* JADX INFO: renamed from: d */
        public final int mo11614d(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            return this.f31691a.getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        /* JADX INFO: renamed from: e */
        public final int mo11615e(View view) {
            return this.f31691a.getDecoratedLeft(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).leftMargin;
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        /* JADX INFO: renamed from: f */
        public final int mo11616f() {
            return this.f31691a.getWidth();
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        /* JADX INFO: renamed from: g */
        public final int mo11617g() {
            RecyclerView.LayoutManager layoutManager = this.f31691a;
            return layoutManager.getWidth() - layoutManager.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        /* JADX INFO: renamed from: h */
        public final int mo11618h() {
            return this.f31691a.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        /* JADX INFO: renamed from: i */
        public final int mo11619i() {
            return this.f31691a.getWidthMode();
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        /* JADX INFO: renamed from: j */
        public final int mo11620j() {
            return this.f31691a.getHeightMode();
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        /* JADX INFO: renamed from: k */
        public final int mo11621k() {
            return this.f31691a.getPaddingLeft();
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        /* JADX INFO: renamed from: l */
        public final int mo11622l() {
            RecyclerView.LayoutManager layoutManager = this.f31691a;
            return (layoutManager.getWidth() - layoutManager.getPaddingLeft()) - layoutManager.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        /* JADX INFO: renamed from: m */
        public final int mo11623m(View view) {
            RecyclerView.LayoutManager layoutManager = this.f31691a;
            Rect rect = this.f31693c;
            layoutManager.getTransformedBoundingBox(view, true, rect);
            return rect.right;
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        /* JADX INFO: renamed from: n */
        public final int mo11624n(View view) {
            RecyclerView.LayoutManager layoutManager = this.f31691a;
            Rect rect = this.f31693c;
            layoutManager.getTransformedBoundingBox(view, true, rect);
            return rect.left;
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        /* JADX INFO: renamed from: o */
        public final void mo11625o(int i) {
            this.f31691a.offsetChildrenHorizontal(i);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.OrientationHelper$2 */
    /* JADX INFO: compiled from: Proguard */
    class C21402 extends OrientationHelper {
        @Override // androidx.recyclerview.widget.OrientationHelper
        /* JADX INFO: renamed from: b */
        public final int mo11612b(View view) {
            return this.f31691a.getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        /* JADX INFO: renamed from: c */
        public final int mo11613c(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            return this.f31691a.getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        /* JADX INFO: renamed from: d */
        public final int mo11614d(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            return this.f31691a.getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        /* JADX INFO: renamed from: e */
        public final int mo11615e(View view) {
            return this.f31691a.getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).topMargin;
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        /* JADX INFO: renamed from: f */
        public final int mo11616f() {
            return this.f31691a.getHeight();
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        /* JADX INFO: renamed from: g */
        public final int mo11617g() {
            RecyclerView.LayoutManager layoutManager = this.f31691a;
            return layoutManager.getHeight() - layoutManager.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        /* JADX INFO: renamed from: h */
        public final int mo11618h() {
            return this.f31691a.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        /* JADX INFO: renamed from: i */
        public final int mo11619i() {
            return this.f31691a.getHeightMode();
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        /* JADX INFO: renamed from: j */
        public final int mo11620j() {
            return this.f31691a.getWidthMode();
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        /* JADX INFO: renamed from: k */
        public final int mo11621k() {
            return this.f31691a.getPaddingTop();
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        /* JADX INFO: renamed from: l */
        public final int mo11622l() {
            RecyclerView.LayoutManager layoutManager = this.f31691a;
            return (layoutManager.getHeight() - layoutManager.getPaddingTop()) - layoutManager.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        /* JADX INFO: renamed from: m */
        public final int mo11623m(View view) {
            RecyclerView.LayoutManager layoutManager = this.f31691a;
            Rect rect = this.f31693c;
            layoutManager.getTransformedBoundingBox(view, true, rect);
            return rect.bottom;
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        /* JADX INFO: renamed from: n */
        public final int mo11624n(View view) {
            RecyclerView.LayoutManager layoutManager = this.f31691a;
            Rect rect = this.f31693c;
            layoutManager.getTransformedBoundingBox(view, true, rect);
            return rect.top;
        }

        @Override // androidx.recyclerview.widget.OrientationHelper
        /* JADX INFO: renamed from: o */
        public final void mo11625o(int i) {
            this.f31691a.offsetChildrenVertical(i);
        }
    }

    public OrientationHelper(RecyclerView.LayoutManager layoutManager) {
        this.f31691a = layoutManager;
    }

    /* JADX INFO: renamed from: a */
    public static OrientationHelper m11611a(RecyclerView.LayoutManager layoutManager, int i) {
        if (i == 0) {
            return new C21391(layoutManager);
        }
        if (i == 1) {
            return new C21402(layoutManager);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    /* JADX INFO: renamed from: b */
    public abstract int mo11612b(View view);

    /* JADX INFO: renamed from: c */
    public abstract int mo11613c(View view);

    /* JADX INFO: renamed from: d */
    public abstract int mo11614d(View view);

    /* JADX INFO: renamed from: e */
    public abstract int mo11615e(View view);

    /* JADX INFO: renamed from: f */
    public abstract int mo11616f();

    /* JADX INFO: renamed from: g */
    public abstract int mo11617g();

    /* JADX INFO: renamed from: h */
    public abstract int mo11618h();

    /* JADX INFO: renamed from: i */
    public abstract int mo11619i();

    /* JADX INFO: renamed from: j */
    public abstract int mo11620j();

    /* JADX INFO: renamed from: k */
    public abstract int mo11621k();

    /* JADX INFO: renamed from: l */
    public abstract int mo11622l();

    /* JADX INFO: renamed from: m */
    public abstract int mo11623m(View view);

    /* JADX INFO: renamed from: n */
    public abstract int mo11624n(View view);

    /* JADX INFO: renamed from: o */
    public abstract void mo11625o(int i);
}
