package com.google.android.gms.common.api.internal;

import android.os.Bundle;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
final class zza implements Runnable {
    final /* synthetic */ LifecycleCallback zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzb zzc;

    public zza(zzb zzbVar, LifecycleCallback lifecycleCallback, String str) {
        this.zzc = zzbVar;
        this.zza = lifecycleCallback;
        this.zzb = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle;
        zzb zzbVar = this.zzc;
        if (zzb.zza(zzbVar) > 0) {
            LifecycleCallback lifecycleCallback = this.zza;
            if (zzb.zzb(zzbVar) != null) {
                bundle = zzb.zzb(zzbVar).getBundle(this.zzb);
            } else {
                bundle = null;
            }
            lifecycleCallback.onCreate(bundle);
        }
        if (zzb.zza(this.zzc) >= 2) {
            this.zza.onStart();
        }
        if (zzb.zza(this.zzc) >= 3) {
            this.zza.onResume();
        }
        if (zzb.zza(this.zzc) >= 4) {
            this.zza.onStop();
        }
        if (zzb.zza(this.zzc) >= 5) {
            this.zza.onDestroy();
        }
    }
}
