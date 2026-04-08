package com.airbnb.lottie.utils;

import android.animation.Animator;
import android.graphics.PointF;
import android.view.Choreographer;
import com.airbnb.lottie.LottieComposition;
import java.util.Iterator;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class LottieValueAnimator extends BaseLottieAnimator implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: d */
    public float f34868d;

    /* JADX INFO: renamed from: f */
    public boolean f34869f;

    /* JADX INFO: renamed from: g */
    public long f34870g;

    /* JADX INFO: renamed from: i */
    public float f34871i;

    /* JADX INFO: renamed from: j */
    public float f34872j;

    /* JADX INFO: renamed from: n */
    public int f34873n;

    /* JADX INFO: renamed from: o */
    public float f34874o;

    /* JADX INFO: renamed from: p */
    public float f34875p;

    /* JADX INFO: renamed from: q */
    public LottieComposition f34876q;

    /* JADX INFO: renamed from: r */
    public boolean f34877r;

    /* JADX INFO: renamed from: c */
    public final float m12738c() {
        LottieComposition lottieComposition = this.f34876q;
        if (lottieComposition == null) {
            return 0.0f;
        }
        float f = this.f34872j;
        float f2 = lottieComposition.f34049k;
        return (f - f2) / (lottieComposition.f34050l - f2);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void cancel() {
        Iterator it = this.f34860b.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorListener) it.next()).onAnimationCancel(this);
        }
        m12730a(m12741f());
        m12742h(true);
    }

    /* JADX INFO: renamed from: d */
    public final float m12739d() {
        LottieComposition lottieComposition = this.f34876q;
        if (lottieComposition == null) {
            return 0.0f;
        }
        float f = this.f34875p;
        return f == 2.1474836E9f ? lottieComposition.f34050l : f;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        boolean z2 = false;
        if (this.f34877r) {
            m12742h(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
        LottieComposition lottieComposition = this.f34876q;
        if (lottieComposition == null || !this.f34877r) {
            return;
        }
        float fAbs = (this.f34870g != 0 ? j - r2 : 0L) / ((1.0E9f / lottieComposition.f34051m) / Math.abs(this.f34868d));
        float f = this.f34871i;
        if (m12741f()) {
            fAbs = -fAbs;
        }
        float f2 = f + fAbs;
        float fM12740e = m12740e();
        float fM12739d = m12739d();
        PointF pointF = MiscUtils.f34878a;
        if (f2 >= fM12740e && f2 <= fM12739d) {
            z2 = true;
        }
        float fM12746b = MiscUtils.m12746b(f2, m12740e(), m12739d());
        this.f34871i = fM12746b;
        this.f34872j = fM12746b;
        this.f34870g = j;
        m12731b();
        if (!z2) {
            if (getRepeatCount() == -1 || this.f34873n < getRepeatCount()) {
                Iterator it = this.f34860b.iterator();
                while (it.hasNext()) {
                    ((Animator.AnimatorListener) it.next()).onAnimationRepeat(this);
                }
                this.f34873n++;
                if (getRepeatMode() == 2) {
                    this.f34869f = !this.f34869f;
                    this.f34868d = -this.f34868d;
                } else {
                    float fM12739d2 = m12741f() ? m12739d() : m12740e();
                    this.f34871i = fM12739d2;
                    this.f34872j = fM12739d2;
                }
                this.f34870g = j;
            } else {
                float fM12740e2 = this.f34868d < 0.0f ? m12740e() : m12739d();
                this.f34871i = fM12740e2;
                this.f34872j = fM12740e2;
                m12742h(true);
                m12730a(m12741f());
            }
        }
        if (this.f34876q == null) {
            return;
        }
        float f3 = this.f34872j;
        if (f3 < this.f34874o || f3 > this.f34875p) {
            throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.f34874o), Float.valueOf(this.f34875p), Float.valueOf(this.f34872j)));
        }
    }

    /* JADX INFO: renamed from: e */
    public final float m12740e() {
        LottieComposition lottieComposition = this.f34876q;
        if (lottieComposition == null) {
            return 0.0f;
        }
        float f = this.f34874o;
        return f == -2.1474836E9f ? lottieComposition.f34049k : f;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m12741f() {
        return this.f34868d < 0.0f;
    }

    @Override // android.animation.ValueAnimator
    public final float getAnimatedFraction() {
        float fM12740e;
        float fM12739d;
        float fM12740e2;
        if (this.f34876q == null) {
            return 0.0f;
        }
        if (m12741f()) {
            fM12740e = m12739d() - this.f34872j;
            fM12739d = m12739d();
            fM12740e2 = m12740e();
        } else {
            fM12740e = this.f34872j - m12740e();
            fM12739d = m12739d();
            fM12740e2 = m12740e();
        }
        return fM12740e / (fM12739d - fM12740e2);
    }

    @Override // android.animation.ValueAnimator
    public final Object getAnimatedValue() {
        return Float.valueOf(m12738c());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final long getDuration() {
        LottieComposition lottieComposition = this.f34876q;
        if (lottieComposition == null) {
            return 0L;
        }
        return (long) lottieComposition.m12555b();
    }

    /* JADX INFO: renamed from: h */
    public final void m12742h(boolean z2) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z2) {
            this.f34877r = false;
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m12743i(float f) {
        if (this.f34871i == f) {
            return;
        }
        float fM12746b = MiscUtils.m12746b(f, m12740e(), m12739d());
        this.f34871i = fM12746b;
        this.f34872j = fM12746b;
        this.f34870g = 0L;
        m12731b();
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final boolean isRunning() {
        return this.f34877r;
    }

    /* JADX INFO: renamed from: j */
    public final void m12744j(float f, float f2) {
        if (f > f2) {
            throw new IllegalArgumentException("minFrame (" + f + ") must be <= maxFrame (" + f2 + ")");
        }
        LottieComposition lottieComposition = this.f34876q;
        float f3 = lottieComposition == null ? -3.4028235E38f : lottieComposition.f34049k;
        float f4 = lottieComposition == null ? Float.MAX_VALUE : lottieComposition.f34050l;
        float fM12746b = MiscUtils.m12746b(f, f3, f4);
        float fM12746b2 = MiscUtils.m12746b(f2, f3, f4);
        if (fM12746b == this.f34874o && fM12746b2 == this.f34875p) {
            return;
        }
        this.f34874o = fM12746b;
        this.f34875p = fM12746b2;
        m12743i((int) MiscUtils.m12746b(this.f34872j, fM12746b, fM12746b2));
    }

    @Override // android.animation.ValueAnimator
    public final void setRepeatMode(int i) {
        super.setRepeatMode(i);
        if (i == 2 || !this.f34869f) {
            return;
        }
        this.f34869f = false;
        this.f34868d = -this.f34868d;
    }
}
