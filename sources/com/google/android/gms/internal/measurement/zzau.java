package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
final class zzau implements Iterator<zzaq> {
    private int zza = 0;
    private final /* synthetic */ zzas zzb;

    public zzau(zzas zzasVar) {
        this.zzb = zzasVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza < zzas.zza(this.zzb).length();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ zzaq next() {
        if (this.zza >= zzas.zza(this.zzb).length()) {
            throw new NoSuchElementException();
        }
        String strZza = zzas.zza(this.zzb);
        int i = this.zza;
        this.zza = i + 1;
        return new zzas(String.valueOf(strZza.charAt(i)));
    }
}
