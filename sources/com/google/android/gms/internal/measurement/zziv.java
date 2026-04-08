package com.google.android.gms.internal.measurement;

import android.util.Log;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
final class zziv extends zzir<Long> {
    public zziv(zziz zzizVar, String str, Long l, boolean z2) {
        super(zzizVar, str, l, true, null);
    }

    @Nullable
    private final Long zzb(Object obj) {
        if (obj instanceof Long) {
            return (Long) obj;
        }
        if (obj instanceof String) {
            try {
                return Long.valueOf(Long.parseLong((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        Log.e("PhenotypeFlag", "Invalid long value for " + zzb() + ": " + String.valueOf(obj));
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.zzir
    @Nullable
    public final /* synthetic */ Long zza(Object obj) {
        return zzb(obj);
    }
}
