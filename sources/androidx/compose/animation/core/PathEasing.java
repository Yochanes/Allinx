package androidx.compose.animation.core;

import androidx.compose.p013ui.graphics.IntervalTree;
import androidx.compose.p013ui.graphics.PathIterator;
import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/animation/core/PathEasing;", "Landroidx/compose/animation/core/Easing;", "animation-core_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class PathEasing implements Easing {
    @Override // androidx.compose.animation.core.Easing
    /* JADX INFO: renamed from: c */
    public final float mo39c(float f) {
        if (f <= 0.0f) {
            return 0.0f;
        }
        if (f >= 1.0f) {
            return 1.0f;
        }
        new IntervalTree();
        PathIterator.ConicEvaluation[] conicEvaluationArr = PathIterator.ConicEvaluation.f17619a;
        throw null;
    }
}
