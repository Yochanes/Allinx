package p011a;

import android.app.Activity;
import android.graphics.RectF;
import android.graphics.text.LineBreakConfig;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.icu.text.DateFormat;
import android.provider.MediaStore;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityManager$AccessibilityServicesStateChangeListener;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorBoundsInfo;
import android.view.inputmethod.InputMethodManager;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.ComponentDialog;
import androidx.appcompat.app.C0084d;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: a.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0024a {
    /* JADX INFO: renamed from: A */
    public static /* bridge */ /* synthetic */ DateFormat.HourCycle[] m75A() {
        return DateFormat.HourCycle.values();
    }

    /* JADX INFO: renamed from: B */
    public static /* bridge */ /* synthetic */ LineBreakConfig.Builder m76B(LineBreakConfig.Builder builder, int i) {
        return builder.setLineBreakWordStyle(i);
    }

    /* JADX INFO: renamed from: C */
    public static /* bridge */ /* synthetic */ CameraCharacteristics.Key m77C() {
        return CameraCharacteristics.REQUEST_AVAILABLE_DYNAMIC_RANGE_PROFILES;
    }

    /* JADX INFO: renamed from: D */
    public static /* bridge */ /* synthetic */ EditorBoundsInfo.Builder m78D(EditorBoundsInfo.Builder builder, RectF rectF) {
        return builder.setHandwritingBounds(rectF);
    }

    /* JADX INFO: renamed from: a */
    public static /* bridge */ /* synthetic */ int m79a() {
        return MediaStore.getPickImagesMaxLimit();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ LineBreakConfig.Builder m80b() {
        return new LineBreakConfig.Builder();
    }

    /* JADX INFO: renamed from: c */
    public static /* bridge */ /* synthetic */ LineBreakConfig.Builder m81c(LineBreakConfig.Builder builder, int i) {
        return builder.setLineBreakStyle(i);
    }

    /* JADX INFO: renamed from: d */
    public static /* bridge */ /* synthetic */ LineBreakConfig m82d(LineBreakConfig.Builder builder) {
        return builder.build();
    }

    /* JADX INFO: renamed from: e */
    public static /* bridge */ /* synthetic */ CameraCharacteristics.Key m83e() {
        return CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES;
    }

    /* JADX INFO: renamed from: f */
    public static /* bridge */ /* synthetic */ DynamicRangeProfiles m84f(Object obj) {
        return (DynamicRangeProfiles) obj;
    }

    /* JADX INFO: renamed from: g */
    public static /* bridge */ /* synthetic */ BoringLayout.Metrics m85g(CharSequence charSequence, TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic) {
        return BoringLayout.isBoring(charSequence, textPaint, textDirectionHeuristic, true, null);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ BoringLayout m86h(CharSequence charSequence, TextPaint textPaint, int i, Layout.Alignment alignment, BoringLayout.Metrics metrics, boolean z2, TextUtils.TruncateAt truncateAt, int i2) {
        return new BoringLayout(charSequence, textPaint, i, alignment, 1.0f, 0.0f, metrics, z2, truncateAt, i2, true);
    }

    /* JADX INFO: renamed from: i */
    public static /* bridge */ /* synthetic */ AccessibilityManager$AccessibilityServicesStateChangeListener m87i(Object obj) {
        return (AccessibilityManager$AccessibilityServicesStateChangeListener) obj;
    }

    /* JADX INFO: renamed from: j */
    public static /* bridge */ /* synthetic */ CursorAnchorInfo.Builder m88j(CursorAnchorInfo.Builder builder, EditorBoundsInfo editorBoundsInfo) {
        return builder.setEditorBoundsInfo(editorBoundsInfo);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ EditorBoundsInfo.Builder m89k() {
        return new EditorBoundsInfo.Builder();
    }

    /* JADX INFO: renamed from: l */
    public static /* bridge */ /* synthetic */ EditorBoundsInfo.Builder m90l(EditorBoundsInfo.Builder builder, RectF rectF) {
        return builder.setEditorBounds(rectF);
    }

    /* JADX INFO: renamed from: m */
    public static /* bridge */ /* synthetic */ EditorBoundsInfo m91m(EditorBoundsInfo.Builder builder) {
        return builder.build();
    }

    /* JADX INFO: renamed from: n */
    public static /* bridge */ /* synthetic */ OnBackInvokedCallback m92n(Object obj) {
        return (OnBackInvokedCallback) obj;
    }

    /* JADX INFO: renamed from: o */
    public static /* bridge */ /* synthetic */ OnBackInvokedDispatcher m93o(Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }

    /* JADX INFO: renamed from: p */
    public static /* bridge */ /* synthetic */ OnBackInvokedDispatcher m94p(ComponentDialog componentDialog) {
        return componentDialog.getOnBackInvokedDispatcher();
    }

    /* JADX INFO: renamed from: q */
    public static /* bridge */ /* synthetic */ OnBackInvokedDispatcher m95q(Object obj) {
        return (OnBackInvokedDispatcher) obj;
    }

    /* JADX INFO: renamed from: r */
    public static /* bridge */ /* synthetic */ List m96r(View view) {
        return view.getPreferKeepClearRects();
    }

    /* JADX INFO: renamed from: s */
    public static /* bridge */ /* synthetic */ Set m97s(DynamicRangeProfiles dynamicRangeProfiles) {
        return dynamicRangeProfiles.getSupportedProfiles();
    }

    /* JADX INFO: renamed from: t */
    public static /* bridge */ /* synthetic */ void m98t(StaticLayout.Builder builder, LineBreakConfig lineBreakConfig) {
        builder.setLineBreakConfig(lineBreakConfig);
    }

    /* JADX INFO: renamed from: u */
    public static /* bridge */ /* synthetic */ void m99u(View view, List list) {
        view.setPreferKeepClearRects(list);
    }

    /* JADX INFO: renamed from: v */
    public static /* bridge */ /* synthetic */ void m100v(InputMethodManager inputMethodManager, View view) {
        inputMethodManager.startStylusHandwriting(view);
    }

    /* JADX INFO: renamed from: w */
    public static /* bridge */ /* synthetic */ void m101w(OnBackInvokedDispatcher onBackInvokedDispatcher, OnBackInvokedCallback onBackInvokedCallback) {
        onBackInvokedDispatcher.unregisterOnBackInvokedCallback(onBackInvokedCallback);
    }

    /* JADX INFO: renamed from: x */
    public static /* bridge */ /* synthetic */ void m102x(OnBackInvokedDispatcher onBackInvokedDispatcher, C0084d c0084d) {
        onBackInvokedDispatcher.registerOnBackInvokedCallback(1000000, c0084d);
    }

    /* JADX INFO: renamed from: y */
    public static /* bridge */ /* synthetic */ boolean m103y(BoringLayout boringLayout) {
        return boringLayout.isFallbackLineSpacingEnabled();
    }

    /* JADX INFO: renamed from: z */
    public static /* bridge */ /* synthetic */ boolean m104z(StaticLayout staticLayout) {
        return staticLayout.isFallbackLineSpacingEnabled();
    }
}
