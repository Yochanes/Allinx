package androidx.transition;

import android.util.Log;
import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.media3.exoplayer.source.mediaparser.AbstractC1895a;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
class ViewUtilsApi19 {

    /* JADX INFO: renamed from: a */
    public static boolean f32297a = true;

    /* JADX INFO: renamed from: b */
    public static Field f32298b;

    /* JADX INFO: renamed from: c */
    public static boolean f32299c;

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api29Impl {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static float m12011a(View view) {
            return AbstractC1895a.m10596b(view);
        }

        @DoNotInline
        /* JADX INFO: renamed from: b */
        public static void m12012b(View view, float f) {
            AbstractC1895a.m10608n(f, view);
        }
    }

    /* JADX INFO: renamed from: a */
    public float mo12008a(View view) {
        if (f32297a) {
            try {
                return Api29Impl.m12011a(view);
            } catch (NoSuchMethodError unused) {
                f32297a = false;
            }
        }
        return view.getAlpha();
    }

    /* JADX INFO: renamed from: b */
    public void mo12009b(View view, float f) {
        if (f32297a) {
            try {
                Api29Impl.m12012b(view, f);
                return;
            } catch (NoSuchMethodError unused) {
                f32297a = false;
            }
        }
        view.setAlpha(f);
    }

    /* JADX INFO: renamed from: c */
    public void mo12010c(View view, int i) {
        if (!f32299c) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f32298b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsApi19", "fetchViewFlagsField: ");
            }
            f32299c = true;
        }
        Field field = f32298b;
        if (field != null) {
            try {
                f32298b.setInt(view, i | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }
}
