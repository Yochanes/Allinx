package com.google.android.gms.internal.measurement;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Process;
import android.os.UserManager;
import android.util.Log;
import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public class zzia {

    @Nullable
    @GuardedBy
    private static UserManager zza;
    private static volatile boolean zzb = !zza();

    private zzia() {
    }

    @ChecksSdkIntAtLeast
    public static boolean zza() {
        return true;
    }

    public static boolean zzb(Context context) {
        return !zza() || zzc(context);
    }

    @RequiresApi
    @TargetApi(ConnectionResult.API_DISABLED_FOR_CONNECTION)
    private static boolean zzc(Context context) {
        if (zzb) {
            return true;
        }
        synchronized (zzia.class) {
            try {
                if (zzb) {
                    return true;
                }
                boolean zZzd = zzd(context);
                if (zZzd) {
                    zzb = zZzd;
                }
                return zZzd;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @RequiresApi
    @TargetApi(ConnectionResult.API_DISABLED_FOR_CONNECTION)
    @GuardedBy
    private static boolean zzd(Context context) {
        boolean z2;
        boolean z3 = true;
        int i = 1;
        while (true) {
            z2 = false;
            if (i > 2) {
                break;
            }
            if (zza == null) {
                zza = (UserManager) context.getSystemService(UserManager.class);
            }
            UserManager userManager = zza;
            if (userManager == null) {
                return true;
            }
            try {
                if (userManager.isUserUnlocked()) {
                    break;
                }
                if (userManager.isUserRunning(Process.myUserHandle())) {
                    z3 = false;
                }
            } catch (NullPointerException e) {
                Log.w("DirectBootUtils", "Failed to check if user is unlocked.", e);
                zza = null;
                i++;
            }
        }
        z2 = z3;
        if (z2) {
            zza = null;
        }
        return z2;
    }

    public static boolean zza(Context context) {
        return zza() && !zzc(context);
    }
}
