package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
final class zzni extends zznp {
    private final /* synthetic */ zzne zza;

    public /* synthetic */ zzni(zzne zzneVar, zznl zznlVar) {
        this(zzneVar);
    }

    @Override // com.google.android.gms.internal.measurement.zznp, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new zzng(this.zza, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private zzni(zzne zzneVar) {
        super(zzneVar, null);
        this.zza = zzneVar;
    }
}
