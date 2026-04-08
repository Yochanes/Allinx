package androidx.compose.animation;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/animation/ExitTransitionImpl;", "Landroidx/compose/animation/ExitTransition;", "animation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
final class ExitTransitionImpl extends ExitTransition {

    /* JADX INFO: renamed from: c */
    public final TransitionData f4200c;

    public ExitTransitionImpl(TransitionData transitionData) {
        this.f4200c = transitionData;
    }

    @Override // androidx.compose.animation.ExitTransition
    /* JADX INFO: renamed from: a, reason: from getter */
    public final TransitionData getF4200c() {
        return this.f4200c;
    }
}
