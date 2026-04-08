package com.google.android.gms.common.api.internal;

import android.os.Bundle;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
final class zzc implements Runnable {
    final /* synthetic */ LifecycleCallback zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzd zzc;

    public zzc(zzd zzdVar, LifecycleCallback lifecycleCallback, String str) {
        this.zzc = zzdVar;
        this.zza = lifecycleCallback;
        this.zzb = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle;
        zzd zzdVar = this.zzc;
        if (zzd.zza(zzdVar) > 0) {
            LifecycleCallback lifecycleCallback = this.zza;
            if (zzd.zzb(zzdVar) != null) {
                bundle = zzd.zzb(zzdVar).getBundle(this.zzb);
            } else {
                bundle = null;
            }
            lifecycleCallback.onCreate(bundle);
        }
        if (zzd.zza(this.zzc) >= 2) {
            this.zza.onStart();
        }
        if (zzd.zza(this.zzc) >= 3) {
            this.zza.onResume();
        }
        if (zzd.zza(this.zzc) >= 4) {
            this.zza.onStop();
        }
        if (zzd.zza(this.zzc) >= 5) {
            this.zza.onDestroy();
        }
    }
}
