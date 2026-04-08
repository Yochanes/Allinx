package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzhg;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class zzi {
    static final /* synthetic */ int[] zza;

    static {
        int[] iArr = new int[zzhg.zzd.zzb.values().length];
        zza = iArr;
        try {
            iArr[zzhg.zzd.zzb.STRING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            zza[zzhg.zzd.zzb.NUMBER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            zza[zzhg.zzd.zzb.BOOLEAN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            zza[zzhg.zzd.zzb.STATEMENT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            zza[zzhg.zzd.zzb.UNKNOWN.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
