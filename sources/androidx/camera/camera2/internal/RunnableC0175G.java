package androidx.camera.camera2.internal;

import androidx.concurrent.futures.CallbackToFutureAdapter;

/* JADX INFO: renamed from: androidx.camera.camera2.internal.G */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0175G implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ TorchControl f1812a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ CallbackToFutureAdapter.Completer f1813b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f1814c;

    public /* synthetic */ RunnableC0175G(TorchControl torchControl, CallbackToFutureAdapter.Completer completer, boolean z2) {
        this.f1812a = torchControl;
        this.f1813b = completer;
        this.f1814c = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1812a.m1069a(this.f1813b, this.f1814c);
    }
}
