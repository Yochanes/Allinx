package io.intercom.android.sdk.carousel.permission;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.intercom.android.sdk.models.carousel.ScreenAction;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public interface PermissionRequest {
    void attach(@Nullable PermissionResultListener permissionResultListener);

    void detach();

    void handleResult(@NonNull String[] strArr, @NonNull int[] iArr);

    void request(ScreenAction screenAction, int i);
}
