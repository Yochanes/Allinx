package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final class zzqm implements Supplier<zzql> {
    private static zzqm zza = new zzqm();
    private final Supplier<zzql> zzb = Suppliers.ofInstance(new zzqo());

    @SideEffectFree
    public static boolean zza() {
        return ((zzql) zza.get()).zza();
    }

    @Override // com.google.common.base.Supplier
    public final /* synthetic */ zzql get() {
        return this.zzb.get();
    }
}
