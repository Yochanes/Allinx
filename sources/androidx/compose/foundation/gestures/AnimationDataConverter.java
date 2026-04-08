package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationVector4D;
import androidx.compose.animation.core.TwoWayConverter;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, m18302d2 = {"Landroidx/compose/foundation/gestures/AnimationDataConverter;", "Landroidx/compose/animation/core/TwoWayConverter;", "Landroidx/compose/foundation/gestures/AnimationData;", "Landroidx/compose/animation/core/AnimationVector4D;", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
final class AnimationDataConverter implements TwoWayConverter<AnimationData, AnimationVector4D> {
    @Override // androidx.compose.animation.core.TwoWayConverter
    /* JADX INFO: renamed from: a */
    public final Function1 mo2376a() {
        return AnimationDataConverter$convertToVector$1.f5418a;
    }

    @Override // androidx.compose.animation.core.TwoWayConverter
    /* JADX INFO: renamed from: b */
    public final Function1 mo2377b() {
        return AnimationDataConverter$convertFromVector$1.f5417a;
    }
}
