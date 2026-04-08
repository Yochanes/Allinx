package com.airbnb.lottie.model.animatable;

import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.ColorKeyframeAnimation;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class AnimatableColorValue extends BaseAnimatableValue<Integer, Integer> {
    public AnimatableColorValue(ArrayList arrayList) {
        super(arrayList);
    }

    @Override // com.airbnb.lottie.model.animatable.AnimatableValue
    /* JADX INFO: renamed from: j */
    public final BaseKeyframeAnimation mo12648j() {
        return new ColorKeyframeAnimation(this.f34530a);
    }

    @Override // com.airbnb.lottie.model.animatable.BaseAnimatableValue, com.airbnb.lottie.model.animatable.AnimatableValue
    /* JADX INFO: renamed from: k */
    public final List mo12649k() {
        return this.f34530a;
    }
}
