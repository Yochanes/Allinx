package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.legacy.content.WakefulBroadcastReceiver;
import com.google.android.gms.measurement.internal.zzmu;
import com.google.android.gms.measurement.internal.zzmy;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final class AppMeasurementService extends Service implements zzmy {
    private zzmu<AppMeasurementService> zza;

    private final zzmu<AppMeasurementService> zza() {
        if (this.zza == null) {
            this.zza = new zzmu<>(this);
        }
        return this.zza;
    }

    @Override // android.app.Service
    @Nullable
    @MainThread
    public final IBinder onBind(@NonNull Intent intent) {
        return zza().zza(intent);
    }

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

    @Override // android.app.Service
    @MainThread
    public final int onStartCommand(@NonNull Intent intent, int i, int i2) {
        return zza().zza(intent, i, i2);
    }

    @Override // android.app.Service
    @MainThread
    public final boolean onUnbind(@NonNull Intent intent) {
        return zza().zzc(intent);
    }

    @Override // com.google.android.gms.measurement.internal.zzmy
    public final void zza(@NonNull Intent intent) {
        WakefulBroadcastReceiver.completeWakefulIntent(intent);
    }

    @Override // com.google.android.gms.measurement.internal.zzmy
    public final void zza(@NonNull JobParameters jobParameters, boolean z2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.measurement.internal.zzmy
    public final boolean zza(int i) {
        return stopSelfResult(i);
    }
}
