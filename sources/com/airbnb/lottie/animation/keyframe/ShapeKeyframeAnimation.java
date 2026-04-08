package com.airbnb.lottie.animation.keyframe;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.animation.content.ShapeModifierContent;
import com.airbnb.lottie.model.CubicCurveData;
import com.airbnb.lottie.model.content.ShapeData;
import com.airbnb.lottie.utils.Logger;
import com.airbnb.lottie.utils.MiscUtils;
import com.airbnb.lottie.value.Keyframe;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class ShapeKeyframeAnimation extends BaseKeyframeAnimation<ShapeData, Path> {

    /* JADX INFO: renamed from: h */
    public final ShapeData f34276h;

    /* JADX INFO: renamed from: i */
    public final Path f34277i;

    /* JADX INFO: renamed from: j */
    public ArrayList f34278j;

    public ShapeKeyframeAnimation(List list) {
        super(list);
        this.f34276h = new ShapeData();
        this.f34277i = new Path();
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    /* JADX INFO: renamed from: f */
    public final Object mo12602f(Keyframe keyframe, float f) {
        ShapeData shapeData = (ShapeData) keyframe.f34885b;
        ShapeData shapeData2 = (ShapeData) keyframe.f34886c;
        ShapeData shapeDataMo12595c = this.f34276h;
        if (shapeDataMo12595c.f34606b == null) {
            shapeDataMo12595c.f34606b = new PointF();
        }
        int i = 0;
        shapeDataMo12595c.f34607c = shapeData.f34607c || shapeData2.f34607c;
        ArrayList arrayList = shapeData.f34605a;
        int size = arrayList.size();
        int size2 = shapeData2.f34605a.size();
        ArrayList arrayList2 = shapeData2.f34605a;
        if (size != size2) {
            Logger.m12736b("Curves must have the same number of control points. Shape 1: " + arrayList.size() + "\tShape 2: " + arrayList2.size());
        }
        int iMin = Math.min(arrayList.size(), arrayList2.size());
        ArrayList arrayList3 = shapeDataMo12595c.f34605a;
        if (arrayList3.size() < iMin) {
            for (int size3 = arrayList3.size(); size3 < iMin; size3++) {
                arrayList3.add(new CubicCurveData());
            }
        } else if (arrayList3.size() > iMin) {
            for (int size4 = arrayList3.size() - 1; size4 >= iMin; size4--) {
                arrayList3.remove(arrayList3.size() - 1);
            }
        }
        PointF pointF = shapeData.f34606b;
        PointF pointF2 = shapeData2.f34606b;
        shapeDataMo12595c.m12655a(MiscUtils.m12748d(pointF.x, pointF2.x, f), MiscUtils.m12748d(pointF.y, pointF2.y, f));
        for (int size5 = arrayList3.size() - 1; size5 >= 0; size5--) {
            CubicCurveData cubicCurveData = (CubicCurveData) arrayList.get(size5);
            CubicCurveData cubicCurveData2 = (CubicCurveData) arrayList2.get(size5);
            PointF pointF3 = cubicCurveData.f34479a;
            PointF pointF4 = cubicCurveData2.f34479a;
            ((CubicCurveData) arrayList3.get(size5)).f34479a.set(MiscUtils.m12748d(pointF3.x, pointF4.x, f), MiscUtils.m12748d(pointF3.y, pointF4.y, f));
            CubicCurveData cubicCurveData3 = (CubicCurveData) arrayList3.get(size5);
            PointF pointF5 = cubicCurveData.f34480b;
            float f2 = pointF5.x;
            PointF pointF6 = cubicCurveData2.f34480b;
            cubicCurveData3.f34480b.set(MiscUtils.m12748d(f2, pointF6.x, f), MiscUtils.m12748d(pointF5.y, pointF6.y, f));
            CubicCurveData cubicCurveData4 = (CubicCurveData) arrayList3.get(size5);
            PointF pointF7 = cubicCurveData.f34481c;
            float f3 = pointF7.x;
            PointF pointF8 = cubicCurveData2.f34481c;
            cubicCurveData4.f34481c.set(MiscUtils.m12748d(f3, pointF8.x, f), MiscUtils.m12748d(pointF7.y, pointF8.y, f));
        }
        ArrayList arrayList4 = this.f34278j;
        if (arrayList4 != null) {
            for (int size6 = arrayList4.size() - 1; size6 >= 0; size6--) {
                shapeDataMo12595c = ((ShapeModifierContent) this.f34278j.get(size6)).mo12595c(shapeDataMo12595c);
            }
        }
        Path path = this.f34277i;
        path.reset();
        PointF pointF9 = shapeDataMo12595c.f34606b;
        path.moveTo(pointF9.x, pointF9.y);
        PointF pointF10 = MiscUtils.f34878a;
        pointF10.set(pointF9.x, pointF9.y);
        while (true) {
            ArrayList arrayList5 = shapeDataMo12595c.f34605a;
            if (i >= arrayList5.size()) {
                break;
            }
            CubicCurveData cubicCurveData5 = (CubicCurveData) arrayList5.get(i);
            PointF pointF11 = cubicCurveData5.f34479a;
            boolean zEquals = pointF11.equals(pointF10);
            PointF pointF12 = cubicCurveData5.f34480b;
            PointF pointF13 = cubicCurveData5.f34481c;
            if (zEquals && pointF12.equals(pointF13)) {
                path.lineTo(pointF13.x, pointF13.y);
            } else {
                path.cubicTo(pointF11.x, pointF11.y, pointF12.x, pointF12.y, pointF13.x, pointF13.y);
            }
            pointF10.set(pointF13.x, pointF13.y);
            i++;
        }
        if (shapeDataMo12595c.f34607c) {
            path.close();
        }
        return path;
    }
}
