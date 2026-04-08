package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Iterator;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@SafeParcelable.Class(creator = "EventParamsCreator")
@SafeParcelable.Reserved({1})
public final class zzbc extends AbstractSafeParcelable implements Iterable<String> {
    public static final Parcelable.Creator<zzbc> CREATOR = new zzbe();

    @SafeParcelable.Field(getter = "z", m14479id = 2)
    private final Bundle zza;

    @SafeParcelable.Constructor
    public zzbc(@SafeParcelable.Param(m14480id = 2) Bundle bundle) {
        this.zza = bundle;
    }

    public static /* bridge */ /* synthetic */ Bundle zza(zzbc zzbcVar) {
        return zzbcVar.zza;
    }

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        return new zzbf(this);
    }

    public final String toString() {
        return this.zza.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBundle(parcel, 2, zzb(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final Bundle zzb() {
        return new Bundle(this.zza);
    }

    public final Object zzc(String str) {
        return this.zza.get(str);
    }

    public final String zzd(String str) {
        return this.zza.getString(str);
    }

    public final int zza() {
        return this.zza.size();
    }

    public final Long zzb(String str) {
        return Long.valueOf(this.zza.getLong(str));
    }

    public final Double zza(String str) {
        return Double.valueOf(this.zza.getDouble(str));
    }
}
