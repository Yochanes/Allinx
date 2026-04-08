package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final class zzpu implements Supplier<zzpt> {
    private static zzpu zza = new zzpu();
    private final Supplier<zzpt> zzb = Suppliers.ofInstance(new zzpw());

    @SideEffectFree
    public static boolean zza() {
        return ((zzpt) zza.get()).zza();
    }

    @SideEffectFree
    public static boolean zzb() {
        return ((zzpt) zza.get()).zzb();
    }

    @Override // com.google.common.base.Supplier
    public final /* synthetic */ zzpt get() {
        return this.zzb.get();
    }
}
