package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.Transition;
import java.util.HashMap;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class ChangeClipBounds extends Transition {

    /* JADX INFO: renamed from: a */
    public static final String[] f32179a = {"android:clipBounds:clip"};

    /* JADX INFO: renamed from: b */
    public static final Rect f32180b = new Rect();

    /* JADX INFO: compiled from: Proguard */
    public static class Listener extends AnimatorListenerAdapter implements Transition.TransitionListener {

        /* JADX INFO: renamed from: a */
        public final Rect f32181a;

        /* JADX INFO: renamed from: b */
        public final Rect f32182b;

        /* JADX INFO: renamed from: c */
        public final View f32183c;

        public Listener(View view, Rect rect, Rect rect2) {
            this.f32183c = view;
            this.f32181a = rect;
            this.f32182b = rect2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionPause(Transition transition) {
            View view = this.f32183c;
            Rect clipBounds = view.getClipBounds();
            if (clipBounds == null) {
                clipBounds = ChangeClipBounds.f32180b;
            }
            view.setTag(com.exchange.allin.R.id.transition_clip, clipBounds);
            view.setClipBounds(this.f32182b);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionResume(Transition transition) {
            View view = this.f32183c;
            view.setClipBounds((Rect) view.getTag(com.exchange.allin.R.id.transition_clip));
            view.setTag(com.exchange.allin.R.id.transition_clip, null);
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator, boolean z2) {
            View view = this.f32183c;
            if (z2) {
                view.setClipBounds(this.f32181a);
            } else {
                view.setClipBounds(this.f32182b);
            }
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionCancel(Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionEnd(Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionStart(Transition transition) {
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m11959f(TransitionValues transitionValues, boolean z2) {
        View view = transitionValues.f32282b;
        if (view.getVisibility() == 8) {
            return;
        }
        Rect clipBounds = z2 ? (Rect) view.getTag(com.exchange.allin.R.id.transition_clip) : null;
        if (clipBounds == null) {
            clipBounds = view.getClipBounds();
        }
        Rect rect = clipBounds != f32180b ? clipBounds : null;
        HashMap map = transitionValues.f32281a;
        map.put("android:clipBounds:clip", rect);
        if (rect == null) {
            map.put("android:clipBounds:bounds", new Rect(0, 0, view.getWidth(), view.getHeight()));
        }
    }

    @Override // androidx.transition.Transition
    public final void captureEndValues(TransitionValues transitionValues) {
        m11959f(transitionValues, false);
    }

    @Override // androidx.transition.Transition
    public final void captureStartValues(TransitionValues transitionValues) {
        m11959f(transitionValues, true);
    }

    @Override // androidx.transition.Transition
    public final Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues == null || transitionValues2 == null) {
            return null;
        }
        HashMap map = transitionValues.f32281a;
        if (!map.containsKey("android:clipBounds:clip")) {
            return null;
        }
        HashMap map2 = transitionValues2.f32281a;
        if (!map2.containsKey("android:clipBounds:clip")) {
            return null;
        }
        Rect rect = (Rect) map.get("android:clipBounds:clip");
        Rect rect2 = (Rect) map2.get("android:clipBounds:clip");
        if (rect == null && rect2 == null) {
            return null;
        }
        Rect rect3 = rect == null ? (Rect) map.get("android:clipBounds:bounds") : rect;
        Rect rect4 = rect2 == null ? (Rect) map2.get("android:clipBounds:bounds") : rect2;
        if (rect3.equals(rect4)) {
            return null;
        }
        transitionValues2.f32282b.setClipBounds(rect);
        Rect rect5 = new Rect();
        RectEvaluator rectEvaluator = new RectEvaluator();
        rectEvaluator.f32240a = rect5;
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(transitionValues2.f32282b, (Property<View, V>) ViewUtils.f32296c, rectEvaluator, rect3, rect4);
        Listener listener = new Listener(transitionValues2.f32282b, rect, rect2);
        objectAnimatorOfObject.addListener(listener);
        addListener(listener);
        return objectAnimatorOfObject;
    }

    @Override // androidx.transition.Transition
    public final String[] getTransitionProperties() {
        return f32179a;
    }

    @Override // androidx.transition.Transition
    public final boolean isSeekingSupported() {
        return true;
    }
}
