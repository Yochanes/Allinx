package com.google.android.gms.measurement.internal;

import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
final class zzns {
    private String zza;
    private Map<String, String> zzb;

    @NonNull
    private zznt zzc;

    public zzns(String str, zznt zzntVar) {
        this.zza = str;
        this.zzc = zzntVar;
    }

    public final zznt zza() {
        return this.zzc;
    }

    public final String zzb() {
        return this.zza;
    }

    @NonNull
    public final Map<String, String> zzc() {
        Map<String, String> map = this.zzb;
        return map == null ? Collections.EMPTY_MAP : map;
    }

    public zzns(String str, Map<String, String> map, zznt zzntVar) {
        this.zza = str;
        this.zzb = map;
        this.zzc = zzntVar;
    }
}
