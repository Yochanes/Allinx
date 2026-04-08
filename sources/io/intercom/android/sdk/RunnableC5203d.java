package io.intercom.android.sdk;

import io.intercom.android.nexus.NexusConfig;

/* JADX INFO: renamed from: io.intercom.android.sdk.d */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC5203d implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ NexusWrapper f43588a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ NexusConfig f43589b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f43590c;

    public /* synthetic */ RunnableC5203d(NexusWrapper nexusWrapper, NexusConfig nexusConfig, boolean z2) {
        this.f43588a = nexusWrapper;
        this.f43589b = nexusConfig;
        this.f43590c = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        NexusWrapper.m15464a(this.f43588a, this.f43589b, this.f43590c);
    }
}
