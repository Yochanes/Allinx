package com.airbnb.lottie.animation.keyframe;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import com.airbnb.lottie.value.Keyframe;
import java.util.ArrayList;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class PathKeyframeAnimation extends KeyframeAnimation<PointF> {

    /* JADX INFO: renamed from: h */
    public final PointF f34270h;

    /* JADX INFO: renamed from: i */
    public final float[] f34271i;

    /* JADX INFO: renamed from: j */
    public final PathMeasure f34272j;

    /* JADX INFO: renamed from: k */
    public PathKeyframe f34273k;

    public PathKeyframeAnimation(ArrayList arrayList) {
        super(arrayList);
        this.f34270h = new PointF();
        this.f34271i = new float[2];
        this.f34272j = new PathMeasure();
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    /* JADX INFO: renamed from: f */
    public final Object mo12602f(Keyframe keyframe, float f) {
        PathKeyframe pathKeyframe = (PathKeyframe) keyframe;
        Path path = pathKeyframe.f34268q;
        if (path == null) {
            return (PointF) keyframe.f34885b;
        }
        PathKeyframe pathKeyframe2 = this.f34273k;
        PathMeasure pathMeasure = this.f34272j;
        if (pathKeyframe2 != pathKeyframe) {
            pathMeasure.setPath(path, false);
            this.f34273k = pathKeyframe;
        }
        float length = pathMeasure.getLength() * f;
        float[] fArr = this.f34271i;
        pathMeasure.getPosTan(length, fArr, null);
        PointF pointF = this.f34270h;
        pointF.set(fArr[0], fArr[1]);
        return pointF;
    }
}
