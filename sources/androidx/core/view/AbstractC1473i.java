package androidx.core.view;

import android.graphics.Insets;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import android.view.WindowInsetsController;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.Interpolator;

/* JADX INFO: renamed from: androidx.core.view.i */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1473i {
    /* JADX INFO: renamed from: A */
    public static /* bridge */ /* synthetic */ int m8079A() {
        return WindowInsets.Type.mandatorySystemGestures();
    }

    /* JADX INFO: renamed from: B */
    public static /* bridge */ /* synthetic */ void m8080B(WindowInsetsController windowInsetsController) {
        windowInsetsController.setSystemBarsAppearance(0, 16);
    }

    /* JADX INFO: renamed from: C */
    public static /* bridge */ /* synthetic */ int m8081C() {
        return WindowInsets.Type.tappableElement();
    }

    /* JADX INFO: renamed from: D */
    public static /* bridge */ /* synthetic */ int m8082D() {
        return WindowInsets.Type.displayCutout();
    }

    /* JADX INFO: renamed from: a */
    public static /* bridge */ /* synthetic */ float m8083a(WindowInsetsAnimation windowInsetsAnimation) {
        return windowInsetsAnimation.getInterpolatedFraction();
    }

    /* JADX INFO: renamed from: b */
    public static /* bridge */ /* synthetic */ int m8084b() {
        return WindowInsets.Type.statusBars();
    }

    /* JADX INFO: renamed from: c */
    public static /* bridge */ /* synthetic */ int m8085c(WindowInsetsController windowInsetsController) {
        return windowInsetsController.getSystemBarsAppearance();
    }

    /* JADX INFO: renamed from: d */
    public static /* bridge */ /* synthetic */ Insets m8086d(WindowInsets windowInsets, int i) {
        return windowInsets.getInsetsIgnoringVisibility(i);
    }

    /* JADX INFO: renamed from: e */
    public static /* bridge */ /* synthetic */ Insets m8087e(WindowInsetsAnimation.Bounds bounds) {
        return bounds.getUpperBound();
    }

    /* JADX INFO: renamed from: f */
    public static /* bridge */ /* synthetic */ WindowInsets m8088f() {
        return WindowInsets.CONSUMED;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ WindowInsetsAnimation.Bounds m8089g(Insets insets, Insets insets2) {
        return new WindowInsetsAnimation.Bounds(insets, insets2);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ WindowInsetsAnimation m8090h(int i, Interpolator interpolator, long j) {
        return new WindowInsetsAnimation(i, interpolator, j);
    }

    /* JADX INFO: renamed from: i */
    public static /* bridge */ /* synthetic */ WindowInsetsAnimation m8091i(Object obj) {
        return (WindowInsetsAnimation) obj;
    }

    /* JADX INFO: renamed from: j */
    public static /* bridge */ /* synthetic */ WindowInsetsController m8092j(Window window) {
        return window.getInsetsController();
    }

    /* JADX INFO: renamed from: k */
    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo.AccessibilityAction m8093k() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD;
    }

    /* JADX INFO: renamed from: l */
    public static /* bridge */ /* synthetic */ void m8094l(View view, WindowInsetsAnimation$Callback windowInsetsAnimation$Callback) {
        view.setWindowInsetsAnimationCallback(windowInsetsAnimation$Callback);
    }

    /* JADX INFO: renamed from: m */
    public static /* bridge */ /* synthetic */ void m8095m(WindowInsets.Builder builder, int i, Insets insets) {
        builder.setInsets(i, insets);
    }

    /* JADX INFO: renamed from: n */
    public static /* bridge */ /* synthetic */ void m8096n(WindowInsetsController windowInsetsController) {
        windowInsetsController.setSystemBarsAppearance(0, 0);
    }

    /* JADX INFO: renamed from: o */
    public static /* bridge */ /* synthetic */ void m8097o(WindowInsetsController windowInsetsController, int i) {
        windowInsetsController.setSystemBarsBehavior(i);
    }

    /* JADX INFO: renamed from: p */
    public static /* bridge */ /* synthetic */ boolean m8098p(WindowInsets windowInsets, int i) {
        return windowInsets.isVisible(i);
    }

    /* JADX INFO: renamed from: q */
    public static /* bridge */ /* synthetic */ int m8099q() {
        return WindowInsets.Type.navigationBars();
    }

    /* JADX INFO: renamed from: r */
    public static /* bridge */ /* synthetic */ int m8100r(WindowInsetsController windowInsetsController) {
        return windowInsetsController.getSystemBarsBehavior();
    }

    /* JADX INFO: renamed from: s */
    public static /* bridge */ /* synthetic */ Insets m8101s(WindowInsets windowInsets, int i) {
        return windowInsets.getInsets(i);
    }

    /* JADX INFO: renamed from: t */
    public static /* bridge */ /* synthetic */ Insets m8102t(WindowInsetsAnimation.Bounds bounds) {
        return bounds.getLowerBound();
    }

    /* JADX INFO: renamed from: u */
    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo.AccessibilityAction m8103u() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
    }

    /* JADX INFO: renamed from: v */
    public static /* bridge */ /* synthetic */ void m8104v(WindowInsetsController windowInsetsController) {
        windowInsetsController.setSystemBarsAppearance(8, 8);
    }

    /* JADX INFO: renamed from: w */
    public static /* bridge */ /* synthetic */ int m8105w() {
        return WindowInsets.Type.captionBar();
    }

    /* JADX INFO: renamed from: x */
    public static /* bridge */ /* synthetic */ void m8106x(WindowInsetsController windowInsetsController) {
        windowInsetsController.setSystemBarsAppearance(0, 8);
    }

    /* JADX INFO: renamed from: y */
    public static /* bridge */ /* synthetic */ int m8107y() {
        return WindowInsets.Type.systemGestures();
    }

    /* JADX INFO: renamed from: z */
    public static /* bridge */ /* synthetic */ void m8108z(WindowInsetsController windowInsetsController) {
        windowInsetsController.setSystemBarsAppearance(16, 16);
    }
}
