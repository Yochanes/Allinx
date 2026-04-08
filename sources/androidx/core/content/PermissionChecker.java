package androidx.core.content;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Process;
import androidx.annotation.RestrictTo;
import androidx.core.app.AppOpsManagerCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Objects;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final class PermissionChecker {

    /* JADX INFO: compiled from: Proguard */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface PermissionResult {
    }

    /* JADX INFO: renamed from: a */
    public static int m7503a(Context context, String str) {
        int iMyPid = Process.myPid();
        int iMyUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, iMyPid, iMyUid) != -1) {
            String strPermissionToOp = AppOpsManager.permissionToOp(str);
            if (strPermissionToOp != null) {
                if (packageName == null) {
                    String[] packagesForUid = context.getPackageManager().getPackagesForUid(iMyUid);
                    if (packagesForUid != null && packagesForUid.length > 0) {
                        packageName = packagesForUid[0];
                    }
                }
                if (((Process.myUid() == iMyUid && Objects.equals(context.getPackageName(), packageName)) ? AppOpsManagerCompat.m7399a(iMyUid, context, strPermissionToOp, packageName) : ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(strPermissionToOp, packageName)) != 0) {
                    return -2;
                }
            }
            return 0;
        }
        return -1;
    }
}
