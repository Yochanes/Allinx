package androidx.transition;

import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.media3.exoplayer.source.mediaparser.AbstractC1895a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
class ViewUtilsApi22 extends ViewUtilsApi21 {

    /* JADX INFO: renamed from: g */
    public static boolean f32303g = true;

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api29Impl {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static void m12020a(View view, int i, int i2, int i3, int i4) {
            AbstractC1895a.m10610p(view, i, i2, i3, i4);
        }
    }

    /* JADX INFO: renamed from: g */
    public void mo12019g(View view, int i, int i2, int i3, int i4) {
        if (f32303g) {
            try {
                Api29Impl.m12020a(view, i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                f32303g = false;
            }
        }
    }
}
