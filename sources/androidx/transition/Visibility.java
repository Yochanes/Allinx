package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.transition.Transition;
import androidx.transition.TransitionUtils;
import com.google.common.primitives.Ints;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public abstract class Visibility extends Transition {
    public static final int MODE_IN = 1;
    public static final int MODE_OUT = 2;
    private static final String PROPNAME_SCREEN_LOCATION = "android:visibility:screenLocation";
    private int mMode = 3;
    static final String PROPNAME_VISIBILITY = "android:visibility:visibility";
    private static final String PROPNAME_PARENT = "android:visibility:parent";
    private static final String[] sTransitionProperties = {PROPNAME_VISIBILITY, PROPNAME_PARENT};

    /* JADX INFO: compiled from: Proguard */
    public static class DisappearListener extends AnimatorListenerAdapter implements Transition.TransitionListener {

        /* JADX INFO: renamed from: a */
        public final View f32305a;

        /* JADX INFO: renamed from: b */
        public final int f32306b;

        /* JADX INFO: renamed from: c */
        public final ViewGroup f32307c;

        /* JADX INFO: renamed from: e */
        public boolean f32309e;

        /* JADX INFO: renamed from: f */
        public boolean f32310f = false;

        /* JADX INFO: renamed from: d */
        public final boolean f32308d = true;

        public DisappearListener(int i, View view) {
            this.f32305a = view;
            this.f32306b = i;
            this.f32307c = (ViewGroup) view.getParent();
            m12024a(true);
        }

        /* JADX INFO: renamed from: a */
        public final void m12024a(boolean z2) {
            ViewGroup viewGroup;
            if (!this.f32308d || this.f32309e == z2 || (viewGroup = this.f32307c) == null) {
                return;
            }
            this.f32309e = z2;
            ViewGroupUtils.m12003a(viewGroup, z2);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.f32310f = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (!this.f32310f) {
                ViewUtils.m12007b(this.f32305a, this.f32306b);
                ViewGroup viewGroup = this.f32307c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            m12024a(false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionPause(Transition transition) {
            m12024a(false);
            if (this.f32310f) {
                return;
            }
            ViewUtils.m12007b(this.f32305a, this.f32306b);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionResume(Transition transition) {
            m12024a(true);
            if (this.f32310f) {
                return;
            }
            ViewUtils.m12007b(this.f32305a, 0);
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator, boolean z2) {
            if (z2) {
                ViewUtils.m12007b(this.f32305a, 0);
                ViewGroup viewGroup = this.f32307c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator, boolean z2) {
            if (z2) {
                return;
            }
            if (!this.f32310f) {
                ViewUtils.m12007b(this.f32305a, this.f32306b);
                ViewGroup viewGroup = this.f32307c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            m12024a(false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionCancel(Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionStart(Transition transition) {
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @SuppressLint({"UniqueConstants"})
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface Mode {
    }

    /* JADX INFO: compiled from: Proguard */
    public class OverlayListener extends AnimatorListenerAdapter implements Transition.TransitionListener {

        /* JADX INFO: renamed from: a */
        public final ViewGroup f32311a;

        /* JADX INFO: renamed from: b */
        public final View f32312b;

        /* JADX INFO: renamed from: c */
        public final View f32313c;

        /* JADX INFO: renamed from: d */
        public boolean f32314d = true;

        public OverlayListener(ViewGroup viewGroup, View view, View view2) {
            this.f32311a = viewGroup;
            this.f32312b = view;
            this.f32313c = view2;
        }

        /* JADX INFO: renamed from: a */
        public final void m12025a() {
            this.f32313c.setTag(com.exchange.allin.R.id.save_overlay_view, null);
            this.f32311a.getOverlay().remove(this.f32312b);
            this.f32314d = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            m12025a();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationPause(Animator animator) {
            this.f32311a.getOverlay().remove(this.f32312b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationResume(Animator animator) {
            View view = this.f32312b;
            if (view.getParent() == null) {
                this.f32311a.getOverlay().add(view);
            } else {
                Visibility.this.cancel();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator, boolean z2) {
            if (z2) {
                View view = this.f32313c;
                View view2 = this.f32312b;
                view.setTag(com.exchange.allin.R.id.save_overlay_view, view2);
                this.f32311a.getOverlay().add(view2);
                this.f32314d = true;
            }
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionCancel(Transition transition) {
            if (this.f32314d) {
                m12025a();
            }
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator, boolean z2) {
            if (z2) {
                return;
            }
            m12025a();
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionPause(Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionResume(Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionStart(Transition transition) {
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class VisibilityInfo {

        /* JADX INFO: renamed from: a */
        public boolean f32316a;

        /* JADX INFO: renamed from: b */
        public boolean f32317b;

        /* JADX INFO: renamed from: c */
        public int f32318c;

        /* JADX INFO: renamed from: d */
        public int f32319d;

        /* JADX INFO: renamed from: e */
        public ViewGroup f32320e;

        /* JADX INFO: renamed from: f */
        public ViewGroup f32321f;
    }

    /* JADX INFO: renamed from: f */
    public static void m12022f(TransitionValues transitionValues) {
        int visibility = transitionValues.f32282b.getVisibility();
        HashMap map = transitionValues.f32281a;
        map.put(PROPNAME_VISIBILITY, Integer.valueOf(visibility));
        map.put(PROPNAME_PARENT, transitionValues.f32282b.getParent());
        int[] iArr = new int[2];
        transitionValues.f32282b.getLocationOnScreen(iArr);
        map.put(PROPNAME_SCREEN_LOCATION, iArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002f  */
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static VisibilityInfo m12023h(TransitionValues transitionValues, TransitionValues transitionValues2) {
        VisibilityInfo visibilityInfo = new VisibilityInfo();
        visibilityInfo.f32316a = false;
        visibilityInfo.f32317b = false;
        if (transitionValues != null) {
            HashMap map = transitionValues.f32281a;
            if (map.containsKey(PROPNAME_VISIBILITY)) {
                visibilityInfo.f32318c = ((Integer) map.get(PROPNAME_VISIBILITY)).intValue();
                visibilityInfo.f32320e = (ViewGroup) map.get(PROPNAME_PARENT);
            } else {
                visibilityInfo.f32318c = -1;
                visibilityInfo.f32320e = null;
            }
        }
        if (transitionValues2 != null) {
            HashMap map2 = transitionValues2.f32281a;
            if (map2.containsKey(PROPNAME_VISIBILITY)) {
                visibilityInfo.f32319d = ((Integer) map2.get(PROPNAME_VISIBILITY)).intValue();
                visibilityInfo.f32321f = (ViewGroup) map2.get(PROPNAME_PARENT);
            } else {
                visibilityInfo.f32319d = -1;
                visibilityInfo.f32321f = null;
            }
        }
        if (transitionValues != null && transitionValues2 != null) {
            int i = visibilityInfo.f32318c;
            int i2 = visibilityInfo.f32319d;
            if (i != i2 || visibilityInfo.f32320e != visibilityInfo.f32321f) {
                if (i != i2) {
                    if (i == 0) {
                        visibilityInfo.f32317b = false;
                        visibilityInfo.f32316a = true;
                        return visibilityInfo;
                    }
                    if (i2 == 0) {
                        visibilityInfo.f32317b = true;
                        visibilityInfo.f32316a = true;
                        return visibilityInfo;
                    }
                } else {
                    if (visibilityInfo.f32321f == null) {
                        visibilityInfo.f32317b = false;
                        visibilityInfo.f32316a = true;
                        return visibilityInfo;
                    }
                    if (visibilityInfo.f32320e == null) {
                        visibilityInfo.f32317b = true;
                        visibilityInfo.f32316a = true;
                        return visibilityInfo;
                    }
                }
            }
        } else {
            if (transitionValues == null && visibilityInfo.f32319d == 0) {
                visibilityInfo.f32317b = true;
                visibilityInfo.f32316a = true;
                return visibilityInfo;
            }
            if (transitionValues2 == null && visibilityInfo.f32318c == 0) {
                visibilityInfo.f32317b = false;
                visibilityInfo.f32316a = true;
            }
        }
        return visibilityInfo;
    }

    @Override // androidx.transition.Transition
    public void captureEndValues(@NonNull TransitionValues transitionValues) {
        m12022f(transitionValues);
    }

    @Override // androidx.transition.Transition
    public void captureStartValues(@NonNull TransitionValues transitionValues) {
        m12022f(transitionValues);
    }

    @Override // androidx.transition.Transition
    @Nullable
    public Animator createAnimator(@NonNull ViewGroup viewGroup, @Nullable TransitionValues transitionValues, @Nullable TransitionValues transitionValues2) {
        VisibilityInfo visibilityInfoM12023h = m12023h(transitionValues, transitionValues2);
        if (!visibilityInfoM12023h.f32316a) {
            return null;
        }
        if (visibilityInfoM12023h.f32320e == null && visibilityInfoM12023h.f32321f == null) {
            return null;
        }
        return visibilityInfoM12023h.f32317b ? onAppear(viewGroup, transitionValues, visibilityInfoM12023h.f32318c, transitionValues2, visibilityInfoM12023h.f32319d) : onDisappear(viewGroup, transitionValues, visibilityInfoM12023h.f32318c, transitionValues2, visibilityInfoM12023h.f32319d);
    }

    public int getMode() {
        return this.mMode;
    }

    @Override // androidx.transition.Transition
    @Nullable
    public String[] getTransitionProperties() {
        return sTransitionProperties;
    }

    @Override // androidx.transition.Transition
    public boolean isTransitionRequired(@Nullable TransitionValues transitionValues, @Nullable TransitionValues transitionValues2) {
        if (transitionValues == null && transitionValues2 == null) {
            return false;
        }
        if (transitionValues != null && transitionValues2 != null && transitionValues2.f32281a.containsKey(PROPNAME_VISIBILITY) != transitionValues.f32281a.containsKey(PROPNAME_VISIBILITY)) {
            return false;
        }
        VisibilityInfo visibilityInfoM12023h = m12023h(transitionValues, transitionValues2);
        if (visibilityInfoM12023h.f32316a) {
            return visibilityInfoM12023h.f32318c == 0 || visibilityInfoM12023h.f32319d == 0;
        }
        return false;
    }

    public boolean isVisible(@Nullable TransitionValues transitionValues) {
        if (transitionValues == null) {
            return false;
        }
        HashMap map = transitionValues.f32281a;
        return ((Integer) map.get(PROPNAME_VISIBILITY)).intValue() == 0 && ((View) map.get(PROPNAME_PARENT)) != null;
    }

    public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return null;
    }

    public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return null;
    }

    public void setMode(int i) {
        if ((i & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.mMode = i;
    }

    @Nullable
    public Animator onAppear(@NonNull ViewGroup viewGroup, @Nullable TransitionValues transitionValues, int i, @Nullable TransitionValues transitionValues2, int i2) {
        if ((this.mMode & 1) != 1 || transitionValues2 == null) {
            return null;
        }
        if (transitionValues == null) {
            View view = (View) transitionValues2.f32282b.getParent();
            if (m12023h(getMatchedTransitionValues(view, false), getTransitionValues(view, false)).f32316a) {
                return null;
            }
        }
        return onAppear(viewGroup, transitionValues2.f32282b, transitionValues, transitionValues2);
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01d0  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Animator onDisappear(@NonNull ViewGroup viewGroup, @Nullable TransitionValues transitionValues, int i, @Nullable TransitionValues transitionValues2, int i2) {
        View view;
        boolean z2;
        View view2;
        char c2;
        Animator animator;
        int i3;
        View view3;
        ViewGroup viewGroup2;
        boolean z3;
        int i4;
        Bitmap bitmapCreateBitmap;
        if ((this.mMode & 2) != 2 || transitionValues == null) {
            return null;
        }
        View view4 = transitionValues.f32282b;
        View view5 = transitionValues2 != null ? transitionValues2.f32282b : null;
        View view6 = (View) view4.getTag(com.exchange.allin.R.id.save_overlay_view);
        int i5 = 1;
        if (view6 != null) {
            c2 = 1;
            animator = null;
            view3 = null;
            i3 = 0;
        } else {
            if (view5 == null || view5.getParent() == null) {
                if (view5 != null) {
                    view = null;
                    z2 = false;
                }
                z2 = true;
                view5 = null;
                view = null;
            } else {
                if (i2 == 4 || view4 == view5) {
                    view = view5;
                    view5 = null;
                    z2 = false;
                }
                z2 = true;
                view5 = null;
                view = null;
            }
            if (z2) {
                if (view4.getParent() == null) {
                    view2 = view;
                    c2 = 1;
                    animator = null;
                    i3 = 0;
                } else {
                    if (view4.getParent() instanceof View) {
                        View view7 = (View) view4.getParent();
                        if (m12023h(getTransitionValues(view7, true), getMatchedTransitionValues(view7, true)).f32316a) {
                            view2 = view;
                            c2 = 1;
                            animator = null;
                            i3 = 0;
                            int id = view7.getId();
                            if (view7.getParent() != null || id == -1 || viewGroup.findViewById(id) == null || !this.mCanRemoveViews) {
                            }
                            i5 = i3;
                            view3 = view2;
                        } else {
                            boolean z4 = TransitionUtils.f32277a;
                            Matrix matrix = new Matrix();
                            matrix.setTranslate(-view7.getScrollX(), -view7.getScrollY());
                            ViewUtilsApi23 viewUtilsApi23 = ViewUtils.f32294a;
                            viewUtilsApi23.mo12014e(view4, matrix);
                            viewUtilsApi23.mo12015f(viewGroup, matrix);
                            animator = null;
                            RectF rectF = new RectF(0.0f, 0.0f, view4.getWidth(), view4.getHeight());
                            matrix.mapRect(rectF);
                            int iRound = Math.round(rectF.left);
                            int iRound2 = Math.round(rectF.top);
                            int iRound3 = Math.round(rectF.right);
                            c2 = 1;
                            int iRound4 = Math.round(rectF.bottom);
                            i3 = 0;
                            ImageView imageView = new ImageView(view4.getContext());
                            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                            boolean zIsAttachedToWindow = view4.isAttachedToWindow();
                            boolean z5 = viewGroup != null && viewGroup.isAttachedToWindow();
                            if (zIsAttachedToWindow) {
                                viewGroup2 = null;
                                z3 = zIsAttachedToWindow;
                                i4 = 0;
                            } else if (z5) {
                                ViewGroup viewGroup3 = (ViewGroup) view4.getParent();
                                int iIndexOfChild = viewGroup3.indexOfChild(view4);
                                viewGroup.getOverlay().add(view4);
                                z3 = zIsAttachedToWindow;
                                i4 = iIndexOfChild;
                                viewGroup2 = viewGroup3;
                            } else {
                                bitmapCreateBitmap = null;
                                view2 = view;
                                if (bitmapCreateBitmap != null) {
                                    imageView.setImageBitmap(bitmapCreateBitmap);
                                }
                                imageView.measure(View.MeasureSpec.makeMeasureSpec(iRound3 - iRound, Ints.MAX_POWER_OF_TWO), View.MeasureSpec.makeMeasureSpec(iRound4 - iRound2, Ints.MAX_POWER_OF_TWO));
                                imageView.layout(iRound, iRound2, iRound3, iRound4);
                                view6 = imageView;
                                i5 = i3;
                                view3 = view2;
                            }
                            view2 = view;
                            int iRound5 = Math.round(rectF.width());
                            int iRound6 = Math.round(rectF.height());
                            if (iRound5 <= 0 || iRound6 <= 0) {
                                bitmapCreateBitmap = null;
                            } else {
                                float fMin = Math.min(1.0f, 1048576.0f / (iRound5 * iRound6));
                                int iRound7 = Math.round(iRound5 * fMin);
                                int iRound8 = Math.round(iRound6 * fMin);
                                matrix.postTranslate(-rectF.left, -rectF.top);
                                matrix.postScale(fMin, fMin);
                                if (TransitionUtils.f32277a) {
                                    Picture picture = new Picture();
                                    Canvas canvasBeginRecording = picture.beginRecording(iRound7, iRound8);
                                    canvasBeginRecording.concat(matrix);
                                    view4.draw(canvasBeginRecording);
                                    picture.endRecording();
                                    bitmapCreateBitmap = TransitionUtils.Api28Impl.m12002a(picture);
                                } else {
                                    bitmapCreateBitmap = Bitmap.createBitmap(iRound7, iRound8, Bitmap.Config.ARGB_8888);
                                    Canvas canvas = new Canvas(bitmapCreateBitmap);
                                    canvas.concat(matrix);
                                    view4.draw(canvas);
                                }
                            }
                            if (!z3) {
                                viewGroup.getOverlay().remove(view4);
                                viewGroup2.addView(view4, i4);
                            }
                            if (bitmapCreateBitmap != null) {
                            }
                            imageView.measure(View.MeasureSpec.makeMeasureSpec(iRound3 - iRound, Ints.MAX_POWER_OF_TWO), View.MeasureSpec.makeMeasureSpec(iRound4 - iRound2, Ints.MAX_POWER_OF_TWO));
                            imageView.layout(iRound, iRound2, iRound3, iRound4);
                            view6 = imageView;
                            i5 = i3;
                            view3 = view2;
                        }
                    }
                    view6 = view5;
                    i5 = i3;
                    view3 = view2;
                }
                view6 = view4;
                i5 = i3;
                view3 = view2;
            } else {
                view2 = view;
                c2 = 1;
                animator = null;
                i3 = 0;
                view6 = view5;
                i5 = i3;
                view3 = view2;
            }
        }
        if (view6 == null) {
            if (view3 == null) {
                return animator;
            }
            int visibility = view3.getVisibility();
            ViewUtils.m12007b(view3, i3);
            Animator animatorOnDisappear = onDisappear(viewGroup, view3, transitionValues, transitionValues2);
            if (animatorOnDisappear == null) {
                ViewUtils.m12007b(view3, visibility);
                return animatorOnDisappear;
            }
            DisappearListener disappearListener = new DisappearListener(i2, view3);
            animatorOnDisappear.addListener(disappearListener);
            getRootTransition().addListener(disappearListener);
            return animatorOnDisappear;
        }
        if (i5 == 0) {
            int[] iArr = (int[]) transitionValues.f32281a.get(PROPNAME_SCREEN_LOCATION);
            int i6 = iArr[i3];
            int i7 = iArr[c2];
            int[] iArr2 = new int[2];
            viewGroup.getLocationOnScreen(iArr2);
            view6.offsetLeftAndRight((i6 - iArr2[i3]) - view6.getLeft());
            view6.offsetTopAndBottom((i7 - iArr2[c2]) - view6.getTop());
            viewGroup.getOverlay().add(view6);
        }
        Animator animatorOnDisappear2 = onDisappear(viewGroup, view6, transitionValues, transitionValues2);
        if (i5 == 0) {
            if (animatorOnDisappear2 == null) {
                viewGroup.getOverlay().remove(view6);
                return animatorOnDisappear2;
            }
            view4.setTag(com.exchange.allin.R.id.save_overlay_view, view6);
            OverlayListener overlayListener = new OverlayListener(viewGroup, view6, view4);
            animatorOnDisappear2.addListener(overlayListener);
            animatorOnDisappear2.addPauseListener(overlayListener);
            getRootTransition().addListener(overlayListener);
        }
        return animatorOnDisappear2;
    }
}
