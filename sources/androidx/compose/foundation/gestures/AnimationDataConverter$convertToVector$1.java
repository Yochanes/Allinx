package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationVector4D;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m18302d2 = {"<anonymous>", "Landroidx/compose/animation/core/AnimationVector4D;", "it", "Landroidx/compose/foundation/gestures/AnimationData;", "invoke"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
final class AnimationDataConverter$convertToVector$1 extends Lambda implements Function1<AnimationData, AnimationVector4D> {

    /* JADX INFO: renamed from: a */
    public static final AnimationDataConverter$convertToVector$1 f5418a = new AnimationDataConverter$convertToVector$1(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        AnimationData animationData = (AnimationData) obj;
        float f = animationData.f5414a;
        long j = animationData.f5415b;
        return new AnimationVector4D(f, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), animationData.f5416c);
    }
}
