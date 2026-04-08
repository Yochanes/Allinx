package androidx.compose.p013ui.platform;

import android.content.res.Configuration;
import android.graphics.RenderEffect;
import android.view.View;
import android.view.translation.ViewTranslationCallback;

/* JADX INFO: renamed from: androidx.compose.ui.platform.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1305a {
    /* JADX INFO: renamed from: a */
    public static /* bridge */ /* synthetic */ int m6198a(Configuration configuration) {
        return configuration.fontWeightAdjustment;
    }

    /* JADX INFO: renamed from: b */
    public static /* bridge */ /* synthetic */ void m6199b(View view) {
        view.clearViewTranslationCallback();
    }

    /* JADX INFO: renamed from: c */
    public static /* bridge */ /* synthetic */ void m6200c(View view, ViewTranslationCallback viewTranslationCallback) {
        view.setViewTranslationCallback(viewTranslationCallback);
    }

    /* JADX INFO: renamed from: d */
    public static /* bridge */ /* synthetic */ void m6201d(ViewLayer viewLayer, RenderEffect renderEffect) {
        viewLayer.setRenderEffect(renderEffect);
    }
}
