package com.airbnb.lottie.model.animatable;

import android.graphics.PointF;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.FloatKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.SplitDimensionPathKeyframeAnimation;
import java.util.List;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class AnimatableSplitDimensionPathValue implements AnimatableValue<PointF, PointF> {

    /* JADX INFO: renamed from: a */
    public final AnimatableFloatValue f34515a;

    /* JADX INFO: renamed from: b */
    public final AnimatableFloatValue f34516b;

    public AnimatableSplitDimensionPathValue(AnimatableFloatValue animatableFloatValue, AnimatableFloatValue animatableFloatValue2) {
        this.f34515a = animatableFloatValue;
        this.f34516b = animatableFloatValue2;
    }

    @Override // com.airbnb.lottie.model.animatable.AnimatableValue
    /* JADX INFO: renamed from: i */
    public final boolean mo12650i() {
        return this.f34515a.mo12650i() && this.f34516b.mo12650i();
    }

    @Override // com.airbnb.lottie.model.animatable.AnimatableValue
    /* JADX INFO: renamed from: j */
    public final BaseKeyframeAnimation mo12648j() {
        return new SplitDimensionPathKeyframeAnimation((FloatKeyframeAnimation) this.f34515a.mo12648j(), (FloatKeyframeAnimation) this.f34516b.mo12648j());
    }

    @Override // com.airbnb.lottie.model.animatable.AnimatableValue
    /* JADX INFO: renamed from: k */
    public final List mo12649k() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }
}
