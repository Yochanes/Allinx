package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.protobuf.Field;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@SafeParcelable.Class(creator = "ConditionalUserPropertyParcelCreator")
public final class zzaf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaf> CREATOR = new zzae();

    @Nullable
    @SafeParcelable.Field(m14479id = 2)
    public String zza;

    @SafeParcelable.Field(m14479id = 3)
    public String zzb;

    @SafeParcelable.Field(m14479id = 4)
    public zzok zzc;

    @SafeParcelable.Field(m14479id = 5)
    public long zzd;

    @SafeParcelable.Field(m14479id = 6)
    public boolean zze;

    @Nullable
    @SafeParcelable.Field(m14479id = 7)
    public String zzf;

    @Nullable
    @SafeParcelable.Field(m14479id = 8)
    public zzbh zzg;

    @SafeParcelable.Field(m14479id = 9)
    public long zzh;

    @Nullable
    @SafeParcelable.Field(m14479id = 10)
    public zzbh zzi;

    @SafeParcelable.Field(m14479id = 11)
    public long zzj;

    @Nullable
    @SafeParcelable.Field(m14479id = Field.Kind.TYPE_BYTES_VALUE)
    public zzbh zzk;

    public zzaf(zzaf zzafVar) {
        Preconditions.checkNotNull(zzafVar);
        this.zza = zzafVar.zza;
        this.zzb = zzafVar.zzb;
        this.zzc = zzafVar.zzc;
        this.zzd = zzafVar.zzd;
        this.zze = zzafVar.zze;
        this.zzf = zzafVar.zzf;
        this.zzg = zzafVar.zzg;
        this.zzh = zzafVar.zzh;
        this.zzi = zzafVar.zzi;
        this.zzj = zzafVar.zzj;
        this.zzk = zzafVar.zzk;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zza, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzb, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzc, i, false);
        SafeParcelWriter.writeLong(parcel, 5, this.zzd);
        SafeParcelWriter.writeBoolean(parcel, 6, this.zze);
        SafeParcelWriter.writeString(parcel, 7, this.zzf, false);
        SafeParcelWriter.writeParcelable(parcel, 8, this.zzg, i, false);
        SafeParcelWriter.writeLong(parcel, 9, this.zzh);
        SafeParcelWriter.writeParcelable(parcel, 10, this.zzi, i, false);
        SafeParcelWriter.writeLong(parcel, 11, this.zzj);
        SafeParcelWriter.writeParcelable(parcel, 12, this.zzk, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzaf(@Nullable @SafeParcelable.Param(m14480id = 2) String str, @SafeParcelable.Param(m14480id = 3) String str2, @SafeParcelable.Param(m14480id = 4) zzok zzokVar, @SafeParcelable.Param(m14480id = 5) long j, @SafeParcelable.Param(m14480id = 6) boolean z2, @Nullable @SafeParcelable.Param(m14480id = 7) String str3, @Nullable @SafeParcelable.Param(m14480id = 8) zzbh zzbhVar, @SafeParcelable.Param(m14480id = 9) long j2, @Nullable @SafeParcelable.Param(m14480id = 10) zzbh zzbhVar2, @SafeParcelable.Param(m14480id = 11) long j3, @Nullable @SafeParcelable.Param(m14480id = Field.Kind.TYPE_BYTES_VALUE) zzbh zzbhVar3) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzokVar;
        this.zzd = j;
        this.zze = z2;
        this.zzf = str3;
        this.zzg = zzbhVar;
        this.zzh = j2;
        this.zzi = zzbhVar2;
        this.zzj = j3;
        this.zzk = zzbhVar3;
    }
}
