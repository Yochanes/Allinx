package androidx.appcompat.graphics.drawable;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.res.Resources;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.StateSet;
import androidx.appcompat.graphics.drawable.DrawableContainerCompat;
import androidx.appcompat.graphics.drawable.StateListDrawableCompat;
import androidx.collection.LongSparseArray;
import androidx.collection.SparseArrayCompat;
import androidx.collection.SparseArrayCompatKt;
import androidx.collection.internal.ContainerHelpersKt;
import androidx.core.graphics.drawable.TintAwareDrawable;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class AnimatedStateListDrawableCompat extends StateListDrawableCompat implements TintAwareDrawable {

    /* JADX INFO: renamed from: u */
    public AnimatedStateListState f578u;

    /* JADX INFO: renamed from: v */
    public Transition f579v;

    /* JADX INFO: renamed from: w */
    public int f580w = -1;

    /* JADX INFO: renamed from: x */
    public int f581x = -1;

    /* JADX INFO: renamed from: y */
    public boolean f582y;

    /* JADX INFO: compiled from: Proguard */
    public static class AnimatableTransition extends Transition {

        /* JADX INFO: renamed from: a */
        public final Animatable f583a;

        public AnimatableTransition(Animatable animatable) {
            this.f583a = animatable;
        }

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition
        /* JADX INFO: renamed from: c */
        public final void mo399c() {
            this.f583a.start();
        }

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition
        /* JADX INFO: renamed from: d */
        public final void mo400d() {
            this.f583a.stop();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class AnimatedStateListState extends StateListDrawableCompat.StateListState {

        /* JADX INFO: renamed from: J */
        public LongSparseArray f584J;

        /* JADX INFO: renamed from: K */
        public SparseArrayCompat f585K;

        public AnimatedStateListState(AnimatedStateListState animatedStateListState, AnimatedStateListDrawableCompat animatedStateListDrawableCompat, Resources resources) {
            super(animatedStateListState, animatedStateListDrawableCompat, resources);
            if (animatedStateListState != null) {
                this.f584J = animatedStateListState.f584J;
                this.f585K = animatedStateListState.f585K;
            } else {
                this.f584J = new LongSparseArray((Object) null);
                this.f585K = new SparseArrayCompat(0);
            }
        }

        @Override // androidx.appcompat.graphics.drawable.StateListDrawableCompat.StateListState, androidx.appcompat.graphics.drawable.DrawableContainerCompat.DrawableContainerState
        /* JADX INFO: renamed from: d */
        public final void mo401d() {
            this.f584J = this.f584J.m2000b();
            this.f585K = this.f585K.m2133b();
        }

        /* JADX INFO: renamed from: f */
        public final int m402f(int i) {
            Object obj;
            if (i < 0) {
                return 0;
            }
            SparseArrayCompat sparseArrayCompat = this.f585K;
            Object obj2 = 0;
            int iM2141a = ContainerHelpersKt.m2141a(sparseArrayCompat.f3888d, i, sparseArrayCompat.f3886b);
            if (iM2141a >= 0 && (obj = sparseArrayCompat.f3887c[iM2141a]) != SparseArrayCompatKt.f3889a) {
                obj2 = obj;
            }
            return ((Integer) obj2).intValue();
        }

        @Override // androidx.appcompat.graphics.drawable.StateListDrawableCompat.StateListState, android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            return new AnimatedStateListDrawableCompat(this, null);
        }

        @Override // androidx.appcompat.graphics.drawable.StateListDrawableCompat.StateListState, android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            return new AnimatedStateListDrawableCompat(this, resources);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class AnimatedVectorDrawableTransition extends Transition {

        /* JADX INFO: renamed from: a */
        public final AnimatedVectorDrawableCompat f586a;

        public AnimatedVectorDrawableTransition(AnimatedVectorDrawableCompat animatedVectorDrawableCompat) {
            this.f586a = animatedVectorDrawableCompat;
        }

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition
        /* JADX INFO: renamed from: c */
        public final void mo399c() {
            this.f586a.start();
        }

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition
        /* JADX INFO: renamed from: d */
        public final void mo400d() {
            this.f586a.stop();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class AnimationDrawableTransition extends Transition {

        /* JADX INFO: renamed from: a */
        public final ObjectAnimator f587a;

        /* JADX INFO: renamed from: b */
        public final boolean f588b;

        public AnimationDrawableTransition(AnimationDrawable animationDrawable, boolean z2, boolean z3) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i = z2 ? numberOfFrames - 1 : 0;
            int i2 = z2 ? 0 : numberOfFrames - 1;
            FrameInterpolator frameInterpolator = new FrameInterpolator();
            int numberOfFrames2 = animationDrawable.getNumberOfFrames();
            frameInterpolator.f590b = numberOfFrames2;
            int[] iArr = frameInterpolator.f589a;
            if (iArr == null || iArr.length < numberOfFrames2) {
                frameInterpolator.f589a = new int[numberOfFrames2];
            }
            int[] iArr2 = frameInterpolator.f589a;
            int i3 = 0;
            for (int i4 = 0; i4 < numberOfFrames2; i4++) {
                int duration = animationDrawable.getDuration(z2 ? (numberOfFrames2 - i4) - 1 : i4);
                iArr2[i4] = duration;
                i3 += duration;
            }
            frameInterpolator.f591c = i3;
            ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i, i2);
            objectAnimatorOfInt.setAutoCancel(true);
            objectAnimatorOfInt.setDuration(frameInterpolator.f591c);
            objectAnimatorOfInt.setInterpolator(frameInterpolator);
            this.f588b = z3;
            this.f587a = objectAnimatorOfInt;
        }

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition
        /* JADX INFO: renamed from: a */
        public final boolean mo403a() {
            return this.f588b;
        }

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition
        /* JADX INFO: renamed from: b */
        public final void mo404b() {
            this.f587a.reverse();
        }

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition
        /* JADX INFO: renamed from: c */
        public final void mo399c() {
            this.f587a.start();
        }

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition
        /* JADX INFO: renamed from: d */
        public final void mo400d() {
            this.f587a.cancel();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class FrameInterpolator implements TimeInterpolator {

        /* JADX INFO: renamed from: a */
        public int[] f589a;

        /* JADX INFO: renamed from: b */
        public int f590b;

        /* JADX INFO: renamed from: c */
        public int f591c;

        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            int i = (int) ((f * this.f591c) + 0.5f);
            int i2 = this.f590b;
            int[] iArr = this.f589a;
            int i3 = 0;
            while (i3 < i2) {
                int i4 = iArr[i3];
                if (i < i4) {
                    break;
                }
                i -= i4;
                i3++;
            }
            return (i3 / i2) + (i3 < i2 ? i / this.f591c : 0.0f);
        }
    }

    public AnimatedStateListDrawableCompat(AnimatedStateListState animatedStateListState, Resources resources) {
        mo397e(new AnimatedStateListState(animatedStateListState, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    @Override // androidx.appcompat.graphics.drawable.StateListDrawableCompat, androidx.appcompat.graphics.drawable.DrawableContainerCompat
    /* JADX INFO: renamed from: b */
    public final DrawableContainerCompat.DrawableContainerState mo396b() {
        return new AnimatedStateListState(this.f578u, this, null);
    }

    @Override // androidx.appcompat.graphics.drawable.StateListDrawableCompat, androidx.appcompat.graphics.drawable.DrawableContainerCompat
    /* JADX INFO: renamed from: e */
    public final void mo397e(DrawableContainerCompat.DrawableContainerState drawableContainerState) {
        super.mo397e(drawableContainerState);
        if (drawableContainerState instanceof AnimatedStateListState) {
            this.f578u = (AnimatedStateListState) drawableContainerState;
        }
    }

    @Override // androidx.appcompat.graphics.drawable.StateListDrawableCompat
    /* JADX INFO: renamed from: f */
    public final StateListDrawableCompat.StateListState mo398f() {
        return new AnimatedStateListState(this.f578u, this, null);
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableContainerCompat, android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        super.jumpToCurrentState();
        Transition transition = this.f579v;
        if (transition != null) {
            transition.mo400d();
            this.f579v = null;
            m407d(this.f580w);
            this.f580w = -1;
            this.f581x = -1;
        }
    }

    @Override // androidx.appcompat.graphics.drawable.StateListDrawableCompat, androidx.appcompat.graphics.drawable.DrawableContainerCompat, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.f582y) {
            super.mutate();
            this.f578u.mo401d();
            this.f582y = true;
        }
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d1  */
    @Override // androidx.appcompat.graphics.drawable.StateListDrawableCompat, androidx.appcompat.graphics.drawable.DrawableContainerCompat, android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onStateChange(int[] iArr) {
        int iM402f;
        Transition animatableTransition;
        AnimatedStateListState animatedStateListState = this.f578u;
        int iM412e = animatedStateListState.m412e(iArr);
        if (iM412e < 0) {
            iM412e = animatedStateListState.m412e(StateSet.WILD_CARD);
        }
        int i = this.f599i;
        if (iM412e != i) {
            Transition transition = this.f579v;
            if (transition == null) {
                this.f579v = null;
                this.f581x = -1;
                this.f580w = -1;
                AnimatedStateListState animatedStateListState2 = this.f578u;
                int iM402f2 = animatedStateListState2.m402f(i);
                iM402f = animatedStateListState2.m402f(iM412e);
                if (iM402f == 0 && iM402f2 != 0) {
                    long j = ((long) iM402f) | (((long) iM402f2) << 32);
                    int iLongValue = (int) ((Long) animatedStateListState2.f584J.m2002d(j)).longValue();
                    if (iLongValue >= 0) {
                        boolean z2 = (((Long) animatedStateListState2.f584J.m2002d(j)).longValue() & 8589934592L) != 0;
                        m407d(iLongValue);
                        Object obj = this.f595c;
                        if (obj instanceof AnimationDrawable) {
                            animatableTransition = new AnimationDrawableTransition((AnimationDrawable) obj, (((Long) animatedStateListState2.f584J.m2002d(j)).longValue() & 4294967296L) != 0, z2);
                        } else if (obj instanceof AnimatedVectorDrawableCompat) {
                            animatableTransition = new AnimatedVectorDrawableTransition((AnimatedVectorDrawableCompat) obj);
                        } else {
                            if (obj instanceof Animatable) {
                                animatableTransition = new AnimatableTransition((Animatable) obj);
                            }
                            if (m407d(iM412e)) {
                            }
                        }
                        animatableTransition.mo399c();
                        this.f579v = animatableTransition;
                        this.f581x = i;
                        this.f580w = iM412e;
                        z = true;
                    }
                } else if (m407d(iM412e)) {
                    z = true;
                }
            } else {
                if (iM412e != this.f580w) {
                    if (iM412e == this.f581x && transition.mo403a()) {
                        transition.mo404b();
                        this.f580w = this.f581x;
                        this.f581x = iM412e;
                    } else {
                        i = this.f580w;
                        transition.mo400d();
                        this.f579v = null;
                        this.f581x = -1;
                        this.f580w = -1;
                        AnimatedStateListState animatedStateListState22 = this.f578u;
                        int iM402f22 = animatedStateListState22.m402f(i);
                        iM402f = animatedStateListState22.m402f(iM412e);
                        if (iM402f == 0) {
                            if (m407d(iM412e)) {
                            }
                        }
                    }
                }
                z = true;
            }
        }
        Drawable drawable = this.f595c;
        return drawable != null ? drawable.setState(iArr) | z : z;
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableContainerCompat, android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z2, boolean z3) {
        boolean visible = super.setVisible(z2, z3);
        Transition transition = this.f579v;
        if (transition != null && (visible || z3)) {
            if (z2) {
                transition.mo399c();
                return visible;
            }
            jumpToCurrentState();
        }
        return visible;
    }

    /* JADX INFO: compiled from: Proguard */
    public static abstract class Transition {
        /* JADX INFO: renamed from: a */
        public boolean mo403a() {
            return false;
        }

        /* JADX INFO: renamed from: c */
        public abstract void mo399c();

        /* JADX INFO: renamed from: d */
        public abstract void mo400d();

        /* JADX INFO: renamed from: b */
        public void mo404b() {
        }
    }
}
