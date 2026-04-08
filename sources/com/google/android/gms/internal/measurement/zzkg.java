package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzkg {
    private static volatile int zzd = 100;
    int zza;
    int zzb;
    zzkk zzc;

    public /* synthetic */ zzkg(zzkh zzkhVar) {
        this();
    }

    public static long zza(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public static int zze(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public abstract double zza();

    public abstract int zza(int i);

    public abstract float zzb();

    public abstract void zzb(int i);

    public abstract int zzc();

    public abstract void zzc(int i);

    public abstract int zzd();

    public abstract boolean zzd(int i);

    public abstract int zze();

    public abstract int zzf();

    public abstract int zzg();

    public abstract int zzh();

    public abstract int zzi();

    public abstract int zzj();

    public abstract long zzk();

    public abstract long zzl();

    public abstract long zzm();

    public abstract long zzn();

    public abstract long zzo();

    public abstract long zzp();

    public abstract zzjs zzq();

    public abstract String zzr();

    public abstract String zzs();

    public abstract boolean zzt();

    public abstract boolean zzu();

    private zzkg() {
        this.zzb = zzd;
    }

    public static zzkg zza(byte[] bArr, int i, int i2, boolean z2) {
        zzkf zzkfVar = new zzkf(bArr, 0, i2, false, null);
        try {
            zzkfVar.zza(i2);
            return zzkfVar;
        } catch (zzlk e) {
            throw new IllegalArgumentException(e);
        }
    }
}
