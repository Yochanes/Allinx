package com.google.common.util.concurrent;

import com.google.common.util.concurrent.AbstractIdleService;

/* JADX INFO: renamed from: com.google.common.util.concurrent.e */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC4577e implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f42710a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractIdleService.DelegateService f42711b;

    public /* synthetic */ RunnableC4577e(AbstractIdleService.DelegateService delegateService, int i) {
        this.f42710a = i;
        this.f42711b = delegateService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f42710a) {
            case 0:
                AbstractIdleService.DelegateService.m15072a(this.f42711b);
                break;
            default:
                AbstractIdleService.DelegateService.m15073b(this.f42711b);
                break;
        }
    }
}
