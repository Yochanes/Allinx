package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class zzoc {
    static final /* synthetic */ int[] zza;

    static {
        int[] iArr = new int[zzjb.values().length];
        zza = iArr;
        try {
            iArr[zzjb.POLICY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            zza[zzjb.GRANTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            zza[zzjb.DENIED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            zza[zzjb.UNINITIALIZED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
