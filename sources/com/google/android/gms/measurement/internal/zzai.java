package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.zzjc;
import java.util.EnumMap;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
final class zzai {
    private final EnumMap<zzjc.zza, zzal> zza;

    public zzai() {
        this.zza = new EnumMap<>(zzjc.zza.class);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("1");
        for (zzjc.zza zzaVar : zzjc.zza.values()) {
            zzal zzalVar = this.zza.get(zzaVar);
            if (zzalVar == null) {
                zzalVar = zzal.UNSET;
            }
            sb.append(zzal.zza(zzalVar));
        }
        return sb.toString();
    }

    public final zzal zza(zzjc.zza zzaVar) {
        zzal zzalVar = this.zza.get(zzaVar);
        return zzalVar == null ? zzal.UNSET : zzalVar;
    }

    private zzai(EnumMap<zzjc.zza, zzal> enumMap) {
        EnumMap<zzjc.zza, zzal> enumMap2 = new EnumMap<>(zzjc.zza.class);
        this.zza = enumMap2;
        enumMap2.putAll(enumMap);
    }

    public static zzai zza(String str) {
        EnumMap enumMap = new EnumMap(zzjc.zza.class);
        if (str.length() >= zzjc.zza.values().length) {
            int i = 0;
            if (str.charAt(0) == '1') {
                zzjc.zza[] zzaVarArrValues = zzjc.zza.values();
                int length = zzaVarArrValues.length;
                int i2 = 1;
                while (i < length) {
                    enumMap.put(zzaVarArrValues[i], zzal.zza(str.charAt(i2)));
                    i++;
                    i2++;
                }
                return new zzai(enumMap);
            }
        }
        return new zzai();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(zzjc.zza zzaVar, int i) {
        zzal zzalVar = zzal.UNSET;
        if (i == -30) {
            zzalVar = zzal.TCF;
        } else if (i == -20) {
            zzalVar = zzal.API;
        } else if (i == -10) {
            zzalVar = zzal.MANIFEST;
        } else if (i != 0) {
            if (i == 30) {
                zzalVar = zzal.INITIALIZATION;
            }
        }
        this.zza.put(zzaVar, zzalVar);
    }

    public final void zza(zzjc.zza zzaVar, zzal zzalVar) {
        this.zza.put(zzaVar, zzalVar);
    }
}
