package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final class zzre implements Supplier<zzrd> {
    private static zzre zza = new zzre();
    private final Supplier<zzrd> zzb = Suppliers.ofInstance(new zzrg());

    @SideEffectFree
    public static boolean zza() {
        return ((zzrd) zza.get()).zza();
    }

    @Override // com.google.common.base.Supplier
    public final /* synthetic */ zzrd get() {
        return this.zzb.get();
    }
}
