package com.google.android.gms.signin.internal;

import android.os.Parcel;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zad extends com.google.android.gms.internal.base.zab implements zae {
    public zad() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    @Override // com.google.android.gms.internal.base.zab
    public final boolean zaa(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 3:
                break;
            case 4:
                break;
            case 5:
            default:
                return false;
            case 6:
                break;
            case 7:
                break;
            case 8:
                zab((zak) com.google.android.gms.internal.base.zac.zaa(parcel, zak.CREATOR));
                break;
            case 9:
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
