package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzjc;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaz {
    private static final zzaz zza = new zzaz(null, 100);
    private final int zzb;
    private final String zzc;
    private final Boolean zzd;
    private final String zze;
    private final EnumMap<zzjc.zza, zzjb> zzf;

    public zzaz(Boolean bool, int i) {
        this(bool, i, (Boolean) null, (String) null);
    }

    private final String zzh() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.zzb);
        for (zzjc.zza zzaVar : zzjd.DMA.zza()) {
            sb.append(":");
            sb.append(zzjc.zza(this.zzf.get(zzaVar)));
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzaz)) {
            return false;
        }
        zzaz zzazVar = (zzaz) obj;
        if (this.zzc.equalsIgnoreCase(zzazVar.zzc) && Objects.equals(this.zzd, zzazVar.zzd)) {
            return Objects.equals(this.zze, zzazVar.zze);
        }
        return false;
    }

    public final int hashCode() {
        Boolean bool = this.zzd;
        int i = bool == null ? 3 : bool == Boolean.TRUE ? 7 : 13;
        String str = this.zze;
        return ((str == null ? 17 : str.hashCode()) * 137) + (i * 29) + this.zzc.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("source=");
        sb.append(zzjc.zza(this.zzb));
        for (zzjc.zza zzaVar : zzjd.DMA.zza()) {
            sb.append(",");
            sb.append(zzaVar.zze);
            sb.append("=");
            zzjb zzjbVar = this.zzf.get(zzaVar);
            if (zzjbVar == null) {
                sb.append("uninitialized");
            } else {
                int i = zzay.zza[zzjbVar.ordinal()];
                if (i == 1) {
                    sb.append("uninitialized");
                } else if (i == 2) {
                    sb.append("eu_consent_policy");
                } else if (i == 3) {
                    sb.append("denied");
                } else if (i == 4) {
                    sb.append("granted");
                }
            }
        }
        if (this.zzd != null) {
            sb.append(",isDmaRegion=");
            sb.append(this.zzd);
        }
        if (this.zze != null) {
            sb.append(",cpsDisplayStr=");
            sb.append(this.zze);
        }
        return sb.toString();
    }

    public final int zza() {
        return this.zzb;
    }

    public final Bundle zzb() {
        Bundle bundle = new Bundle();
        Iterator it = this.zzf.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String strZzb = zzjc.zzb((zzjb) entry.getValue());
            if (strZzb != null) {
                bundle.putString(((zzjc.zza) entry.getKey()).zze, strZzb);
            }
        }
        Boolean bool = this.zzd;
        if (bool != null) {
            bundle.putString("is_dma_region", bool.toString());
        }
        String str = this.zze;
        if (str != null) {
            bundle.putString("cps_display_str", str);
        }
        return bundle;
    }

    public final zzjb zzc() {
        zzjb zzjbVar = this.zzf.get(zzjc.zza.AD_USER_DATA);
        return zzjbVar == null ? zzjb.UNINITIALIZED : zzjbVar;
    }

    public final Boolean zzd() {
        return this.zzd;
    }

    public final String zze() {
        return this.zze;
    }

    public final String zzf() {
        return this.zzc;
    }

    public final boolean zzg() {
        Iterator<zzjb> it = this.zzf.values().iterator();
        while (it.hasNext()) {
            if (it.next() != zzjb.UNINITIALIZED) {
                return true;
            }
        }
        return false;
    }

    public zzaz(Boolean bool, int i, Boolean bool2, String str) {
        EnumMap<zzjc.zza, zzjb> enumMap = new EnumMap<>(zzjc.zza.class);
        this.zzf = enumMap;
        enumMap.put(zzjc.zza.AD_USER_DATA, zzjc.zza(bool));
        this.zzb = i;
        this.zzc = zzh();
        this.zzd = bool2;
        this.zze = str;
    }

    public static zzaz zza(Bundle bundle, int i) {
        if (bundle == null) {
            return new zzaz(null, i);
        }
        EnumMap enumMap = new EnumMap(zzjc.zza.class);
        for (zzjc.zza zzaVar : zzjd.DMA.zza()) {
            enumMap.put(zzaVar, zzjc.zza(bundle.getString(zzaVar.zze)));
        }
        return new zzaz((EnumMap<zzjc.zza, zzjb>) enumMap, i, bundle.containsKey("is_dma_region") ? Boolean.valueOf(bundle.getString("is_dma_region")) : null, bundle.getString("cps_display_str"));
    }

    private zzaz(EnumMap<zzjc.zza, zzjb> enumMap, int i, Boolean bool, String str) {
        EnumMap<zzjc.zza, zzjb> enumMap2 = new EnumMap<>(zzjc.zza.class);
        this.zzf = enumMap2;
        enumMap2.putAll(enumMap);
        this.zzb = i;
        this.zzc = zzh();
        this.zzd = bool;
        this.zze = str;
    }

    public static zzaz zza(zzjb zzjbVar, int i) {
        EnumMap enumMap = new EnumMap(zzjc.zza.class);
        enumMap.put(zzjc.zza.AD_USER_DATA, zzjbVar);
        return new zzaz((EnumMap<zzjc.zza, zzjb>) enumMap, -10, (Boolean) null, (String) null);
    }

    public static zzaz zza(String str) {
        if (str != null && str.length() > 0) {
            String[] strArrSplit = str.split(":");
            int i = Integer.parseInt(strArrSplit[0]);
            EnumMap enumMap = new EnumMap(zzjc.zza.class);
            zzjc.zza[] zzaVarArrZza = zzjd.DMA.zza();
            int length = zzaVarArrZza.length;
            int i2 = 1;
            int i3 = 0;
            while (i3 < length) {
                enumMap.put(zzaVarArrZza[i3], zzjc.zza(strArrSplit[i2].charAt(0)));
                i3++;
                i2++;
            }
            return new zzaz((EnumMap<zzjc.zza, zzjb>) enumMap, i, (Boolean) null, (String) null);
        }
        return zza;
    }

    public static Boolean zza(Bundle bundle) {
        zzjb zzjbVarZza;
        if (bundle == null || (zzjbVarZza = zzjc.zza(bundle.getString("ad_personalization"))) == null) {
            return null;
        }
        int i = zzay.zza[zzjbVarZza.ordinal()];
        if (i == 3) {
            return Boolean.FALSE;
        }
        if (i != 4) {
            return null;
        }
        return Boolean.TRUE;
    }
}
