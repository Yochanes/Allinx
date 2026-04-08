package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public class TaskCompletionSource<TResult> {
    private final zzw zza = new zzw();

    public TaskCompletionSource() {
    }

    public static /* bridge */ /* synthetic */ zzw zza(TaskCompletionSource taskCompletionSource) {
        return taskCompletionSource.zza;
    }

    @NonNull
    public Task<TResult> getTask() {
        return this.zza;
    }

    public void setException(@NonNull Exception exc) {
        this.zza.zza(exc);
    }

    public void setResult(@Nullable TResult tresult) {
        this.zza.zzb(tresult);
    }

    public boolean trySetException(@NonNull Exception exc) {
        return this.zza.zzd(exc);
    }

    public boolean trySetResult(@Nullable TResult tresult) {
        return this.zza.zze(tresult);
    }

    public TaskCompletionSource(@NonNull CancellationToken cancellationToken) {
        cancellationToken.onCanceledRequested(new zzs(this));
    }
}
