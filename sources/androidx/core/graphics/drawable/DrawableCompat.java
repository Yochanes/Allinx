package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import androidx.annotation.RequiresApi;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final class DrawableCompat {

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api21Impl {
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api23Impl {
    }

    /* JADX INFO: renamed from: a */
    public static void m7606a(Drawable drawable, int i) {
        drawable.setTint(i);
    }

    /* JADX INFO: renamed from: b */
    public static void m7607b(Drawable drawable, ColorStateList colorStateList) {
        drawable.setTintList(colorStateList);
    }

    /* JADX INFO: renamed from: c */
    public static void m7608c(Drawable drawable, PorterDuff.Mode mode) {
        drawable.setTintMode(mode);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public static Drawable m7609d(Drawable drawable) {
        return drawable instanceof WrappedDrawable ? ((WrappedDrawable) drawable).mo7627b() : drawable;
    }
}
