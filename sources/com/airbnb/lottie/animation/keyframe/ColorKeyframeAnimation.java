package com.airbnb.lottie.animation.keyframe;

import com.airbnb.lottie.utils.GammaEvaluator;
import com.airbnb.lottie.utils.MiscUtils;
import com.airbnb.lottie.value.Keyframe;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class ColorKeyframeAnimation extends KeyframeAnimation<Integer> {
    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    /* JADX INFO: renamed from: f */
    public final Object mo12602f(Keyframe keyframe, float f) {
        return Integer.valueOf(m12613k(keyframe, f));
    }

    /* JADX INFO: renamed from: j */
    public final int m12612j() {
        return m12613k(this.f34246c.mo12607b(), m12599c());
    }

    /* JADX INFO: renamed from: k */
    public final int m12613k(Keyframe keyframe, float f) {
        if (keyframe.f34885b == null || keyframe.f34886c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        Object obj = keyframe.f34885b;
        return GammaEvaluator.m12734c(((Integer) obj).intValue(), MiscUtils.m12746b(f, 0.0f, 1.0f), ((Integer) keyframe.f34886c).intValue());
    }
}
