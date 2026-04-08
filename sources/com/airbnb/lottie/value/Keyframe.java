package com.airbnb.lottie.value;

import android.graphics.PointF;
import android.view.animation.BaseInterpolator;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.model.content.GradientColor;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class Keyframe<T> {

    /* JADX INFO: renamed from: a */
    public final LottieComposition f34884a;

    /* JADX INFO: renamed from: b */
    public final Object f34885b;

    /* JADX INFO: renamed from: c */
    public Object f34886c;

    /* JADX INFO: renamed from: d */
    public final BaseInterpolator f34887d;

    /* JADX INFO: renamed from: e */
    public final BaseInterpolator f34888e;

    /* JADX INFO: renamed from: f */
    public final BaseInterpolator f34889f;

    /* JADX INFO: renamed from: g */
    public final float f34890g;

    /* JADX INFO: renamed from: h */
    public Float f34891h;

    /* JADX INFO: renamed from: i */
    public float f34892i;

    /* JADX INFO: renamed from: j */
    public float f34893j;

    /* JADX INFO: renamed from: k */
    public int f34894k;

    /* JADX INFO: renamed from: l */
    public int f34895l;

    /* JADX INFO: renamed from: m */
    public float f34896m;

    /* JADX INFO: renamed from: n */
    public float f34897n;

    /* JADX INFO: renamed from: o */
    public PointF f34898o;

    /* JADX INFO: renamed from: p */
    public PointF f34899p;

    public Keyframe(LottieComposition lottieComposition, Object obj, Object obj2, BaseInterpolator baseInterpolator, float f, Float f2) {
        this.f34892i = -3987645.8f;
        this.f34893j = -3987645.8f;
        this.f34894k = 784923401;
        this.f34895l = 784923401;
        this.f34896m = Float.MIN_VALUE;
        this.f34897n = Float.MIN_VALUE;
        this.f34898o = null;
        this.f34899p = null;
        this.f34884a = lottieComposition;
        this.f34885b = obj;
        this.f34886c = obj2;
        this.f34887d = baseInterpolator;
        this.f34888e = null;
        this.f34889f = null;
        this.f34890g = f;
        this.f34891h = f2;
    }

    /* JADX INFO: renamed from: a */
    public final float m12784a() {
        LottieComposition lottieComposition = this.f34884a;
        if (lottieComposition == null) {
            return 1.0f;
        }
        if (this.f34897n == Float.MIN_VALUE) {
            if (this.f34891h == null) {
                this.f34897n = 1.0f;
            } else {
                this.f34897n = ((this.f34891h.floatValue() - this.f34890g) / (lottieComposition.f34050l - lottieComposition.f34049k)) + m12785b();
            }
        }
        return this.f34897n;
    }

    /* JADX INFO: renamed from: b */
    public final float m12785b() {
        LottieComposition lottieComposition = this.f34884a;
        if (lottieComposition == null) {
            return 0.0f;
        }
        if (this.f34896m == Float.MIN_VALUE) {
            float f = lottieComposition.f34049k;
            this.f34896m = (this.f34890g - f) / (lottieComposition.f34050l - f);
        }
        return this.f34896m;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m12786c() {
        return this.f34887d == null && this.f34888e == null && this.f34889f == null;
    }

    public final String toString() {
        return "Keyframe{startValue=" + this.f34885b + ", endValue=" + this.f34886c + ", startFrame=" + this.f34890g + ", endFrame=" + this.f34891h + ", interpolator=" + this.f34887d + '}';
    }

    public Keyframe(LottieComposition lottieComposition, Object obj, Object obj2, BaseInterpolator baseInterpolator, BaseInterpolator baseInterpolator2, float f) {
        this.f34892i = -3987645.8f;
        this.f34893j = -3987645.8f;
        this.f34894k = 784923401;
        this.f34895l = 784923401;
        this.f34896m = Float.MIN_VALUE;
        this.f34897n = Float.MIN_VALUE;
        this.f34898o = null;
        this.f34899p = null;
        this.f34884a = lottieComposition;
        this.f34885b = obj;
        this.f34886c = obj2;
        this.f34887d = null;
        this.f34888e = baseInterpolator;
        this.f34889f = baseInterpolator2;
        this.f34890g = f;
        this.f34891h = null;
    }

    public Keyframe(LottieComposition lottieComposition, Object obj, Object obj2, BaseInterpolator baseInterpolator, BaseInterpolator baseInterpolator2, BaseInterpolator baseInterpolator3, float f, Float f2) {
        this.f34892i = -3987645.8f;
        this.f34893j = -3987645.8f;
        this.f34894k = 784923401;
        this.f34895l = 784923401;
        this.f34896m = Float.MIN_VALUE;
        this.f34897n = Float.MIN_VALUE;
        this.f34898o = null;
        this.f34899p = null;
        this.f34884a = lottieComposition;
        this.f34885b = obj;
        this.f34886c = obj2;
        this.f34887d = baseInterpolator;
        this.f34888e = baseInterpolator2;
        this.f34889f = baseInterpolator3;
        this.f34890g = f;
        this.f34891h = f2;
    }

    public Keyframe(Object obj) {
        this.f34892i = -3987645.8f;
        this.f34893j = -3987645.8f;
        this.f34894k = 784923401;
        this.f34895l = 784923401;
        this.f34896m = Float.MIN_VALUE;
        this.f34897n = Float.MIN_VALUE;
        this.f34898o = null;
        this.f34899p = null;
        this.f34884a = null;
        this.f34885b = obj;
        this.f34886c = obj;
        this.f34887d = null;
        this.f34888e = null;
        this.f34889f = null;
        this.f34890g = Float.MIN_VALUE;
        this.f34891h = Float.valueOf(Float.MAX_VALUE);
    }

    public Keyframe(GradientColor gradientColor, GradientColor gradientColor2) {
        this.f34892i = -3987645.8f;
        this.f34893j = -3987645.8f;
        this.f34894k = 784923401;
        this.f34895l = 784923401;
        this.f34896m = Float.MIN_VALUE;
        this.f34897n = Float.MIN_VALUE;
        this.f34898o = null;
        this.f34899p = null;
        this.f34884a = null;
        this.f34885b = gradientColor;
        this.f34886c = gradientColor2;
        this.f34887d = null;
        this.f34888e = null;
        this.f34889f = null;
        this.f34890g = Float.MIN_VALUE;
        this.f34891h = Float.valueOf(Float.MAX_VALUE);
    }
}
