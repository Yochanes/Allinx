package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* JADX INFO: renamed from: com.google.firebase.messaging.c */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4740c implements Continuation {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Context f42833a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Intent f42834b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f42835c;

    public /* synthetic */ C4740c(Context context, Intent intent, boolean z2) {
        this.f42833a = context;
        this.f42834b = intent;
        this.f42835c = z2;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        return FcmBroadcastProcessor.m15225a(this.f42833a, this.f42834b, this.f42835c, task);
    }
}
