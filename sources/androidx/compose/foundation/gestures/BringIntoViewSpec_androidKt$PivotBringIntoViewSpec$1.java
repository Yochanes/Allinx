package androidx.compose.foundation.gestures;

import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"androidx/compose/foundation/gestures/BringIntoViewSpec_androidKt$PivotBringIntoViewSpec$1", "Landroidx/compose/foundation/gestures/BringIntoViewSpec;", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class BringIntoViewSpec_androidKt$PivotBringIntoViewSpec$1 implements BringIntoViewSpec {
    @Override // androidx.compose.foundation.gestures.BringIntoViewSpec
    /* JADX INFO: renamed from: a */
    public final float mo2584a(float f, float f2, float f3) {
        float fAbs = Math.abs((f2 + f) - f);
        float f4 = (0.3f * f3) - (0.0f * fAbs);
        float f5 = f3 - f4;
        if ((fAbs <= f3) && f5 < fAbs) {
            f4 = f3 - fAbs;
        }
        return f - f4;
    }
}
