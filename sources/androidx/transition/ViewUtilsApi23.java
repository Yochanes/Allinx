package androidx.transition;

import android.os.Build;
import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.media3.exoplayer.source.mediaparser.AbstractC1895a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
class ViewUtilsApi23 extends ViewUtilsApi22 {

    /* JADX INFO: renamed from: h */
    public static boolean f32304h = true;

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api29Impl {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static void m12021a(View view, int i) {
            AbstractC1895a.m10609o(i, view);
        }
    }

    @Override // androidx.transition.ViewUtilsApi19
    /* JADX INFO: renamed from: c */
    public void mo12010c(View view, int i) {
        if (Build.VERSION.SDK_INT == 28) {
            super.mo12010c(view, i);
        } else if (f32304h) {
            try {
                Api29Impl.m12021a(view, i);
            } catch (NoSuchMethodError unused) {
                f32304h = false;
            }
        }
    }
}
