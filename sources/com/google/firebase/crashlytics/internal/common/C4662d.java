package com.google.firebase.crashlytics.internal.common;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.common.d */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4662d implements Continuation {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f42797a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ TaskCompletionSource f42798b;

    public /* synthetic */ C4662d(int i, TaskCompletionSource taskCompletionSource) {
        this.f42797a = i;
        this.f42798b = taskCompletionSource;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        switch (this.f42797a) {
            case 0:
                return Utils.m15182d(this.f42798b, task);
            case 1:
                return Utils.m15179a(this.f42798b, task);
            default:
                return Utils.m15181c(this.f42798b, task);
        }
    }
}
