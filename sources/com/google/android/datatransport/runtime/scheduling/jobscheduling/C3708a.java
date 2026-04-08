package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;

/* JADX INFO: renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3708a implements SynchronizationGuard.CriticalSection {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Uploader f42347a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ TransportContext f42348b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ long f42349c;

    public /* synthetic */ C3708a(Uploader uploader, TransportContext transportContext, long j) {
        this.f42347a = uploader;
        this.f42348b = transportContext;
        this.f42349c = j;
    }

    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
    public final Object execute() {
        return Uploader.m14430g(this.f42347a, this.f42348b, this.f42349c);
    }
}
