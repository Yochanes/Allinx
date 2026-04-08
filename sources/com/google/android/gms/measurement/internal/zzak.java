package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@SafeParcelable.Class(creator = "ConsentParcelCreator")
public final class zzak extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzak> CREATOR = new zzan();

    @SafeParcelable.Field(m14479id = 1)
    public final Bundle zza;

    @SafeParcelable.Constructor
    public zzak(@SafeParcelable.Param(m14480id = 1) Bundle bundle) {
        this.zza = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBundle(parcel, 1, this.zza, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
