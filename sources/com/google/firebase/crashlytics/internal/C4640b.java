package com.google.firebase.crashlytics.internal;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.b */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4640b implements Continuation {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f42791a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Callable f42792b;

    public /* synthetic */ C4640b(Callable callable, int i) {
        this.f42791a = i;
        this.f42792b = callable;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        switch (this.f42791a) {
            case 0:
                return CrashlyticsWorker.m15159e(this.f42792b, task);
            default:
                return CrashlyticsWorker.m15157c(this.f42792b, task);
        }
    }
}
