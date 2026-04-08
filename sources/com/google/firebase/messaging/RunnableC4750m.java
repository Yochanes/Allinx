package com.google.firebase.messaging;

import android.content.Context;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: renamed from: com.google.firebase.messaging.m */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC4750m implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Context f42855a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f42856b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ TaskCompletionSource f42857c;

    public /* synthetic */ RunnableC4750m(Context context, boolean z2, TaskCompletionSource taskCompletionSource) {
        this.f42855a = context;
        this.f42856b = z2;
        this.f42857c = taskCompletionSource;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ProxyNotificationInitializer.m15249a(this.f42855a, this.f42856b, this.f42857c);
    }
}
