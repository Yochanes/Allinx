package androidx.fragment.app;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;
import androidx.core.view.OneShotPreDrawListener;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
class FragmentAnim {
    /* JADX INFO: renamed from: a */
    public static int m8940a(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    /* JADX INFO: compiled from: Proguard */
    public static class AnimationOrAnimator {

        /* JADX INFO: renamed from: a */
        public final Animation f24581a;

        /* JADX INFO: renamed from: b */
        public final AnimatorSet f24582b;

        public AnimationOrAnimator(Animation animation) {
            this.f24581a = animation;
            this.f24582b = null;
        }

        public AnimationOrAnimator(Animator animator) {
            this.f24581a = null;
            AnimatorSet animatorSet = new AnimatorSet();
            this.f24582b = animatorSet;
            animatorSet.play(animator);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class EndViewTransitionAnimation extends AnimationSet implements Runnable {

        /* JADX INFO: renamed from: a */
        public final ViewGroup f24583a;

        /* JADX INFO: renamed from: b */
        public final View f24584b;

        /* JADX INFO: renamed from: c */
        public boolean f24585c;

        /* JADX INFO: renamed from: d */
        public boolean f24586d;

        /* JADX INFO: renamed from: f */
        public boolean f24587f;

        public EndViewTransitionAnimation(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f24587f = true;
            this.f24583a = viewGroup;
            this.f24584b = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public final boolean getTransformation(long j, Transformation transformation) {
            this.f24587f = true;
            if (this.f24585c) {
                return !this.f24586d;
            }
            if (!super.getTransformation(j, transformation)) {
                this.f24585c = true;
                OneShotPreDrawListener.m7759a(this.f24583a, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z2 = this.f24585c;
            ViewGroup viewGroup = this.f24583a;
            if (z2 || !this.f24587f) {
                viewGroup.endViewTransition(this.f24584b);
                this.f24586d = true;
            } else {
                this.f24587f = false;
                viewGroup.post(this);
            }
        }

        @Override // android.view.animation.Animation
        public final boolean getTransformation(long j, Transformation transformation, float f) {
            this.f24587f = true;
            if (this.f24585c) {
                return !this.f24586d;
            }
            if (!super.getTransformation(j, transformation, f)) {
                this.f24585c = true;
                OneShotPreDrawListener.m7759a(this.f24583a, this);
            }
            return true;
        }
    }
}
