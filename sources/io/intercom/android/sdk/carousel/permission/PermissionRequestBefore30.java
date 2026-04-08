package io.intercom.android.sdk.carousel.permission;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.intercom.android.sdk.carousel.PermissionManager;
import io.intercom.android.sdk.models.carousel.ScreenAction;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
class PermissionRequestBefore30 implements PermissionRequest {
    private final PermissionResultListener nullListener = new NullPermissionResultListener(null);
    protected final PermissionManager permissionManager;

    @Nullable
    private PermissionResultListener permissionResultListener;

    /* JADX INFO: compiled from: Proguard */
    public static final class NullPermissionResultListener implements PermissionResultListener {
        private NullPermissionResultListener() {
        }

        public /* synthetic */ NullPermissionResultListener(C51991 c51991) {
            this();
        }

        @Override // io.intercom.android.sdk.carousel.permission.PermissionResultListener
        public void requestBackgroundLocationPermission() {
        }

        @Override // io.intercom.android.sdk.carousel.permission.PermissionResultListener
        public void showDeniedPermanently() {
        }

        @Override // io.intercom.android.sdk.carousel.permission.PermissionResultListener
        public void showDeniedTemporarily() {
        }

        @Override // io.intercom.android.sdk.carousel.permission.PermissionResultListener
        public void showGranted() {
        }
    }

    public PermissionRequestBefore30(PermissionManager permissionManager) {
        this.permissionManager = permissionManager;
    }

    private void handleRequestResult(@NonNull String[] strArr, @NonNull int[] iArr) {
        if (this.permissionManager.anyPermissionPermanentlyDeniedInResult(strArr, iArr)) {
            getListener().showDeniedPermanently();
        } else if (this.permissionManager.permissionsGranted(Arrays.asList(strArr))) {
            handleGranted(strArr);
        } else {
            getListener().showDeniedTemporarily();
        }
    }

    @Override // io.intercom.android.sdk.carousel.permission.PermissionRequest
    public void attach(@Nullable PermissionResultListener permissionResultListener) {
        this.permissionResultListener = permissionResultListener;
    }

    @Override // io.intercom.android.sdk.carousel.permission.PermissionRequest
    public void detach() {
        this.permissionResultListener = null;
    }

    @NonNull
    public PermissionResultListener getListener() {
        PermissionResultListener permissionResultListener = this.permissionResultListener;
        return permissionResultListener == null ? this.nullListener : permissionResultListener;
    }

    public void handleGranted(String[] strArr) {
        getListener().showGranted();
    }

    public void handleRequest(List<String> list, int i) {
        this.permissionManager.requestPermissions((String[]) list.toArray(new String[0]), i);
    }

    @Override // io.intercom.android.sdk.carousel.permission.PermissionRequest
    public void handleResult(@NonNull String[] strArr, @NonNull int[] iArr) {
        handleRequestResult(strArr, iArr);
    }

    @Override // io.intercom.android.sdk.carousel.permission.PermissionRequest
    public void request(ScreenAction screenAction, int i) {
        List<String> validPermissions = screenAction.getValidPermissions(this.permissionManager);
        if (validPermissions.isEmpty()) {
            return;
        }
        handleRequest(validPermissions, i);
    }
}
