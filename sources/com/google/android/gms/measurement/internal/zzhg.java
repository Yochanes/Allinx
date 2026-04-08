package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.collection.ArrayMap;
import androidx.collection.LruCache;
import com.engagelab.privates.core.constants.MTCoreConstants;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.measurement.zzfx;
import com.google.android.gms.internal.measurement.zzhg;
import com.google.android.gms.measurement.internal.zzjc;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import org.checkerframework.dataflow.qual.Pure;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhg extends zznr implements zzaj {

    @VisibleForTesting
    final LruCache<String, com.google.android.gms.internal.measurement.zzb> zza;
    final com.google.android.gms.internal.measurement.zzv zzb;
    private final Map<String, Map<String, String>> zzc;

    @VisibleForTesting
    private final Map<String, Set<String>> zzd;

    @VisibleForTesting
    private final Map<String, Map<String, Boolean>> zze;

    @VisibleForTesting
    private final Map<String, Map<String, Boolean>> zzf;
    private final Map<String, zzfx.zzd> zzh;
    private final Map<String, Map<String, Integer>> zzi;
    private final Map<String, String> zzj;
    private final Map<String, String> zzk;
    private final Map<String, String> zzl;

    public zzhg(zznv zznvVar) {
        super(zznvVar);
        this.zzc = new ArrayMap(0);
        this.zzd = new ArrayMap(0);
        this.zze = new ArrayMap(0);
        this.zzf = new ArrayMap(0);
        this.zzh = new ArrayMap(0);
        this.zzj = new ArrayMap(0);
        this.zzk = new ArrayMap(0);
        this.zzl = new ArrayMap(0);
        this.zzi = new ArrayMap(0);
        this.zza = new zzhm(this, 20);
        this.zzb = new zzhl(this);
    }

    public static /* bridge */ /* synthetic */ Map zza(zzhg zzhgVar) {
        return zzhgVar.zzc;
    }

    @WorkerThread
    private final void zzv(String str) throws Throwable {
        zzal();
        zzt();
        Preconditions.checkNotEmpty(str);
        if (this.zzh.get(str) == null) {
            zzao zzaoVarZzf = zzh().zzf(str);
            if (zzaoVarZzf != null) {
                zzfx.zzd.zza zzaVarZzcd = zza(str, zzaoVarZzf.zza).zzcd();
                zza(str, zzaVarZzcd);
                this.zzc.put(str, zza((zzfx.zzd) ((com.google.android.gms.internal.measurement.zzlc) zzaVarZzcd.zzai())));
                this.zzh.put(str, (zzfx.zzd) ((com.google.android.gms.internal.measurement.zzlc) zzaVarZzcd.zzai()));
                zza(str, (zzfx.zzd) ((com.google.android.gms.internal.measurement.zzlc) zzaVarZzcd.zzai()));
                this.zzj.put(str, zzaVarZzcd.zzc());
                this.zzk.put(str, zzaoVarZzf.zzb);
                this.zzl.put(str, zzaoVarZzf.zzc);
                return;
            }
            this.zzc.put(str, null);
            this.zze.put(str, null);
            this.zzd.put(str, null);
            this.zzf.put(str, null);
            this.zzh.put(str, null);
            this.zzj.put(str, null);
            this.zzk.put(str, null);
            this.zzl.put(str, null);
            this.zzi.put(str, null);
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzno
    /* JADX INFO: renamed from: g_ */
    public final /* bridge */ /* synthetic */ zzol mo14496g_() {
        return super.mo14496g_();
    }

    @WorkerThread
    public final int zzb(String str, String str2) throws Throwable {
        Integer num;
        zzt();
        zzv(str);
        Map<String, Integer> map = this.zzi.get(str);
        if (map == null || (num = map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    @Override // com.google.android.gms.measurement.internal.zznr
    public final boolean zzc() {
        return false;
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

    @Override // com.google.android.gms.measurement.internal.zzno
    public final /* bridge */ /* synthetic */ zzv zzg() {
        return super.zzg();
    }

    @Override // com.google.android.gms.measurement.internal.zzno
    public final /* bridge */ /* synthetic */ zzam zzh() {
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

    @Override // com.google.android.gms.measurement.internal.zzno
    public final /* bridge */ /* synthetic */ zzhg zzm() {
        return super.zzm();
    }

    @Override // com.google.android.gms.measurement.internal.zzno
    public final /* bridge */ /* synthetic */ zzms zzn() {
        return super.zzn();
    }

    @Override // com.google.android.gms.measurement.internal.zzno
    public final /* bridge */ /* synthetic */ zznq zzo() {
        return super.zzo();
    }

    @WorkerThread
    public final boolean zzp(String str) throws Throwable {
        zzt();
        zzv(str);
        return this.zzd.get(str) != null && this.zzd.get(str).contains("app_instance_id");
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

    @WorkerThread
    public final boolean zzu(String str) throws Throwable {
        zzt();
        zzv(str);
        return this.zzd.get(str) != null && this.zzd.get(str).contains(MTCoreConstants.Register.KEY_USER_ID);
    }

    @WorkerThread
    public final long zza(String str) throws Throwable {
        String strZza = zza(str, "measurement.account.time_zone_offset_minutes");
        if (TextUtils.isEmpty(strZza)) {
            return 0L;
        }
        try {
            return Long.parseLong(strZza);
        } catch (NumberFormatException e) {
            zzj().zzu().zza("Unable to parse timezone offset. appId", zzgi.zza(str), e);
            return 0L;
        }
    }

    @WorkerThread
    public final zzfx.zzd zzc(String str) {
        zzal();
        zzt();
        Preconditions.checkNotEmpty(str);
        zzv(str);
        return this.zzh.get(str);
    }

    @WorkerThread
    public final String zzd(String str) {
        zzt();
        return this.zzl.get(str);
    }

    @WorkerThread
    public final String zze(String str) {
        zzt();
        return this.zzk.get(str);
    }

    @WorkerThread
    public final String zzf(String str) {
        zzt();
        zzv(str);
        return this.zzj.get(str);
    }

    @WorkerThread
    public final Set<String> zzg(String str) {
        zzt();
        zzv(str);
        return this.zzd.get(str);
    }

    @WorkerThread
    public final SortedSet<String> zzh(String str) {
        zzt();
        zzv(str);
        TreeSet treeSet = new TreeSet();
        zzfx.zza zzaVarZzb = zzb(str);
        if (zzaVarZzb != null) {
            Iterator<zzfx.zza.zzf> it = zzaVarZzb.zzc().iterator();
            while (it.hasNext()) {
                treeSet.add(it.next().zzb());
            }
        }
        return treeSet;
    }

    @WorkerThread
    public final void zzi(String str) {
        zzt();
        this.zzk.put(str, null);
    }

    @WorkerThread
    public final void zzj(String str) {
        zzt();
        this.zzh.remove(str);
    }

    @WorkerThread
    public final boolean zzk(String str) {
        zzt();
        zzfx.zzd zzdVarZzc = zzc(str);
        if (zzdVarZzc == null) {
            return false;
        }
        return zzdVarZzc.zzo();
    }

    public final boolean zzl(String str) {
        zzfx.zzd zzdVar;
        return (TextUtils.isEmpty(str) || (zzdVar = this.zzh.get(str)) == null || zzdVar.zza() == 0) ? false : true;
    }

    public final boolean zzm(String str) {
        return "1".equals(zza(str, "measurement.upload.blacklist_internal"));
    }

    @WorkerThread
    public final boolean zzn(String str) {
        zzt();
        zzv(str);
        zzfx.zza zzaVarZzb = zzb(str);
        return zzaVarZzb == null || !zzaVarZzb.zzh() || zzaVarZzb.zzg();
    }

    public final boolean zzo(String str) {
        return "1".equals(zza(str, "measurement.upload.blacklist_public"));
    }

    @WorkerThread
    public final boolean zzq(String str) throws Throwable {
        zzt();
        zzv(str);
        if (this.zzd.get(str) != null) {
            return this.zzd.get(str).contains("device_model") || this.zzd.get(str).contains("device_info");
        }
        return false;
    }

    @WorkerThread
    public final boolean zzr(String str) throws Throwable {
        zzt();
        zzv(str);
        return this.zzd.get(str) != null && this.zzd.get(str).contains("enhanced_user_id");
    }

    @WorkerThread
    public final boolean zzs(String str) throws Throwable {
        zzt();
        zzv(str);
        return this.zzd.get(str) != null && this.zzd.get(str).contains("google_signals");
    }

    @WorkerThread
    public final boolean zzt(String str) throws Throwable {
        zzt();
        zzv(str);
        if (this.zzd.get(str) != null) {
            return this.zzd.get(str).contains("os_version") || this.zzd.get(str).contains("device_info");
        }
        return false;
    }

    @WorkerThread
    public final boolean zzd(String str, String str2) throws Throwable {
        Boolean bool;
        zzt();
        zzv(str);
        if (zzm(str) && zzop.zzg(str2)) {
            return true;
        }
        if (zzo(str) && zzop.zzh(str2)) {
            return true;
        }
        Map<String, Boolean> map = this.zze.get(str);
        if (map == null || (bool = map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    @Override // com.google.android.gms.measurement.internal.zziy, com.google.android.gms.measurement.internal.zzja
    @Pure
    public final /* bridge */ /* synthetic */ Clock zzb() {
        return super.zzb();
    }

    @WorkerThread
    public final zzjc.zza zzb(String str, zzjc.zza zzaVar) {
        zzt();
        zzv(str);
        zzfx.zza zzaVarZzb = zzb(str);
        if (zzaVarZzb == null) {
            return null;
        }
        for (zzfx.zza.zzc zzcVar : zzaVarZzb.zze()) {
            if (zzaVar == zza(zzcVar.zzc())) {
                return zza(zzcVar.zzb());
            }
        }
        return null;
    }

    @WorkerThread
    public final boolean zzc(String str, zzjc.zza zzaVar) throws Throwable {
        zzt();
        zzv(str);
        zzfx.zza zzaVarZzb = zzb(str);
        if (zzaVarZzb == null) {
            return false;
        }
        Iterator<zzfx.zza.zzb> it = zzaVarZzb.zzd().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            zzfx.zza.zzb next = it.next();
            if (zzaVar == zza(next.zzc())) {
                if (next.zzb() == zzfx.zza.zzd.GRANTED) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.zziy, com.google.android.gms.measurement.internal.zzja
    @Pure
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    public static /* synthetic */ com.google.android.gms.internal.measurement.zzb zza(zzhg zzhgVar, String str) throws Throwable {
        zzhgVar.zzal();
        Preconditions.checkNotEmpty(str);
        if (!zzhgVar.zzl(str)) {
            return null;
        }
        if (zzhgVar.zzh.containsKey(str) && zzhgVar.zzh.get(str) != null) {
            zzhgVar.zza(str, zzhgVar.zzh.get(str));
        } else {
            zzhgVar.zzv(str);
        }
        return zzhgVar.zza.snapshot().get(str);
    }

    @WorkerThread
    public final zzfx.zza zzb(String str) throws Throwable {
        zzt();
        zzv(str);
        zzfx.zzd zzdVarZzc = zzc(str);
        if (zzdVarZzc == null || !zzdVarZzc.zzp()) {
            return null;
        }
        return zzdVarZzc.zzd();
    }

    @WorkerThread
    public final boolean zzc(String str, String str2) throws Throwable {
        Boolean bool;
        zzt();
        zzv(str);
        if ("ecommerce_purchase".equals(str2) || FirebaseAnalytics.Event.PURCHASE.equals(str2) || FirebaseAnalytics.Event.REFUND.equals(str2)) {
            return true;
        }
        Map<String, Boolean> map = this.zzf.get(str);
        if (map == null || (bool = map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    @WorkerThread
    public final zzjb zza(String str, zzjc.zza zzaVar) {
        zzt();
        zzv(str);
        zzfx.zza zzaVarZzb = zzb(str);
        if (zzaVarZzb == null) {
            return zzjb.UNINITIALIZED;
        }
        for (zzfx.zza.zzb zzbVar : zzaVarZzb.zzf()) {
            if (zza(zzbVar.zzc()) == zzaVar) {
                int i = zzhn.zzc[zzbVar.zzb().ordinal()];
                if (i == 1) {
                    return zzjb.DENIED;
                }
                if (i != 2) {
                    return zzjb.UNINITIALIZED;
                }
                return zzjb.GRANTED;
            }
        }
        return zzjb.UNINITIALIZED;
    }

    private static zzjc.zza zza(zzfx.zza.zze zzeVar) {
        int i = zzhn.zzb[zzeVar.ordinal()];
        if (i == 1) {
            return zzjc.zza.AD_STORAGE;
        }
        if (i == 2) {
            return zzjc.zza.ANALYTICS_STORAGE;
        }
        if (i == 3) {
            return zzjc.zza.AD_USER_DATA;
        }
        if (i != 4) {
            return null;
        }
        return zzjc.zza.AD_PERSONALIZATION;
    }

    @WorkerThread
    private final zzfx.zzd zza(String str, byte[] bArr) {
        if (bArr == null) {
            return zzfx.zzd.zzg();
        }
        try {
            zzfx.zzd zzdVar = (zzfx.zzd) ((com.google.android.gms.internal.measurement.zzlc) ((zzfx.zzd.zza) zzol.zza(zzfx.zzd.zze(), bArr)).zzai());
            zzj().zzp().zza("Parsed config. version, gmp_app_id", zzdVar.zzs() ? Long.valueOf(zzdVar.zzc()) : null, zzdVar.zzq() ? zzdVar.zzi() : null);
            return zzdVar;
        } catch (com.google.android.gms.internal.measurement.zzlk e) {
            zzj().zzu().zza("Unable to merge remote config. appId", zzgi.zza(str), e);
            return zzfx.zzd.zzg();
        } catch (RuntimeException e2) {
            zzj().zzu().zza("Unable to merge remote config. appId", zzgi.zza(str), e2);
            return zzfx.zzd.zzg();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzaj
    @WorkerThread
    public final String zza(String str, String str2) throws Throwable {
        zzt();
        zzv(str);
        Map<String, String> map = this.zzc.get(str);
        if (map != null) {
            return map.get(str2);
        }
        return null;
    }

    private static Map<String, String> zza(zzfx.zzd zzdVar) {
        ArrayMap arrayMap = new ArrayMap(0);
        if (zzdVar != null) {
            for (zzfx.zzh zzhVar : zzdVar.zzn()) {
                arrayMap.put(zzhVar.zzb(), zzhVar.zzc());
            }
        }
        return arrayMap;
    }

    private final void zza(String str, zzfx.zzd.zza zzaVar) {
        HashSet hashSet = new HashSet();
        ArrayMap arrayMap = new ArrayMap(0);
        ArrayMap arrayMap2 = new ArrayMap(0);
        ArrayMap arrayMap3 = new ArrayMap(0);
        if (zzaVar != null) {
            Iterator<zzfx.zzb> it = zzaVar.zze().iterator();
            while (it.hasNext()) {
                hashSet.add(it.next().zzb());
            }
            for (int i = 0; i < zzaVar.zza(); i++) {
                zzfx.zzc.zza zzaVarZzcd = zzaVar.zza(i).zzcd();
                if (zzaVarZzcd.zzb().isEmpty()) {
                    zzj().zzu().zza("EventConfig contained null event name");
                } else {
                    String strZzb = zzaVarZzcd.zzb();
                    String strZzb2 = zzjf.zzb(zzaVarZzcd.zzb());
                    if (!TextUtils.isEmpty(strZzb2)) {
                        zzaVarZzcd = zzaVarZzcd.zza(strZzb2);
                        zzaVar.zza(i, zzaVarZzcd);
                    }
                    if (zzaVarZzcd.zze() && zzaVarZzcd.zzc()) {
                        arrayMap.put(strZzb, Boolean.TRUE);
                    }
                    if (zzaVarZzcd.zzf() && zzaVarZzcd.zzd()) {
                        arrayMap2.put(zzaVarZzcd.zzb(), Boolean.TRUE);
                    }
                    if (zzaVarZzcd.zzg()) {
                        if (zzaVarZzcd.zza() >= 2 && zzaVarZzcd.zza() <= 65535) {
                            arrayMap3.put(zzaVarZzcd.zzb(), Integer.valueOf(zzaVarZzcd.zza()));
                        } else {
                            zzj().zzu().zza("Invalid sampling rate. Event name, sample rate", zzaVarZzcd.zzb(), Integer.valueOf(zzaVarZzcd.zza()));
                        }
                    }
                }
            }
        }
        this.zzd.put(str, hashSet);
        this.zze.put(str, arrayMap);
        this.zzf.put(str, arrayMap2);
        this.zzi.put(str, arrayMap3);
    }

    @WorkerThread
    private final void zza(String str, zzfx.zzd zzdVar) {
        if (zzdVar.zza() == 0) {
            this.zza.remove(str);
            return;
        }
        zzj().zzp().zza("EES programs found", Integer.valueOf(zzdVar.zza()));
        zzhg.zzc zzcVar = zzdVar.zzm().get(0);
        try {
            com.google.android.gms.internal.measurement.zzb zzbVar = new com.google.android.gms.internal.measurement.zzb();
            zzbVar.zza("internal.remoteConfig", new zzhh(this, str));
            zzbVar.zza("internal.appMetadata", new zzhk(this, str));
            zzbVar.zza("internal.logger", new zzhj(this));
            zzbVar.zza(zzcVar);
            this.zza.put(str, zzbVar);
            zzj().zzp().zza("EES program loaded for appId, activities", str, Integer.valueOf(zzcVar.zza().zza()));
            Iterator<zzhg.zzb> it = zzcVar.zza().zzd().iterator();
            while (it.hasNext()) {
                zzj().zzp().zza("EES program activity", it.next().zzb());
            }
        } catch (com.google.android.gms.internal.measurement.zzc unused) {
            zzj().zzg().zza("Failed to load EES program. appId", str);
        }
    }

    @WorkerThread
    public final boolean zza(String str, byte[] bArr, String str2, String str3) {
        zzal();
        zzt();
        Preconditions.checkNotEmpty(str);
        zzfx.zzd.zza zzaVarZzcd = zza(str, bArr).zzcd();
        if (zzaVarZzcd == null) {
            return false;
        }
        zza(str, zzaVarZzcd);
        zza(str, (zzfx.zzd) ((com.google.android.gms.internal.measurement.zzlc) zzaVarZzcd.zzai()));
        this.zzh.put(str, (zzfx.zzd) ((com.google.android.gms.internal.measurement.zzlc) zzaVarZzcd.zzai()));
        this.zzj.put(str, zzaVarZzcd.zzc());
        this.zzk.put(str, str2);
        this.zzl.put(str, str3);
        this.zzc.put(str, zza((zzfx.zzd) ((com.google.android.gms.internal.measurement.zzlc) zzaVarZzcd.zzai())));
        zzh().zza(str, new ArrayList(zzaVarZzcd.zzd()));
        try {
            zzaVarZzcd.zzb();
            bArr = ((zzfx.zzd) ((com.google.android.gms.internal.measurement.zzlc) zzaVarZzcd.zzai())).zzca();
        } catch (RuntimeException e) {
            zzj().zzu().zza("Unable to serialize reduced-size config. Storing full config instead. appId", zzgi.zza(str), e);
        }
        zzam zzamVarZzh = zzh();
        Preconditions.checkNotEmpty(str);
        zzamVarZzh.zzt();
        zzamVarZzh.zzal();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr);
        contentValues.put("config_last_modified_time", str2);
        contentValues.put("e_tag", str3);
        try {
            if (zzamVarZzh.m14494e_().update("apps", contentValues, "app_id = ?", new String[]{str}) == 0) {
                zzamVarZzh.zzj().zzg().zza("Failed to update remote config (got 0). appId", zzgi.zza(str));
            }
        } catch (SQLiteException e2) {
            zzamVarZzh.zzj().zzg().zza("Error storing remote config. appId", zzgi.zza(str), e2);
        }
        this.zzh.put(str, (zzfx.zzd) ((com.google.android.gms.internal.measurement.zzlc) zzaVarZzcd.zzai()));
        return true;
    }
}
