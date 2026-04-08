package androidx.camera.camera2.internal;

import android.content.ClipData;
import android.graphics.Canvas;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.graphics.fonts.Font;
import android.hardware.camera2.CameraCharacteristics;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.p012os.OutcomeReceiver;
import android.view.ContentInfo;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import android.view.ScrollCaptureTarget;
import android.view.Surface;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.translation.TranslationRequestValue;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import androidx.compose.p013ui.platform.AndroidComposeView;
import androidx.compose.p013ui.text.AnnotatedString;

/* JADX INFO: renamed from: androidx.camera.camera2.internal.C */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0157C {
    /* JADX INFO: renamed from: A */
    public static /* bridge */ /* synthetic */ void m834A(ContentInfo.Builder builder, Bundle bundle) {
        builder.setExtras(bundle);
    }

    /* JADX INFO: renamed from: B */
    public static /* bridge */ /* synthetic */ void m835B(ScrollCaptureTarget scrollCaptureTarget, Rect rect) {
        scrollCaptureTarget.setScrollBounds(rect);
    }

    /* JADX INFO: renamed from: C */
    public static /* bridge */ /* synthetic */ void m836C(View view, RenderEffect renderEffect) {
        view.setRenderEffect(renderEffect);
    }

    /* JADX INFO: renamed from: D */
    public static /* bridge */ /* synthetic */ void m837D(ViewTranslationRequest.Builder builder, TranslationRequestValue translationRequestValue) {
        builder.setValue("android:text", translationRequestValue);
    }

    /* JADX INFO: renamed from: a */
    public static /* bridge */ /* synthetic */ ClipData m838a(ContentInfo contentInfo) {
        return contentInfo.getClip();
    }

    /* JADX INFO: renamed from: b */
    public static /* bridge */ /* synthetic */ RenderEffect m839b() {
        return RenderEffect.createOffsetEffect(0.0f, 0.0f);
    }

    /* JADX INFO: renamed from: c */
    public static /* bridge */ /* synthetic */ RenderEffect m840c(float f, float f2) {
        return RenderEffect.createOffsetEffect(f, f2);
    }

    /* JADX INFO: renamed from: d */
    public static /* bridge */ /* synthetic */ RenderEffect m841d(float f, float f2, Shader.TileMode tileMode) {
        return RenderEffect.createBlurEffect(f, f2, tileMode);
    }

    /* JADX INFO: renamed from: e */
    public static /* bridge */ /* synthetic */ CameraCharacteristics.Key m842e() {
        return CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP_MAXIMUM_RESOLUTION;
    }

    /* JADX INFO: renamed from: f */
    public static /* bridge */ /* synthetic */ OutcomeReceiver m843f(Object obj) {
        return (OutcomeReceiver) obj;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ ContentInfo.Builder m844g(ClipData clipData, int i) {
        return new ContentInfo.Builder(clipData, i);
    }

    /* JADX INFO: renamed from: h */
    public static /* bridge */ /* synthetic */ ContentInfo m845h(ContentInfo.Builder builder) {
        return builder.build();
    }

    /* JADX INFO: renamed from: i */
    public static /* bridge */ /* synthetic */ ContentInfo m846i(Object obj) {
        return (ContentInfo) obj;
    }

    /* JADX INFO: renamed from: j */
    public static /* bridge */ /* synthetic */ ScrollCaptureSession m847j(Object obj) {
        return (ScrollCaptureSession) obj;
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ ScrollCaptureTarget m848k(AndroidComposeView androidComposeView, Rect rect, Point point, ScrollCaptureCallback scrollCaptureCallback) {
        return new ScrollCaptureTarget(androidComposeView, rect, point, scrollCaptureCallback);
    }

    /* JADX INFO: renamed from: l */
    public static /* bridge */ /* synthetic */ Surface m849l(ScrollCaptureSession scrollCaptureSession) {
        return scrollCaptureSession.getSurface();
    }

    /* JADX INFO: renamed from: m */
    public static /* bridge */ /* synthetic */ TranslationRequestValue m850m(AnnotatedString annotatedString) {
        return TranslationRequestValue.forText(annotatedString);
    }

    /* JADX INFO: renamed from: n */
    public static /* bridge */ /* synthetic */ TranslationResponseValue m851n(ViewTranslationResponse viewTranslationResponse) {
        return viewTranslationResponse.getValue("android:text");
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ ViewTranslationRequest.Builder m852o(AutofillId autofillId, long j) {
        return new ViewTranslationRequest.Builder(autofillId, j);
    }

    /* JADX INFO: renamed from: p */
    public static /* bridge */ /* synthetic */ ViewTranslationRequest m853p(ViewTranslationRequest.Builder builder) {
        return builder.build();
    }

    /* JADX INFO: renamed from: q */
    public static /* bridge */ /* synthetic */ ViewTranslationResponse m854q(Object obj) {
        return (ViewTranslationResponse) obj;
    }

    /* JADX INFO: renamed from: r */
    public static /* bridge */ /* synthetic */ CharSequence m855r(TranslationResponseValue translationResponseValue) {
        return translationResponseValue.getText();
    }

    /* JADX INFO: renamed from: s */
    public static /* bridge */ /* synthetic */ String m856s() {
        return Build.SOC_MODEL;
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ void m857t() {
    }

    /* JADX INFO: renamed from: u */
    public static /* bridge */ /* synthetic */ void m858u(Canvas canvas, NinePatch ninePatch, Rect rect, Paint paint) {
        canvas.drawPatch(ninePatch, rect, paint);
    }

    /* JADX INFO: renamed from: v */
    public static /* bridge */ /* synthetic */ void m859v(Canvas canvas, NinePatch ninePatch, RectF rectF, Paint paint) {
        canvas.drawPatch(ninePatch, rectF, paint);
    }

    /* JADX INFO: renamed from: w */
    public static /* bridge */ /* synthetic */ void m860w(Canvas canvas, int[] iArr, int i, float[] fArr, int i2, int i3, Font font, Paint paint) {
        canvas.drawGlyphs(iArr, i, fArr, i2, i3, font, paint);
    }

    /* JADX INFO: renamed from: x */
    public static /* bridge */ /* synthetic */ void m861x(RenderNode renderNode, RenderEffect renderEffect) {
        renderNode.setRenderEffect(renderEffect);
    }

    /* JADX INFO: renamed from: y */
    public static /* bridge */ /* synthetic */ void m862y(ContentInfo.Builder builder, int i) {
        builder.setFlags(i);
    }

    /* JADX INFO: renamed from: z */
    public static /* bridge */ /* synthetic */ void m863z(ContentInfo.Builder builder, Uri uri) {
        builder.setLinkUri(uri);
    }
}
