package io.intercom.android.sdk.carousel.permission;

import androidx.annotation.RequiresApi;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public interface PermissionResultListener {
    @RequiresApi
    void requestBackgroundLocationPermission();

    void showDeniedPermanently();

    void showDeniedTemporarily();

    void showGranted();
}
