package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
final class zzj implements zzq {
    private final Executor zza;
    private final Object zzb = new Object();

    @Nullable
    private OnCompleteListener zzc;

    public zzj(@NonNull Executor executor, @NonNull OnCompleteListener onCompleteListener) {
        this.zza = executor;
        this.zzc = onCompleteListener;
    }

    public static /* bridge */ /* synthetic */ OnCompleteListener zza(zzj zzjVar) {
        return zzjVar.zzc;
    }

    public static /* bridge */ /* synthetic */ Object zzb(zzj zzjVar) {
        return zzjVar.zzb;
    }

    @Override // com.google.android.gms.tasks.zzq
    public final void zzc() {
        synchronized (this.zzb) {
            this.zzc = null;
        }
    }

    @Override // com.google.android.gms.tasks.zzq
    public final void zzd(@NonNull Task task) {
        synchronized (this.zzb) {
            try {
                if (this.zzc == null) {
                    return;
                }
                this.zza.execute(new zzi(this, task));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
