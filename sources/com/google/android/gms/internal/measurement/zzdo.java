package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzdo extends zzbx implements zzdl {
    public zzdo() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // com.google.android.gms.internal.measurement.zzbx
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        Bundle bundle = (Bundle) zzbw.zza(parcel, Bundle.CREATOR);
        zzbw.zzb(parcel);
        zza(bundle);
        parcel2.writeNoException();
        return true;
    }
}
