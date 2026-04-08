package androidx.camera.core.impl;

import androidx.concurrent.futures.CallbackToFutureAdapter;

/* JADX INFO: renamed from: androidx.camera.core.impl.c */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0277c implements CallbackToFutureAdapter.Resolver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2828a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ DeferrableSurface f2829b;

    public /* synthetic */ C0277c(DeferrableSurface deferrableSurface, int i) {
        this.f2828a = i;
        this.f2829b = deferrableSurface;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    /* JADX INFO: renamed from: d */
    public final Object mo188d(CallbackToFutureAdapter.Completer completer) {
        switch (this.f2828a) {
            case 0:
                DeferrableSurface deferrableSurface = this.f2829b;
                synchronized (deferrableSurface.f2694a) {
                    deferrableSurface.f2697d = completer;
                    break;
                }
                return "DeferrableSurface-termination(" + deferrableSurface + ")";
            default:
                DeferrableSurface deferrableSurface2 = this.f2829b;
                synchronized (deferrableSurface2.f2694a) {
                    deferrableSurface2.f2699f = completer;
                    break;
                }
                return "DeferrableSurface-close(" + deferrableSurface2 + ")";
        }
    }
}
