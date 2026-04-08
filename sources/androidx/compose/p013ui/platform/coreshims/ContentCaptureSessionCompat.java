package androidx.compose.p013ui.platform.coreshims;

import android.os.Build;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.compose.p013ui.autofill.AbstractC1212a;
import androidx.compose.p013ui.graphics.layer.AbstractC1226a;
import java.util.Objects;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo
public class ContentCaptureSessionCompat {

    /* JADX INFO: renamed from: a */
    public final Object f19654a;

    /* JADX INFO: renamed from: b */
    public final View f19655b;

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api23Impl {
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api29Impl {
        /* JADX INFO: renamed from: a */
        public static AutofillId m6212a(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j) {
            return contentCaptureSession.newAutofillId(autofillId, j);
        }

        /* JADX INFO: renamed from: b */
        public static ViewStructure m6213b(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j) {
            return contentCaptureSession.newVirtualViewStructure(autofillId, j);
        }

        /* JADX INFO: renamed from: c */
        public static void m6214c(ContentCaptureSession contentCaptureSession, ViewStructure viewStructure) {
            contentCaptureSession.notifyViewAppeared(viewStructure);
        }

        /* JADX INFO: renamed from: d */
        public static void m6215d(ContentCaptureSession contentCaptureSession, AutofillId autofillId) {
            contentCaptureSession.notifyViewDisappeared(autofillId);
        }

        /* JADX INFO: renamed from: e */
        public static void m6216e(ContentCaptureSession contentCaptureSession, AutofillId autofillId, String str) {
            contentCaptureSession.notifyViewTextChanged(autofillId, str);
        }

        /* JADX INFO: renamed from: f */
        public static void m6217f(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long[] jArr) {
            contentCaptureSession.notifyViewsDisappeared(autofillId, jArr);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api34Impl {
    }

    public ContentCaptureSessionCompat(ContentCaptureSession contentCaptureSession, View view) {
        this.f19654a = contentCaptureSession;
        this.f19655b = view;
    }

    /* JADX INFO: renamed from: a */
    public final void m6206a() {
        if (Build.VERSION.SDK_INT >= 29) {
            ContentCaptureSession contentCaptureSessionM5452h = AbstractC1226a.m5452h(this.f19654a);
            AutofillIdCompat autofillIdCompatM6218a = ViewCompatShims.m6218a(this.f19655b);
            Objects.requireNonNull(autofillIdCompatM6218a);
            Api29Impl.m6217f(contentCaptureSessionM5452h, AbstractC1212a.m4891d(autofillIdCompatM6218a.f19653a), new long[]{Long.MIN_VALUE});
        }
    }

    /* JADX INFO: renamed from: b */
    public final AutofillId m6207b(long j) {
        if (Build.VERSION.SDK_INT < 29) {
            return null;
        }
        ContentCaptureSession contentCaptureSessionM5452h = AbstractC1226a.m5452h(this.f19654a);
        AutofillIdCompat autofillIdCompatM6218a = ViewCompatShims.m6218a(this.f19655b);
        Objects.requireNonNull(autofillIdCompatM6218a);
        return Api29Impl.m6212a(contentCaptureSessionM5452h, AbstractC1212a.m4891d(autofillIdCompatM6218a.f19653a), j);
    }

    /* JADX INFO: renamed from: c */
    public final ViewStructureCompat m6208c(AutofillId autofillId, long j) {
        if (Build.VERSION.SDK_INT >= 29) {
            return new ViewStructureCompat(Api29Impl.m6213b(AbstractC1226a.m5452h(this.f19654a), autofillId, j));
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final void m6209d(ViewStructure viewStructure) {
        if (Build.VERSION.SDK_INT >= 29) {
            Api29Impl.m6214c(AbstractC1226a.m5452h(this.f19654a), viewStructure);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m6210e(AutofillId autofillId) {
        if (Build.VERSION.SDK_INT >= 29) {
            Api29Impl.m6215d(AbstractC1226a.m5452h(this.f19654a), autofillId);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m6211f(AutofillId autofillId, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            Api29Impl.m6216e(AbstractC1226a.m5452h(this.f19654a), autofillId, str);
        }
    }
}
