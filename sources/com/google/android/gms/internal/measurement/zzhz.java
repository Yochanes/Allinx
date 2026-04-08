package com.google.android.gms.internal.measurement;

import android.content.Context;
import com.google.common.base.Optional;
import com.google.common.base.Supplier;
import javax.annotation.Nullable;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
final class zzhz extends zziy {
    private final Context zza;

    @Nullable
    private final Supplier<Optional<zzil>> zzb;

    public zzhz(Context context, @Nullable Supplier<Optional<zzil>> supplier) {
        if (context == null) {
            throw new NullPointerException("Null context");
        }
        this.zza = context;
        this.zzb = supplier;
    }

    public final boolean equals(Object obj) {
        Supplier<Optional<zzil>> supplier;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zziy) {
            zziy zziyVar = (zziy) obj;
            if (this.zza.equals(zziyVar.zza()) && ((supplier = this.zzb) != null ? supplier.equals(zziyVar.zzb()) : zziyVar.zzb() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.zza.hashCode() ^ 1000003) * 1000003;
        Supplier<Optional<zzil>> supplier = this.zzb;
        return iHashCode ^ (supplier == null ? 0 : supplier.hashCode());
    }

    public final String toString() {
        return AbstractC0000a.m15l("FlagsContext{context=", String.valueOf(this.zza), ", hermeticFileOverrides=", String.valueOf(this.zzb), "}");
    }

    @Override // com.google.android.gms.internal.measurement.zziy
    public final Context zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zziy
    @Nullable
    public final Supplier<Optional<zzil>> zzb() {
        return this.zzb;
    }
}
