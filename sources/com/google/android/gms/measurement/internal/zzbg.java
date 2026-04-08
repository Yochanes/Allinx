package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbg implements Parcelable.Creator<zzbh> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzbh createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String strCreateString = null;
        zzbc zzbcVar = null;
        String strCreateString2 = null;
        long j = 0;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(header);
            if (fieldId == 2) {
                strCreateString = SafeParcelReader.createString(parcel, header);
            } else if (fieldId == 3) {
                zzbcVar = (zzbc) SafeParcelReader.createParcelable(parcel, header, zzbc.CREATOR);
            } else if (fieldId == 4) {
                strCreateString2 = SafeParcelReader.createString(parcel, header);
            } else if (fieldId != 5) {
                SafeParcelReader.skipUnknownField(parcel, header);
            } else {
                j = SafeParcelReader.readLong(parcel, header);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new zzbh(strCreateString, zzbcVar, strCreateString2, j);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzbh[] newArray(int i) {
        return new zzbh[i];
    }
}
