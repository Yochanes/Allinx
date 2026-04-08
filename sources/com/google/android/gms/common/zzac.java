package com.google.android.gms.common;

import androidx.annotation.NonNull;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
final class zzac {
    private final String zza;
    private final PackageVerificationResult zzb;

    public zzac(@NonNull String str, @NonNull PackageVerificationResult packageVerificationResult) {
        this.zza = str;
        this.zzb = packageVerificationResult;
    }

    public static /* bridge */ /* synthetic */ PackageVerificationResult zza(zzac zzacVar) {
        return zzacVar.zzb;
    }

    public static /* bridge */ /* synthetic */ String zzb(zzac zzacVar) {
        return zzacVar.zza;
    }
}
