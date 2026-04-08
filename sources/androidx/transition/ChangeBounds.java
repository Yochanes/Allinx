package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.ObjectAnimatorUtils;
import androidx.transition.Transition;
import java.util.HashMap;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class ChangeBounds extends Transition {

    /* JADX INFO: renamed from: a */
    public static final String[] f32163a = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* JADX INFO: renamed from: b */
    public static final Property f32164b = new C22001(PointF.class, "topLeft");

    /* JADX INFO: renamed from: c */
    public static final Property f32165c = new C22012(PointF.class, "bottomRight");

    /* JADX INFO: renamed from: d */
    public static final Property f32166d = new C22023(PointF.class, "bottomRight");

    /* JADX INFO: renamed from: f */
    public static final Property f32167f = new C22034(PointF.class, "topLeft");

    /* JADX INFO: renamed from: g */
    public static final Property f32168g = new C22045(PointF.class, "position");

    /* JADX INFO: renamed from: androidx.transition.ChangeBounds$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C22001 extends Property<ViewBounds, PointF> {
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(ViewBounds viewBounds) {
            return null;
        }

        @Override // android.util.Property
        public final void set(ViewBounds viewBounds, PointF pointF) {
            ViewBounds viewBounds2 = viewBounds;
            PointF pointF2 = pointF;
            viewBounds2.getClass();
            viewBounds2.f32172a = Math.round(pointF2.x);
            int iRound = Math.round(pointF2.y);
            viewBounds2.f32173b = iRound;
            int i = viewBounds2.f32177f + 1;
            viewBounds2.f32177f = i;
            if (i == viewBounds2.f32178g) {
                ViewUtils.m12006a(viewBounds2.f32176e, viewBounds2.f32172a, iRound, viewBounds2.f32174c, viewBounds2.f32175d);
                viewBounds2.f32177f = 0;
                viewBounds2.f32178g = 0;
            }
        }
    }

    /* JADX INFO: renamed from: androidx.transition.ChangeBounds$2 */
    /* JADX INFO: compiled from: Proguard */
    public class C22012 extends Property<ViewBounds, PointF> {
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(ViewBounds viewBounds) {
            return null;
        }

        @Override // android.util.Property
        public final void set(ViewBounds viewBounds, PointF pointF) {
            ViewBounds viewBounds2 = viewBounds;
            PointF pointF2 = pointF;
            viewBounds2.getClass();
            viewBounds2.f32174c = Math.round(pointF2.x);
            int iRound = Math.round(pointF2.y);
            viewBounds2.f32175d = iRound;
            int i = viewBounds2.f32178g + 1;
            viewBounds2.f32178g = i;
            if (viewBounds2.f32177f == i) {
                ViewUtils.m12006a(viewBounds2.f32176e, viewBounds2.f32172a, viewBounds2.f32173b, viewBounds2.f32174c, iRound);
                viewBounds2.f32177f = 0;
                viewBounds2.f32178g = 0;
            }
        }
    }

    /* JADX INFO: renamed from: androidx.transition.ChangeBounds$3 */
    /* JADX INFO: compiled from: Proguard */
    public class C22023 extends Property<View, PointF> {
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public final void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            ViewUtils.m12006a(view2, view2.getLeft(), view2.getTop(), Math.round(pointF2.x), Math.round(pointF2.y));
        }
    }

    /* JADX INFO: renamed from: androidx.transition.ChangeBounds$4 */
    /* JADX INFO: compiled from: Proguard */
    public class C22034 extends Property<View, PointF> {
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public final void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            ViewUtils.m12006a(view2, Math.round(pointF2.x), Math.round(pointF2.y), view2.getRight(), view2.getBottom());
        }
    }

    /* JADX INFO: renamed from: androidx.transition.ChangeBounds$5 */
    /* JADX INFO: compiled from: Proguard */
    public class C22045 extends Property<View, PointF> {
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public final void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            int iRound = Math.round(pointF2.x);
            int iRound2 = Math.round(pointF2.y);
            ViewUtils.m12006a(view2, iRound, iRound2, view2.getWidth() + iRound, view2.getHeight() + iRound2);
        }
    }

    /* JADX INFO: renamed from: androidx.transition.ChangeBounds$6 */
    /* JADX INFO: compiled from: Proguard */
    class C22056 extends AnimatorListenerAdapter {
        private final ViewBounds mViewBounds;

        public C22056(ViewBounds viewBounds) {
            this.mViewBounds = viewBounds;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class ClipListener extends AnimatorListenerAdapter implements Transition.TransitionListener {

        /* JADX INFO: renamed from: a */
        public boolean f32169a;

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            onAnimationStart(animator, false);
            throw null;
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionCancel(Transition transition) {
            this.f32169a = true;
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionPause(Transition transition) {
            throw null;
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionResume(Transition transition) {
            throw null;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator, boolean z2) {
            if (!this.f32169a) {
                throw null;
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator, boolean z2) {
            ViewUtils.m12006a(null, 0, 0, Math.max(0, 0), Math.max(0, 0));
            throw null;
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionEnd(Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionStart(Transition transition) {
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class SuppressLayoutListener extends TransitionListenerAdapter {

        /* JADX INFO: renamed from: a */
        public boolean f32170a = false;

        /* JADX INFO: renamed from: b */
        public final ViewGroup f32171b;

        public SuppressLayoutListener(ViewGroup viewGroup) {
            this.f32171b = viewGroup;
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public final void onTransitionCancel(Transition transition) {
            ViewGroupUtils.m12003a(this.f32171b, false);
            this.f32170a = true;
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public final void onTransitionEnd(Transition transition) {
            if (!this.f32170a) {
                ViewGroupUtils.m12003a(this.f32171b, false);
            }
            transition.removeListener(this);
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public final void onTransitionPause(Transition transition) {
            ViewGroupUtils.m12003a(this.f32171b, false);
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public final void onTransitionResume(Transition transition) {
            ViewGroupUtils.m12003a(this.f32171b, true);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class ViewBounds {

        /* JADX INFO: renamed from: a */
        public int f32172a;

        /* JADX INFO: renamed from: b */
        public int f32173b;

        /* JADX INFO: renamed from: c */
        public int f32174c;

        /* JADX INFO: renamed from: d */
        public int f32175d;

        /* JADX INFO: renamed from: e */
        public final View f32176e;

        /* JADX INFO: renamed from: f */
        public int f32177f;

        /* JADX INFO: renamed from: g */
        public int f32178g;

        public ViewBounds(View view) {
            this.f32176e = view;
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m11958f(TransitionValues transitionValues) {
        View view = transitionValues.f32282b;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        HashMap map = transitionValues.f32281a;
        map.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        map.put("android:changeBounds:parent", transitionValues.f32282b.getParent());
    }

    @Override // androidx.transition.Transition
    public final void captureEndValues(TransitionValues transitionValues) {
        m11958f(transitionValues);
    }

    @Override // androidx.transition.Transition
    public final void captureStartValues(TransitionValues transitionValues) {
        m11958f(transitionValues);
    }

    @Override // androidx.transition.Transition
    public final Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        int i;
        Animator animatorM11974a;
        if (transitionValues == null || transitionValues2 == null) {
            return null;
        }
        HashMap map = transitionValues.f32281a;
        HashMap map2 = transitionValues2.f32281a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view = transitionValues2.f32282b;
        Rect rect = (Rect) map.get("android:changeBounds:bounds");
        Rect rect2 = (Rect) map2.get("android:changeBounds:bounds");
        int i2 = rect.left;
        int i3 = rect2.left;
        int i4 = rect.top;
        int i5 = rect2.top;
        int i6 = rect.right;
        int i7 = rect2.right;
        int i8 = rect.bottom;
        int i9 = rect2.bottom;
        int i10 = i6 - i2;
        int i11 = i8 - i4;
        int i12 = i7 - i3;
        int i13 = i9 - i5;
        Rect rect3 = (Rect) map.get("android:changeBounds:clip");
        Rect rect4 = (Rect) map2.get("android:changeBounds:clip");
        if ((i10 == 0 || i11 == 0) && (i12 == 0 || i13 == 0)) {
            i = 0;
        } else {
            i = (i2 == i3 && i4 == i5) ? 0 : 1;
            if (i6 != i7 || i8 != i9) {
                i++;
            }
        }
        if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
            i++;
        }
        if (i <= 0) {
            return null;
        }
        ViewUtils.m12006a(view, i2, i4, i6, i8);
        if (i != 2) {
            animatorM11974a = (i2 == i3 && i4 == i5) ? ObjectAnimatorUtils.Api21Impl.m11974a(view, f32166d, getPathMotion().getPath(i6, i8, i7, i9)) : ObjectAnimatorUtils.Api21Impl.m11974a(view, f32167f, getPathMotion().getPath(i2, i4, i3, i5));
        } else if (i10 == i12 && i11 == i13) {
            animatorM11974a = ObjectAnimatorUtils.Api21Impl.m11974a(view, f32168g, getPathMotion().getPath(i2, i4, i3, i5));
        } else {
            ViewBounds viewBounds = new ViewBounds(view);
            ObjectAnimator objectAnimatorM11974a = ObjectAnimatorUtils.Api21Impl.m11974a(viewBounds, f32164b, getPathMotion().getPath(i2, i4, i3, i5));
            ObjectAnimator objectAnimatorM11974a2 = ObjectAnimatorUtils.Api21Impl.m11974a(viewBounds, f32165c, getPathMotion().getPath(i6, i8, i7, i9));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(objectAnimatorM11974a, objectAnimatorM11974a2);
            animatorSet.addListener(new C22056(viewBounds));
            animatorM11974a = animatorSet;
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            ViewGroupUtils.m12003a(viewGroup4, true);
            getRootTransition().addListener(new SuppressLayoutListener(viewGroup4));
        }
        return animatorM11974a;
    }

    @Override // androidx.transition.Transition
    public final String[] getTransitionProperties() {
        return f32163a;
    }

    @Override // androidx.transition.Transition
    public final boolean isSeekingSupported() {
        return true;
    }
}
