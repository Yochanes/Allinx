package com.google.android.gms.measurement;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.measurement.internal.zzmu;
import com.google.android.gms.measurement.internal.zzmy;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@TargetApi(ConnectionResult.API_DISABLED_FOR_CONNECTION)
public final class AppMeasurementJobService extends JobService implements zzmy {
    private zzmu<AppMeasurementJobService> zza;

    @Override // android.app.Service
    @MainThread
    public final void onCreate() {
        super.onCreate();
        zza().zza();
    }

    @Override // android.app.Service
    @MainThread
    public final void onDestroy() {
        zza().zzb();
        super.onDestroy();
    }

    @Override // android.app.Service
    @MainThread
    public final void onRebind(@NonNull Intent intent) {
        zza().zzb(intent);
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(@NonNull JobParameters jobParameters) {
        return zza().zza(jobParameters);
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(@NonNull JobParameters jobParameters) {
        return false;
    }

    @Override // android.app.Service
    @MainThread
    public final boolean onUnbind(@NonNull Intent intent) {
        return zza().zzc(intent);
    }

    @Override // com.google.android.gms.measurement.internal.zzmy
    public final void zza(@NonNull Intent intent) {
    }

    private final zzmu<AppMeasurementJobService> zza() {
        if (this.zza == null) {
            this.zza = new zzmu<>(this);
        }
        return this.zza;
    }

    @Override // com.google.android.gms.measurement.internal.zzmy
    @TargetApi(ConnectionResult.API_DISABLED_FOR_CONNECTION)
    public final void zza(@NonNull JobParameters jobParameters, boolean z2) {
        jobFinished(jobParameters, false);
    }

    @Override // com.google.android.gms.measurement.internal.zzmy
    public final boolean zza(int i) {
        throw new UnsupportedOperationException();
    }
}
