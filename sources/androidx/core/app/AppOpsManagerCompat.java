package androidx.core.app;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build;
import androidx.annotation.RequiresApi;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final class AppOpsManagerCompat {

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api23Impl {
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api29Impl {
        /* JADX INFO: renamed from: a */
        public static String m7400a(Context context) {
            return context.getOpPackageName();
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m7399a(int i, Context context, String str, String str2) {
        if (Build.VERSION.SDK_INT < 29) {
            return ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(str, str2);
        }
        AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService(AppOpsManager.class);
        int iCheckOpNoThrow = appOpsManager == null ? 1 : appOpsManager.checkOpNoThrow(str, Binder.getCallingUid(), str2);
        if (iCheckOpNoThrow != 0) {
            return iCheckOpNoThrow;
        }
        String strM7400a = Api29Impl.m7400a(context);
        if (appOpsManager == null) {
            return 1;
        }
        return appOpsManager.checkOpNoThrow(str, i, strM7400a);
    }
}
