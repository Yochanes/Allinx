package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@SafeParcelable.Class(creator = "EventParcelCreator")
@SafeParcelable.Reserved({1})
public final class zzbh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbh> CREATOR = new zzbg();

    @SafeParcelable.Field(m14479id = 2)
    public final String zza;

    @SafeParcelable.Field(m14479id = 3)
    public final zzbc zzb;

    @SafeParcelable.Field(m14479id = 4)
    public final String zzc;

    @SafeParcelable.Field(m14479id = 5)
    public final long zzd;

    public zzbh(zzbh zzbhVar, long j) {
        Preconditions.checkNotNull(zzbhVar);
        this.zza = zzbhVar.zza;
        this.zzb = zzbhVar.zzb;
        this.zzc = zzbhVar.zzc;
        this.zzd = j;
    }

    public final String toString() {
        String str = this.zzc;
        String str2 = this.zza;
        String strValueOf = String.valueOf(this.zzb);
        StringBuilder sbM25v = AbstractC0000a.m25v("origin=", str, ",name=", str2, ",params=");
        sbM25v.append(strValueOf);
        return sbM25v.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zza, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzb, i, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzc, false);
        SafeParcelWriter.writeLong(parcel, 5, this.zzd);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzbh(@SafeParcelable.Param(m14480id = 2) String str, @SafeParcelable.Param(m14480id = 3) zzbc zzbcVar, @SafeParcelable.Param(m14480id = 4) String str2, @SafeParcelable.Param(m14480id = 5) long j) {
        this.zza = str;
        this.zzb = zzbcVar;
        this.zzc = str2;
        this.zzd = j;
    }
}
