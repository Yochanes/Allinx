package androidx.compose.p013ui.text.style;

import androidx.compose.p013ui.graphics.Brush;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.graphics.ShaderBrush;
import androidx.compose.p013ui.graphics.SolidColor;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, m18302d2 = {"Landroidx/compose/ui/text/style/TextForegroundStyle;", "", "Companion", "Unspecified", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public interface TextForegroundStyle {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/text/style/TextForegroundStyle$Companion;", "", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        /* JADX INFO: renamed from: a */
        public static TextForegroundStyle m6606a(Brush brush, float f) {
            if (brush == null) {
                return Unspecified.f20538a;
            }
            if (brush instanceof SolidColor) {
                return m6607b(TextDrawStyleKt.m6603b(f, ((SolidColor) brush).f17675a));
            }
            if (brush instanceof ShaderBrush) {
                return new BrushStyle((ShaderBrush) brush, f);
            }
            throw new NoWhenBranchMatchedException();
        }

        /* JADX INFO: renamed from: b */
        public static TextForegroundStyle m6607b(long j) {
            return j != 16 ? new ColorStyle(j) : Unspecified.f20538a;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/text/style/TextForegroundStyle$Unspecified;", "Landroidx/compose/ui/text/style/TextForegroundStyle;", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Unspecified implements TextForegroundStyle {

        /* JADX INFO: renamed from: a */
        public static final Unspecified f20538a = new Unspecified();

        @Override // androidx.compose.p013ui.text.style.TextForegroundStyle
        /* JADX INFO: renamed from: a */
        public final float getF20515b() {
            return Float.NaN;
        }

        @Override // androidx.compose.p013ui.text.style.TextForegroundStyle
        /* JADX INFO: renamed from: c */
        public final long getF20516a() {
            int i = Color.f17584l;
            return Color.f17583k;
        }

        @Override // androidx.compose.p013ui.text.style.TextForegroundStyle
        /* JADX INFO: renamed from: e */
        public final Brush mo6593e() {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    float getF20515b();

    /* JADX INFO: renamed from: b */
    default TextForegroundStyle m6604b(Function0 function0) {
        return !equals(Unspecified.f20538a) ? this : (TextForegroundStyle) function0.invoke();
    }

    /* JADX INFO: renamed from: c */
    long getF20516a();

    /* JADX INFO: renamed from: d */
    default TextForegroundStyle m6605d(TextForegroundStyle textForegroundStyle) {
        boolean z2 = textForegroundStyle instanceof BrushStyle;
        if (!z2 || !(this instanceof BrushStyle)) {
            return (!z2 || (this instanceof BrushStyle)) ? (z2 || !(this instanceof BrushStyle)) ? textForegroundStyle.m6604b(new TextForegroundStyle$merge$2(this)) : this : textForegroundStyle;
        }
        BrushStyle brushStyle = (BrushStyle) textForegroundStyle;
        TextForegroundStyle$merge$1 textForegroundStyle$merge$1 = new TextForegroundStyle$merge$1(this);
        float fFloatValue = ((BrushStyle) textForegroundStyle).f20515b;
        if (Float.isNaN(fFloatValue)) {
            fFloatValue = ((Number) textForegroundStyle$merge$1.invoke()).floatValue();
        }
        return new BrushStyle(brushStyle.f20514a, fFloatValue);
    }

    /* JADX INFO: renamed from: e */
    Brush mo6593e();
}
