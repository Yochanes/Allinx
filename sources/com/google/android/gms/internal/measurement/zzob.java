package com.google.android.gms.internal.measurement;

import com.google.common.base.Ascii;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
final class zzob {
    private static boolean zza(byte b2) {
        return b2 > -65;
    }

    public static /* synthetic */ void zza(byte b2, byte b3, byte b4, byte b5, char[] cArr, int i) throws zzlk {
        if (!zza(b3)) {
            if ((((b3 + 112) + (b2 << Ascii.f42537FS)) >> 30) == 0 && !zza(b4) && !zza(b5)) {
                int i2 = ((b2 & 7) << 18) | ((b3 & 63) << 12) | ((b4 & 63) << 6) | (b5 & 63);
                cArr[i] = (char) ((i2 >>> 10) + 55232);
                cArr[i + 1] = (char) ((i2 & 1023) + 56320);
                return;
            }
        }
        throw zzlk.zzd();
    }

    public static /* synthetic */ void zza(byte b2, char[] cArr, int i) {
        cArr[i] = (char) b2;
    }

    public static /* synthetic */ void zza(byte b2, byte b3, byte b4, char[] cArr, int i) throws zzlk {
        if (!zza(b3) && ((b2 != -32 || b3 >= -96) && ((b2 != -19 || b3 < -96) && !zza(b4)))) {
            cArr[i] = (char) (((b2 & Ascii.f42543SI) << 12) | ((b3 & 63) << 6) | (b4 & 63));
            return;
        }
        throw zzlk.zzd();
    }

    public static /* synthetic */ void zza(byte b2, byte b3, char[] cArr, int i) throws zzlk {
        if (b2 >= -62 && !zza(b3)) {
            cArr[i] = (char) (((b2 & Ascii.f42546US) << 6) | (b3 & 63));
            return;
        }
        throw zzlk.zzd();
    }
}
