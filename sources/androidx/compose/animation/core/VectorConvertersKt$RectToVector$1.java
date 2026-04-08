package androidx.compose.animation.core;

import androidx.compose.p013ui.geometry.Rect;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m18302d2 = {"<anonymous>", "Landroidx/compose/animation/core/AnimationVector4D;", "it", "Landroidx/compose/ui/geometry/Rect;", "invoke"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class VectorConvertersKt$RectToVector$1 extends Lambda implements Function1<Rect, AnimationVector4D> {

    /* JADX INFO: renamed from: a */
    public static final VectorConvertersKt$RectToVector$1 f4709a = new VectorConvertersKt$RectToVector$1(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Rect rect = (Rect) obj;
        return new AnimationVector4D(rect.f17526a, rect.f17527b, rect.f17528c, rect.f17529d);
    }
}
