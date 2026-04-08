package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
final class zzng implements Iterator {
    private int zza;
    private Iterator zzb;
    private final /* synthetic */ zzne zzc;

    public /* synthetic */ zzng(zzne zzneVar, zznj zznjVar) {
        this(zzneVar);
    }

    private final Iterator zza() {
        if (this.zzb == null) {
            this.zzb = zzne.zzc(this.zzc).entrySet().iterator();
        }
        return this.zzb;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.zza;
        return (i > 0 && i <= zzne.zza(this.zzc)) || zza().hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        if (zza().hasNext()) {
            return (Map.Entry) zza().next();
        }
        Object[] objArrZze = zzne.zze(this.zzc);
        int i = this.zza - 1;
        this.zza = i;
        return (zznk) objArrZze[i];
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    private zzng(zzne zzneVar) {
        this.zzc = zzneVar;
        this.zza = zzne.zza(zzneVar);
    }
}
