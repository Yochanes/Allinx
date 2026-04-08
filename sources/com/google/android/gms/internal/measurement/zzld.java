package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzlc;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
final class zzld implements zzmi {
    private static final zzld zza = new zzld();

    private zzld() {
    }

    public static zzld zza() {
        return zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzmi
    public final boolean zzb(Class<?> cls) {
        return zzlc.class.isAssignableFrom(cls);
    }

    @Override // com.google.android.gms.internal.measurement.zzmi
    public final zzmj zza(Class<?> cls) {
        if (!zzlc.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (zzmj) zzlc.zza(cls.asSubclass(zzlc.class)).zza(zzlc.zze.zzc, (Object) null, (Object) null);
        } catch (Exception e) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
        }
    }
}
