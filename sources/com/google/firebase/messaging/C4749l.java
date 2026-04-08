package com.google.firebase.messaging;

import android.content.Intent;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.WithinAppServiceConnection;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: renamed from: com.google.firebase.messaging.l */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4749l implements Continuation, OnCompleteListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f42853a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f42854b;

    public /* synthetic */ C4749l(Object obj, int i) {
        this.f42853a = i;
        this.f42854b = obj;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        switch (this.f42853a) {
            case 1:
                WakeLockHolder.m15254a((Intent) this.f42854b, task);
                break;
            case 2:
                WithinAppServiceBinder.m15255a((WithinAppServiceConnection.BindRequest) this.f42854b, task);
                break;
            default:
                WithinAppServiceConnection.BindRequest.m15256a((ScheduledFuture) this.f42854b, task);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return GmsRpc.m15247a((GmsRpc) this.f42854b, task);
    }
}
