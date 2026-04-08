package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class zacf implements Runnable {
    public final /* synthetic */ NonGmsServiceBrokerClient zaa;

    public /* synthetic */ zacf(NonGmsServiceBrokerClient nonGmsServiceBrokerClient) {
        this.zaa = nonGmsServiceBrokerClient;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zaa.zab();
    }
}
