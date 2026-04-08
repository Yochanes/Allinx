package kotlin;

import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@SinceKotlin
@Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, m18302d2 = {"Lkotlin/UInt;", "", "Companion", "data", "", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
@JvmInline
@WasExperimental
public final class UInt implements Comparable<UInt> {

    /* JADX INFO: renamed from: a */
    public final int f51446a;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004¨\u0006\t"}, m18302d2 = {"Lkotlin/UInt$Companion;", "", "Lkotlin/UInt;", "MIN_VALUE", "I", "MAX_VALUE", "", "SIZE_BYTES", "SIZE_BITS", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static final class Companion {
    }

    public /* synthetic */ UInt(int i) {
        this.f51446a = i;
    }

    /* JADX INFO: renamed from: a */
    public static String m18315a(int i) {
        return String.valueOf(((long) i) & 4294967295L);
    }

    @Override // java.lang.Comparable
    public final int compareTo(UInt uInt) {
        return Intrinsics.m18601i(this.f51446a ^ Integer.MIN_VALUE, uInt.f51446a ^ Integer.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof UInt) {
            return this.f51446a == ((UInt) obj).f51446a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f51446a);
    }

    public final String toString() {
        return m18315a(this.f51446a);
    }
}
