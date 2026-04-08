package io.intercom.android.sdk.carousel;

import android.app.Activity;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.logger.LumberMill;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class PermissionManager {
    private static final String BACKGROUND_LOCATION_PERMISSION = "android.permission.ACCESS_BACKGROUND_LOCATION";
    private static final Twig twig = LumberMill.getLogger();
    private final Activity activity;

    /* JADX INFO: compiled from: Proguard */
    @Retention(RetentionPolicy.SOURCE)
    public @interface PermissionStatus {
        public static final int DENIED_TEMPORARILY = 1;
        public static final int GRANTED = 0;
        public static final int NEVER_ASKED_OR_DENIED_PERMANENTLY = 2;
    }

    public PermissionManager(Activity activity) {
        this.activity = activity;
    }

    public boolean anyPermissionPermanentlyDeniedInResult(String[] strArr, int[] iArr) {
        for (int i = 0; i < strArr.length; i++) {
            if (iArr[i] == -1 && !ActivityCompat.m7394j(this.activity, strArr[i])) {
                return true;
            }
        }
        return false;
    }

    public int getPermissionStatus(String str) {
        if (ContextCompat.m7484a(this.activity, str) == 0) {
            return 0;
        }
        return ActivityCompat.m7394j(this.activity, str) ? 1 : 2;
    }

    public List<String> permissionsExistInManifest(List<String> list) {
        ArrayList arrayList = new ArrayList();
        List<String> listPermissionsInManifest = permissionsInManifest();
        for (String str : list) {
            if (listPermissionsInManifest.contains(str)) {
                boolean zEquals = BACKGROUND_LOCATION_PERMISSION.equals(str);
                boolean z2 = Build.VERSION.SDK_INT < 29;
                if (!zEquals || !z2) {
                    arrayList.add(str);
                }
            }
        }
        return arrayList;
    }

    public boolean permissionsGranted(List<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (getPermissionStatus(it.next()) != 0) {
                return false;
            }
        }
        return true;
    }

    @VisibleForTesting
    public List<String> permissionsInManifest() {
        try {
            return Arrays.asList(this.activity.getPackageManager().getPackageInfo(this.activity.getPackageName(), 4096).requestedPermissions);
        } catch (PackageManager.NameNotFoundException e) {
            twig.internal("Package name is unknown, error: " + e.getMessage());
            return new ArrayList();
        }
    }

    public void requestPermissions(@NonNull String[] strArr, @IntRange int i) {
        ActivityCompat.m7391g(this.activity, strArr, i);
    }
}
