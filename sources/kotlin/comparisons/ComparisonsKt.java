package kotlin.comparisons;

import androidx.compose.p013ui.unit.C1338Dp;
import java.util.Comparator;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"kotlin/comparisons/ComparisonsKt__ComparisonsKt", "kotlin/comparisons/ComparisonsKt___ComparisonsJvmKt", "kotlin/comparisons/ComparisonsKt___ComparisonsKt"}, m18303k = 4, m18304mv = {2, 1, 0}, m18306xi = 49)
public final class ComparisonsKt extends ComparisonsKt___ComparisonsKt {
    /* JADX INFO: renamed from: a */
    public static int m18545a(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    /* JADX INFO: renamed from: b */
    public static Comparable m18546b(C1338Dp c1338Dp, C1338Dp c1338Dp2) {
        return c1338Dp.compareTo(c1338Dp2) >= 0 ? c1338Dp : c1338Dp2;
    }

    /* JADX INFO: renamed from: c */
    public static /* bridge */ /* synthetic */ Comparator m18547c() {
        return NaturalOrderComparator.f51570a;
    }
}
