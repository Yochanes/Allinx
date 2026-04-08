package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@SafeParcelable.Class(creator = "TriggerUriParcelCreator")
public final class zznk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zznk> CREATOR = new zznn();

    @SafeParcelable.Field(m14479id = 1)
    public final String zza;

    @SafeParcelable.Field(m14479id = 2)
    public final long zzb;

    @SafeParcelable.Field(m14479id = 3)
    public final int zzc;

    @SafeParcelable.Constructor
    public zznk(@SafeParcelable.Param(m14480id = 1) String str, @SafeParcelable.Param(m14480id = 2) long j, @SafeParcelable.Param(m14480id = 3) int i) {
        this.zza = str;
        this.zzb = j;
        this.zzc = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.writeLong(parcel, 2, this.zzb);
        SafeParcelWriter.writeInt(parcel, 3, this.zzc);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
