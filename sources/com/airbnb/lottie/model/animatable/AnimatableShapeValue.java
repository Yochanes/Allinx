package com.airbnb.lottie.model.animatable;

import android.graphics.Path;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.ShapeKeyframeAnimation;
import com.airbnb.lottie.model.content.ShapeData;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class AnimatableShapeValue extends BaseAnimatableValue<ShapeData, Path> {
    public AnimatableShapeValue(ArrayList arrayList) {
        super(arrayList);
    }

    /* JADX INFO: renamed from: a */
    public final ShapeKeyframeAnimation m12651a() {
        return new ShapeKeyframeAnimation(this.f34530a);
    }

    @Override // com.airbnb.lottie.model.animatable.AnimatableValue
    /* JADX INFO: renamed from: j */
    public final /* bridge */ /* synthetic */ BaseKeyframeAnimation mo12648j() {
        return m12651a();
    }

    @Override // com.airbnb.lottie.model.animatable.BaseAnimatableValue, com.airbnb.lottie.model.animatable.AnimatableValue
    /* JADX INFO: renamed from: k */
    public final List mo12649k() {
        return this.f34530a;
    }
}
