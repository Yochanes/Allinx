package com.google.android.gms.cloudmessaging;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class zzm implements Handler.Callback {
    public final /* synthetic */ zzp zza;

    public /* synthetic */ zzm(zzp zzpVar) {
        this.zza = zzpVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.arg1;
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Received response to request: " + i);
        }
        zzp zzpVar = this.zza;
        synchronized (zzpVar) {
            try {
                zzs zzsVar = (zzs) zzpVar.zze.get(i);
                if (zzsVar == null) {
                    Log.w("MessengerIpcClient", "Received response for unknown request: " + i);
                    return true;
                }
                zzpVar.zze.remove(i);
                zzpVar.zzf();
                Bundle data = message.getData();
                if (data.getBoolean("unsupported", false)) {
                    zzsVar.zzc(new zzt(4, "Not supported by GmsCore", null));
                    return true;
                }
                zzsVar.zza(data);
                return true;
            } finally {
            }
        }
    }
}
