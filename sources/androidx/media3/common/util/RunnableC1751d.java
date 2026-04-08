package androidx.media3.common.util;

import androidx.media3.common.util.NetworkTypeObserver;

/* JADX INFO: renamed from: androidx.media3.common.util.d */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1751d implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ NetworkTypeObserver.ListenerHolder f25683a;

    public /* synthetic */ RunnableC1751d(NetworkTypeObserver.ListenerHolder listenerHolder) {
        this.f25683a = listenerHolder;
    }

    @Override // java.lang.Runnable
    public final void run() {
        NetworkTypeObserver.ListenerHolder listenerHolder = this.f25683a;
        NetworkTypeObserver.Listener listener = (NetworkTypeObserver.Listener) listenerHolder.f25633a.get();
        if (listener != null) {
            listener.mo9523a(NetworkTypeObserver.this.m9520b());
        }
    }
}
