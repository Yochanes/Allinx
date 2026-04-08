package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.transition.Transition;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
class TranslationAnimationCreator {

    /* JADX INFO: compiled from: Proguard */
    public static class TransitionPositionListener extends AnimatorListenerAdapter implements Transition.TransitionListener {

        /* JADX INFO: renamed from: a */
        public int[] f32288a;

        /* JADX INFO: renamed from: b */
        public boolean f32289b;

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.f32289b = true;
            throw null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            throw null;
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionCancel(Transition transition) {
            this.f32289b = true;
            throw null;
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionEnd(Transition transition, boolean z2) {
            if (!this.f32289b) {
                throw null;
            }
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionPause(Transition transition) {
            if (this.f32288a == null) {
                this.f32288a = new int[2];
            }
            throw null;
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionResume(Transition transition) {
            throw null;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator, boolean z2) {
            if (!z2) {
                throw null;
            }
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionEnd(Transition transition) {
            onTransitionEnd(transition, false);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionStart(Transition transition) {
        }
    }
}
