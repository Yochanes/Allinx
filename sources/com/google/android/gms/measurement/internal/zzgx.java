package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgx {
    private final String zza;
    private final boolean zzb;
    private boolean zzc;
    private boolean zzd;
    private final /* synthetic */ zzgu zze;

    public zzgx(zzgu zzguVar, String str, boolean z2) {
        this.zze = zzguVar;
        Preconditions.checkNotEmpty(str);
        this.zza = str;
        this.zzb = z2;
    }

    @WorkerThread
    public final void zza(boolean z2) {
        SharedPreferences.Editor editorEdit = this.zze.zzg().edit();
        editorEdit.putBoolean(this.zza, z2);
        editorEdit.apply();
        this.zzd = z2;
    }

    @WorkerThread
    public final boolean zza() {
        if (!this.zzc) {
            this.zzc = true;
            this.zzd = this.zze.zzg().getBoolean(this.zza, this.zzb);
        }
        return this.zzd;
    }
}
