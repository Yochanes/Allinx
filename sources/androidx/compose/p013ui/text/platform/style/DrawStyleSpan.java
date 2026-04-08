package androidx.compose.p013ui.text.platform.style;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import androidx.compose.p013ui.graphics.AndroidPathEffect;
import androidx.compose.p013ui.graphics.PathEffect;
import androidx.compose.p013ui.graphics.drawscope.DrawStyle;
import androidx.compose.p013ui.graphics.drawscope.Fill;
import androidx.compose.p013ui.graphics.drawscope.Stroke;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/ui/text/platform/style/DrawStyleSpan;", "Landroid/text/style/CharacterStyle;", "Landroid/text/style/UpdateAppearance;", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class DrawStyleSpan extends CharacterStyle implements UpdateAppearance {

    /* JADX INFO: renamed from: a */
    public final DrawStyle f20507a;

    public DrawStyleSpan(DrawStyle drawStyle) {
        this.f20507a = drawStyle;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        if (textPaint != null) {
            Fill fill = Fill.f17783a;
            DrawStyle drawStyle = this.f20507a;
            if (Intrinsics.m18594b(drawStyle, fill)) {
                textPaint.setStyle(Paint.Style.FILL);
                return;
            }
            if (drawStyle instanceof Stroke) {
                textPaint.setStyle(Paint.Style.STROKE);
                Stroke stroke = (Stroke) drawStyle;
                textPaint.setStrokeWidth(stroke.f17784a);
                textPaint.setStrokeMiter(stroke.f17785b);
                int i = stroke.f17787d;
                textPaint.setStrokeJoin(i == 0 ? Paint.Join.MITER : i == 1 ? Paint.Join.ROUND : i == 2 ? Paint.Join.BEVEL : Paint.Join.MITER);
                int i2 = stroke.f17786c;
                textPaint.setStrokeCap(i2 == 0 ? Paint.Cap.BUTT : i2 == 1 ? Paint.Cap.ROUND : i2 == 2 ? Paint.Cap.SQUARE : Paint.Cap.BUTT);
                PathEffect pathEffect = stroke.f17788e;
                textPaint.setPathEffect(pathEffect != null ? ((AndroidPathEffect) pathEffect).f17559a : null);
            }
        }
    }
}
