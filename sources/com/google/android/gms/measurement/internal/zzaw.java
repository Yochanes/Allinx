package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
final class zzaw implements Runnable {
    private final /* synthetic */ zzja zza;
    private final /* synthetic */ zzax zzb;

    public zzaw(zzax zzaxVar, zzja zzjaVar) {
        this.zza = zzjaVar;
        this.zzb = zzaxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzd();
        if (zzac.zza()) {
            this.zza.zzl().zzb(this);
            return;
        }
        boolean zZzc = this.zzb.zzc();
        zzax.zza(this.zzb, 0L);
        if (zZzc) {
            this.zzb.zzb();
        }
    }
}
