package com.google.android.gms.measurement.internal;

import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@WorkerThread
final class zzgr implements Runnable {
    private final zzgo zza;
    private final int zzb;
    private final Throwable zzc;
    private final byte[] zzd;
    private final String zze;
    private final Map<String, List<String>> zzf;

    public /* synthetic */ zzgr(String str, zzgo zzgoVar, int i, Throwable th, byte[] bArr, Map map, zzgq zzgqVar) {
        this(str, zzgoVar, i, th, bArr, map);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zza(this.zze, this.zzb, this.zzc, this.zzd, this.zzf);
    }

    private zzgr(String str, zzgo zzgoVar, int i, Throwable th, byte[] bArr, Map<String, List<String>> map) {
        Preconditions.checkNotNull(zzgoVar);
        this.zza = zzgoVar;
        this.zzb = i;
        this.zzc = th;
        this.zzd = bArr;
        this.zze = str;
        this.zzf = map;
    }
}
