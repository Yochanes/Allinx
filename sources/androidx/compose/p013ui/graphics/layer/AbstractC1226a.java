package androidx.compose.p013ui.graphics.layer;

import android.app.Person;
import android.content.Context;
import android.content.LocusId;
import android.content.pm.ShortcutInfo;
import android.content.res.TypedArray;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Insets;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.graphics.text.MeasuredText;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.WindowInsets;
import android.view.contentcapture.ContentCaptureSession;
import androidx.compose.p013ui.window.PopupLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.exchange.allin.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.layer.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1226a {
    /* JADX INFO: renamed from: A */
    public static /* bridge */ /* synthetic */ void m5441A(WindowInsets.Builder builder, Insets insets) {
        builder.setStableInsets(insets);
    }

    /* JADX INFO: renamed from: B */
    public static /* bridge */ /* synthetic */ void m5442B(WindowInsets.Builder builder, Insets insets) {
        builder.setSystemGestureInsets(insets);
    }

    /* JADX INFO: renamed from: C */
    public static /* bridge */ /* synthetic */ void m5443C(WindowInsets.Builder builder, Insets insets) {
        builder.setMandatorySystemGestureInsets(insets);
    }

    /* JADX INFO: renamed from: D */
    public static /* bridge */ /* synthetic */ void m5444D(WindowInsets.Builder builder, Insets insets) {
        builder.setTappableElementInsets(insets);
    }

    /* JADX INFO: renamed from: a */
    public static /* bridge */ /* synthetic */ float m5445a(MotionEvent motionEvent, int i) {
        return motionEvent.getRawX(i);
    }

    /* JADX INFO: renamed from: b */
    public static /* bridge */ /* synthetic */ int m5446b(MotionEvent motionEvent) {
        return motionEvent.getClassification();
    }

    /* JADX INFO: renamed from: c */
    public static /* bridge */ /* synthetic */ LocusId m5447c(ShortcutInfo shortcutInfo) {
        return shortcutInfo.getLocusId();
    }

    /* JADX INFO: renamed from: d */
    public static /* bridge */ /* synthetic */ Insets m5448d(WindowInsets windowInsets) {
        return windowInsets.getTappableElementInsets();
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ WindowInsets.Builder m5449e() {
        return new WindowInsets.Builder();
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ WindowInsets.Builder m5450f(WindowInsets windowInsets) {
        return new WindowInsets.Builder(windowInsets);
    }

    /* JADX INFO: renamed from: g */
    public static /* bridge */ /* synthetic */ WindowInsets m5451g(WindowInsets.Builder builder) {
        return builder.build();
    }

    /* JADX INFO: renamed from: h */
    public static /* bridge */ /* synthetic */ ContentCaptureSession m5452h(Object obj) {
        return (ContentCaptureSession) obj;
    }

    /* JADX INFO: renamed from: i */
    public static /* bridge */ /* synthetic */ void m5453i(ShortcutInfo.Builder builder, LocusId locusId) {
        builder.setLocusId(locusId);
    }

    /* JADX INFO: renamed from: j */
    public static /* bridge */ /* synthetic */ void m5454j(ShortcutInfo.Builder builder, boolean z2) {
        builder.setLongLived(z2);
    }

    /* JADX INFO: renamed from: k */
    public static /* bridge */ /* synthetic */ void m5455k(ShortcutInfo.Builder builder, Person[] personArr) {
        builder.setPersons(personArr);
    }

    /* JADX INFO: renamed from: l */
    public static /* bridge */ /* synthetic */ void m5456l(Canvas canvas, int i, BlendMode blendMode) {
        canvas.drawColor(i, blendMode);
    }

    /* JADX INFO: renamed from: m */
    public static /* bridge */ /* synthetic */ void m5457m(Canvas canvas, long j) {
        canvas.drawColor(j);
    }

    /* JADX INFO: renamed from: n */
    public static /* bridge */ /* synthetic */ void m5458n(Canvas canvas, long j, BlendMode blendMode) {
        canvas.drawColor(j, blendMode);
    }

    /* JADX INFO: renamed from: o */
    public static /* bridge */ /* synthetic */ void m5459o(Canvas canvas, RectF rectF, float f, float f2, RectF rectF2, float f3, float f4, Paint paint) {
        canvas.drawDoubleRoundRect(rectF, f, f2, rectF2, f3, f4, paint);
    }

    /* JADX INFO: renamed from: p */
    public static /* bridge */ /* synthetic */ void m5460p(Canvas canvas, RectF rectF, float[] fArr, RectF rectF2, float[] fArr2, Paint paint) {
        canvas.drawDoubleRoundRect(rectF, fArr, rectF2, fArr2, paint);
    }

    /* JADX INFO: renamed from: q */
    public static /* bridge */ /* synthetic */ void m5461q(Canvas canvas, MeasuredText measuredText, int i, int i2, int i3, int i4, float f, float f2, boolean z2, Paint paint) {
        canvas.drawTextRun(measuredText, i, i2, i3, i4, f, f2, z2, paint);
    }

    /* JADX INFO: renamed from: r */
    public static /* bridge */ /* synthetic */ void m5462r(RenderNode renderNode, float f) {
        renderNode.setTranslationY(f);
    }

    /* JADX INFO: renamed from: s */
    public static /* bridge */ /* synthetic */ void m5463s(RenderNode renderNode, int i) {
        renderNode.setSpotShadowColor(i);
    }

    /* JADX INFO: renamed from: t */
    public static /* bridge */ /* synthetic */ void m5464t(RenderNode renderNode, int i, int i2, int i3, int i4) {
        renderNode.setPosition(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: u */
    public static /* bridge */ /* synthetic */ void m5465u(RenderNode renderNode, boolean z2) {
        renderNode.setClipToBounds(z2);
    }

    /* JADX INFO: renamed from: v */
    public static /* bridge */ /* synthetic */ void m5466v(TextPaint textPaint, CharSequence charSequence, int i, int i2, Rect rect) {
        textPaint.getTextBounds(charSequence, i, i2, rect);
    }

    /* JADX INFO: renamed from: w */
    public static /* bridge */ /* synthetic */ void m5467w(WindowInsets.Builder builder, Insets insets) {
        builder.setSystemWindowInsets(insets);
    }

    /* JADX INFO: renamed from: x */
    public static /* bridge */ /* synthetic */ void m5468x(PopupLayout popupLayout, ArrayList arrayList) {
        popupLayout.setSystemGestureExclusionRects(arrayList);
    }

    /* JADX INFO: renamed from: y */
    public static /* bridge */ /* synthetic */ void m5469y(CoordinatorLayout coordinatorLayout, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray) {
        coordinatorLayout.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, R.attr.coordinatorLayoutStyle, 0);
    }

    /* JADX INFO: renamed from: z */
    public static /* bridge */ /* synthetic */ float m5470z(MotionEvent motionEvent, int i) {
        return motionEvent.getRawY(i);
    }
}
