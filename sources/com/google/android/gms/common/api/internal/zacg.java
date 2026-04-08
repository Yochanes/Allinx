package com.google.android.gms.common.api.internal;

import android.os.IBinder;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class zacg implements Runnable {
    public final /* synthetic */ NonGmsServiceBrokerClient zaa;
    public final /* synthetic */ IBinder zab;

    public /* synthetic */ zacg(NonGmsServiceBrokerClient nonGmsServiceBrokerClient, IBinder iBinder) {
        this.zaa = nonGmsServiceBrokerClient;
        this.zab = iBinder;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zaa.zaa(this.zab);
    }
}
