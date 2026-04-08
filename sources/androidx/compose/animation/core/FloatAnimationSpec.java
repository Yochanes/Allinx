package androidx.compose.animation.core;

import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0003"}, m18302d2 = {"Landroidx/compose/animation/core/FloatAnimationSpec;", "Landroidx/compose/animation/core/AnimationSpec;", "", "animation-core_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public interface FloatAnimationSpec extends AnimationSpec<Float> {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class DefaultImpls {
    }

    @Override // androidx.compose.animation.core.AnimationSpec
    /* JADX INFO: renamed from: a */
    /* bridge */ /* synthetic */ default VectorizedAnimationSpec mo2273a(TwoWayConverter twoWayConverter) {
        return m2294b();
    }

    /* JADX INFO: renamed from: b */
    default VectorizedFloatAnimationSpec m2294b() {
        return new VectorizedFloatAnimationSpec(this);
    }

    /* JADX INFO: renamed from: c */
    long mo2295c(float f, float f2, float f3);

    /* JADX INFO: renamed from: d */
    float mo2296d(float f, float f2, float f3, long j);

    /* JADX INFO: renamed from: e */
    default float mo2297e(float f, float f2, float f3) {
        return mo2296d(f, f2, f3, mo2295c(f, f2, f3));
    }

    /* JADX INFO: renamed from: f */
    float mo2298f(float f, float f2, float f3, long j);
}
