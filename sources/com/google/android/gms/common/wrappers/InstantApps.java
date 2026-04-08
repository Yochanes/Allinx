package com.google.android.gms.common.wrappers;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.airbnb.lottie.utils.AbstractC2433a;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.PlatformVersion;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
public class InstantApps {
    private static Context zza;

    @Nullable
    private static Boolean zzb;

    @KeepForSdk
    public static synchronized boolean isInstantApp(@NonNull Context context) {
        Boolean bool;
        Context applicationContext = context.getApplicationContext();
        Context context2 = zza;
        if (context2 != null && (bool = zzb) != null && context2 == applicationContext) {
            return bool.booleanValue();
        }
        zzb = null;
        if (PlatformVersion.isAtLeastO()) {
            zzb = Boolean.valueOf(AbstractC2433a.m12756C(applicationContext.getPackageManager()));
        } else {
            try {
                context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                zzb = Boolean.TRUE;
            } catch (ClassNotFoundException unused) {
                zzb = Boolean.FALSE;
            }
        }
        zza = applicationContext;
        return zzb.booleanValue();
    }
}
