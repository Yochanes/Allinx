package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final class zzsc implements Supplier<zzsb> {
    private static zzsc zza = new zzsc();
    private final Supplier<zzsb> zzb = Suppliers.ofInstance(new zzsd());

    @SideEffectFree
    public static boolean zza() {
        return ((zzsb) zza.get()).zza();
    }

    @Override // com.google.common.base.Supplier
    public final /* synthetic */ zzsb get() {
        return this.zzb.get();
    }
}
