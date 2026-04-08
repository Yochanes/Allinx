package androidx.transition;

import android.graphics.Matrix;
import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.p013ui.platform.AbstractC1311g;
import androidx.media3.exoplayer.source.mediaparser.AbstractC1895a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
class ViewUtilsApi21 extends ViewUtilsApi19 {

    /* JADX INFO: renamed from: d */
    public static boolean f32300d = true;

    /* JADX INFO: renamed from: e */
    public static boolean f32301e = true;

    /* JADX INFO: renamed from: f */
    public static boolean f32302f = true;

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api29Impl {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static void m12016a(View view, Matrix matrix) {
            AbstractC1895a.m10611q(view, matrix);
        }

        @DoNotInline
        /* JADX INFO: renamed from: b */
        public static void m12017b(View view, Matrix matrix) {
            AbstractC1311g.m6230g(view, matrix);
        }

        @DoNotInline
        /* JADX INFO: renamed from: c */
        public static void m12018c(View view, Matrix matrix) {
            AbstractC1895a.m10618x(view, matrix);
        }
    }

    /* JADX INFO: renamed from: d */
    public void mo12013d(View view, Matrix matrix) {
        if (f32300d) {
            try {
                Api29Impl.m12016a(view, matrix);
            } catch (NoSuchMethodError unused) {
                f32300d = false;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public void mo12014e(View view, Matrix matrix) {
        if (f32301e) {
            try {
                Api29Impl.m12017b(view, matrix);
            } catch (NoSuchMethodError unused) {
                f32301e = false;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public void mo12015f(View view, Matrix matrix) {
        if (f32302f) {
            try {
                Api29Impl.m12018c(view, matrix);
            } catch (NoSuchMethodError unused) {
                f32302f = false;
            }
        }
    }
}
