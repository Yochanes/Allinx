package io.intercom.android.sdk.carousel.permission;

import androidx.annotation.RequiresApi;
import io.intercom.android.sdk.carousel.PermissionManager;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@RequiresApi
class PermissionRequest30 extends PermissionRequestBefore30 {
    public PermissionRequest30(PermissionManager permissionManager) {
        super(permissionManager);
    }

    private boolean askForBackgroundPermission(List<String> list) {
        return isLocationPermission(list) && isBackgroundPermissionInManifest();
    }

    private boolean isBackgroundPermissionDeniedPermanently() {
        return this.permissionManager.getPermissionStatus("android.permission.ACCESS_BACKGROUND_LOCATION") == 2;
    }

    private boolean isBackgroundPermissionInManifest() {
        return !this.permissionManager.permissionsExistInManifest(Collections.singletonList("android.permission.ACCESS_BACKGROUND_LOCATION")).isEmpty();
    }

    private boolean isLocationPermission(List<String> list) {
        return list.contains("android.permission.ACCESS_COARSE_LOCATION") || list.contains("android.permission.ACCESS_FINE_LOCATION");
    }

    @Override // io.intercom.android.sdk.carousel.permission.PermissionRequestBefore30
    public void handleGranted(String[] strArr) {
        if (!askForBackgroundPermission(Arrays.asList(strArr))) {
            getListener().showGranted();
        } else if (isBackgroundPermissionDeniedPermanently()) {
            getListener().showDeniedPermanently();
        } else {
            getListener().requestBackgroundLocationPermission();
        }
    }

    @Override // io.intercom.android.sdk.carousel.permission.PermissionRequestBefore30
    public void handleRequest(List<String> list, int i) {
        list.remove("android.permission.ACCESS_BACKGROUND_LOCATION");
        super.handleRequest(list, i);
    }
}
