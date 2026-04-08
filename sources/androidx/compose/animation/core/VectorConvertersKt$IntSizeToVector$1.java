package androidx.compose.animation.core;

import androidx.compose.p013ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m18302d2 = {"<anonymous>", "Landroidx/compose/animation/core/AnimationVector2D;", "it", "Landroidx/compose/ui/unit/IntSize;", "invoke-ozmzZPI", "(J)Landroidx/compose/animation/core/AnimationVector2D;"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class VectorConvertersKt$IntSizeToVector$1 extends Lambda implements Function1<IntSize, AnimationVector2D> {

    /* JADX INFO: renamed from: a */
    public static final VectorConvertersKt$IntSizeToVector$1 f4703a = new VectorConvertersKt$IntSizeToVector$1(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        long j = ((IntSize) obj).f20568a;
        return new AnimationVector2D((int) (j >> 32), (int) (j & 4294967295L));
    }
}
