package androidx.compose.animation.core;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/animation/core/TweenSpec;", "T", "Landroidx/compose/animation/core/DurationBasedAnimationSpec;", "animation-core_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class TweenSpec<T> implements DurationBasedAnimationSpec<T> {

    /* JADX INFO: renamed from: a */
    public final int f4681a;

    /* JADX INFO: renamed from: b */
    public final int f4682b;

    /* JADX INFO: renamed from: c */
    public final Easing f4683c;

    public TweenSpec(int i, Easing easing, int i2) {
        this((i2 & 1) != 0 ? 300 : i, 0, (i2 & 4) != 0 ? EasingKt.f4402a : easing);
    }

    @Override // androidx.compose.animation.core.AnimationSpec
    /* JADX INFO: renamed from: a */
    public final VectorizedAnimationSpec mo2273a(TwoWayConverter twoWayConverter) {
        return new VectorizedTweenSpec(this.f4681a, this.f4682b, this.f4683c);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof TweenSpec) {
            TweenSpec tweenSpec = (TweenSpec) obj;
            if (tweenSpec.f4681a == this.f4681a && tweenSpec.f4682b == this.f4682b && Intrinsics.m18594b(tweenSpec.f4683c, this.f4683c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f4683c.hashCode() + (this.f4681a * 31)) * 31) + this.f4682b;
    }

    @Override // androidx.compose.animation.core.DurationBasedAnimationSpec, androidx.compose.animation.core.AnimationSpec
    /* JADX INFO: renamed from: a */
    public final VectorizedDurationBasedAnimationSpec mo2273a(TwoWayConverter twoWayConverter) {
        return new VectorizedTweenSpec(this.f4681a, this.f4682b, this.f4683c);
    }

    public TweenSpec(int i, int i2, Easing easing) {
        this.f4681a = i;
        this.f4682b = i2;
        this.f4683c = easing;
    }
}
