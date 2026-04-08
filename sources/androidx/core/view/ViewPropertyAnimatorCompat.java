package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import androidx.annotation.RequiresApi;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final class ViewPropertyAnimatorCompat {

    /* JADX INFO: renamed from: a */
    public final WeakReference f23433a;

    /* JADX INFO: renamed from: androidx.core.view.ViewPropertyAnimatorCompat$1 */
    /* JADX INFO: compiled from: Proguard */
    class C14581 extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ViewPropertyAnimatorListener f23434a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ View f23435b;

        public C14581(ViewPropertyAnimatorListener viewPropertyAnimatorListener, View view) {
            this.f23434a = viewPropertyAnimatorListener;
            this.f23435b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.f23434a.onAnimationCancel();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            this.f23434a.onAnimationEnd();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            this.f23434a.mo314a();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api21Impl {
    }

    public ViewPropertyAnimatorCompat(View view) {
        this.f23433a = new WeakReference(view);
    }

    /* JADX INFO: renamed from: a */
    public final void m7868a(float f) {
        View view = (View) this.f23433a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m7869b() {
        View view = (View) this.f23433a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m7870c(long j) {
        View view = (View) this.f23433a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m7871d(ViewPropertyAnimatorListener viewPropertyAnimatorListener) {
        View view = (View) this.f23433a.get();
        if (view != null) {
            if (viewPropertyAnimatorListener != null) {
                view.animate().setListener(new C14581(viewPropertyAnimatorListener, view));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m7872e(float f) {
        View view = (View) this.f23433a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
    }
}
