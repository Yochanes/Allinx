package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationVector;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004¨\u0006\u0005"}, m18302d2 = {"Landroidx/compose/foundation/gestures/snapping/AnimationResult;", "T", "Landroidx/compose/animation/core/AnimationVector;", "V", "", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
final class AnimationResult<T, V extends AnimationVector> {

    /* JADX INFO: renamed from: a */
    public final Float f6143a;

    /* JADX INFO: renamed from: b */
    public final AnimationState f6144b;

    public AnimationResult(Float f, AnimationState animationState) {
        this.f6143a = f;
        this.f6144b = animationState;
    }
}
