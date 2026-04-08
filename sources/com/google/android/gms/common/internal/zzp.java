package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.StrictMode;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.analytics.AbstractC1797o;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
final class zzp implements ServiceConnection, zzt {
    final /* synthetic */ zzs zza;
    private final Map zzb = new HashMap();
    private int zzc = 2;
    private boolean zzd;

    @Nullable
    private IBinder zze;
    private final zzo zzf;
    private ComponentName zzg;

    public zzp(zzs zzsVar, zzo zzoVar) {
        this.zza = zzsVar;
        this.zzf = zzoVar;
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (zzs.zzh(this.zza)) {
            try {
                zzs.zzf(this.zza).removeMessages(1, this.zzf);
                this.zze = iBinder;
                this.zzg = componentName;
                Iterator it = this.zzb.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.zzc = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (zzs.zzh(this.zza)) {
            try {
                zzs.zzf(this.zza).removeMessages(1, this.zzf);
                this.zze = null;
                this.zzg = componentName;
                Iterator it = this.zzb.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.zzc = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int zza() {
        return this.zzc;
    }

    public final ComponentName zzb() {
        return this.zzg;
    }

    @Nullable
    public final IBinder zzc() {
        return this.zze;
    }

    public final void zzd(ServiceConnection serviceConnection, ServiceConnection serviceConnection2, String str) {
        this.zzb.put(serviceConnection, serviceConnection2);
    }

    public final void zze(String str, @Nullable Executor executor) throws Throwable {
        zzs zzsVar;
        this.zzc = 3;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (PlatformVersion.isAtLeastS()) {
            StrictMode.setVmPolicy(AbstractC1797o.m10188i(new StrictMode.VmPolicy.Builder(vmPolicy)).build());
        }
        try {
            zzsVar = this.zza;
        } catch (Throwable th) {
            th = th;
        }
        try {
            boolean zZza = zzs.zzg(zzsVar).zza(zzs.zze(zzsVar), str, this.zzf.zzb(zzs.zze(zzsVar)), this, 4225, executor);
            this.zzd = zZza;
            if (zZza) {
                zzs.zzf(this.zza).sendMessageDelayed(zzs.zzf(this.zza).obtainMessage(1, this.zzf), zzs.zzd(this.zza));
            } else {
                this.zzc = 2;
                try {
                    zzs zzsVar2 = this.zza;
                    zzs.zzg(zzsVar2).unbindService(zzs.zze(zzsVar2), this);
                } catch (IllegalArgumentException unused) {
                }
            }
            StrictMode.setVmPolicy(vmPolicy);
        } catch (Throwable th2) {
            th = th2;
            Throwable th3 = th;
            StrictMode.setVmPolicy(vmPolicy);
            throw th3;
        }
    }

    public final void zzf(ServiceConnection serviceConnection, String str) {
        this.zzb.remove(serviceConnection);
    }

    public final void zzg(String str) {
        zzs.zzf(this.zza).removeMessages(1, this.zzf);
        zzs zzsVar = this.zza;
        zzs.zzg(zzsVar).unbindService(zzs.zze(zzsVar), this);
        this.zzd = false;
        this.zzc = 2;
    }

    public final boolean zzh(ServiceConnection serviceConnection) {
        return this.zzb.containsKey(serviceConnection);
    }

    public final boolean zzi() {
        return this.zzb.isEmpty();
    }

    public final boolean zzj() {
        return this.zzd;
    }
}
