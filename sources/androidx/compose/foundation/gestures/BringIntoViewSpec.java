package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Stable
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, m18302d2 = {"Landroidx/compose/foundation/gestures/BringIntoViewSpec;", "", "Companion", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public interface BringIntoViewSpec {

    /* JADX INFO: renamed from: a */
    public static final Companion f5422a = Companion.f5423a;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/gestures/BringIntoViewSpec$Companion;", "", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f5423a = new Companion();

        /* JADX INFO: renamed from: b */
        public static final SpringSpec f5424b = AnimationSpecKt.m2276c(0.0f, 0.0f, null, 7);

        /* JADX INFO: renamed from: c */
        public static final BringIntoViewSpec$Companion$DefaultBringIntoViewSpec$1 f5425c = new BringIntoViewSpec$Companion$DefaultBringIntoViewSpec$1();
    }

    /* JADX INFO: renamed from: a */
    default float mo2584a(float f, float f2, float f3) {
        f5422a.getClass();
        float f4 = f2 + f;
        if ((f >= 0.0f && f4 <= f3) || (f < 0.0f && f4 > f3)) {
            return 0.0f;
        }
        float f5 = f4 - f3;
        return Math.abs(f) < Math.abs(f5) ? f : f5;
    }
}
