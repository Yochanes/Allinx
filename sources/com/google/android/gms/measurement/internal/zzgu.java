package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import androidx.annotation.WorkerThread;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzjc;
import com.google.common.annotations.VisibleForTesting;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
final class zzgu extends zzix {
    static final Pair<String, Long> zza = new Pair<>("", 0L);
    private long zzaa;
    public zzgy zzb;
    public final zzgz zzc;
    public final zzgz zzd;
    public final zzha zze;
    public final zzgz zzf;
    public final zzgx zzg;
    public final zzha zzh;
    public final zzgw zzi;
    public final zzgx zzj;
    public final zzgz zzk;
    public final zzgz zzl;
    public boolean zzm;
    public zzgx zzn;
    public zzgx zzo;
    public zzgz zzp;
    public final zzha zzq;
    public final zzha zzr;
    public final zzgz zzs;
    public final zzgw zzt;
    private SharedPreferences zzv;
    private Object zzw;
    private SharedPreferences zzx;
    private String zzy;
    private boolean zzz;

    public zzgu(zzhw zzhwVar) {
        super(zzhwVar);
        this.zzw = new Object();
        this.zzf = new zzgz(this, "session_timeout", 1800000L);
        this.zzg = new zzgx(this, "start_new_session", true);
        this.zzk = new zzgz(this, "last_pause_time", 0L);
        this.zzl = new zzgz(this, "session_id", 0L);
        this.zzh = new zzha(this, "non_personalized_ads", null);
        this.zzi = new zzgw(this, "last_received_uri_timestamps_by_source", null);
        this.zzj = new zzgx(this, "allow_remote_dynamite", false);
        this.zzc = new zzgz(this, "first_open_time", 0L);
        this.zzd = new zzgz(this, "app_install_time", 0L);
        this.zze = new zzha(this, "app_instance_id", null);
        this.zzn = new zzgx(this, "app_backgrounded", false);
        this.zzo = new zzgx(this, "deep_link_retrieval_complete", false);
        this.zzp = new zzgz(this, "deep_link_retrieval_attempts", 0L);
        this.zzq = new zzha(this, "firebase_feature_rollouts", null);
        this.zzr = new zzha(this, "deferred_attribution_cache", null);
        this.zzs = new zzgz(this, "deferred_attribution_cache_timestamp", 0L);
        this.zzt = new zzgw(this, "default_event_parameters", null);
    }

