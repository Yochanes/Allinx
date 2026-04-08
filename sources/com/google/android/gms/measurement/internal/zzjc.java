package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final class zzjc {
    public static final zzjc zza = new zzjc(null, null, 100);
    private final EnumMap<zza, zzjb> zzb;
    private final int zzc;

    /* JADX INFO: compiled from: Proguard */
    public enum zza {
        AD_STORAGE("ad_storage"),
        ANALYTICS_STORAGE("analytics_storage"),
        AD_USER_DATA("ad_user_data"),
        AD_PERSONALIZATION("ad_personalization");

        public final String zze;

        zza(String str) {
            this.zze = str;
        }
    }

    private zzjc(EnumMap<zza, zzjb> enumMap, int i) {
        EnumMap<zza, zzjb> enumMap2 = new EnumMap<>(zza.class);
        this.zzb = enumMap2;
        enumMap2.putAll(enumMap);
        this.zzc = i;
    }

    public static boolean zza(int i, int i2) {
        if (i == -20 && i2 == -30) {
            return true;
        }
        return (i == -30 && i2 == -20) || i == i2 || i < i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzjc)) {
            return false;
        }
        zzjc zzjcVar = (zzjc) obj;
        for (zza zzaVar : zzjd.zza(zzjd.STORAGE)) {
            if (this.zzb.get(zzaVar) != zzjcVar.zzb.get(zzaVar)) {
                return false;
            }
        }
        return this.zzc == zzjcVar.zzc;
    }

    public final int hashCode() {
        int iHashCode = this.zzc * 17;
        Iterator<zzjb> it = this.zzb.values().iterator();
        while (it.hasNext()) {
            iHashCode = (iHashCode * 31) + it.next().hashCode();
        }
        return iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("source=");
        sb.append(zza(this.zzc));
        for (zza zzaVar : zzjd.zza(zzjd.STORAGE)) {
            sb.append(",");
            sb.append(zzaVar.zze);
            sb.append("=");
            zzjb zzjbVar = this.zzb.get(zzaVar);
            if (zzjbVar == null) {
                zzjbVar = zzjb.UNINITIALIZED;
            }
            sb.append(zzjbVar);
        }
        return sb.toString();
    }

    public final Bundle zzb() {
        Bundle bundle = new Bundle();
        Iterator it = this.zzb.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String strZzb = zzb((zzjb) entry.getValue());
            if (strZzb != null) {
                bundle.putString(((zza) entry.getKey()).zze, strZzb);
            }
        }
        return bundle;
    }

    public final zzjb zzc() {
        zzjb zzjbVar = this.zzb.get(zza.AD_STORAGE);
        return zzjbVar == null ? zzjb.UNINITIALIZED : zzjbVar;
    }

    public final zzjb zzd() {
        zzjb zzjbVar = this.zzb.get(zza.ANALYTICS_STORAGE);
        return zzjbVar == null ? zzjb.UNINITIALIZED : zzjbVar;
    }

    public final Boolean zze() {
        zzjb zzjbVar = this.zzb.get(zza.AD_STORAGE);
        if (zzjbVar == null) {
            return null;
        }
        int iOrdinal = zzjbVar.ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                return Boolean.FALSE;
            }
            if (iOrdinal != 3) {
                return null;
            }
        }
        return Boolean.TRUE;
    }

    public final Boolean zzf() {
        zzjb zzjbVar = this.zzb.get(zza.ANALYTICS_STORAGE);
        if (zzjbVar == null) {
            return null;
        }
        int iOrdinal = zzjbVar.ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                return Boolean.FALSE;
            }
            if (iOrdinal != 3) {
                return null;
            }
        }
        return Boolean.TRUE;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String zzg() {
        int iOrdinal;
        StringBuilder sb = new StringBuilder("G1");
        for (zza zzaVar : zzjd.STORAGE.zza()) {
            zzjb zzjbVar = this.zzb.get(zzaVar);
            char c2 = '-';
            if (zzjbVar != null && (iOrdinal = zzjbVar.ordinal()) != 0) {
                if (iOrdinal == 1) {
                    c2 = '1';
                } else if (iOrdinal == 2) {
                    c2 = '0';
                } else if (iOrdinal != 3) {
                }
            }
            sb.append(c2);
        }
        return sb.toString();
    }

    public final String zzh() {
        StringBuilder sb = new StringBuilder("G1");
        for (zza zzaVar : zzjd.STORAGE.zza()) {
            sb.append(zza(this.zzb.get(zzaVar)));
        }
        return sb.toString();
    }

    public final boolean zzi() {
        return zza(zza.AD_STORAGE);
    }

    public final boolean zzj() {
        return zza(zza.ANALYTICS_STORAGE);
    }

    public final boolean zzk() {
        Iterator<zzjb> it = this.zzb.values().iterator();
        while (it.hasNext()) {
            if (it.next() != zzjb.UNINITIALIZED) {
                return true;
            }
        }
        return false;
    }

    public static char zza(zzjb zzjbVar) {
        if (zzjbVar == null) {
            return '-';
        }
        int iOrdinal = zzjbVar.ordinal();
        if (iOrdinal == 1) {
            return '+';
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? '-' : '1';
        }
        return '0';
    }

    public final int zza() {
        return this.zzc;
    }

    public final boolean zzc(zzjc zzjcVar) {
        return zzb(zzjcVar, (zza[]) this.zzb.keySet().toArray(new zza[0]));
    }

    public static zzjb zza(String str) {
        if (str == null) {
            return zzjb.UNINITIALIZED;
        }
        if (str.equals("granted")) {
            return zzjb.GRANTED;
        }
        if (str.equals("denied")) {
            return zzjb.DENIED;
        }
        return zzjb.UNINITIALIZED;
    }

    public zzjc(Boolean bool, Boolean bool2, int i) {
        EnumMap<zza, zzjb> enumMap = new EnumMap<>(zza.class);
        this.zzb = enumMap;
        enumMap.put(zza.AD_STORAGE, zza(bool));
        enumMap.put(zza.ANALYTICS_STORAGE, zza(bool2));
        this.zzc = i;
    }

    public static zzjc zzb(String str) {
        return zza(str, 100);
    }

    public final zzjc zzb(zzjc zzjcVar) {
        EnumMap enumMap = new EnumMap(zza.class);
        for (zza zzaVar : zzjd.zza(zzjd.STORAGE)) {
            zzjb zzjbVar = this.zzb.get(zzaVar);
            if (zzjbVar == zzjb.UNINITIALIZED) {
                zzjbVar = zzjcVar.zzb.get(zzaVar);
            }
            if (zzjbVar != null) {
                enumMap.put(zzaVar, zzjbVar);
            }
        }
        return new zzjc(enumMap, this.zzc);
    }

    public static zzjb zza(char c2) {
        if (c2 == '+') {
            return zzjb.POLICY;
        }
        if (c2 == '0') {
            return zzjb.DENIED;
        }
        if (c2 != '1') {
            return zzjb.UNINITIALIZED;
        }
        return zzjb.GRANTED;
    }

    public static String zzb(zzjb zzjbVar) {
        int iOrdinal = zzjbVar.ordinal();
        if (iOrdinal == 2) {
            return "denied";
        }
        if (iOrdinal != 3) {
            return null;
        }
        return "granted";
    }

    public static zzjb zza(Boolean bool) {
        if (bool == null) {
            return zzjb.UNINITIALIZED;
        }
        if (bool.booleanValue()) {
            return zzjb.GRANTED;
        }
        return zzjb.DENIED;
    }

    public final boolean zzb(zzjc zzjcVar, zza... zzaVarArr) {
        for (zza zzaVar : zzaVarArr) {
            zzjb zzjbVar = this.zzb.get(zzaVar);
            zzjb zzjbVar2 = zzjcVar.zzb.get(zzaVar);
            zzjb zzjbVar3 = zzjb.DENIED;
            if (zzjbVar == zzjbVar3 && zzjbVar2 != zzjbVar3) {
                return true;
            }
        }
        return false;
    }

    public static zzjc zza(Bundle bundle, int i) {
        if (bundle == null) {
            return new zzjc(null, null, i);
        }
        EnumMap enumMap = new EnumMap(zza.class);
        for (zza zzaVar : zzjd.zza(zzjd.STORAGE)) {
            enumMap.put(zzaVar, zza(bundle.getString(zzaVar.zze)));
        }
        return new zzjc(enumMap, i);
    }

    public static zzjc zza(zzjb zzjbVar, zzjb zzjbVar2, int i) {
        EnumMap enumMap = new EnumMap(zza.class);
        enumMap.put(zza.AD_STORAGE, zzjbVar);
        enumMap.put(zza.ANALYTICS_STORAGE, zzjbVar2);
        return new zzjc(enumMap, -10);
    }

    public static zzjc zza(String str, int i) {
        EnumMap enumMap = new EnumMap(zza.class);
        if (str == null) {
            str = "";
        }
        zza[] zzaVarArrZza = zzjd.STORAGE.zza();
        for (int i2 = 0; i2 < zzaVarArrZza.length; i2++) {
            zza zzaVar = zzaVarArrZza[i2];
            int i3 = i2 + 2;
            if (i3 < str.length()) {
                enumMap.put(zzaVar, zza(str.charAt(i3)));
            } else {
                enumMap.put(zzaVar, zzjb.UNINITIALIZED);
            }
        }
        return new zzjc(enumMap, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzjc zza(zzjc zzjcVar) {
        EnumMap enumMap = new EnumMap(zza.class);
        for (zza zzaVar : zzjd.zza(zzjd.STORAGE)) {
            zzjb zzjbVar = this.zzb.get(zzaVar);
            zzjb zzjbVar2 = zzjcVar.zzb.get(zzaVar);
            if (zzjbVar != null) {
                if (zzjbVar2 != null) {
                    zzjb zzjbVar3 = zzjb.UNINITIALIZED;
                    if (zzjbVar != zzjbVar3) {
                        if (zzjbVar2 != zzjbVar3) {
                            zzjb zzjbVar4 = zzjb.POLICY;
                            if (zzjbVar == zzjbVar4) {
                                zzjbVar = zzjbVar2;
                            } else if (zzjbVar2 != zzjbVar4) {
                                zzjb zzjbVar5 = zzjb.DENIED;
                                zzjbVar = (zzjbVar == zzjbVar5 || zzjbVar2 == zzjbVar5) ? zzjbVar5 : zzjb.GRANTED;
                            }
                        }
                    }
                }
            }
            if (zzjbVar != null) {
                enumMap.put(zzaVar, zzjbVar);
            }
        }
        return new zzjc(enumMap, 100);
    }

    public static String zza(int i) {
        if (i == -30) {
            return "TCF";
        }
        if (i == -20) {
            return "API";
        }
        if (i == -10) {
            return "MANIFEST";
        }
        if (i == 0) {
            return "1P_API";
        }
        if (i == 30) {
            return "1P_INIT";
        }
        if (i == 90) {
            return "REMOTE_CONFIG";
        }
        if (i != 100) {
            return "OTHER";
        }
        return "UNKNOWN";
    }

    public static String zza(Bundle bundle) {
        String string;
        zza[] zzaVarArrZza = zzjd.zza(zzjd.STORAGE);
        int length = zzaVarArrZza.length;
        int i = 0;
        while (true) {
            Boolean bool = null;
            if (i >= length) {
                return null;
            }
            zza zzaVar = zzaVarArrZza[i];
            if (bundle.containsKey(zzaVar.zze) && (string = bundle.getString(zzaVar.zze)) != null) {
                if (string.equals("granted")) {
                    bool = Boolean.TRUE;
                } else if (string.equals("denied")) {
                    bool = Boolean.FALSE;
                }
                if (bool == null) {
                    return string;
                }
            }
            i++;
        }
    }

    public final boolean zza(zzjc zzjcVar, zza... zzaVarArr) {
        for (zza zzaVar : zzaVarArr) {
            if (!zzjcVar.zza(zzaVar) && zza(zzaVar)) {
                return true;
            }
        }
        return false;
    }

    public final boolean zza(zza zzaVar) {
        return this.zzb.get(zzaVar) != zzjb.DENIED;
    }
}
