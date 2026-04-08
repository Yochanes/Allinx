package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.database.ContentObserver;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.core.content.PermissionChecker;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
final class zzik implements zzif {

    @GuardedBy
    private static zzik zza;

    @Nullable
    private final Context zzb;

    @Nullable
    private final ContentObserver zzc;

    private zzik() {
        this.zzb = null;
        this.zzc = null;
    }

    public static zzik zza(Context context) {
        zzik zzikVar;
        synchronized (zzik.class) {
            try {
                if (zza == null) {
                    zza = PermissionChecker.m7503a(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new zzik(context) : new zzik();
                }
                zzikVar = zza;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzikVar;
    }

    @Nullable
    private final String zzc(String str) {
        Context context = this.zzb;
        if (context != null && !zzia.zza(context)) {
            try {
                return (String) zzii.zza(new zzij(this, str));
            } catch (IllegalStateException | NullPointerException | SecurityException e) {
                Log.e("GservicesLoader", "Unable to read GServices for: " + str, e);
            }
        }
        return null;
    }

    public final /* synthetic */ String zzb(String str) {
        return zzhn.zza(this.zzb.getContentResolver(), str, null);
    }

    private zzik(Context context) {
        this.zzb = context;
        zzim zzimVar = new zzim(this, null);
        this.zzc = zzimVar;
        context.getContentResolver().registerContentObserver(zzhq.zza, true, zzimVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzif
    @Nullable
    public final /* synthetic */ Object zza(String str) {
        return zzc(str);
    }

    public static synchronized void zza() {
        Context context;
        try {
            zzik zzikVar = zza;
            if (zzikVar != null && (context = zzikVar.zzb) != null && zzikVar.zzc != null) {
                context.getContentResolver().unregisterContentObserver(zza.zzc);
            }
            zza = null;
        } catch (Throwable th) {
            throw th;
        }
    }
}
