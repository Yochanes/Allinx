package androidx.compose.animation.core;

import androidx.compose.p013ui.unit.C1338Dp;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m18302d2 = {"<anonymous>", "Landroidx/compose/animation/core/AnimationVector1D;", "it", "Landroidx/compose/ui/unit/Dp;", "invoke-0680j_4", "(F)Landroidx/compose/animation/core/AnimationVector1D;"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class VectorConvertersKt$DpToVector$1 extends Lambda implements Function1<C1338Dp, AnimationVector1D> {

    /* JADX INFO: renamed from: a */
    public static final VectorConvertersKt$DpToVector$1 f4697a = new VectorConvertersKt$DpToVector$1(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new AnimationVector1D(((C1338Dp) obj).f20559a);
    }
}
