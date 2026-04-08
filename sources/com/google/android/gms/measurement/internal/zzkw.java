package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.MainThread;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzqn;
import com.google.firebase.messaging.Constants;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@MainThread
@VisibleForTesting
final class zzkw implements Application.ActivityLifecycleCallbacks {
    private final /* synthetic */ zzjk zza;

    public zzkw(zzjk zzjkVar) {
        this.zza = zzjkVar;
    }

    public static /* synthetic */ void zza(zzkw zzkwVar, boolean z2, Uri uri, String str, String str2) {
        Bundle bundleZza;
        zzkwVar.zza.zzt();
        try {
            zzop zzopVarZzq = zzkwVar.zza.zzq();
            boolean z3 = zzqn.zza() && zzkwVar.zza.zze().zza(zzbj.zzcs);
            if (TextUtils.isEmpty(str2)) {
                bundleZza = null;
            } else if (str2.contains("gclid") || ((z3 && str2.contains("gbraid")) || str2.contains("utm_campaign") || str2.contains("utm_source") || str2.contains("utm_medium") || str2.contains("utm_id") || str2.contains("dclid") || str2.contains("srsltid") || str2.contains("sfmc_id"))) {
                bundleZza = zzopVarZzq.zza(Uri.parse("https://google.com/search?".concat(str2)), z3);
                if (bundleZza != null) {
                    bundleZza.putString("_cis", "referrer");
                }
            } else {
                zzopVarZzq.zzj().zzc().zza("Activity created with data 'referrer' without required params");
                bundleZza = null;
            }
            if (z2) {
                Bundle bundleZza2 = zzkwVar.zza.zzq().zza(uri, zzqn.zza() && zzkwVar.zza.zze().zza(zzbj.zzcs));
                if (bundleZza2 != null) {
                    bundleZza2.putString("_cis", "intent");
                    if (!bundleZza2.containsKey("gclid") && bundleZza != null && bundleZza.containsKey("gclid")) {
                        bundleZza2.putString("_cer", "gclid=" + bundleZza.getString("gclid"));
                    }
                    zzkwVar.zza.zzc(str, Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN, bundleZza2);
                    zzkwVar.zza.zza.zza(str, bundleZza2);
                }
            }
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            zzkwVar.zza.zzj().zzc().zza("Activity created with referrer", str2);
            if (zzkwVar.zza.zze().zza(zzbj.zzbp)) {
                if (bundleZza != null) {
                    zzkwVar.zza.zzc(str, Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN, bundleZza);
                    zzkwVar.zza.zza.zza(str, bundleZza);
                } else {
                    zzkwVar.zza.zzj().zzc().zza("Referrer does not contain valid parameters", str2);
                }
                zzkwVar.zza.zza("auto", "_ldl", (Object) null, true);
                return;
            }
            if (!str2.contains("gclid") || (!str2.contains("utm_campaign") && !str2.contains("utm_source") && !str2.contains("utm_medium") && !str2.contains("utm_term") && !str2.contains("utm_content"))) {
                zzkwVar.zza.zzj().zzc().zza("Activity created with data 'referrer' without required params");
            } else {
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                zzkwVar.zza.zza("auto", "_ldl", (Object) str2, true);
            }
        } catch (RuntimeException e) {
            zzkwVar.zza.zzj().zzg().zza("Throwable caught in handleReferrerForOnActivityCreated", e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onActivityCreated(Activity activity, Bundle bundle) throws Throwable {
        zzkw zzkwVar;
        try {
            try {
                this.zza.zzj().zzp().zza("onActivityCreated");
                Intent intent = activity.getIntent();
                if (intent == null) {
                    this.zza.zzn().zza(activity, bundle);
                    return;
                }
                Uri data = intent.getData();
                if (data == null || !data.isHierarchical()) {
                    Bundle extras = intent.getExtras();
                    if (extras != null) {
                        String string = extras.getString("com.android.vending.referral_url");
                        data = !TextUtils.isEmpty(string) ? Uri.parse(string) : null;
                    }
                }
                Uri uri = data;
                if (uri == null || !uri.isHierarchical()) {
                    this.zza.zzn().zza(activity, bundle);
                    return;
                }
                this.zza.zzq();
                String str = zzop.zza(intent) ? "gs" : "auto";
                String queryParameter = uri.getQueryParameter("referrer");
                zzkwVar = this;
                try {
                    this.zza.zzl().zzb(new zzkz(zzkwVar, bundle == null, uri, str, queryParameter));
                    zzkwVar.zza.zzn().zza(activity, bundle);
                    return;
                } catch (RuntimeException e) {
                    e = e;
                }
            } catch (Throwable th) {
                th = th;
                this.zza.zzn().zza(activity, bundle);
                throw th;
            }
        } catch (RuntimeException e2) {
            e = e2;
            zzkwVar = this;
        } catch (Throwable th2) {
            th = th2;
            this.zza.zzn().zza(activity, bundle);
            throw th;
        }
        zzkwVar.zza.zzj().zzg().zza("Throwable caught in onActivityCreated", e);
        zzkwVar.zza.zzn().zza(activity, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.zza.zzn().zza(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    @MainThread
    public final void onActivityPaused(Activity activity) {
        this.zza.zzn().zzb(activity);
        zznb zznbVarZzp = this.zza.zzp();
        zznbVarZzp.zzl().zzb(new zznd(zznbVarZzp, zznbVarZzp.zzb().elapsedRealtime()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    @MainThread
    public final void onActivityResumed(Activity activity) {
        zznb zznbVarZzp = this.zza.zzp();
        zznbVarZzp.zzl().zzb(new zzna(zznbVarZzp, zznbVarZzp.zzb().elapsedRealtime()));
        this.zza.zzn().zzc(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.zza.zzn().zzb(activity, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
