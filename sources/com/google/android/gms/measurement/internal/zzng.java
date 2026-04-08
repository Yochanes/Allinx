package com.google.android.gms.measurement.internal;

import androidx.annotation.WorkerThread;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
final class zzng extends zzax {
    private final /* synthetic */ zznh zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzng(zznh zznhVar, zzja zzjaVar) {
        super(zzjaVar);
        this.zza = zznhVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzax
    @WorkerThread
    public final void zzb() {
        zznh.zza(this.zza);
    }
}
