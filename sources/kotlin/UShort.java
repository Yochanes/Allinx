package kotlin;

import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@SinceKotlin
@Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\b\u0002\n\u0002\u0010\n\n\u0000\b\u0087@\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, m18302d2 = {"Lkotlin/UShort;", "", "Companion", "data", "", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
@JvmInline
@WasExperimental
public final class UShort implements Comparable<UShort> {

    /* JADX INFO: renamed from: a */
    public final short f51455a;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\b¨\u0006\n"}, m18302d2 = {"Lkotlin/UShort$Companion;", "", "Lkotlin/UShort;", "MIN_VALUE", "S", "MAX_VALUE", "", "SIZE_BYTES", "I", "SIZE_BITS", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static final class Companion {
    }

    public /* synthetic */ UShort(short s) {
        this.f51455a = s;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(UShort uShort) {
        return Intrinsics.m18601i(this.f51455a & 65535, uShort.f51455a & 65535);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof UShort) {
            return this.f51455a == ((UShort) obj).f51455a;
        }
        return false;
    }

    public final int hashCode() {
        return Short.hashCode(this.f51455a);
    }

    public final String toString() {
        return String.valueOf(65535 & this.f51455a);
    }
}
