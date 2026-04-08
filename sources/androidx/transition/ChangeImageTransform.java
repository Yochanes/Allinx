package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.transition.Transition;
import androidx.transition.TransitionUtils;
import java.util.HashMap;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class ChangeImageTransform extends Transition {

    /* JADX INFO: renamed from: a */
    public static final String[] f32184a = {"android:changeImageTransform:matrix", "android:changeImageTransform:bounds"};

    /* JADX INFO: renamed from: b */
    public static final TypeEvaluator f32185b = new C22061();

    /* JADX INFO: renamed from: c */
    public static final Property f32186c = new C22072(Matrix.class, "animatedTransform");

    /* JADX INFO: renamed from: androidx.transition.ChangeImageTransform$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C22061 implements TypeEvaluator<Matrix> {
        @Override // android.animation.TypeEvaluator
        public final /* bridge */ /* synthetic */ Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
            return null;
        }
    }

    /* JADX INFO: renamed from: androidx.transition.ChangeImageTransform$2 */
    /* JADX INFO: compiled from: Proguard */
    public class C22072 extends Property<ImageView, Matrix> {
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ Matrix get(ImageView imageView) {
            return null;
        }

        @Override // android.util.Property
        public final void set(ImageView imageView, Matrix matrix) {
            ImageViewUtils.m11971a(imageView, matrix);
        }
    }

    /* JADX INFO: renamed from: androidx.transition.ChangeImageTransform$3 */
    /* JADX INFO: compiled from: Proguard */
    public static /* synthetic */ class C22083 {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f32187a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f32187a = iArr;
            try {
                iArr[ImageView.ScaleType.FIT_XY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32187a[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class Listener extends AnimatorListenerAdapter implements Transition.TransitionListener {

        /* JADX INFO: renamed from: a */
        public final ImageView f32188a;

        /* JADX INFO: renamed from: b */
        public final Matrix f32189b;

        /* JADX INFO: renamed from: c */
        public final Matrix f32190c;

        /* JADX INFO: renamed from: d */
        public boolean f32191d = true;

        public Listener(ImageView imageView, Matrix matrix, Matrix matrix2) {
            this.f32188a = imageView;
            this.f32189b = matrix;
            this.f32190c = matrix2;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator, boolean z2) {
            this.f32191d = z2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationPause(Animator animator) {
            Matrix matrix = (Matrix) ((ObjectAnimator) animator).getAnimatedValue();
            ImageView imageView = this.f32188a;
            imageView.setTag(com.exchange.allin.R.id.transition_image_transform, matrix);
            ImageViewUtils.m11971a(imageView, this.f32190c);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationResume(Animator animator) {
            ImageView imageView = this.f32188a;
            Matrix matrix = (Matrix) imageView.getTag(com.exchange.allin.R.id.transition_image_transform);
            if (matrix != null) {
                ImageViewUtils.m11971a(imageView, matrix);
                imageView.setTag(com.exchange.allin.R.id.transition_image_transform, null);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator, boolean z2) {
            this.f32191d = false;
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionPause(Transition transition) {
            if (this.f32191d) {
                ImageView imageView = this.f32188a;
                imageView.setTag(com.exchange.allin.R.id.transition_image_transform, this.f32189b);
                ImageViewUtils.m11971a(imageView, this.f32190c);
            }
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionResume(Transition transition) {
            ImageView imageView = this.f32188a;
            Matrix matrix = (Matrix) imageView.getTag(com.exchange.allin.R.id.transition_image_transform);
            if (matrix != null) {
                ImageViewUtils.m11971a(imageView, matrix);
                imageView.setTag(com.exchange.allin.R.id.transition_image_transform, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            this.f32191d = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            this.f32191d = false;
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
    public static void m11960f(TransitionValues transitionValues, boolean z2) {
        Matrix matrix;
        View view = transitionValues.f32282b;
        if ((view instanceof ImageView) && view.getVisibility() == 0) {
            ImageView imageView = (ImageView) view;
            if (imageView.getDrawable() == null) {
                return;
            }
            HashMap map = transitionValues.f32281a;
            map.put("android:changeImageTransform:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            Matrix matrix2 = z2 ? (Matrix) imageView.getTag(com.exchange.allin.R.id.transition_image_transform) : null;
            if (matrix2 == null) {
                Drawable drawable = imageView.getDrawable();
                if (drawable.getIntrinsicWidth() <= 0 || drawable.getIntrinsicHeight() <= 0) {
                    matrix2 = new Matrix(imageView.getImageMatrix());
                } else {
                    int i = C22083.f32187a[imageView.getScaleType().ordinal()];
                    if (i == 1) {
                        Drawable drawable2 = imageView.getDrawable();
                        matrix = new Matrix();
                        matrix.postScale(imageView.getWidth() / drawable2.getIntrinsicWidth(), imageView.getHeight() / drawable2.getIntrinsicHeight());
                    } else if (i != 2) {
                        matrix2 = new Matrix(imageView.getImageMatrix());
                    } else {
                        Drawable drawable3 = imageView.getDrawable();
                        int intrinsicWidth = drawable3.getIntrinsicWidth();
                        float width = imageView.getWidth();
                        float f = intrinsicWidth;
                        int intrinsicHeight = drawable3.getIntrinsicHeight();
                        float height = imageView.getHeight();
                        float f2 = intrinsicHeight;
                        float fMax = Math.max(width / f, height / f2);
                        int iRound = Math.round((width - (f * fMax)) / 2.0f);
                        int iRound2 = Math.round((height - (f2 * fMax)) / 2.0f);
                        matrix = new Matrix();
                        matrix.postScale(fMax, fMax);
                        matrix.postTranslate(iRound, iRound2);
                    }
                    matrix2 = matrix;
                }
            }
            map.put("android:changeImageTransform:matrix", matrix2);
        }
    }

    @Override // androidx.transition.Transition
    public final void captureEndValues(TransitionValues transitionValues) {
        m11960f(transitionValues, false);
    }

    @Override // androidx.transition.Transition
    public final void captureStartValues(TransitionValues transitionValues) {
        m11960f(transitionValues, true);
    }

    @Override // androidx.transition.Transition
    public final Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues == null || transitionValues2 == null) {
            return null;
        }
        HashMap map = transitionValues.f32281a;
        Rect rect = (Rect) map.get("android:changeImageTransform:bounds");
        HashMap map2 = transitionValues2.f32281a;
        Rect rect2 = (Rect) map2.get("android:changeImageTransform:bounds");
        if (rect == null || rect2 == null) {
            return null;
        }
        Matrix matrix = (Matrix) map.get("android:changeImageTransform:matrix");
        Matrix matrix2 = (Matrix) map2.get("android:changeImageTransform:matrix");
        boolean z2 = (matrix == null && matrix2 == null) || (matrix != null && matrix.equals(matrix2));
        if (rect.equals(rect2) && z2) {
            return null;
        }
        ImageView imageView = (ImageView) transitionValues2.f32282b;
        Drawable drawable = imageView.getDrawable();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        Property property = f32186c;
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            TypeEvaluator typeEvaluator = f32185b;
            Matrix matrix3 = MatrixUtils.f32236a;
            return ObjectAnimator.ofObject(imageView, (Property<ImageView, V>) property, typeEvaluator, matrix3, matrix3);
        }
        if (matrix == null) {
            matrix = MatrixUtils.f32236a;
        }
        if (matrix2 == null) {
            matrix2 = MatrixUtils.f32236a;
        }
        ((C22072) property).getClass();
        ImageViewUtils.m11971a(imageView, matrix);
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(imageView, (Property<ImageView, V>) property, new TransitionUtils.MatrixEvaluator(), matrix, matrix2);
        Listener listener = new Listener(imageView, matrix, matrix2);
        objectAnimatorOfObject.addListener(listener);
        objectAnimatorOfObject.addPauseListener(listener);
        addListener(listener);
        return objectAnimatorOfObject;
    }

    @Override // androidx.transition.Transition
    public final String[] getTransitionProperties() {
        return f32184a;
    }

    @Override // androidx.transition.Transition
    public final boolean isSeekingSupported() {
        return true;
    }
}
