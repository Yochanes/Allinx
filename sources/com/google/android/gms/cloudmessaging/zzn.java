package com.google.android.gms.cloudmessaging;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class zzn implements Runnable {
    public final /* synthetic */ zzp zza;
    public final /* synthetic */ zzs zzb;

    public /* synthetic */ zzn(zzp zzpVar, zzs zzsVar) {
        this.zza = zzpVar;
        this.zzb = zzsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zze(this.zzb.zza);
    }
}
