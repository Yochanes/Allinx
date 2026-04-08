package kotlin.ranges;

import java.lang.Comparable;
import kotlin.Metadata;
import kotlin.ranges.ClosedRange;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0012\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, m18302d2 = {"Lkotlin/ranges/ComparableRange;", "", "T", "Lkotlin/ranges/ClosedRange;", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
class ComparableRange<T extends Comparable<? super T>> implements ClosedRange<T> {
    @Override // kotlin.ranges.ClosedRange
    /* JADX INFO: renamed from: e */
    public final Comparable mo7700e() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ComparableRange)) {
            return false;
        }
        if (ClosedRange.DefaultImpls.m18651a(this)) {
            ComparableRange comparableRange = (ComparableRange) obj;
            comparableRange.getClass();
            if (ClosedRange.DefaultImpls.m18651a(comparableRange)) {
                return true;
            }
        }
        ComparableRange comparableRange2 = (ComparableRange) obj;
        comparableRange2.getClass();
        comparableRange2.getClass();
        return true;
    }

    @Override // kotlin.ranges.ClosedRange
    /* JADX INFO: renamed from: f */
    public final Comparable mo7701f() {
        return null;
    }

    public final int hashCode() {
        if (ClosedRange.DefaultImpls.m18651a(this)) {
            return -1;
        }
        throw null;
    }

    @Override // kotlin.ranges.ClosedRange
    public final boolean isEmpty() {
        return ClosedRange.DefaultImpls.m18651a(this);
    }

    public final String toString() {
        return "null..null";
    }
}
