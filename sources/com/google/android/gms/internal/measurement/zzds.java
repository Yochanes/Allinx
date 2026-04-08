package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final class zzds extends zzbu implements zzdq {
    public zzds(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // com.google.android.gms.internal.measurement.zzdq
    public final int zza() {
        Parcel parcelZza = zza(2, m14490a_());
        int i = parcelZza.readInt();
        parcelZza.recycle();
        return i;
    }

    @Override // com.google.android.gms.internal.measurement.zzdq
    public final void zza(String str, String str2, Bundle bundle, long j) {
        Parcel parcelM14490a_ = m14490a_();
        parcelM14490a_.writeString(str);
        parcelM14490a_.writeString(str2);
        zzbw.zza(parcelM14490a_, bundle);
        parcelM14490a_.writeLong(j);
        zzb(1, parcelM14490a_);
    }
}
