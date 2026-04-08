package kotlin.ranges;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00020\u00030\u0004:\u0001\u0005¨\u0006\u0006"}, m18302d2 = {"Lkotlin/ranges/CharRange;", "Lkotlin/ranges/CharProgression;", "Lkotlin/ranges/ClosedRange;", "", "Lkotlin/ranges/OpenEndRange;", "Companion", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
public final class CharRange extends CharProgression implements ClosedRange<Character>, OpenEndRange<Character> {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlin/ranges/CharRange$Companion;", "", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static final class Companion {
    }

    static {
        new CharRange((char) 1, (char) 0);
    }

    @Override // kotlin.ranges.ClosedRange
    /* JADX INFO: renamed from: e */
    public final Comparable mo7700e() {
        return Character.valueOf(this.f51676a);
    }

    @Override // kotlin.ranges.CharProgression
    public final boolean equals(Object obj) {
        if (!(obj instanceof CharRange)) {
            return false;
        }
        if (isEmpty() && ((CharRange) obj).isEmpty()) {
            return true;
        }
        CharRange charRange = (CharRange) obj;
        return this.f51676a == charRange.f51676a && this.f51677b == charRange.f51677b;
    }

    @Override // kotlin.ranges.ClosedRange
    /* JADX INFO: renamed from: f */
    public final Comparable mo7701f() {
        return Character.valueOf(this.f51677b);
    }

    @Override // kotlin.ranges.CharProgression
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f51676a * 31) + this.f51677b;
    }

    @Override // kotlin.ranges.CharProgression, kotlin.ranges.ClosedRange
    public final boolean isEmpty() {
        return Intrinsics.m18601i(this.f51676a, this.f51677b) > 0;
    }

    @Override // kotlin.ranges.CharProgression
    public final String toString() {
        return this.f51676a + ".." + this.f51677b;
    }
}
