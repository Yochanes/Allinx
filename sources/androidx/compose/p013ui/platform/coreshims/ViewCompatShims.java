package androidx.compose.p013ui.platform.coreshims;

import android.os.Build;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo
public class ViewCompatShims {

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api26Impl {
        /* JADX INFO: renamed from: a */
        public static AutofillId m6221a(View view) {
            return view.getAutofillId();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api29Impl {
        /* JADX INFO: renamed from: a */
        public static ContentCaptureSession m6222a(View view) {
            return view.getContentCaptureSession();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api30Impl {
        /* JADX INFO: renamed from: a */
        public static void m6223a(View view) {
            view.setImportantForContentCapture(1);
        }
    }

    /* JADX INFO: renamed from: a */
    public static AutofillIdCompat m6218a(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return new AutofillIdCompat(Api26Impl.m6221a(view));
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static ContentCaptureSessionCompat m6219b(View view) {
        ContentCaptureSession contentCaptureSessionM6222a;
        if (Build.VERSION.SDK_INT < 29 || (contentCaptureSessionM6222a = Api29Impl.m6222a(view)) == null) {
            return null;
        }
        return new ContentCaptureSessionCompat(contentCaptureSessionM6222a, view);
    }

    /* JADX INFO: renamed from: c */
    public static void m6220c(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            Api30Impl.m6223a(view);
        }
    }
}
