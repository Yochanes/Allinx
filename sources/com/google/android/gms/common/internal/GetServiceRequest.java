package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.protobuf.Field;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
@SafeParcelable.Class(creator = "GetServiceRequestCreator")
@SafeParcelable.Reserved({9})
public class GetServiceRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<GetServiceRequest> CREATOR = new zzn();
    static final Scope[] zza = new Scope[0];
    static final Feature[] zzb = new Feature[0];

    @SafeParcelable.VersionField(m14482id = 1)
    final int zzc;

    @SafeParcelable.Field(m14479id = 2)
    final int zzd;

    @SafeParcelable.Field(m14479id = 3)
    final int zze;

    @SafeParcelable.Field(m14479id = 4)
    String zzf;

    @Nullable
    @SafeParcelable.Field(m14479id = 5)
    IBinder zzg;

    @SafeParcelable.Field(defaultValueUnchecked = "GetServiceRequest.EMPTY_SCOPES", m14479id = 6)
    Scope[] zzh;

    @SafeParcelable.Field(defaultValueUnchecked = "new android.os.Bundle()", m14479id = 7)
    Bundle zzi;

    @Nullable
    @SafeParcelable.Field(m14479id = 8)
    Account zzj;

    @SafeParcelable.Field(defaultValueUnchecked = "GetServiceRequest.EMPTY_FEATURES", m14479id = 10)
    Feature[] zzk;

    @SafeParcelable.Field(defaultValueUnchecked = "GetServiceRequest.EMPTY_FEATURES", m14479id = 11)
    Feature[] zzl;

    @SafeParcelable.Field(m14479id = Field.Kind.TYPE_BYTES_VALUE)
    final boolean zzm;

    @SafeParcelable.Field(defaultValue = "0", m14479id = 13)
    final int zzn;

    @SafeParcelable.Field(getter = "isRequestingTelemetryConfiguration", m14479id = 14)
    boolean zzo;

    @Nullable
    @SafeParcelable.Field(getter = "getAttributionTag", m14479id = 15)
    private final String zzp;

    @SafeParcelable.Constructor
    public GetServiceRequest(@SafeParcelable.Param(m14480id = 1) int i, @SafeParcelable.Param(m14480id = 2) int i2, @SafeParcelable.Param(m14480id = 3) int i3, @SafeParcelable.Param(m14480id = 4) String str, @Nullable @SafeParcelable.Param(m14480id = 5) IBinder iBinder, @SafeParcelable.Param(m14480id = 6) Scope[] scopeArr, @SafeParcelable.Param(m14480id = 7) Bundle bundle, @Nullable @SafeParcelable.Param(m14480id = 8) Account account, @SafeParcelable.Param(m14480id = 10) Feature[] featureArr, @SafeParcelable.Param(m14480id = 11) Feature[] featureArr2, @SafeParcelable.Param(m14480id = Field.Kind.TYPE_BYTES_VALUE) boolean z2, @SafeParcelable.Param(m14480id = 13) int i4, @SafeParcelable.Param(m14480id = 14) boolean z3, @Nullable @SafeParcelable.Param(m14480id = 15) String str2) {
        scopeArr = scopeArr == null ? zza : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        featureArr = featureArr == null ? zzb : featureArr;
        featureArr2 = featureArr2 == null ? zzb : featureArr2;
        this.zzc = i;
        this.zzd = i2;
        this.zze = i3;
        if ("com.google.android.gms".equals(str)) {
            this.zzf = "com.google.android.gms";
        } else {
            this.zzf = str;
        }
        if (i < 2) {
            this.zzj = iBinder != null ? AccountAccessor.getAccountBinderSafe(IAccountAccessor.Stub.asInterface(iBinder)) : null;
        } else {
            this.zzg = iBinder;
            this.zzj = account;
        }
        this.zzh = scopeArr;
        this.zzi = bundle;
        this.zzk = featureArr;
        this.zzl = featureArr2;
        this.zzm = z2;
        this.zzn = i4;
        this.zzo = z3;
        this.zzp = str2;
    }

    @NonNull
    @KeepForSdk
    public Bundle getExtraArgs() {
        return this.zzi;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        zzn.zza(this, parcel, i);
    }

    @Nullable
    public final String zza() {
        return this.zzp;
    }
}
