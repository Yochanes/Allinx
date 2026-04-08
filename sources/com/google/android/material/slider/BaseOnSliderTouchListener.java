package com.google.android.material.slider;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@RestrictTo
public interface BaseOnSliderTouchListener<S> {
    void onStartTrackingTouch(@NonNull S s);

    void onStopTrackingTouch(@NonNull S s);
}
