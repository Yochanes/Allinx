package com.airbnb.lottie.animation.keyframe;

import com.airbnb.lottie.model.content.GradientColor;
import com.airbnb.lottie.utils.GammaEvaluator;
import com.airbnb.lottie.utils.MiscUtils;
import com.airbnb.lottie.value.Keyframe;
import java.util.List;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class GradientColorKeyframeAnimation extends KeyframeAnimation<GradientColor> {

    /* JADX INFO: renamed from: h */
    public final GradientColor f34264h;

    public GradientColorKeyframeAnimation(List list) {
        super(list);
        GradientColor gradientColor = (GradientColor) ((Keyframe) list.get(0)).f34885b;
        int length = gradientColor != null ? gradientColor.f34538b.length : 0;
        this.f34264h = new GradientColor(new int[length], new float[length]);
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    /* JADX INFO: renamed from: f */
    public final Object mo12602f(Keyframe keyframe, float f) {
        GradientColor gradientColor = (GradientColor) keyframe.f34885b;
        GradientColor gradientColor2 = (GradientColor) keyframe.f34886c;
        GradientColor gradientColor3 = this.f34264h;
        gradientColor3.getClass();
        int[] iArr = gradientColor.f34538b;
        int length = iArr.length;
        int[] iArr2 = gradientColor2.f34538b;
        if (length != iArr2.length) {
            StringBuilder sb = new StringBuilder("Cannot interpolate between gradients. Lengths vary (");
            sb.append(iArr.length);
            sb.append(" vs ");
            throw new IllegalArgumentException(AbstractC0000a.m11h(iArr2.length, ")", sb));
        }
        for (int i = 0; i < iArr.length; i++) {
            gradientColor3.f34537a[i] = MiscUtils.m12748d(gradientColor.f34537a[i], gradientColor2.f34537a[i], f);
            gradientColor3.f34538b[i] = GammaEvaluator.m12734c(iArr[i], f, iArr2[i]);
        }
        return gradientColor3;
    }
}
