package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgm {

    @NonNull
    public String zza;

    @NonNull
    public String zzb;
    public long zzc;

    @NonNull
    public Bundle zzd;

    public zzgm(@NonNull String str, @NonNull String str2, @Nullable Bundle bundle, long j) {
        this.zza = str;
        this.zzb = str2;
        this.zzd = bundle == null ? new Bundle() : bundle;
        this.zzc = j;
    }

    public final String toString() {
        String str = this.zzb;
        String str2 = this.zza;
        String strValueOf = String.valueOf(this.zzd);
        StringBuilder sbM25v = AbstractC0000a.m25v("origin=", str, ",name=", str2, ",params=");
        sbM25v.append(strValueOf);
        return sbM25v.toString();
    }

    public final zzbh zza() {
        return new zzbh(this.zza, new zzbc(new Bundle(this.zzd)), this.zzb, this.zzc);
    }

    public static zzgm zza(zzbh zzbhVar) {
        return new zzgm(zzbhVar.zza, zzbhVar.zzc, zzbhVar.zzb.zzb(), zzbhVar.zzd);
    }
}
