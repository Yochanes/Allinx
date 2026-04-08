package kotlin.random;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Lkotlin/random/KotlinRandom;", "Ljava/util/Random;", "Companion", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
final class KotlinRandom extends java.util.Random {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m18302d2 = {"Lkotlin/random/KotlinRandom$Companion;", "", "", "serialVersionUID", "J", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static final class Companion {
    }

    @Override // java.util.Random
    public final int next(int i) {
        throw null;
    }

    @Override // java.util.Random
    public final boolean nextBoolean() {
        throw null;
    }

    @Override // java.util.Random
    public final void nextBytes(byte[] bytes) {
        Intrinsics.m18599g(bytes, "bytes");
        throw null;
    }

    @Override // java.util.Random
    public final double nextDouble() {
        throw null;
    }

    @Override // java.util.Random
    public final float nextFloat() {
        throw null;
    }

    @Override // java.util.Random
    public final int nextInt() {
        throw null;
    }

    @Override // java.util.Random
    public final long nextLong() {
        throw null;
    }

    @Override // java.util.Random
    public final void setSeed(long j) {
        throw new UnsupportedOperationException("Setting seed is not supported.");
    }

    @Override // java.util.Random
    public final int nextInt(int i) {
        throw null;
    }
}
