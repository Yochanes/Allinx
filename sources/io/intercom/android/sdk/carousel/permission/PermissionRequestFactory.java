package io.intercom.android.sdk.carousel.permission;

import android.os.Build;
import io.intercom.android.sdk.carousel.PermissionManager;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class PermissionRequestFactory {
    private PermissionRequestFactory() {
    }

    public static PermissionRequest create(PermissionManager permissionManager) {
        return Build.VERSION.SDK_INT >= 30 ? new PermissionRequest30(permissionManager) : new PermissionRequestBefore30(permissionManager);
    }
}
