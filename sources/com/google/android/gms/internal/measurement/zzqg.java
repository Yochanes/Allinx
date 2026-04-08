package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final class zzqg implements Supplier<zzqf> {
    private static zzqg zza = new zzqg();
    private final Supplier<zzqf> zzb = Suppliers.ofInstance(new zzqi());

    @SideEffectFree
    public static boolean zza() {
        return ((zzqf) zza.get()).zza();
    }

    @Override // com.google.common.base.Supplier
    public final /* synthetic */ zzqf get() {
        return this.zzb.get();
    }
}
