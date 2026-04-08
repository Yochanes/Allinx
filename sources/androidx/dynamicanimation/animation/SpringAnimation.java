package androidx.dynamicanimation.animation;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import androidx.dynamicanimation.animation.AnimationHandler;
import androidx.dynamicanimation.animation.DynamicAnimation;
import java.util.ArrayList;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final class SpringAnimation extends DynamicAnimation<SpringAnimation> {

    /* JADX INFO: renamed from: s */
    public SpringForce f24262s;

    /* JADX INFO: renamed from: t */
    public float f24263t;

    /* JADX INFO: renamed from: u */
    public boolean f24264u;

    public SpringAnimation(FloatValueHolder floatValueHolder) {
        super(floatValueHolder);
        this.f24262s = null;
        this.f24263t = Float.MAX_VALUE;
        this.f24264u = false;
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    /* JADX INFO: renamed from: d */
    public final boolean mo8765d(long j) {
        if (this.f24264u) {
            float f = this.f24263t;
            if (f != Float.MAX_VALUE) {
                this.f24262s.f24273i = f;
                this.f24263t = Float.MAX_VALUE;
            }
            this.f24244b = (float) this.f24262s.f24273i;
            this.f24243a = 0.0f;
            this.f24264u = false;
            return true;
        }
        if (this.f24263t != Float.MAX_VALUE) {
            long j2 = j / 2;
            DynamicAnimation.MassState massStateM8776c = this.f24262s.m8776c(this.f24244b, this.f24243a, j2);
            SpringForce springForce = this.f24262s;
            springForce.f24273i = this.f24263t;
            this.f24263t = Float.MAX_VALUE;
            DynamicAnimation.MassState massStateM8776c2 = springForce.m8776c(massStateM8776c.f24256a, massStateM8776c.f24257b, j2);
            this.f24244b = massStateM8776c2.f24256a;
            this.f24243a = massStateM8776c2.f24257b;
        } else {
            DynamicAnimation.MassState massStateM8776c3 = this.f24262s.m8776c(this.f24244b, this.f24243a, j);
            this.f24244b = massStateM8776c3.f24256a;
            this.f24243a = massStateM8776c3.f24257b;
        }
        float fMax = Math.max(this.f24244b, this.f24250h);
        this.f24244b = fMax;
        this.f24244b = Math.min(fMax, this.f24249g);
        float f2 = this.f24243a;
        SpringForce springForce2 = this.f24262s;
        springForce2.getClass();
        if (Math.abs(f2) >= springForce2.f24269e || Math.abs(r1 - ((float) springForce2.f24273i)) >= springForce2.f24268d) {
            return false;
        }
        this.f24244b = (float) this.f24262s.f24273i;
        this.f24243a = 0.0f;
        return true;
    }

    /* JADX INFO: renamed from: e */
    public final void m8770e(float f) {
        if (this.f24248f) {
            this.f24263t = f;
            return;
        }
        if (this.f24262s == null) {
            this.f24262s = new SpringForce(f);
        }
        this.f24262s.f24273i = f;
        m8773h();
    }

    /* JADX INFO: renamed from: f */
    public final void m8771f() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be canceled on the main thread");
        }
        if (this.f24248f) {
            m8763b(true);
        }
        float f = this.f24263t;
        if (f != Float.MAX_VALUE) {
            SpringForce springForce = this.f24262s;
            if (springForce == null) {
                this.f24262s = new SpringForce(f);
            } else {
                springForce.f24273i = f;
            }
            this.f24263t = Float.MAX_VALUE;
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m8772g() {
        if (this.f24262s.f24266b <= 0.0d) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        if (this.f24248f) {
            this.f24264u = true;
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m8773h() {
        SpringForce springForce = this.f24262s;
        if (springForce == null) {
            throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        }
        double d = (float) springForce.f24273i;
        if (d > this.f24249g) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        if (d < this.f24250h) {
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
        double dAbs = Math.abs(this.f24252j * 0.75f);
        springForce.f24268d = dAbs;
        springForce.f24269e = dAbs * 62.5d;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        boolean z2 = this.f24248f;
        if (z2 || z2) {
            return;
        }
        this.f24248f = true;
        if (!this.f24245c) {
            this.f24244b = this.f24247e.getValue(this.f24246d);
        }
        float f = this.f24244b;
        if (f > this.f24249g || f < this.f24250h) {
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
        ThreadLocal threadLocal = AnimationHandler.f24226f;
        if (threadLocal.get() == null) {
            threadLocal.set(new AnimationHandler());
        }
        AnimationHandler animationHandler = (AnimationHandler) threadLocal.get();
        ArrayList arrayList = animationHandler.f24228b;
        if (arrayList.size() == 0) {
            if (animationHandler.f24230d == null) {
                animationHandler.f24230d = new AnimationHandler.FrameCallbackProvider16(animationHandler.f24229c);
            }
            animationHandler.f24230d.m8762a();
        }
        if (arrayList.contains(this)) {
            return;
        }
        arrayList.add(this);
    }
}
