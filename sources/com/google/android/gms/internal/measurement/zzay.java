package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzay {
    final List<zzbv> zza = new ArrayList();

    public final zzaq zza(String str) {
        if (this.zza.contains(zzg.zza(str))) {
            throw new UnsupportedOperationException(AbstractC0000a.m13j("Command not implemented: ", str));
        }
        throw new IllegalArgumentException("Command not supported");
    }

    public abstract zzaq zza(String str, zzh zzhVar, List<zzaq> list);
}
