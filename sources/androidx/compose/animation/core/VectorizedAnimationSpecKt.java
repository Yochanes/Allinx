package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"animation-core_release"}, m18303k = 2, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class VectorizedAnimationSpecKt {

    /* JADX INFO: renamed from: a */
    public static final int[] f4713a = new int[0];

    /* JADX INFO: renamed from: b */
    public static final float[] f4714b = new float[0];

    /* JADX INFO: renamed from: c */
    public static final ArcSpline f4715c = new ArcSpline(new int[2], new float[2], new float[][]{new float[2], new float[2]});

    /* JADX INFO: renamed from: a */
    public static final long m2380a(VectorizedDurationBasedAnimationSpec vectorizedDurationBasedAnimationSpec, long j) {
        long f4749a = j - ((long) vectorizedDurationBasedAnimationSpec.getF4749a());
        long jMo2384c = vectorizedDurationBasedAnimationSpec.mo2384c();
        if (f4749a < 0) {
            f4749a = 0;
        }
        return f4749a > jMo2384c ? jMo2384c : f4749a;
    }
}
