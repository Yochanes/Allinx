package com.google.android.gms.internal.measurement;

import android.net.Uri;
import androidx.collection.SimpleArrayMap;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final class zzig implements zzil {
    private final SimpleArrayMap<String, SimpleArrayMap<String, String>> zza;

    public zzig(SimpleArrayMap<String, SimpleArrayMap<String, String>> simpleArrayMap) {
        this.zza = simpleArrayMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0018 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x000e  */
    @Override // com.google.android.gms.internal.measurement.zzil
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String zza(Uri uri, String str, String str2, String str3) {
        SimpleArrayMap simpleArrayMap;
        if (uri == null) {
            if (str == null) {
                simpleArrayMap = null;
            }
            if (simpleArrayMap != null) {
                return null;
            }
            if (str2 != null) {
                str3 = AbstractC0000a.m2C(str2, str3);
            }
            return (String) simpleArrayMap.get(str3);
        }
        str = uri.toString();
        SimpleArrayMap<String, SimpleArrayMap<String, String>> simpleArrayMap2 = this.zza;
        if (simpleArrayMap2 != null) {
            simpleArrayMap = (SimpleArrayMap) simpleArrayMap2.get(str);
        }
        if (simpleArrayMap != null) {
        }
    }
}
