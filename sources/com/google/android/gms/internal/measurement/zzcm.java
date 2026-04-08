package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzcm {
    public static final zzcm zza;
    static final zzcm zzb;

    static {
        zzcl zzclVarZzb = new zzcd().zza("").zza(false).zzb(false);
        zzco zzcoVar = zzco.READ_AND_WRITE;
        zza = zzclVarZzb.zza(zzcoVar).zza();
        zzb = new zzcd().zza("").zza(false).zzb(true).zza(zzcoVar).zza();
    }

    public abstract zzcc zza();

    public abstract zzcb zzb();

    public abstract zzco zzc();

    public abstract String zzd();

    public abstract boolean zze();

    public abstract boolean zzf();
}
