package com.google.android.gms.internal.measurement;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzkl extends zzjp {
    private static final Logger zzb = Logger.getLogger(zzkl.class.getName());
    private static final boolean zzc = zzny.zzc();
    zzko zza;

    /* JADX INFO: compiled from: Proguard */
    public static class zza extends zzkl {
        private final byte[] zzb;
        private final int zzc;
        private int zzd;

        public zza(byte[] bArr, int i, int i2) {
            super(null);
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            if (((bArr.length - i2) | i2) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i2)));
            }
            this.zzb = bArr;
            this.zzd = 0;
            this.zzc = i2;
        }

        private final void zzc(byte[] bArr, int i, int i2) throws zzb {
            try {
                System.arraycopy(bArr, i, this.zzb, this.zzd, i2);
                this.zzd += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), Integer.valueOf(i2)), e);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzkl
        public final int zza() {
            return this.zzc - this.zzd;
        }

        @Override // com.google.android.gms.internal.measurement.zzkl
        public final void zzb(byte[] bArr, int i, int i2) throws zzb {
            zzc(i2);
            zzc(bArr, 0, i2);
        }

        @Override // com.google.android.gms.internal.measurement.zzkl
        public final void zzd(int i, int i2) throws zzb {
            zzc(i, 0);
            zzc(i2);
        }

        @Override // com.google.android.gms.internal.measurement.zzkl
        public final void zza(byte b2) throws zzb {
            try {
                byte[] bArr = this.zzb;
                int i = this.zzd;
                this.zzd = i + 1;
                bArr[i] = b2;
            } catch (IndexOutOfBoundsException e) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzkl
        public final void zzb(int i, int i2) throws zzb {
            zzc(i, 0);
            zzb(i2);
        }

        @Override // com.google.android.gms.internal.measurement.zzkl
        public final void zza(int i, boolean z2) throws zzb {
            zzc(i, 0);
            zza(z2 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.measurement.zzkl
        public final void zzb(int i) throws zzb {
            if (i >= 0) {
                zzc(i);
            } else {
                zzb(i);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzkl
        public final void zzc(int i, int i2) throws zzb {
            zzc((i << 3) | i2);
        }

        @Override // com.google.android.gms.internal.measurement.zzkl
        public final void zzc(int i) throws zzb {
            while ((i & (-128)) != 0) {
                try {
                    byte[] bArr = this.zzb;
                    int i2 = this.zzd;
                    this.zzd = i2 + 1;
                    bArr[i2] = (byte) (i | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
                    i >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e);
                }
            }
            byte[] bArr2 = this.zzb;
            int i3 = this.zzd;
            this.zzd = i3 + 1;
            bArr2[i3] = (byte) i;
        }

        @Override // com.google.android.gms.internal.measurement.zzkl
        public final void zza(int i, zzjs zzjsVar) throws zzb {
            zzc(i, 2);
            zza(zzjsVar);
        }

        @Override // com.google.android.gms.internal.measurement.zzkl
        public final void zzb(int i, zzjs zzjsVar) throws zzb {
            zzc(1, 3);
            zzd(2, i);
            zza(3, zzjsVar);
            zzc(1, 4);
        }

        @Override // com.google.android.gms.internal.measurement.zzkl
        public final void zza(zzjs zzjsVar) throws zzb {
            zzc(zzjsVar.zzb());
            zzjsVar.zza(this);
        }

        @Override // com.google.android.gms.internal.measurement.zzkl
        public final void zza(int i, int i2) throws zzb {
            zzc(i, 5);
            zza(i2);
        }

        @Override // com.google.android.gms.internal.measurement.zzkl
        public final void zzb(int i, long j) throws zzb {
            zzc(i, 0);
            zzb(j);
        }

        @Override // com.google.android.gms.internal.measurement.zzkl
        public final void zza(int i) throws zzb {
            try {
                byte[] bArr = this.zzb;
                int i2 = this.zzd;
                int i3 = i2 + 1;
                this.zzd = i3;
                bArr[i2] = (byte) i;
                int i4 = i2 + 2;
                this.zzd = i4;
                bArr[i3] = (byte) (i >> 8);
                int i5 = i2 + 3;
                this.zzd = i5;
                bArr[i4] = (byte) (i >> 16);
                this.zzd = i2 + 4;
                bArr[i5] = (byte) (i >>> 24);
            } catch (IndexOutOfBoundsException e) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzkl
        public final void zzb(long j) throws zzb {
            if (zzkl.zzc() && zza() >= 10) {
                while ((j & (-128)) != 0) {
                    byte[] bArr = this.zzb;
                    int i = this.zzd;
                    this.zzd = i + 1;
                    zzny.zza(bArr, i, (byte) (((int) j) | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS));
                    j >>>= 7;
                }
                byte[] bArr2 = this.zzb;
                int i2 = this.zzd;
                this.zzd = i2 + 1;
                zzny.zza(bArr2, i2, (byte) j);
                return;
            }
            while ((j & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.zzb;
                    int i3 = this.zzd;
                    this.zzd = i3 + 1;
                    bArr3[i3] = (byte) (((int) j) | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
                    j >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e);
                }
            }
            byte[] bArr4 = this.zzb;
            int i4 = this.zzd;
            this.zzd = i4 + 1;
            bArr4[i4] = (byte) j;
        }

        @Override // com.google.android.gms.internal.measurement.zzkl
        public final void zza(int i, long j) throws zzb {
            zzc(i, 1);
            zza(j);
        }

        @Override // com.google.android.gms.internal.measurement.zzkl
        public final void zza(long j) throws zzb {
            try {
                byte[] bArr = this.zzb;
                int i = this.zzd;
                int i2 = i + 1;
                this.zzd = i2;
                bArr[i] = (byte) j;
                int i3 = i + 2;
                this.zzd = i3;
                bArr[i2] = (byte) (j >> 8);
                int i4 = i + 3;
                this.zzd = i4;
                bArr[i3] = (byte) (j >> 16);
                int i5 = i + 4;
                this.zzd = i5;
                bArr[i4] = (byte) (j >> 24);
                int i6 = i + 5;
                this.zzd = i6;
                bArr[i5] = (byte) (j >> 32);
                int i7 = i + 6;
                this.zzd = i7;
                bArr[i6] = (byte) (j >> 40);
                int i8 = i + 7;
                this.zzd = i8;
                bArr[i7] = (byte) (j >> 48);
                this.zzd = i + 8;
                bArr[i8] = (byte) (j >> 56);
            } catch (IndexOutOfBoundsException e) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzjp
        public final void zza(byte[] bArr, int i, int i2) throws zzb {
            zzc(bArr, i, i2);
        }

        @Override // com.google.android.gms.internal.measurement.zzkl
        public final void zza(int i, zzml zzmlVar, zznd zzndVar) throws zzb {
            zzc(i, 2);
            zzc(((zzji) zzmlVar).zza(zzndVar));
            zzndVar.zza(zzmlVar, this.zza);
        }

        @Override // com.google.android.gms.internal.measurement.zzkl
        public final void zza(zzml zzmlVar) throws zzb {
            zzc(zzmlVar.zzcb());
            zzmlVar.zza(this);
        }

        @Override // com.google.android.gms.internal.measurement.zzkl
        public final void zza(int i, zzml zzmlVar) throws zzb {
            zzc(1, 3);
            zzd(2, i);
            zzc(3, 2);
            zza(zzmlVar);
            zzc(1, 4);
        }

        @Override // com.google.android.gms.internal.measurement.zzkl
        public final void zza(int i, String str) throws zzb {
            zzc(i, 2);
            zza(str);
        }

        @Override // com.google.android.gms.internal.measurement.zzkl
        public final void zza(String str) throws zzb {
            int i = this.zzd;
            try {
                int iZzj = zzkl.zzj(str.length() * 3);
                int iZzj2 = zzkl.zzj(str.length());
                if (iZzj2 == iZzj) {
                    int i2 = i + iZzj2;
                    this.zzd = i2;
                    int iZza = zzoc.zza(str, this.zzb, i2, zza());
                    this.zzd = i;
                    zzc((iZza - i) - iZzj2);
                    this.zzd = iZza;
                    return;
                }
                zzc(zzoc.zza(str));
                this.zzd = zzoc.zza(str, this.zzb, this.zzd, zza());
            } catch (zzog e) {
                this.zzd = i;
                zza(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new zzb(e2);
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class zzb extends IOException {
        public zzb() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        public zzb(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        public zzb(String str, Throwable th) {
            super(AbstractC0000a.m13j("CodedOutputStream was writing to a flat byte array and ran out of space.: ", str), th);
        }
    }

    public /* synthetic */ zzkl(zzkm zzkmVar) {
        this();
    }

    public static int zza(double d) {
        return 8;
    }

    public static int zzb(int i, boolean z2) {
        return zzj(i << 3) + 1;
    }

    public static int zzc(long j) {
        return 8;
    }

    public static int zzd(int i) {
        return zzg(i);
    }

    public static int zze(int i) {
        return 4;
    }

    public static int zzf(int i, int i2) {
        return zzj(i << 3) + 4;
    }

    public static int zzg(int i) {
        return 4;
    }

    public static int zzh(int i, int i2) {
        return zzj(i << 3) + 4;
    }

    private static long zzi(long j) {
        return (j >> 63) ^ (j << 1);
    }

    public static int zzj(int i, int i2) {
        return zzj(i2) + zzj(i << 3);
    }

    private static int zzl(int i) {
        return (i >> 31) ^ (i << 1);
    }

    public abstract int zza();

    public abstract void zza(byte b2);

    public abstract void zza(int i);

    public abstract void zza(int i, int i2);

    public abstract void zza(int i, long j);

    public abstract void zza(int i, zzjs zzjsVar);

    public abstract void zza(int i, zzml zzmlVar);

    public abstract void zza(int i, zzml zzmlVar, zznd zzndVar);

    public abstract void zza(int i, String str);

    public abstract void zza(int i, boolean z2);

    public abstract void zza(long j);

    public abstract void zza(zzjs zzjsVar);

    public abstract void zza(zzml zzmlVar);

    public abstract void zza(String str);

    public abstract void zzb(int i);

    public abstract void zzb(int i, int i2);

    public abstract void zzb(int i, long j);

    public abstract void zzb(int i, zzjs zzjsVar);

    public abstract void zzb(long j);

    public abstract void zzb(byte[] bArr, int i, int i2);

    public abstract void zzc(int i);

    public abstract void zzc(int i, int i2);

    public abstract void zzd(int i, int i2);

    public final void zzk(int i, int i2) {
        zzd(i, zzl(i2));
    }

    private zzkl() {
    }

    public static int zza(float f) {
        return 4;
    }

    public static int zzb(zzjs zzjsVar) {
        int iZzb = zzjsVar.zzb();
        return zzj(iZzb) + iZzb;
    }

    public static /* bridge */ /* synthetic */ boolean zzc() {
        return zzc;
    }

    public static int zzd(int i, long j) {
        return zzg(j) + zzj(i << 3);
    }

    public static int zze(long j) {
        return 8;
    }

    public static int zzf(int i) {
        return zzg(i);
    }

    public static int zzg(int i, int i2) {
        return zzg(i2) + zzj(i << 3);
    }

    public static int zzh(int i) {
        return zzj(zzl(i));
    }

    public static int zzi(int i, int i2) {
        return zzj(zzl(i2)) + zzj(i << 3);
    }

    public final void zzk(int i) {
        zzc(zzl(i));
    }

    public static int zza(boolean z2) {
        return 1;
    }

    public static int zzc(int i, zzjs zzjsVar) {
        int iZzj = zzj(i << 3);
        int iZzb = zzjsVar.zzb();
        return zzj(iZzb) + iZzb + iZzj;
    }

    public static int zze(int i, int i2) {
        return zzg(i2) + zzj(i << 3);
    }

    public static int zzf(int i, long j) {
        return zzg(zzi(j)) + zzj(i << 3);
    }

    public static int zzj(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public final void zzh(int i, long j) {
        zzb(i, zzi(j));
    }

    public static int zza(byte[] bArr) {
        int length = bArr.length;
        return zzj(length) + length;
    }

    @Deprecated
    public static int zzb(int i, zzml zzmlVar, zznd zzndVar) {
        return ((zzji) zzmlVar).zza(zzndVar) + (zzj(i << 3) << 1);
    }

    public static int zzd(long j) {
        return zzg(j);
    }

    public static int zzg(int i, long j) {
        return zzg(j) + zzj(i << 3);
    }

    public static int zzi(int i) {
        return zzj(i << 3);
    }

    public final void zzh(long j) {
        zzb(zzi(j));
    }

    public static int zzd(int i, zzjs zzjsVar) {
        return zzc(3, zzjsVar) + zzj(2, i) + (zzj(8) << 1);
    }

    public static int zze(int i, long j) {
        return zzj(i << 3) + 8;
    }

    public static int zzf(long j) {
        return zzg(zzi(j));
    }

    public static int zza(int i, double d) {
        return zzj(i << 3) + 8;
    }

    @Deprecated
    public static int zzb(zzml zzmlVar) {
        return zzmlVar.zzcb();
    }

    public static int zzc(int i, long j) {
        return zzj(i << 3) + 8;
    }

    public static int zzg(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public static int zza(int i, float f) {
        return zzj(i << 3) + 4;
    }

    public static int zzb(int i, zzlt zzltVar) {
        int iZzj = zzj(i << 3);
        int iZza = zzltVar.zza();
        return zzj(iZza) + iZza + iZzj;
    }

    public static int zzc(int i, zzml zzmlVar, zznd zzndVar) {
        return zza(zzmlVar, zzndVar) + zzj(i << 3);
    }

    public static int zza(int i, zzlt zzltVar) {
        return zzb(3, zzltVar) + zzj(2, i) + (zzj(8) << 1);
    }

    public static int zzc(zzml zzmlVar) {
        int iZzcb = zzmlVar.zzcb();
        return zzj(iZzcb) + iZzcb;
    }

    public static int zzb(int i, zzml zzmlVar) {
        return zzc(zzmlVar) + zzj(24) + zzj(2, i) + (zzj(8) << 1);
    }

    public static int zza(zzlt zzltVar) {
        int iZza = zzltVar.zza();
        return zzj(iZza) + iZza;
    }

    public static int zza(zzml zzmlVar, zznd zzndVar) {
        int iZza = ((zzji) zzmlVar).zza(zzndVar);
        return zzj(iZza) + iZza;
    }

    public static int zzb(int i, String str) {
        return zzb(str) + zzj(i << 3);
    }

    public final void zza(String str, zzog zzogVar) throws zzb {
        zzb.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzogVar);
        byte[] bytes = str.getBytes(zzle.zza);
        try {
            zzc(bytes.length);
            zza(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e) {
            throw new zzb(e);
        }
    }

    public static int zzb(String str) {
        int length;
        try {
            length = zzoc.zza(str);
        } catch (zzog unused) {
            length = str.getBytes(zzle.zza).length;
        }
        return zzj(length) + length;
    }

    public static zzkl zzb(byte[] bArr) {
        return new zza(bArr, 0, bArr.length);
    }

    public final void zzb() {
        if (zza() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void zzb(boolean z2) {
        zza(z2 ? (byte) 1 : (byte) 0);
    }

    public final void zzb(int i, double d) {
        zza(i, Double.doubleToRawLongBits(d));
    }

    public final void zzb(double d) {
        zza(Double.doubleToRawLongBits(d));
    }

    public final void zzb(int i, float f) {
        zza(i, Float.floatToRawIntBits(f));
    }

    public final void zzb(float f) {
        zza(Float.floatToRawIntBits(f));
    }
}
