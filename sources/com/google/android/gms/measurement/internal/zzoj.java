package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzgn;
import java.util.Map;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
final class zzoj {
    private long zza;
    private zzgn.zzj zzb;
    private String zzc;
    private Map<String, String> zzd;
    private zznt zze;

    public final zzoj zza(zzgn.zzj zzjVar) {
        this.zzb = zzjVar;
        return this;
    }

    public final zzoj zza(long j) {
        this.zza = j;
        return this;
    }

    public final zzoj zza(Map<String, String> map) {
        this.zzd = map;
        return this;
    }

    public final zzoj zza(zznt zzntVar) {
        this.zze = zzntVar;
        return this;
    }

    public final zzoj zza(String str) {
        this.zzc = str;
        return this;
    }

    public final zzog zza() {
        return new zzog(this.zza, this.zzb, this.zzc, this.zzd, this.zze, null);
    }
}
