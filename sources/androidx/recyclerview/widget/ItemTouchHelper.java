package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.annotation.VisibleForTesting;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class ItemTouchHelper extends RecyclerView.ItemDecoration implements RecyclerView.OnChildAttachStateChangeListener {

    /* JADX INFO: renamed from: androidx.recyclerview.widget.ItemTouchHelper$1 */
    /* JADX INFO: compiled from: Proguard */
    public class RunnableC21261 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.ItemTouchHelper$2 */
    /* JADX INFO: compiled from: Proguard */
    public class C21272 implements RecyclerView.OnItemTouchListener {
        @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
        /* JADX INFO: renamed from: a */
        public final void mo11563a(MotionEvent motionEvent) {
            throw null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
        /* JADX INFO: renamed from: d */
        public final boolean mo11564d(MotionEvent motionEvent) {
            throw null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
        /* JADX INFO: renamed from: e */
        public final void mo11565e(boolean z2) {
            if (z2) {
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.ItemTouchHelper$3 */
    /* JADX INFO: compiled from: Proguard */
    class C21283 extends RecoverAnimation {
        @Override // androidx.recyclerview.widget.ItemTouchHelper.RecoverAnimation, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            throw null;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.ItemTouchHelper$4 */
    /* JADX INFO: compiled from: Proguard */
    class RunnableC21294 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.ItemTouchHelper$5 */
    /* JADX INFO: compiled from: Proguard */
    class C21305 implements RecyclerView.ChildDrawingOrderCallback {
        @Override // androidx.recyclerview.widget.RecyclerView.ChildDrawingOrderCallback
        /* JADX INFO: renamed from: a */
        public final int mo11588a(int i, int i2) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static abstract class Callback {

        /* JADX INFO: renamed from: androidx.recyclerview.widget.ItemTouchHelper$Callback$1 */
        /* JADX INFO: compiled from: Proguard */
        public class InterpolatorC21311 implements Interpolator {
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f) {
                return f * f * f * f * f;
            }
        }

        /* JADX INFO: renamed from: androidx.recyclerview.widget.ItemTouchHelper$Callback$2 */
        /* JADX INFO: compiled from: Proguard */
        public class InterpolatorC21322 implements Interpolator {
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f) {
                float f2 = f - 1.0f;
                return (f2 * f2 * f2 * f2 * f2) + 1.0f;
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static abstract class SimpleCallback extends Callback {
    }

    /* JADX INFO: compiled from: Proguard */
    public interface ViewDropHandler {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
    /* JADX INFO: renamed from: b */
    public final void mo11586b(View view) {
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        rect.setEmpty();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        throw null;
    }

    /* JADX INFO: compiled from: Proguard */
    public class ItemTouchHelperGestureListener extends GestureDetector.SimpleOnGestureListener {
        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final void onLongPress(MotionEvent motionEvent) {
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @VisibleForTesting
    public static class RecoverAnimation implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public boolean f31652a;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.ItemTouchHelper$RecoverAnimation$1 */
        /* JADX INFO: compiled from: Proguard */
        class C21331 implements ValueAnimator.AnimatorUpdateListener {
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                valueAnimator.getAnimatedFraction();
                throw null;
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.f31652a) {
                throw null;
            }
            this.f31652a = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
    /* JADX INFO: renamed from: c */
    public final void mo11587c(View view) {
    }
}
