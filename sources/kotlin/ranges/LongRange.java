package kotlin.ranges;

import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00020\u00030\u0004:\u0001\u0005¨\u0006\u0006"}, m18302d2 = {"Lkotlin/ranges/LongRange;", "Lkotlin/ranges/LongProgression;", "Lkotlin/ranges/ClosedRange;", "", "Lkotlin/ranges/OpenEndRange;", "Companion", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
public final class LongRange extends LongProgression implements ClosedRange<Long>, OpenEndRange<Long> {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlin/ranges/LongRange$Companion;", "", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static final class Companion {
    }

    @Override // kotlin.ranges.ClosedRange
    /* JADX INFO: renamed from: e */
    public final Comparable mo7700e() {
        return 0L;
    }

    @Override // kotlin.ranges.LongProgression
    public final boolean equals(Object obj) {
        if (!(obj instanceof LongRange)) {
            return false;
        }
        if (isEmpty() && ((LongRange) obj).isEmpty()) {
            return true;
        }
        ((LongRange) obj).getClass();
        return 0 == 0 && 0 == 0;
    }

    @Override // kotlin.ranges.ClosedRange
    /* JADX INFO: renamed from: f */
    public final Comparable mo7701f() {
        return 0L;
    }

    @Override // kotlin.ranges.LongProgression
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (int) ((((long) 31) * (0 ^ (0 >>> 32))) + (0 ^ (0 >>> 32)));
    }

    @Override // kotlin.ranges.LongProgression, kotlin.ranges.ClosedRange
    public final boolean isEmpty() {
        return 0 > 0;
    }

    @Override // kotlin.ranges.LongProgression
    public final String toString() {
        return "0..0";
    }
}
