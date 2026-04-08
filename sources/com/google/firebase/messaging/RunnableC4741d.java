package com.google.firebase.messaging;

import android.content.Intent;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: renamed from: com.google.firebase.messaging.d */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC4741d implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f42836a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f42837b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f42838c;

    public /* synthetic */ RunnableC4741d(int i, Object obj, Object obj2) {
        this.f42836a = i;
        this.f42837b = obj;
        this.f42838c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f42836a) {
            case 0:
                FcmLifecycleCallbacks.m15229a((FcmLifecycleCallbacks) this.f42837b, (Intent) this.f42838c);
                break;
            default:
                ImageDownload.m15248a((ImageDownload) this.f42837b, (TaskCompletionSource) this.f42838c);
                break;
        }
    }
}
