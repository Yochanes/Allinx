package androidx.compose.animation;

import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.p013ui.graphics.TransformOrigin;
import androidx.compose.p013ui.graphics.TransformOriginKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m18302d2 = {"<anonymous>", "Landroidx/compose/ui/graphics/TransformOrigin;", "it", "Landroidx/compose/animation/core/AnimationVector2D;", "invoke-LIALnN8", "(Landroidx/compose/animation/core/AnimationVector2D;)J"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class EnterExitTransitionKt$TransformOriginVectorConverter$2 extends Lambda implements Function1<AnimationVector2D, TransformOrigin> {

    /* JADX INFO: renamed from: a */
    public static final EnterExitTransitionKt$TransformOriginVectorConverter$2 f4135a = new EnterExitTransitionKt$TransformOriginVectorConverter$2(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        AnimationVector2D animationVector2D = (AnimationVector2D) obj;
        return new TransformOrigin(TransformOriginKt.m5252a(animationVector2D.f4357a, animationVector2D.f4358b));
    }
}
