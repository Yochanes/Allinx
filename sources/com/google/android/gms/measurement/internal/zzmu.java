package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.MainThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzmy;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final class zzmu<T extends Context & zzmy> {
    private final T zza;

    public zzmu(T t) {
        Preconditions.checkNotNull(t);
        this.zza = t;
    }

    private final zzgi zzc() {
        return zzhw.zza(this.zza, null, null).zzj();
    }

    @MainThread
    public final int zza(Intent intent, int i, int i2) {
        zzgi zzgiVarZzj = zzhw.zza(this.zza, null, null).zzj();
        if (intent == null) {
            zzgiVarZzj.zzu().zza("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        zzgiVarZzj.zzp().zza("Local AppMeasurementService called. startId, action", Integer.valueOf(i2), action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            zza(new zzmw(this, i2, zzgiVarZzj, intent));
        }
        return 2;
    }

    @MainThread
    public final void zzb() {
        zzhw.zza(this.zza, null, null).zzj().zzp().zza("Local AppMeasurementService is shutting down");
    }

    @MainThread
    public final boolean zzc(Intent intent) {
        if (intent == null) {
            zzc().zzg().zza("onUnbind called with null intent");
            return true;
        }
        zzc().zzp().zza("onUnbind called for intent. action", intent.getAction());
        return true;
    }

    @MainThread
    public final void zzb(Intent intent) {
        if (intent == null) {
            zzc().zzg().zza("onRebind called with null intent");
        } else {
            zzc().zzp().zza("onRebind called. action", intent.getAction());
        }
    }

    @MainThread
    public final IBinder zza(Intent intent) {
        if (intent == null) {
            zzc().zzg().zza("onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new zzia(zznv.zza(this.zza));
        }
        zzc().zzu().zza("onBind received unknown action", action);
        return null;
    }

    public final /* synthetic */ void zza(int i, zzgi zzgiVar, Intent intent) {
        if (this.zza.zza(i)) {
            zzgiVar.zzp().zza("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i));
            zzc().zzp().zza("Completed wakeful intent.");
            this.zza.zza(intent);
        }
    }

    public final /* synthetic */ void zza(zzgi zzgiVar, JobParameters jobParameters) {
        zzgiVar.zzp().zza("AppMeasurementJobService processed last upload request.");
        this.zza.zza(jobParameters, false);
    }

    @MainThread
    public final void zza() {
        zzhw.zza(this.zza, null, null).zzj().zzp().zza("Local AppMeasurementService is starting up");
    }

    private final void zza(Runnable runnable) {
        zznv zznvVarZza = zznv.zza(this.zza);
        zznvVarZza.zzl().zzb(new zzmz(this, zznvVarZza, runnable));
    }

    @TargetApi(ConnectionResult.API_DISABLED_FOR_CONNECTION)
    @MainThread
    public final boolean zza(JobParameters jobParameters) {
        zzgi zzgiVarZzj = zzhw.zza(this.zza, null, null).zzj();
        String string = jobParameters.getExtras().getString("action");
        zzgiVarZzj.zzp().zza("Local AppMeasurementJobService called. action", string);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(string)) {
            return true;
        }
        zza(new zzmx(this, zzgiVarZzj, jobParameters));
        return true;
    }
}
