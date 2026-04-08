package androidx.compose.animation;

import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.p013ui.graphics.TransformOrigin;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m18302d2 = {"<anonymous>", "Landroidx/compose/animation/core/AnimationVector2D;", "it", "Landroidx/compose/ui/graphics/TransformOrigin;", "invoke-__ExYCQ", "(J)Landroidx/compose/animation/core/AnimationVector2D;"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class EnterExitTransitionKt$TransformOriginVectorConverter$1 extends Lambda implements Function1<TransformOrigin, AnimationVector2D> {

    /* JADX INFO: renamed from: a */
    public static final EnterExitTransitionKt$TransformOriginVectorConverter$1 f4134a = new EnterExitTransitionKt$TransformOriginVectorConverter$1(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        long j = ((TransformOrigin) obj).f17680a;
        return new AnimationVector2D(TransformOrigin.m5249b(j), TransformOrigin.m5250c(j));
    }
}
