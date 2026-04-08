package androidx.compose.animation;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/animation/EnterTransitionImpl;", "Landroidx/compose/animation/EnterTransition;", "animation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
final class EnterTransitionImpl extends EnterTransition {

    /* JADX INFO: renamed from: b */
    public final TransitionData f4197b;

    public EnterTransitionImpl(TransitionData transitionData) {
        this.f4197b = transitionData;
    }

    @Override // androidx.compose.animation.EnterTransition
    /* JADX INFO: renamed from: a, reason: from getter */
    public final TransitionData getF4197b() {
        return this.f4197b;
    }
}
