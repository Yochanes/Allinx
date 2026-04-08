package com.airbnb.lottie.animation.keyframe;

import com.airbnb.lottie.utils.MiscUtils;
import com.airbnb.lottie.value.Keyframe;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class FloatKeyframeAnimation extends KeyframeAnimation<Float> {
    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    /* JADX INFO: renamed from: f */
    public final Object mo12602f(Keyframe keyframe, float f) {
        return Float.valueOf(m12616k(keyframe, f));
    }

    /* JADX INFO: renamed from: j */
    public final float m12615j() {
        return m12616k(this.f34246c.mo12607b(), m12599c());
    }

    /* JADX INFO: renamed from: k */
    public final float m12616k(Keyframe keyframe, float f) {
        if (keyframe.f34885b == null || keyframe.f34886c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        Object obj = keyframe.f34885b;
        if (keyframe.f34892i == -3987645.8f) {
            keyframe.f34892i = ((Float) obj).floatValue();
        }
        float f2 = keyframe.f34892i;
        if (keyframe.f34893j == -3987645.8f) {
            keyframe.f34893j = ((Float) keyframe.f34886c).floatValue();
        }
        return MiscUtils.m12748d(f2, keyframe.f34893j, f);
    }
}
