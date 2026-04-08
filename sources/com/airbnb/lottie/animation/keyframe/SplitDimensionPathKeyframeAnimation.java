package com.airbnb.lottie.animation.keyframe;

import android.graphics.PointF;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.value.Keyframe;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class SplitDimensionPathKeyframeAnimation extends BaseKeyframeAnimation<PointF, PointF> {

    /* JADX INFO: renamed from: h */
    public final PointF f34279h;

    /* JADX INFO: renamed from: i */
    public final PointF f34280i;

    /* JADX INFO: renamed from: j */
    public final FloatKeyframeAnimation f34281j;

    /* JADX INFO: renamed from: k */
    public final FloatKeyframeAnimation f34282k;

    public SplitDimensionPathKeyframeAnimation(FloatKeyframeAnimation floatKeyframeAnimation, FloatKeyframeAnimation floatKeyframeAnimation2) {
        super(Collections.EMPTY_LIST);
        this.f34279h = new PointF();
        this.f34280i = new PointF();
        this.f34281j = floatKeyframeAnimation;
        this.f34282k = floatKeyframeAnimation2;
        mo12605i(this.f34247d);
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    /* JADX INFO: renamed from: e */
    public final Object mo12601e() {
        return m12621j(0.0f);
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    /* JADX INFO: renamed from: f */
    public final /* bridge */ /* synthetic */ Object mo12602f(Keyframe keyframe, float f) {
        return m12621j(f);
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    /* JADX INFO: renamed from: i */
    public final void mo12605i(float f) {
        FloatKeyframeAnimation floatKeyframeAnimation = this.f34281j;
        floatKeyframeAnimation.mo12605i(f);
        FloatKeyframeAnimation floatKeyframeAnimation2 = this.f34282k;
        floatKeyframeAnimation2.mo12605i(f);
        this.f34279h.set(((Float) floatKeyframeAnimation.mo12601e()).floatValue(), ((Float) floatKeyframeAnimation2.mo12601e()).floatValue());
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f34244a;
            if (i >= arrayList.size()) {
                return;
            }
            ((BaseKeyframeAnimation.AnimationListener) arrayList.get(i)).mo12584a();
            i++;
        }
    }

    /* JADX INFO: renamed from: j */
    public final PointF m12621j(float f) {
        PointF pointF = this.f34279h;
        PointF pointF2 = this.f34280i;
        pointF2.set(pointF.x, 0.0f);
        pointF2.set(pointF2.x, pointF.y);
        return pointF2;
    }
}
