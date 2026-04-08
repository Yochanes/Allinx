package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
final class zzcd extends zzcl {
    private String zza;
    private boolean zzb;
    private zzco zzc;
    private byte zzd;

    public final zzcl zza(String str) {
        this.zza = str;
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zzcl
    public final zzcl zzb(boolean z2) {
        this.zzb = z2;
        this.zzd = (byte) (this.zzd | 2);
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zzcl
    public final zzcl zza(zzco zzcoVar) {
        if (zzcoVar == null) {
            throw new NullPointerException("Null filePurpose");
        }
        this.zzc = zzcoVar;
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zzcl
    public final zzcl zza(boolean z2) {
        this.zzd = (byte) (this.zzd | 1);
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zzcl
    public final zzcm zza() {
        if (this.zzd == 3 && this.zza != null && this.zzc != null) {
            return new zzce(this.zza, false, this.zzb, null, null, this.zzc, null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.zza == null) {
            sb.append(" fileOwner");
        }
        if ((this.zzd & 1) == 0) {
            sb.append(" hasDifferentDmaOwner");
        }
        if ((this.zzd & 2) == 0) {
            sb.append(" skipChecks");
        }
        if (this.zzc == null) {
            sb.append(" filePurpose");
        }
        throw new IllegalStateException("Missing required properties:".concat(String.valueOf(sb)));
    }
}
