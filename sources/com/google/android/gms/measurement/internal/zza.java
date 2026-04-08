package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.WorkerThread;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import java.util.Iterator;
import java.util.Map;
import org.checkerframework.dataflow.qual.Pure;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final class zza extends zzg {
    private final Map<String, Long> zza;
    private final Map<String, Integer> zzb;
    private long zzc;

    public zza(zzhw zzhwVar) {
        super(zzhwVar);
        this.zzb = new ArrayMap(0);
        this.zza = new ArrayMap(0);
    }

    public static /* synthetic */ void zza(zza zzaVar, long j) {
        zzaVar.zzb(j);
    }

    @Override // com.google.android.gms.measurement.internal.zziy, com.google.android.gms.measurement.internal.zzja
    @Pure
    public final /* bridge */ /* synthetic */ Clock zzb() {
        return super.zzb();
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

    public static /* synthetic */ void zzb(zza zzaVar, String str, long j) {
        zzaVar.zzt();
        Preconditions.checkNotEmpty(str);
        Integer num = zzaVar.zzb.get(str);
        if (num == null) {
            zzaVar.zzj().zzg().zza("Call to endAdUnitExposure for unknown ad unit id", str);
            return;
        }
        zzlh zzlhVarZza = zzaVar.zzn().zza(false);
        int iIntValue = num.intValue() - 1;
        if (iIntValue != 0) {
            zzaVar.zzb.put(str, Integer.valueOf(iIntValue));
            return;
        }
        zzaVar.zzb.remove(str);
        Long l = zzaVar.zza.get(str);
        if (l == null) {
            zzaVar.zzj().zzg().zza("First ad unit exposure time was never set");
        } else {
            long jLongValue = j - l.longValue();
            zzaVar.zza.remove(str);
            zzaVar.zza(str, jLongValue, zzlhVarZza);
        }
        if (zzaVar.zzb.isEmpty()) {
            long j2 = zzaVar.zzc;
            if (j2 == 0) {
                zzaVar.zzj().zzg().zza("First ad exposure time was never set");
            } else {
                zzaVar.zza(j - j2, zzlhVarZza);
                zzaVar.zzc = 0L;
            }
        }
    }

    @Override // com.google.android.gms.measurement.internal.zziy, com.google.android.gms.measurement.internal.zzja
    @Pure
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    public static /* synthetic */ void zza(zza zzaVar, String str, long j) {
        zzaVar.zzt();
        Preconditions.checkNotEmpty(str);
        if (zzaVar.zzb.isEmpty()) {
            zzaVar.zzc = j;
        }
        Integer num = zzaVar.zzb.get(str);
        if (num != null) {
            zzaVar.zzb.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (zzaVar.zzb.size() >= 100) {
            zzaVar.zzj().zzu().zza("Too many ads visible");
        } else {
            zzaVar.zzb.put(str, 1);
            zzaVar.zza.put(str, Long.valueOf(j));
        }
    }

    public final void zza(String str, long j) {
        if (str != null && str.length() != 0) {
            zzl().zzb(new zzc(this, str, j));
        } else {
            zzj().zzg().zza("Ad unit id must be a non-empty string");
        }
    }

    @WorkerThread
    private final void zza(long j, zzlh zzlhVar) {
        if (zzlhVar == null) {
            zzj().zzp().zza("Not logging ad exposure. No active activity");
            return;
        }
        if (j < 1000) {
            zzj().zzp().zza("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("_xt", j);
        zzop.zza(zzlhVar, bundle, true);
        zzm().zzc("am", "_xa", bundle);
    }

    public final void zzb(String str, long j) {
        if (str != null && str.length() != 0) {
            zzl().zzb(new zzb(this, str, j));
        } else {
            zzj().zzg().zza("Ad unit id must be a non-empty string");
        }
    }

    @WorkerThread
    private final void zza(String str, long j, zzlh zzlhVar) {
        if (zzlhVar == null) {
            zzj().zzp().zza("Not logging ad unit exposure. No active activity");
            return;
        }
        if (j < 1000) {
            zzj().zzp().zza("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("_ai", str);
        bundle.putLong("_xt", j);
        zzop.zza(zzlhVar, bundle, true);
        zzm().zzc("am", "_xu", bundle);
    }

    @WorkerThread
    private final void zzb(long j) {
        Iterator<String> it = this.zza.keySet().iterator();
        while (it.hasNext()) {
            this.zza.put(it.next(), Long.valueOf(j));
        }
        if (this.zza.isEmpty()) {
            return;
        }
        this.zzc = j;
    }

    @WorkerThread
    public final void zza(long j) {
        zzlh zzlhVarZza = zzn().zza(false);
        for (String str : this.zza.keySet()) {
            zza(str, j - this.zza.get(str).longValue(), zzlhVarZza);
        }
        if (!this.zza.isEmpty()) {
            zza(j - this.zzc, zzlhVarZza);
        }
        zzb(j);
    }
}
