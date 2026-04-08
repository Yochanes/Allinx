package kotlin.ranges;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.ULong;
import kotlin.UnsignedKt;
import kotlin.WasExperimental;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@SinceKotlin
@Metadata(m18301d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00020\u00030\u0004:\u0001\u0005¨\u0006\u0006"}, m18302d2 = {"Lkotlin/ranges/ULongRange;", "Lkotlin/ranges/ULongProgression;", "Lkotlin/ranges/ClosedRange;", "Lkotlin/ULong;", "Lkotlin/ranges/OpenEndRange;", "Companion", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
@WasExperimental
public final class ULongRange extends ULongProgression implements ClosedRange<ULong>, OpenEndRange<ULong> {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlin/ranges/ULongRange$Companion;", "", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static final class Companion {
    }

    static {
        new ULongRange();
    }

    @Override // kotlin.ranges.ClosedRange
    /* JADX INFO: renamed from: e */
    public final Comparable mo7700e() {
        return new ULong(-1L);
    }

    @Override // kotlin.ranges.ULongProgression
    public final boolean equals(Object obj) {
        if (!(obj instanceof ULongRange)) {
            return false;
        }
        if (isEmpty() && ((ULongRange) obj).isEmpty()) {
            return true;
        }
        ULongRange uLongRange = (ULongRange) obj;
        uLongRange.getClass();
        return this.f51703a == uLongRange.f51703a;
    }

    @Override // kotlin.ranges.ClosedRange
    /* JADX INFO: renamed from: f */
    public final Comparable mo7701f() {
        return new ULong(this.f51703a);
    }

    @Override // kotlin.ranges.ULongProgression
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j = this.f51703a;
        return (((int) (-4294967296L)) * 31) + ((int) (j ^ (j >>> 32)));
    }

    @Override // kotlin.ranges.ULongProgression, kotlin.ranges.ClosedRange
    public final boolean isEmpty() {
        return Long.compare(Long.MAX_VALUE, this.f51703a ^ Long.MIN_VALUE) > 0;
    }

    @Override // kotlin.ranges.ULongProgression
    public final String toString() {
        return ((Object) UnsignedKt.m18317b(10, -1L)) + ".." + ((Object) UnsignedKt.m18317b(10, this.f51703a));
    }
}
