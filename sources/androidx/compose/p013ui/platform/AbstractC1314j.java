package androidx.compose.p013ui.platform;

import android.view.View;
import android.view.ViewParent;

/* JADX INFO: renamed from: androidx.compose.ui.platform.j */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1314j {
    /* JADX INFO: renamed from: a */
    public static /* bridge */ /* synthetic */ void m6245a(int i, View view) {
        view.setFocusable(i);
    }

    /* JADX INFO: renamed from: b */
    public static /* bridge */ /* synthetic */ void m6246b(View view, boolean z2) {
        view.setDefaultFocusHighlightEnabled(z2);
    }

    /* JADX INFO: renamed from: c */
    public static /* bridge */ /* synthetic */ void m6247c(ViewParent viewParent, AndroidComposeView androidComposeView, AndroidComposeView androidComposeView2) {
        viewParent.onDescendantInvalidated(androidComposeView, androidComposeView2);
    }
}
