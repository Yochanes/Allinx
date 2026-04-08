package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
final class zzmh implements zzme {
    @Override // com.google.android.gms.internal.measurement.zzme
    public final int zza(int i, Object obj, Object obj2) {
        zzmf zzmfVar = (zzmf) obj;
        if (zzmfVar.isEmpty()) {
            return 0;
        }
        Iterator it = zzmfVar.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.measurement.zzme
    public final Object zzb(Object obj) {
        return zzmf.zza().zzb();
    }

    @Override // com.google.android.gms.internal.measurement.zzme
    public final Object zzc(Object obj) {
        ((zzmf) obj).zzc();
        return obj;
    }

    @Override // com.google.android.gms.internal.measurement.zzme
    public final Map<?, ?> zzd(Object obj) {
        return (zzmf) obj;
    }

    @Override // com.google.android.gms.internal.measurement.zzme
    public final Map<?, ?> zze(Object obj) {
        return (zzmf) obj;
    }

    @Override // com.google.android.gms.internal.measurement.zzme
    public final boolean zzf(Object obj) {
        return !((zzmf) obj).zzd();
    }

    @Override // com.google.android.gms.internal.measurement.zzme
    public final zzmc<?, ?> zza(Object obj) {
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.measurement.zzme
    public final Object zza(Object obj, Object obj2) {
        zzmf zzmfVarZzb = (zzmf) obj;
        zzmf zzmfVar = (zzmf) obj2;
        if (!zzmfVar.isEmpty()) {
            if (!zzmfVarZzb.zzd()) {
                zzmfVarZzb = zzmfVarZzb.zzb();
            }
            zzmfVarZzb.zza(zzmfVar);
        }
        return zzmfVarZzb;
    }
}
