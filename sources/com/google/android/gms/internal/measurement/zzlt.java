package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public class zzlt {
    private volatile zzml zza;
    private volatile zzjs zzb;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzlt)) {
            return false;
        }
        zzlt zzltVar = (zzlt) obj;
        zzml zzmlVar = this.zza;
        zzml zzmlVar2 = zzltVar.zza;
        return (zzmlVar == null && zzmlVar2 == null) ? zzb().equals(zzltVar.zzb()) : (zzmlVar == null || zzmlVar2 == null) ? zzmlVar != null ? zzmlVar.equals(zzltVar.zzb(zzmlVar.zzck())) : zzb(zzmlVar2.zzck()).equals(zzmlVar2) : zzmlVar.equals(zzmlVar2);
    }

    public int hashCode() {
        return 1;
    }

    public final int zza() {
        if (this.zzb != null) {
            return this.zzb.zzb();
        }
        if (this.zza != null) {
            return this.zza.zzcb();
        }
        return 0;
    }

    public final zzjs zzb() {
        if (this.zzb != null) {
            return this.zzb;
        }
        synchronized (this) {
            try {
                if (this.zzb != null) {
                    return this.zzb;
                }
                if (this.zza == null) {
                    this.zzb = zzjs.zza;
                } else {
                    this.zzb = this.zza.zzbz();
                }
                return this.zzb;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final zzml zza(zzml zzmlVar) {
        zzml zzmlVar2 = this.zza;
        this.zzb = null;
        this.zza = zzmlVar;
        return zzmlVar2;
    }

    private final zzml zzb(zzml zzmlVar) {
        if (this.zza == null) {
            synchronized (this) {
                if (this.zza == null) {
                    try {
                        this.zza = zzmlVar;
                        this.zzb = zzjs.zza;
                    } catch (zzlk unused) {
                        this.zza = zzmlVar;
                        this.zzb = zzjs.zza;
                    }
                }
            }
        }
        return this.zza;
    }
}
