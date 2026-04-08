package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/animation/core/InfiniteRepeatableSpec;", "T", "Landroidx/compose/animation/core/AnimationSpec;", "animation-core_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class InfiniteRepeatableSpec<T> implements AnimationSpec<T> {

    /* JADX INFO: renamed from: a */
    public final DurationBasedAnimationSpec f4416a;

    /* JADX INFO: renamed from: b */
    public final RepeatMode f4417b;

    /* JADX INFO: renamed from: c */
    public final long f4418c;

    public InfiniteRepeatableSpec(DurationBasedAnimationSpec durationBasedAnimationSpec, RepeatMode repeatMode, long j) {
        this.f4416a = durationBasedAnimationSpec;
        this.f4417b = repeatMode;
        this.f4418c = j;
    }

    @Override // androidx.compose.animation.core.AnimationSpec
    /* JADX INFO: renamed from: a */
    public final VectorizedAnimationSpec mo2273a(TwoWayConverter twoWayConverter) {
        return new VectorizedInfiniteRepeatableSpec(this.f4416a.mo2273a(twoWayConverter), this.f4417b, this.f4418c);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof InfiniteRepeatableSpec) {
            InfiniteRepeatableSpec infiniteRepeatableSpec = (InfiniteRepeatableSpec) obj;
            if (infiniteRepeatableSpec.f4416a.equals(this.f4416a) && infiniteRepeatableSpec.f4417b == this.f4417b && infiniteRepeatableSpec.f4418c == this.f4418c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f4418c) + ((this.f4417b.hashCode() + (this.f4416a.hashCode() * 31)) * 31);
    }
}
