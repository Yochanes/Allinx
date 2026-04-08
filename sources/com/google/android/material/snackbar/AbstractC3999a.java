package com.google.android.material.snackbar;

import android.app.NotificationManager;
import android.graphics.BlendMode;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextPaint;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* JADX INFO: renamed from: com.google.android.material.snackbar.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC3999a {
    /* JADX INFO: renamed from: a */
    public static /* bridge */ /* synthetic */ int m14721a(TextPaint textPaint, CharSequence charSequence, int i, int i2) {
        return textPaint.getTextRunCursor(charSequence, 0, i, false, i2, 2);
    }

    /* JADX INFO: renamed from: b */
    public static /* bridge */ /* synthetic */ int m14722b(AccessibilityManager accessibilityManager, int i, int i2) {
        return accessibilityManager.getRecommendedTimeoutMillis(i, i2);
    }

    /* JADX INFO: renamed from: c */
    public static /* bridge */ /* synthetic */ Drawable m14723c(EditText editText) {
        return editText.getTextCursorDrawable();
    }

    /* JADX INFO: renamed from: d */
    public static /* bridge */ /* synthetic */ Uri m14724d() {
        return MediaStore.Downloads.EXTERNAL_CONTENT_URI;
    }

    /* JADX INFO: renamed from: e */
    public static /* bridge */ /* synthetic */ String m14725e(NotificationManager notificationManager) {
        return notificationManager.getNotificationDelegate();
    }

    /* JADX INFO: renamed from: f */
    public static /* bridge */ /* synthetic */ String m14726f(SSLSocket sSLSocket) {
        return sSLSocket.getApplicationProtocol();
    }

    /* JADX INFO: renamed from: g */
    public static /* bridge */ /* synthetic */ void m14727g(NotificationManager notificationManager) {
        notificationManager.setNotificationDelegate("com.google.android.gms");
    }

    /* JADX INFO: renamed from: h */
    public static /* bridge */ /* synthetic */ void m14728h(Drawable drawable, BlendMode blendMode) {
        drawable.setTintBlendMode(blendMode);
    }

    /* JADX INFO: renamed from: i */
    public static /* bridge */ /* synthetic */ void m14729i(SSLParameters sSLParameters, String[] strArr) {
        sSLParameters.setApplicationProtocols(strArr);
    }

    /* JADX INFO: renamed from: j */
    public static /* bridge */ /* synthetic */ boolean m14730j() {
        return Environment.isExternalStorageLegacy();
    }

    /* JADX INFO: renamed from: k */
    public static /* bridge */ /* synthetic */ int m14731k(TextPaint textPaint, CharSequence charSequence, int i, int i2) {
        return textPaint.getTextRunCursor(charSequence, 0, i, false, i2, 0);
    }

    /* JADX INFO: renamed from: l */
    public static /* bridge */ /* synthetic */ void m14732l(NotificationManager notificationManager) {
        notificationManager.setNotificationDelegate(null);
    }
}
