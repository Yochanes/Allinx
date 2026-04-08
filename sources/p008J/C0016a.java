package p008J;

import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.android.HandlerContext;

/* JADX INFO: renamed from: J.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0016a implements DisposableHandle {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ HandlerContext f23a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Runnable f24b;

    public /* synthetic */ C0016a(HandlerContext handlerContext, Runnable runnable) {
        this.f23a = handlerContext;
        this.f24b = runnable;
    }

    @Override // kotlinx.coroutines.DisposableHandle
    public final void dispose() {
        this.f23a.f55379c.removeCallbacks(this.f24b);
    }
}
