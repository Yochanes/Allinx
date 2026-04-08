package com.airbnb.lottie.utils;

import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class GammaEvaluator {
    /* JADX INFO: renamed from: a */
    public static float m12732a(float f) {
        return f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    /* JADX INFO: renamed from: b */
    public static float m12733b(float f) {
        return f <= 0.0031308f ? f * 12.92f : (float) ((Math.pow(f, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    /* JADX INFO: renamed from: c */
    public static int m12734c(int i, float f, int i2) {
        if (i == i2) {
            return i;
        }
        float f2 = ((i >> 24) & 255) / 255.0f;
        float f3 = ((i2 >> 24) & 255) / 255.0f;
        float fM12732a = m12732a(((i >> 16) & 255) / 255.0f);
        float fM12732a2 = m12732a(((i >> 8) & 255) / 255.0f);
        float fM12732a3 = m12732a((i & 255) / 255.0f);
        float fM12732a4 = m12732a(((i2 >> 16) & 255) / 255.0f);
        float fM12732a5 = m12732a(((i2 >> 8) & 255) / 255.0f);
        float fM12732a6 = m12732a((i2 & 255) / 255.0f);
        float fM4a = AbstractC0000a.m4a(f3, f2, f, f2);
        float fM4a2 = AbstractC0000a.m4a(fM12732a4, fM12732a, f, fM12732a);
        float fM4a3 = AbstractC0000a.m4a(fM12732a5, fM12732a2, f, fM12732a2);
        float fM4a4 = AbstractC0000a.m4a(fM12732a6, fM12732a3, f, fM12732a3);
        float fM12733b = m12733b(fM4a2) * 255.0f;
        float fM12733b2 = m12733b(fM4a3) * 255.0f;
        return Math.round(m12733b(fM4a4) * 255.0f) | (Math.round(fM12733b) << 16) | (Math.round(fM4a * 255.0f) << 24) | (Math.round(fM12733b2) << 8);
    }
}
