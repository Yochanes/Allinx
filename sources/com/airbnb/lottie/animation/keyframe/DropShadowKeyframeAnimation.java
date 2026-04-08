package com.airbnb.lottie.animation.keyframe;

import android.graphics.Color;
import com.airbnb.lottie.animation.LPaint;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.model.layer.BaseLayer;
import com.airbnb.lottie.parser.DropShadowEffect;
import com.airbnb.lottie.value.LottieFrameInfo;
import com.airbnb.lottie.value.LottieValueCallback;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class DropShadowKeyframeAnimation implements BaseKeyframeAnimation.AnimationListener {

    /* JADX INFO: renamed from: a */
    public final Object f34257a;

    /* JADX INFO: renamed from: b */
    public final ColorKeyframeAnimation f34258b;

    /* JADX INFO: renamed from: c */
    public final FloatKeyframeAnimation f34259c;

    /* JADX INFO: renamed from: d */
    public final FloatKeyframeAnimation f34260d;

    /* JADX INFO: renamed from: e */
    public final FloatKeyframeAnimation f34261e;

    /* JADX INFO: renamed from: f */
    public final FloatKeyframeAnimation f34262f;

    /* JADX INFO: renamed from: g */
    public boolean f34263g = true;

    /* JADX INFO: renamed from: com.airbnb.lottie.animation.keyframe.DropShadowKeyframeAnimation$1 */
    /* JADX INFO: compiled from: Proguard */
    class C23991 extends LottieValueCallback<Float> {
        @Override // com.airbnb.lottie.value.LottieValueCallback
        /* JADX INFO: renamed from: a */
        public final Object mo12553a(LottieFrameInfo lottieFrameInfo) {
            throw null;
        }
    }

    public DropShadowKeyframeAnimation(BaseKeyframeAnimation.AnimationListener animationListener, BaseLayer baseLayer, DropShadowEffect dropShadowEffect) {
        this.f34257a = animationListener;
        BaseKeyframeAnimation baseKeyframeAnimationMo12648j = dropShadowEffect.f34766a.mo12648j();
        this.f34258b = (ColorKeyframeAnimation) baseKeyframeAnimationMo12648j;
        baseKeyframeAnimationMo12648j.m12597a(this);
        baseLayer.m12656e(baseKeyframeAnimationMo12648j);
        BaseKeyframeAnimation baseKeyframeAnimationMo12648j2 = dropShadowEffect.f34767b.mo12648j();
        this.f34259c = (FloatKeyframeAnimation) baseKeyframeAnimationMo12648j2;
        baseKeyframeAnimationMo12648j2.m12597a(this);
        baseLayer.m12656e(baseKeyframeAnimationMo12648j2);
        BaseKeyframeAnimation baseKeyframeAnimationMo12648j3 = dropShadowEffect.f34768c.mo12648j();
        this.f34260d = (FloatKeyframeAnimation) baseKeyframeAnimationMo12648j3;
        baseKeyframeAnimationMo12648j3.m12597a(this);
        baseLayer.m12656e(baseKeyframeAnimationMo12648j3);
        BaseKeyframeAnimation baseKeyframeAnimationMo12648j4 = dropShadowEffect.f34769d.mo12648j();
        this.f34261e = (FloatKeyframeAnimation) baseKeyframeAnimationMo12648j4;
        baseKeyframeAnimationMo12648j4.m12597a(this);
        baseLayer.m12656e(baseKeyframeAnimationMo12648j4);
        BaseKeyframeAnimation baseKeyframeAnimationMo12648j5 = dropShadowEffect.f34770e.mo12648j();
        this.f34262f = (FloatKeyframeAnimation) baseKeyframeAnimationMo12648j5;
        baseKeyframeAnimationMo12648j5.m12597a(this);
        baseLayer.m12656e(baseKeyframeAnimationMo12648j5);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation$AnimationListener, java.lang.Object] */
    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
    /* JADX INFO: renamed from: a */
    public final void mo12584a() {
        this.f34263g = true;
        this.f34257a.mo12584a();
    }

    /* JADX INFO: renamed from: b */
    public final void m12614b(LPaint lPaint) {
        if (this.f34263g) {
            this.f34263g = false;
            double dFloatValue = ((double) ((Float) this.f34260d.mo12601e()).floatValue()) * 0.017453292519943295d;
            float fFloatValue = ((Float) this.f34261e.mo12601e()).floatValue();
            float fSin = ((float) Math.sin(dFloatValue)) * fFloatValue;
            float fCos = ((float) Math.cos(dFloatValue + 3.141592653589793d)) * fFloatValue;
            int iIntValue = ((Integer) this.f34258b.mo12601e()).intValue();
            lPaint.setShadowLayer(((Float) this.f34262f.mo12601e()).floatValue(), fSin, fCos, Color.argb(Math.round(((Float) this.f34259c.mo12601e()).floatValue()), Color.red(iIntValue), Color.green(iIntValue), Color.blue(iIntValue)));
        }
    }
}
