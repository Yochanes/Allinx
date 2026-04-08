package com.google.android.gms.internal.measurement;

import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhp {

    @Nullable
    @GuardedBy
    private static zzhs zza;

    public static synchronized zzhs zza() {
        try {
            if (zza == null) {
                zza(new zzhr());
            }
        } catch (Throwable th) {
            throw th;
        }
        return zza;
    }

    private static synchronized void zza(zzhs zzhsVar) {
        if (zza == null) {
            zza = zzhsVar;
        } else {
            throw new IllegalStateException("init() already called");
        }
    }
}
