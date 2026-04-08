package com.google.android.material.transition;

import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
class FadeModeEvaluators {

    /* JADX INFO: renamed from: IN */
    private static final FadeModeEvaluator f42523IN = new C40551();
    private static final FadeModeEvaluator OUT = new C40562();
    private static final FadeModeEvaluator CROSS = new C40573();
    private static final FadeModeEvaluator THROUGH = new C40584();

    /* JADX INFO: renamed from: com.google.android.material.transition.FadeModeEvaluators$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C40551 implements FadeModeEvaluator {
        @Override // com.google.android.material.transition.FadeModeEvaluator
        public FadeModeResult evaluate(float f, float f2, float f3, float f4) {
            return FadeModeResult.endOnTop(255, TransitionUtils.lerp(0, 255, f2, f3, f));
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.transition.FadeModeEvaluators$2 */
    /* JADX INFO: compiled from: Proguard */
    public class C40562 implements FadeModeEvaluator {
        @Override // com.google.android.material.transition.FadeModeEvaluator
        public FadeModeResult evaluate(float f, float f2, float f3, float f4) {
            return FadeModeResult.startOnTop(TransitionUtils.lerp(255, 0, f2, f3, f), 255);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.transition.FadeModeEvaluators$3 */
    /* JADX INFO: compiled from: Proguard */
    public class C40573 implements FadeModeEvaluator {
        @Override // com.google.android.material.transition.FadeModeEvaluator
        public FadeModeResult evaluate(float f, float f2, float f3, float f4) {
            return FadeModeResult.startOnTop(TransitionUtils.lerp(255, 0, f2, f3, f), TransitionUtils.lerp(0, 255, f2, f3, f));
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.transition.FadeModeEvaluators$4 */
    /* JADX INFO: compiled from: Proguard */
    public class C40584 implements FadeModeEvaluator {
        @Override // com.google.android.material.transition.FadeModeEvaluator
        public FadeModeResult evaluate(float f, float f2, float f3, float f4) {
            float fM4a = AbstractC0000a.m4a(f3, f2, f4, f2);
            return FadeModeResult.startOnTop(TransitionUtils.lerp(255, 0, f2, fM4a, f), TransitionUtils.lerp(0, 255, fM4a, f3, f));
        }
    }

    private FadeModeEvaluators() {
    }

    public static FadeModeEvaluator get(int i, boolean z2) {
        if (i == 0) {
            return z2 ? f42523IN : OUT;
        }
        if (i == 1) {
            return z2 ? OUT : f42523IN;
        }
        if (i == 2) {
            return CROSS;
        }
        if (i == 3) {
            return THROUGH;
        }
        throw new IllegalArgumentException(AbstractC0000a.m9f(i, "Invalid fade mode: "));
    }
}
