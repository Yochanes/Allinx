package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Px;
import com.google.android.material.progressindicator.BaseProgressIndicatorSpec;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
abstract class DrawingDelegate<S extends BaseProgressIndicatorSpec> {
    S spec;

    /* JADX INFO: compiled from: Proguard */
    public static class ActiveIndicator {

        @ColorInt
        int color;

        @FloatRange
        float endFraction;

        @Px
        int gapSize;

        @FloatRange
        float startFraction;
    }

    public DrawingDelegate(S s) {
        this.spec = s;
    }

    public abstract void adjustCanvas(@NonNull Canvas canvas, @NonNull Rect rect, @FloatRange float f, boolean z2, boolean z3);

    public abstract void drawStopIndicator(@NonNull Canvas canvas, @NonNull Paint paint, @ColorInt int i, @IntRange int i2);

    public abstract void fillIndicator(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull ActiveIndicator activeIndicator, @IntRange int i);

    public abstract void fillTrack(@NonNull Canvas canvas, @NonNull Paint paint, @FloatRange float f, @FloatRange float f2, @ColorInt int i, @IntRange int i2, @Px int i3);

    public abstract int getPreferredHeight();

    public abstract int getPreferredWidth();

    public void validateSpecAndAdjustCanvas(@NonNull Canvas canvas, @NonNull Rect rect, @FloatRange float f, boolean z2, boolean z3) {
        this.spec.validateSpec();
        adjustCanvas(canvas, rect, f, z2, z3);
    }
}
