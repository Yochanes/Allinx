package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final class zzrr implements Supplier<zzru> {
    private static zzrr zza = new zzrr();
    private final Supplier<zzru> zzb = Suppliers.ofInstance(new zzrt());

    @SideEffectFree
    public static boolean zza() {
        return ((zzru) zza.get()).zza();
    }

    @SideEffectFree
    public static boolean zzb() {
        return ((zzru) zza.get()).zzb();
    }

    @Override // com.google.common.base.Supplier
    public final /* synthetic */ zzru get() {
        return this.zzb.get();
    }
}
