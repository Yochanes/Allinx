package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final class zzpc implements Supplier<zzpb> {
    private static zzpc zza = new zzpc();
    private final Supplier<zzpb> zzb = Suppliers.ofInstance(new zzpe());

    @SideEffectFree
    public static long zza() {
        return ((zzpb) zza.get()).zza();
    }

    @Override // com.google.common.base.Supplier
    public final /* synthetic */ zzpb get() {
        return this.zzb.get();
    }
}
