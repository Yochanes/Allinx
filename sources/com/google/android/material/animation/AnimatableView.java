package com.google.android.material.animation;

import androidx.annotation.NonNull;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public interface AnimatableView {

    /* JADX INFO: compiled from: Proguard */
    public interface Listener {
        void onAnimationEnd();
    }

    void startAnimation(@NonNull Listener listener);

    void stopAnimation();
}
