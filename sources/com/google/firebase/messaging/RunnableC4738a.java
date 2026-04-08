package com.google.firebase.messaging;

import android.content.Intent;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: renamed from: com.google.firebase.messaging.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC4738a implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ EnhancedIntentService f42828a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Intent f42829b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ TaskCompletionSource f42830c;

    public /* synthetic */ RunnableC4738a(EnhancedIntentService enhancedIntentService, Intent intent, TaskCompletionSource taskCompletionSource) {
        this.f42828a = enhancedIntentService;
        this.f42829b = intent;
        this.f42830c = taskCompletionSource;
    }

    @Override // java.lang.Runnable
    public final void run() {
        EnhancedIntentService.m15223a(this.f42828a, this.f42829b, this.f42830c);
    }
}
