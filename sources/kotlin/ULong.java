package kotlin;

import kotlin.jvm.JvmInline;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@SinceKotlin
@Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0087@\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, m18302d2 = {"Lkotlin/ULong;", "", "Companion", "data", "", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
@JvmInline
@WasExperimental
public final class ULong implements Comparable<ULong> {

    /* JADX INFO: renamed from: a */
    public final long f51450a;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\b¨\u0006\n"}, m18302d2 = {"Lkotlin/ULong$Companion;", "", "Lkotlin/ULong;", "MIN_VALUE", "J", "MAX_VALUE", "", "SIZE_BYTES", "I", "SIZE_BITS", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static final class Companion {
    }

    public /* synthetic */ ULong(long j) {
        this.f51450a = j;
    }

    @Override // java.lang.Comparable
    public final int compareTo(ULong uLong) {
        long j = uLong.f51450a;
        long j2 = this.f51450a ^ Long.MIN_VALUE;
        long j3 = j ^ Long.MIN_VALUE;
        if (j2 < j3) {
            return -1;
        }
        return j2 == j3 ? 0 : 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ULong) {
            return this.f51450a == ((ULong) obj).f51450a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f51450a);
    }

    public final String toString() {
        return UnsignedKt.m18317b(10, this.f51450a);
    }
}
