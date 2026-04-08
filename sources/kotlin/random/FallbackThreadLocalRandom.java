package kotlin.random;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlin/random/FallbackThreadLocalRandom;", "Lkotlin/random/AbstractPlatformRandom;", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
public final class FallbackThreadLocalRandom extends AbstractPlatformRandom {

    /* JADX INFO: renamed from: b */
    public final FallbackThreadLocalRandom$implStorage$1 f51668b = new FallbackThreadLocalRandom$implStorage$1();

    @Override // kotlin.random.AbstractPlatformRandom
    /* JADX INFO: renamed from: g */
    public final java.util.Random mo18647g() {
        java.util.Random random = this.f51668b.get();
        Intrinsics.m18598f(random, "get(...)");
        return random;
    }
}
