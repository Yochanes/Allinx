package com.google.android.gms.cloudmessaging;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class zzj implements Runnable {
    public final /* synthetic */ zzp zza;

    public /* synthetic */ zzj(zzp zzpVar) {
        this.zza = zzpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzs zzsVar;
        while (true) {
            zzp zzpVar = this.zza;
            synchronized (zzpVar) {
                try {
                    if (zzpVar.zza != 2) {
                        return;
                    }
                    if (zzpVar.zzd.isEmpty()) {
                        zzpVar.zzf();
                        return;
                    } else {
                        zzsVar = (zzs) zzpVar.zzd.poll();
                        zzpVar.zze.put(zzsVar.zza, zzsVar);
                        zzv.zze(zzpVar.zzf).schedule(new zzn(zzpVar, zzsVar), 30L, TimeUnit.SECONDS);
                    }
                } finally {
                }
            }
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Sending ".concat(String.valueOf(zzsVar)));
            }
            zzv zzvVar = zzpVar.zzf;
            Messenger messenger = zzpVar.zzb;
            int i = zzsVar.zzc;
            Context contextZza = zzv.zza(zzvVar);
            Message messageObtain = Message.obtain();
            messageObtain.what = i;
            messageObtain.arg1 = zzsVar.zza;
            messageObtain.replyTo = messenger;
            Bundle bundle = new Bundle();
            bundle.putBoolean("oneWay", zzsVar.zzb());
            bundle.putString("pkg", contextZza.getPackageName());
            bundle.putBundle("data", zzsVar.zzd);
            messageObtain.setData(bundle);
            try {
                zzpVar.zzc.zza(messageObtain);
            } catch (RemoteException e) {
                zzpVar.zza(2, e.getMessage());
            }
        }
    }
}
