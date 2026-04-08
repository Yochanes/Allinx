package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import androidx.annotation.NonNull;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final class zziz {
    public static <T> T zza(@NonNull Bundle bundle, String str, Class<T> cls, T t) {
        T t2 = (T) bundle.get(str);
        if (t2 == null) {
            return t;
        }
        if (cls.isAssignableFrom(t2.getClass())) {
            return t2;
        }
        String canonicalName = cls.getCanonicalName();
        throw new IllegalStateException(AbstractC0000a.m19p(AbstractC0000a.m25v("Invalid conditional user property field type. '", str, "' expected [", canonicalName, "] but was ["), t2.getClass().getCanonicalName(), "]"));
    }

    public static void zza(@NonNull Bundle bundle, @NonNull Object obj) {
        if (obj instanceof Double) {
            bundle.putDouble("value", ((Double) obj).doubleValue());
        } else if (obj instanceof Long) {
            bundle.putLong("value", ((Long) obj).longValue());
        } else {
            bundle.putString("value", obj.toString());
        }
    }
}
