package androidx.dynamicanimation.animation;

import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.dynamicanimation.animation.AnimationHandler;
import androidx.dynamicanimation.animation.DynamicAnimation;
import com.google.android.material.progressindicator.DeterminateDrawable;
import java.util.ArrayList;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public abstract class DynamicAnimation<T extends DynamicAnimation<T>> implements AnimationHandler.AnimationFrameCallback {

    /* JADX INFO: renamed from: m */
    public static final ViewProperty f24237m = new C16264("scaleX");

    /* JADX INFO: renamed from: n */
    public static final ViewProperty f24238n = new C16275("scaleY");

    /* JADX INFO: renamed from: o */
    public static final ViewProperty f24239o = new C16286("rotation");

    /* JADX INFO: renamed from: p */
    public static final ViewProperty f24240p = new C16297("rotationX");

    /* JADX INFO: renamed from: q */
    public static final ViewProperty f24241q = new C16308("rotationY");

    /* JADX INFO: renamed from: r */
    public static final ViewProperty f24242r = new C162012("alpha");

    /* JADX INFO: renamed from: a */
    public float f24243a;

    /* JADX INFO: renamed from: b */
    public float f24244b;

    /* JADX INFO: renamed from: c */
    public boolean f24245c;

    /* JADX INFO: renamed from: d */
    public final DeterminateDrawable f24246d;

    /* JADX INFO: renamed from: e */
    public final FloatPropertyCompat f24247e;

    /* JADX INFO: renamed from: f */
    public boolean f24248f;

    /* JADX INFO: renamed from: g */
    public float f24249g;

    /* JADX INFO: renamed from: h */
    public float f24250h;

    /* JADX INFO: renamed from: i */
    public long f24251i;

    /* JADX INFO: renamed from: j */
    public float f24252j;

    /* JADX INFO: renamed from: k */
    public final ArrayList f24253k;

    /* JADX INFO: renamed from: l */
    public final ArrayList f24254l;

    /* JADX INFO: renamed from: androidx.dynamicanimation.animation.DynamicAnimation$1 */
    /* JADX INFO: compiled from: Proguard */
    public static class C16171 extends ViewProperty {
        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final float getValue(Object obj) {
            return ((View) obj).getTranslationX();
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final void setValue(Object obj, float f) {
            ((View) obj).setTranslationX(f);
        }
    }

    /* JADX INFO: renamed from: androidx.dynamicanimation.animation.DynamicAnimation$10 */
    /* JADX INFO: compiled from: Proguard */
    public static class C161810 extends ViewProperty {
        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final float getValue(Object obj) {
            return ((View) obj).getY();
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final void setValue(Object obj, float f) {
            ((View) obj).setY(f);
        }
    }

    /* JADX INFO: renamed from: androidx.dynamicanimation.animation.DynamicAnimation$11 */
    /* JADX INFO: compiled from: Proguard */
    public static class C161911 extends ViewProperty {
        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final float getValue(Object obj) {
            return ViewCompat.m7799r((View) obj);
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final void setValue(Object obj, float f) {
            ViewCompat.m7781Q((View) obj, f);
        }
    }

    /* JADX INFO: renamed from: androidx.dynamicanimation.animation.DynamicAnimation$12 */
    /* JADX INFO: compiled from: Proguard */
    public static class C162012 extends ViewProperty {
        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final float getValue(Object obj) {
            return ((View) obj).getAlpha();
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final void setValue(Object obj, float f) {
            ((View) obj).setAlpha(f);
        }
    }

    /* JADX INFO: renamed from: androidx.dynamicanimation.animation.DynamicAnimation$13 */
    /* JADX INFO: compiled from: Proguard */
    public static class C162113 extends ViewProperty {
        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final float getValue(Object obj) {
            return ((View) obj).getScrollX();
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final void setValue(Object obj, float f) {
            ((View) obj).setScrollX((int) f);
        }
    }

    /* JADX INFO: renamed from: androidx.dynamicanimation.animation.DynamicAnimation$14 */
    /* JADX INFO: compiled from: Proguard */
    public static class C162214 extends ViewProperty {
        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final float getValue(Object obj) {
            return ((View) obj).getScrollY();
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final void setValue(Object obj, float f) {
            ((View) obj).setScrollY((int) f);
        }
    }

    /* JADX INFO: renamed from: androidx.dynamicanimation.animation.DynamicAnimation$15 */
    /* JADX INFO: compiled from: Proguard */
    class C162315 extends FloatPropertyCompat {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ FloatValueHolder f24255a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C162315(FloatValueHolder floatValueHolder) {
            super("FloatValueHolder");
            this.f24255a = floatValueHolder;
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final float getValue(Object obj) {
            return this.f24255a.mo8768a();
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final void setValue(Object obj, float f) {
            this.f24255a.mo8769b(f);
        }
    }

    /* JADX INFO: renamed from: androidx.dynamicanimation.animation.DynamicAnimation$2 */
    /* JADX INFO: compiled from: Proguard */
    public static class C16242 extends ViewProperty {
        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final float getValue(Object obj) {
            return ((View) obj).getTranslationY();
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final void setValue(Object obj, float f) {
            ((View) obj).setTranslationY(f);
        }
    }

    /* JADX INFO: renamed from: androidx.dynamicanimation.animation.DynamicAnimation$3 */
    /* JADX INFO: compiled from: Proguard */
    public static class C16253 extends ViewProperty {
        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final float getValue(Object obj) {
            return ViewCompat.m7797p((View) obj);
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final void setValue(Object obj, float f) {
            ViewCompat.m7779O((View) obj, f);
        }
    }

    /* JADX INFO: renamed from: androidx.dynamicanimation.animation.DynamicAnimation$4 */
    /* JADX INFO: compiled from: Proguard */
    public static class C16264 extends ViewProperty {
        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final float getValue(Object obj) {
            return ((View) obj).getScaleX();
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final void setValue(Object obj, float f) {
            ((View) obj).setScaleX(f);
        }
    }

    /* JADX INFO: renamed from: androidx.dynamicanimation.animation.DynamicAnimation$5 */
    /* JADX INFO: compiled from: Proguard */
    public static class C16275 extends ViewProperty {
        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final float getValue(Object obj) {
            return ((View) obj).getScaleY();
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final void setValue(Object obj, float f) {
            ((View) obj).setScaleY(f);
        }
    }

    /* JADX INFO: renamed from: androidx.dynamicanimation.animation.DynamicAnimation$6 */
    /* JADX INFO: compiled from: Proguard */
    public static class C16286 extends ViewProperty {
        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final float getValue(Object obj) {
            return ((View) obj).getRotation();
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final void setValue(Object obj, float f) {
            ((View) obj).setRotation(f);
        }
    }

    /* JADX INFO: renamed from: androidx.dynamicanimation.animation.DynamicAnimation$7 */
    /* JADX INFO: compiled from: Proguard */
    public static class C16297 extends ViewProperty {
        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final float getValue(Object obj) {
            return ((View) obj).getRotationX();
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final void setValue(Object obj, float f) {
            ((View) obj).setRotationX(f);
        }
    }

    /* JADX INFO: renamed from: androidx.dynamicanimation.animation.DynamicAnimation$8 */
    /* JADX INFO: compiled from: Proguard */
    public static class C16308 extends ViewProperty {
        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final float getValue(Object obj) {
            return ((View) obj).getRotationY();
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final void setValue(Object obj, float f) {
            ((View) obj).setRotationY(f);
        }
    }

    /* JADX INFO: renamed from: androidx.dynamicanimation.animation.DynamicAnimation$9 */
    /* JADX INFO: compiled from: Proguard */
    public static class C16319 extends ViewProperty {
        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final float getValue(Object obj) {
            return ((View) obj).getX();
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final void setValue(Object obj, float f) {
            ((View) obj).setX(f);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class MassState {

        /* JADX INFO: renamed from: a */
        public float f24256a;

        /* JADX INFO: renamed from: b */
        public float f24257b;
    }

    /* JADX INFO: compiled from: Proguard */
    public interface OnAnimationEndListener {
        /* JADX INFO: renamed from: a */
        void mo8766a(DynamicAnimation dynamicAnimation, boolean z2, float f, float f2);
    }

    /* JADX INFO: compiled from: Proguard */
    public interface OnAnimationUpdateListener {
        /* JADX INFO: renamed from: f */
        void mo8767f(float f);
    }

    /* JADX INFO: compiled from: Proguard */
    public static abstract class ViewProperty extends FloatPropertyCompat<View> {
    }

    public DynamicAnimation(FloatValueHolder floatValueHolder) {
        this.f24243a = 0.0f;
        this.f24244b = Float.MAX_VALUE;
        this.f24245c = false;
        this.f24248f = false;
        this.f24249g = Float.MAX_VALUE;
        this.f24250h = -3.4028235E38f;
        this.f24251i = 0L;
        this.f24253k = new ArrayList();
        this.f24254l = new ArrayList();
        this.f24246d = null;
        this.f24247e = new C162315(floatValueHolder);
        this.f24252j = 1.0f;
    }

    @Override // androidx.dynamicanimation.animation.AnimationHandler.AnimationFrameCallback
    /* JADX INFO: renamed from: a */
    public final boolean mo8761a(long j) {
        long j2 = this.f24251i;
        if (j2 == 0) {
            this.f24251i = j;
            m8764c(this.f24244b);
            return false;
        }
        this.f24251i = j;
        boolean zMo8765d = mo8765d(j - j2);
        float fMin = Math.min(this.f24244b, this.f24249g);
        this.f24244b = fMin;
        float fMax = Math.max(fMin, this.f24250h);
        this.f24244b = fMax;
        m8764c(fMax);
        if (zMo8765d) {
            m8763b(false);
        }
        return zMo8765d;
    }

    /* JADX INFO: renamed from: b */
    public final void m8763b(boolean z2) {
        ArrayList arrayList;
        int i = 0;
        this.f24248f = false;
        ThreadLocal threadLocal = AnimationHandler.f24226f;
        if (threadLocal.get() == null) {
            threadLocal.set(new AnimationHandler());
        }
        AnimationHandler animationHandler = (AnimationHandler) threadLocal.get();
        animationHandler.f24227a.remove(this);
        ArrayList arrayList2 = animationHandler.f24228b;
        int iIndexOf = arrayList2.indexOf(this);
        if (iIndexOf >= 0) {
            arrayList2.set(iIndexOf, null);
            animationHandler.f24231e = true;
        }
        this.f24251i = 0L;
        this.f24245c = false;
        while (true) {
            arrayList = this.f24253k;
            if (i >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i) != null) {
                ((OnAnimationEndListener) arrayList.get(i)).mo8766a(this, z2, this.f24244b, this.f24243a);
            }
            i++;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m8764c(float f) {
        ArrayList arrayList;
        this.f24247e.setValue(this.f24246d, f);
        int i = 0;
        while (true) {
            arrayList = this.f24254l;
            if (i >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i) != null) {
                ((OnAnimationUpdateListener) arrayList.get(i)).mo8767f(this.f24244b);
            }
            i++;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public abstract boolean mo8765d(long j);

    public DynamicAnimation(DeterminateDrawable determinateDrawable, FloatPropertyCompat floatPropertyCompat) {
        this.f24243a = 0.0f;
        this.f24244b = Float.MAX_VALUE;
        this.f24245c = false;
        this.f24248f = false;
        this.f24249g = Float.MAX_VALUE;
        this.f24250h = -3.4028235E38f;
        this.f24251i = 0L;
        this.f24253k = new ArrayList();
        this.f24254l = new ArrayList();
        this.f24246d = determinateDrawable;
        this.f24247e = floatPropertyCompat;
        if (floatPropertyCompat != f24239o && floatPropertyCompat != f24240p && floatPropertyCompat != f24241q) {
            if (floatPropertyCompat == f24242r) {
                this.f24252j = 0.00390625f;
                return;
            } else if (floatPropertyCompat != f24237m && floatPropertyCompat != f24238n) {
                this.f24252j = 1.0f;
                return;
            } else {
                this.f24252j = 0.00390625f;
                return;
            }
        }
        this.f24252j = 0.1f;
    }
}
