package androidx.compose.p013ui.autofill;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.ColorSpace;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.DisplayMetrics;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillManager$AutofillCallback;
import android.view.autofill.AutofillValue;
import androidx.compose.p013ui.platform.AndroidComposeView;

/* JADX INFO: renamed from: androidx.compose.ui.autofill.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1212a {
    /* JADX INFO: renamed from: A */
    public static /* bridge */ /* synthetic */ void m4884A(AutofillManager autofillManager, AndroidComposeView androidComposeView, int i, Rect rect) {
        autofillManager.notifyViewEntered(androidComposeView, i, rect);
    }

    /* JADX INFO: renamed from: B */
    public static /* bridge */ /* synthetic */ boolean m4885B(AutofillValue autofillValue) {
        return autofillValue.isToggle();
    }

    /* JADX INFO: renamed from: C */
    public static /* bridge */ /* synthetic */ boolean m4886C(AutofillValue autofillValue) {
        return autofillValue.isList();
    }

    /* JADX INFO: renamed from: D */
    public static /* bridge */ /* synthetic */ boolean m4887D(AutofillValue autofillValue) {
        return autofillValue.isText();
    }

    /* JADX INFO: renamed from: a */
    public static /* bridge */ /* synthetic */ Bitmap.Config m4888a() {
        return Bitmap.Config.RGBA_F16;
    }

    /* JADX INFO: renamed from: b */
    public static /* bridge */ /* synthetic */ Bitmap m4889b(int i, int i2, Bitmap.Config config, ColorSpace colorSpace) {
        return Bitmap.createBitmap((DisplayMetrics) null, i, i2, config, true, colorSpace);
    }

    /* JADX INFO: renamed from: c */
    public static /* bridge */ /* synthetic */ AutofillId m4890c(AndroidComposeView androidComposeView) {
        return androidComposeView.getAutofillId();
    }

    /* JADX INFO: renamed from: d */
    public static /* bridge */ /* synthetic */ AutofillId m4891d(Object obj) {
        return (AutofillId) obj;
    }

    /* JADX INFO: renamed from: e */
    public static /* bridge */ /* synthetic */ AutofillValue m4892e(Object obj) {
        return (AutofillValue) obj;
    }

    /* JADX INFO: renamed from: f */
    public static /* bridge */ /* synthetic */ AutofillValue m4893f(String str) {
        return AutofillValue.forText(str);
    }

    /* JADX INFO: renamed from: g */
    public static /* bridge */ /* synthetic */ CharSequence m4894g(AutofillValue autofillValue) {
        return autofillValue.getTextValue();
    }

    /* JADX INFO: renamed from: h */
    public static /* bridge */ /* synthetic */ void m4895h(ColorMatrixColorFilter colorMatrixColorFilter, ColorMatrix colorMatrix) {
        colorMatrixColorFilter.getColorMatrix(colorMatrix);
    }

    /* JADX INFO: renamed from: i */
    public static /* bridge */ /* synthetic */ void m4896i(ViewStructure viewStructure) {
        viewStructure.setInputType(129);
    }

    /* JADX INFO: renamed from: j */
    public static /* bridge */ /* synthetic */ void m4897j(ViewStructure viewStructure, int i) {
        viewStructure.setAutofillType(i);
    }

    /* JADX INFO: renamed from: k */
    public static /* bridge */ /* synthetic */ void m4898k(ViewStructure viewStructure, AutofillId autofillId, int i) {
        viewStructure.setAutofillId(autofillId, i);
    }

    /* JADX INFO: renamed from: l */
    public static /* bridge */ /* synthetic */ void m4899l(ViewStructure viewStructure, AutofillValue autofillValue) {
        viewStructure.setAutofillValue(autofillValue);
    }

    /* JADX INFO: renamed from: m */
    public static /* bridge */ /* synthetic */ void m4900m(ViewStructure viewStructure, String[] strArr) {
        viewStructure.setAutofillHints(strArr);
    }

    /* JADX INFO: renamed from: n */
    public static /* bridge */ /* synthetic */ void m4901n(AutofillManager autofillManager) {
        autofillManager.commit();
    }

    /* JADX INFO: renamed from: o */
    public static /* bridge */ /* synthetic */ void m4902o(AutofillManager autofillManager, AutofillManager$AutofillCallback autofillManager$AutofillCallback) {
        autofillManager.unregisterCallback(autofillManager$AutofillCallback);
    }

    /* JADX INFO: renamed from: p */
    public static /* bridge */ /* synthetic */ void m4903p(AutofillManager autofillManager, AndroidComposeView androidComposeView, int i) {
        autofillManager.notifyViewExited(androidComposeView, i);
    }

    /* JADX INFO: renamed from: q */
    public static /* bridge */ /* synthetic */ void m4904q(AutofillManager autofillManager, AndroidComposeView androidComposeView, int i, Rect rect) {
        autofillManager.requestAutofill(androidComposeView, i, rect);
    }

    /* JADX INFO: renamed from: r */
    public static /* bridge */ /* synthetic */ void m4905r(AutofillManager autofillManager, AndroidComposeView androidComposeView, int i, AutofillValue autofillValue) {
        autofillManager.notifyValueChanged(androidComposeView, i, autofillValue);
    }

    /* JADX INFO: renamed from: s */
    public static /* bridge */ /* synthetic */ void m4906s(AndroidComposeView androidComposeView) {
        androidComposeView.setImportantForAutofill(1);
    }

    /* JADX INFO: renamed from: t */
    public static /* bridge */ /* synthetic */ boolean m4907t(Canvas canvas, int i, int i2, int i3, int i4) {
        return canvas.clipOutRect(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: u */
    public static /* bridge */ /* synthetic */ boolean m4908u(Canvas canvas, Rect rect) {
        return canvas.clipOutRect(rect);
    }

    /* JADX INFO: renamed from: v */
    public static /* bridge */ /* synthetic */ boolean m4909v(Canvas canvas, RectF rectF) {
        return canvas.clipOutRect(rectF);
    }

    /* JADX INFO: renamed from: w */
    public static /* bridge */ /* synthetic */ boolean m4910w(AutofillValue autofillValue) {
        return autofillValue.isDate();
    }

    /* JADX INFO: renamed from: x */
    public static /* bridge */ /* synthetic */ Bitmap.Config m4911x() {
        return Bitmap.Config.HARDWARE;
    }

    /* JADX INFO: renamed from: y */
    public static /* bridge */ /* synthetic */ void m4912y(ViewStructure viewStructure) {
        viewStructure.setDataIsSensitive(true);
    }

    /* JADX INFO: renamed from: z */
    public static /* bridge */ /* synthetic */ void m4913z(AutofillManager autofillManager, AutofillManager$AutofillCallback autofillManager$AutofillCallback) {
        autofillManager.registerCallback(autofillManager$AutofillCallback);
    }
}
