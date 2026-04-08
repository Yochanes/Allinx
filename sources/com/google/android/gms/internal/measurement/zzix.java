package com.google.android.gms.internal.measurement;

import android.util.Log;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
final class zzix extends zzir<Double> {
    public zzix(zziz zzizVar, String str, Double d, boolean z2) {
        super(zzizVar, str, d, true, null);
    }

    @Nullable
    private final Double zzb(Object obj) {
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if (obj instanceof String) {
            try {
                return Double.valueOf(Double.parseDouble((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        Log.e("PhenotypeFlag", "Invalid double value for " + zzb() + ": " + String.valueOf(obj));
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.zzir
    @Nullable
    public final /* synthetic */ Double zza(Object obj) {
        return zzb(obj);
    }
}
