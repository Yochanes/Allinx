package com.google.android.gms.internal.measurement;

import java.net.URL;
import java.net.URLConnection;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
final class zzcy extends zzcv {
    public /* synthetic */ zzcy(zzcx zzcxVar) {
        this();
    }

    @Override // com.google.android.gms.internal.measurement.zzcv
    public final URLConnection zza(URL url, String str) {
        return url.openConnection();
    }

    private zzcy() {
    }
}
