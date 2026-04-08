package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
final class zzd implements zzq {
    private final Executor zza;
    private final Continuation zzb;
    private final zzw zzc;

    public zzd(@NonNull Executor executor, @NonNull Continuation continuation, @NonNull zzw zzwVar) {
        this.zza = executor;
        this.zzb = continuation;
        this.zzc = zzwVar;
    }

    public static /* bridge */ /* synthetic */ Continuation zza(zzd zzdVar) {
        return zzdVar.zzb;
    }

    public static /* bridge */ /* synthetic */ zzw zzb(zzd zzdVar) {
        return zzdVar.zzc;
    }

    @Override // com.google.android.gms.tasks.zzq
    public final void zzc() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.tasks.zzq
    public final void zzd(@NonNull Task task) {
        this.zza.execute(new zzc(this, task));
    }
}
