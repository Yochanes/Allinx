package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.IInterface;
import androidx.annotation.Nullable;
import java.util.List;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public interface zzgb extends IInterface {
    zzak zza(zzp zzpVar);

    List<zznk> zza(zzp zzpVar, Bundle bundle);

    @Nullable
    List<zzok> zza(zzp zzpVar, boolean z2);

    List<zzaf> zza(@Nullable String str, @Nullable String str2, zzp zzpVar);

    List<zzaf> zza(String str, @Nullable String str2, @Nullable String str3);

    List<zzok> zza(String str, @Nullable String str2, @Nullable String str3, boolean z2);

    List<zzok> zza(@Nullable String str, @Nullable String str2, boolean z2, zzp zzpVar);

    void zza(long j, @Nullable String str, @Nullable String str2, String str3);

    void zza(Bundle bundle, zzp zzpVar);

    void zza(zzaf zzafVar);

    void zza(zzaf zzafVar, zzp zzpVar);

    void zza(zzbh zzbhVar, zzp zzpVar);

    void zza(zzbh zzbhVar, String str, @Nullable String str2);

    void zza(zzok zzokVar, zzp zzpVar);

    @Nullable
    byte[] zza(zzbh zzbhVar, String str);

    @Nullable
    String zzb(zzp zzpVar);

    void zzb(Bundle bundle, zzp zzpVar);

    void zzc(zzp zzpVar);

    void zzd(zzp zzpVar);

    void zze(zzp zzpVar);

    void zzf(zzp zzpVar);

    void zzg(zzp zzpVar);

    void zzh(zzp zzpVar);

    void zzi(zzp zzpVar);
}
