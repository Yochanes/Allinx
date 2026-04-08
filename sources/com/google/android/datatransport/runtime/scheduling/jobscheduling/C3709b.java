package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;

/* JADX INFO: renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.b */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3709b implements SynchronizationGuard.CriticalSection {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Uploader f42350a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ TransportContext f42351b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f42352c;

    public /* synthetic */ C3709b(Uploader uploader, TransportContext transportContext, int i) {
        this.f42350a = uploader;
        this.f42351b = transportContext;
        this.f42352c = i;
    }

    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
    public final Object execute() {
        return Uploader.m14429f(this.f42350a, this.f42351b, this.f42352c);
    }
}
