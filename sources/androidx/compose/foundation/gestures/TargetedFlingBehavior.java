package androidx.compose.foundation.gestures;

import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Stable
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, m18302d2 = {"Landroidx/compose/foundation/gestures/TargetedFlingBehavior;", "Landroidx/compose/foundation/gestures/FlingBehavior;", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public interface TargetedFlingBehavior extends FlingBehavior {
    @Override // androidx.compose.foundation.gestures.FlingBehavior
    /* JADX INFO: renamed from: a */
    default Object mo2598a(ScrollScope scrollScope, float f, Continuation continuation) {
        Function1 function1 = TargetedFlingBehaviorKt.f6061a;
        return mo2669b(scrollScope, f, TargetedFlingBehaviorKt$NoOnReport$1.f6062a, (ContinuationImpl) continuation);
    }

    /* JADX INFO: renamed from: b */
    Object mo2669b(ScrollScope scrollScope, float f, Function1 function1, ContinuationImpl continuationImpl);
}
