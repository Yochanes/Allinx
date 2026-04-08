package androidx.core.widget;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.EdgeEffect;
import androidx.annotation.RequiresApi;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final class EdgeEffectCompat {

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api21Impl {
        /* JADX INFO: renamed from: a */
        public static void m8167a(EdgeEffect edgeEffect, float f, float f2) {
            edgeEffect.onPull(f, f2);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api31Impl {
        /* JADX INFO: renamed from: a */
        public static EdgeEffect m8168a(Context context, AttributeSet attributeSet) {
            try {
                return new EdgeEffect(context, attributeSet);
            } catch (Throwable unused) {
                return new EdgeEffect(context);
            }
        }

        /* JADX INFO: renamed from: b */
        public static float m8169b(EdgeEffect edgeEffect) {
            try {
                return edgeEffect.getDistance();
            } catch (Throwable unused) {
                return 0.0f;
            }
        }

        /* JADX INFO: renamed from: c */
        public static float m8170c(EdgeEffect edgeEffect, float f, float f2) {
            try {
                return edgeEffect.onPullDistance(f, f2);
            } catch (Throwable unused) {
                edgeEffect.onPull(f, f2);
                return 0.0f;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static float m8165a(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return Api31Impl.m8169b(edgeEffect);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: b */
    public static float m8166b(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 31) {
            return Api31Impl.m8170c(edgeEffect, f, f2);
        }
        Api21Impl.m8167a(edgeEffect, f, f2);
        return f;
    }
}
