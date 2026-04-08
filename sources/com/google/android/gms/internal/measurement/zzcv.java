package com.google.android.gms.internal.measurement;

import java.net.URL;
import java.net.URLConnection;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzcv {
    private static zzcv zza = new zzcy(null);

    public static synchronized zzcv zza() {
        return zza;
    }

    public abstract URLConnection zza(URL url, String str);
}
