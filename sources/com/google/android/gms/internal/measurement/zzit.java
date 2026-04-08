package com.google.android.gms.internal.measurement;

import android.content.Context;
import com.google.common.base.Supplier;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class zzit implements Supplier {
    private /* synthetic */ Context zza;

    public /* synthetic */ zzit(Context context) {
        this.zza = context;
    }

    @Override // com.google.common.base.Supplier
    public final Object get() {
        return zzir.zza(this.zza);
    }
}
