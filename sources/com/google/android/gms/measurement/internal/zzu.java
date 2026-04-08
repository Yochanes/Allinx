package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzfn;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class zzu {
    static final /* synthetic */ int[] zza;
    static final /* synthetic */ int[] zzb;

    static {
        int[] iArr = new int[zzfn.zzd.zzb.values().length];
        zzb = iArr;
        try {
            iArr[zzfn.zzd.zzb.LESS_THAN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            zzb[zzfn.zzd.zzb.GREATER_THAN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            zzb[zzfn.zzd.zzb.EQUAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            zzb[zzfn.zzd.zzb.BETWEEN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        int[] iArr2 = new int[zzfn.zzf.zzb.values().length];
        zza = iArr2;
        try {
            iArr2[zzfn.zzf.zzb.REGEXP.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            zza[zzfn.zzf.zzb.BEGINS_WITH.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            zza[zzfn.zzf.zzb.ENDS_WITH.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            zza[zzfn.zzf.zzb.PARTIAL.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            zza[zzfn.zzf.zzb.EXACT.ordinal()] = 5;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            zza[zzfn.zzf.zzb.IN_LIST.ordinal()] = 6;
        } catch (NoSuchFieldError unused10) {
        }
    }
}
