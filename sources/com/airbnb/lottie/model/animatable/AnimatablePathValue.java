package com.airbnb.lottie.model.animatable;

import android.graphics.PointF;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.PathKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.PointKeyframeAnimation;
import com.airbnb.lottie.value.Keyframe;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class AnimatablePathValue implements AnimatableValue<PointF, PointF> {

    /* JADX INFO: renamed from: a */
    public final ArrayList f34514a;

    public AnimatablePathValue(ArrayList arrayList) {
        this.f34514a = arrayList;
    }

    @Override // com.airbnb.lottie.model.animatable.AnimatableValue
    /* JADX INFO: renamed from: i */
    public final boolean mo12650i() {
        ArrayList arrayList = this.f34514a;
        return arrayList.size() == 1 && ((Keyframe) arrayList.get(0)).m12786c();
    }

    @Override // com.airbnb.lottie.model.animatable.AnimatableValue
    /* JADX INFO: renamed from: j */
    public final BaseKeyframeAnimation mo12648j() {
        ArrayList arrayList = this.f34514a;
        return ((Keyframe) arrayList.get(0)).m12786c() ? new PointKeyframeAnimation(arrayList) : new PathKeyframeAnimation(arrayList);
    }

    @Override // com.airbnb.lottie.model.animatable.AnimatableValue
    /* JADX INFO: renamed from: k */
    public final List mo12649k() {
        return this.f34514a;
    }
}
