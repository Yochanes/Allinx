package kotlin.random;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b \u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlin/random/AbstractPlatformRandom;", "Lkotlin/random/Random;", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
@SourceDebugExtension
public abstract class AbstractPlatformRandom extends Random {
    @Override // kotlin.random.Random
    /* JADX INFO: renamed from: a */
    public final int mo18643a(int i) {
        return ((-i) >> 31) & (mo18647g().nextInt() >>> (32 - i));
    }

    @Override // kotlin.random.Random
    /* JADX INFO: renamed from: c */
    public final byte[] mo18644c(byte[] array) {
        Intrinsics.m18599g(array, "array");
        mo18647g().nextBytes(array);
        return array;
    }

    @Override // kotlin.random.Random
    /* JADX INFO: renamed from: d */
    public final int mo18645d() {
        return mo18647g().nextInt();
    }

    @Override // kotlin.random.Random
    /* JADX INFO: renamed from: e */
    public final int mo18646e(int i) {
        return mo18647g().nextInt(i);
    }

    /* JADX INFO: renamed from: g */
    public abstract java.util.Random mo18647g();
}
