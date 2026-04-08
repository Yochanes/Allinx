package com.airbnb.lottie.utils;

import android.graphics.PointF;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class MiscUtils {

    /* JADX INFO: renamed from: a */
    public static final PointF f34878a = new PointF();

    /* JADX INFO: renamed from: a */
    public static PointF m12745a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    /* JADX INFO: renamed from: b */
    public static float m12746b(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f3, f));
    }

    /* JADX INFO: renamed from: c */
    public static int m12747c(float f, float f2) {
        int i = (int) f;
        int i2 = (int) f2;
        int i3 = i / i2;
        int i4 = i % i2;
        if (!((i ^ i2) >= 0) && i4 != 0) {
            i3--;
        }
        return i - (i2 * i3);
    }

    /* JADX INFO: renamed from: d */
    public static float m12748d(float f, float f2, float f3) {
        return AbstractC0000a.m4a(f2, f, f3, f);
    }
}
