package com.google.android.gms.tasks;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
final class zzs implements OnTokenCanceledListener {
    final /* synthetic */ TaskCompletionSource zza;

    public zzs(TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.tasks.OnTokenCanceledListener
    public final void onCanceled() {
        TaskCompletionSource.zza(this.zza).zzc();
    }
}
