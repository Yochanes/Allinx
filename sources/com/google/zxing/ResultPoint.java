package com.google.zxing;

import com.google.zxing.common.detector.MathUtils;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class ResultPoint {

    /* JADX INFO: renamed from: x */
    private final float f42909x;

    /* JADX INFO: renamed from: y */
    private final float f42910y;

    public ResultPoint(float f, float f2) {
        this.f42909x = f;
        this.f42910y = f2;
    }

    private static float crossProductZ(ResultPoint resultPoint, ResultPoint resultPoint2, ResultPoint resultPoint3) {
        float f = resultPoint2.f42909x;
        float f2 = resultPoint2.f42910y;
        return ((resultPoint.f42910y - f2) * (resultPoint3.f42909x - f)) - ((resultPoint.f42909x - f) * (resultPoint3.f42910y - f2));
    }

    public static float distance(ResultPoint resultPoint, ResultPoint resultPoint2) {
        return MathUtils.distance(resultPoint.f42909x, resultPoint.f42910y, resultPoint2.f42909x, resultPoint2.f42910y);
    }

    public static void orderBestPatterns(ResultPoint[] resultPointArr) {
        ResultPoint resultPoint;
        ResultPoint resultPoint2;
        ResultPoint resultPoint3;
        float fDistance = distance(resultPointArr[0], resultPointArr[1]);
        float fDistance2 = distance(resultPointArr[1], resultPointArr[2]);
        float fDistance3 = distance(resultPointArr[0], resultPointArr[2]);
        if (fDistance2 >= fDistance && fDistance2 >= fDistance3) {
            resultPoint = resultPointArr[0];
            resultPoint2 = resultPointArr[1];
            resultPoint3 = resultPointArr[2];
        } else if (fDistance3 < fDistance2 || fDistance3 < fDistance) {
            resultPoint = resultPointArr[2];
            resultPoint2 = resultPointArr[0];
            resultPoint3 = resultPointArr[1];
        } else {
            resultPoint = resultPointArr[1];
            resultPoint2 = resultPointArr[0];
            resultPoint3 = resultPointArr[2];
        }
        if (crossProductZ(resultPoint2, resultPoint, resultPoint3) < 0.0f) {
            ResultPoint resultPoint4 = resultPoint3;
            resultPoint3 = resultPoint2;
            resultPoint2 = resultPoint4;
        }
        resultPointArr[0] = resultPoint2;
        resultPointArr[1] = resultPoint;
        resultPointArr[2] = resultPoint3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ResultPoint) {
            ResultPoint resultPoint = (ResultPoint) obj;
            if (this.f42909x == resultPoint.f42909x && this.f42910y == resultPoint.f42910y) {
                return true;
            }
        }
        return false;
    }

    public final float getX() {
        return this.f42909x;
    }

    public final float getY() {
        return this.f42910y;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f42910y) + (Float.floatToIntBits(this.f42909x) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(this.f42909x);
        sb.append(',');
        return AbstractC0000a.m16m(sb, this.f42910y, ')');
    }
}
