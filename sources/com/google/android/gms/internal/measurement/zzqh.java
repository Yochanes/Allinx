package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final class zzqh implements Supplier<zzqk> {
    private static zzqh zza = new zzqh();
    private final Supplier<zzqk> zzb = Suppliers.ofInstance(new zzqj());

    @SideEffectFree
    public static boolean zza() {
        return ((zzqk) zza.get()).zza();
    }

    @SideEffectFree
    public static boolean zzb() {
        return ((zzqk) zza.get()).zzb();
    }

    @Override // com.google.common.base.Supplier
    public final /* synthetic */ zzqk get() {
        return this.zzb.get();
    }
}
