package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.util.Clock;
import org.checkerframework.dataflow.qual.Pure;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final class zznb extends zzf {
    protected final zznj zza;
    protected final zznh zzb;
    private Handler zzc;
    private boolean zzd;
    private final zznc zze;

    public zznb(zzhw zzhwVar) {
        super(zzhwVar);
        this.zzd = true;
        this.zza = new zznj(this);
        this.zzb = new zznh(this);
        this.zze = new zznc(this);
    }

    public static /* bridge */ /* synthetic */ Handler zza(zznb zznbVar) {
        return zznbVar.zzc;
    }

    @WorkerThread
    private final void zzab() {
        zzt();
        if (this.zzc == null) {
            this.zzc = new com.google.android.gms.internal.measurement.zzdh(Looper.getMainLooper());
        }
    }

    public static /* synthetic */ void zzb(zznb zznbVar) {
        zznbVar.zzab();
    }

    @WorkerThread
    public final boolean zzaa() {
        zzt();
        return this.zzd;
    }

    @Override // com.google.android.gms.measurement.internal.zzg
    public final /* bridge */ /* synthetic */ zza zzc() {
        return super.zzc();
    }

    @Override // com.google.android.gms.measurement.internal.zziy, com.google.android.gms.measurement.internal.zzja
    @Pure
    public final /* bridge */ /* synthetic */ zzac zzd() {
        return super.zzd();
    }

    @Override // com.google.android.gms.measurement.internal.zziy
    @Pure
    public final /* bridge */ /* synthetic */ zzah zze() {
        return super.zze();
    }

    @Override // com.google.android.gms.measurement.internal.zziy
    @Pure
    public final /* bridge */ /* synthetic */ zzbb zzf() {
        return super.zzf();
    }

    @Override // com.google.android.gms.measurement.internal.zzg
    public final /* bridge */ /* synthetic */ zzgc zzg() {
        return super.zzg();
    }

    @Override // com.google.android.gms.measurement.internal.zzg
    public final /* bridge */ /* synthetic */ zzgf zzh() {
        return super.zzh();
    }

    @Override // com.google.android.gms.measurement.internal.zziy
    @Pure
    public final /* bridge */ /* synthetic */ zzgh zzi() {
        return super.zzi();
    }

    @Override // com.google.android.gms.measurement.internal.zziy, com.google.android.gms.measurement.internal.zzja
    @Pure
    public final /* bridge */ /* synthetic */ zzgi zzj() {
        return super.zzj();
    }

    @Override // com.google.android.gms.measurement.internal.zziy
    @Pure
    public final /* bridge */ /* synthetic */ zzgu zzk() {
        return super.zzk();
    }

    @Override // com.google.android.gms.measurement.internal.zziy, com.google.android.gms.measurement.internal.zzja
    @Pure
    public final /* bridge */ /* synthetic */ zzhp zzl() {
        return super.zzl();
    }

    @Override // com.google.android.gms.measurement.internal.zzg
    public final /* bridge */ /* synthetic */ zzjk zzm() {
        return super.zzm();
    }

    @Override // com.google.android.gms.measurement.internal.zzg
    public final /* bridge */ /* synthetic */ zzlg zzn() {
        return super.zzn();
    }

    @Override // com.google.android.gms.measurement.internal.zzg
    public final /* bridge */ /* synthetic */ zzlp zzo() {
        return super.zzo();
    }

    @Override // com.google.android.gms.measurement.internal.zzg
    public final /* bridge */ /* synthetic */ zznb zzp() {
        return super.zzp();
    }

    @Override // com.google.android.gms.measurement.internal.zziy
    @Pure
    public final /* bridge */ /* synthetic */ zzop zzq() {
        return super.zzq();
    }

    @Override // com.google.android.gms.measurement.internal.zzg, com.google.android.gms.measurement.internal.zziy
    public final /* bridge */ /* synthetic */ void zzr() {
        super.zzr();
    }

    @Override // com.google.android.gms.measurement.internal.zzg, com.google.android.gms.measurement.internal.zziy
    public final /* bridge */ /* synthetic */ void zzs() {
        super.zzs();
    }

    @Override // com.google.android.gms.measurement.internal.zzg, com.google.android.gms.measurement.internal.zziy
    public final /* bridge */ /* synthetic */ void zzt() {
        super.zzt();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final boolean zzz() {
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.zziy, com.google.android.gms.measurement.internal.zzja
    @Pure
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    @Override // com.google.android.gms.measurement.internal.zziy, com.google.android.gms.measurement.internal.zzja
    @Pure
    public final /* bridge */ /* synthetic */ Clock zzb() {
        return super.zzb();
    }

    public static /* synthetic */ void zza(zznb zznbVar, long j) {
        zznbVar.zzt();
        zznbVar.zzab();
        zznbVar.zzj().zzp().zza("Activity paused, time", Long.valueOf(j));
        zznbVar.zze.zza(j);
        if (zznbVar.zze().zzy()) {
            zznbVar.zzb.zzb(j);
        }
    }

    public static /* synthetic */ void zzb(zznb zznbVar, long j) {
        zznbVar.zzt();
        zznbVar.zzab();
        zznbVar.zzj().zzp().zza("Activity resumed, time", Long.valueOf(j));
        if (zznbVar.zze().zza(zzbj.zzcn)) {
            if (zznbVar.zze().zzy() || zznbVar.zzd) {
                zznbVar.zzb.zzc(j);
            }
        } else if (zznbVar.zze().zzy() || zznbVar.zzk().zzn.zza()) {
            zznbVar.zzb.zzc(j);
        }
        zznbVar.zze.zza();
        zznj zznjVar = zznbVar.zza;
        zznjVar.zza.zzt();
        if (zznjVar.zza.zzu.zzac()) {
            zznjVar.zza(zznjVar.zza.zzb().currentTimeMillis(), false);
        }
    }

    @WorkerThread
    public final void zza(boolean z2) {
        zzt();
        this.zzd = z2;
    }

    public final boolean zza(boolean z2, boolean z3, long j) {
        return this.zzb.zza(z2, z3, j);
    }
}
