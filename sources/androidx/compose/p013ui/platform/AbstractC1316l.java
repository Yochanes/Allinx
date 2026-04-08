package androidx.compose.p013ui.platform;

import android.content.ClipboardManager;

/* JADX INFO: renamed from: androidx.compose.ui.platform.l */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1316l {
    /* JADX INFO: renamed from: a */
    public static /* bridge */ /* synthetic */ void m6250a(ClipboardManager clipboardManager) {
        clipboardManager.clearPrimaryClip();
    }

    /* JADX INFO: renamed from: b */
    public static /* bridge */ /* synthetic */ void m6251b(ViewLayer viewLayer, int i) {
        viewLayer.setOutlineAmbientShadowColor(i);
    }

    /* JADX INFO: renamed from: c */
    public static /* bridge */ /* synthetic */ void m6252c(ViewLayer viewLayer, int i) {
        viewLayer.setOutlineSpotShadowColor(i);
    }
}
