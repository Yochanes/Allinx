package kotlin.ranges;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.UInt;
import kotlin.WasExperimental;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@SinceKotlin
@Metadata(m18301d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00020\u00030\u0004:\u0001\u0005¨\u0006\u0006"}, m18302d2 = {"Lkotlin/ranges/UIntRange;", "Lkotlin/ranges/UIntProgression;", "Lkotlin/ranges/ClosedRange;", "Lkotlin/UInt;", "Lkotlin/ranges/OpenEndRange;", "Companion", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
@WasExperimental
public final class UIntRange extends UIntProgression implements ClosedRange<UInt>, OpenEndRange<UInt> {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlin/ranges/UIntRange$Companion;", "", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static final class Companion {
    }

    static {
        new UIntRange();
    }

    @Override // kotlin.ranges.ClosedRange
    /* JADX INFO: renamed from: e */
    public final Comparable mo7700e() {
        return new UInt(-1);
    }

    @Override // kotlin.ranges.UIntProgression
    public final boolean equals(Object obj) {
        if (!(obj instanceof UIntRange)) {
            return false;
        }
        if (isEmpty() && ((UIntRange) obj).isEmpty()) {
            return true;
        }
        UIntRange uIntRange = (UIntRange) obj;
        uIntRange.getClass();
        return this.f51697a == uIntRange.f51697a;
    }

    @Override // kotlin.ranges.ClosedRange
    /* JADX INFO: renamed from: f */
    public final Comparable mo7701f() {
        return new UInt(this.f51697a);
    }

    @Override // kotlin.ranges.UIntProgression
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (-31) + this.f51697a;
    }

    @Override // kotlin.ranges.UIntProgression, kotlin.ranges.ClosedRange
    public final boolean isEmpty() {
        return Integer.compare(Integer.MAX_VALUE, this.f51697a ^ Integer.MIN_VALUE) > 0;
    }

    @Override // kotlin.ranges.UIntProgression
    public final String toString() {
        return ((Object) UInt.m18315a(-1)) + ".." + ((Object) UInt.m18315a(this.f51697a));
    }
}
