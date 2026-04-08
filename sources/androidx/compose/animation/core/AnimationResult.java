package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004¨\u0006\u0005"}, m18302d2 = {"Landroidx/compose/animation/core/AnimationResult;", "T", "Landroidx/compose/animation/core/AnimationVector;", "V", "", "animation-core_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class AnimationResult<T, V extends AnimationVector> {

    /* JADX INFO: renamed from: a */
    public final AnimationState f4339a;

    /* JADX INFO: renamed from: b */
    public final AnimationEndReason f4340b;

    public AnimationResult(AnimationState animationState, AnimationEndReason animationEndReason) {
        this.f4339a = animationState;
        this.f4340b = animationEndReason;
    }

    public final String toString() {
        return "AnimationResult(endReason=" + this.f4340b + ", endState=" + this.f4339a + ')';
    }
}
