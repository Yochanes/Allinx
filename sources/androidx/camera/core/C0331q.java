package androidx.camera.core;

import android.util.Range;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.concurrent.atomic.AtomicReference;
import p001A.AbstractC0000a;

/* JADX INFO: renamed from: androidx.camera.core.q */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0331q implements CallbackToFutureAdapter.Resolver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3172a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AtomicReference f3173b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f3174c;

    public /* synthetic */ C0331q(AtomicReference atomicReference, String str, int i) {
        this.f3172a = i;
        this.f3173b = atomicReference;
        this.f3174c = str;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    /* JADX INFO: renamed from: d */
    public final Object mo188d(CallbackToFutureAdapter.Completer completer) {
        String str = this.f3174c;
        AtomicReference atomicReference = this.f3173b;
        switch (this.f3172a) {
            case 0:
                Range range = SurfaceRequest.f2362m;
                atomicReference.set(completer);
                return AbstractC0000a.m19p(new StringBuilder(), str, "-cancellation");
            case 1:
                Range range2 = SurfaceRequest.f2362m;
                atomicReference.set(completer);
                return AbstractC0000a.m19p(new StringBuilder(), str, "-status");
            default:
                Range range3 = SurfaceRequest.f2362m;
                atomicReference.set(completer);
                return AbstractC0000a.m19p(new StringBuilder(), str, "-Surface");
        }
    }
}
