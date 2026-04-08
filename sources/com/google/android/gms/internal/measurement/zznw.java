package com.google.android.gms.internal.measurement;

import java.util.Arrays;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final class zznw {
    private static final zznw zza = new zznw(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zznw() {
        this(0, new int[8], new Object[8], true);
    }

    public static zznw zzc() {
        return zza;
    }

    public static zznw zzd() {
        return new zznw();
    }

    private final void zzf() {
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zznw)) {
            return false;
        }
        zznw zznwVar = (zznw) obj;
        int i = this.zzb;
        if (i == zznwVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zznwVar.zzc;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zznwVar.zzd;
                    int i3 = this.zzb;
                    for (int i4 = 0; i4 < i3; i4++) {
                        if (objArr[i4].equals(objArr2[i4])) {
                        }
                    }
                    return true;
                }
                if (iArr[i2] != iArr2[i2]) {
                    break;
                }
                i2++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzb;
        int i2 = (i + 527) * 31;
        int[] iArr = this.zzc;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = (i2 + i3) * 31;
        Object[] objArr = this.zzd;
        int i6 = this.zzb;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }

    public final int zza() {
        int iZzg;
        int i = this.zze;
        if (i != -1) {
            return i;
        }
        int iZza = 0;
        for (int i2 = 0; i2 < this.zzb; i2++) {
            int i3 = this.zzc[i2];
            int i4 = i3 >>> 3;
            int i5 = i3 & 7;
            if (i5 == 0) {
                iZzg = zzkl.zzg(i4, ((Long) this.zzd[i2]).longValue());
            } else if (i5 == 1) {
                iZzg = zzkl.zzc(i4, ((Long) this.zzd[i2]).longValue());
            } else if (i5 == 2) {
                iZzg = zzkl.zzc(i4, (zzjs) this.zzd[i2]);
            } else if (i5 == 3) {
                iZza = ((zznw) this.zzd[i2]).zza() + (zzkl.zzi(i4) << 1) + iZza;
            } else {
                if (i5 != 5) {
                    throw new IllegalStateException(zzlk.zza());
                }
                iZzg = zzkl.zzf(i4, ((Integer) this.zzd[i2]).intValue());
            }
            iZza = iZzg + iZza;
        }
        this.zze = iZza;
        return iZza;
    }

    public final int zzb() {
        int i = this.zze;
        if (i != -1) {
            return i;
        }
        int iZzd = 0;
        for (int i2 = 0; i2 < this.zzb; i2++) {
            iZzd += zzkl.zzd(this.zzc[i2] >>> 3, (zzjs) this.zzd[i2]);
        }
        this.zze = iZzd;
        return iZzd;
    }

    public final void zze() {
        if (this.zzf) {
            this.zzf = false;
        }
    }

    private zznw(int i, int[] iArr, Object[] objArr, boolean z2) {
        this.zze = -1;
        this.zzb = i;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z2;
    }

    public final void zzb(zzos zzosVar) {
        if (this.zzb == 0) {
            return;
        }
        if (zzosVar.zza() == 1) {
            for (int i = 0; i < this.zzb; i++) {
                zza(this.zzc[i], this.zzd[i], zzosVar);
            }
            return;
        }
        for (int i2 = this.zzb - 1; i2 >= 0; i2--) {
            zza(this.zzc[i2], this.zzd[i2], zzosVar);
        }
    }

    public final zznw zza(zznw zznwVar) {
        if (zznwVar.equals(zza)) {
            return this;
        }
        zzf();
        int i = this.zzb + zznwVar.zzb;
        zza(i);
        System.arraycopy(zznwVar.zzc, 0, this.zzc, this.zzb, zznwVar.zzb);
        System.arraycopy(zznwVar.zzd, 0, this.zzd, this.zzb, zznwVar.zzb);
        this.zzb = i;
        return this;
    }

    public static zznw zza(zznw zznwVar, zznw zznwVar2) {
        int i = zznwVar.zzb + zznwVar2.zzb;
        int[] iArrCopyOf = Arrays.copyOf(zznwVar.zzc, i);
        System.arraycopy(zznwVar2.zzc, 0, iArrCopyOf, zznwVar.zzb, zznwVar2.zzb);
        Object[] objArrCopyOf = Arrays.copyOf(zznwVar.zzd, i);
        System.arraycopy(zznwVar2.zzd, 0, objArrCopyOf, zznwVar.zzb, zznwVar2.zzb);
        return new zznw(i, iArrCopyOf, objArrCopyOf, true);
    }

    private final void zza(int i) {
        int[] iArr = this.zzc;
        if (i > iArr.length) {
            int i2 = this.zzb;
            int i3 = (i2 / 2) + i2;
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.zzc = Arrays.copyOf(iArr, i);
            this.zzd = Arrays.copyOf(this.zzd, i);
        }
    }

    public final void zza(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.zzb; i2++) {
            zzmm.zza(sb, i, String.valueOf(this.zzc[i2] >>> 3), this.zzd[i2]);
        }
    }

    public final void zza(int i, Object obj) {
        zzf();
        zza(this.zzb + 1);
        int[] iArr = this.zzc;
        int i2 = this.zzb;
        iArr[i2] = i;
        this.zzd[i2] = obj;
        this.zzb = i2 + 1;
    }

    public final void zza(zzos zzosVar) {
        if (zzosVar.zza() == 2) {
            for (int i = this.zzb - 1; i >= 0; i--) {
                zzosVar.zza(this.zzc[i] >>> 3, this.zzd[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.zzb; i2++) {
            zzosVar.zza(this.zzc[i2] >>> 3, this.zzd[i2]);
        }
    }

    private static void zza(int i, Object obj, zzos zzosVar) {
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            zzosVar.zzb(i2, ((Long) obj).longValue());
            return;
        }
        if (i3 == 1) {
            zzosVar.zza(i2, ((Long) obj).longValue());
            return;
        }
        if (i3 == 2) {
            zzosVar.zza(i2, (zzjs) obj);
            return;
        }
        if (i3 != 3) {
            if (i3 == 5) {
                zzosVar.zzb(i2, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(zzlk.zza());
        }
        if (zzosVar.zza() == 1) {
            zzosVar.zzb(i2);
            ((zznw) obj).zzb(zzosVar);
            zzosVar.zza(i2);
        } else {
            zzosVar.zza(i2);
            ((zznw) obj).zzb(zzosVar);
            zzosVar.zzb(i2);
        }
    }
}
