package androidx.transition;

import android.graphics.Canvas;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
class CanvasUtils {

    /* JADX INFO: renamed from: a */
    public static Method f32160a;

    /* JADX INFO: renamed from: b */
    public static Method f32161b;

    /* JADX INFO: renamed from: c */
    public static boolean f32162c;

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api29Impl {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static void m11956a(Canvas canvas) {
            canvas.disableZ();
        }

        @DoNotInline
        /* JADX INFO: renamed from: b */
        public static void m11957b(Canvas canvas) {
            canvas.enableZ();
        }
    }
}
