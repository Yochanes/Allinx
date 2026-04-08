package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzlc;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public class zzkp {
    static final zzkp zza = new zzkp(true);
    private static volatile boolean zzb = false;
    private static volatile zzkp zzc;
    private final Map<zza, zzlc.zzf<?, ?>> zzd;

    /* JADX INFO: compiled from: Proguard */
    public static final class zza {
        private final Object zza;
        private final int zzb;

        public zza(Object obj, int i) {
            this.zza = obj;
            this.zzb = i;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof zza)) {
                return false;
            }
            zza zzaVar = (zza) obj;
            return this.zza == zzaVar.zza && this.zzb == zzaVar.zzb;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.zza) * 65535) + this.zzb;
        }
    }

    public zzkp() {
        this.zzd = new HashMap();
    }

    public static zzkp zza() {
        zzkp zzkpVar = zzc;
        if (zzkpVar != null) {
            return zzkpVar;
        }
        synchronized (zzkp.class) {
            try {
                zzkp zzkpVar2 = zzc;
                if (zzkpVar2 != null) {
                    return zzkpVar2;
                }
                zzkp zzkpVarZza = zzla.zza(zzkp.class);
                zzc = zzkpVarZza;
                return zzkpVarZza;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private zzkp(boolean z2) {
        this.zzd = Collections.EMPTY_MAP;
    }

    public final <ContainingType extends zzml> zzlc.zzf<ContainingType, ?> zza(ContainingType containingtype, int i) {
        return (zzlc.zzf) this.zzd.get(new zza(containingtype, i));
    }
}
