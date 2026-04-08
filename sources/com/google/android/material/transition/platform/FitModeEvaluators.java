package com.google.android.material.transition.platform;

import android.graphics.RectF;
import androidx.annotation.RequiresApi;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@RequiresApi
class FitModeEvaluators {
    private static final FitModeEvaluator WIDTH = new C40821();
    private static final FitModeEvaluator HEIGHT = new C40832();

    /* JADX INFO: renamed from: com.google.android.material.transition.platform.FitModeEvaluators$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C40821 implements FitModeEvaluator {
        @Override // com.google.android.material.transition.platform.FitModeEvaluator
        public void applyMask(RectF rectF, float f, FitModeResult fitModeResult) {
            rectF.bottom -= Math.abs(fitModeResult.currentEndHeight - fitModeResult.currentStartHeight) * f;
        }

        @Override // com.google.android.material.transition.platform.FitModeEvaluator
        public FitModeResult evaluate(float f, float f2, float f3, float f4, float f5, float f6, float f7) {
            float fLerp = TransitionUtils.lerp(f4, f6, f2, f3, f, true);
            float f8 = fLerp / f4;
            float f9 = fLerp / f6;
            return new FitModeResult(f8, f9, fLerp, f5 * f8, fLerp, f7 * f9);
        }

        @Override // com.google.android.material.transition.platform.FitModeEvaluator
        public boolean shouldMaskStartBounds(FitModeResult fitModeResult) {
            return fitModeResult.currentStartHeight > fitModeResult.currentEndHeight;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.transition.platform.FitModeEvaluators$2 */
    /* JADX INFO: compiled from: Proguard */
    public class C40832 implements FitModeEvaluator {
        @Override // com.google.android.material.transition.platform.FitModeEvaluator
        public void applyMask(RectF rectF, float f, FitModeResult fitModeResult) {
            float fAbs = (Math.abs(fitModeResult.currentEndWidth - fitModeResult.currentStartWidth) / 2.0f) * f;
            rectF.left += fAbs;
            rectF.right -= fAbs;
        }

        @Override // com.google.android.material.transition.platform.FitModeEvaluator
        public FitModeResult evaluate(float f, float f2, float f3, float f4, float f5, float f6, float f7) {
            float fLerp = TransitionUtils.lerp(f5, f7, f2, f3, f, true);
            float f8 = fLerp / f5;
            float f9 = fLerp / f7;
            return new FitModeResult(f8, f9, f4 * f8, fLerp, f6 * f9, fLerp);
        }

        @Override // com.google.android.material.transition.platform.FitModeEvaluator
        public boolean shouldMaskStartBounds(FitModeResult fitModeResult) {
            return fitModeResult.currentStartWidth > fitModeResult.currentEndWidth;
        }
    }

    private FitModeEvaluators() {
    }

    public static FitModeEvaluator get(int i, boolean z2, RectF rectF, RectF rectF2) {
        if (i == 0) {
            return shouldAutoFitToWidth(z2, rectF, rectF2) ? WIDTH : HEIGHT;
        }
        if (i == 1) {
            return WIDTH;
        }
        if (i == 2) {
            return HEIGHT;
        }
        throw new IllegalArgumentException(AbstractC0000a.m9f(i, "Invalid fit mode: "));
    }

    private static boolean shouldAutoFitToWidth(boolean z2, RectF rectF, RectF rectF2) {
        float fWidth = rectF.width();
        float fHeight = rectF.height();
        float fWidth2 = rectF2.width();
        float fHeight2 = rectF2.height();
        return z2 ? (fHeight2 * fWidth) / fWidth2 >= fHeight : (fWidth2 * fHeight) / fWidth >= fHeight2;
    }
}
