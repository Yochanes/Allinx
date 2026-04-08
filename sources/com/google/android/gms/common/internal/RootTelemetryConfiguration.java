package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
@SafeParcelable.Class(creator = "RootTelemetryConfigurationCreator")
public class RootTelemetryConfiguration extends AbstractSafeParcelable {

    @NonNull
    @KeepForSdk
    public static final Parcelable.Creator<RootTelemetryConfiguration> CREATOR = new zzaj();

    @SafeParcelable.Field(getter = "getVersion", m14479id = 1)
    private final int zza;

    @SafeParcelable.Field(getter = "getMethodInvocationTelemetryEnabled", m14479id = 2)
    private final boolean zzb;

    @SafeParcelable.Field(getter = "getMethodTimingTelemetryEnabled", m14479id = 3)
    private final boolean zzc;

    @SafeParcelable.Field(getter = "getBatchPeriodMillis", m14479id = 4)
    private final int zzd;

    @SafeParcelable.Field(getter = "getMaxMethodInvocationsInBatch", m14479id = 5)
    private final int zze;

    @SafeParcelable.Constructor
    public RootTelemetryConfiguration(@SafeParcelable.Param(m14480id = 1) int i, @SafeParcelable.Param(m14480id = 2) boolean z2, @SafeParcelable.Param(m14480id = 3) boolean z3, @SafeParcelable.Param(m14480id = 4) int i2, @SafeParcelable.Param(m14480id = 5) int i3) {
        this.zza = i;
        this.zzb = z2;
        this.zzc = z3;
        this.zzd = i2;
        this.zze = i3;
    }

    @KeepForSdk
    public int getBatchPeriodMillis() {
        return this.zzd;
    }

    @KeepForSdk
    public int getMaxMethodInvocationsInBatch() {
        return this.zze;
    }

    @KeepForSdk
    public boolean getMethodInvocationTelemetryEnabled() {
        return this.zzb;
    }

    @KeepForSdk
    public boolean getMethodTimingTelemetryEnabled() {
        return this.zzc;
    }

    @KeepForSdk
    public int getVersion() {
        return this.zza;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, getVersion());
        SafeParcelWriter.writeBoolean(parcel, 2, getMethodInvocationTelemetryEnabled());
        SafeParcelWriter.writeBoolean(parcel, 3, getMethodTimingTelemetryEnabled());
        SafeParcelWriter.writeInt(parcel, 4, getBatchPeriodMillis());
        SafeParcelWriter.writeInt(parcel, 5, getMaxMethodInvocationsInBatch());
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
