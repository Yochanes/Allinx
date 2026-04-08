package com.google.firebase.messaging;

import android.content.Intent;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* JADX INFO: renamed from: com.google.firebase.messaging.o */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4752o implements Continuation, OnCompleteListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f42860a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f42861b;

    public /* synthetic */ C4752o(Object obj, Object obj2) {
        this.f42860a = obj;
        this.f42861b = obj2;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        EnhancedIntentService.m15224b((EnhancedIntentService) this.f42860a, (Intent) this.f42861b, task);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return RequestDeduplicator.m15251a((RequestDeduplicator) this.f42860a, (String) this.f42861b, task);
    }
}
