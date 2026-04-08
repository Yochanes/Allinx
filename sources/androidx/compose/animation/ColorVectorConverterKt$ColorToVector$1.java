package androidx.compose.animation;

import androidx.compose.animation.core.AnimationVector4D;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.graphics.ColorKt;
import androidx.compose.p013ui.graphics.colorspace.ColorSpace;
import androidx.compose.p013ui.graphics.colorspace.ColorSpaces;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m18302d2 = {"<anonymous>", "Landroidx/compose/animation/core/TwoWayConverter;", "Landroidx/compose/ui/graphics/Color;", "Landroidx/compose/animation/core/AnimationVector4D;", "colorSpace", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "invoke"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class ColorVectorConverterKt$ColorToVector$1 extends Lambda implements Function1<ColorSpace, TwoWayConverter<Color, AnimationVector4D>> {

    /* JADX INFO: renamed from: a */
    public static final ColorVectorConverterKt$ColorToVector$1 f4085a = new ColorVectorConverterKt$ColorToVector$1(1);

    /* JADX INFO: renamed from: androidx.compose.animation.ColorVectorConverterKt$ColorToVector$1$1 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m18302d2 = {"<anonymous>", "Landroidx/compose/animation/core/AnimationVector4D;", "color", "Landroidx/compose/ui/graphics/Color;", "invoke-8_81llA", "(J)Landroidx/compose/animation/core/AnimationVector4D;"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
    @SourceDebugExtension
    final class C04451 extends Lambda implements Function1<Color, AnimationVector4D> {

        /* JADX INFO: renamed from: a */
        public static final C04451 f4086a = new C04451(1);

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            long jM5179a = Color.m5179a(((Color) obj).f17585a, ColorSpaces.f17716x);
            return new AnimationVector4D(Color.m5182d(jM5179a), Color.m5186h(jM5179a), Color.m5185g(jM5179a), Color.m5183e(jM5179a));
        }
    }

    /* JADX INFO: renamed from: androidx.compose.animation.ColorVectorConverterKt$ColorToVector$1$2 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m18302d2 = {"<anonymous>", "Landroidx/compose/ui/graphics/Color;", "vector", "Landroidx/compose/animation/core/AnimationVector4D;", "invoke-vNxB06k", "(Landroidx/compose/animation/core/AnimationVector4D;)J"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
    @SourceDebugExtension
    final class C04462 extends Lambda implements Function1<AnimationVector4D, Color> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ColorSpace f4087a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C04462(ColorSpace colorSpace) {
            super(1);
            this.f4087a = colorSpace;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            AnimationVector4D animationVector4D = (AnimationVector4D) obj;
            float f = animationVector4D.f4363b;
            if (f < 0.0f) {
                f = 0.0f;
            }
            if (f > 1.0f) {
                f = 1.0f;
            }
            float f2 = animationVector4D.f4364c;
            if (f2 < -0.5f) {
                f2 = -0.5f;
            }
            if (f2 > 0.5f) {
                f2 = 0.5f;
            }
            float f3 = animationVector4D.f4365d;
            float f4 = f3 >= -0.5f ? f3 : -0.5f;
            float f5 = f4 <= 0.5f ? f4 : 0.5f;
            float f6 = animationVector4D.f4362a;
            float f7 = f6 >= 0.0f ? f6 : 0.0f;
            return new Color(Color.m5179a(ColorKt.m5192a(f, f2, f5, f7 <= 1.0f ? f7 : 1.0f, ColorSpaces.f17716x), this.f4087a));
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return VectorConvertersKt.m2378a(C04451.f4086a, new C04462((ColorSpace) obj));
    }
}
