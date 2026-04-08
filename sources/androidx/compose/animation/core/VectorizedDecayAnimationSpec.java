package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, m18302d2 = {"Landroidx/compose/animation/core/VectorizedDecayAnimationSpec;", "Landroidx/compose/animation/core/AnimationVector;", "V", "", "animation-core_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public interface VectorizedDecayAnimationSpec<V extends AnimationVector> {
    /* JADX INFO: renamed from: a */
    float mo2381a();

    /* JADX INFO: renamed from: b */
    AnimationVector mo2382b(long j, AnimationVector animationVector, AnimationVector animationVector2);

    /* JADX INFO: renamed from: c */
    AnimationVector mo2383c(long j, AnimationVector animationVector, AnimationVector animationVector2);
}
