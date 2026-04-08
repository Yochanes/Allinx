package com.google.firebase.heartbeatinfo;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.google.firebase.heartbeatinfo.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class CallableC4715a implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f42817a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ DefaultHeartBeatController f42818b;

    public /* synthetic */ CallableC4715a(DefaultHeartBeatController defaultHeartBeatController, int i) {
        this.f42817a = i;
        this.f42818b = defaultHeartBeatController;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f42817a) {
            case 0:
                return DefaultHeartBeatController.m15213a(this.f42818b);
            default:
                return DefaultHeartBeatController.m15216d(this.f42818b);
        }
    }
}
