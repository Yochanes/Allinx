package com.google.common.util.concurrent;

import com.google.common.base.Supplier;
import com.google.common.util.concurrent.AbstractExecutionThreadService;
import com.google.common.util.concurrent.AbstractScheduledService;

/* JADX INFO: renamed from: com.google.common.util.concurrent.b */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4574b implements Supplier {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f42706a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractService f42707b;

    public /* synthetic */ C4574b(AbstractService abstractService, int i) {
        this.f42706a = i;
        this.f42707b = abstractService;
    }

    @Override // com.google.common.base.Supplier
    public final Object get() {
        switch (this.f42706a) {
            case 0:
                return AbstractExecutionThreadService.C45101.m15069a((AbstractExecutionThreadService.C45101) this.f42707b);
            default:
                return AbstractScheduledService.ServiceDelegate.m15074a((AbstractScheduledService.ServiceDelegate) this.f42707b);
        }
    }
}
