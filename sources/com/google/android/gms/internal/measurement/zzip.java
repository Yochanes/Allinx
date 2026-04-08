package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import com.google.common.base.Optional;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final class zzip {
    private static volatile Optional<Boolean> zza = Optional.absent();
    private static final Object zzb = new Object();

    private static boolean zza(Context context) {
        return (context.getPackageManager().getApplicationInfo("com.google.android.gms", 0).flags & 129) != 0;
    }

    public static boolean zza(Context context, Uri uri) {
        String authority = uri.getAuthority();
        boolean z2 = false;
        if (!"com.google.android.gms.phenotype".equals(authority)) {
            Log.e("PhenotypeClientHelper", authority + " is an unsupported authority. Only com.google.android.gms.phenotype authority is supported.");
            return false;
        }
        if (zza.isPresent()) {
            return zza.get().booleanValue();
        }
        synchronized (zzb) {
            try {
                if (zza.isPresent()) {
                    return zza.get().booleanValue();
                }
                if (!"com.google.android.gms".equals(context.getPackageName())) {
                    ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.phenotype", Build.VERSION.SDK_INT < 29 ? 0 : 268435456);
                    if (providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                    }
                    zza = Optional.m14762of(Boolean.valueOf(z2));
                    return zza.get().booleanValue();
                }
                if (zza(context)) {
                    z2 = true;
                }
                zza = Optional.m14762of(Boolean.valueOf(z2));
                return zza.get().booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
