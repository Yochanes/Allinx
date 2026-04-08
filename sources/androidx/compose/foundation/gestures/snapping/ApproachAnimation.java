package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.foundation.gestures.ScrollScope;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\bb\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, m18302d2 = {"Landroidx/compose/foundation/gestures/snapping/ApproachAnimation;", "T", "Landroidx/compose/animation/core/AnimationVector;", "V", "", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
interface ApproachAnimation<T, V extends AnimationVector> {
    /* JADX INFO: renamed from: a */
    Object mo2682a(ScrollScope scrollScope, Float f, Float f2, Function1 function1, Continuation continuation);
}
