package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
final class zznn implements Iterator {
    private int zza;
    private boolean zzb;
    private Iterator zzc;
    private final /* synthetic */ zzne zzd;

    public /* synthetic */ zznn(zzne zzneVar, zznm zznmVar) {
        this(zzneVar);
    }

    private final Iterator zza() {
        if (this.zzc == null) {
            this.zzc = zzne.zzb(this.zzd).entrySet().iterator();
        }
        return this.zzc;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza + 1 < zzne.zza(this.zzd) || (!zzne.zzb(this.zzd).isEmpty() && zza().hasNext());
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        this.zzb = true;
        int i = this.zza + 1;
        this.zza = i;
        return i < zzne.zza(this.zzd) ? (zznk) zzne.zze(this.zzd)[this.zza] : (Map.Entry) zza().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.zzb) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.zzb = false;
        zzne.zzd(this.zzd);
        if (this.zza >= zzne.zza(this.zzd)) {
            zza().remove();
            return;
        }
        zzne zzneVar = this.zzd;
        int i = this.zza;
        this.zza = i - 1;
        zzne.zza(zzneVar, i);
    }

    private zznn(zzne zzneVar) {
        this.zzd = zzneVar;
        this.zza = -1;
    }
}
