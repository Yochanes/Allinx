package androidx.compose.animation.core;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/animation/core/RepeatableSpec;", "T", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "animation-core_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class RepeatableSpec<T> implements FiniteAnimationSpec<T> {

    /* JADX INFO: renamed from: a */
    public final TweenSpec f4481a;

    /* JADX INFO: renamed from: b */
    public final RepeatMode f4482b;

    /* JADX INFO: renamed from: c */
    public final long f4483c;

    public RepeatableSpec(TweenSpec tweenSpec, RepeatMode repeatMode, long j) {
        this.f4481a = tweenSpec;
        this.f4482b = repeatMode;
        this.f4483c = j;
    }

    @Override // androidx.compose.animation.core.AnimationSpec
    /* JADX INFO: renamed from: a */
    public final VectorizedAnimationSpec mo2273a(TwoWayConverter twoWayConverter) {
        new VectorizedRepeatableSpec(this.f4481a.mo2273a(twoWayConverter), this.f4482b, this.f4483c);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof RepeatableSpec) {
            RepeatableSpec repeatableSpec = (RepeatableSpec) obj;
            repeatableSpec.getClass();
            if (repeatableSpec.f4481a.equals(this.f4481a) && repeatableSpec.f4482b == this.f4482b && repeatableSpec.f4483c == this.f4483c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f4483c) + ((this.f4482b.hashCode() + (this.f4481a.hashCode() * 31)) * 31);
    }
}
