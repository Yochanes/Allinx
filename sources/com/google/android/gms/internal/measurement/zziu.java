package com.google.android.gms.internal.measurement;

import android.util.Log;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
final class zziu extends zzir<Boolean> {
    public zziu(zziz zzizVar, String str, Boolean bool, boolean z2) {
        super(zzizVar, str, bool, true, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzir
    @Nullable
    public final /* synthetic */ Boolean zza(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (zzhq.zzc.matcher(str).matches()) {
                return Boolean.TRUE;
            }
            if (zzhq.zzd.matcher(str).matches()) {
                return Boolean.FALSE;
            }
        }
        Log.e("PhenotypeFlag", "Invalid boolean value for " + zzb() + ": " + String.valueOf(obj));
        return null;
    }
}
