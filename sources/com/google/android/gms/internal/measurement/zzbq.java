package com.google.android.gms.internal.measurement;

import java.util.List;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbq extends zzay {
    @Override // com.google.android.gms.internal.measurement.zzay
    public final zzaq zza(String str, zzh zzhVar, List<zzaq> list) {
        if (str == null || str.isEmpty() || !zzhVar.zzb(str)) {
            throw new IllegalArgumentException(AbstractC0000a.m13j("Command not found: ", str));
        }
        zzaq zzaqVarZza = zzhVar.zza(str);
        if (zzaqVarZza instanceof zzal) {
            return ((zzal) zzaqVarZza).zza(zzhVar, list);
        }
        throw new IllegalArgumentException(AbstractC0000a.m3D("Function ", str, " is not defined"));
    }
}
