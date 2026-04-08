package com.google.android.material.resources;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Build;
import androidx.activity.AbstractC0050i;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.compose.p013ui.platform.AbstractC1305a;
import androidx.core.math.MathUtils;
import coil.util.AbstractC2383b;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@RestrictTo
public class TypefaceUtils {
    private TypefaceUtils() {
    }

    @Nullable
    public static Typeface maybeCopyWithFontWeightAdjustment(@NonNull Context context, @NonNull Typeface typeface) {
        return maybeCopyWithFontWeightAdjustment(context.getResources().getConfiguration(), typeface);
    }

    @Nullable
    public static Typeface maybeCopyWithFontWeightAdjustment(@NonNull Configuration configuration, @NonNull Typeface typeface) {
        if (Build.VERSION.SDK_INT < 31 || AbstractC1305a.m6198a(configuration) == Integer.MAX_VALUE || AbstractC1305a.m6198a(configuration) == 0 || typeface == null) {
            return null;
        }
        return AbstractC0050i.m198c(typeface, MathUtils.m7630b(AbstractC1305a.m6198a(configuration) + AbstractC2383b.m12545a(typeface), 1, 1000), typeface.isItalic());
    }
}
