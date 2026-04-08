package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final class zzca extends zzbu implements zzbz {
    public zzca(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    @Override // com.google.android.gms.internal.measurement.zzbz
    public final Bundle zza(Bundle bundle) {
        Parcel parcelM14490a_ = m14490a_();
        zzbw.zza(parcelM14490a_, bundle);
        Parcel parcelZza = zza(1, parcelM14490a_);
        Bundle bundle2 = (Bundle) zzbw.zza(parcelZza, Bundle.CREATOR);
        parcelZza.recycle();
        return bundle2;
    }
}
