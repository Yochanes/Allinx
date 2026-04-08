package com.google.android.gms.cloudmessaging;

import android.os.Bundle;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class zzz implements Continuation {
    public final /* synthetic */ Rpc zza;
    public final /* synthetic */ Bundle zzb;

    public /* synthetic */ zzz(Rpc rpc, Bundle bundle) {
        this.zza = rpc;
        this.zzb = bundle;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        return this.zza.zzb(this.zzb, task);
    }
}
