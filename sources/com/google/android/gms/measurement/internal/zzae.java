package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final class zzae implements Parcelable.Creator<zzaf> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzaf createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String strCreateString = null;
        String strCreateString2 = null;
        zzok zzokVar = null;
        String strCreateString3 = null;
        zzbh zzbhVar = null;
        zzbh zzbhVar2 = null;
        zzbh zzbhVar3 = null;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        boolean z2 = false;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 2:
                    strCreateString = SafeParcelReader.createString(parcel, header);
                    break;
                case 3:
                    strCreateString2 = SafeParcelReader.createString(parcel, header);
                    break;
                case 4:
                    zzokVar = (zzok) SafeParcelReader.createParcelable(parcel, header, zzok.CREATOR);
                    break;
                case 5:
                    j = SafeParcelReader.readLong(parcel, header);
                    break;
                case 6:
                    z2 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 7:
                    strCreateString3 = SafeParcelReader.createString(parcel, header);
                    break;
                case 8:
                    zzbhVar = (zzbh) SafeParcelReader.createParcelable(parcel, header, zzbh.CREATOR);
                    break;
                case 9:
                    j2 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 10:
                    zzbhVar2 = (zzbh) SafeParcelReader.createParcelable(parcel, header, zzbh.CREATOR);
                    break;
                case 11:
                    j3 = SafeParcelReader.readLong(parcel, header);
                    break;
                case TYPE_BYTES_VALUE:
                    zzbhVar3 = (zzbh) SafeParcelReader.createParcelable(parcel, header, zzbh.CREATOR);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new zzaf(strCreateString, strCreateString2, zzokVar, j, z2, strCreateString3, zzbhVar, j2, zzbhVar2, j3, zzbhVar3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzaf[] newArray(int i) {
        return new zzaf[i];
    }
}
