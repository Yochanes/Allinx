package com.google.android.material.transition.platform;

import androidx.annotation.RequiresApi;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@RequiresApi
class FadeModeEvaluators {

    /* JADX INFO: renamed from: IN */
    private static final FadeModeEvaluator f42528IN = new C40741();
    private static final FadeModeEvaluator OUT = new C40752();
    private static final FadeModeEvaluator CROSS = new C40763();
    private static final FadeModeEvaluator THROUGH = new C40774();

    /* JADX INFO: renamed from: com.google.android.material.transition.platform.FadeModeEvaluators$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C40741 implements FadeModeEvaluator {
        @Override // com.google.android.material.transition.platform.FadeModeEvaluator
        public FadeModeResult evaluate(float f, float f2, float f3, float f4) {
            return FadeModeResult.endOnTop(255, TransitionUtils.lerp(0, 255, f2, f3, f));
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.transition.platform.FadeModeEvaluators$2 */
    /* JADX INFO: compiled from: Proguard */
    public class C40752 implements FadeModeEvaluator {
        @Override // com.google.android.material.transition.platform.FadeModeEvaluator
        public FadeModeResult evaluate(float f, float f2, float f3, float f4) {
            return FadeModeResult.startOnTop(TransitionUtils.lerp(255, 0, f2, f3, f), 255);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.transition.platform.FadeModeEvaluators$3 */
    /* JADX INFO: compiled from: Proguard */
    public class C40763 implements FadeModeEvaluator {
        @Override // com.google.android.material.transition.platform.FadeModeEvaluator
        public FadeModeResult evaluate(float f, float f2, float f3, float f4) {
            return FadeModeResult.startOnTop(TransitionUtils.lerp(255, 0, f2, f3, f), TransitionUtils.lerp(0, 255, f2, f3, f));
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.transition.platform.FadeModeEvaluators$4 */
    /* JADX INFO: compiled from: Proguard */
    public class C40774 implements FadeModeEvaluator {
        @Override // com.google.android.material.transition.platform.FadeModeEvaluator
        public FadeModeResult evaluate(float f, float f2, float f3, float f4) {
            float fM4a = AbstractC0000a.m4a(f3, f2, f4, f2);
            return FadeModeResult.startOnTop(TransitionUtils.lerp(255, 0, f2, fM4a, f), TransitionUtils.lerp(0, 255, fM4a, f3, f));
        }
    }

    private FadeModeEvaluators() {
    }

    public static FadeModeEvaluator get(int i, boolean z2) {
        if (i == 0) {
            return z2 ? f42528IN : OUT;
        }
        if (i == 1) {
            return z2 ? OUT : f42528IN;
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
