package com.google.android.gms.cloudmessaging;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import androidx.annotation.MainThread;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
final class zzp implements ServiceConnection {
    zzq zzc;
    final /* synthetic */ zzv zzf;
    int zza = 0;
    final Messenger zzb = new Messenger(new com.google.android.gms.internal.cloudmessaging.zzf(Looper.getMainLooper(), new zzm(this)));
    final Queue zzd = new ArrayDeque();
    final SparseArray zze = new SparseArray();

    public /* synthetic */ zzp(zzv zzvVar, zzo zzoVar) {
        this.zzf = zzvVar;
    }

    @Override // android.content.ServiceConnection
    @MainThread
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        zzv.zze(this.zzf).execute(new zzi(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    @MainThread
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        zzv.zze(this.zzf).execute(new zzl(this));
    }

    public final synchronized void zza(int i, @Nullable String str) {
        zzb(i, str, null);
    }

    public final synchronized void zzb(int i, @Nullable String str, @Nullable Throwable th) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Disconnected: ".concat(String.valueOf(str)));
            }
            int i2 = this.zza;
            if (i2 == 0) {
                throw new IllegalStateException();
            }
            if (i2 != 1 && i2 != 2) {
                if (i2 != 3) {
                    return;
                }
                this.zza = 4;
                return;
            }
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.zza = 4;
            ConnectionTracker.getInstance().unbindService(zzv.zza(this.zzf), this);
            zzt zztVar = new zzt(i, str, th);
            Iterator it = this.zzd.iterator();
            while (it.hasNext()) {
                ((zzs) it.next()).zzc(zztVar);
            }
            this.zzd.clear();
            for (int i3 = 0; i3 < this.zze.size(); i3++) {
                ((zzs) this.zze.valueAt(i3)).zzc(zztVar);
            }
            this.zze.clear();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void zzc() {
        zzv.zze(this.zzf).execute(new zzj(this));
    }

    public final synchronized void zzd() {
        if (this.zza == 1) {
            zza(1, "Timed out while binding");
        }
    }

    public final synchronized void zze(int i) {
        zzs zzsVar = (zzs) this.zze.get(i);
        if (zzsVar != null) {
            Log.w("MessengerIpcClient", "Timing out request: " + i);
            this.zze.remove(i);
            zzsVar.zzc(new zzt(3, "Timed out waiting for response", null));
            zzf();
        }
    }

    public final synchronized void zzf() {
        try {
            if (this.zza == 2 && this.zzd.isEmpty() && this.zze.size() == 0) {
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
                }
                this.zza = 3;
                ConnectionTracker.getInstance().unbindService(zzv.zza(this.zzf), this);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean zzg(zzs zzsVar) {
        int i = this.zza;
        if (i != 0) {
            if (i == 1) {
                this.zzd.add(zzsVar);
                return true;
            }
            if (i != 2) {
                return false;
            }
            this.zzd.add(zzsVar);
            zzc();
            return true;
        }
        this.zzd.add(zzsVar);
        Preconditions.checkState(this.zza == 0);
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Starting bind to GmsCore");
        }
        this.zza = 1;
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gms");
        try {
            if (ConnectionTracker.getInstance().bindService(zzv.zza(this.zzf), intent, this, 1)) {
                zzv.zze(this.zzf).schedule(new zzk(this), 30L, TimeUnit.SECONDS);
            } else {
                zza(0, "Unable to bind to service");
            }
        } catch (SecurityException e) {
            zzb(0, "Unable to bind to service", e);
        }
        return true;
    }
}
