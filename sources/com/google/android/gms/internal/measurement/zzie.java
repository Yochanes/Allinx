package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
final class zzie extends ContentObserver {
    private final /* synthetic */ zzic zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzie(zzic zzicVar, Handler handler) {
        super(null);
        this.zza = zzicVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z2) {
        this.zza.zzd();
    }
}
