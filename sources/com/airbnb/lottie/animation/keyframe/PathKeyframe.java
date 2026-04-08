package com.airbnb.lottie.animation.keyframe;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.utils.Utils;
import com.airbnb.lottie.value.Keyframe;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class PathKeyframe extends Keyframe<PointF> {

    /* JADX INFO: renamed from: q */
    public Path f34268q;

    /* JADX INFO: renamed from: r */
    public final Keyframe f34269r;

    public PathKeyframe(LottieComposition lottieComposition, Keyframe keyframe) {
        super(lottieComposition, (PointF) keyframe.f34885b, (PointF) keyframe.f34886c, keyframe.f34887d, keyframe.f34888e, keyframe.f34889f, keyframe.f34890g, keyframe.f34891h);
        this.f34269r = keyframe;
        m12619d();
    }

    /* JADX INFO: renamed from: d */
    public final void m12619d() {
        Object obj;
        Object obj2 = this.f34886c;
        Object obj3 = this.f34885b;
        boolean z2 = (obj2 == null || obj3 == null || !((PointF) obj3).equals(((PointF) obj2).x, ((PointF) obj2).y)) ? false : true;
        if (obj3 == null || (obj = this.f34886c) == null || z2) {
            return;
        }
        PointF pointF = (PointF) obj3;
        PointF pointF2 = (PointF) obj;
        Keyframe keyframe = this.f34269r;
        PointF pointF3 = keyframe.f34898o;
        PointF pointF4 = keyframe.f34899p;
        ThreadLocal threadLocal = Utils.f34879a;
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        if (pointF3 == null || pointF4 == null || (pointF3.length() == 0.0f && pointF4.length() == 0.0f)) {
            path.lineTo(pointF2.x, pointF2.y);
        } else {
            float f = pointF3.x + pointF.x;
            float f2 = pointF.y + pointF3.y;
            float f3 = pointF2.x;
            float f4 = f3 + pointF4.x;
            float f5 = pointF2.y;
            path.cubicTo(f, f2, f4, f5 + pointF4.y, f3, f5);
        }
        this.f34268q = path;
    }
}
