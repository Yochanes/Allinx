package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.GuardedBy;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Size;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import org.checkerframework.dataflow.qual.Pure;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final class zzlg extends zzf {

    @VisibleForTesting
    protected zzlh zza;
    private volatile zzlh zzb;
    private volatile zzlh zzc;
    private final Map<Activity, zzlh> zzd;

    @GuardedBy
    private Activity zze;

    @GuardedBy
    private volatile boolean zzf;
    private volatile zzlh zzg;
    private zzlh zzh;

    @GuardedBy
    private boolean zzi;
    private final Object zzj;

    public zzlg(zzhw zzhwVar) {
        super(zzhwVar);
        this.zzj = new Object();
        this.zzd = new ConcurrentHashMap();
    }

    public static /* bridge */ /* synthetic */ zzlh zza(zzlg zzlgVar) {
        return zzlgVar.zzh;
    }

    public final zzlh zzaa() {
        return this.zzb;
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

    @Override // com.google.android.gms.measurement.internal.zzf
    public final boolean zzz() {
        return false;
    }

    public static /* bridge */ /* synthetic */ void zza(zzlg zzlgVar, zzlh zzlhVar) {
        zzlgVar.zzh = null;
    }

    @MainThread
    private final zzlh zzd(@NonNull Activity activity) {
        Preconditions.checkNotNull(activity);
        zzlh zzlhVar = this.zzd.get(activity);
        if (zzlhVar == null) {
            zzlh zzlhVar2 = new zzlh(null, zza(activity.getClass(), "Activity"), zzq().zzm());
            this.zzd.put(activity, zzlhVar2);
            zzlhVar = zzlhVar2;
        }
        return this.zzg != null ? this.zzg : zzlhVar;
    }

    @MainThread
    public final void zzb(Activity activity) {
        synchronized (this.zzj) {
            this.zzi = false;
            this.zzf = true;
        }
        long jElapsedRealtime = zzb().elapsedRealtime();
        if (!zze().zzy()) {
            this.zzb = null;
            zzl().zzb(new zzlk(this, jElapsedRealtime));
        } else {
            zzlh zzlhVarZzd = zzd(activity);
            this.zzc = this.zzb;
            this.zzb = null;
            zzl().zzb(new zzln(this, zzlhVarZzd, jElapsedRealtime));
        }
    }

    @MainThread
    public final void zzc(Activity activity) {
        synchronized (this.zzj) {
            this.zzi = true;
            if (activity != this.zze) {
                synchronized (this.zzj) {
                    this.zze = activity;
                    this.zzf = false;
                }
                if (zze().zzy()) {
                    this.zzg = null;
                    zzl().zzb(new zzlm(this));
                }
            }
        }
        if (!zze().zzy()) {
            this.zzb = this.zzg;
            zzl().zzb(new zzll(this));
        } else {
            zza(activity, zzd(activity), false);
            zza zzaVarZzc = zzc();
            zzaVarZzc.zzl().zzb(new zze(zzaVarZzc, zzaVarZzc.zzb().elapsedRealtime()));
        }
    }

    public static /* bridge */ /* synthetic */ void zza(zzlg zzlgVar, zzlh zzlhVar, zzlh zzlhVar2, long j, boolean z2, Bundle bundle) {
        zzlgVar.zza(zzlhVar, zzlhVar2, j, z2, (Bundle) null);
    }

    public static /* bridge */ /* synthetic */ void zza(zzlg zzlgVar, zzlh zzlhVar, boolean z2, long j) {
        zzlgVar.zza(zzlhVar, false, j);
    }

    @Override // com.google.android.gms.measurement.internal.zziy, com.google.android.gms.measurement.internal.zzja
    @Pure
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    @WorkerThread
    public final zzlh zza(boolean z2) {
        zzu();
        zzt();
        if (!z2) {
            return this.zza;
        }
        zzlh zzlhVar = this.zza;
        return zzlhVar != null ? zzlhVar : this.zzh;
    }

    @VisibleForTesting
    private final String zza(Class<?> cls, String str) {
        String str2;
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            return str;
        }
        String[] strArrSplit = canonicalName.split("\\.");
        if (strArrSplit.length > 0) {
            str2 = strArrSplit[strArrSplit.length - 1];
        } else {
            str2 = "";
        }
        return str2.length() > zze().zza((String) null, false) ? str2.substring(0, zze().zza((String) null, false)) : str2;
    }

    public static /* synthetic */ void zza(zzlg zzlgVar, Bundle bundle, zzlh zzlhVar, zzlh zzlhVar2, long j) {
        if (bundle != null) {
            bundle.remove(FirebaseAnalytics.Param.SCREEN_NAME);
            bundle.remove(FirebaseAnalytics.Param.SCREEN_CLASS);
        }
        zzlgVar.zza(zzlhVar, zzlhVar2, j, true, zzlgVar.zzq().zza((String) null, FirebaseAnalytics.Event.SCREEN_VIEW, bundle, (List<String>) null, false));
    }

    @MainThread
    public final void zzb(Activity activity, Bundle bundle) {
        zzlh zzlhVar;
        if (!zze().zzy() || bundle == null || (zzlhVar = this.zzd.get(activity)) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("id", zzlhVar.zzc);
        bundle2.putString("name", zzlhVar.zza);
        bundle2.putString("referrer_name", zzlhVar.zzb);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    @MainThread
    private final void zza(Activity activity, zzlh zzlhVar, boolean z2) {
        zzlh zzlhVar2;
        zzlh zzlhVar3 = this.zzb == null ? this.zzc : this.zzb;
        if (zzlhVar.zzb == null) {
            zzlhVar2 = new zzlh(zzlhVar.zza, activity != null ? zza(activity.getClass(), "Activity") : null, zzlhVar.zzc, zzlhVar.zze, zzlhVar.zzf);
        } else {
            zzlhVar2 = zzlhVar;
        }
        this.zzc = this.zzb;
        this.zzb = zzlhVar2;
        zzl().zzb(new zzli(this, zzlhVar2, zzlhVar3, zzb().elapsedRealtime(), z2));
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00ad  */
    @WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zza(zzlh zzlhVar, zzlh zzlhVar2, long j, boolean z2, Bundle bundle) {
        String str;
        zzt();
        boolean z3 = false;
        boolean z4 = (zzlhVar2 != null && zzlhVar2.zzc == zzlhVar.zzc && Objects.equals(zzlhVar2.zzb, zzlhVar.zzb) && Objects.equals(zzlhVar2.zza, zzlhVar.zza)) ? false : true;
        if (z2 && this.zza != null) {
            z3 = true;
        }
        if (z4) {
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            zzop.zza(zzlhVar, bundle2, true);
            if (zzlhVar2 != null) {
                String str2 = zzlhVar2.zza;
                if (str2 != null) {
                    bundle2.putString("_pn", str2);
                }
                String str3 = zzlhVar2.zzb;
                if (str3 != null) {
                    bundle2.putString("_pc", str3);
                }
                bundle2.putLong("_pi", zzlhVar2.zzc);
            }
            if (z3) {
                long jZza = zzp().zzb.zza(j);
                if (jZza > 0) {
                    zzq().zza(bundle2, jZza);
                }
            }
            if (!zze().zzy()) {
                bundle2.putLong("_mst", 1L);
            }
            if (zzlhVar.zze) {
                str = "app";
            } else {
                str = "auto";
            }
            String str4 = str;
            long jCurrentTimeMillis = zzb().currentTimeMillis();
            if (zzlhVar.zze) {
                long j2 = zzlhVar.zzf;
                long j3 = j2 != 0 ? j2 : jCurrentTimeMillis;
                zzm().zza(str4, "_vs", j3, bundle2);
            }
        }
        if (z3) {
            zza(this.zza, true, j);
        }
        this.zza = zzlhVar;
        if (zzlhVar.zze) {
            this.zzh = zzlhVar;
        }
        zzo().zza(zzlhVar);
    }

    @MainThread
    public final void zza(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (!zze().zzy() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.zzd.put(activity, new zzlh(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
    }

    @MainThread
    public final void zza(Activity activity) {
        synchronized (this.zzj) {
            try {
                if (activity == this.zze) {
                    this.zze = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zze().zzy()) {
            this.zzd.remove(activity);
        }
    }

    @WorkerThread
    private final void zza(zzlh zzlhVar, boolean z2, long j) {
        zzc().zza(zzb().elapsedRealtime());
        if (!zzp().zza(zzlhVar != null && zzlhVar.zzd, z2, j) || zzlhVar == null) {
            return;
        }
        zzlhVar.zzd = false;
    }

    @Deprecated
    public final void zza(@NonNull Activity activity, @Size String str, @Size String str2) {
        if (!zze().zzy()) {
            zzj().zzv().zza("setCurrentScreen cannot be called while screen reporting is disabled.");
            return;
        }
        zzlh zzlhVar = this.zzb;
        if (zzlhVar == null) {
            zzj().zzv().zza("setCurrentScreen cannot be called while no activity active");
            return;
        }
        if (this.zzd.get(activity) == null) {
            zzj().zzv().zza("setCurrentScreen must be called with an activity in the activity lifecycle");
            return;
        }
        if (str2 == null) {
            str2 = zza(activity.getClass(), "Activity");
        }
        boolean zEquals = Objects.equals(zzlhVar.zzb, str2);
        boolean zEquals2 = Objects.equals(zzlhVar.zza, str);
        if (zEquals && zEquals2) {
            zzj().zzv().zza("setCurrentScreen cannot be called with the same class and name");
            return;
        }
        if (str != null && (str.length() <= 0 || str.length() > zze().zza((String) null, false))) {
            zzj().zzv().zza("Invalid screen name length in setCurrentScreen. Length", Integer.valueOf(str.length()));
            return;
        }
        if (str2 != null && (str2.length() <= 0 || str2.length() > zze().zza((String) null, false))) {
            zzj().zzv().zza("Invalid class name length in setCurrentScreen. Length", Integer.valueOf(str2.length()));
            return;
        }
        zzj().zzp().zza("Setting current screen to name, class", str == null ? "null" : str, str2);
        zzlh zzlhVar2 = new zzlh(str, str2, zzq().zzm());
        this.zzd.put(activity, zzlhVar2);
        zza(activity, zzlhVar2, true);
    }

    public final void zza(Bundle bundle, long j) {
        String str;
        synchronized (this.zzj) {
            try {
                if (!this.zzi) {
                    zzj().zzv().zza("Cannot log screen view event when the app is in the background.");
                    return;
                }
                String strZza = null;
                if (bundle != null) {
                    String string = bundle.getString(FirebaseAnalytics.Param.SCREEN_NAME);
                    if (string != null && (string.length() <= 0 || string.length() > zze().zza((String) null, false))) {
                        zzj().zzv().zza("Invalid screen name length for screen view. Length", Integer.valueOf(string.length()));
                        return;
                    }
                    String string2 = bundle.getString(FirebaseAnalytics.Param.SCREEN_CLASS);
                    if (string2 != null && (string2.length() <= 0 || string2.length() > zze().zza((String) null, false))) {
                        zzj().zzv().zza("Invalid screen class length for screen view. Length", Integer.valueOf(string2.length()));
                        return;
                    } else {
                        strZza = string2;
                        str = string;
                    }
                } else {
                    str = null;
                }
                if (strZza == null) {
                    Activity activity = this.zze;
                    if (activity != null) {
                        strZza = zza(activity.getClass(), "Activity");
                    } else {
                        strZza = "Activity";
                    }
                }
                String str2 = strZza;
                zzlh zzlhVar = this.zzb;
                if (this.zzf && zzlhVar != null) {
                    this.zzf = false;
                    boolean zEquals = Objects.equals(zzlhVar.zzb, str2);
                    boolean zEquals2 = Objects.equals(zzlhVar.zza, str);
                    if (zEquals && zEquals2) {
                        zzj().zzv().zza("Ignoring call to log screen view event with duplicate parameters.");
                        return;
                    }
                }
                zzj().zzp().zza("Logging screen view with name, class", str == null ? "null" : str, str2 == null ? "null" : str2);
                zzlh zzlhVar2 = this.zzb == null ? this.zzc : this.zzb;
                zzlh zzlhVar3 = new zzlh(str, str2, zzq().zzm(), true, j);
                this.zzb = zzlhVar3;
                this.zzc = zzlhVar2;
                this.zzg = zzlhVar3;
                zzl().zzb(new zzlj(this, bundle, zzlhVar3, zzlhVar2, zzb().elapsedRealtime()));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
