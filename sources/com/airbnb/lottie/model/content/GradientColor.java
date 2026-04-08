package com.airbnb.lottie.model.content;

import com.airbnb.lottie.utils.GammaEvaluator;
import java.util.Arrays;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class GradientColor {

    /* JADX INFO: renamed from: a */
    public final float[] f34537a;

    /* JADX INFO: renamed from: b */
    public final int[] f34538b;

    public GradientColor(int[] iArr, float[] fArr) {
        this.f34537a = fArr;
        this.f34538b = iArr;
    }

    /* JADX INFO: renamed from: a */
    public final GradientColor m12654a(float[] fArr) {
        int iM12734c;
        int[] iArr = new int[fArr.length];
        for (int i = 0; i < fArr.length; i++) {
            float f = fArr[i];
            float[] fArr2 = this.f34537a;
            int iBinarySearch = Arrays.binarySearch(fArr2, f);
            int[] iArr2 = this.f34538b;
            if (iBinarySearch >= 0) {
                iM12734c = iArr2[iBinarySearch];
            } else {
                int i2 = -(iBinarySearch + 1);
                if (i2 == 0) {
                    iM12734c = iArr2[0];
                } else if (i2 == iArr2.length - 1) {
                    iM12734c = iArr2[iArr2.length - 1];
                } else {
                    int i3 = i2 - 1;
                    float f2 = fArr2[i3];
                    iM12734c = GammaEvaluator.m12734c(iArr2[i3], (f - f2) / (fArr2[i2] - f2), iArr2[i2]);
                }
            }
            iArr[i] = iM12734c;
        }
        return new GradientColor(iArr, fArr);
    }
}
