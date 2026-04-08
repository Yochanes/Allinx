package kotlin.ranges;

import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"Lkotlin/ranges/ClosedDoubleRange;", "Lkotlin/ranges/ClosedFloatingPointRange;", "", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
final class ClosedDoubleRange implements ClosedFloatingPointRange<Double> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.ranges.ClosedFloatingPointRange
    /* JADX INFO: renamed from: c */
    public final boolean mo18650c(Comparable comparable, Comparable comparable2) {
        return ((Number) comparable).doubleValue() <= ((Number) comparable2).doubleValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.ranges.ClosedFloatingPointRange
    public final boolean contains(Comparable comparable) {
        double dDoubleValue = ((Number) comparable).doubleValue();
        return dDoubleValue >= 0.0d && dDoubleValue <= 1.0d;
    }

    @Override // kotlin.ranges.ClosedRange
    /* JADX INFO: renamed from: e */
    public final Comparable mo7700e() {
        return Double.valueOf(0.0d);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ClosedDoubleRange)) {
            return false;
        }
        ((ClosedDoubleRange) obj).getClass();
        return true;
    }

    @Override // kotlin.ranges.ClosedRange
    /* JADX INFO: renamed from: f */
    public final Comparable mo7701f() {
        return Double.valueOf(1.0d);
    }

    public final int hashCode() {
        return Double.hashCode(1.0d) + (Double.hashCode(0.0d) * 31);
    }

    @Override // kotlin.ranges.ClosedRange
    public final boolean isEmpty() {
        return false;
    }

    public final String toString() {
        return "0.0..1.0";
    }
}
