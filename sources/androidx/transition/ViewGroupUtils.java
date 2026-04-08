package androidx.transition;

import android.os.Build;
import android.view.ViewGroup;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
class ViewGroupUtils {

    /* JADX INFO: renamed from: a */
    public static boolean f32293a = true;

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api29Impl {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static int m12004a(ViewGroup viewGroup, int i) {
            return viewGroup.getChildDrawingOrder(i);
        }

        @DoNotInline
        /* JADX INFO: renamed from: b */
        public static void m12005b(ViewGroup viewGroup, boolean z2) {
            viewGroup.suppressLayout(z2);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m12003a(ViewGroup viewGroup, boolean z2) {
        if (Build.VERSION.SDK_INT >= 29) {
            Api29Impl.m12005b(viewGroup, z2);
        } else if (f32293a) {
            try {
                Api29Impl.m12005b(viewGroup, z2);
            } catch (NoSuchMethodError unused) {
                f32293a = false;
            }
        }
    }
}
