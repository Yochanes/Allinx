package androidx.transition;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class Slide extends Visibility {

    /* JADX INFO: renamed from: androidx.transition.Slide$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C22181 extends CalculateSlideHorizontal {
    }

    /* JADX INFO: renamed from: androidx.transition.Slide$2 */
    /* JADX INFO: compiled from: Proguard */
    public class C22192 extends CalculateSlideHorizontal {
    }

    /* JADX INFO: renamed from: androidx.transition.Slide$3 */
    /* JADX INFO: compiled from: Proguard */
    public class C22203 extends CalculateSlideVertical {
    }

    /* JADX INFO: renamed from: androidx.transition.Slide$4 */
    /* JADX INFO: compiled from: Proguard */
    public class C22214 extends CalculateSlideHorizontal {
    }

    /* JADX INFO: renamed from: androidx.transition.Slide$5 */
    /* JADX INFO: compiled from: Proguard */
    public class C22225 extends CalculateSlideHorizontal {
    }

    /* JADX INFO: renamed from: androidx.transition.Slide$6 */
    /* JADX INFO: compiled from: Proguard */
    public class C22236 extends CalculateSlideVertical {
    }

    /* JADX INFO: compiled from: Proguard */
    public interface CalculateSlide {
    }

    /* JADX INFO: compiled from: Proguard */
    public static abstract class CalculateSlideHorizontal implements CalculateSlide {
    }

    /* JADX INFO: compiled from: Proguard */
    public static abstract class CalculateSlideVertical implements CalculateSlide {
    }

    /* JADX INFO: compiled from: Proguard */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface GravityFlag {
    }

    static {
        new DecelerateInterpolator();
        new AccelerateInterpolator();
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public final void captureEndValues(TransitionValues transitionValues) {
        super.captureEndValues(transitionValues);
        int[] iArr = new int[2];
        transitionValues.f32282b.getLocationOnScreen(iArr);
        transitionValues.f32281a.put("android:slide:screenPosition", iArr);
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public final void captureStartValues(TransitionValues transitionValues) {
        super.captureStartValues(transitionValues);
        int[] iArr = new int[2];
        transitionValues.f32282b.getLocationOnScreen(iArr);
        transitionValues.f32281a.put("android:slide:screenPosition", iArr);
    }

    @Override // androidx.transition.Transition
    public final boolean isSeekingSupported() {
        return true;
    }

    @Override // androidx.transition.Visibility
    public final Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        view.getTranslationX();
        view.getTranslationY();
        throw null;
    }

    @Override // androidx.transition.Visibility
    public final Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        view.getTranslationX();
        view.getTranslationY();
        throw null;
    }
}
