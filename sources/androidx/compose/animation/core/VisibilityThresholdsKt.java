package androidx.compose.animation.core;

import androidx.compose.p013ui.geometry.Rect;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"animation-core_release"}, m18303k = 2, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class VisibilityThresholdsKt {

    /* JADX INFO: renamed from: a */
    public static final Rect f4755a;

    /* JADX INFO: renamed from: b */
    public static final Object f4756b;

    static {
        Float fValueOf = Float.valueOf(0.5f);
        f4755a = new Rect(0.5f, 0.5f, 0.5f, 0.5f);
        TwoWayConverter twoWayConverter = VectorConvertersKt.f4687b;
        Float fValueOf2 = Float.valueOf(1.0f);
        f4756b = MapsKt.m18486i(new Pair(twoWayConverter, fValueOf2), new Pair(VectorConvertersKt.f4693h, fValueOf2), new Pair(VectorConvertersKt.f4692g, fValueOf2), new Pair(VectorConvertersKt.f4686a, Float.valueOf(0.01f)), new Pair(VectorConvertersKt.f4694i, fValueOf), new Pair(VectorConvertersKt.f4690e, fValueOf), new Pair(VectorConvertersKt.f4691f, fValueOf), new Pair(VectorConvertersKt.f4688c, Float.valueOf(0.1f)), new Pair(VectorConvertersKt.f4689d, Float.valueOf(0.1f)));
    }

    /* JADX INFO: renamed from: a */
    public static final long m2393a() {
        long j = 1;
        return (j & 4294967295L) | (j << 32);
    }

    /* JADX INFO: renamed from: b */
    public static final long m2394b() {
        return (((long) Float.floatToRawIntBits(0.5f)) << 32) | (((long) Float.floatToRawIntBits(0.5f)) & 4294967295L);
    }

    /* JADX INFO: renamed from: c */
    public static final long m2395c() {
        long j = 1;
        return (j & 4294967295L) | (j << 32);
    }
}
