package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final class zzox implements Supplier<zzpa> {
    private static zzox zza = new zzox();
    private final Supplier<zzpa> zzb = Suppliers.ofInstance(new zzoz());

    @SideEffectFree
    public static boolean zza() {
        return ((zzpa) zza.get()).zza();
    }

    @SideEffectFree
    public static boolean zzb() {
        return ((zzpa) zza.get()).zzb();
    }

    @SideEffectFree
    public static boolean zzc() {
        return ((zzpa) zza.get()).zzc();
    }

    @Override // com.google.common.base.Supplier
    public final /* synthetic */ zzpa get() {
        return this.zzb.get();
    }
}
