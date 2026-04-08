package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;

/* JADX INFO: renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.d */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3711d implements SynchronizationGuard.CriticalSection {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f42358a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Uploader f42359b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ TransportContext f42360c;

    public /* synthetic */ C3711d(Uploader uploader, TransportContext transportContext, int i) {
        this.f42358a = i;
        this.f42359b = uploader;
        this.f42360c = transportContext;
    }

    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
    public final Object execute() {
        switch (this.f42358a) {
            case 0:
                return Uploader.m14427d(this.f42359b, this.f42360c);
            default:
                return Uploader.m14424a(this.f42359b, this.f42360c);
        }
    }
}
