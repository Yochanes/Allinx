package kotlin.ranges;

import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00020\u00030\u0004:\u0001\u0005¨\u0006\u0006"}, m18302d2 = {"Lkotlin/ranges/IntRange;", "Lkotlin/ranges/IntProgression;", "Lkotlin/ranges/ClosedRange;", "", "Lkotlin/ranges/OpenEndRange;", "Companion", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
public final class IntRange extends IntProgression implements ClosedRange<Integer>, OpenEndRange<Integer> {

    /* JADX INFO: renamed from: d */
    public static final IntRange f51692d = new IntRange(1, 0, 1);

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlin/ranges/IntRange$Companion;", "", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static final class Companion {
    }

    @Override // kotlin.ranges.ClosedRange
    /* JADX INFO: renamed from: e */
    public final Comparable mo7700e() {
        return Integer.valueOf(this.f51685a);
    }

    @Override // kotlin.ranges.IntProgression
    public final boolean equals(Object obj) {
        if (!(obj instanceof IntRange)) {
            return false;
        }
        if (isEmpty() && ((IntRange) obj).isEmpty()) {
            return true;
        }
        IntRange intRange = (IntRange) obj;
        if (this.f51685a == intRange.f51685a) {
            return this.f51686b == intRange.f51686b;
        }
        return false;
    }

    @Override // kotlin.ranges.ClosedRange
    /* JADX INFO: renamed from: f */
    public final Comparable mo7701f() {
        return Integer.valueOf(this.f51686b);
    }

    @Override // kotlin.ranges.IntProgression
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f51685a * 31) + this.f51686b;
    }

    @Override // kotlin.ranges.IntProgression, kotlin.ranges.ClosedRange
    public final boolean isEmpty() {
        return this.f51685a > this.f51686b;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m18653j(int i) {
        return this.f51685a <= i && i <= this.f51686b;
    }

    @Override // kotlin.ranges.IntProgression
    public final String toString() {
        return this.f51685a + ".." + this.f51686b;
    }
}
