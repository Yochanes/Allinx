package kotlin.ranges;

import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"Lkotlin/ranges/ClosedFloatRange;", "Lkotlin/ranges/ClosedFloatingPointRange;", "", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
final class ClosedFloatRange implements ClosedFloatingPointRange<Float> {

    /* JADX INFO: renamed from: a */
    public final float f51683a;

    /* JADX INFO: renamed from: b */
    public final float f51684b;

    public ClosedFloatRange(float f, float f2) {
        this.f51683a = f;
        this.f51684b = f2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.ranges.ClosedFloatingPointRange
    /* JADX INFO: renamed from: c */
    public final boolean mo18650c(Comparable comparable, Comparable comparable2) {
        return ((Number) comparable).floatValue() <= ((Number) comparable2).floatValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.ranges.ClosedFloatingPointRange
    public final boolean contains(Comparable comparable) {
        float fFloatValue = ((Number) comparable).floatValue();
        return fFloatValue >= this.f51683a && fFloatValue <= this.f51684b;
    }

    @Override // kotlin.ranges.ClosedRange
    /* JADX INFO: renamed from: e */
    public final Comparable mo7700e() {
        return Float.valueOf(this.f51683a);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ClosedFloatRange)) {
            return false;
        }
        if (isEmpty() && ((ClosedFloatRange) obj).isEmpty()) {
            return true;
        }
        ClosedFloatRange closedFloatRange = (ClosedFloatRange) obj;
        return this.f51683a == closedFloatRange.f51683a && this.f51684b == closedFloatRange.f51684b;
    }

    @Override // kotlin.ranges.ClosedRange
    /* JADX INFO: renamed from: f */
    public final Comparable mo7701f() {
        return Float.valueOf(this.f51684b);
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return Float.hashCode(this.f51684b) + (Float.hashCode(this.f51683a) * 31);
    }

    @Override // kotlin.ranges.ClosedRange
    public final boolean isEmpty() {
        return this.f51683a > this.f51684b;
    }

    public final String toString() {
        return this.f51683a + ".." + this.f51684b;
    }
}
