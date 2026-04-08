package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
final class zacq implements Runnable {
    final /* synthetic */ zact zaa;

    public zacq(zact zactVar) {
        this.zaa = zactVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zact.zac(this.zaa).zae(new ConnectionResult(4));
    }
}
