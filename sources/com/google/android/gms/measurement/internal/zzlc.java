package com.google.android.gms.measurement.internal;

import java.util.Map;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class zzlc implements Runnable {
    private /* synthetic */ zzld zza;
    private /* synthetic */ int zzb;
    private /* synthetic */ Exception zzc;
    private /* synthetic */ byte[] zzd;
    private /* synthetic */ Map zze;

    public /* synthetic */ zzlc(zzld zzldVar, int i, Exception exc, byte[] bArr, Map map) {
        this.zza = zzldVar;
        this.zzb = i;
        this.zzc = exc;
        this.zzd = bArr;
        this.zze = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zza(this.zzb, this.zzc, this.zzd, this.zze);
    }
}
