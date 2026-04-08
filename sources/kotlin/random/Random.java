package kotlin.random;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.internal.PlatformImplementationsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@SinceKotlin
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b'\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Lkotlin/random/Random;", "", "Default", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
@SourceDebugExtension
public abstract class Random {

    /* JADX INFO: renamed from: a */
    public static final Random f51669a = PlatformImplementationsKt.f51610a.m18566b();

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001\u0006R\u0014\u0010\u0004\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, m18302d2 = {"Lkotlin/random/Random$Default;", "Lkotlin/random/Random;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "defaultRandom", "Lkotlin/random/Random;", "Serialized", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static final class Default extends Random implements Serializable {

        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, m18302d2 = {"Lkotlin/random/Random$Default$Serialized;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final class Serialized implements Serializable {
        }

        @Override // kotlin.random.Random
        /* JADX INFO: renamed from: a */
        public final int mo18643a(int i) {
            return Random.f51669a.mo18643a(i);
        }

        @Override // kotlin.random.Random
        /* JADX INFO: renamed from: b */
        public final byte[] mo18648b(int i, byte[] array) {
            Intrinsics.m18599g(array, "array");
            return Random.f51669a.mo18648b(i, array);
        }

        @Override // kotlin.random.Random
        /* JADX INFO: renamed from: c */
        public final byte[] mo18644c(byte[] array) {
            Intrinsics.m18599g(array, "array");
            return Random.f51669a.mo18644c(array);
        }

        @Override // kotlin.random.Random
        /* JADX INFO: renamed from: d */
        public final int mo18645d() {
            return Random.f51669a.mo18645d();
        }

        @Override // kotlin.random.Random
        /* JADX INFO: renamed from: e */
        public final int mo18646e(int i) {
            return Random.f51669a.mo18646e(i);
        }

        @Override // kotlin.random.Random
        /* JADX INFO: renamed from: f */
        public final int mo18649f(int i) {
            return Random.f51669a.mo18649f(i);
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract int mo18643a(int i);

    /* JADX INFO: renamed from: b */
    public byte[] mo18648b(int i, byte[] array) {
        Intrinsics.m18599g(array, "array");
        if (array.length < 0 || i < 0 || i > array.length) {
            throw new IllegalArgumentException(AbstractC0000a.m17n(AbstractC0000a.m20q(i, "fromIndex (0) or toIndex (", ") are out of range: 0.."), array.length, '.').toString());
        }
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC0000a.m10g(i, "fromIndex (0) must be not greater than toIndex (", ").").toString());
        }
        int i2 = i / 4;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            int iMo18645d = mo18645d();
            array[i3] = (byte) iMo18645d;
            array[i3 + 1] = (byte) (iMo18645d >>> 8);
            array[i3 + 2] = (byte) (iMo18645d >>> 16);
            array[i3 + 3] = (byte) (iMo18645d >>> 24);
            i3 += 4;
        }
        int i5 = i - i3;
        int iMo18643a = mo18643a(i5 * 8);
        for (int i6 = 0; i6 < i5; i6++) {
            array[i3 + i6] = (byte) (iMo18643a >>> (i6 * 8));
        }
        return array;
    }

    /* JADX INFO: renamed from: c */
    public byte[] mo18644c(byte[] array) {
        Intrinsics.m18599g(array, "array");
        return mo18648b(array.length, array);
    }

    /* JADX INFO: renamed from: d */
    public int mo18645d() {
        return mo18643a(32);
    }

    /* JADX INFO: renamed from: e */
    public int mo18646e(int i) {
        return mo18649f(i);
    }

    /* JADX INFO: renamed from: f */
    public int mo18649f(int i) {
        int iMo18645d;
        int i2;
        if (i <= 0) {
            throw new IllegalArgumentException(("Random range is empty: [" + ((Object) 0) + ", " + Integer.valueOf(i) + ").").toString());
        }
        if (i > 0 || i == Integer.MIN_VALUE) {
            if (((-i) & i) == i) {
                return mo18643a(31 - Integer.numberOfLeadingZeros(i));
            }
            do {
                iMo18645d = mo18645d() >>> 1;
                i2 = iMo18645d % i;
            } while ((i - 1) + (iMo18645d - i2) < 0);
            return i2;
        }
        while (true) {
            int iMo18645d2 = mo18645d();
            if (iMo18645d2 >= 0 && iMo18645d2 < i) {
                return iMo18645d2;
            }
        }
    }
}
