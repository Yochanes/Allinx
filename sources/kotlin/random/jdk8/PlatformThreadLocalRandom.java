package kotlin.random.jdk8;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.AbstractPlatformRandom;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlin/random/jdk8/PlatformThreadLocalRandom;", "Lkotlin/random/AbstractPlatformRandom;", "kotlin-stdlib-jdk8"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
public final class PlatformThreadLocalRandom extends AbstractPlatformRandom {
    @Override // kotlin.random.Random
    /* JADX INFO: renamed from: f */
    public final int mo18649f(int i) {
        return ThreadLocalRandom.current().nextInt(0, i);
    }

    @Override // kotlin.random.AbstractPlatformRandom
    /* JADX INFO: renamed from: g */
    public final Random mo18647g() {
        ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
        Intrinsics.m18598f(threadLocalRandomCurrent, "current(...)");
        return threadLocalRandomCurrent;
    }
}
