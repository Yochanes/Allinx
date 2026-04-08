package com.google.android.gms.cloudmessaging;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class zzf implements OnCompleteListener {
    public final /* synthetic */ CountDownLatch zza;

    public /* synthetic */ zzf(CountDownLatch countDownLatch) {
        this.zza = countDownLatch;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        this.zza.countDown();
    }
}
