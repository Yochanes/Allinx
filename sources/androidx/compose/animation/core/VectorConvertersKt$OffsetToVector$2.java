package androidx.compose.animation.core;

import androidx.compose.p013ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m18302d2 = {"<anonymous>", "Landroidx/compose/ui/geometry/Offset;", "it", "Landroidx/compose/animation/core/AnimationVector2D;", "invoke-tuRUvjQ", "(Landroidx/compose/animation/core/AnimationVector2D;)J"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class VectorConvertersKt$OffsetToVector$2 extends Lambda implements Function1<AnimationVector2D, Offset> {

    /* JADX INFO: renamed from: a */
    public static final VectorConvertersKt$OffsetToVector$2 f4708a = new VectorConvertersKt$OffsetToVector$2(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        AnimationVector2D animationVector2D = (AnimationVector2D) obj;
        float f = animationVector2D.f4357a;
        float f2 = animationVector2D.f4358b;
        return new Offset((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L));
    }
}
