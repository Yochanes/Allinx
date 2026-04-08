package com.google.android.material.internal;

import android.animation.TypeEvaluator;
import android.graphics.Rect;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@RestrictTo
public class RectEvaluator implements TypeEvaluator<Rect> {
    private final Rect rect;

    public RectEvaluator(@NonNull Rect rect) {
        this.rect = rect;
    }

    @Override // android.animation.TypeEvaluator
    public /* bridge */ /* synthetic */ Rect evaluate(float f, @NonNull Rect rect, @NonNull Rect rect2) {
        return evaluate2(f, rect, rect2);
    }

    /* JADX INFO: renamed from: evaluate, reason: avoid collision after fix types in other method */
    public Rect evaluate2(float f, @NonNull Rect rect, @NonNull Rect rect2) {
        this.rect.set(rect.left + ((int) ((rect2.left - r0) * f)), rect.top + ((int) ((rect2.top - r1) * f)), rect.right + ((int) ((rect2.right - r2) * f)), rect.bottom + ((int) ((rect2.bottom - r6) * f)));
        return this.rect;
    }
}
