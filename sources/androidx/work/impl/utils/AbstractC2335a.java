package androidx.work.impl.utils;

import android.app.ApplicationExitInfo;
import android.content.res.Resources;
import android.content.res.loader.ResourcesLoader;
import android.content.res.loader.ResourcesProvider;
import android.graphics.Bitmap;
import android.graphics.Insets;
import android.graphics.Rect;
import android.media.MediaMetadataRetriever;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.Os;
import android.util.SparseArray;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimationControlListener;
import android.view.WindowInsetsAnimationController;
import android.view.WindowInsetsController;
import android.view.WindowManager;
import android.view.WindowMetrics;
import android.view.animation.LinearInterpolator;
import java.io.FileDescriptor;
import java.io.InputStream;
import java.util.concurrent.Flow;

/* JADX INFO: renamed from: androidx.work.impl.utils.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC2335a {
    /* JADX INFO: renamed from: A */
    public static /* bridge */ /* synthetic */ void m12290A(WindowInsetsAnimationController windowInsetsAnimationController) {
        windowInsetsAnimationController.finish(false);
    }

    /* JADX INFO: renamed from: B */
    public static /* bridge */ /* synthetic */ long m12291B(ApplicationExitInfo applicationExitInfo) {
        return applicationExitInfo.getRss();
    }

    /* JADX INFO: renamed from: a */
    public static /* bridge */ /* synthetic */ float m12292a(WindowInsetsAnimationController windowInsetsAnimationController) {
        return windowInsetsAnimationController.getCurrentFraction();
    }

    /* JADX INFO: renamed from: b */
    public static /* bridge */ /* synthetic */ int m12293b() {
        return WindowInsets.Type.systemBars();
    }

    /* JADX INFO: renamed from: c */
    public static /* bridge */ /* synthetic */ int m12294c(ApplicationExitInfo applicationExitInfo) {
        return applicationExitInfo.getImportance();
    }

    /* JADX INFO: renamed from: d */
    public static /* bridge */ /* synthetic */ long m12295d(ApplicationExitInfo applicationExitInfo) {
        return applicationExitInfo.getTimestamp();
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ ResourcesLoader m12296e() {
        return new ResourcesLoader();
    }

    /* JADX INFO: renamed from: f */
    public static /* bridge */ /* synthetic */ ResourcesProvider m12297f(ParcelFileDescriptor parcelFileDescriptor) {
        return ResourcesProvider.loadFromTable(parcelFileDescriptor, null);
    }

    /* JADX INFO: renamed from: g */
    public static /* bridge */ /* synthetic */ Bitmap m12298g(MediaMetadataRetriever mediaMetadataRetriever, long j, int i, int i2, int i3, MediaMetadataRetriever.BitmapParams bitmapParams) {
        return mediaMetadataRetriever.getScaledFrameAtTime(j, i, i2, i3, bitmapParams);
    }

    /* JADX INFO: renamed from: h */
    public static /* bridge */ /* synthetic */ Bitmap m12299h(MediaMetadataRetriever mediaMetadataRetriever, long j, int i, MediaMetadataRetriever.BitmapParams bitmapParams) {
        return mediaMetadataRetriever.getFrameAtTime(j, i, bitmapParams);
    }

    /* JADX INFO: renamed from: i */
    public static /* bridge */ /* synthetic */ Rect m12300i(WindowMetrics windowMetrics) {
        return windowMetrics.getBounds();
    }

    /* JADX INFO: renamed from: j */
    public static /* bridge */ /* synthetic */ WindowInsets m12301j(WindowMetrics windowMetrics) {
        return windowMetrics.getWindowInsets();
    }

    /* JADX INFO: renamed from: k */
    public static /* bridge */ /* synthetic */ WindowMetrics m12302k(WindowManager windowManager) {
        return windowManager.getCurrentWindowMetrics();
    }

    /* JADX INFO: renamed from: l */
    public static /* bridge */ /* synthetic */ FileDescriptor m12303l() {
        return Os.memfd_create("temp.arsc", 0);
    }

    /* JADX INFO: renamed from: m */
    public static /* bridge */ /* synthetic */ InputStream m12304m(ApplicationExitInfo applicationExitInfo) {
        return applicationExitInfo.getTraceInputStream();
    }

    /* JADX INFO: renamed from: n */
    public static /* bridge */ /* synthetic */ String m12305n(ApplicationExitInfo applicationExitInfo) {
        return applicationExitInfo.toString();
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m12306o() {
    }

    /* JADX INFO: renamed from: p */
    public static /* bridge */ /* synthetic */ void m12307p(Resources resources, ResourcesLoader[] resourcesLoaderArr) {
        resources.addLoaders(resourcesLoaderArr);
    }

    /* JADX INFO: renamed from: q */
    public static /* bridge */ /* synthetic */ void m12308q(ResourcesLoader resourcesLoader, ResourcesProvider resourcesProvider) {
        resourcesLoader.addProvider(resourcesProvider);
    }

    /* JADX INFO: renamed from: r */
    public static /* bridge */ /* synthetic */ void m12309r(WindowInsetsAnimationController windowInsetsAnimationController) {
        windowInsetsAnimationController.finish(true);
    }

    /* JADX INFO: renamed from: s */
    public static /* bridge */ /* synthetic */ void m12310s(WindowInsetsAnimationController windowInsetsAnimationController, Insets insets, float f) {
        windowInsetsAnimationController.setInsetsAndAlpha(insets, 1.0f, f);
    }

    /* JADX INFO: renamed from: t */
    public static /* bridge */ /* synthetic */ void m12311t(WindowInsetsController windowInsetsController, int i, LinearInterpolator linearInterpolator, CancellationSignal cancellationSignal, WindowInsetsAnimationControlListener windowInsetsAnimationControlListener) {
        windowInsetsController.controlWindowInsetsAnimation(i, -1L, linearInterpolator, cancellationSignal, windowInsetsAnimationControlListener);
    }

    /* JADX INFO: renamed from: u */
    public static /* bridge */ /* synthetic */ void m12312u(Flow.Subscription subscription) {
        subscription.cancel();
    }

    /* JADX INFO: renamed from: v */
    public static /* bridge */ /* synthetic */ void m12313v(Flow.Subscription subscription, long j) {
        subscription.request(j);
    }

    /* JADX INFO: renamed from: w */
    public static /* bridge */ /* synthetic */ boolean m12314w(SparseArray sparseArray, int i) {
        return sparseArray.contains(i);
    }

    /* JADX INFO: renamed from: x */
    public static /* bridge */ /* synthetic */ int m12315x(ApplicationExitInfo applicationExitInfo) {
        return applicationExitInfo.getPid();
    }

    /* JADX INFO: renamed from: y */
    public static /* bridge */ /* synthetic */ long m12316y(ApplicationExitInfo applicationExitInfo) {
        return applicationExitInfo.getPss();
    }

    /* JADX INFO: renamed from: z */
    public static /* bridge */ /* synthetic */ String m12317z(ApplicationExitInfo applicationExitInfo) {
        return applicationExitInfo.getProcessName();
    }
}
