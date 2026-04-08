package com.airbnb.lottie.model.animatable;

import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.TextKeyframeAnimation;
import com.airbnb.lottie.model.DocumentData;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class AnimatableTextFrame extends BaseAnimatableValue<DocumentData, DocumentData> {
    public AnimatableTextFrame(ArrayList arrayList) {
        super(arrayList);
    }

    /* JADX INFO: renamed from: a */
    public final TextKeyframeAnimation m12652a() {
        return new TextKeyframeAnimation(this.f34530a);
    }

    @Override // com.airbnb.lottie.model.animatable.AnimatableValue
    /* JADX INFO: renamed from: j */
    public final /* bridge */ /* synthetic */ BaseKeyframeAnimation mo12648j() {
        return m12652a();
    }

    @Override // com.airbnb.lottie.model.animatable.BaseAnimatableValue, com.airbnb.lottie.model.animatable.AnimatableValue
    /* JADX INFO: renamed from: k */
    public final List mo12649k() {
        return this.f34530a;
    }
}
