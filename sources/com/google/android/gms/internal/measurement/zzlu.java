package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
final class zzlu implements zzlv {
    private static <E> zzll<E> zzc(Object obj, long j) {
        return (zzll) zzny.zze(obj, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzlv
    public final <L> List<L> zza(Object obj, long j) {
        zzll zzllVarZzc = zzc(obj, j);
        if (zzllVarZzc.zzc()) {
            return zzllVarZzc;
        }
        int size = zzllVarZzc.size();
        zzll zzllVarZza = zzllVarZzc.zza(size == 0 ? 10 : size << 1);
        zzny.zza(obj, j, zzllVarZza);
        return zzllVarZza;
    }

    @Override // com.google.android.gms.internal.measurement.zzlv
    public final void zzb(Object obj, long j) {
        zzc(obj, j).zzb();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r6v1, types: [com.google.android.gms.internal.measurement.zzll, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3 */
    @Override // com.google.android.gms.internal.measurement.zzlv
    public final <E> void zza(Object obj, Object obj2, long j) {
        zzll zzllVarZzc = zzc(obj, j);
        ?? Zzc = zzc(obj2, j);
        int size = zzllVarZzc.size();
        int size2 = Zzc.size();
        ?? r0 = zzllVarZzc;
        r0 = zzllVarZzc;
        if (size > 0 && size2 > 0) {
            boolean zZzc = zzllVarZzc.zzc();
            ?? Zza = zzllVarZzc;
            if (!zZzc) {
                Zza = zzllVarZzc.zza(size2 + size);
            }
            Zza.addAll(Zzc);
            r0 = Zza;
        }
        if (size > 0) {
            Zzc = r0;
        }
        zzny.zza(obj, j, (Object) Zzc);
    }
}
