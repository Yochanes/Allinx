package com.google.android.gms.measurement.internal;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.measurement.zzgn;
import java.util.Map;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final class zzog {
    private long zza;
    private zzgn.zzj zzb;
    private String zzc;
    private Map<String, String> zzd;

    public /* synthetic */ zzog(long j, zzgn.zzj zzjVar, String str, Map map, zznt zzntVar, zzoi zzoiVar) {
        this(j, zzjVar, str, map, zzntVar);
    }

    public final long zza() {
        return this.zza;
    }

    @Nullable
    public final zzgn.zzj zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zzc;
    }

    public final Map<String, String> zzd() {
        return this.zzd;
    }

    private zzog(long j, zzgn.zzj zzjVar, String str, Map<String, String> map, zznt zzntVar) {
        this.zza = j;
        this.zzb = zzjVar;
        this.zzc = str;
        this.zzd = map;
    }
}
