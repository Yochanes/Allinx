package com.google.android.gms.cloudmessaging;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class zzad implements OnCompleteListener {
    public final /* synthetic */ Rpc zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ ScheduledFuture zzc;

    public /* synthetic */ zzad(Rpc rpc, String str, ScheduledFuture scheduledFuture) {
        this.zza = rpc;
        this.zzb = str;
        this.zzc = scheduledFuture;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        this.zza.zzd(this.zzb, this.zzc, task);
    }
}
