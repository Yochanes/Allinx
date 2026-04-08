package androidx.compose.animation.core;

import androidx.compose.p013ui.geometry.Size;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m18302d2 = {"<anonymous>", "Landroidx/compose/animation/core/AnimationVector2D;", "it", "Landroidx/compose/ui/geometry/Size;", "invoke-uvyYCjk", "(J)Landroidx/compose/animation/core/AnimationVector2D;"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class VectorConvertersKt$SizeToVector$1 extends Lambda implements Function1<Size, AnimationVector2D> {

    /* JADX INFO: renamed from: a */
    public static final VectorConvertersKt$SizeToVector$1 f4711a = new VectorConvertersKt$SizeToVector$1(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        long j = ((Size) obj).f17538a;
        return new AnimationVector2D(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
    }
}
