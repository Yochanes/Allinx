package androidx.camera.camera2.internal;

import androidx.concurrent.futures.CallbackToFutureAdapter;

/* JADX INFO: renamed from: androidx.camera.camera2.internal.F */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0172F implements CallbackToFutureAdapter.Resolver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ TorchControl f1789a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f1790b;

    public /* synthetic */ C0172F(TorchControl torchControl, boolean z2) {
        this.f1789a = torchControl;
        this.f1790b = z2;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    /* JADX INFO: renamed from: d */
    public final Object mo188d(CallbackToFutureAdapter.Completer completer) {
        TorchControl torchControl = this.f1789a;
        torchControl.getClass();
        boolean z2 = this.f1790b;
        torchControl.f1908d.execute(new RunnableC0175G(torchControl, completer, z2));
        return "enableTorch: " + z2;
    }
}
