package com.airbnb.lottie.animation.keyframe;

import com.airbnb.lottie.utils.MiscUtils;
import com.airbnb.lottie.value.Keyframe;
import com.airbnb.lottie.value.ScaleXY;
import java.util.List;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class ScaleKeyframeAnimation extends KeyframeAnimation<ScaleXY> {

    /* JADX INFO: renamed from: h */
    public final ScaleXY f34275h;

    public ScaleKeyframeAnimation(List list) {
        super(list);
        this.f34275h = new ScaleXY(1.0f, 1.0f);
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    /* JADX INFO: renamed from: f */
    public final Object mo12602f(Keyframe keyframe, float f) {
        Object obj;
        Object obj2 = keyframe.f34885b;
        if (obj2 == null || (obj = keyframe.f34886c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        ScaleXY scaleXY = (ScaleXY) obj2;
        ScaleXY scaleXY2 = (ScaleXY) obj;
        float fM12748d = MiscUtils.m12748d(scaleXY.f34902a, scaleXY2.f34902a, f);
        float fM12748d2 = MiscUtils.m12748d(scaleXY.f34903b, scaleXY2.f34903b, f);
        ScaleXY scaleXY3 = this.f34275h;
        scaleXY3.f34902a = fM12748d;
        scaleXY3.f34903b = fM12748d2;
        return scaleXY3;
    }
}
