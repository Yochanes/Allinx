package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class zzay {
    static final /* synthetic */ int[] zza;

    static {
        int[] iArr = new int[zzjb.values().length];
        zza = iArr;
        try {
            iArr[zzjb.UNINITIALIZED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            zza[zzjb.POLICY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            zza[zzjb.DENIED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            zza[zzjb.GRANTED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
