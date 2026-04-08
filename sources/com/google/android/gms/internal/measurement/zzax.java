package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final class zzax implements zzaq {
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj instanceof zzax;
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final zzaq zza(String str, zzh zzhVar, List<zzaq> list) {
        throw new IllegalStateException(AbstractC0000a.m13j("Undefined has no function ", str));
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final zzaq zzc() {
        return zzaq.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Boolean zzd() {
        return Boolean.FALSE;
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Double zze() {
        return Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final String zzf() {
        return "undefined";
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Iterator<zzaq> zzh() {
        return null;
    }
}
