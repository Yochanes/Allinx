package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdn extends zzbu implements zzdl {
    public zzdn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // com.google.android.gms.internal.measurement.zzdl
    public final void zza(Bundle bundle) {
        Parcel parcelM14490a_ = m14490a_();
        zzbw.zza(parcelM14490a_, bundle);
        zzb(1, parcelM14490a_);
    }
}
