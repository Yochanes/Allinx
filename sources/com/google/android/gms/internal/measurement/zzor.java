package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final class zzor implements Supplier<zzou> {
    private static zzor zza = new zzor();
    private final Supplier<zzou> zzb = Suppliers.ofInstance(new zzot());

    @SideEffectFree
    public static boolean zza() {
        return ((zzou) zza.get()).zza();
    }

    @Override // com.google.common.base.Supplier
    public final /* synthetic */ zzou get() {
        return this.zzb.get();
    }
}
