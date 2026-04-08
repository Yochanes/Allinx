package com.google.android.gms.cloudmessaging;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class zzl implements Runnable {
    public final /* synthetic */ zzp zza;

    public /* synthetic */ zzl(zzp zzpVar) {
        this.zza = zzpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zza(2, "Service disconnected");
    }
}
