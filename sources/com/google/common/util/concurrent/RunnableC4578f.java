package com.google.common.util.concurrent;

import com.google.common.util.concurrent.AbstractScheduledService;

/* JADX INFO: renamed from: com.google.common.util.concurrent.f */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC4578f implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f42712a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractScheduledService.ServiceDelegate f42713b;

    public /* synthetic */ RunnableC4578f(AbstractScheduledService.ServiceDelegate serviceDelegate, int i) {
        this.f42712a = i;
        this.f42713b = serviceDelegate;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f42712a) {
            case 0:
                AbstractScheduledService.ServiceDelegate.m15075b(this.f42713b);
                break;
            default:
                AbstractScheduledService.ServiceDelegate.m15076c(this.f42713b);
                break;
        }
    }
}
