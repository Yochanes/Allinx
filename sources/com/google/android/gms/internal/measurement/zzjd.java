package com.google.android.gms.internal.measurement;

import android.content.SharedPreferences;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class zzjd implements SharedPreferences.OnSharedPreferenceChangeListener {
    private /* synthetic */ zzja zza;

    public /* synthetic */ zzjd(zzja zzjaVar) {
        this.zza = zzjaVar;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        this.zza.zza(sharedPreferences, str);
    }
}
