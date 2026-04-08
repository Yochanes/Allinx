package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.ListenerHolder;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class zacb implements Runnable {
    public final /* synthetic */ ListenerHolder zaa;
    public final /* synthetic */ ListenerHolder.Notifier zab;

    public /* synthetic */ zacb(ListenerHolder listenerHolder, ListenerHolder.Notifier notifier) {
        this.zaa = listenerHolder;
        this.zab = notifier;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zaa.zaa(this.zab);
    }
}
