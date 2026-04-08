package com.google.android.material.internal;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@RestrictTo
public interface ViewOverlayImpl {
    void add(@NonNull Drawable drawable);

    void remove(@NonNull Drawable drawable);
}
