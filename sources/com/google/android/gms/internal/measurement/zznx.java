package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
abstract class zznx<T, B> {
    private static volatile int zza = 100;

    public abstract int zza(T t);

    public abstract B zza();

    public abstract T zza(T t, T t2);

    public abstract void zza(B b2, int i, int i2);

    public abstract void zza(B b2, int i, long j);

    public abstract void zza(B b2, int i, zzjs zzjsVar);

    public abstract void zza(B b2, int i, T t);

    public abstract void zza(T t, zzos zzosVar);

    public abstract boolean zza(zzna zznaVar);

    public final boolean zza(B b2, zzna zznaVar, int i) throws zzlk {
        int iZzd = zznaVar.zzd();
        int i2 = iZzd >>> 3;
        int i3 = iZzd & 7;
        if (i3 == 0) {
            zzb(b2, i2, zznaVar.zzl());
            return true;
        }
        if (i3 == 1) {
            zza(b2, i2, zznaVar.zzk());
            return true;
        }
        if (i3 == 2) {
            zza((Object) b2, i2, zznaVar.zzp());
            return true;
        }
        if (i3 != 3) {
            if (i3 == 4) {
                return false;
            }
            if (i3 != 5) {
                throw zzlk.zza();
            }
            zza((Object) b2, i2, zznaVar.zzf());
            return true;
        }
        B bZza = zza();
        int i4 = 4 | (i2 << 3);
        int i5 = i + 1;
        if (i5 >= zza) {
            throw zzlk.zzh();
        }
        while (zznaVar.zzc() != Integer.MAX_VALUE && zza(bZza, zznaVar, i5)) {
        }
        if (i4 != zznaVar.zzd()) {
            throw zzlk.zzb();
        }
        zza(b2, i2, zze(bZza));
        return true;
    }

    public abstract int zzb(T t);

    public abstract void zzb(B b2, int i, long j);

    public abstract void zzb(T t, zzos zzosVar);

    public abstract void zzb(Object obj, B b2);

    public abstract B zzc(Object obj);

    public abstract void zzc(Object obj, T t);

    public abstract T zzd(Object obj);

    public abstract T zze(B b2);

    public abstract void zzf(Object obj);
}
