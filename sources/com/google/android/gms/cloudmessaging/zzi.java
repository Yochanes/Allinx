package com.google.android.gms.cloudmessaging;

import android.os.IBinder;
import android.os.RemoteException;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class zzi implements Runnable {
    public final /* synthetic */ zzp zza;
    public final /* synthetic */ IBinder zzb;

    public /* synthetic */ zzi(zzp zzpVar, IBinder iBinder) {
        this.zza = zzpVar;
        this.zzb = iBinder;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzp zzpVar = this.zza;
        IBinder iBinder = this.zzb;
        synchronized (zzpVar) {
            if (iBinder == null) {
                zzpVar.zza(0, "Null service connection");
                return;
            }
            try {
                zzpVar.zzc = new zzq(iBinder);
                zzpVar.zza = 2;
                zzpVar.zzc();
            } catch (RemoteException e) {
                zzpVar.zza(0, e.getMessage());
            }
        }
    }
}
