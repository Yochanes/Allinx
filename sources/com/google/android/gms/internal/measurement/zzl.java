package com.google.android.gms.internal.measurement;

import com.google.common.annotations.VisibleForTesting;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final class zzl {

    @VisibleForTesting
    private Map<String, Callable<? extends zzal>> zza = new HashMap();

    public final zzaq zza(String str) {
        if (!this.zza.containsKey(str)) {
            return zzaq.zzc;
        }
        try {
            return this.zza.get(str).call();
        } catch (Exception unused) {
            throw new IllegalStateException(AbstractC0000a.m13j("Failed to create API implementation: ", str));
        }
    }

    public final void zza(String str, Callable<? extends zzal> callable) {
        this.zza.put(str, callable);
    }
}
