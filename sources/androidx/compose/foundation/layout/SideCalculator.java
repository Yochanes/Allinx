package androidx.compose.foundation.layout;

import android.graphics.Insets;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bc\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, m18302d2 = {"Landroidx/compose/foundation/layout/SideCalculator;", "", "Companion", "foundation-layout_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
interface SideCalculator {

    /* JADX INFO: renamed from: a */
    public static final Companion f6555a = Companion.f6556a;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/layout/SideCalculator$Companion;", "", "foundation-layout_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f6556a = new Companion();

        /* JADX INFO: renamed from: b */
        public static final SideCalculator$Companion$LeftSideCalculator$1 f6557b = new SideCalculator$Companion$LeftSideCalculator$1();

        /* JADX INFO: renamed from: c */
        public static final SideCalculator$Companion$RightSideCalculator$1 f6558c = new SideCalculator$Companion$RightSideCalculator$1();

        /* JADX INFO: renamed from: d */
        public static final SideCalculator$Companion$BottomSideCalculator$1 f6559d = new SideCalculator$Companion$BottomSideCalculator$1();
    }

    /* JADX INFO: renamed from: a */
    default float m2806a(float f, float f2) {
        float fMo2810e = mo2810e(f, f2);
        if (fMo2810e > 0.0f) {
            return 0.0f;
        }
        return fMo2810e;
    }

    /* JADX INFO: renamed from: b */
    int mo2807b(Insets insets);

    /* JADX INFO: renamed from: c */
    default float m2808c(float f, float f2) {
        float fMo2810e = mo2810e(f, f2);
        if (fMo2810e < 0.0f) {
            return 0.0f;
        }
        return fMo2810e;
    }

    /* JADX INFO: renamed from: d */
    long mo2809d(float f, long j);

    /* JADX INFO: renamed from: e */
    float mo2810e(float f, float f2);

    /* JADX INFO: renamed from: f */
    long mo2811f(long j);

    /* JADX INFO: renamed from: g */
    Insets mo2812g(Insets insets, int i);
}
