package com.google.android.material.motion;

import androidx.activity.BackEventCompat;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@RestrictTo
public interface MaterialBackHandler {
    void cancelBackProgress();

    void handleBackInvoked();

    void startBackProgress(@NonNull BackEventCompat backEventCompat);

    void updateBackProgress(@NonNull BackEventCompat backEventCompat);
}
