package p011a;

import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.Canvas;
import android.graphics.Insets;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.os.CancellationSignal;
import android.os.ext.SdkExtensions;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimationControlListener;
import android.view.WindowInsetsAnimationController;
import android.view.WindowInsetsController;
import androidx.core.view.WindowInsetsControllerOnControllableInsetsChangedListenerC1470f;
import java.util.List;

/* JADX INFO: renamed from: a.b */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0025b {
    /* JADX INFO: renamed from: A */
    public static /* bridge */ /* synthetic */ Insets m105A(WindowInsetsAnimationController windowInsetsAnimationController) {
        return windowInsetsAnimationController.getHiddenStateInsets();
    }

    /* JADX INFO: renamed from: B */
    public static /* bridge */ /* synthetic */ void m106B(WindowInsetsController windowInsetsController, int i) {
        windowInsetsController.hide(i);
    }

    /* JADX INFO: renamed from: C */
    public static /* bridge */ /* synthetic */ void m107C(WindowInsetsController windowInsetsController, WindowInsetsControllerOnControllableInsetsChangedListenerC1470f windowInsetsControllerOnControllableInsetsChangedListenerC1470f) {
        windowInsetsController.removeOnControllableInsetsChangedListener(windowInsetsControllerOnControllableInsetsChangedListenerC1470f);
    }

    /* JADX INFO: renamed from: D */
    public static /* bridge */ /* synthetic */ Insets m108D(WindowInsetsAnimationController windowInsetsAnimationController) {
        return windowInsetsAnimationController.getShownStateInsets();
    }

    /* JADX INFO: renamed from: a */
    public static /* bridge */ /* synthetic */ float m109a(WindowInsetsAnimation windowInsetsAnimation) {
        return windowInsetsAnimation.getFraction();
    }

    /* JADX INFO: renamed from: b */
    public static /* bridge */ /* synthetic */ int m110b() {
        return SdkExtensions.getExtensionVersion(30);
    }

    /* JADX INFO: renamed from: c */
    public static /* bridge */ /* synthetic */ int m111c(WindowInsetsAnimation windowInsetsAnimation) {
        return windowInsetsAnimation.getTypeMask();
    }

    /* JADX INFO: renamed from: d */
    public static /* bridge */ /* synthetic */ long m112d(WindowInsetsAnimation windowInsetsAnimation) {
        return windowInsetsAnimation.getDurationMillis();
    }

    /* JADX INFO: renamed from: e */
    public static /* bridge */ /* synthetic */ Insets m113e(WindowInsetsAnimationController windowInsetsAnimationController) {
        return windowInsetsAnimationController.getCurrentInsets();
    }

    /* JADX INFO: renamed from: f */
    public static /* bridge */ /* synthetic */ CameraCharacteristics.Key m114f() {
        return CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE;
    }

    /* JADX INFO: renamed from: g */
    public static /* bridge */ /* synthetic */ CaptureRequest.Key m115g() {
        return CaptureRequest.CONTROL_ZOOM_RATIO;
    }

    /* JADX INFO: renamed from: h */
    public static /* bridge */ /* synthetic */ WindowInsetsAnimationControlListener m116h(Object obj) {
        return (WindowInsetsAnimationControlListener) obj;
    }

    /* JADX INFO: renamed from: i */
    public static /* bridge */ /* synthetic */ WindowInsetsAnimationController m117i(Object obj) {
        return (WindowInsetsAnimationController) obj;
    }

    /* JADX INFO: renamed from: j */
    public static /* bridge */ /* synthetic */ WindowInsetsController m118j(View view) {
        return view.getWindowInsetsController();
    }

    /* JADX INFO: renamed from: k */
    public static /* bridge */ /* synthetic */ List m119k(ShortcutManager shortcutManager) {
        return shortcutManager.getShortcuts(8);
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m120l() {
    }

    /* JADX INFO: renamed from: m */
    public static /* bridge */ /* synthetic */ void m121m(ShortcutInfo shortcutInfo) {
        shortcutInfo.isCached();
    }

    /* JADX INFO: renamed from: n */
    public static /* bridge */ /* synthetic */ void m122n(ShortcutManager shortcutManager, ShortcutInfo shortcutInfo) {
        shortcutManager.pushDynamicShortcut(shortcutInfo);
    }

    /* JADX INFO: renamed from: o */
    public static /* bridge */ /* synthetic */ void m123o(Outline outline, Path path) {
        outline.setPath(path);
    }

    /* JADX INFO: renamed from: p */
    public static /* bridge */ /* synthetic */ void m124p(WindowInsetsAnimation windowInsetsAnimation, float f) {
        windowInsetsAnimation.setFraction(f);
    }

    /* JADX INFO: renamed from: q */
    public static /* bridge */ /* synthetic */ void m125q(WindowInsetsAnimationController windowInsetsAnimationController, Insets insets) {
        windowInsetsAnimationController.setInsetsAndAlpha(insets, 1.0f, 0.0f);
    }

    /* JADX INFO: renamed from: r */
    public static /* bridge */ /* synthetic */ void m126r(WindowInsetsAnimationController windowInsetsAnimationController, boolean z2) {
        windowInsetsAnimationController.finish(z2);
    }

    /* JADX INFO: renamed from: s */
    public static /* bridge */ /* synthetic */ void m127s(WindowInsetsController windowInsetsController, int i) {
        windowInsetsController.show(i);
    }

    /* JADX INFO: renamed from: t */
    public static /* bridge */ /* synthetic */ void m128t(WindowInsetsController windowInsetsController, int i, CancellationSignal cancellationSignal, WindowInsetsAnimationControlListener windowInsetsAnimationControlListener) {
        windowInsetsController.controlWindowInsetsAnimation(i, -1L, null, cancellationSignal, windowInsetsAnimationControlListener);
    }

    /* JADX INFO: renamed from: u */
    public static /* bridge */ /* synthetic */ void m129u(WindowInsetsController windowInsetsController, WindowInsetsControllerOnControllableInsetsChangedListenerC1470f windowInsetsControllerOnControllableInsetsChangedListenerC1470f) {
        windowInsetsController.addOnControllableInsetsChangedListener(windowInsetsControllerOnControllableInsetsChangedListenerC1470f);
    }

    /* JADX INFO: renamed from: v */
    public static /* bridge */ /* synthetic */ boolean m130v(Canvas canvas, float f, float f2, float f3, float f4) {
        return canvas.quickReject(f, f2, f3, f4);
    }

    /* JADX INFO: renamed from: w */
    public static /* bridge */ /* synthetic */ boolean m131w(Canvas canvas, Path path) {
        return canvas.quickReject(path);
    }

    /* JADX INFO: renamed from: x */
    public static /* bridge */ /* synthetic */ boolean m132x(Canvas canvas, RectF rectF) {
        return canvas.quickReject(rectF);
    }

    /* JADX INFO: renamed from: y */
    public static /* bridge */ /* synthetic */ boolean m133y(WindowInsetsAnimationController windowInsetsAnimationController) {
        return windowInsetsAnimationController.isReady();
    }

    /* JADX INFO: renamed from: z */
    public static /* bridge */ /* synthetic */ int m134z() {
        return WindowInsets.Type.ime();
    }
}
