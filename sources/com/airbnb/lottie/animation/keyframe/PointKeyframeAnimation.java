package com.airbnb.lottie.animation.keyframe;

import android.graphics.PointF;
import com.airbnb.lottie.value.Keyframe;
import java.util.List;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class PointKeyframeAnimation extends KeyframeAnimation<PointF> {

    /* JADX INFO: renamed from: h */
    public final PointF f34274h;

    public PointKeyframeAnimation(List list) {
        super(list);
        this.f34274h = new PointF();
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    /* JADX INFO: renamed from: f */
    public final Object mo12602f(Keyframe keyframe, float f) {
        return m12620j(keyframe, f, f, f);
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    /* JADX INFO: renamed from: g */
    public final /* bridge */ /* synthetic */ Object mo12603g(Keyframe keyframe, float f, float f2, float f3) {
        return m12620j(keyframe, f, f2, f3);
    }

    /* JADX INFO: renamed from: j */
    public final PointF m12620j(Keyframe keyframe, float f, float f2, float f3) {
        Object obj;
        Object obj2 = keyframe.f34885b;
        if (obj2 == null || (obj = keyframe.f34886c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF = (PointF) obj2;
        PointF pointF2 = (PointF) obj;
        PointF pointF3 = this.f34274h;
        float f4 = pointF.x;
        float fM4a = AbstractC0000a.m4a(pointF2.x, f4, f2, f4);
        float f5 = pointF.y;
        pointF3.set(fM4a, AbstractC0000a.m4a(pointF2.y, f5, f3, f5));
        return pointF3;
    }
}