    @WorkerThread
    public final Pair<String, Boolean> zza(String str) {
        zzt();
        if (!zzn().zza(zzjc.zza.AD_STORAGE)) {
            return new Pair<>("", Boolean.FALSE);
        }
        long jElapsedRealtime = zzb().elapsedRealtime();
        if (this.zzy != null && jElapsedRealtime < this.zzaa) {
            return new Pair<>(this.zzy, Boolean.valueOf(this.zzz));
        }
        this.zzaa = zze().zzd(str) + jElapsedRealtime;
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(zza());
            this.zzy = "";
            String id = advertisingIdInfo.getId();
            if (id != null) {
                this.zzy = id;
            }
            this.zzz = advertisingIdInfo.isLimitAdTrackingEnabled();
        } catch (Exception e) {
            zzj().zzc().zza("Unable to get advertising id", e);
            this.zzy = "";
        }
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
        return new Pair<>(this.zzy, Boolean.valueOf(this.zzz));
    }

    @Override // com.google.android.gms.measurement.internal.zzix
    @EnsuresNonNull.List
    @WorkerThread
    public final void zzaa() {
        SharedPreferences sharedPreferences = zza().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.zzv = sharedPreferences;
        boolean z2 = sharedPreferences.getBoolean("has_been_opened", false);
        this.zzm = z2;
        if (!z2) {
            SharedPreferences.Editor editorEdit = this.zzv.edit();
            editorEdit.putBoolean("has_been_opened", true);
            editorEdit.apply();
        }
        this.zzb = new zzgy(this, "health_monitor", Math.max(0L, zzbj.zzc.zza(null).longValue()), null);
    }

    @WorkerThread
    public final boolean zzab() {
        SharedPreferences sharedPreferences = this.zzv;
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.contains("deferred_analytics_collection");
    }

    @WorkerThread
    public final void zzb(String str) {
        zzt();
        SharedPreferences.Editor editorEdit = zzg().edit();
        editorEdit.putString("admob_app_id", str);
        editorEdit.apply();
    }

    @WorkerThread
    public final SharedPreferences zzc() {
        zzt();
        zzac();
        if (this.zzx == null) {
            synchronized (this.zzw) {
                try {
                    if (this.zzx == null) {
                        String str = zza().getPackageName() + "_preferences";
                        zzj().zzp().zza("Default prefs file", str);
                        this.zzx = zza().getSharedPreferences(str, 0);
                    }
                } finally {
                }
            }
        }
        return this.zzx;
    }

    @VisibleForTesting
    @WorkerThread
    public final SharedPreferences zzg() {
        zzt();
        zzac();
        Preconditions.checkNotNull(this.zzv);
        return this.zzv;
    }

    public final SparseArray<Long> zzh() {
        Bundle bundleZza = this.zzi.zza();
        if (bundleZza == null) {
            return new SparseArray<>();
        }
        int[] intArray = bundleZza.getIntArray("uriSources");
        long[] longArray = bundleZza.getLongArray("uriTimestamps");
        if (intArray == null || longArray == null) {
            return new SparseArray<>();
        }
        if (intArray.length != longArray.length) {
            zzj().zzg().zza("Trigger URI source and timestamp array lengths do not match");
            return new SparseArray<>();
        }
        SparseArray<Long> sparseArray = new SparseArray<>();
        for (int i = 0; i < intArray.length; i++) {
            sparseArray.put(intArray[i], Long.valueOf(longArray[i]));
        }
        return sparseArray;
    }

    @WorkerThread
    public final zzaz zzm() {
        zzt();
        return zzaz.zza(zzg().getString("dma_consent_settings", null));
    }

    @WorkerThread
    public final zzjc zzn() {
        zzt();
        return zzjc.zza(zzg().getString("consent_settings", "G1"), zzg().getInt("consent_source", 100));
    }

    @Override // com.google.android.gms.measurement.internal.zzix
    public final boolean zzo() {
        return true;
    }

    @WorkerThread
    public final Boolean zzp() {
        zzt();
        if (zzg().contains("use_service")) {
            return Boolean.valueOf(zzg().getBoolean("use_service", false));
        }
        return null;
    }

    @WorkerThread
    public final Boolean zzu() {
        zzt();
        if (zzg().contains("measurement_enabled_from_api")) {
            return Boolean.valueOf(zzg().getBoolean("measurement_enabled_from_api", true));
        }
        return null;
    }

    @WorkerThread
    public final Boolean zzv() {
        zzt();
        if (zzg().contains("measurement_enabled")) {
            return Boolean.valueOf(zzg().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    @WorkerThread
    public final String zzw() {
        zzt();
        String string = zzg().getString("previous_os_version", null);
        zzf().zzac();
        String str = Build.VERSION.RELEASE;
        if (!TextUtils.isEmpty(str) && !str.equals(string)) {
            SharedPreferences.Editor editorEdit = zzg().edit();
            editorEdit.putString("previous_os_version", str);
            editorEdit.apply();
        }
        return string;
    }

    @WorkerThread
    public final String zzx() {
        zzt();
        return zzg().getString("admob_app_id", null);
    }

    @WorkerThread
    public final String zzy() {
        zzt();
        return zzg().getString("gmp_app_id", null);
    }

    @WorkerThread
    public final void zzz() {
        zzt();
        Boolean boolZzv = zzv();
        SharedPreferences.Editor editorEdit = zzg().edit();
        editorEdit.clear();
        editorEdit.apply();
        if (boolZzv != null) {
            zza(boolZzv);
        }
    }

    @WorkerThread
    public final void zzb(Boolean bool) {
        zzt();
        SharedPreferences.Editor editorEdit = zzg().edit();
        if (bool != null) {
            editorEdit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
        } else {
            editorEdit.remove("measurement_enabled_from_api");
        }
        editorEdit.apply();
    }

    @WorkerThread
    public final void zzb(boolean z2) {
        zzt();
        zzj().zzp().zza("App measurement setting deferred collection", Boolean.valueOf(z2));
        SharedPreferences.Editor editorEdit = zzg().edit();
        editorEdit.putBoolean("deferred_analytics_collection", z2);
        editorEdit.apply();
    }

    @WorkerThread
    public final void zzc(String str) {
        zzt();
        SharedPreferences.Editor editorEdit = zzg().edit();
        editorEdit.putString("gmp_app_id", str);
        editorEdit.apply();
    }

    @WorkerThread
    public final void zza(Boolean bool) {
        zzt();
        SharedPreferences.Editor editorEdit = zzg().edit();
        if (bool != null) {
            editorEdit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            editorEdit.remove("measurement_enabled");
        }
        editorEdit.apply();
    }

    @WorkerThread
    public final void zza(boolean z2) {
        zzt();
        SharedPreferences.Editor editorEdit = zzg().edit();
        editorEdit.putBoolean("use_service", z2);
        editorEdit.apply();
    }

    public final void zza(SparseArray<Long> sparseArray) {
        if (sparseArray == null) {
            this.zzi.zza(null);
            return;
        }
        int[] iArr = new int[sparseArray.size()];
        long[] jArr = new long[sparseArray.size()];
        for (int i = 0; i < sparseArray.size(); i++) {
            iArr[i] = sparseArray.keyAt(i);
            jArr[i] = sparseArray.valueAt(i).longValue();
        }
        Bundle bundle = new Bundle();
        bundle.putIntArray("uriSources", iArr);
        bundle.putLongArray("uriTimestamps", jArr);
        this.zzi.zza(bundle);
    }

    public final boolean zza(long j) {
        return j - this.zzf.zza() > this.zzk.zza();
    }

    @WorkerThread
    public final boolean zza(zzaz zzazVar) {
        zzt();
        if (!zzjc.zza(zzazVar.zza(), zzm().zza())) {
            return false;
        }
        SharedPreferences.Editor editorEdit = zzg().edit();
        editorEdit.putString("dma_consent_settings", zzazVar.zzf());
        editorEdit.apply();
        return true;
    }

    @WorkerThread
    public final boolean zza(zzjc zzjcVar) {
        zzt();
        int iZza = zzjcVar.zza();
        if (!zza(iZza)) {
            return false;
        }
        SharedPreferences.Editor editorEdit = zzg().edit();
        editorEdit.putString("consent_settings", zzjcVar.zzh());
        editorEdit.putInt("consent_source", iZza);
        editorEdit.apply();
        return true;
    }

    @WorkerThread
    public final boolean zza(int i) {
        return zzjc.zza(i, zzg().getInt("consent_source", 100));
    }

    @WorkerThread
    public final boolean zza(zzni zzniVar) {
        zzt();
        String string = zzg().getString("stored_tcf_param", "");
        String strZzc = zzniVar.zzc();
        if (strZzc.equals(string)) {
            return false;
        }
        SharedPreferences.Editor editorEdit = zzg().edit();
        editorEdit.putString("stored_tcf_param", strZzc);
        editorEdit.apply();
        return true;
    }
}
