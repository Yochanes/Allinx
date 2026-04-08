package androidx.camera.view;

import androidx.camera.core.Logger;
import androidx.camera.core.SurfaceRequest;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Consumer;

/* JADX INFO: renamed from: androidx.camera.view.i */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0414i implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3594a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f3595b;

    public /* synthetic */ C0414i(Object obj, int i) {
        this.f3594a = i;
        this.f3595b = obj;
    }

    @Override // androidx.core.util.Consumer
    public final void accept(Object obj) {
        switch (this.f3594a) {
            case 0:
                Logger.m1280a("SurfaceViewImpl", "Safe to release surface.");
                C0408c c0408c = (C0408c) this.f3595b;
                if (c0408c != null) {
                    c0408c.m1949b();
                }
                break;
            default:
                ((CallbackToFutureAdapter.Completer) this.f3595b).m6742b((SurfaceRequest.Result) obj);
                break;
        }
    }
}
