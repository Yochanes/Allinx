package androidx.transition;

import android.animation.Animator;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class Explode extends Visibility {
    static {
        new DecelerateInterpolator();
        new AccelerateInterpolator();
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public final void captureEndValues(TransitionValues transitionValues) {
        super.captureEndValues(transitionValues);
        transitionValues.f32282b.getLocationOnScreen(null);
        throw null;
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public final void captureStartValues(TransitionValues transitionValues) {
        super.captureStartValues(transitionValues);
        transitionValues.f32282b.getLocationOnScreen(null);
        throw null;
    }

    @Override // androidx.transition.Transition
    public final boolean isSeekingSupported() {
        return true;
    }

    @Override // androidx.transition.Visibility
    public final Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        view.getTranslationX();
        view.getTranslationY();
        viewGroup.getLocationOnScreen(null);
        throw null;
    }

    @Override // androidx.transition.Visibility
    public final Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        Rect rect = (Rect) transitionValues.f32281a.get("android:explode:screenBounds");
        int i = rect.left;
        view.getTranslationX();
        view.getTranslationY();
        int[] iArr = (int[]) transitionValues.f32282b.getTag(com.exchange.allin.R.id.transition_position);
        if (iArr != null) {
            rect.offsetTo(iArr[0], iArr[1]);
        }
        viewGroup.getLocationOnScreen(null);
        throw null;
    }
}
