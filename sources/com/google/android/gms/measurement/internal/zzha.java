package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final class zzha {
    private final String zza;
    private boolean zzb;
    private String zzc;
    private final /* synthetic */ zzgu zzd;

    public zzha(zzgu zzguVar, String str, String str2) {
        this.zzd = zzguVar;
        Preconditions.checkNotEmpty(str);
        this.zza = str;
    }

    @WorkerThread
    public final String zza() {
        if (!this.zzb) {
            this.zzb = true;
            this.zzc = this.zzd.zzg().getString(this.zza, null);
        }
        return this.zzc;
    }

    @WorkerThread
    public final void zza(String str) {
        SharedPreferences.Editor editorEdit = this.zzd.zzg().edit();
        editorEdit.putString(this.zza, str);
        editorEdit.apply();
        this.zzc = str;
    }
}
