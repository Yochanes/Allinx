package com.airbnb.lottie.model.animatable;

import android.graphics.PointF;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.PointKeyframeAnimation;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class AnimatablePointValue extends BaseAnimatableValue<PointF, PointF> {
    public AnimatablePointValue(ArrayList arrayList) {
        super(arrayList);
    }

    @Override // com.airbnb.lottie.model.animatable.AnimatableValue
    /* JADX INFO: renamed from: j */
    public final BaseKeyframeAnimation mo12648j() {
        return new PointKeyframeAnimation(this.f34530a);
    }

    @Override // com.airbnb.lottie.model.animatable.BaseAnimatableValue, com.airbnb.lottie.model.animatable.AnimatableValue
    /* JADX INFO: renamed from: k */
    public final List mo12649k() {
        return this.f34530a;
    }
}
