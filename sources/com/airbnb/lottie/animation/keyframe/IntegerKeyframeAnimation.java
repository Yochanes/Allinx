package com.airbnb.lottie.animation.keyframe;

import android.graphics.PointF;
import com.airbnb.lottie.utils.MiscUtils;
import com.airbnb.lottie.value.Keyframe;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class IntegerKeyframeAnimation extends KeyframeAnimation<Integer> {
    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    /* JADX INFO: renamed from: f */
    public final Object mo12602f(Keyframe keyframe, float f) {
        return Integer.valueOf(m12618k(keyframe, f));
    }

    /* JADX INFO: renamed from: j */
    public final int m12617j() {
        return m12618k(this.f34246c.mo12607b(), m12599c());
    }

    /* JADX INFO: renamed from: k */
    public final int m12618k(Keyframe keyframe, float f) {
        Object obj = keyframe.f34885b;
        if (obj == null || keyframe.f34886c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        if (keyframe.f34894k == 784923401) {
            keyframe.f34894k = ((Integer) obj).intValue();
        }
        int i = keyframe.f34894k;
        if (keyframe.f34895l == 784923401) {
            keyframe.f34895l = ((Integer) keyframe.f34886c).intValue();
        }
        int i2 = keyframe.f34895l;
        PointF pointF = MiscUtils.f34878a;
        return (int) ((f * (i2 - i)) + i);
    }
}
