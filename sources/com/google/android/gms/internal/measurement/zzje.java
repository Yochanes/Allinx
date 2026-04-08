package com.google.android.gms.internal.measurement;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.google.common.collect.ImmutableSetMultimap;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final class zzje {
    public static final Supplier<ImmutableSetMultimap<String, String>> zza = Suppliers.memoize(new zzjg());

    public static /* synthetic */ ImmutableSetMultimap zza() {
        return new ImmutableSetMultimap.Builder().build();
    }
}
