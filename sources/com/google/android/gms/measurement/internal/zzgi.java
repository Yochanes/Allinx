package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.GuardedBy;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.measurement.zzqh;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.dataflow.qual.Pure;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgi extends zzix {
    private char zza;
    private long zzb;

    @GuardedBy
    private String zzc;
    private final zzgk zzd;
    private final zzgk zze;
    private final zzgk zzf;
    private final zzgk zzg;
    private final zzgk zzh;
    private final zzgk zzi;
    private final zzgk zzj;
    private final zzgk zzk;
    private final zzgk zzl;

    public zzgi(zzhw zzhwVar) {
        super(zzhwVar);
        this.zza = (char) 0;
        this.zzb = -1L;
        this.zzd = new zzgk(this, 6, false, false);
        this.zze = new zzgk(this, 6, true, false);
        this.zzf = new zzgk(this, 6, false, true);
        this.zzg = new zzgk(this, 5, false, false);
        this.zzh = new zzgk(this, 5, true, false);
        this.zzi = new zzgk(this, 5, false, true);
        this.zzj = new zzgk(this, 4, false, false);
        this.zzk = new zzgk(this, 3, false, false);
        this.zzl = new zzgk(this, 2, false, false);
    }

    public static /* bridge */ /* synthetic */ char zza(zzgi zzgiVar) {
        return zzgiVar.zza;
    }

    public static /* bridge */ /* synthetic */ long zzb(zzgi zzgiVar) {
        return zzgiVar.zzb;
    }

    @EnsuresNonNull
    @VisibleForTesting
    private final String zzy() {
        String str;
        synchronized (this) {
            try {
                if (this.zzc == null) {
                    this.zzc = this.zzu.zzw() != null ? this.zzu.zzw() : "FA";
                }
                Preconditions.checkNotNull(this.zzc);
                str = this.zzc;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    public final zzgk zzc() {
        return this.zzk;
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

    public final zzgk zzg() {
        return this.zzd;
    }

    public final zzgk zzh() {
        return this.zzf;
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

    public final zzgk zzm() {
        return this.zze;
    }

    public final zzgk zzn() {
        return this.zzj;
    }

    @Override // com.google.android.gms.measurement.internal.zzix
    public final boolean zzo() {
        return false;
    }

    public final zzgk zzp() {
        return this.zzl;
    }

    @Override // com.google.android.gms.measurement.internal.zziy
    @Pure
    public final /* bridge */ /* synthetic */ zzop zzq() {
        return super.zzq();
    }

    @Override // com.google.android.gms.measurement.internal.zziy
    public final /* bridge */ /* synthetic */ void zzr() {
        super.zzr();
    }

    @Override // com.google.android.gms.measurement.internal.zziy
    public final /* bridge */ /* synthetic */ void zzs() {
        super.zzs();
    }

    @Override // com.google.android.gms.measurement.internal.zziy
    public final /* bridge */ /* synthetic */ void zzt() {
        super.zzt();
    }

    public final zzgk zzu() {
        return this.zzg;
    }

    public final zzgk zzv() {
        return this.zzi;
    }

    public final zzgk zzw() {
        return this.zzh;
    }

    public final String zzx() {
        Pair<String, Long> pairZza;
        if (zzk().zzb == null || (pairZza = zzk().zzb.zza()) == null || pairZza == zzgu.zza) {
            return null;
        }
        return AbstractC0000a.m14k(String.valueOf(pairZza.second), ":", (String) pairZza.first);
    }

    public static /* bridge */ /* synthetic */ void zza(zzgi zzgiVar, char c2) {
        zzgiVar.zza = c2;
    }

    @Override // com.google.android.gms.measurement.internal.zziy, com.google.android.gms.measurement.internal.zzja
    @Pure
    public final /* bridge */ /* synthetic */ Clock zzb() {
        return super.zzb();
    }

    public static /* bridge */ /* synthetic */ void zza(zzgi zzgiVar, long j) {
        zzgiVar.zzb = j;
    }

    @VisibleForTesting
    private static String zzb(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf == -1) {
            return (zzqh.zza() && zzbj.zzcd.zza(null).booleanValue()) ? "" : str;
        }
        return str.substring(0, iLastIndexOf);
    }

    @Override // com.google.android.gms.measurement.internal.zziy, com.google.android.gms.measurement.internal.zzja
    @Pure
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    public static Object zza(String str) {
        if (str == null) {
            return null;
        }
        return new zzgn(str);
    }

    public static String zza(boolean z2, String str, Object obj, Object obj2, Object obj3) {
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String strZza = zza(z2, obj);
        String strZza2 = zza(z2, obj2);
        String strZza3 = zza(z2, obj3);
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(strZza)) {
            sb.append(str2);
            sb.append(strZza);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(strZza2)) {
            str3 = str2;
        } else {
            sb.append(str2);
            sb.append(strZza2);
        }
        if (!TextUtils.isEmpty(strZza3)) {
            sb.append(str3);
            sb.append(strZza3);
        }
        return sb.toString();
    }

    @VisibleForTesting
    private static String zza(boolean z2, Object obj) {
        String className;
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        int i = 0;
        if (obj instanceof Long) {
            if (!z2) {
                return String.valueOf(obj);
            }
            Long l = (Long) obj;
            if (Math.abs(l.longValue()) >= 100) {
                String str = String.valueOf(obj).charAt(0) == '-' ? "-" : "";
                String strValueOf = String.valueOf(Math.abs(l.longValue()));
                return str + Math.round(Math.pow(10.0d, strValueOf.length() - 1)) + "..." + str + Math.round(Math.pow(10.0d, strValueOf.length()) - 1.0d);
            }
            return String.valueOf(obj);
        }
        if (obj instanceof Boolean) {
            return String.valueOf(obj);
        }
        if (obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            StringBuilder sb = new StringBuilder(z2 ? th.getClass().getName() : th.toString());
            String strZzb = zzb(zzhw.class.getCanonicalName());
            StackTraceElement[] stackTrace = th.getStackTrace();
            int length = stackTrace.length;
            while (true) {
                if (i >= length) {
                    break;
                }
                StackTraceElement stackTraceElement = stackTrace[i];
                if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && zzb(className).equals(strZzb)) {
                    sb.append(": ");
                    sb.append(stackTraceElement);
                    break;
                }
                i++;
            }
            return sb.toString();
        }
        if (obj instanceof zzgn) {
            return zzgn.zza((zzgn) obj);
        }
        return z2 ? "-" : String.valueOf(obj);
    }

    public final void zza(int i, boolean z2, boolean z3, String str, Object obj, Object obj2, Object obj3) {
        if (!z2 && zza(i)) {
            zza(i, zza(false, str, obj, obj2, obj3));
        }
        if (z3 || i < 5) {
            return;
        }
        Preconditions.checkNotNull(str);
        zzhp zzhpVarZzo = this.zzu.zzo();
        if (zzhpVarZzo == null) {
            zza(6, "Scheduler not set. Not logging error/warn");
            return;
        }
        if (!zzhpVarZzo.zzaf()) {
            zza(6, "Scheduler not initialized. Not logging error/warn");
            return;
        }
        if (i < 0) {
            i = 0;
        }
        if (i >= 9) {
            i = 8;
        }
        zzhpVarZzo.zzb(new zzgl(this, i, str, obj, obj2, obj3));
    }

    @VisibleForTesting
    public final void zza(int i, String str) {
        Log.println(i, zzy(), str);
    }

    @VisibleForTesting
    public final boolean zza(int i) {
        return Log.isLoggable(zzy(), i);
    }
}
