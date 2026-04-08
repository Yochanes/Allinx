package com.airbnb.lottie.model;

import android.graphics.PointF;
import androidx.annotation.RestrictTo;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo
public class CubicCurveData {

    /* JADX INFO: renamed from: a */
    public final PointF f34479a;

    /* JADX INFO: renamed from: b */
    public final PointF f34480b;

    /* JADX INFO: renamed from: c */
    public final PointF f34481c;

    public CubicCurveData() {
        this.f34479a = new PointF();
        this.f34480b = new PointF();
        this.f34481c = new PointF();
    }

    public final String toString() {
        PointF pointF = this.f34481c;
        Float fValueOf = Float.valueOf(pointF.x);
        Float fValueOf2 = Float.valueOf(pointF.y);
        PointF pointF2 = this.f34479a;
        Float fValueOf3 = Float.valueOf(pointF2.x);
        Float fValueOf4 = Float.valueOf(pointF2.y);
        PointF pointF3 = this.f34480b;
        return String.format("v=%.2f,%.2f cp1=%.2f,%.2f cp2=%.2f,%.2f", fValueOf, fValueOf2, fValueOf3, fValueOf4, Float.valueOf(pointF3.x), Float.valueOf(pointF3.y));
    }

    public CubicCurveData(PointF pointF, PointF pointF2, PointF pointF3) {
        this.f34479a = pointF;
        this.f34480b = pointF2;
        this.f34481c = pointF3;
    }
}
