package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@VisibleForTesting
public final class zzji {
    final Context zza;

    @Nullable
    String zzb;

    @Nullable
    String zzc;

    @Nullable
    String zzd;

    @Nullable
    Boolean zze;
    long zzf;

    @Nullable
    com.google.android.gms.internal.measurement.zzdt zzg;
    boolean zzh;

    @Nullable
    Long zzi;

    @Nullable
    String zzj;

    @VisibleForTesting
    public zzji(Context context, @Nullable com.google.android.gms.internal.measurement.zzdt zzdtVar, @Nullable Long l) {
        this.zzh = true;
        Preconditions.checkNotNull(context);
        Context applicationContext = context.getApplicationContext();
        Preconditions.checkNotNull(applicationContext);
        this.zza = applicationContext;
        this.zzi = l;
        if (zzdtVar != null) {
            this.zzg = zzdtVar;
            this.zzb = zzdtVar.zzf;
            this.zzc = zzdtVar.zze;
            this.zzd = zzdtVar.zzd;
            this.zzh = zzdtVar.zzc;
            this.zzf = zzdtVar.zzb;
            this.zzj = zzdtVar.zzh;
            Bundle bundle = zzdtVar.zzg;
            if (bundle != null) {
                this.zze = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
