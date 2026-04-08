package com.google.android.material.internal;

import android.animation.TimeInterpolator;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@RestrictTo
public class ReversableAnimatedValueInterpolator implements TimeInterpolator {
    private final TimeInterpolator sourceInterpolator;

    public ReversableAnimatedValueInterpolator(@NonNull TimeInterpolator timeInterpolator) {
        this.sourceInterpolator = timeInterpolator;
    }

    @NonNull
    /* JADX INFO: renamed from: of */
    public static TimeInterpolator m14689of(boolean z2, @NonNull TimeInterpolator timeInterpolator) {
        return z2 ? timeInterpolator : new ReversableAnimatedValueInterpolator(timeInterpolator);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        return 1.0f - this.sourceInterpolator.getInterpolation(f);
    }
}
